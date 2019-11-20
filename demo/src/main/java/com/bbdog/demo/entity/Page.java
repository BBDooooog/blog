package com.bbdog.demo.entity;

import lombok.Data;
import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Page<T> implements Serializable {

    private static final long serialVersionUID = 3233491707830428801L;

    private static final int PAGE_CACHE_NUMBER = 10;		// 可以cache时每次读取的页数
    private static final int PAGE_FETCH_NUMBER = 3;		// 每次读取的页数



    protected int pageNo = 1;
    protected int pageSize = 10;
    protected long totalPage;
    protected long totalCount;
    protected boolean cachable = false;
    protected int cachePageNo = 1;	//
    protected boolean maybeHasMore = true;

    protected List<T> cacheResult = new ArrayList<T>();
    protected List<T> result = new ArrayList<T>();

    private long getTotalPage(){
        if (totalCount < 0)
            return -1;
        long count = totalCount / pageSize;
        if (totalCount % pageSize > 0) {
            count++;
        }
        return count;
    }
    public int getFirst() {
        return ((pageNo - 1) * pageSize) + 1;
    }
    public int getPageFetchumber(){
        return PAGE_FETCH_NUMBER * getPageSize();
    }

    public RowBounds getRowBounds() {
        if (isCachable()) {
            // get PAGE_CACHE_NUMBER pages
            return new RowBounds(getFirst() - 1, getFirst() + getPageSize() * PAGE_CACHE_NUMBER);
        } else {
            // get PAGE_FETCH_NUMBER pages
            return new RowBounds(getFirst() - 1, getPageSize() * PAGE_FETCH_NUMBER);
        }
    }
}

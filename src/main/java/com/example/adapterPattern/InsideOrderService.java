package com.example.adapterPattern;

public class InsideOrderService implements OrderAdapterService{
    @Override
    public boolean isFirst(String uid) {
        return "1".equals(uid);
    }
}

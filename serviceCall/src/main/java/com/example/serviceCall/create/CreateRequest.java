package com.example.serviceCall.create;

public class CreateRequest<T, S>
{
    private T request;

    public T getRequest ()
    {
        return request;
    }

    public void setRequest (T request)
    {
        this.request = request;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [request = "+request+"]";
    }
}
	

package com.bdorganization.custom.casting;

public class AppointmentRemoveStatus
{
    public enum Status
    {
        SUCCESS, FAILURE;
    }

    private final Status status;

    public AppointmentRemoveStatus(Status status)
    {
        this.status = status;
    }

    public Status getStatus()
    {
        return status;
    }
}
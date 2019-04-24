.class public interface abstract Lcom/ibotta/api/execution/ApiExecution;
.super Ljava/lang/Object;
.source "ApiExecution.java"


# virtual methods
.method public abstract abort()V
.end method

.method public abstract executeApiCall(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/api/ApiResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation
.end method

.method public abstract getEndpoint(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;
.end method

.method public abstract isAborted()Z
.end method

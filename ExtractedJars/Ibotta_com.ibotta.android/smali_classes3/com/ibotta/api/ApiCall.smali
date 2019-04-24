.class public interface abstract Lcom/ibotta/api/ApiCall;
.super Ljava/lang/Object;
.source "ApiCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/ApiCall$HttpMethod;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/ibotta/api/ApiResponse;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract buildApiExecution()V
.end method

.method public abstract buildHeaders()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation
.end method

.method public abstract buildParams()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation
.end method

.method public abstract buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Ljava/io/InputStream;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation
.end method

.method public abstract cancel()V
.end method

.method public abstract execute()Lcom/ibotta/api/ApiResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation
.end method

.method public abstract getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
.end method

.method public abstract getApiFunction()Ljava/lang/String;
.end method

.method public abstract getApiVersion()Ljava/lang/String;
.end method

.method public abstract getConnectionTimeout()Ljava/lang/Long;
.end method

.method public abstract getHeaders()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
.end method

.method public abstract getParams()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getProgressListener()Lcom/ibotta/api/execution/ApiUploadProgressListener;
.end method

.method public abstract getResponseType()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract getSocketTimeout()Ljava/lang/Long;
.end method

.method public abstract getUserAgent()Ljava/lang/String;
.end method

.method public abstract isCancelled()Z
.end method

.method public abstract isRequiresAppToken()Z
.end method

.method public abstract isSuccess()Z
.end method

.method public abstract reset()V
.end method

.method public abstract setProgressListener(Lcom/ibotta/api/execution/ApiUploadProgressListener;)V
.end method

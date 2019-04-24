.class public Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;
.super Ljava/lang/Object;
.source "ApiLayerNewRelicInterceptor.java"

# interfaces
.implements Lokhttp3/Interceptor;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v5

    .line 30
    invoke-virtual {v0}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v1

    const-wide/16 v2, 0x0

    if-nez v1, :cond_0

    move-wide v9, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v7

    move-wide v9, v7

    .line 32
    :goto_0
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 34
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v1

    if-nez v1, :cond_1

    move-wide v11, v2

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v1

    move-wide v11, v1

    .line 37
    :goto_1
    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v2

    .line 38
    invoke-virtual {v0}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v3

    .line 39
    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v4

    .line 36
    invoke-static/range {v2 .. v12}, Lcom/newrelic/agent/android/NewRelic;->noticeHttpTransaction(Ljava/lang/String;Ljava/lang/String;IJJJJ)V

    return-object p1
.end method

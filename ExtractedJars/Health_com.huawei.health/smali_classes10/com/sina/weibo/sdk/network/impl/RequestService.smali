.class public Lcom/sina/weibo/sdk/network/impl/RequestService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sina/weibo/sdk/network/IRequestService;


# static fields
.field private static iRequestService:Lcom/sina/weibo/sdk/network/IRequestService;


# instance fields
.field private fixedThreadPool:Ljava/util/concurrent/ExecutorService;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-static {}, Lcom/sina/weibo/sdk/network/intercept/GlobalInterceptHelper;->init()Lcom/sina/weibo/sdk/network/intercept/GlobalInterceptHelper;

    .line 33
    const/16 v0, 0xa

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/network/impl/RequestService;->fixedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 35
    return-void
.end method

.method public static getInstance()Lcom/sina/weibo/sdk/network/IRequestService;
    .locals 1

    .line 38
    sget-object v0, Lcom/sina/weibo/sdk/network/impl/RequestService;->iRequestService:Lcom/sina/weibo/sdk/network/IRequestService;

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Lcom/sina/weibo/sdk/network/impl/RequestService;

    invoke-direct {v0}, Lcom/sina/weibo/sdk/network/impl/RequestService;-><init>()V

    sput-object v0, Lcom/sina/weibo/sdk/network/impl/RequestService;->iRequestService:Lcom/sina/weibo/sdk/network/IRequestService;

    .line 41
    :cond_0
    sget-object v0, Lcom/sina/weibo/sdk/network/impl/RequestService;->iRequestService:Lcom/sina/weibo/sdk/network/IRequestService;

    return-object v0
.end method


# virtual methods
.method public asyncRequest(Lcom/sina/weibo/sdk/network/IRequestParam;Lcom/sina/weibo/sdk/network/target/Target;)Lcom/sina/weibo/sdk/network/RequestCancelable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Lcom/sina/weibo/sdk/network/IRequestParam;Lcom/sina/weibo/sdk/network/target/Target<TT;>;)Lcom/sina/weibo/sdk/network/RequestCancelable;"
        }
    .end annotation

    .line 96
    new-instance v1, Lcom/sina/weibo/sdk/network/impl/FixRequestTask;

    invoke-direct {v1, p1, p2}, Lcom/sina/weibo/sdk/network/impl/FixRequestTask;-><init>(Lcom/sina/weibo/sdk/network/IRequestParam;Lcom/sina/weibo/sdk/network/target/Target;)V

    .line 97
    iget-object v0, p0, Lcom/sina/weibo/sdk/network/impl/RequestService;->fixedThreadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 98
    const/4 v0, 0x0

    return-object v0
.end method

.method public request(Lcom/sina/weibo/sdk/network/IRequestParam;)Lcom/sina/weibo/sdk/network/base/RequestResult;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sina/weibo/sdk/network/exception/RequestException;
        }
    .end annotation

    .line 46
    new-instance v2, Lcom/sina/weibo/sdk/network/base/RequestResult;

    invoke-direct {v2}, Lcom/sina/weibo/sdk/network/base/RequestResult;-><init>()V

    .line 47
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/net/NetStateManager;->isNetworkConnected(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lcom/sina/weibo/sdk/network/exception/SdkException;

    const-string v1, "\u7f51\u7edc\u8fde\u63a5\u9519\u8bef\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u72b6\u6001"

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/network/exception/SdkException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/sina/weibo/sdk/network/base/RequestResult;->setE(Ljava/lang/Exception;)V

    .line 50
    :cond_0
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->needIntercept()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 52
    :try_start_0
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 53
    invoke-static {}, Lcom/sina/weibo/sdk/network/intercept/GlobalInterceptHelper;->init()Lcom/sina/weibo/sdk/network/intercept/GlobalInterceptHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/network/intercept/GlobalInterceptHelper;->getGlobalIntercept()Ljava/util/HashMap;

    move-result-object v4

    .line 54
    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 55
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/sina/weibo/sdk/network/IRequestIntercept;

    .line 56
    if-eqz v7, :cond_1

    invoke-interface {v7, p1, v3}, Lcom/sina/weibo/sdk/network/IRequestIntercept;->needIntercept(Lcom/sina/weibo/sdk/network/IRequestParam;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 57
    invoke-interface {v7, p1, v3}, Lcom/sina/weibo/sdk/network/IRequestIntercept;->doIntercept(Lcom/sina/weibo/sdk/network/IRequestParam;Landroid/os/Bundle;)Z

    .line 59
    :cond_1
    goto :goto_0

    .line 60
    :cond_2
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getIntercept()Ljava/util/ArrayList;

    move-result-object v5

    .line 61
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/sina/weibo/sdk/network/IRequestIntercept;

    .line 62
    invoke-interface {v7, p1, v3}, Lcom/sina/weibo/sdk/network/IRequestIntercept;->needIntercept(Lcom/sina/weibo/sdk/network/IRequestParam;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 63
    invoke-interface {v7, p1, v3}, Lcom/sina/weibo/sdk/network/IRequestIntercept;->doIntercept(Lcom/sina/weibo/sdk/network/IRequestParam;Landroid/os/Bundle;)Z

    .line 65
    :cond_3
    goto :goto_1

    .line 66
    :cond_4
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getPostBundle()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 67
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getGetBundle()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
    :try_end_0
    .catch Lcom/sina/weibo/sdk/network/exception/InterceptException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    goto :goto_2

    .line 68
    :catch_0
    move-exception v3

    .line 69
    invoke-virtual {v2, v3}, Lcom/sina/weibo/sdk/network/base/RequestResult;->setE(Ljava/lang/Exception;)V

    .line 71
    return-object v2

    .line 75
    :cond_5
    :goto_2
    :try_start_1
    invoke-static {p1}, Lcom/sina/weibo/sdk/network/impl/RequestEngine;->request(Lcom/sina/weibo/sdk/network/IRequestParam;)Lcom/sina/weibo/sdk/network/base/WbResponse;

    move-result-object v3

    .line 76
    invoke-virtual {v3}, Lcom/sina/weibo/sdk/network/base/WbResponse;->body()Lcom/sina/weibo/sdk/network/base/WbResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/network/base/WbResponseBody;->string()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/sina/weibo/sdk/network/base/RequestResult;->setResponse(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 80
    goto :goto_3

    .line 77
    :catch_1
    move-exception v3

    .line 79
    new-instance v0, Lcom/sina/weibo/sdk/network/exception/RequestException;

    invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/network/exception/RequestException;-><init>(Ljava/lang/String;)V

    .line 82
    :goto_3
    return-object v2
.end method

.method public request(Lcom/sina/weibo/sdk/network/IRequestParam;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Lcom/sina/weibo/sdk/network/IRequestParam;Ljava/lang/Class<TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sina/weibo/sdk/network/exception/RequestException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 88
    const/4 v0, 0x0

    return-object v0
.end method

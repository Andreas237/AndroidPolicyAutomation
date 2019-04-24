.class public Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;
.super Ljava/lang/Object;
.source "APIManagerFetchRetryHandler.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/offline/IRetryHandlerCallback;",
            ">;"
        }
    .end annotation
.end field

.field private fetchRunnable:Ljava/lang/Runnable;

.field private handler:Landroid/os/Handler;

.field private request:Lcom/shopkick/app/fetchers/api/IAPIObject;

.field private retryCount:I

.field private retryIntervalMs:J

.field private retryLimit:I


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/offline/IRetryHandlerCallback;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 29
    iput-object p2, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 30
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 31
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->fetch()V

    return-void
.end method

.method private fetch()V
    .locals 2

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 55
    iput v0, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->retryCount:I

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 63
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/offline/IRetryHandlerCallback;

    if-eqz v0, :cond_4

    .line 66
    invoke-interface {v0, p1, p2}, Lcom/shopkick/app/offline/IRetryHandlerCallback;->onReceivedResponseSuccess(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    goto :goto_1

    .line 69
    :cond_0
    iget p2, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->retryCount:I

    iget v0, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->retryLimit:I

    if-ge p2, v0, :cond_2

    .line 70
    iget-wide p1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->retryIntervalMs:J

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_1

    .line 71
    invoke-direct {p0}, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->fetch()V

    goto :goto_0

    .line 73
    :cond_1
    new-instance p1, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler$1;-><init>(Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;)V

    iput-object p1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->fetchRunnable:Ljava/lang/Runnable;

    .line 79
    iget-object p1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->handler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->fetchRunnable:Ljava/lang/Runnable;

    iget-wide v0, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->retryIntervalMs:J

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 82
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/offline/IRetryHandlerCallback;

    if-eqz p2, :cond_3

    .line 84
    invoke-interface {p2, p1}, Lcom/shopkick/app/offline/IRetryHandlerCallback;->onRetriesFailed(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    .line 87
    :cond_3
    :goto_0
    iget p1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->retryCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->retryCount:I

    :cond_4
    :goto_1
    return-void
.end method

.method public destroy()V
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->fetchRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->handler:Landroid/os/Handler;

    .line 37
    iget-object v1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v2, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-virtual {v1, v2, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 38
    iput-object v0, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 39
    iput-object v0, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->fetchRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method public fetchWithRetryLimitAndInterval(IJ)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->retryLimit:I

    .line 44
    iput-wide p2, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->retryIntervalMs:J

    const/4 p1, 0x0

    .line 45
    iput p1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->retryCount:I

    .line 46
    invoke-direct {p0}, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->fetch()V

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

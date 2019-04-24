.class Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;
.super Ljava/lang/Thread;
.source "AsyncLayoutInflater.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "InflateThread"
.end annotation


# static fields
.field private static final sInstance:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;


# instance fields
.field private mQueue:Ljava/util/concurrent/ArrayBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;",
            ">;"
        }
    .end annotation
.end field

.field private mRequestPool:Landroid/support/v4/util/Pools$SynchronizedPool;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/Pools$SynchronizedPool<",
            "Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 157
    new-instance v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;

    invoke-direct {v0}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;-><init>()V

    sput-object v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;->sInstance:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;

    .line 158
    sget-object v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;->sInstance:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;->start()V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 154
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 165
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;->mQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 167
    new-instance v0, Landroid/support/v4/util/Pools$SynchronizedPool;

    invoke-direct {v0, v1}, Landroid/support/v4/util/Pools$SynchronizedPool;-><init>(I)V

    iput-object v0, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;->mRequestPool:Landroid/support/v4/util/Pools$SynchronizedPool;

    return-void
.end method

.method public static getInstance()Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;
    .locals 1

    .line 162
    sget-object v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;->sInstance:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;

    return-object v0
.end method


# virtual methods
.method public enqueue(Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;)V
    .locals 2

    .line 214
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;->mQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ArrayBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 216
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to enqueue async inflate request"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public obtainRequest()Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;
    .locals 2

    .line 196
    iget-object v0, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;->mRequestPool:Landroid/support/v4/util/Pools$SynchronizedPool;

    invoke-virtual {v0}, Landroid/support/v4/util/Pools$SynchronizedPool;->acquire()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;

    if-nez v0, :cond_0

    .line 198
    new-instance v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;-><init>(Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$1;)V

    :cond_0
    return-object v0
.end method

.method public releaseRequest(Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;)V
    .locals 2

    const/4 v0, 0x0

    .line 204
    iput-object v0, p1, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->callback:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$OnInflateFinishedListener;

    .line 205
    iput-object v0, p1, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->inflater:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;

    .line 206
    iput-object v0, p1, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->parent:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    .line 207
    iput v1, p1, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->resid:I

    .line 208
    iput-object v0, p1, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->view:Landroid/view/View;

    .line 209
    iget-object v0, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;->mRequestPool:Landroid/support/v4/util/Pools$SynchronizedPool;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/Pools$SynchronizedPool;->release(Ljava/lang/Object;)Z

    return-void
.end method

.method public run()V
    .locals 5

    .line 175
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;->mQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ArrayBlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v1, 0x0

    .line 183
    :try_start_1
    iget-object v2, v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->inflater:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;

    invoke-static {v2}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;->access$000(Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;)Landroid/view/LayoutInflater;

    move-result-object v2

    iget v3, v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->resid:I

    iget-object v4, v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->parent:Landroid/view/ViewGroup;

    invoke-virtual {v2, v3, v4, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    iput-object v2, v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->view:Landroid/view/View;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    const-string v3, "AsyncLayoutInflater"

    const-string v4, "Failed to inflate resource in the background! Retrying on the UI thread"

    .line 187
    invoke-static {v3, v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 190
    :goto_1
    iget-object v2, v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->inflater:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;

    invoke-static {v2}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;->access$200(Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;)Landroid/os/Handler;

    move-result-object v2

    invoke-static {v2, v1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 191
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "AsyncLayoutInflater"

    .line 178
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

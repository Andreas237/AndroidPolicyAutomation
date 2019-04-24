.class public abstract Lme/pushy/sdk/util/PushyAsyncTask;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/pushy/sdk/util/PushyAsyncTask$AsyncTaskAdapterResult;,
        Lme/pushy/sdk/util/PushyAsyncTask$WorkerRunnable;,
        Lme/pushy/sdk/util/PushyAsyncTask$InternalHandler;,
        Lme/pushy/sdk/util/PushyAsyncTask$Status;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Params:",
        "Ljava/lang/Object;",
        "Progress:",
        "Ljava/lang/Object;",
        "Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final CORE_POOL_SIZE:I

.field private static final CPU_COUNT:I

.field private static final KEEP_ALIVE:I = 0x1

.field private static final LOG_TAG:Ljava/lang/String; = "AsyncTaskAdapter"

.field private static final MAXIMUM_POOL_SIZE:I

.field private static final MESSAGE_POST_PROGRESS:I = 0x2

.field private static final MESSAGE_POST_RESULT:I = 0x1

.field public static final THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

.field private static volatile sDefaultExecutor:Ljava/util/concurrent/Executor;

.field private static final sHandler:Lme/pushy/sdk/util/PushyAsyncTask$InternalHandler;

.field private static final sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private static final sThreadFactory:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field private final mCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mFuture:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask<",
            "TResult;>;"
        }
    .end annotation
.end field

.field private volatile mStatus:Lme/pushy/sdk/util/PushyAsyncTask$Status;

.field private final mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mWorker:Lme/pushy/sdk/util/PushyAsyncTask$WorkerRunnable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lme/pushy/sdk/util/PushyAsyncTask$WorkerRunnable<",
            "TParams;TResult;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Lme/pushy/sdk/util/PushyAsyncTask;->CPU_COUNT:I

    sget v0, Lme/pushy/sdk/util/PushyAsyncTask;->CPU_COUNT:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lme/pushy/sdk/util/PushyAsyncTask;->CORE_POOL_SIZE:I

    sget v0, Lme/pushy/sdk/util/PushyAsyncTask;->CPU_COUNT:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    sput v0, Lme/pushy/sdk/util/PushyAsyncTask;->MAXIMUM_POOL_SIZE:I

    new-instance v0, Lme/pushy/sdk/util/PushyAsyncTask$1;

    invoke-direct {v0}, Lme/pushy/sdk/util/PushyAsyncTask$1;-><init>()V

    sput-object v0, Lme/pushy/sdk/util/PushyAsyncTask;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v0, Lme/pushy/sdk/util/PushyAsyncTask;->sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v3, Lme/pushy/sdk/util/PushyAsyncTask;->CORE_POOL_SIZE:I

    sget v4, Lme/pushy/sdk/util/PushyAsyncTask;->MAXIMUM_POOL_SIZE:I

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v8, Lme/pushy/sdk/util/PushyAsyncTask;->sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;

    sget-object v9, Lme/pushy/sdk/util/PushyAsyncTask;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;

    const-wide/16 v5, 0x1

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Lme/pushy/sdk/util/PushyAsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v0, Lme/pushy/sdk/util/PushyAsyncTask$InternalHandler;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lme/pushy/sdk/util/PushyAsyncTask$InternalHandler;-><init>(Lme/pushy/sdk/util/PushyAsyncTask$1;)V

    sput-object v0, Lme/pushy/sdk/util/PushyAsyncTask;->sHandler:Lme/pushy/sdk/util/PushyAsyncTask$InternalHandler;

    sget-object v0, Lme/pushy/sdk/util/PushyAsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    sput-object v0, Lme/pushy/sdk/util/PushyAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object v0, Lme/pushy/sdk/util/PushyAsyncTask$Status;->PENDING:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    iput-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mStatus:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    new-instance v0, Lme/pushy/sdk/util/PushyAsyncTask$2;

    invoke-direct {v0, p0}, Lme/pushy/sdk/util/PushyAsyncTask$2;-><init>(Lme/pushy/sdk/util/PushyAsyncTask;)V

    iput-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mWorker:Lme/pushy/sdk/util/PushyAsyncTask$WorkerRunnable;

    new-instance v0, Lme/pushy/sdk/util/PushyAsyncTask$3;

    iget-object v1, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mWorker:Lme/pushy/sdk/util/PushyAsyncTask$WorkerRunnable;

    invoke-direct {v0, p0, v1}, Lme/pushy/sdk/util/PushyAsyncTask$3;-><init>(Lme/pushy/sdk/util/PushyAsyncTask;Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;

    return-void
.end method

.method static synthetic access$200(Lme/pushy/sdk/util/PushyAsyncTask;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic access$300(Lme/pushy/sdk/util/PushyAsyncTask;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lme/pushy/sdk/util/PushyAsyncTask;->postResult(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Lme/pushy/sdk/util/PushyAsyncTask;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lme/pushy/sdk/util/PushyAsyncTask;->postResultIfNotInvoked(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$500(Lme/pushy/sdk/util/PushyAsyncTask;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lme/pushy/sdk/util/PushyAsyncTask;->finish(Ljava/lang/Object;)V

    return-void
.end method

.method public static execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lme/pushy/sdk/util/PushyAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private finish(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lme/pushy/sdk/util/PushyAsyncTask;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lme/pushy/sdk/util/PushyAsyncTask;->onCancelled(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lme/pushy/sdk/util/PushyAsyncTask;->onPostExecute(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Lme/pushy/sdk/util/PushyAsyncTask$Status;->FINISHED:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    iput-object p1, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mStatus:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    return-void
.end method

.method public static init()V
    .locals 1

    sget-object v0, Lme/pushy/sdk/util/PushyAsyncTask;->sHandler:Lme/pushy/sdk/util/PushyAsyncTask$InternalHandler;

    invoke-virtual {v0}, Lme/pushy/sdk/util/PushyAsyncTask$InternalHandler;->getLooper()Landroid/os/Looper;

    return-void
.end method

.method private postResult(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)TResult;"
        }
    .end annotation

    sget-object v0, Lme/pushy/sdk/util/PushyAsyncTask;->sHandler:Lme/pushy/sdk/util/PushyAsyncTask$InternalHandler;

    new-instance v1, Lme/pushy/sdk/util/PushyAsyncTask$AsyncTaskAdapterResult;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-direct {v1, p0, v3}, Lme/pushy/sdk/util/PushyAsyncTask$AsyncTaskAdapterResult;-><init>(Lme/pushy/sdk/util/PushyAsyncTask;[Ljava/lang/Object;)V

    invoke-virtual {v0, v2, v1}, Lme/pushy/sdk/util/PushyAsyncTask$InternalHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-object p1
.end method

.method private postResultIfNotInvoked(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lme/pushy/sdk/util/PushyAsyncTask;->postResult(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static setDefaultExecutor(Ljava/util/concurrent/Executor;)V
    .locals 0

    sput-object p0, Lme/pushy/sdk/util/PushyAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 2

    iget-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method protected varargs abstract doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TParams;)TResult;"
        }
    .end annotation
.end method

.method public final varargs execute([Ljava/lang/Object;)Lme/pushy/sdk/util/PushyAsyncTask;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TParams;)",
            "Lme/pushy/sdk/util/PushyAsyncTask<",
            "TParams;TProgress;TResult;>;"
        }
    .end annotation

    sget-object v0, Lme/pushy/sdk/util/PushyAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lme/pushy/sdk/util/PushyAsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lme/pushy/sdk/util/PushyAsyncTask;

    move-result-object p1

    return-object p1
.end method

.method public final varargs executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lme/pushy/sdk/util/PushyAsyncTask;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "[TParams;)",
            "Lme/pushy/sdk/util/PushyAsyncTask<",
            "TParams;TProgress;TResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mStatus:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    sget-object v1, Lme/pushy/sdk/util/PushyAsyncTask$Status;->PENDING:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    if-eq v0, v1, :cond_0

    sget-object v0, Lme/pushy/sdk/util/PushyAsyncTask$4;->$SwitchMap$me$pushy$sdk$util$PushyAsyncTask$Status:[I

    iget-object v1, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mStatus:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    invoke-virtual {v1}, Lme/pushy/sdk/util/PushyAsyncTask$Status;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot execute task: the task has already been executed (a task can be executed only once)"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot execute task: the task is already running."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    :goto_0
    sget-object v0, Lme/pushy/sdk/util/PushyAsyncTask$Status;->RUNNING:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    iput-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mStatus:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    invoke-virtual {p0}, Lme/pushy/sdk/util/PushyAsyncTask;->onPreExecute()V

    iget-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mWorker:Lme/pushy/sdk/util/PushyAsyncTask$WorkerRunnable;

    iput-object p2, v0, Lme/pushy/sdk/util/PushyAsyncTask$WorkerRunnable;->mParams:[Ljava/lang/Object;

    iget-object p2, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    iget-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TResult;"
        }
    .end annotation

    iget-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getStatus()Lme/pushy/sdk/util/PushyAsyncTask$Status;
    .locals 1

    iget-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mStatus:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    return-object v0
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask;->mCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method protected onCancelled()V
    .locals 0

    return-void
.end method

.method protected onCancelled(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lme/pushy/sdk/util/PushyAsyncTask;->onCancelled()V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TProgress;)V"
        }
    .end annotation

    return-void
.end method

.method protected final varargs publishProgress([Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TProgress;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lme/pushy/sdk/util/PushyAsyncTask;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lme/pushy/sdk/util/PushyAsyncTask;->sHandler:Lme/pushy/sdk/util/PushyAsyncTask$InternalHandler;

    const/4 v1, 0x2

    new-instance v2, Lme/pushy/sdk/util/PushyAsyncTask$AsyncTaskAdapterResult;

    invoke-direct {v2, p0, p1}, Lme/pushy/sdk/util/PushyAsyncTask$AsyncTaskAdapterResult;-><init>(Lme/pushy/sdk/util/PushyAsyncTask;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lme/pushy/sdk/util/PushyAsyncTask$InternalHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_0
    return-void
.end method

.class public Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;
.super Ljava/lang/Object;
.source "AsyncPersistentStringQueue.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallbackForTest;,
        Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallback;,
        Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;,
        Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;,
        Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;,
        Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;,
        Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$WriteStringTask;
    }
.end annotation


# static fields
.field private static final DIRECTORY_NAME:Ljava/lang/String; = "AsyncPersistentQueueDirectory"


# instance fields
.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallback;",
            ">;"
        }
    .end annotation
.end field

.field private context:Landroid/content/Context;

.field private isRunningTask:Z

.field private persistentQueueTaskInfoQueue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;",
            ">;"
        }
    .end annotation
.end field

.field private queueName:Ljava/lang/String;

.field private stringQueue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private testCallbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallbackForTest;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallback;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->context:Landroid/content/Context;

    .line 36
    iput-object p2, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->queueName:Ljava/lang/String;

    .line 37
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 39
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->stringQueue:Ljava/util/Queue;

    .line 40
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->persistentQueueTaskInfoQueue:Ljava/util/Queue;

    .line 42
    new-instance p1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;-><init>(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$1;)V

    .line 43
    sget-object p2, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;->READ:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    iput-object p2, p1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;->taskType:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    .line 44
    invoke-direct {p0, p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->handlePersistentQueueTaskInfo(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallback;Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallbackForTest;)V
    .locals 0

    .line 262
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallback;)V

    .line 263
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->testCallbackRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)Ljava/io/File;
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->getQueueFile()Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->maybeHandleNextPersistentQueueTaskInfo()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->testCallbackRef:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)Ljava/util/Queue;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->stringQueue:Ljava/util/Queue;

    return-object p0
.end method

.method static synthetic access$502(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;Ljava/util/Queue;)Ljava/util/Queue;
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->stringQueue:Ljava/util/Queue;

    return-object p1
.end method

.method static synthetic access$600(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->callbackRef:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method private getQueueFile()Ljava/io/File;
    .locals 3

    .line 110
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "AsyncPersistentQueueDirectory"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 111
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 112
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 114
    :cond_0
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->queueName:Ljava/lang/String;

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method

.method private handlePersistentQueueTaskInfo(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;)V
    .locals 3

    .line 56
    iget-boolean v0, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->isRunningTask:Z

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->persistentQueueTaskInfoQueue:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void

    .line 61
    :cond_0
    sget-object v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$1;->$SwitchMap$com$shopkick$app$persistence$AsyncPersistentStringQueue$PersistentQueueTaskType:[I

    iget-object v1, p1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;->taskType:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    invoke-virtual {v1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 73
    :pswitch_0
    new-instance v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$WriteStringTask;

    iget-object p1, p1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;->stringToWrite:Ljava/lang/String;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$WriteStringTask;-><init>(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;Ljava/lang/String;)V

    .line 74
    new-array p1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$WriteStringTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 75
    iput-boolean v1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->isRunningTask:Z

    goto :goto_0

    .line 68
    :pswitch_1
    new-instance v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;

    iget-object p1, p1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;->stringsToWrite:Ljava/util/Queue;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;-><init>(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;Ljava/util/Queue;)V

    .line 69
    new-array p1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 70
    iput-boolean v1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->isRunningTask:Z

    goto :goto_0

    .line 63
    :pswitch_2
    new-instance p1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;-><init>(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$1;)V

    .line 64
    new-array v0, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 65
    iput-boolean v1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->isRunningTask:Z

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private maybeHandleNextPersistentQueueTaskInfo()V
    .locals 1

    const/4 v0, 0x0

    .line 48
    iput-boolean v0, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->isRunningTask:Z

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->persistentQueueTaskInfoQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;

    if-eqz v0, :cond_0

    .line 51
    invoke-direct {p0, v0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->handlePersistentQueueTaskInfo(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public addString(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->stringQueue:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 89
    new-instance v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;-><init>(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$1;)V

    .line 90
    sget-object v1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;->WRITE:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    iput-object v1, v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;->taskType:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    .line 91
    iput-object p1, v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;->stringToWrite:Ljava/lang/String;

    .line 92
    invoke-direct {p0, v0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->handlePersistentQueueTaskInfo(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;)V

    return-void
.end method

.method public destroyQueue()V
    .locals 1

    .line 267
    invoke-direct {p0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->getQueueFile()Ljava/io/File;

    move-result-object v0

    .line 268
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    return-void
.end method

.method public getFirstString()Ljava/lang/String;
    .locals 1

    .line 276
    iget-object v0, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->stringQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getQueueSize()I
    .locals 1

    .line 272
    iget-object v0, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->stringQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    return v0
.end method

.method public popString()Ljava/lang/String;
    .locals 4

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->stringQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 99
    new-instance v1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;-><init>(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$1;)V

    .line 100
    sget-object v2, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;->REMOVE:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    iput-object v2, v1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;->taskType:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    .line 101
    new-instance v2, Ljava/util/LinkedList;

    iget-object v3, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->stringQueue:Ljava/util/Queue;

    invoke-direct {v2, v3}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;->stringsToWrite:Ljava/util/Queue;

    .line 102
    invoke-direct {p0, v1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->handlePersistentQueueTaskInfo(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;)V

    :cond_0
    return-object v0
.end method

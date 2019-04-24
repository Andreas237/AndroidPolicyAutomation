.class public Lorg/greenrobot/eventbus/util/AsyncExecutor;
.super Ljava/lang/Object;
.source "AsyncExecutor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/greenrobot/eventbus/util/AsyncExecutor$RunnableEx;,
        Lorg/greenrobot/eventbus/util/AsyncExecutor$Builder;
    }
.end annotation


# instance fields
.field private final eventBus:Lorg/greenrobot/eventbus/EventBus;

.field private final failureEventConstructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor",
            "<*>;"
        }
    .end annotation
.end field

.field private final scope:Ljava/lang/Object;

.field private final threadPool:Ljava/util/concurrent/Executor;


# direct methods
.method private constructor <init>(Ljava/util/concurrent/Executor;Lorg/greenrobot/eventbus/EventBus;Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 4
    .param p1, "threadPool"    # Ljava/util/concurrent/Executor;
    .param p2, "eventBus"    # Lorg/greenrobot/eventbus/EventBus;
    .param p4, "scope"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lorg/greenrobot/eventbus/EventBus;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 98
    .local p3, "failureEventType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p1, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor;->threadPool:Ljava/util/concurrent/Executor;

    .line 100
    iput-object p2, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    .line 101
    iput-object p4, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor;->scope:Ljava/lang/Object;

    .line 103
    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Ljava/lang/Throwable;

    aput-object v3, v1, v2

    invoke-virtual {p3, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    iput-object v1, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor;->failureEventConstructor:Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    return-void

    .line 104
    :catch_0
    move-exception v0

    .line 105
    .local v0, "e":Ljava/lang/NoSuchMethodException;
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Failure event class must have a constructor with one parameter of type Throwable"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method synthetic constructor <init>(Ljava/util/concurrent/Executor;Lorg/greenrobot/eventbus/EventBus;Ljava/lang/Class;Ljava/lang/Object;Lorg/greenrobot/eventbus/util/AsyncExecutor$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/util/concurrent/Executor;
    .param p2, "x1"    # Lorg/greenrobot/eventbus/EventBus;
    .param p3, "x2"    # Ljava/lang/Class;
    .param p4, "x3"    # Ljava/lang/Object;
    .param p5, "x4"    # Lorg/greenrobot/eventbus/util/AsyncExecutor$1;

    .prologue
    .line 33
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/greenrobot/eventbus/util/AsyncExecutor;-><init>(Ljava/util/concurrent/Executor;Lorg/greenrobot/eventbus/EventBus;Ljava/lang/Class;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$200(Lorg/greenrobot/eventbus/util/AsyncExecutor;)Ljava/lang/reflect/Constructor;
    .locals 1
    .param p0, "x0"    # Lorg/greenrobot/eventbus/util/AsyncExecutor;

    .prologue
    .line 33
    iget-object v0, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor;->failureEventConstructor:Ljava/lang/reflect/Constructor;

    return-object v0
.end method

.method static synthetic access$300(Lorg/greenrobot/eventbus/util/AsyncExecutor;)Ljava/lang/Object;
    .locals 1
    .param p0, "x0"    # Lorg/greenrobot/eventbus/util/AsyncExecutor;

    .prologue
    .line 33
    iget-object v0, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor;->scope:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$400(Lorg/greenrobot/eventbus/util/AsyncExecutor;)Lorg/greenrobot/eventbus/EventBus;
    .locals 1
    .param p0, "x0"    # Lorg/greenrobot/eventbus/util/AsyncExecutor;

    .prologue
    .line 33
    iget-object v0, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    return-object v0
.end method

.method public static builder()Lorg/greenrobot/eventbus/util/AsyncExecutor$Builder;
    .locals 2

    .prologue
    .line 86
    new-instance v0, Lorg/greenrobot/eventbus/util/AsyncExecutor$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/greenrobot/eventbus/util/AsyncExecutor$Builder;-><init>(Lorg/greenrobot/eventbus/util/AsyncExecutor$1;)V

    return-object v0
.end method

.method public static create()Lorg/greenrobot/eventbus/util/AsyncExecutor;
    .locals 2

    .prologue
    .line 90
    new-instance v0, Lorg/greenrobot/eventbus/util/AsyncExecutor$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/greenrobot/eventbus/util/AsyncExecutor$Builder;-><init>(Lorg/greenrobot/eventbus/util/AsyncExecutor$1;)V

    invoke-virtual {v0}, Lorg/greenrobot/eventbus/util/AsyncExecutor$Builder;->build()Lorg/greenrobot/eventbus/util/AsyncExecutor;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public execute(Lorg/greenrobot/eventbus/util/AsyncExecutor$RunnableEx;)V
    .locals 2
    .param p1, "runnable"    # Lorg/greenrobot/eventbus/util/AsyncExecutor$RunnableEx;

    .prologue
    .line 112
    iget-object v0, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor;->threadPool:Ljava/util/concurrent/Executor;

    new-instance v1, Lorg/greenrobot/eventbus/util/AsyncExecutor$1;

    invoke-direct {v1, p0, p1}, Lorg/greenrobot/eventbus/util/AsyncExecutor$1;-><init>(Lorg/greenrobot/eventbus/util/AsyncExecutor;Lorg/greenrobot/eventbus/util/AsyncExecutor$RunnableEx;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 132
    return-void
.end method

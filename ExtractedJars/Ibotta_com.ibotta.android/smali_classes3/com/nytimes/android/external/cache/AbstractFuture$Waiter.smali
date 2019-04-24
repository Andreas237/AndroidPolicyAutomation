.class final Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;
.super Ljava/lang/Object;
.source "AbstractFuture.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/AbstractFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Waiter"
.end annotation


# static fields
.field static final TOMBSTONE:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;


# instance fields
.field volatile next:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

.field volatile thread:Ljava/lang/Thread;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 105
    new-instance v0, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;-><init>(Z)V

    sput-object v0, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->TOMBSTONE:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    invoke-static {}, Lcom/nytimes/android/external/cache/AbstractFuture;->access$100()Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;->putThread(Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;Ljava/lang/Thread;)V

    return-void
.end method

.method constructor <init>(Z)V
    .locals 0

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method setNext(Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)V
    .locals 1

    .line 124
    invoke-static {}, Lcom/nytimes/android/external/cache/AbstractFuture;->access$100()Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;->putNext(Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)V

    return-void
.end method

.method unpark()V
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->thread:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 133
    iput-object v1, p0, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->thread:Ljava/lang/Thread;

    .line 134
    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method

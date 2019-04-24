.class final Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;
.super Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;
.source "AbstractFuture.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/AbstractFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SafeAtomicHelper"
.end annotation


# instance fields
.field final listenersUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/nytimes/android/external/cache/AbstractFuture;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Listener;",
            ">;"
        }
    .end annotation
.end field

.field final valueUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/nytimes/android/external/cache/AbstractFuture;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final waiterNextUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;",
            ">;"
        }
    .end annotation
.end field

.field final waiterThreadUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;",
            "Ljava/lang/Thread;",
            ">;"
        }
    .end annotation
.end field

.field final waitersUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/nytimes/android/external/cache/AbstractFuture;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;",
            "Ljava/lang/Thread;",
            ">;",
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;",
            ">;",
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/nytimes/android/external/cache/AbstractFuture;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;",
            ">;",
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/nytimes/android/external/cache/AbstractFuture;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Listener;",
            ">;",
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/nytimes/android/external/cache/AbstractFuture;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 837
    invoke-direct {p0, v0}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;-><init>(Lcom/nytimes/android/external/cache/AbstractFuture$1;)V

    .line 838
    iput-object p1, p0, Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;->waiterThreadUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 839
    iput-object p2, p0, Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;->waiterNextUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 840
    iput-object p3, p0, Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;->waitersUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 841
    iput-object p4, p0, Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;->listenersUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 842
    iput-object p5, p0, Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;->valueUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method


# virtual methods
.method casListeners(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Listener;Lcom/nytimes/android/external/cache/AbstractFuture$Listener;)Z
    .locals 1
    .param p1    # Lcom/nytimes/android/external/cache/AbstractFuture;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/AbstractFuture<",
            "*>;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Listener;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Listener;",
            ")Z"
        }
    .end annotation

    .line 862
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;->listenersUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method casValue(Lcom/nytimes/android/external/cache/AbstractFuture;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Lcom/nytimes/android/external/cache/AbstractFuture;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/AbstractFuture<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .line 867
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;->valueUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method casWaiters(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)Z
    .locals 1
    .param p1    # Lcom/nytimes/android/external/cache/AbstractFuture;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/AbstractFuture<",
            "*>;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;",
            ")Z"
        }
    .end annotation

    .line 857
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;->waitersUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method putNext(Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)V
    .locals 1
    .param p1    # Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 852
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;->waiterNextUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method putThread(Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;Ljava/lang/Thread;)V
    .locals 1
    .param p1    # Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 847
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;->waiterThreadUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

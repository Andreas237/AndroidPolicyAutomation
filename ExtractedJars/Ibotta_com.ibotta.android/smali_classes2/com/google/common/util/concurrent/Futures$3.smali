.class final Lcom/google/common/util/concurrent/Futures$3;
.super Ljava/lang/Object;
.source "Futures.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/util/concurrent/Futures;->inCompletionOrder(Ljava/lang/Iterable;)Lcom/google/common/collect/ImmutableList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$delegateIndex:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic val$delegates:Lcom/google/common/collect/ImmutableList;

.field final synthetic val$future:Lcom/google/common/util/concurrent/ListenableFuture;


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;Lcom/google/common/collect/ImmutableList;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    .line 1103
    iput-object p1, p0, Lcom/google/common/util/concurrent/Futures$3;->val$delegateIndex:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p2, p0, Lcom/google/common/util/concurrent/Futures$3;->val$delegates:Lcom/google/common/collect/ImmutableList;

    iput-object p3, p0, Lcom/google/common/util/concurrent/Futures$3;->val$future:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1106
    iget-object v0, p0, Lcom/google/common/util/concurrent/Futures$3;->val$delegateIndex:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    :goto_0
    iget-object v1, p0, Lcom/google/common/util/concurrent/Futures$3;->val$delegates:Lcom/google/common/collect/ImmutableList;

    invoke-virtual {v1}, Lcom/google/common/collect/ImmutableList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 1107
    iget-object v1, p0, Lcom/google/common/util/concurrent/Futures$3;->val$delegates:Lcom/google/common/collect/ImmutableList;

    invoke-virtual {v1, v0}, Lcom/google/common/collect/ImmutableList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/common/util/concurrent/SettableFuture;

    iget-object v2, p0, Lcom/google/common/util/concurrent/Futures$3;->val$future:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-virtual {v1, v2}, Lcom/google/common/util/concurrent/SettableFuture;->setFuture(Lcom/google/common/util/concurrent/ListenableFuture;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1109
    iget-object v1, p0, Lcom/google/common/util/concurrent/Futures$3;->val$delegateIndex:Ljava/util/concurrent/atomic/AtomicInteger;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

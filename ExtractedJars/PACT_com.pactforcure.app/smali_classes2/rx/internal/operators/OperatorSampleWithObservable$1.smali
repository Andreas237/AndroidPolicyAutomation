.class Lrx/internal/operators/OperatorSampleWithObservable$1;
.super Lrx/Subscriber;
.source "OperatorSampleWithObservable.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrx/internal/operators/OperatorSampleWithObservable;->call(Lrx/Subscriber;)Lrx/Subscriber;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lrx/Subscriber",
        "<TU;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lrx/internal/operators/OperatorSampleWithObservable;

.field final synthetic val$main:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic val$s:Lrx/observers/SerializedSubscriber;

.field final synthetic val$value:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method constructor <init>(Lrx/internal/operators/OperatorSampleWithObservable;Ljava/util/concurrent/atomic/AtomicReference;Lrx/observers/SerializedSubscriber;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    .prologue
    .line 49
    .local p0, "this":Lrx/internal/operators/OperatorSampleWithObservable$1;, "Lrx/internal/operators/OperatorSampleWithObservable.1;"
    iput-object p1, p0, Lrx/internal/operators/OperatorSampleWithObservable$1;->this$0:Lrx/internal/operators/OperatorSampleWithObservable;

    iput-object p2, p0, Lrx/internal/operators/OperatorSampleWithObservable$1;->val$value:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lrx/internal/operators/OperatorSampleWithObservable$1;->val$s:Lrx/observers/SerializedSubscriber;

    iput-object p4, p0, Lrx/internal/operators/OperatorSampleWithObservable$1;->val$main:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Lrx/Subscriber;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted()V
    .locals 1

    .prologue
    .line 69
    .local p0, "this":Lrx/internal/operators/OperatorSampleWithObservable$1;, "Lrx/internal/operators/OperatorSampleWithObservable.1;"
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lrx/internal/operators/OperatorSampleWithObservable$1;->onNext(Ljava/lang/Object;)V

    .line 70
    iget-object v0, p0, Lrx/internal/operators/OperatorSampleWithObservable$1;->val$s:Lrx/observers/SerializedSubscriber;

    invoke-virtual {v0}, Lrx/observers/SerializedSubscriber;->onCompleted()V

    .line 72
    iget-object v0, p0, Lrx/internal/operators/OperatorSampleWithObservable$1;->val$main:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrx/Subscription;

    invoke-interface {v0}, Lrx/Subscription;->unsubscribe()V

    .line 73
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1
    .param p1, "e"    # Ljava/lang/Throwable;

    .prologue
    .line 62
    .local p0, "this":Lrx/internal/operators/OperatorSampleWithObservable$1;, "Lrx/internal/operators/OperatorSampleWithObservable.1;"
    iget-object v0, p0, Lrx/internal/operators/OperatorSampleWithObservable$1;->val$s:Lrx/observers/SerializedSubscriber;

    invoke-virtual {v0, p1}, Lrx/observers/SerializedSubscriber;->onError(Ljava/lang/Throwable;)V

    .line 64
    iget-object v0, p0, Lrx/internal/operators/OperatorSampleWithObservable$1;->val$main:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrx/Subscription;

    invoke-interface {v0}, Lrx/Subscription;->unsubscribe()V

    .line 65
    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    .prologue
    .line 52
    .local p0, "this":Lrx/internal/operators/OperatorSampleWithObservable$1;, "Lrx/internal/operators/OperatorSampleWithObservable.1;"
    .local p1, "t":Ljava/lang/Object;, "TU;"
    iget-object v2, p0, Lrx/internal/operators/OperatorSampleWithObservable$1;->val$value:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v3, Lrx/internal/operators/OperatorSampleWithObservable;->EMPTY_TOKEN:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 53
    .local v0, "localValue":Ljava/lang/Object;
    sget-object v2, Lrx/internal/operators/OperatorSampleWithObservable;->EMPTY_TOKEN:Ljava/lang/Object;

    if-eq v0, v2, :cond_0

    .line 55
    move-object v1, v0

    .line 56
    .local v1, "v":Ljava/lang/Object;, "TT;"
    iget-object v2, p0, Lrx/internal/operators/OperatorSampleWithObservable$1;->val$s:Lrx/observers/SerializedSubscriber;

    invoke-virtual {v2, v1}, Lrx/observers/SerializedSubscriber;->onNext(Ljava/lang/Object;)V

    .line 58
    .end local v1    # "v":Ljava/lang/Object;, "TT;"
    :cond_0
    return-void
.end method

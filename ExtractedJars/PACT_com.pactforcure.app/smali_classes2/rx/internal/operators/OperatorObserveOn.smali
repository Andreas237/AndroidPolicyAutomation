.class public final Lrx/internal/operators/OperatorObserveOn;
.super Ljava/lang/Object;
.source "OperatorObserveOn.java"

# interfaces
.implements Lrx/Observable$Operator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrx/internal/operators/OperatorObserveOn$ObserveOnSubscriber;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lrx/Observable$Operator",
        "<TT;TT;>;"
    }
.end annotation


# instance fields
.field private final bufferSize:I

.field private final delayError:Z

.field private final scheduler:Lrx/Scheduler;


# direct methods
.method public constructor <init>(Lrx/Scheduler;Z)V
    .locals 1
    .param p1, "scheduler"    # Lrx/Scheduler;
    .param p2, "delayError"    # Z

    .prologue
    .line 50
    .local p0, "this":Lrx/internal/operators/OperatorObserveOn;, "Lrx/internal/operators/OperatorObserveOn<TT;>;"
    sget v0, Lrx/internal/util/RxRingBuffer;->SIZE:I

    invoke-direct {p0, p1, p2, v0}, Lrx/internal/operators/OperatorObserveOn;-><init>(Lrx/Scheduler;ZI)V

    .line 51
    return-void
.end method

.method public constructor <init>(Lrx/Scheduler;ZI)V
    .locals 0
    .param p1, "scheduler"    # Lrx/Scheduler;
    .param p2, "delayError"    # Z
    .param p3, "bufferSize"    # I

    .prologue
    .line 58
    .local p0, "this":Lrx/internal/operators/OperatorObserveOn;, "Lrx/internal/operators/OperatorObserveOn<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lrx/internal/operators/OperatorObserveOn;->scheduler:Lrx/Scheduler;

    .line 60
    iput-boolean p2, p0, Lrx/internal/operators/OperatorObserveOn;->delayError:Z

    .line 61
    if-lez p3, :cond_0

    .end local p3    # "bufferSize":I
    :goto_0
    iput p3, p0, Lrx/internal/operators/OperatorObserveOn;->bufferSize:I

    .line 62
    return-void

    .line 61
    .restart local p3    # "bufferSize":I
    :cond_0
    sget p3, Lrx/internal/util/RxRingBuffer;->SIZE:I

    goto :goto_0
.end method


# virtual methods
.method public bridge synthetic call(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 39
    .local p0, "this":Lrx/internal/operators/OperatorObserveOn;, "Lrx/internal/operators/OperatorObserveOn<TT;>;"
    check-cast p1, Lrx/Subscriber;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lrx/internal/operators/OperatorObserveOn;->call(Lrx/Subscriber;)Lrx/Subscriber;

    move-result-object v0

    return-object v0
.end method

.method public call(Lrx/Subscriber;)Lrx/Subscriber;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrx/Subscriber",
            "<-TT;>;)",
            "Lrx/Subscriber",
            "<-TT;>;"
        }
    .end annotation

    .prologue
    .line 66
    .local p0, "this":Lrx/internal/operators/OperatorObserveOn;, "Lrx/internal/operators/OperatorObserveOn<TT;>;"
    .local p1, "child":Lrx/Subscriber;, "Lrx/Subscriber<-TT;>;"
    iget-object v1, p0, Lrx/internal/operators/OperatorObserveOn;->scheduler:Lrx/Scheduler;

    instance-of v1, v1, Lrx/schedulers/ImmediateScheduler;

    if-eqz v1, :cond_1

    .line 75
    .end local p1    # "child":Lrx/Subscriber;, "Lrx/Subscriber<-TT;>;"
    :cond_0
    :goto_0
    return-object p1

    .line 69
    .restart local p1    # "child":Lrx/Subscriber;, "Lrx/Subscriber<-TT;>;"
    :cond_1
    iget-object v1, p0, Lrx/internal/operators/OperatorObserveOn;->scheduler:Lrx/Scheduler;

    instance-of v1, v1, Lrx/schedulers/TrampolineScheduler;

    if-nez v1, :cond_0

    .line 73
    new-instance v0, Lrx/internal/operators/OperatorObserveOn$ObserveOnSubscriber;

    iget-object v1, p0, Lrx/internal/operators/OperatorObserveOn;->scheduler:Lrx/Scheduler;

    iget-boolean v2, p0, Lrx/internal/operators/OperatorObserveOn;->delayError:Z

    iget v3, p0, Lrx/internal/operators/OperatorObserveOn;->bufferSize:I

    invoke-direct {v0, v1, p1, v2, v3}, Lrx/internal/operators/OperatorObserveOn$ObserveOnSubscriber;-><init>(Lrx/Scheduler;Lrx/Subscriber;ZI)V

    .line 74
    .local v0, "parent":Lrx/internal/operators/OperatorObserveOn$ObserveOnSubscriber;, "Lrx/internal/operators/OperatorObserveOn$ObserveOnSubscriber<TT;>;"
    invoke-virtual {v0}, Lrx/internal/operators/OperatorObserveOn$ObserveOnSubscriber;->init()V

    move-object p1, v0

    .line 75
    goto :goto_0
.end method

.class public Lcom/mopub/common/event/EventDispatcher;
.super Ljava/lang/Object;
.source "EventDispatcher.java"


# instance fields
.field private final mEventRecorders:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Lcom/mopub/common/event/EventRecorder;",
            ">;"
        }
    .end annotation
.end field

.field private final mHandlerCallback:Landroid/os/Handler$Callback;

.field private final mLooper:Landroid/os/Looper;

.field private final mMessageHandler:Landroid/os/Handler;


# direct methods
.method constructor <init>(Ljava/lang/Iterable;Landroid/os/Looper;)V
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lcom/mopub/common/event/EventRecorder;",
            ">;",
            "Landroid/os/Looper;",
            ")V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/mopub/common/event/EventDispatcher;->mEventRecorders:Ljava/lang/Iterable;

    .line 19
    iput-object p2, p0, Lcom/mopub/common/event/EventDispatcher;->mLooper:Landroid/os/Looper;

    .line 20
    new-instance p1, Lcom/mopub/common/event/EventDispatcher$1;

    invoke-direct {p1, p0}, Lcom/mopub/common/event/EventDispatcher$1;-><init>(Lcom/mopub/common/event/EventDispatcher;)V

    iput-object p1, p0, Lcom/mopub/common/event/EventDispatcher;->mHandlerCallback:Landroid/os/Handler$Callback;

    .line 33
    new-instance p1, Landroid/os/Handler;

    iget-object p2, p0, Lcom/mopub/common/event/EventDispatcher;->mLooper:Landroid/os/Looper;

    iget-object v0, p0, Lcom/mopub/common/event/EventDispatcher;->mHandlerCallback:Landroid/os/Handler$Callback;

    invoke-direct {p1, p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/mopub/common/event/EventDispatcher;->mMessageHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/mopub/common/event/EventDispatcher;)Ljava/lang/Iterable;
    .locals 0

    .line 10
    iget-object p0, p0, Lcom/mopub/common/event/EventDispatcher;->mEventRecorders:Ljava/lang/Iterable;

    return-object p0
.end method


# virtual methods
.method public dispatch(Lcom/mopub/common/event/BaseEvent;)V
    .locals 2

    .line 37
    iget-object v0, p0, Lcom/mopub/common/event/EventDispatcher;->mMessageHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method getEventRecorders()Ljava/lang/Iterable;
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Lcom/mopub/common/event/EventRecorder;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/mopub/common/event/EventDispatcher;->mEventRecorders:Ljava/lang/Iterable;

    return-object v0
.end method

.method getHandlerCallback()Landroid/os/Handler$Callback;
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/mopub/common/event/EventDispatcher;->mHandlerCallback:Landroid/os/Handler$Callback;

    return-object v0
.end method

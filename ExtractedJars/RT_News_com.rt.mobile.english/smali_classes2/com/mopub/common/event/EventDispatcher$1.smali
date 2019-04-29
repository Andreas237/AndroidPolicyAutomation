.class Lcom/mopub/common/event/EventDispatcher$1;
.super Ljava/lang/Object;
.source "EventDispatcher.java"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/common/event/EventDispatcher;-><init>(Ljava/lang/Iterable;Landroid/os/Looper;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/common/event/EventDispatcher;


# direct methods
.method constructor <init>(Lcom/mopub/common/event/EventDispatcher;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/mopub/common/event/EventDispatcher$1;->this$0:Lcom/mopub/common/event/EventDispatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    .line 23
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/mopub/common/event/BaseEvent;

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/mopub/common/event/EventDispatcher$1;->this$0:Lcom/mopub/common/event/EventDispatcher;

    invoke-static {v0}, Lcom/mopub/common/event/EventDispatcher;->access$000(Lcom/mopub/common/event/EventDispatcher;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mopub/common/event/EventRecorder;

    .line 25
    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Lcom/mopub/common/event/BaseEvent;

    invoke-interface {v1, v2}, Lcom/mopub/common/event/EventRecorder;->record(Lcom/mopub/common/event/BaseEvent;)V

    goto :goto_0

    :cond_0
    const-string p1, "EventDispatcher received non-BaseEvent message type."

    .line 28
    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

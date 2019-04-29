.class Lcom/mopub/common/event/ScribeEventRecorder$PollingRunnable;
.super Ljava/lang/Object;
.source "ScribeEventRecorder.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/common/event/ScribeEventRecorder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "PollingRunnable"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/common/event/ScribeEventRecorder;


# direct methods
.method constructor <init>(Lcom/mopub/common/event/ScribeEventRecorder;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/mopub/common/event/ScribeEventRecorder$PollingRunnable;->this$0:Lcom/mopub/common/event/ScribeEventRecorder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/mopub/common/event/ScribeEventRecorder$PollingRunnable;->this$0:Lcom/mopub/common/event/ScribeEventRecorder;

    invoke-virtual {v0}, Lcom/mopub/common/event/ScribeEventRecorder;->sendEvents()V

    .line 139
    iget-object v0, p0, Lcom/mopub/common/event/ScribeEventRecorder$PollingRunnable;->this$0:Lcom/mopub/common/event/ScribeEventRecorder;

    invoke-virtual {v0}, Lcom/mopub/common/event/ScribeEventRecorder;->scheduleNextPoll()V

    return-void
.end method

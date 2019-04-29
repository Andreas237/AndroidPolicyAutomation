.class Lcom/mopub/common/event/ScribeEventRecorder$1;
.super Ljava/lang/Object;
.source "ScribeEventRecorder.java"

# interfaces
.implements Lcom/mopub/network/ScribeRequest$ScribeRequestFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/common/event/ScribeEventRecorder;->sendEvents()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/common/event/ScribeEventRecorder;

.field final synthetic val$events:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/mopub/common/event/ScribeEventRecorder;Ljava/util/List;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/mopub/common/event/ScribeEventRecorder$1;->this$0:Lcom/mopub/common/event/ScribeEventRecorder;

    iput-object p2, p0, Lcom/mopub/common/event/ScribeEventRecorder$1;->val$events:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createRequest(Lcom/mopub/network/ScribeRequest$Listener;)Lcom/mopub/network/ScribeRequest;
    .locals 4

    .line 103
    new-instance v0, Lcom/mopub/network/ScribeRequest;

    const-string v1, "https://analytics.mopub.com/i/jot/exchange_client_event"

    iget-object v2, p0, Lcom/mopub/common/event/ScribeEventRecorder$1;->val$events:Ljava/util/List;

    iget-object v3, p0, Lcom/mopub/common/event/ScribeEventRecorder$1;->this$0:Lcom/mopub/common/event/ScribeEventRecorder;

    invoke-static {v3}, Lcom/mopub/common/event/ScribeEventRecorder;->access$000(Lcom/mopub/common/event/ScribeEventRecorder;)Lcom/mopub/common/event/EventSerializer;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/mopub/network/ScribeRequest;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/mopub/common/event/EventSerializer;Lcom/mopub/network/ScribeRequest$Listener;)V

    return-object v0
.end method

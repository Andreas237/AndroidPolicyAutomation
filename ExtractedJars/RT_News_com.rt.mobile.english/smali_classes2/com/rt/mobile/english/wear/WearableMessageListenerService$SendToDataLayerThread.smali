.class Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;
.super Ljava/lang/Thread;
.source "WearableMessageListenerService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/wear/WearableMessageListenerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SendToDataLayerThread"
.end annotation


# instance fields
.field message:Ljava/lang/String;

.field path:Ljava/lang/String;

.field final synthetic this$0:Lcom/rt/mobile/english/wear/WearableMessageListenerService;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/wear/WearableMessageListenerService;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;->this$0:Lcom/rt/mobile/english/wear/WearableMessageListenerService;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 125
    iput-object p2, p0, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;->path:Ljava/lang/String;

    .line 126
    iput-object p3, p0, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;->message:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 130
    sget-object v0, Lcom/google/android/gms/wearable/Wearable;->NodeApi:Lcom/google/android/gms/wearable/NodeApi;

    iget-object v1, p0, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;->this$0:Lcom/rt/mobile/english/wear/WearableMessageListenerService;

    iget-object v1, v1, Lcom/rt/mobile/english/wear/WearableMessageListenerService;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1}, Lcom/google/android/gms/wearable/NodeApi;->getConnectedNodes(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/PendingResult;->await()Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/NodeApi$GetConnectedNodesResult;

    .line 131
    invoke-interface {v0}, Lcom/google/android/gms/wearable/NodeApi$GetConnectedNodesResult;->getNodes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/wearable/Node;

    .line 132
    sget-object v2, Lcom/google/android/gms/wearable/Wearable;->MessageApi:Lcom/google/android/gms/wearable/MessageApi;

    iget-object v3, p0, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;->this$0:Lcom/rt/mobile/english/wear/WearableMessageListenerService;

    iget-object v3, v3, Lcom/rt/mobile/english/wear/WearableMessageListenerService;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v1}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;->path:Ljava/lang/String;

    iget-object v6, p0, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;->message:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    invoke-interface {v2, v3, v4, v5, v6}, Lcom/google/android/gms/wearable/MessageApi;->sendMessage(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;[B)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/PendingResult;->await()Lcom/google/android/gms/common/api/Result;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;

    .line 133
    invoke-interface {v2}, Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "myTag"

    .line 134
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Message: {"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;->message:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "} sent to: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Lcom/google/android/gms/wearable/Node;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string v1, "myTag"

    const-string v2, "ERROR: failed to send Message"

    .line 137
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    return-void
.end method

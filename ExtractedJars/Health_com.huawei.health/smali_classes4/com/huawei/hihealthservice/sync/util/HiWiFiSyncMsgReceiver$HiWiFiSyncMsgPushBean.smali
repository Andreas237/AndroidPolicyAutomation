.class Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver$HiWiFiSyncMsgPushBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "HiWiFiSyncMsgPushBean"
.end annotation


# instance fields
.field public pushContent:Ljava/lang/String;

.field public pushType:Ljava/lang/String;

.field final synthetic this$0:Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver;


# direct methods
.method private constructor <init>(Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver;)V
    .locals 1

    .line 64
    iput-object p1, p0, Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver$HiWiFiSyncMsgPushBean;->this$0:Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver$HiWiFiSyncMsgPushBean;->pushType:Ljava/lang/String;

    .line 66
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver$HiWiFiSyncMsgPushBean;->pushContent:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HiWiFiSyncMsgPushBean{, pushType=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver$HiWiFiSyncMsgPushBean;->pushType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", pushId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver$HiWiFiSyncMsgPushBean;->pushContent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
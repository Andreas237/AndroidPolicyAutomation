.class Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$1;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 141
    const-string v0, "RedPacketManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackFail ACTIVITY_KEY i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 4

    .line 134
    const-string v0, "RedPacketManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackSuccess ACTIVITY_KEY url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$1;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-static {v0, p1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$002(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$1;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->fetchRedPacketInfo()V

    .line 137
    return-void
.end method

.class Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->onFinished(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;

.field final synthetic val$redActivityBean:Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2$1;->this$1:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;

    iput-object p2, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2$1;->val$redActivityBean:Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2$1;->this$1:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->showWindow()V

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2$1;->this$1:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2$1;->val$redActivityBean:Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;

    invoke-virtual {v1}, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->getHomePageIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$700(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Ljava/lang/String;)V

    .line 216
    return-void
.end method

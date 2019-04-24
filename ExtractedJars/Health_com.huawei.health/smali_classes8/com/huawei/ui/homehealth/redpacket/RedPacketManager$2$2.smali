.class Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2$2;
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


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2$2;->this$1:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2$2;->this$1:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->hintWindow()V

    .line 236
    return-void
.end method

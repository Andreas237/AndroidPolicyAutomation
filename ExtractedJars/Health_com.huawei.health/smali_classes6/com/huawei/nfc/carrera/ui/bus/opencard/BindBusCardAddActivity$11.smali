.class Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V
    .locals 0

    .line 1606
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$11;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1609
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestLocationData Location time end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1610
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$11;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$1000(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    .line 1611
    const-string v4, "020"

    .line 1612
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$11;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$1600(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$11;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    iget-object v1, v1, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$11;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-static {v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$1100(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$11;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-interface {v0, v1, v2, v4, v3}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryTrafficCardInfo(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 1613
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " requestLocationData cityCode \uff1a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1614
    return-void
.end method

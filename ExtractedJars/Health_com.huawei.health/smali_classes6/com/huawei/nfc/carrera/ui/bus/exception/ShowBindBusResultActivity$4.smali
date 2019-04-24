.class Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getSupportDefaultCard()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)V
    .locals 0

    .line 406
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 410
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getWalletAbility()Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;

    move-result-object v4

    .line 411
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->getSupportDefautcard()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 412
    const-string v0, "ShowBindBusResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSupportDefaultCard(),walletSupportInfo="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$1302(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Z)Z

    goto :goto_0

    .line 415
    :cond_0
    const-string v0, "ShowBindBusResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportDefaultCard(),walletSupportInfo enter else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$1302(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Z)Z

    .line 418
    :goto_0
    return-void
.end method

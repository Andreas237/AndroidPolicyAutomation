.class Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->setDefaultCard()V
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

    .line 675
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 680
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$500(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->setDefaultCard(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 685
    goto :goto_0

    .line 681
    :catch_0
    move-exception v2

    .line 682
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WalletTaCardNotExistException generateTaCardInfo e = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 685
    goto :goto_0

    .line 683
    :catch_1
    move-exception v2

    .line 684
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WalletTaSystemErrorException generateTaCardInfo e = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 686
    :goto_0
    return-void
.end method

.class Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->onCreate(Landroid/os/Bundle;)V
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

    .line 203
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OnClick: mOprType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$300(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mIsSetAsDefaultCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$400(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mAid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    .line 209
    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$500(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 208
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    iget-boolean v0, v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isNeedRetry:Z

    if-nez v0, :cond_0

    .line 217
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->finish()V

    .line 218
    return-void

    .line 221
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$600(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$700(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v5

    .line 222
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 224
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_unknow_error:I

    invoke-virtual {v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$802(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isNeedRetry:Z

    .line 226
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$900(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)V

    .line 227
    return-void

    .line 229
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$1000(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Lo/egn;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    sget v3, Lcom/huawei/wallet/R$string;->nfc_retrying:I

    invoke-virtual {v2, v3}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$1100(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardStatus()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$1200(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;I)V

    .line 231
    return-void
.end method

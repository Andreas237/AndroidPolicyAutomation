.class Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dsx$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1$1;->this$1:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRequestPermissionsResult([I)V
    .locals 2

    .line 202
    const-string v0, "onRequestPermissionsResult "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 203
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p1, v0

    if-nez v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1$1;->this$1:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V

    goto :goto_0

    .line 211
    :cond_0
    const-string v0, "no CAMERA permission start Camera"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 212
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1$1;->this$1:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_check_camera_permissions:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->showToast(I)V

    .line 214
    :goto_0
    return-void
.end method

.class Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->initKeyBoard(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$2;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 150
    if-eqz p2, :cond_0

    .line 152
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$2;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->showSafeKeyboard(Landroid/view/View;)V

    goto :goto_0

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$2;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->access$000(Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;)Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    move-result-object v0

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->hide()Z

    .line 157
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$2;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->setCursorVisible(Z)V

    .line 159
    :goto_0
    return-void
.end method

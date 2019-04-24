.class Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;
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

    .line 174
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorChanged(I)V
    .locals 5

    .line 179
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v3

    .line 180
    if-ltz p1, :cond_2

    const/4 v0, 0x6

    if-gt p1, v0, :cond_2

    .line 182
    const-string v4, ""

    .line 183
    if-ge p1, v3, :cond_0

    .line 185
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v3, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 187
    :cond_0
    if-le p1, v3, :cond_1

    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "*"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 191
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->setText(Ljava/lang/CharSequence;)V

    .line 192
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->setSelection(I)V

    .line 193
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 195
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$drawable;->huaweipay_cardpay_nextbtn:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->setError(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V

    .line 196
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->access$000(Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;)Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    move-result-object v0

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->hide()Z

    .line 199
    :cond_2
    return-void
.end method

.class Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->initKeyBroardView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V
    .locals 0

    .line 282
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDelKeyClick()V
    .locals 3

    .line 302
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 303
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getSelectionStart()I

    move-result v2

    .line 304
    if-eqz v1, :cond_0

    if-lez v2, :cond_0

    .line 306
    add-int/lit8 v0, v2, -0x1

    invoke-interface {v1, v0, v2}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 308
    :cond_0
    return-void
.end method

.method public onDelKeyLongClick()V
    .locals 3

    .line 313
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/ClearEditText;->setText(Ljava/lang/CharSequence;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->isFocused()Z

    move-result v0

    if-nez v0, :cond_0

    .line 316
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->requestFocus()Z

    .line 317
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 319
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 322
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getError()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 324
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/ClearEditText;->setError(Ljava/lang/CharSequence;)V

    .line 326
    :cond_1
    return-void
.end method

.method public onHideKeyClick()V
    .locals 2

    .line 296
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 297
    return-void
.end method

.method public onNumKeyClick(I)V
    .locals 4

    .line 286
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 287
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getSelectionStart()I

    move-result v3

    .line 288
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 290
    invoke-static {}, Lcom/huawei/nfc/carrera/server/card/model/CaptureMethod;->setMunalMode()V

    .line 291
    return-void
.end method

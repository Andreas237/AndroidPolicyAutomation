.class Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->bankCardNumAddSpace(Landroid/widget/EditText;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

.field final synthetic val$mEditText:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;Landroid/widget/EditText;)V
    .locals 0

    .line 572
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->val$mEditText:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    .line 609
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1100(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 611
    const/4 v2, 0x0

    .line 612
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->val$mEditText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1202(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;I)I

    .line 613
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EditTextUtil  afterTextChanged  location : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1200(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 616
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1300(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V

    .line 618
    const/4 v3, 0x0

    .line 619
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$800(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 621
    rem-int/lit8 v0, v3, 0x5

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 623
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$800(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v3, v1}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;

    .line 624
    add-int/lit8 v2, v2, 0x1

    .line 626
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 628
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "before space num : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$900(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " --- after space num : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 630
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0, v2, v3}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1400(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;II)Ljava/lang/String;

    move-result-object v4

    .line 632
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EditTextUtil afterTextChanged  location : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1200(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 633
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->val$mEditText:Landroid/widget/EditText;

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 634
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->val$mEditText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    .line 635
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EditTextUtil afterTextChanged  location : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1200(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 636
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1200(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I

    move-result v0

    invoke-static {v5, v0}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    .line 638
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1102(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;Z)Z

    .line 641
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 643
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    goto :goto_1

    .line 647
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 649
    :goto_1
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 4

    .line 577
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$702(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;I)I

    .line 578
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$800(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 580
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$800(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$800(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    .line 582
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$902(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;I)I

    .line 583
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 585
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-ne v1, v0, :cond_1

    .line 587
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$908(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I

    .line 583
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 590
    :cond_2
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    .line 595
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1002(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;I)I

    .line 596
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$800(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 598
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$700(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I

    move-result v1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1100(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 600
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1102(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;Z)Z

    .line 601
    return-void

    .line 603
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$1102(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;Z)Z

    .line 604
    return-void
.end method

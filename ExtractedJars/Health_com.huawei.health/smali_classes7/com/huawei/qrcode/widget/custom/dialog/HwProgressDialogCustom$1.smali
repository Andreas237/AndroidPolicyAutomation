.class Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->initContent()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->access$000(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v4

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->access$000(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getMax()I

    move-result v5

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->access$100(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->access$100(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->access$200(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v6, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->access$200(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->access$300(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Ljava/text/NumberFormat;

    move-result-object v0

    if-eqz v0, :cond_1

    int-to-double v0, v4

    int-to-double v2, v5

    div-double v6, v0, v2

    new-instance v8, Landroid/text/SpannableString;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->access$300(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Ljava/text/NumberFormat;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v0, Landroid/text/style/StyleSpan;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v8}, Landroid/text/SpannableString;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x21

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->access$400(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->access$400(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

.class Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

.field final synthetic val$listener:Landroid/content/DialogInterface$OnClickListener;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$2;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    iput-object p2, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$2;->val$listener:Landroid/content/DialogInterface$OnClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$2;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->access$500(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$2;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    invoke-virtual {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->dismiss()V

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$2;->val$listener:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$2;->val$listener:Landroid/content/DialogInterface$OnClickListener;

    iget-object v1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$2;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    :cond_1
    return-void
.end method

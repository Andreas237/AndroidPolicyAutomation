.class Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

.field final synthetic val$listener:Landroid/content/DialogInterface$OnClickListener;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$3;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

    iput-object p2, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$3;->val$listener:Landroid/content/DialogInterface$OnClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$3;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->access$100(Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$3;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

    invoke-virtual {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->dismiss()V

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$3;->val$listener:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$3;->val$listener:Landroid/content/DialogInterface$OnClickListener;

    iget-object v1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$3;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

    const/4 v2, -0x2

    invoke-interface {v0, v1, v2}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    :cond_1
    return-void
.end method

.class Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->resumeMeasureHeight()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 6

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

    invoke-virtual {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/widget/Screen;->getScreenHeight(Landroid/content/Context;)I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x3fe3333333333333L    # 0.6

    mul-double/2addr v0, v2

    double-to-int v4, v0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->access$000(Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v0

    if-le v0, v4, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->access$000(Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iput v4, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->access$000(Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$1;->this$0:Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

    invoke-static {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->access$000(Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    const/4 v0, 0x1

    return v0
.end method

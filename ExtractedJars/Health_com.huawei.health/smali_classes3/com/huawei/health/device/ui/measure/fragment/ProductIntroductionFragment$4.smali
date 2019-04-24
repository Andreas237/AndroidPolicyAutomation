.class Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->stringTruncation(Landroid/widget/TextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

.field final synthetic val$size:[I

.field final synthetic val$textView:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Landroid/widget/TextView;[I)V
    .locals 0

    .line 492
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;->val$textView:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;->val$size:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 6

    .line 495
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;->val$textView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLineCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 496
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/app/Activity;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/WindowManager;

    .line 497
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v4

    .line 498
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;->val$textView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    .line 499
    iget v0, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-ne v4, v0, :cond_0

    .line 500
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;->val$size:[I

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;->val$size:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 501
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;->val$textView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;->val$size:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    int-to-float v1, v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    .line 503
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$1800(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/app/Activity;

    move-result-object v0

    const/high16 v1, 0x42800000    # 64.0f

    invoke-static {v0, v1}, Lo/ahf;->b(Landroid/content/Context;F)I

    move-result v0

    sub-int v0, v4, v0

    iput v0, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 504
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;->val$textView:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 506
    :goto_0
    goto :goto_1

    .line 507
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;->val$textView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 509
    :goto_1
    return-void
.end method

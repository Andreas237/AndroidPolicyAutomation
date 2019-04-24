.class Lcom/microblink/CameraScanActivity$8;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic this$0:Lcom/microblink/CameraScanActivity;


# direct methods
.method constructor <init>(Lcom/microblink/CameraScanActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 6

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$300(Lcom/microblink/CameraScanActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$800(Lcom/microblink/CameraScanActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$900(Lcom/microblink/CameraScanActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    iget-object v1, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v1}, Lcom/microblink/CameraScanActivity;->access$900(Lcom/microblink/CameraScanActivity;)Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v1

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    int-to-float v1, v1

    iget-object v3, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v3}, Lcom/microblink/CameraScanActivity;->access$1000(Lcom/microblink/CameraScanActivity;)Landroid/graphics/RectF;

    move-result-object v3

    iget v3, v3, Landroid/graphics/RectF;->left:F

    mul-float v3, v3, v1

    float-to-int v3, v3

    int-to-float v0, v0

    iget-object v4, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v4}, Lcom/microblink/CameraScanActivity;->access$1000(Lcom/microblink/CameraScanActivity;)Landroid/graphics/RectF;

    move-result-object v4

    iget v4, v4, Landroid/graphics/RectF;->top:F

    mul-float v4, v4, v0

    float-to-int v4, v4

    iget-object v5, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v5}, Lcom/microblink/CameraScanActivity;->access$1000(Lcom/microblink/CameraScanActivity;)Landroid/graphics/RectF;

    move-result-object v5

    iget v5, v5, Landroid/graphics/RectF;->right:F

    mul-float v5, v5, v1

    sub-float/2addr v1, v5

    float-to-int v1, v1

    iget-object v5, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v5}, Lcom/microblink/CameraScanActivity;->access$1000(Lcom/microblink/CameraScanActivity;)Landroid/graphics/RectF;

    move-result-object v5

    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    mul-float v5, v5, v0

    sub-float/2addr v0, v5

    float-to-int v0, v0

    invoke-virtual {v2, v3, v4, v1, v0}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$900(Lcom/microblink/CameraScanActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v1}, Lcom/microblink/CameraScanActivity;->access$300(Lcom/microblink/CameraScanActivity;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$900(Lcom/microblink/CameraScanActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v1}, Lcom/microblink/CameraScanActivity;->access$800(Lcom/microblink/CameraScanActivity;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$8;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$900(Lcom/microblink/CameraScanActivity;)Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-static {v0, v1, p0}, Lcom/microblink/CameraScanActivity;->access$1100(Lcom/microblink/CameraScanActivity;Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

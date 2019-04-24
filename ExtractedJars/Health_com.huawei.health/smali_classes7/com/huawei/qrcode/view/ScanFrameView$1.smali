.class Lcom/huawei/qrcode/view/ScanFrameView$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/view/ScanFrameView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/view/ScanFrameView;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/view/ScanFrameView;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/view/ScanFrameView$1;->this$0:Lcom/huawei/qrcode/view/ScanFrameView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 6

    const/4 v4, 0x0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView$1;->this$0:Lcom/huawei/qrcode/view/ScanFrameView;

    invoke-static {v0}, Lcom/huawei/qrcode/view/ScanFrameView;->access$000(Lcom/huawei/qrcode/view/ScanFrameView;)J

    move-result-wide v0

    long-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/qrcode/view/ScanFrameView$1;->this$0:Lcom/huawei/qrcode/view/ScanFrameView;

    invoke-static {v1}, Lcom/huawei/qrcode/view/ScanFrameView;->access$100(Lcom/huawei/qrcode/view/ScanFrameView;)J

    move-result-wide v1

    long-to-float v1, v1

    div-float/2addr v0, v1

    cmpg-float v0, v4, v0

    if-gez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView$1;->this$0:Lcom/huawei/qrcode/view/ScanFrameView;

    iget-object v1, p0, Lcom/huawei/qrcode/view/ScanFrameView$1;->this$0:Lcom/huawei/qrcode/view/ScanFrameView;

    invoke-static {v1}, Lcom/huawei/qrcode/view/ScanFrameView;->access$100(Lcom/huawei/qrcode/view/ScanFrameView;)J

    move-result-wide v1

    long-to-float v1, v1

    mul-float/2addr v1, v4

    iget-object v2, p0, Lcom/huawei/qrcode/view/ScanFrameView$1;->this$0:Lcom/huawei/qrcode/view/ScanFrameView;

    invoke-static {v2}, Lcom/huawei/qrcode/view/ScanFrameView;->access$000(Lcom/huawei/qrcode/view/ScanFrameView;)J

    move-result-wide v2

    long-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/qrcode/view/ScanFrameView;->access$202(Lcom/huawei/qrcode/view/ScanFrameView;F)F

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView$1;->this$0:Lcom/huawei/qrcode/view/ScanFrameView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/huawei/qrcode/view/ScanFrameView;->access$202(Lcom/huawei/qrcode/view/ScanFrameView;F)F

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView$1;->this$0:Lcom/huawei/qrcode/view/ScanFrameView;

    invoke-virtual {v0}, Lcom/huawei/qrcode/view/ScanFrameView;->invalidate()V

    return-void
.end method

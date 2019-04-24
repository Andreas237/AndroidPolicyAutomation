.class Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->animateIndicatorToPosition(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

.field final synthetic val$startLeft:I

.field final synthetic val$startRight:I

.field final synthetic val$targetLeft:I

.field final synthetic val$targetRight:I


# direct methods
.method constructor <init>(Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;IIII)V
    .locals 0

    .line 353
    iput-object p1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$1;->this$0:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    iput p2, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$1;->val$startLeft:I

    iput p3, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$1;->val$targetLeft:I

    iput p4, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$1;->val$startRight:I

    iput p5, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$1;->val$targetRight:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 5

    .line 356
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result v4

    .line 357
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$1;->this$0:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$1;->val$startLeft:I

    iget v2, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$1;->val$targetLeft:I

    .line 358
    invoke-static {v1, v2, v4}, Lhuawei/widget/AnimationUtils;->lerp(IIF)I

    move-result v1

    iget v2, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$1;->val$startRight:I

    iget v3, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$1;->val$targetRight:I

    .line 359
    invoke-static {v2, v3, v4}, Lhuawei/widget/AnimationUtils;->lerp(IIF)I

    move-result v2

    .line 357
    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->setIndicatorPosition(II)V

    .line 360
    return-void
.end method

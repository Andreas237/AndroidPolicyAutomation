.class Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


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

.field final synthetic val$position:I


# direct methods
.method constructor <init>(Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;I)V
    .locals 0

    .line 362
    iput-object p1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$2;->this$0:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    iput p2, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$2;->val$position:I

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 365
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$2;->this$0:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$2;->val$position:I

    iput v1, v0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedPosition:I

    .line 366
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$2;->this$0:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    const/4 v1, 0x0

    iput v1, v0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectionOffset:F

    .line 367
    return-void
.end method

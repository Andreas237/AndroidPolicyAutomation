.class Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;
.super Ljava/lang/Object;
.source "LocateStoreEngagementView.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->showSmallMap()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 257
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 259
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->access$100(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->left:I

    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->access$100(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->top:I

    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 261
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->access$100(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->right:I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    invoke-static {v1}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->access$100(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 262
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->access$100(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    invoke-static {v1}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->access$100(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 264
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->access$200(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 265
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->access$200(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->requestLayout()V

    .line 267
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->getContext()Landroid/content/Context;

    move-result-object p1

    const/high16 v0, 0x10a0000

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->flRoot:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

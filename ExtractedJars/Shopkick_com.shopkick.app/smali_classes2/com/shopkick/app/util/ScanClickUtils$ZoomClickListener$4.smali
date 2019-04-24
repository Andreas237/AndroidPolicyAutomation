.class Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$4;
.super Ljava/lang/Object;
.source "ScanClickUtils.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->setImagePostDelayed(Lcom/github/chrisbanes/photoview/PhotoView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

.field final synthetic val$imageView:Lcom/github/chrisbanes/photoview/PhotoView;


# direct methods
.method constructor <init>(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;Lcom/github/chrisbanes/photoview/PhotoView;)V
    .locals 0

    .line 406
    iput-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$4;->this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    iput-object p2, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$4;->val$imageView:Lcom/github/chrisbanes/photoview/PhotoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 408
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$4;->val$imageView:Lcom/github/chrisbanes/photoview/PhotoView;

    invoke-virtual {v0}, Lcom/github/chrisbanes/photoview/PhotoView;->getAttacher()Lcom/github/chrisbanes/photoview/PhotoViewAttacher;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 409
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$4;->val$imageView:Lcom/github/chrisbanes/photoview/PhotoView;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/github/chrisbanes/photoview/PhotoView;->setScale(F)V

    :cond_0
    return-void
.end method

.class Lcom/rt/mobile/english/ui/ArticleFragment$4;
.super Ljava/lang/Object;
.source "ArticleFragment.java"

# interfaces
.implements Lcom/nineoldandroids/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ArticleFragment;->moveToolbar(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/ArticleFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ArticleFragment;)V
    .locals 0

    .line 293
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$4;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Lcom/nineoldandroids/animation/ValueAnimator;)V
    .locals 2

    .line 296
    invoke-virtual {p1}, Lcom/nineoldandroids/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 297
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment$4;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/ArticleFragment;->access$400(Lcom/rt/mobile/english/ui/ArticleFragment;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/nineoldandroids/view/ViewHelper;->setTranslationY(Landroid/view/View;F)V

    .line 298
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment$4;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/ui/ArticleActivity;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getContainerActivity()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/nineoldandroids/view/ViewHelper;->setTranslationY(Landroid/view/View;F)V

    .line 299
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment$4;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 300
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$4;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-virtual {v1}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/rt/mobile/english/ui/ArticleActivity;

    invoke-virtual {v1}, Lcom/rt/mobile/english/ui/ArticleActivity;->getContainerActivity()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    neg-float p1, p1

    float-to-int p1, p1

    .line 301
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    add-int/2addr p1, v0

    iput p1, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 302
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$4;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/ui/ArticleActivity;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/ArticleActivity;->getContainerActivity()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method

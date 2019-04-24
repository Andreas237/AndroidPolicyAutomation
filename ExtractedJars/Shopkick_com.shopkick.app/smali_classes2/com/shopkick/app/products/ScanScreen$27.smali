.class Lcom/shopkick/app/products/ScanScreen$27;
.super Landroid/animation/AnimatorListenerAdapter;
.source "ScanScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/ScanScreen;->reportProductUnavailability()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/ScanScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/ScanScreen;)V
    .locals 0

    .line 1755
    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen$27;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1758
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 1759
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$27;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {p1}, Lcom/shopkick/app/products/ScanScreen;->access$800(Lcom/shopkick/app/products/ScanScreen;)Landroid/widget/RelativeLayout;

    move-result-object p1

    if-eqz p1, :cond_0

    const v0, 0x7f090549

    .line 1762
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 1763
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-wide/16 v0, 0xbb8

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_0
    return-void
.end method

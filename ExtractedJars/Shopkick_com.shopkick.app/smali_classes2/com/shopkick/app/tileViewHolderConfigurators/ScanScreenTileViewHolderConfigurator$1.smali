.class Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "ScanScreenTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->reportProductUnavailability(Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;

.field final synthetic val$reportedTooltip:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;Landroid/view/View;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator$1;->val$reportedTooltip:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 184
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 185
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator$1;->val$reportedTooltip:Landroid/view/View;

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

    return-void
.end method

.class Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$WalkinMessageAnimatorListener;
.super Ljava/lang/Object;
.source "WalkinAnimationController.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "WalkinMessageAnimatorListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)V
    .locals 0

    .line 607
    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$WalkinMessageAnimatorListener;->this$0:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$1;)V
    .locals 0

    .line 607
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$WalkinMessageAnimatorListener;-><init>(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 617
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$WalkinMessageAnimatorListener;->this$0:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-static {v0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->access$100(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const v1, 0x7f0906f0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 619
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$WalkinMessageAnimatorListener;->this$0:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-static {v1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->access$100(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)Landroid/widget/RelativeLayout;

    move-result-object v1

    const v2, 0x7f0904a1

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKTextView;

    .line 621
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$WalkinMessageAnimatorListener;->this$0:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-static {v2}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->access$200(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    if-ne p1, v2, :cond_0

    const/16 p1, 0x8

    .line 623
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x3

    .line 625
    invoke-virtual {v1, p1}, Lcom/shopkick/app/widget/SKTextView;->setMaxLines(I)V

    const/16 p1, 0x14

    const/4 v0, 0x0

    .line 626
    invoke-virtual {v1, v0, p1, v0, v0}, Lcom/shopkick/app/widget/SKTextView;->setPadding(IIII)V

    const p1, 0x7f11075d

    .line 628
    invoke-virtual {v1, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    goto :goto_0

    .line 629
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$WalkinMessageAnimatorListener;->this$0:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-static {v0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->access$300(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const p1, 0x7f11075a

    .line 630
    invoke-virtual {v1, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

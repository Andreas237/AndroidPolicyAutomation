.class public Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AnimateListener"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

.field private b:I


# direct methods
.method public constructor <init>(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;I)V
    .locals 0

    .line 902
    iput-object p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 903
    iput p2, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->b:I

    .line 904
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 909
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 911
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->i:Z

    .line 912
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    iget-object v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;

    if-eqz v0, :cond_1

    .line 914
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    iget-object v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    iget-boolean v1, v1, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->k:Z

    invoke-interface {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;->b(Z)V

    goto :goto_0

    .line 920
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    iget-object v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;

    if-eqz v0, :cond_1

    .line 922
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    iget-object v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->b:I

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    iget-boolean v2, v2, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->k:Z

    invoke-interface {v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;->a(IZ)V

    .line 925
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    iget-object v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 926
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 928
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 3

    .line 933
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 934
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->i:Z

    .line 935
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    iget-object v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;

    if-eqz v0, :cond_0

    .line 937
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    iget-object v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->b:I

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    iget-boolean v2, v2, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->k:Z

    invoke-interface {v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;->c(IZ)V

    .line 939
    :cond_0
    return-void
.end method

.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 944
    const-string v0, "translationY"

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 945
    return-void

    .line 947
    :cond_0
    const-string v0, "translationY"

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v3

    .line 948
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    iget-object v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 950
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    iget-object v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->b:I

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;->a:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    iget-boolean v2, v2, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->k:Z

    invoke-interface {v0, v1, v3, v2}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;->e(IFZ)V

    .line 952
    :cond_1
    return-void
.end method

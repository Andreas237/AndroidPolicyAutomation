.class final Lcom/huawei/wallet/ui/carddisplay/AnimUtil$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/carddisplay/AnimUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:I

.field final synthetic e:Landroid/view/View;


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 5

    .line 351
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 352
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil$1;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 353
    iput v3, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 354
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil$1;->e:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 355
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil$1;->c:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil$1;->a:I

    if-le v0, v1, :cond_0

    .line 357
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil$1;->e:Landroid/view/View;

    int-to-float v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil$1;->c:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    .line 361
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil$1;->e:Landroid/view/View;

    int-to-float v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil$1;->a:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 363
    :goto_0
    return-void
.end method

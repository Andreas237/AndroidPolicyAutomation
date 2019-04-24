.class public Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;
.super Lcom/huawei/wallet/ui/carddisplay/CardLayout;
.source "SourceFile"


# instance fields
.field private q:I

.field private u:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 7

    .line 55
    invoke-virtual {p0, p1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 56
    const/4 v4, 0x0

    .line 57
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->q:I

    if-ge v0, v1, :cond_0

    .line 60
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->q:I

    if-ge p1, v0, :cond_1

    .line 62
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->r:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->l:I

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    int-to-float v5, v0

    .line 63
    invoke-virtual {v3}, Landroid/view/View;->getY()F

    move-result v0

    const/16 v1, 0x32

    invoke-static {v3, v0, v5, v1}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e(Landroid/view/View;FFI)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 64
    iput p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    .line 65
    goto :goto_0

    .line 70
    :cond_0
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->q:I

    if-lt p1, v0, :cond_1

    .line 73
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->q:I

    sub-int v5, v0, v1

    .line 74
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->u:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->l:I

    mul-int/2addr v1, v5

    add-int/2addr v0, v1

    int-to-float v6, v0

    .line 75
    invoke-virtual {v3}, Landroid/view/View;->getY()F

    move-result v0

    const/16 v1, 0x32

    invoke-static {v3, v0, v6, v1}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e(Landroid/view/View;FFI)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 76
    iput p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    .line 80
    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    .line 82
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->n:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v4, v0}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 83
    invoke-virtual {v4}, Landroid/animation/ObjectAnimator;->start()V

    .line 86
    :cond_2
    return-void
.end method

.method protected b()V
    .locals 7

    .line 91
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 92
    if-nez v3, :cond_0

    .line 94
    return-void

    .line 97
    :cond_0
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->q:I

    if-ge v0, v1, :cond_1

    .line 99
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->r:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->l:I

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    int-to-float v4, v0

    .line 100
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->i:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->k:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/16 v1, 0x32

    invoke-static {v3, v0, v4, v1}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e(Landroid/view/View;FFI)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 101
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->n:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v5, v0}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 102
    invoke-virtual {v5}, Landroid/animation/ObjectAnimator;->start()V

    .line 103
    goto :goto_0

    .line 106
    :cond_1
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->q:I

    sub-int v4, v0, v1

    .line 107
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->u:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->l:I

    mul-int/2addr v1, v4

    add-int/2addr v0, v1

    int-to-float v5, v0

    .line 108
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->i:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->k:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/16 v1, 0x32

    invoke-static {v3, v0, v5, v1}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e(Landroid/view/View;FFI)Landroid/animation/ObjectAnimator;

    move-result-object v6

    .line 109
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->n:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v6, v0}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 110
    invoke-virtual {v6}, Landroid/animation/ObjectAnimator;->start()V

    .line 112
    :goto_0
    return-void
.end method

.method protected d(III)I
    .locals 5

    .line 119
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_3

    .line 121
    invoke-virtual {p0, v3}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 123
    add-int/lit8 v0, p1, -0x1

    if-eq v3, v0, :cond_0

    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->q:I

    add-int/lit8 v0, v0, -0x1

    if-ne v3, v0, :cond_1

    .line 125
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v2

    goto :goto_1

    .line 129
    :cond_1
    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->l:I

    .line 132
    :goto_1
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0, v4, p2, p3, v2}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->e(Landroid/view/View;III)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 134
    return v3

    .line 119
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 137
    :cond_3
    const/4 v0, -0x1

    return v0
.end method

.method protected e(I)V
    .locals 7

    .line 144
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->m:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    sget-object v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->d:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    if-ne v0, v1, :cond_2

    .line 146
    add-int/lit8 v3, p1, 0x1

    .line 147
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->getChildCount()I

    move-result v0

    if-lt v3, v0, :cond_0

    .line 149
    return-void

    .line 151
    :cond_0
    invoke-virtual {p0, p1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 153
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->q:I

    if-ge v0, v1, :cond_1

    .line 156
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->r:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->l:I

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    int-to-float v6, v0

    .line 157
    invoke-virtual {v4}, Landroid/view/View;->getY()F

    move-result v0

    const/16 v1, 0x32

    invoke-static {v4, v0, v6, v1}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e(Landroid/view/View;FFI)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 158
    goto :goto_0

    .line 162
    :cond_1
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->u:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->q:I

    sub-int/2addr v1, v2

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->l:I

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    int-to-float v6, v0

    .line 163
    invoke-virtual {v4}, Landroid/view/View;->getY()F

    move-result v0

    const/16 v1, 0x32

    invoke-static {v4, v0, v6, v1}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e(Landroid/view/View;FFI)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 165
    :goto_0
    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;

    invoke-direct {v0, p0, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardLayout;I)V

    invoke-virtual {v5, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->n:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v5, v0}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 167
    invoke-virtual {v5}, Landroid/animation/ObjectAnimator;->start()V

    .line 168
    goto :goto_2

    .line 172
    :cond_2
    add-int/lit8 v3, p1, -0x1

    .line 173
    if-gez v3, :cond_3

    .line 175
    return-void

    .line 177
    :cond_3
    invoke-virtual {p0, p1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 179
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->q:I

    if-ge v0, v1, :cond_4

    .line 182
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->r:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->l:I

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    int-to-float v6, v0

    .line 183
    invoke-virtual {v4}, Landroid/view/View;->getY()F

    move-result v0

    const/16 v1, 0x32

    invoke-static {v4, v0, v6, v1}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e(Landroid/view/View;FFI)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 184
    goto :goto_1

    .line 188
    :cond_4
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->u:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->b:I

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->q:I

    sub-int/2addr v1, v2

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->l:I

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    int-to-float v6, v0

    .line 189
    invoke-virtual {v4}, Landroid/view/View;->getY()F

    move-result v0

    const/16 v1, 0x32

    invoke-static {v4, v0, v6, v1}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e(Landroid/view/View;FFI)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 191
    :goto_1
    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;

    invoke-direct {v0, p0, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardLayout;I)V

    invoke-virtual {v5, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 192
    invoke-virtual {v5}, Landroid/animation/ObjectAnimator;->start()V

    .line 194
    :goto_2
    return-void
.end method

.method public setInitBottomCardY(I)V
    .locals 0

    .line 48
    iput p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->u:I

    .line 49
    return-void
.end method

.method public setTopCardsCount(I)V
    .locals 1

    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->q:I

    .line 44
    return-void
.end method

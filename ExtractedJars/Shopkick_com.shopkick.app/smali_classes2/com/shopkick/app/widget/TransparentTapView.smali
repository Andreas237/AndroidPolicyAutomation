.class public Lcom/shopkick/app/widget/TransparentTapView;
.super Landroid/view/View;
.source "TransparentTapView.java"


# instance fields
.field focusedColor:I

.field pressedColor:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/widget/TransparentTapView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/widget/TransparentTapView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f06014d

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    iput p2, p0, Lcom/shopkick/app/widget/TransparentTapView;->pressedColor:I

    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/widget/TransparentTapView;->focusedColor:I

    return-void
.end method


# virtual methods
.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 3

    .line 32
    invoke-super {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p1, :cond_0

    .line 34
    new-instance p1, Lcom/shopkick/app/graphics/ButtonDrawable;

    invoke-direct {p1}, Lcom/shopkick/app/graphics/ButtonDrawable;-><init>()V

    const/4 v0, 0x0

    .line 35
    iget v1, p0, Lcom/shopkick/app/widget/TransparentTapView;->pressedColor:I

    iget v2, p0, Lcom/shopkick/app/widget/TransparentTapView;->focusedColor:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/shopkick/app/graphics/ButtonDrawable;->setColors(III)V

    .line 36
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/TransparentTapView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 38
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/TransparentTapView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

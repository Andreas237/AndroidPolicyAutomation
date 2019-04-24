.class public Lcom/ibotta/android/view/drawable/IconStateDrawable;
.super Landroid/graphics/drawable/LayerDrawable;
.source "IconStateDrawable.java"


# direct methods
.method public constructor <init>([Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public isStateful()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected onStateChange([I)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 25
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v0, v1, :cond_2

    aget v4, p1, v0

    const v5, 0x101009e

    const/4 v6, 0x1

    if-ne v4, v5, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const v5, 0x10100a7

    if-ne v4, v5, :cond_1

    const/4 v3, 0x1

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    const/16 v1, 0x80

    if-nez v0, :cond_4

    .line 35
    invoke-virtual {p0, v1}, Lcom/ibotta/android/view/drawable/IconStateDrawable;->setAlpha(I)V

    goto :goto_3

    :cond_4
    if-eqz v3, :cond_5

    .line 37
    invoke-virtual {p0, v1}, Lcom/ibotta/android/view/drawable/IconStateDrawable;->setAlpha(I)V

    goto :goto_3

    :cond_5
    const/16 v0, 0xff

    .line 39
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/drawable/IconStateDrawable;->setAlpha(I)V

    .line 42
    :goto_3
    invoke-super {p0, p1}, Landroid/graphics/drawable/LayerDrawable;->onStateChange([I)Z

    move-result p1

    return p1
.end method

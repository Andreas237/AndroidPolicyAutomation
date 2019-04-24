.class public Lcom/shopkick/app/widget/RoundImageView;
.super Landroid/support/v7/widget/AppCompatImageView;
.source "RoundImageView.java"


# instance fields
.field private radius:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Landroid/support/v7/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 31
    new-instance v0, Lcom/shopkick/app/graphics/BitmapHelpers;

    invoke-virtual {p0}, Lcom/shopkick/app/widget/RoundImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/graphics/BitmapHelpers;-><init>(Landroid/content/Context;)V

    iget v1, p0, Lcom/shopkick/app/widget/RoundImageView;->radius:I

    invoke-virtual {v0, p1, v1}, Lcom/shopkick/app/graphics/BitmapHelpers;->getRoundBitmapWithBorder(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 32
    invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public setRadius(I)V
    .locals 0

    .line 26
    iput p1, p0, Lcom/shopkick/app/widget/RoundImageView;->radius:I

    return-void
.end method

.class public Lcom/shopkick/app/graphics/ButtonDrawableFactory;
.super Ljava/lang/Object;
.source "ButtonDrawableFactory.java"


# instance fields
.field focusedColor:I

.field pressedColor:I

.field private resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/shopkick/app/graphics/ButtonDrawableFactory;->resources:Landroid/content/res/Resources;

    const v0, 0x7f0600c8

    .line 18
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iput v1, p0, Lcom/shopkick/app/graphics/ButtonDrawableFactory;->pressedColor:I

    .line 19
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/graphics/ButtonDrawableFactory;->focusedColor:I

    return-void
.end method


# virtual methods
.method public createButtonDrawable(I)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 33
    new-instance v0, Lcom/shopkick/app/graphics/ButtonDrawable;

    invoke-direct {v0}, Lcom/shopkick/app/graphics/ButtonDrawable;-><init>()V

    .line 35
    iget v1, p0, Lcom/shopkick/app/graphics/ButtonDrawableFactory;->pressedColor:I

    iget v2, p0, Lcom/shopkick/app/graphics/ButtonDrawableFactory;->focusedColor:I

    invoke-virtual {v0, p1, v1, v2}, Lcom/shopkick/app/graphics/ButtonDrawable;->setColors(III)V

    return-object v0
.end method

.method public createButtonDrawable(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 23
    new-instance v0, Lcom/shopkick/app/graphics/ButtonDrawable;

    invoke-direct {v0}, Lcom/shopkick/app/graphics/ButtonDrawable;-><init>()V

    .line 25
    iget-object v1, p0, Lcom/shopkick/app/graphics/ButtonDrawableFactory;->resources:Landroid/content/res/Resources;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/graphics/ButtonDrawable;->setBaseBitmap(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 26
    new-instance p1, Landroid/graphics/PorterDuffColorFilter;

    iget v1, p0, Lcom/shopkick/app/graphics/ButtonDrawableFactory;->pressedColor:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p1, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, p1}, Lcom/shopkick/app/graphics/ButtonDrawable;->setPressedColorFilter(Landroid/graphics/ColorFilter;)V

    .line 27
    new-instance p1, Landroid/graphics/PorterDuffColorFilter;

    iget v1, p0, Lcom/shopkick/app/graphics/ButtonDrawableFactory;->focusedColor:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p1, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, p1}, Lcom/shopkick/app/graphics/ButtonDrawable;->setFocusedColorFilter(Landroid/graphics/ColorFilter;)V

    return-object v0
.end method

.class public Lcom/shopkick/app/graphics/ButtonDrawable;
.super Landroid/graphics/drawable/StateListDrawable;
.source "ButtonDrawable.java"


# static fields
.field private static final focusedStateSpec:[I

.field private static final plainStateSpec:[I

.field private static final pressedStateSpec:[I


# instance fields
.field private bitmapAlreadySet:Z

.field private focusedColorFilter:Landroid/graphics/ColorFilter;

.field private pressedColorFilter:Landroid/graphics/ColorFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    .line 13
    new-array v1, v0, [I

    const/4 v2, 0x0

    const v3, 0x101009c

    aput v3, v1, v2

    sput-object v1, Lcom/shopkick/app/graphics/ButtonDrawable;->focusedStateSpec:[I

    .line 14
    new-array v0, v0, [I

    const v1, 0x10100a7

    aput v1, v0, v2

    sput-object v0, Lcom/shopkick/app/graphics/ButtonDrawable;->pressedStateSpec:[I

    const/4 v0, 0x2

    .line 15
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/shopkick/app/graphics/ButtonDrawable;->plainStateSpec:[I

    return-void

    nop

    :array_0
    .array-data 4
        -0x101009c
        -0x10100a7
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    return-void
.end method


# virtual methods
.method protected onStateChange([I)Z
    .locals 3

    .line 61
    invoke-super {p0, p1}, Landroid/graphics/drawable/StateListDrawable;->onStateChange([I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 63
    invoke-virtual {p0}, Lcom/shopkick/app/graphics/ButtonDrawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 65
    iget-object v2, p0, Lcom/shopkick/app/graphics/ButtonDrawable;->pressedColorFilter:Landroid/graphics/ColorFilter;

    if-eqz v2, :cond_0

    sget-object v2, Lcom/shopkick/app/graphics/ButtonDrawable;->pressedStateSpec:[I

    invoke-static {v2, p1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 66
    iget-object p1, p0, Lcom/shopkick/app/graphics/ButtonDrawable;->pressedColorFilter:Landroid/graphics/ColorFilter;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_0

    .line 67
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/graphics/ButtonDrawable;->focusedColorFilter:Landroid/graphics/ColorFilter;

    if-eqz v2, :cond_1

    sget-object v2, Lcom/shopkick/app/graphics/ButtonDrawable;->focusedStateSpec:[I

    invoke-static {v2, p1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 68
    iget-object p1, p0, Lcom/shopkick/app/graphics/ButtonDrawable;->focusedColorFilter:Landroid/graphics/ColorFilter;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_0

    .line 69
    :cond_1
    sget-object v2, Lcom/shopkick/app/graphics/ButtonDrawable;->plainStateSpec:[I

    invoke-static {v2, p1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 70
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    :cond_2
    :goto_0
    return v0
.end method

.method public setBaseBitmap(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    .locals 4

    .line 22
    iget-boolean v0, p0, Lcom/shopkick/app/graphics/ButtonDrawable;->bitmapAlreadySet:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 26
    new-array v1, v0, [I

    const v2, 0x10100a7

    const/4 v3, 0x0

    aput v2, v1, v3

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v2, p1, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v1, v2}, Lcom/shopkick/app/graphics/ButtonDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 27
    new-array v1, v0, [I

    const v2, 0x101009c

    aput v2, v1, v3

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v2, p1, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v1, v2}, Lcom/shopkick/app/graphics/ButtonDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x2

    .line 28
    new-array v1, v1, [I

    fill-array-data v1, :array_0

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v2, p1, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v1, v2}, Lcom/shopkick/app/graphics/ButtonDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 30
    iput-boolean v0, p0, Lcom/shopkick/app/graphics/ButtonDrawable;->bitmapAlreadySet:Z

    return-void

    :array_0
    .array-data 4
        -0x101009c
        -0x10100a7
    .end array-data
.end method

.method public setBaseDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 34
    iget-boolean v0, p0, Lcom/shopkick/app/graphics/ButtonDrawable;->bitmapAlreadySet:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 38
    new-array v1, v0, [I

    const v2, 0x10100a7

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-virtual {p0, v1, p1}, Lcom/shopkick/app/graphics/ButtonDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 39
    new-array v1, v0, [I

    const v2, 0x101009c

    aput v2, v1, v3

    invoke-virtual {p0, v1, p1}, Lcom/shopkick/app/graphics/ButtonDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x2

    .line 40
    new-array v1, v1, [I

    fill-array-data v1, :array_0

    invoke-virtual {p0, v1, p1}, Lcom/shopkick/app/graphics/ButtonDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 42
    iput-boolean v0, p0, Lcom/shopkick/app/graphics/ButtonDrawable;->bitmapAlreadySet:Z

    return-void

    nop

    :array_0
    .array-data 4
        -0x101009c
        -0x10100a7
    .end array-data
.end method

.method public setColors(III)V
    .locals 4

    const/4 v0, 0x1

    .line 46
    new-array v1, v0, [I

    const/4 v2, 0x0

    const v3, 0x10100a7

    aput v3, v1, v2

    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v3, p2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v1, v3}, Lcom/shopkick/app/graphics/ButtonDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 47
    new-array p2, v0, [I

    const v0, 0x101009c

    aput v0, p2, v2

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, p2, v0}, Lcom/shopkick/app/graphics/ButtonDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    const/4 p2, 0x2

    .line 48
    new-array p2, p2, [I

    fill-array-data p2, :array_0

    new-instance p3, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {p3, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, p2, p3}, Lcom/shopkick/app/graphics/ButtonDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-void

    nop

    :array_0
    .array-data 4
        -0x101009c
        -0x10100a7
    .end array-data
.end method

.method public setFocusedColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/shopkick/app/graphics/ButtonDrawable;->focusedColorFilter:Landroid/graphics/ColorFilter;

    return-void
.end method

.method public setPressedColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/shopkick/app/graphics/ButtonDrawable;->pressedColorFilter:Landroid/graphics/ColorFilter;

    return-void
.end method

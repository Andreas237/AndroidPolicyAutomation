.class public Lcom/shopkick/app/widget/SKButton;
.super Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;
.source "SKButton.java"

# interfaces
.implements Lcom/shopkick/app/logging/IUserEventView;


# static fields
.field private static final BUTTON_TEXT_DEFAULT_CAPITALIZE:Z = true

.field private static final BUTTON_TEXT_DEFAULT_COLOR:I = -0x1000000

.field private static final BUTTON_TEXT_DEFAULT_MAX_LINES:I = 0x1

.field private static final BUTTON_TEXT_DEFAULT_SIZE:I = 0xd


# instance fields
.field private buttonIcon:Landroid/widget/ImageView;

.field private buttonImage:Landroid/view/View;

.field private buttonTextView:Landroid/widget/TextView;

.field private capitalize:Z

.field private core:Lcom/shopkick/app/logging/UserEventViewCore;

.field private focusedColor:I

.field private pressedColor:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/widget/SKButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 61
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/widget/SKButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 66
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/widget/SKButton;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private createButtonDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 271
    new-instance v0, Lcom/shopkick/app/graphics/ButtonDrawable;

    invoke-direct {v0}, Lcom/shopkick/app/graphics/ButtonDrawable;-><init>()V

    .line 272
    instance-of v1, p1, Landroid/graphics/drawable/ShapeDrawable;

    if-nez v1, :cond_3

    instance-of v1, p1, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v1, :cond_0

    goto :goto_1

    .line 282
    :cond_0
    instance-of v1, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_1

    .line 283
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKButton;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/graphics/ButtonDrawable;->setBaseBitmap(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 284
    :cond_1
    instance-of v1, p1, Landroid/graphics/drawable/NinePatchDrawable;

    if-eqz v1, :cond_2

    .line 285
    invoke-virtual {v0, p1}, Lcom/shopkick/app/graphics/ButtonDrawable;->setBaseDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 287
    :cond_2
    :goto_0
    new-instance p1, Landroid/graphics/PorterDuffColorFilter;

    iget v1, p0, Lcom/shopkick/app/widget/SKButton;->pressedColor:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p1, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, p1}, Lcom/shopkick/app/graphics/ButtonDrawable;->setPressedColorFilter(Landroid/graphics/ColorFilter;)V

    .line 288
    new-instance p1, Landroid/graphics/PorterDuffColorFilter;

    iget v1, p0, Lcom/shopkick/app/widget/SKButton;->focusedColor:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p1, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, p1}, Lcom/shopkick/app/graphics/ButtonDrawable;->setFocusedColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_2

    .line 273
    :cond_3
    :goto_1
    invoke-virtual {v0, p1}, Lcom/shopkick/app/graphics/ButtonDrawable;->setBaseDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 p1, 0x14

    .line 274
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    .line 279
    new-instance v1, Landroid/graphics/ColorMatrixColorFilter;

    invoke-direct {v1, p1}, Landroid/graphics/ColorMatrixColorFilter;-><init>([F)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/graphics/ButtonDrawable;->setPressedColorFilter(Landroid/graphics/ColorFilter;)V

    .line 280
    new-instance v1, Landroid/graphics/ColorMatrixColorFilter;

    invoke-direct {v1, p1}, Landroid/graphics/ColorMatrixColorFilter;-><init>([F)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/graphics/ButtonDrawable;->setFocusedColorFilter(Landroid/graphics/ColorFilter;)V

    :goto_2
    return-object v0

    nop

    :array_0
    .array-data 4
        0x3f333333    # 0.7f
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3f333333    # 0.7f
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3f333333    # 0.7f
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3f333333    # 0.7f
        0x0
    .end array-data
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 70
    new-instance v0, Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-direct {v0, p0}, Lcom/shopkick/app/logging/UserEventViewCore;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/shopkick/app/widget/SKButton;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    .line 72
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0600c8

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/widget/SKButton;->pressedColor:I

    .line 73
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/widget/SKButton;->focusedColor:I

    .line 75
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x1

    const v2, 0x7f0c01b7

    .line 76
    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 79
    sget-object v0, Lcom/shopkick/app/R$styleable;->ForegroundView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v2, 0x0

    .line 82
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 83
    invoke-virtual {p0, v3}, Lcom/shopkick/app/widget/SKButton;->setForegroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 84
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 86
    sget-object v0, Lcom/shopkick/app/R$styleable;->SKButton:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const p2, 0x7f0900bd

    .line 89
    invoke-virtual {p0, p2}, Lcom/shopkick/app/widget/SKButton;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/widget/SKButton;->buttonImage:Landroid/view/View;

    const/4 p2, 0x4

    .line 90
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 91
    invoke-virtual {p0, p2}, Lcom/shopkick/app/widget/SKButton;->setButtonImage(Landroid/graphics/drawable/Drawable;)V

    const p2, 0x7f0900c2

    .line 94
    invoke-virtual {p0, p2}, Lcom/shopkick/app/widget/SKButton;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    const/16 p2, 0x8

    .line 95
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/shopkick/app/widget/SKButton;->capitalize:Z

    const/4 p2, 0x7

    .line 96
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 97
    invoke-virtual {p0, p2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    const/16 p2, 0xd

    const/16 v0, 0xc

    .line 99
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 100
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonTextSize(I)V

    const/16 v0, 0xf

    .line 102
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 103
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonTextMaxLines(I)V

    const/16 v0, 0x9

    const/high16 v3, -0x1000000

    .line 105
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    .line 106
    invoke-virtual {p0, v3}, Lcom/shopkick/app/widget/SKButton;->setButtonTextColor(I)V

    const/16 v3, 0x11

    .line 108
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 109
    invoke-virtual {p0, v3}, Lcom/shopkick/app/widget/SKButton;->setDefaultFont(I)Z

    const/16 v3, 0xb

    .line 111
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    .line 112
    iget-object v4, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v4, v5, v5, v5, v3}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    const/4 v3, 0x5

    .line 115
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    const v4, 0x7f0900bc

    .line 116
    invoke-virtual {p0, v4}, Lcom/shopkick/app/widget/SKButton;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    iput-object v5, p0, Lcom/shopkick/app/widget/SKButton;->buttonIcon:Landroid/widget/ImageView;

    .line 117
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v3, :cond_0

    .line 118
    invoke-direct {p0, v5}, Lcom/shopkick/app/widget/SKButton;->createButtonDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    :cond_0
    invoke-virtual {p0, v5}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(Landroid/graphics/drawable/Drawable;)V

    const/4 v3, 0x3

    .line 120
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    if-lez v3, :cond_1

    .line 122
    iget-object v5, p0, Lcom/shopkick/app/widget/SKButton;->buttonIcon:Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iput v3, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 124
    :cond_1
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    if-lez v3, :cond_2

    .line 126
    iget-object v5, p0, Lcom/shopkick/app/widget/SKButton;->buttonIcon:Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iput v3, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 129
    :cond_2
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    if-lez v3, :cond_3

    .line 131
    iget-object v5, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iput v3, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    :cond_3
    const/16 v3, 0xe

    .line 134
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    if-lez v3, :cond_4

    .line 136
    iget-object v5, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v5, v3, v2, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    :cond_4
    const/16 v3, 0x10

    .line 139
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    if-lez v3, :cond_5

    .line 141
    iget-object v5, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    invoke-virtual {v5, v2, v2, v3, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_5
    const/16 v3, 0xa

    .line 144
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    if-lez v3, :cond_6

    .line 146
    iget-object v5, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iput v3, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_6
    const/4 v3, 0x6

    .line 149
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    const v1, 0x7f0900bb

    .line 152
    invoke-virtual {p0, v1}, Lcom/shopkick/app/widget/SKButton;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 153
    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    iput v3, v1, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 156
    iget-object v1, p0, Lcom/shopkick/app/widget/SKButton;->buttonIcon:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/4 v0, 0x2

    .line 159
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    .line 160
    iget-object v1, p0, Lcom/shopkick/app/widget/SKButton;->buttonIcon:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 163
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, p2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_0

    .line 165
    :cond_7
    iget-object p2, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p2, v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 168
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public addImpressionConstraintKey(Ljava/lang/String;)V
    .locals 1

    .line 362
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventViewCore;->addImpressionConstraintKey(Ljava/lang/String;)V

    return-void
.end method

.method public getButtonTextView()Landroid/widget/TextView;
    .locals 1

    .line 340
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 390
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->triggerMoatTouch()V

    .line 391
    invoke-super {p0, p1}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public performClick()Z
    .locals 1

    .line 382
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->recordPotentialScreenTransitionPerformClick()V

    .line 383
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->tryTriggeringEvent()V

    .line 384
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->triggerMoatClick()V

    .line 385
    invoke-super {p0}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->performClick()Z

    move-result v0

    return v0
.end method

.method public removeImpressionConstraintKey(Ljava/lang/String;)V
    .locals 1

    .line 367
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventViewCore;->removeImpressionConstraintKey(Ljava/lang/String;)V

    return-void
.end method

.method public setButtonIcon(I)V
    .locals 1

    .line 250
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 255
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonIcon:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 256
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 257
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonIcon:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-gtz v0, :cond_0

    .line 258
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonIcon:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 260
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonIcon:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-gtz v0, :cond_2

    .line 261
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonIcon:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_0

    .line 264
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/widget/SKButton;->buttonIcon:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 265
    iget-object p1, p0, Lcom/shopkick/app/widget/SKButton;->buttonIcon:Landroid/widget/ImageView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public setButtonImage(I)V
    .locals 2

    .line 172
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 173
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKButton;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonImage(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonImage(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 195
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKButton;->getForegroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 196
    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/SKButton;->createButtonDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 197
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonImage:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 199
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonImage:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method public setButtonResource(I)V
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonImage:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 191
    iget-object p1, p0, Lcom/shopkick/app/widget/SKButton;->buttonImage:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/SKButton;->setButtonImage(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonSize(I)V
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonImage:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonImage:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    return-void
.end method

.method public setButtonText(I)V
    .locals 1

    .line 209
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    return-void
.end method

.method public setButtonText(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    iget-boolean v1, p0, Lcom/shopkick/app/widget/SKButton;->capitalize:Z

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 225
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public setButtonTextColor(I)V
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public setButtonTextMaxLines(I)V
    .locals 2

    .line 213
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    return-void
.end method

.method public setButtonTextSize(I)V
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    return-void
.end method

.method public setButton_text(Ljava/lang/String;)V
    .locals 0

    .line 230
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    return-void
.end method

.method public setDefaultFont(I)Z
    .locals 2

    .line 315
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    instance-of v1, v0, Lcom/shopkick/app/widget/SKTextView;

    if-eqz v1, :cond_0

    .line 319
    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    move-result p1

    return p1

    .line 323
    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 328
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/widget/SKTypeface;->getDefaultTypeface(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 330
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public setForegroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 180
    new-array p1, p1, [I

    const v0, 0x7f040210

    const/4 v1, 0x0

    aput v0, p1, v1

    .line 181
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 182
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 183
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    move-object p1, v0

    .line 186
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->setForegroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setRepeatableLogActions(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 372
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventViewCore;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    return-void
.end method

.method public setSpannableButtonText(Landroid/text/SpannableString;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 236
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 238
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public setTextGravity(I)V
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    return-void
.end method

.method public setWidthToTextWidth(F)V
    .locals 2

    .line 300
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/widget/SKButton;->buttonTextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    .line 301
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    add-float/2addr v0, p1

    float-to-int p1, v0

    iput p1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 302
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKButton;->invalidate()V

    return-void
.end method

.method public setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V
    .locals 1

    .line 345
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1, p2, p3}, Lcom/shopkick/app/logging/UserEventViewCore;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method public setupMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;Lcom/shopkick/app/application/ClientFlagsManager;ZLcom/shopkick/app/logging/UserEventLogger;)V
    .locals 1

    .line 353
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/shopkick/app/logging/UserEventViewCore;->setupMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;Lcom/shopkick/app/application/ClientFlagsManager;ZLcom/shopkick/app/logging/UserEventLogger;)V

    return-void
.end method

.method public stopMoatTracking()V
    .locals 1

    .line 358
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->stopMoatTracking()V

    return-void
.end method

.method public triggerEvent()V
    .locals 1

    .line 377
    iget-object v0, p0, Lcom/shopkick/app/widget/SKButton;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->triggerEvent()V

    return-void
.end method

.class public Lhuawei/widget/HwErrorTipTextLayout;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhuawei/widget/HwErrorTipTextLayout$TextInputAccessibilityDelegate;,
        Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;
    }
.end annotation


# static fields
.field private static final ANIMATION_DURATION:I = 0xc8


# instance fields
.field private mEditText:Landroid/widget/EditText;

.field private mEditTextBgResId:I

.field private mErrorEnabled:Z

.field private mErrorResBgId:I

.field private mErrorTextAppearance:I

.field private mErrorView:Landroid/widget/TextView;

.field private mLinearEditBgResId:I

.field private mShapeMode:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

.field private mSpaceOccupied:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 73
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwErrorTipTextLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 74
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 77
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lhuawei/widget/HwErrorTipTextLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 78
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 84
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 63
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorResBgId:I

    .line 64
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditTextBgResId:I

    .line 65
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mLinearEditBgResId:I

    .line 86
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lhuawei/widget/HwErrorTipTextLayout;->setOrientation(I)V

    .line 87
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lhuawei/widget/HwErrorTipTextLayout;->setAddStatesFromChildren(Z)V

    .line 88
    sget-object v0, Lcom/huawei/hwedittext/R$styleable;->HwErrorTipTextLayout:[I

    sget v1, Lcom/huawei/hwedittext/R$style;->Widget_Emui_HwErrorTipTextLayout:I

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 90
    sget v0, Lcom/huawei/hwedittext/R$styleable;->HwErrorTipTextLayout_hweditTextBg:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditTextBgResId:I

    .line 91
    sget v0, Lcom/huawei/hwedittext/R$styleable;->HwErrorTipTextLayout_hwlinearEditBg:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mLinearEditBgResId:I

    .line 92
    sget v0, Lcom/huawei/hwedittext/R$styleable;->HwErrorTipTextLayout_hwerrorResBg:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorResBgId:I

    .line 93
    sget v0, Lcom/huawei/hwedittext/R$styleable;->HwErrorTipTextLayout_hwerrorTextAppearance:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorTextAppearance:I

    .line 94
    sget v0, Lcom/huawei/hwedittext/R$styleable;->HwErrorTipTextLayout_hwerrorEnabled:I

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    .line 95
    sget v0, Lcom/huawei/hwedittext/R$styleable;->HwErrorTipTextLayout_hwspaceOccupied:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mSpaceOccupied:Z

    .line 96
    sget v0, Lcom/huawei/hwedittext/R$styleable;->HwErrorTipTextLayout_hwshape_mode:I

    sget-object v1, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->Bubble:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    .line 97
    invoke-virtual {v1}, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->ordinal()I

    move-result v1

    .line 96
    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 99
    invoke-static {}, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->values()[Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    move-result-object v0

    aget-object v0, v0, v4

    iput-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mShapeMode:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    .line 100
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 101
    invoke-virtual {p0, v3}, Lhuawei/widget/HwErrorTipTextLayout;->setErrorEnabled(Z)V

    .line 108
    new-instance v0, Lhuawei/widget/HwErrorTipTextLayout$TextInputAccessibilityDelegate;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhuawei/widget/HwErrorTipTextLayout$TextInputAccessibilityDelegate;-><init>(Lhuawei/widget/HwErrorTipTextLayout;Lhuawei/widget/HwErrorTipTextLayout$1;)V

    invoke-virtual {p0, v0}, Lhuawei/widget/HwErrorTipTextLayout;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    .line 109
    return-void
.end method

.method static synthetic access$100(Lhuawei/widget/HwErrorTipTextLayout;)Landroid/widget/TextView;
    .locals 1

    .line 51
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$200(Lhuawei/widget/HwErrorTipTextLayout;)Z
    .locals 1

    .line 51
    iget-boolean v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mSpaceOccupied:Z

    return v0
.end method

.method private setEditText(Landroid/widget/EditText;)V
    .locals 6

    .line 124
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 125
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "We already have an EditText, can only have one"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 129
    :cond_0
    iput-object p1, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    .line 130
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getImeOptions()I

    move-result v4

    .line 131
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    const/high16 v1, 0x2000000

    or-int/2addr v1, v4

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 133
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mShapeMode:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    sget-object v1, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->Bubble:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    if-ne v0, v1, :cond_1

    .line 135
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    iget v1, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditTextBgResId:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setBackgroundResource(I)V

    goto :goto_0

    .line 136
    :cond_1
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mShapeMode:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    sget-object v1, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->Linear:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    if-ne v0, v1, :cond_2

    .line 137
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    iget v1, p0, Lhuawei/widget/HwErrorTipTextLayout;->mLinearEditBgResId:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setBackgroundResource(I)V

    .line 143
    :cond_2
    :goto_0
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    if-eqz v0, :cond_4

    .line 147
    invoke-virtual {p0}, Lhuawei/widget/HwErrorTipTextLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwedittext/R$dimen;->errortiptextlayout_top_padding:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    .line 148
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_3

    .line 149
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    iget-object v1, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getPaddingLeft()I

    move-result v1

    iget-object v2, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    .line 150
    invoke-virtual {v2}, Landroid/widget/EditText;->getPaddingRight()I

    move-result v2

    .line 149
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    goto :goto_1

    .line 152
    :cond_3
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    iget-object v1, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getPaddingLeft()I

    move-result v1

    iget-object v2, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    .line 153
    invoke-virtual {v2}, Landroid/widget/EditText;->getPaddingRight()I

    move-result v2

    .line 152
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 157
    :cond_4
    :goto_1
    return-void
.end method

.method private updateEditTextMargin(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 2

    .line 162
    instance-of v0, p1, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 165
    :goto_0
    return-object v1
.end method


# virtual methods
.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 113
    instance-of v0, p1, Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 114
    move-object v0, p1

    check-cast v0, Landroid/widget/EditText;

    invoke-direct {p0, v0}, Lhuawei/widget/HwErrorTipTextLayout;->setEditText(Landroid/widget/EditText;)V

    .line 115
    invoke-direct {p0, p3}, Lhuawei/widget/HwErrorTipTextLayout;->updateEditTextMargin(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams;

    move-result-object v0

    const/4 v1, 0x0

    invoke-super {p0, p1, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 118
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 120
    :goto_0
    return-void
.end method

.method public getEditText()Landroid/widget/EditText;
    .locals 1

    .line 173
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    return-object v0
.end method

.method public getError()Ljava/lang/CharSequence;
    .locals 1

    .line 330
    iget-boolean v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorEnabled:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    .line 331
    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 332
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    .line 334
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHint()Ljava/lang/CharSequence;
    .locals 1

    .line 183
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public isErrorEnabled()Z
    .locals 1

    .line 233
    iget-boolean v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorEnabled:Z

    return v0
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 5

    .line 248
    iget-boolean v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorEnabled:Z

    if-nez v0, :cond_1

    .line 249
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 251
    return-void

    .line 255
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lhuawei/widget/HwErrorTipTextLayout;->setErrorEnabled(Z)V

    .line 258
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 259
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    .line 260
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 261
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 262
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lhuawei/widget/HwErrorTipTextLayout$1;

    invoke-direct {v1, p0}, Lhuawei/widget/HwErrorTipTextLayout$1;-><init>(Lhuawei/widget/HwErrorTipTextLayout;)V

    .line 263
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 268
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 271
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mShapeMode:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    sget-object v1, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->Bubble:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    if-ne v0, v1, :cond_2

    .line 273
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    iget v1, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorResBgId:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 276
    :cond_2
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mShapeMode:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    sget-object v1, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->Linear:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    if-ne v0, v1, :cond_7

    .line 277
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    .line 278
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    iget-object v1, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    .line 279
    invoke-virtual {v1}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 278
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    goto/16 :goto_0

    .line 281
    :cond_3
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 282
    invoke-static {v3}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 283
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v0

    invoke-static {v4, v0}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 284
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 285
    goto/16 :goto_0

    .line 288
    :cond_4
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_7

    .line 289
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 290
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lhuawei/widget/HwErrorTipTextLayout$2;

    invoke-direct {v1, p0}, Lhuawei/widget/HwErrorTipTextLayout$2;-><init>(Lhuawei/widget/HwErrorTipTextLayout;)V

    .line 291
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 298
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 301
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mShapeMode:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    sget-object v1, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->Bubble:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    if-ne v0, v1, :cond_5

    .line 303
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    iget v1, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditTextBgResId:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setBackgroundResource(I)V

    goto :goto_0

    .line 305
    :cond_5
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mShapeMode:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    sget-object v1, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->Linear:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    if-ne v0, v1, :cond_7

    .line 306
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_6

    .line 307
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 309
    :cond_6
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 310
    invoke-static {v3}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 311
    const/4 v0, 0x0

    invoke-static {v4, v0}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 312
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 318
    :cond_7
    :goto_0
    const/16 v0, 0x800

    invoke-virtual {p0, v0}, Lhuawei/widget/HwErrorTipTextLayout;->sendAccessibilityEvent(I)V

    .line 319
    return-void
.end method

.method public setErrorEnabled(Z)V
    .locals 5

    .line 195
    iget-boolean v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorEnabled:Z

    if-eq v0, p1, :cond_5

    .line 196
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 199
    :cond_0
    if-eqz p1, :cond_3

    .line 200
    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lhuawei/widget/HwErrorTipTextLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    .line 201
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    invoke-virtual {p0}, Lhuawei/widget/HwErrorTipTextLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorTextAppearance:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 202
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    iget-boolean v1, p0, Lhuawei/widget/HwErrorTipTextLayout;->mSpaceOccupied:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 203
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Lhuawei/widget/HwErrorTipTextLayout;->addView(Landroid/view/View;)V

    .line 205
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_4

    .line 208
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    .line 209
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    iget-object v1, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getPaddingLeft()I

    move-result v1

    iget-object v2, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    .line 210
    invoke-virtual {v2}, Landroid/widget/EditText;->getPaddingRight()I

    move-result v2

    .line 209
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    goto :goto_1

    .line 213
    :cond_2
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    iget-object v1, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getPaddingLeft()I

    move-result v1

    iget-object v2, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    .line 214
    invoke-virtual {v2}, Landroid/widget/EditText;->getPaddingRight()I

    move-result v2

    .line 213
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    goto :goto_1

    .line 219
    :cond_3
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Lhuawei/widget/HwErrorTipTextLayout;->removeView(Landroid/view/View;)V

    .line 220
    const/4 v0, 0x0

    iput-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorView:Landroid/widget/TextView;

    .line 222
    :cond_4
    :goto_1
    iput-boolean p1, p0, Lhuawei/widget/HwErrorTipTextLayout;->mErrorEnabled:Z

    .line 224
    :cond_5
    return-void
.end method

.method public setHint(Ljava/lang/CharSequence;)V
    .locals 1

    .line 177
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 178
    const/16 v0, 0x800

    invoke-virtual {p0, v0}, Lhuawei/widget/HwErrorTipTextLayout;->sendAccessibilityEvent(I)V

    .line 179
    return-void
.end method

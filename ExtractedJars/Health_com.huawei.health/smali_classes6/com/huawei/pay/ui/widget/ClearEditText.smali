.class public Lcom/huawei/pay/ui/widget/ClearEditText;
.super Lo/yt;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;
.implements Landroid/text/TextWatcher;


# instance fields
.field private isClearFunctionEnable:Z

.field private mClearDrawable:Landroid/graphics/drawable/Drawable;

.field private mIsShowClearNow:Z

.field private mRightDrawable:Landroid/graphics/drawable/Drawable;

.field private mRightImgClickListener:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 50
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 56
    const v0, 0x101006e

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 57
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 61
    invoke-direct {p0, p1, p2, p3}, Lo/yt;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->isClearFunctionEnable:Z

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mRightImgClickListener:Landroid/view/View$OnClickListener;

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mIsShowClearNow:Z

    .line 62
    invoke-direct {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->init()V

    .line 63
    return-void
.end method

.method private init()V
    .locals 2

    .line 68
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mRightDrawable:Landroid/graphics/drawable/Drawable;

    .line 69
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->btn_cancle_black_selector:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mClearDrawable:Landroid/graphics/drawable/Drawable;

    .line 70
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setClearIconVisible(Z)V

    .line 71
    invoke-virtual {p0, p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 72
    invoke-virtual {p0, p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 73
    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 195
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 190
    return-void
.end method

.method public isTouchRightImg(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 118
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mClearDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 119
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 120
    :goto_0
    return v3
.end method

.method public onFocusChange(Landroid/view/View;Z)V
    .locals 1

    .line 129
    if-eqz p2, :cond_1

    .line 131
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setClearIconVisible(Z)V

    .line 133
    :cond_1
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    .line 180
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getError()Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 182
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setClearIconVisible(Z)V

    .line 184
    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 82
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->isClearFunctionEnable:Z

    if-eqz v0, :cond_2

    .line 84
    invoke-virtual {p0, p1}, Lcom/huawei/pay/ui/widget/ClearEditText;->isTouchRightImg(Landroid/view/MotionEvent;)Z

    move-result v2

    .line 86
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 88
    if-eqz v2, :cond_2

    .line 91
    const/4 v0, 0x1

    return v0

    .line 94
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 96
    if-eqz v2, :cond_2

    .line 98
    iget-boolean v0, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mIsShowClearNow:Z

    if-eqz v0, :cond_1

    .line 100
    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setText(Ljava/lang/CharSequence;)V

    .line 101
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setError(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 105
    :cond_1
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mRightImgClickListener:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 108
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 112
    :cond_2
    invoke-super {p0, p1}, Lo/yt;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public setClearFunctionEnable(Z)V
    .locals 0

    .line 163
    iput-boolean p1, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->isClearFunctionEnable:Z

    .line 164
    return-void
.end method

.method protected setClearIconVisible(Z)V
    .locals 5

    .line 141
    iget-boolean v0, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->isClearFunctionEnable:Z

    if-eqz v0, :cond_2

    .line 143
    if-eqz p1, :cond_0

    iget-object v4, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mClearDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mRightDrawable:Landroid/graphics/drawable/Drawable;

    .line 144
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 146
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 149
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/4 v3, 0x3

    aget-object v2, v2, v3

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v3, v2}, Lcom/huawei/pay/ui/widget/ClearEditText;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 150
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-virtual {p0, v0, v1, v4, v2}, Lcom/huawei/pay/ui/widget/ClearEditText;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 151
    iput-boolean p1, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mIsShowClearNow:Z

    .line 153
    :cond_2
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 170
    invoke-super {p0, p1}, Lo/yt;->setEnabled(Z)V

    .line 171
    invoke-virtual {p0, p1}, Lcom/huawei/pay/ui/widget/ClearEditText;->setClearIconVisible(Z)V

    .line 172
    return-void
.end method

.method public setStaticRightEndImg(ILandroid/view/View$OnClickListener;)V
    .locals 1

    .line 206
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mRightDrawable:Landroid/graphics/drawable/Drawable;

    .line 207
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mRightDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/pay/ui/widget/ClearEditText;->setStaticRightEndImg(Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 208
    return-void
.end method

.method public setStaticRightEndImg(Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 199
    iput-object p1, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mRightDrawable:Landroid/graphics/drawable/Drawable;

    .line 200
    iput-object p2, p0, Lcom/huawei/pay/ui/widget/ClearEditText;->mRightImgClickListener:Landroid/view/View$OnClickListener;

    .line 201
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setClearIconVisible(Z)V

    .line 202
    return-void
.end method

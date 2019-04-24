.class public Lcom/shopkick/app/widget/SKEditText;
.super Landroid/support/v7/widget/AppCompatEditText;
.source "SKEditText.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 24
    invoke-direct {p0, p1}, Landroid/support/v7/widget/AppCompatEditText;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 25
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/widget/SKEditText;->setDefaultFont(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/widget/SKEditText;->setDefaultFont(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/widget/SKEditText;->setDefaultFont(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private setDefaultFont(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 45
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKEditText;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 46
    invoke-virtual {v0}, Landroid/graphics/Typeface;->getStyle()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 48
    sget-object v0, Lcom/shopkick/app/R$styleable;->SKEditText:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 49
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 50
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 52
    :cond_1
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKEditText;->setDefaultFont(I)Z

    return-void
.end method


# virtual methods
.method public final getInput()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 102
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    .line 103
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final getTrimmedInput()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 108
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKEditText;->getInput()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 113
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatEditText;->onFocusChanged(ZILandroid/graphics/Rect;)V

    if-nez p1, :cond_0

    .line 115
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKEditText;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "input_method"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 116
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKEditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_0
    return-void
.end method

.method public setDefaultFont(I)Z
    .locals 1

    .line 67
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKEditText;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 72
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKEditText;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/widget/SKTypeface;->getDefaultTypeface(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 74
    invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatEditText;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 87
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/SKEditText;->setDefaultFont(I)Z

    return-void

    .line 95
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Typeface;->getStyle()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKEditText;->setDefaultFont(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 96
    invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatEditText;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1
    return-void
.end method

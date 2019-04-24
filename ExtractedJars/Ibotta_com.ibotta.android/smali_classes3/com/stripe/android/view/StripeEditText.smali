.class public Lcom/stripe/android/view/StripeEditText;
.super Landroid/support/design/widget/TextInputEditText;
.source "StripeEditText.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;,
        Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;,
        Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;,
        Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;
    }
.end annotation


# instance fields
.field private mAfterTextChangedListener:Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mCachedColorStateList:Landroid/content/res/ColorStateList;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mDefaultErrorColorResId:I
    .annotation build Landroid/support/annotation/ColorRes;
    .end annotation
.end field

.field private mDeleteEmptyListener:Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mErrorColor:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field private mErrorMessage:Ljava/lang/String;

.field private mErrorMessageListener:Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

.field private mHandler:Landroid/os/Handler;

.field private mShouldShowError:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/support/design/widget/TextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    invoke-direct {p0}, Lcom/stripe/android/view/StripeEditText;->initView()V

    return-void
.end method

.method static synthetic access$000(Lcom/stripe/android/view/StripeEditText;)Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/view/StripeEditText;->mAfterTextChangedListener:Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;

    return-object p0
.end method

.method static synthetic access$100(Lcom/stripe/android/view/StripeEditText;)Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/view/StripeEditText;->mDeleteEmptyListener:Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    return-object p0
.end method

.method private determineDefaultErrorColor()V
    .locals 1

    .line 198
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/StripeEditText;->mCachedColorStateList:Landroid/content/res/ColorStateList;

    .line 199
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->mCachedColorStateList:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    .line 200
    invoke-static {v0}, Lcom/stripe/android/view/ViewUtils;->isColorDark(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    sget v0, Lcom/stripe/android/R$color;->error_text_light_theme:I

    iput v0, p0, Lcom/stripe/android/view/StripeEditText;->mDefaultErrorColorResId:I

    goto :goto_0

    .line 205
    :cond_0
    sget v0, Lcom/stripe/android/R$color;->error_text_dark_theme:I

    iput v0, p0, Lcom/stripe/android/view/StripeEditText;->mDefaultErrorColorResId:I

    :goto_0
    return-void
.end method

.method private initView()V
    .locals 1

    .line 190
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/view/StripeEditText;->mHandler:Landroid/os/Handler;

    .line 191
    invoke-direct {p0}, Lcom/stripe/android/view/StripeEditText;->listenForTextChanges()V

    .line 192
    invoke-direct {p0}, Lcom/stripe/android/view/StripeEditText;->listenForDeleteEmpty()V

    .line 193
    invoke-direct {p0}, Lcom/stripe/android/view/StripeEditText;->determineDefaultErrorColor()V

    .line 194
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/StripeEditText;->mCachedColorStateList:Landroid/content/res/ColorStateList;

    return-void
.end method

.method private listenForDeleteEmpty()V
    .locals 1

    .line 232
    new-instance v0, Lcom/stripe/android/view/StripeEditText$3;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/StripeEditText$3;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/StripeEditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method

.method private listenForTextChanges()V
    .locals 1

    .line 210
    new-instance v0, Lcom/stripe/android/view/StripeEditText$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/StripeEditText$2;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method


# virtual methods
.method public getCachedColorStateList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->mCachedColorStateList:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getDefaultErrorColorInt()I
    .locals 3
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation

    .line 84
    invoke-direct {p0}, Lcom/stripe/android/view/StripeEditText;->determineDefaultErrorColor()V

    .line 85
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 86
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/view/StripeEditText;->mDefaultErrorColorResId:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v0

    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/view/StripeEditText;->mDefaultErrorColorResId:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    :goto_0
    return v0
.end method

.method public getShouldShowError()Z
    .locals 1

    .line 72
    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText;->mShouldShowError:Z

    return v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    .line 98
    invoke-super {p0, p1}, Landroid/support/design/widget/TextInputEditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 102
    :cond_0
    new-instance v0, Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;

    invoke-super {p0, p1}, Landroid/support/design/widget/TextInputEditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;-><init>(Lcom/stripe/android/view/StripeEditText;Landroid/view/inputmethod/InputConnection;Z)V

    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .line 184
    invoke-super {p0}, Landroid/support/design/widget/TextInputEditText;->onDetachedFromWindow()V

    .line 186
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method setAfterTextChangedListener(Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;)V
    .locals 0
    .param p1    # Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 113
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->mAfterTextChangedListener:Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;

    return-void
.end method

.method setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V
    .locals 0
    .param p1    # Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 122
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->mDeleteEmptyListener:Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    return-void
.end method

.method public setErrorColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 139
    iput p1, p0, Lcom/stripe/android/view/StripeEditText;->mErrorColor:I

    return-void
.end method

.method setErrorMessage(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 130
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->mErrorMessage:Ljava/lang/String;

    return-void
.end method

.method setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V
    .locals 0
    .param p1    # Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 126
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->mErrorMessageListener:Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    return-void
.end method

.method public setHintDelayed(IJ)V
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    .line 149
    new-instance v0, Lcom/stripe/android/view/StripeEditText$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/view/StripeEditText$1;-><init>(Lcom/stripe/android/view/StripeEditText;I)V

    .line 155
    iget-object p1, p0, Lcom/stripe/android/view/StripeEditText;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v0, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public setShouldShowError(Z)V
    .locals 2

    .line 166
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->mErrorMessage:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText;->mErrorMessageListener:Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 168
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText;->mErrorMessageListener:Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    invoke-interface {v1, v0}, Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;->displayErrorMessage(Ljava/lang/String;)V

    .line 169
    iput-boolean p1, p0, Lcom/stripe/android/view/StripeEditText;->mShouldShowError:Z

    goto :goto_2

    .line 171
    :cond_1
    iput-boolean p1, p0, Lcom/stripe/android/view/StripeEditText;->mShouldShowError:Z

    .line 172
    iget-boolean p1, p0, Lcom/stripe/android/view/StripeEditText;->mShouldShowError:Z

    if-eqz p1, :cond_2

    .line 173
    iget p1, p0, Lcom/stripe/android/view/StripeEditText;->mErrorColor:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setTextColor(I)V

    goto :goto_1

    .line 175
    :cond_2
    iget-object p1, p0, Lcom/stripe/android/view/StripeEditText;->mCachedColorStateList:Landroid/content/res/ColorStateList;

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 178
    :goto_1
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->refreshDrawableState()V

    :goto_2
    return-void
.end method

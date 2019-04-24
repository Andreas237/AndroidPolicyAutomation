.class public Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;
.super Landroid/widget/EditText;
.source "SourceFile"


# instance fields
.field final listener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;

.field private mDelForeSelector:Landroid/graphics/drawable/Drawable;

.field private mDoneForeSelector:Landroid/graphics/drawable/Drawable;

.field private mFpan:Ljava/lang/String;

.field private mFunctionBgSelector:Landroid/graphics/drawable/Drawable;

.field private mInputmanger:Landroid/view/inputmethod/InputMethodManager;

.field private mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

.field private mNumBgSelector:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 54
    invoke-direct {p0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    .line 173
    new-instance v0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;-><init>(Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->listener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;

    .line 55
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->initKeyBoard(Landroid/content/Context;)V

    .line 56
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 42
    invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    .line 173
    new-instance v0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;-><init>(Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->listener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;

    .line 43
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->initKeyBoard(Landroid/content/Context;)V

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 48
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    .line 173
    new-instance v0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$3;-><init>(Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->listener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;

    .line 49
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->initKeyBoard(Landroid/content/Context;)V

    .line 50
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;)Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    return-object v0
.end method

.method private initKeyBoard(Landroid/content/Context;)V
    .locals 7

    .line 60
    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mInputmanger:Landroid/view/inputmethod/InputMethodManager;

    .line 63
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$drawable;->bnt_keyboard_character_normal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mNumBgSelector:Landroid/graphics/drawable/Drawable;

    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$drawable;->bnt_keyboard_function_normal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mFunctionBgSelector:Landroid/graphics/drawable/Drawable;

    .line 67
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$drawable;->ic_keyboard_pack_up:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mDoneForeSelector:Landroid/graphics/drawable/Drawable;

    .line 68
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$drawable;->ic_keyboard_delete:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mDelForeSelector:Landroid/graphics/drawable/Drawable;

    .line 71
    :try_start_0
    new-instance v0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    const/16 v1, 0x7d0

    invoke-direct {v0, p1, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$color;->color_up_safe_keyboard_bg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setKeyboardBackground(Landroid/graphics/drawable/Drawable;)V

    .line 76
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    .line 77
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$dimen;->nfc_up_safe_keyboard_height:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 76
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setKeyBoardSize(II)V

    .line 79
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->enableLightStatusBar(Z)V

    .line 81
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    .line 82
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$dimen;->nfc_up_safe_keyboard_padding_start_end:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 83
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/wallet/R$dimen;->nfc_up_safe_keyboard_padding_top_bottom:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 84
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/wallet/R$dimen;->nfc_up_safe_keyboard_padding_start_end:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 85
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/wallet/R$dimen;->nfc_up_safe_keyboard_padding_top_bottom:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 81
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setKeyAreaPadding(IIII)V

    .line 89
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$dimen;->nfc_up_safe_keyboard_title_height:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setTitleHeight(I)V

    .line 92
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$dimen;->nfc_up_safe_keyboard_title_size:I

    .line 93
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 92
    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setTitleSize(I)V

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_up_keyboard_security_mode:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setTitleText(Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$color;->CS_black_50_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setTitleColor(I)V

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$drawable;->ic_keyboard_safety:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setTitleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$color;->color_up_safe_keyboard_title_bg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setTitleBackground(Landroid/graphics/drawable/Drawable;)V

    .line 105
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mNumBgSelector:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setNumKeyBackgroud(Landroid/graphics/drawable/Drawable;)V

    .line 107
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$dimen;->nfc_up_safe_keyboard_number_size:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setNumberKeySize(I)V

    .line 110
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    .line 111
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$dimen;->nfc_up_safe_keyboard_number_key_margin:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 112
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/wallet/R$dimen;->nfc_up_safe_keyboard_number_key_margin:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 110
    invoke-virtual {v0, v1, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setNumKeyMargin(II)V

    .line 116
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mDoneForeSelector:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mFunctionBgSelector:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setDoneKeyDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mDelForeSelector:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mFunctionBgSelector:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setDelKeyDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 120
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setKeyboardVibrate(Z)V

    .line 122
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->enableLightStatusBar(Z)V
    :try_end_0
    .catch Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    .line 131
    goto :goto_0

    .line 124
    :catch_0
    move-exception v6

    .line 126
    const-string v0, "mKeyboard err!"

    invoke-static {v0, v6}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 131
    goto :goto_0

    .line 128
    :catch_1
    move-exception v6

    .line 130
    const-string v0, "mKeyboard err!"

    invoke-static {v0, v6}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    :goto_0
    new-instance v0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$1;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$1;-><init>(Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;)V

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 145
    new-instance v0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$2;-><init>(Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;)V

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 161
    return-void
.end method


# virtual methods
.method public getEnctyptText()Ljava/lang/String;
    .locals 2

    .line 209
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mFpan:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->getInput(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setFpan(Ljava/lang/String;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mFpan:Ljava/lang/String;

    .line 215
    return-void
.end method

.method public setRecvTouchEventActivity(Landroid/app/Activity;)V
    .locals 2

    .line 204
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 205
    return-void
.end method

.method public showSafeKeyboard(Landroid/view/View;)V
    .locals 3

    .line 165
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mInputmanger:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 166
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->listener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setOnEditorListener(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;)V

    .line 167
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->mKeyboard:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->show()Z

    .line 168
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->setFocusable(Z)V

    .line 169
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->requestFocus()Z

    .line 170
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->setCursorVisible(Z)V

    .line 171
    return-void
.end method

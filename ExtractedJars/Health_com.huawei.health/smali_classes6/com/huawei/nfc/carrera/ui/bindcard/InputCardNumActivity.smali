.class public Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;
.super Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;
.implements Landroid/view/View$OnKeyListener;


# static fields
.field private static final APK_VERSION:I = 0x17

.field private static final INPUT_SPACE_STR:Ljava/lang/String; = " "

.field public static final INTENT_KEY_CARD_NUM:Ljava/lang/String; = "card_num"

.field public static final INTENT_KRY_CARD_IMG:Ljava/lang/String; = "card_img"

.field public static final REQUEST_CODE_NFC_TAG:I = 0x1

.field private static final TAG:Ljava/lang/String; = "InputCardNumActivity"


# instance fields
.field private beforeSpaceNum:I

.field private beforeTextLength:I

.field private bindCardApi:Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;

.field private final buffer:Ljava/lang/StringBuffer;

.field private cardNumImg:Landroid/widget/ImageView;

.field private cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

.field private identifyCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;

.field private isChanged:Z

.field private keyboardView:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

.field private location:I

.field private mCardBitmap:Landroid/graphics/Bitmap;

.field private mCardNumber:Ljava/lang/String;

.field protected mLoadingDialog21:Lo/egn;

.field private nextStepButton:Lo/egd;

.field private onTextLength:I

.field private readNumberLinearLayout:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 68
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;-><init>()V

    .line 557
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->beforeTextLength:I

    .line 559
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->onTextLength:I

    .line 561
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->isChanged:Z

    .line 563
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    .line 565
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->buffer:Ljava/lang/StringBuffer;

    .line 567
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->beforeSpaceNum:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->identifyCardNumByCamera()V

    return-void
.end method

.method static synthetic access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->onTextLength:I

    return v0
.end method

.method static synthetic access$1002(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;I)I
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->onTextLength:I

    return p1
.end method

.method static synthetic access$1100(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Z
    .locals 1

    .line 68
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->isChanged:Z

    return v0
.end method

.method static synthetic access$1102(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;Z)Z
    .locals 0

    .line 68
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->isChanged:Z

    return p1
.end method

.method static synthetic access$1200(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    return v0
.end method

.method static synthetic access$1202(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;I)I
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    return p1
.end method

.method static synthetic access$1300(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->removeSpace()V

    return-void
.end method

.method static synthetic access$1400(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;II)Ljava/lang/String;
    .locals 1

    .line 68
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->updateLocation(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lo/egd;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->nextStepButton:Lo/egd;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->keyboardView:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->stopProgress()V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;Ljava/lang/String;II)V
    .locals 0

    .line 68
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->jumpToCardInstructionActivity(Ljava/lang/String;II)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;I)V
    .locals 0

    .line 68
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->dealFailedIdentifyResult(I)V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->beforeTextLength:I

    return v0
.end method

.method static synthetic access$702(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;I)I
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->beforeTextLength:I

    return p1
.end method

.method static synthetic access$800(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Ljava/lang/StringBuffer;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->buffer:Ljava/lang/StringBuffer;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->beforeSpaceNum:I

    return v0
.end method

.method static synthetic access$902(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;I)I
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->beforeSpaceNum:I

    return p1
.end method

.method static synthetic access$908(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)I
    .locals 2

    .line 68
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->beforeSpaceNum:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->beforeSpaceNum:I

    return v0
.end method

.method private bankCardNumAddSpace(Landroid/widget/EditText;)V
    .locals 1

    .line 571
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;

    invoke-direct {v0, p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$5;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;Landroid/widget/EditText;)V

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 652
    return-void
.end method

.method private checkCardNum()V
    .locals 3

    .line 425
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->identifyCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 427
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$4;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->identifyCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;

    .line 447
    :cond_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_check_card_valid:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->startProgress(Ljava/lang/String;)V

    .line 448
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 449
    const-string v0, " "

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 451
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->bindCardApi:Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 453
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->bindCardApi:Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;

    .line 455
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->bindCardApi:Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->identifyCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;

    invoke-interface {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;->identifyCardType(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;)V

    .line 456
    return-void
.end method

.method private dealFailedIdentifyResult(I)V
    .locals 2

    .line 780
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "dealFailedIdentifyResult identifyResult   : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 781
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 785
    :pswitch_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_identify_error_illegal_num:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->showToast(I)V

    .line 786
    goto :goto_1

    .line 788
    :pswitch_1
    sget v0, Lcom/huawei/wallet/R$string;->no_network:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->showToast(I)V

    .line 789
    goto :goto_1

    .line 791
    :pswitch_2
    sget v0, Lcom/huawei/wallet/R$string;->nfc_identify_error_unsupported_card:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->showToast(I)V

    .line 792
    goto :goto_1

    .line 795
    :pswitch_3
    sget v0, Lcom/huawei/wallet/R$string;->nfc_common_wifi_error_suggestion:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->showToast(I)V

    .line 796
    goto :goto_1

    .line 798
    :pswitch_4
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->showQueryCplcErro()V

    .line 799
    goto :goto_1

    .line 805
    :pswitch_5
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->showBindFailDialog()V

    .line 806
    goto :goto_1

    .line 809
    :pswitch_6
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bank_card_has_been_applied:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->showErrDialog(I)V

    .line 810
    goto :goto_1

    .line 812
    :pswitch_7
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_reach_bank_limit:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->showErrDialog(I)V

    .line 813
    goto :goto_1

    .line 815
    :goto_0
    :pswitch_8
    sget v0, Lcom/huawei/wallet/R$string;->nfc_identify_error_other_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->showToast(I)V

    .line 818
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch -0xa
        :pswitch_7
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_3
        :pswitch_1
        :pswitch_8
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private getCardNumberDataByIntent()V
    .locals 2

    .line 160
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 161
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 163
    const-string v0, "card_num"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mCardNumber:Ljava/lang/String;

    .line 164
    const-string v0, "card_img"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mCardBitmap:Landroid/graphics/Bitmap;

    .line 166
    :cond_0
    return-void
.end method

.method private identifyCardNumByCamera()V
    .locals 1

    .line 414
    new-instance v0, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;

    invoke-direct {v0}, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;-><init>()V

    .line 415
    invoke-virtual {v0, p0, p0}, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;->b(Landroid/app/Activity;Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;)V

    .line 417
    invoke-static {}, Lcom/huawei/nfc/carrera/server/card/model/CaptureMethod;->setCameraMode()V

    .line 418
    return-void
.end method

.method private initCardOperateApi()V
    .locals 2

    .line 262
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->bindCardApi:Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 264
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->bindCardApi:Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;

    .line 269
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->bindCardApi:Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;->initEseInfo()V

    .line 272
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->bindCardApi:Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;->initCUPCardOperator(Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitCUPCardOperatorCallback;)V

    .line 273
    return-void
.end method

.method private initKeyBroardView()V
    .locals 6

    .line 280
    sget v0, Lcom/huawei/wallet/R$id;->hwpay_keyboard_input:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->keyboardView:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    .line 281
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->keyboardView:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->setKeyBoardListener(Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;)V

    .line 331
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 333
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 337
    :try_start_0
    const-class v4, Landroid/widget/EditText;

    .line 338
    const-string v0, "setShowSoftInputOnFocus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 339
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 340
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    .line 357
    goto :goto_0

    .line 342
    :catch_0
    move-exception v4

    .line 344
    const-string v0, "NoSuchMethodException error: "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 357
    goto :goto_0

    .line 346
    :catch_1
    move-exception v4

    .line 348
    const-string v0, "IllegalAccessException error: "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 357
    goto :goto_0

    .line 350
    :catch_2
    move-exception v4

    .line 352
    const-string v0, "IllegalArgumentException error: "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 357
    goto :goto_0

    .line 354
    :catch_3
    move-exception v4

    .line 356
    const-string v0, "InvocationTargetException  error: "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 357
    goto :goto_0

    .line 361
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/ClearEditText;->setInputType(I)V

    .line 364
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$3;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/ClearEditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 389
    return-void
.end method

.method private initViews()V
    .locals 3

    .line 179
    sget v0, Lcom/huawei/wallet/R$id;->nfc_bind_card_next_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->nextStepButton:Lo/egd;

    .line 180
    sget v0, Lcom/huawei/wallet/R$id;->card_number:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/pay/ui/widget/ClearEditText;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    .line 181
    sget v0, Lcom/huawei/wallet/R$id;->card_num_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumImg:Landroid/widget/ImageView;

    .line 182
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumImg:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 183
    sget v0, Lcom/huawei/wallet/R$id;->card_number_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->readNumberLinearLayout:Landroid/widget/LinearLayout;

    .line 184
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isEnabledNFC(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->readNumberLinearLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 187
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->readNumberLinearLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 189
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-virtual {v0, p0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 190
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    sget v1, Lcom/huawei/wallet/R$drawable;->nfc_icon_camara:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/pay/ui/widget/ClearEditText;->setStaticRightEndImg(ILandroid/view/View$OnClickListener;)V

    .line 220
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->bankCardNumAddSpace(Landroid/widget/EditText;)V

    .line 221
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->initKeyBroardView()V

    .line 224
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mCardNumber:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 226
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mCardNumber:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->setCardNumberData(Ljava/lang/String;)V

    .line 228
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->keyboardView:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->keyboardView:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    .line 230
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->nextStepButton:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 231
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->keyboardView:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->setVisibility(I)V

    .line 233
    :cond_2
    return-void
.end method

.method private jumpToCardInstructionActivity(Ljava/lang/String;II)V
    .locals 5

    .line 732
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 733
    const-string v0, " "

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 735
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 736
    const-string v0, "issuer_id"

    invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 737
    const-string v0, "card_type"

    invoke-virtual {v3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 738
    const-string v0, "issuer_mode"

    invoke-virtual {v3, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 739
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v2, v0}, Lo/dtj;->b(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 740
    const-string v0, "card_num"

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 741
    invoke-virtual {p0, v3}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->startActivity(Landroid/content/Intent;)V

    .line 742
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->finish()V

    .line 743
    return-void
.end method

.method private removeSpace()V
    .locals 4

    .line 663
    const/4 v3, 0x0

    .line 664
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->buffer:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 666
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->buffer:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v0

    const-string v1, " "

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v0, v1, :cond_0

    .line 668
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->buffer:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 672
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 675
    :cond_1
    return-void
.end method

.method private setCardNumImg()V
    .locals 4

    .line 976
    const-string v0, "InputCardNumActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " == cardNumImg \uff1a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumImg:Landroid/widget/ImageView;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; mCardBitmap : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mCardBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 977
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumImg:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 978
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mCardBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 979
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumImg:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 980
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumImg:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mCardBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 982
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumImg:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 985
    :cond_1
    :goto_0
    return-void
.end method

.method private setCardNumberData(Ljava/lang/String;)V
    .locals 3

    .line 243
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 245
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-virtual {v0, p1}, Lcom/huawei/pay/ui/widget/ClearEditText;->setText(Ljava/lang/CharSequence;)V

    .line 246
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 247
    instance-of v0, v1, Landroid/text/Spannable;

    if-eqz v0, :cond_0

    .line 249
    move-object v2, v1

    check-cast v2, Landroid/text/Spannable;

    .line 250
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {v2, v0}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    .line 254
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->setCardNumImg()V

    .line 255
    return-void
.end method

.method private showBindFailDialog()V
    .locals 5

    .line 878
    new-instance v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mContext:Landroid/content/Context;

    .line 879
    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->createNotice(Landroid/content/Context;)Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    move-result-object v4

    .line 880
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->setNoticeTitle(Ljava/lang/String;)V

    .line 881
    sget v0, Lcom/huawei/wallet/R$string;->nfc_security_manager_setting_swich_message:I

    sget v1, Lcom/huawei/wallet/R$string;->nfc_security_manager_setting_swich_message1:I

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mContext:Landroid/content/Context;

    sget v3, Lcom/huawei/wallet/R$string;->nfc_security_manager_setting_swich_message_more:I

    .line 883
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 881
    invoke-virtual {v4, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->setNoticeMessage(IILjava/lang/String;)V

    .line 884
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_dialog_getlocation_service_positive_text:I

    .line 885
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$8;

    invoke-direct {v1, p0, v4}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$8;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;)V

    .line 884
    invoke-virtual {v4, v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->setPositiveButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    .line 898
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_cancel:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$9;

    invoke-direct {v1, p0, v4}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$9;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;)V

    invoke-virtual {v4, v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->setNegativeButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    .line 907
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->startNotice()V

    .line 908
    return-void
.end method

.method private showQueryCplcErro()V
    .locals 3

    .line 825
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 827
    return-void

    .line 829
    :cond_0
    invoke-static {p0}, Lo/yk;->e(Landroid/content/Context;)Lo/yr;

    move-result-object v2

    .line 830
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Lo/yr;->setCancelable(Z)V

    .line 831
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lo/yr;->a(Ljava/lang/String;)Lo/yr;

    .line 832
    sget v0, Lcom/huawei/wallet/R$string;->nfc_query_cplc_erro:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lo/yr;->c(Ljava/lang/String;)Lo/yr;

    .line 833
    sget v0, Lcom/huawei/wallet/R$string;->nfc_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$6;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V

    invoke-interface {v2, v0, v1}, Lo/yr;->c(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lo/yr;

    .line 850
    sget v0, Lcom/huawei/wallet/R$string;->nfc_cancel:I

    const/4 v1, 0x0

    invoke-interface {v2, v0, v1}, Lo/yr;->d(ILandroid/content/DialogInterface$OnClickListener;)Lo/yr;

    .line 851
    invoke-interface {v2}, Lo/yr;->show()V

    .line 853
    return-void
.end method

.method private startProgress(Ljava/lang/String;)V
    .locals 4

    .line 752
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 753
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mLoadingDialog21:Lo/egn;

    .line 754
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0, p1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 755
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    goto :goto_0

    .line 757
    :cond_0
    const-string v0, "InputCardNumActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingDialog21 is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 759
    :goto_0
    return-void
.end method

.method private stopProgress()V
    .locals 4

    .line 766
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 767
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 768
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mLoadingDialog21:Lo/egn;

    .line 769
    const-string v0, "InputCardNumActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy mLoadingDialog21"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 771
    :cond_0
    return-void
.end method

.method private tagReadCardNumButton()V
    .locals 2

    .line 518
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 519
    const/4 v0, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 520
    return-void
.end method

.method private updateLocation(II)Ljava/lang/String;
    .locals 6

    .line 687
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->onTextLength:I

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->beforeTextLength:I

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    rem-int/lit8 v0, v0, 0x5

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 689
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    goto :goto_0

    .line 691
    :cond_0
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->onTextLength:I

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->beforeTextLength:I

    if-le v0, v1, :cond_2

    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    rem-int/lit8 v0, v0, 0x5

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 693
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->beforeTextLength:I

    const/4 v1, 0x3

    if-lt v1, v0, :cond_1

    .line 695
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->beforeSpaceNum:I

    sub-int v1, p1, v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    goto :goto_0

    .line 699
    :cond_1
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    goto :goto_0

    .line 702
    :cond_2
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->onTextLength:I

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->beforeTextLength:I

    sub-int/2addr v0, v1

    const/4 v1, 0x2

    if-le v0, v1, :cond_3

    .line 704
    add-int v0, p2, p1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    .line 706
    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EditTextUtil afterTextChanged   : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 707
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->buffer:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    new-array v4, v0, [C

    .line 708
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->buffer:Ljava/lang/StringBuffer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->buffer:Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v4, v3}, Ljava/lang/StringBuffer;->getChars(II[CI)V

    .line 709
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->buffer:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    .line 711
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    if-le v0, v1, :cond_4

    .line 714
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    goto :goto_1

    .line 717
    :cond_4
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    if-gez v0, :cond_5

    .line 719
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->location:I

    .line 721
    :cond_5
    :goto_1
    return-object v5
.end method


# virtual methods
.method public getBankNumber(Ljava/lang/String;)V
    .locals 2

    .line 525
    invoke-static {}, Lcom/huawei/nfc/carrera/server/card/model/CaptureMethod;->setUnKnownMode()V

    .line 527
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-virtual {v0, p1}, Lcom/huawei/pay/ui/widget/ClearEditText;->setText(Ljava/lang/CharSequence;)V

    .line 528
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-virtual {v1}, Lcom/huawei/pay/ui/widget/ClearEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/ClearEditText;->setSelection(I)V

    .line 529
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumImg:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 530
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 487
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 489
    const-string v0, "onActivityResult"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestCode=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 490
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    .line 492
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 494
    const-string v0, "onActivityResult"

    const-string v1, "data is null!"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 495
    return-void

    .line 499
    :cond_0
    const-string v0, "nfc_tag_read_card_result_card_number"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 501
    const-string v0, "nfc_tag_read_card_result_card_number"

    .line 502
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 501
    invoke-static {v0, v1}, Lo/dtj;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 503
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-virtual {v0, v3}, Lcom/huawei/pay/ui/widget/ClearEditText;->setText(Ljava/lang/CharSequence;)V

    .line 504
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-virtual {v1}, Lcom/huawei/pay/ui/widget/ClearEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/ClearEditText;->setSelection(I)V

    .line 506
    invoke-static {}, Lcom/huawei/nfc/carrera/server/card/model/CaptureMethod;->setCameraMode()V

    .line 507
    goto :goto_0

    .line 511
    :cond_1
    const-string v0, "onActivityResult"

    const-string v1, "do nothing!"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 513
    :cond_2
    :goto_0
    return-void
.end method

.method public onCardBackPressed()V
    .locals 0

    .line 922
    return-void
.end method

.method public onClickEvent(Landroid/view/View;)V
    .locals 2

    .line 398
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 399
    sget v0, Lcom/huawei/wallet/R$id;->txt_tag_read_card_number:I

    if-ne v0, v1, :cond_0

    .line 401
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->tagReadCardNumButton()V

    goto :goto_0

    .line 403
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->nfc_bind_card_next_button:I

    if-ne v0, v1, :cond_1

    .line 405
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->checkCardNum()V

    .line 407
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 143
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getCardNumberDataByIntent()V

    .line 144
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 145
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->setRequestedOrientation(I)V

    .line 147
    sget v0, Lcom/huawei/wallet/R$string;->nfc_input_card_num_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->setTitle(I)V

    .line 148
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_input_card_num_activity_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->setContentView(I)V

    .line 149
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->initViews()V

    .line 150
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x2000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 152
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->initCardOperateApi()V

    .line 153
    return-void
.end method

.method public onIndetify(Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V
    .locals 6

    .line 535
    if-eqz p1, :cond_0

    .line 537
    const-string v0, "InputCardNumActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " == cardIdentifyInfo \uff1a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    invoke-virtual {p1}, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mCardBitmap:Landroid/graphics/Bitmap;

    .line 540
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-virtual {p1}, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/ClearEditText;->setText(Ljava/lang/CharSequence;)V

    .line 541
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->setCardNumImg()V

    .line 542
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getText()Landroid/text/Editable;

    move-result-object v4

    .line 543
    instance-of v0, v4, Landroid/text/Spannable;

    if-eqz v0, :cond_0

    .line 545
    move-object v5, v4

    check-cast v5, Landroid/text/Spannable;

    .line 546
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {v5, v0}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    .line 549
    :cond_0
    return-void
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 927
    const/16 v0, 0x43

    if-ne p2, v0, :cond_1

    .line 929
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 930
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 932
    const-string v0, "*"

    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    .line 934
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/ClearEditText;->setText(Ljava/lang/CharSequence;)V

    .line 938
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->cardNumInputView:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->requestFocus()Z

    .line 940
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 462
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 464
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->keyboardView:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->keyboardView:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 466
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->nextStepButton:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 467
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->keyboardView:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->setVisibility(I)V

    .line 468
    const/4 v0, 0x1

    return v0

    .line 472
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->setResult(I)V

    .line 473
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 474
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.nfc.carrera.ui.cardlist.AddBankOrBusCardActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 475
    const/high16 v0, 0x10000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 476
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->startActivity(Landroid/content/Intent;)V

    .line 477
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->finish()V

    .line 478
    const/4 v0, 0x1

    return v0

    .line 481
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onResume()V
    .locals 0

    .line 171
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->onResume()V

    .line 172
    return-void
.end method

.method public onSwitch2Input()V
    .locals 0

    .line 915
    return-void
.end method

.method protected showErrDialog(I)V
    .locals 4

    .line 857
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 859
    new-instance v2, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 860
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    invoke-virtual {v2, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 861
    invoke-virtual {v2, p1}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 862
    sget v0, Lcom/huawei/wallet/R$string;->nfc_quick_pass_button_text:I

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$7;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V

    invoke-virtual {v2, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 867
    invoke-virtual {v2}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 868
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/egv;->setCancelable(Z)V

    .line 869
    invoke-virtual {v3}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 870
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 873
    :cond_0
    return-void
.end method

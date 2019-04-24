.class public Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;
.super Landroid/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$ValidDateListener;,
        Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$MyQueryBankIssuerInfoCallback;
    }
.end annotation


# static fields
.field private static final CARD_INFO_COUNT:I = 0x5

.field private static final CVV2_INFO:I = 0x1

.field private static final CVV2_KEY:I = 0x2

.field private static final CVV2_MAX_LENGTH:I = 0x3

.field private static final DATE_INFO:I = 0x3

.field private static final DATE_KEY:I = 0x1

.field private static final IDNUM_KEY:I = 0x4

.field private static final IDNUM_MAX_LENGTH:I = 0x12

.field private static final MASSAGE_DISMSS_LOAD:I = 0x2

.field private static final MASSAGE_SHOW_LOAD:I = 0x1

.field private static final PASSWORD_MAX_LENGTH:I = 0x6

.field private static final PHONE_INFO:I = 0x2

.field private static final PHONE_KEY:I = 0x3

.field private static final PHONE_MAX_LENGTH:I = 0xb

.field private static final PWD_KEY:I = 0x0

.field private static final START_BIND:I = 0x3

.field private static final TAG:Ljava/lang/String; = "BindCardInputFragment"


# instance fields
.field private aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

.field aMapLocationListener:Lcom/amap/api/location/AMapLocationListener;

.field private andText:Landroid/widget/TextView;

.field private bankIconView:Landroid/widget/ImageView;

.field private bankNameView:Landroid/widget/TextView;

.field private bindListener:Lcom/huawei/nfc/carrera/ui/bindcard/StartBindListener;

.field private cardCardType:Landroid/widget/TextView;

.field private cardEndNum:Landroid/widget/TextView;

.field private cardInfoList:[Landroid/widget/EditText;

.field private cardKeyList:[Z

.field private cardNum:Ljava/lang/String;

.field private cardType:I

.field private isAgreeLicence:Z

.field private issuerId:Ljava/lang/String;

.field private issuerMode:I

.field latitude:Ljava/lang/Double;

.field private licenceAgreeView:Landroid/widget/CheckBox;

.field private licenceAgreementsLayout:Landroid/widget/LinearLayout;

.field private licenceAgreementsTitleUrl:Ljava/lang/String;

.field private licenceAgreemntsTitle:Landroid/widget/TextView;

.field private licenceTermsLayout:Landroid/widget/LinearLayout;

.field private licenceTermsTitle:Landroid/widget/TextView;

.field private licenceTermsTitleUrl:Ljava/lang/String;

.field longitude:Ljava/lang/Double;

.field private mCustomDatePickerDialog:Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;

.field private mHandler:Landroid/os/Handler;

.field protected mLoadingDialog21:Lo/egn;

.field public mLockscreenStatus:I

.field private nextStepText:Lo/egd;

.field public pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

.field private rootView:Landroid/view/View;

.field private runnable:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 294
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->isAgreeLicence:Z

    .line 249
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLockscreenStatus:I

    .line 274
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->latitude:Ljava/lang/Double;

    .line 275
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->longitude:Ljava/lang/Double;

    .line 350
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$2;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->runnable:Ljava/lang/Runnable;

    .line 358
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$3;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->aMapLocationListener:Lcom/amap/api/location/AMapLocationListener;

    .line 1451
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$18;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$18;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mHandler:Landroid/os/Handler;

    .line 295
    return-void
.end method

.method public constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/StartBindListener;)V
    .locals 2

    .line 289
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->isAgreeLicence:Z

    .line 249
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLockscreenStatus:I

    .line 274
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->latitude:Ljava/lang/Double;

    .line 275
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->longitude:Ljava/lang/Double;

    .line 350
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$2;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->runnable:Ljava/lang/Runnable;

    .line 358
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$3;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->aMapLocationListener:Lcom/amap/api/location/AMapLocationListener;

    .line 1451
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$18;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$18;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mHandler:Landroid/os/Handler;

    .line 290
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->bindListener:Lcom/huawei/nfc/carrera/ui/bindcard/StartBindListener;

    .line 291
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Ljava/lang/Runnable;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->runnable:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Landroid/os/Handler;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Z
    .locals 1

    .line 75
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkCvv2()Z

    move-result v0

    return v0
.end method

.method static synthetic access$1100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->throwCvv2Error()V

    return-void
.end method

.method static synthetic access$1200(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;Lcom/huawei/pay/ui/widget/ClearEditText;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->showDatePickerDialog(Lcom/huawei/pay/ui/widget/ClearEditText;)V

    return-void
.end method

.method static synthetic access$1300(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Z
    .locals 1

    .line 75
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkIdNum()Z

    move-result v0

    return v0
.end method

.method static synthetic access$1400(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->throwIdNumError()V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Lcom/amap/api/location/LocationManagerProxy;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->stopLocation()V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->refreshCardNameIconInfo(Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)[Landroid/widget/EditText;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->validButtonState()V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Z
    .locals 1

    .line 75
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkPhoneNum()Z

    move-result v0

    return v0
.end method

.method static synthetic access$800(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->throwPhoneError()V

    return-void
.end method

.method static synthetic access$900(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;I)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->showInfoDialog(I)V

    return-void
.end method

.method private checkAndFillInCardInfo(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)Z
    .locals 7

    .line 580
    const/4 v4, 0x0

    .line 581
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardType:I

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->setCardType(I)V

    .line 582
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardNum:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->setCardNum(Ljava/lang/String;)V

    .line 583
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->issuerId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->setIssuerId(Ljava/lang/String;)V

    .line 584
    invoke-static {}, Lcom/huawei/nfc/carrera/server/card/model/CaptureMethod;->getMode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->setCaptureMethod(Ljava/lang/String;)V

    .line 585
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====123===location longitude"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->longitude:Ljava/lang/Double;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "latitude"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->latitude:Ljava/lang/Double;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->longitude:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->latitude:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    if-eqz v0, :cond_3

    .line 589
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->longitude:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->formatMoneyByTwoPoint(D)Ljava/lang/String;

    move-result-object v5

    .line 590
    const-string v0, "-"

    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 591
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 594
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->latitude:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->formatMoneyByTwoPoint(D)Ljava/lang/String;

    move-result-object v6

    .line 595
    const-string v0, "-"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 596
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 599
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->setLocation(Ljava/lang/String;)V

    .line 602
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardKeyList:[Z

    const/4 v1, 0x3

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_4

    .line 604
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkPhoneValid(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)Z

    move-result v4

    .line 605
    const/4 v0, 0x0

    if-ne v0, v4, :cond_4

    .line 607
    const/4 v0, 0x0

    return v0

    .line 611
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardKeyList:[Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_5

    .line 613
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkPwdValid(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)Z

    move-result v4

    .line 614
    const/4 v0, 0x0

    if-ne v0, v4, :cond_5

    .line 616
    const/4 v0, 0x0

    return v0

    .line 620
    :cond_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardKeyList:[Z

    const/4 v1, 0x1

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_6

    .line 622
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkDateValid(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)Z

    move-result v4

    .line 623
    const/4 v0, 0x0

    if-ne v0, v4, :cond_6

    .line 625
    const/4 v0, 0x0

    return v0

    .line 629
    :cond_6
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardKeyList:[Z

    const/4 v1, 0x2

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_7

    .line 631
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkCvvValid(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)Z

    move-result v4

    .line 632
    const/4 v0, 0x0

    if-ne v0, v4, :cond_7

    .line 634
    const/4 v0, 0x0

    return v0

    .line 638
    :cond_7
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardKeyList:[Z

    const/4 v1, 0x4

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_8

    .line 640
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkIdNumValid(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)Z

    move-result v4

    .line 641
    const/4 v0, 0x0

    if-ne v0, v4, :cond_8

    .line 643
    const/4 v0, 0x0

    return v0

    .line 647
    :cond_8
    const/4 v0, 0x1

    return v0
.end method

.method private checkCvv2()Z
    .locals 3

    .line 1266
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    .line 1268
    const-string v0, "YES"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    const-string v2, "\\d{3}"

    invoke-static {v1, v2}, Lo/dtb;->e(Landroid/widget/TextView;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 1273
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private checkCvvValid(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)Z
    .locals 3

    .line 725
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 727
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->setCvv2(Ljava/lang/String;)V

    .line 728
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getCvv2()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 730
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_input_legal_cvvcode_toast:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 731
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    .line 732
    const/4 v0, 0x0

    return v0

    .line 736
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->setErrorIconDismiss(Landroid/widget/EditText;)V

    .line 739
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private checkDateValid(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)Z
    .locals 5

    .line 700
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 702
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 703
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 705
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v3, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x5

    invoke-virtual {v3, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->setDate(Ljava/lang/String;)V

    .line 708
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getDate()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 710
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_input_legal_date_toast:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 711
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    .line 712
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/widget/EditText;->callOnClick()Z

    .line 713
    const/4 v0, 0x0

    return v0

    .line 717
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->setErrorIconDismiss(Landroid/widget/EditText;)V

    .line 720
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private checkIdNum()Z
    .locals 3

    .line 1327
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    .line 1329
    const-string v0, "YES"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    const-string v2, "\\d{15}|\\d{17}[0-9Xx]"

    invoke-static {v1, v2}, Lo/dtb;->e(Landroid/widget/TextView;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 1334
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private checkIdNumValid(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)Z
    .locals 3

    .line 744
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 746
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->setIdNum(Ljava/lang/String;)V

    .line 747
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getIdNum()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 749
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->hwpay_idcard_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 750
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    .line 751
    const/4 v0, 0x0

    return v0

    .line 755
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->setErrorIconDismiss(Landroid/widget/EditText;)V

    .line 758
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private checkPhoneNum()Z
    .locals 3

    .line 1307
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    .line 1309
    const-string v0, "YES"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    const-string v2, "[1]{1}\\d{10}"

    invoke-static {v1, v2}, Lo/dtb;->e(Landroid/widget/TextView;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 1314
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private checkPhoneValid(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)Z
    .locals 3

    .line 652
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 654
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->setPhone(Ljava/lang/String;)V

    .line 655
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getPhone()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 657
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_input_legal_phone_toast:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 658
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    .line 659
    const/4 v0, 0x0

    return v0

    .line 663
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->setErrorIconDismiss(Landroid/widget/EditText;)V

    .line 666
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private checkPsw()Z
    .locals 3

    .line 1283
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-eqz v0, :cond_1

    .line 1285
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1286
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 1288
    const/4 v0, 0x1

    return v0

    .line 1292
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 1297
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private checkPwdValid(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)Z
    .locals 4

    .line 671
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 673
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    instance-of v0, v0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    if-eqz v0, :cond_0

    .line 675
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    check-cast v0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->getEnctyptText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->setPwd(Ljava/lang/String;)V

    goto :goto_0

    .line 679
    :cond_0
    const-string v0, "keyboard type err!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 682
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 683
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    .line 685
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_input_legal_passwd_toast:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 686
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    .line 687
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 688
    const/4 v0, 0x0

    return v0

    .line 692
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->setErrorIconDismiss(Landroid/widget/EditText;)V

    .line 695
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private checkWatchStatusAndNextStep()V
    .locals 2

    .line 1423
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1448
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 1449
    return-void
.end method

.method private getCardInfo()[Z
    .locals 3

    .line 779
    const/4 v0, 0x5

    new-array v2, v0, [Z

    .line 780
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->issuerMode:I

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->issuerMode:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_3

    .line 782
    :cond_0
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardType:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 784
    const/4 v0, 0x1

    const/4 v1, 0x0

    aput-boolean v0, v2, v1

    .line 785
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput-boolean v0, v2, v1

    .line 786
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput-boolean v0, v2, v1

    .line 787
    const/4 v0, 0x1

    const/4 v1, 0x3

    aput-boolean v0, v2, v1

    goto :goto_0

    .line 789
    :cond_1
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardType:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 791
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput-boolean v0, v2, v1

    .line 792
    const/4 v0, 0x1

    const/4 v1, 0x1

    aput-boolean v0, v2, v1

    .line 793
    const/4 v0, 0x1

    const/4 v1, 0x2

    aput-boolean v0, v2, v1

    .line 794
    const/4 v0, 0x1

    const/4 v1, 0x3

    aput-boolean v0, v2, v1

    goto :goto_0

    .line 798
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can not identify issuerMode! cardType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 803
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can not identify issuerMode! issuerMode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->issuerMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 805
    :goto_0
    return-object v2
.end method

.method private getCardNumEndFour(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 769
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getPositionByMobileNet()V
    .locals 4

    .line 331
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getPositionByMobileNet"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/amap/api/location/LocationManagerProxy;->getInstance(Landroid/app/Activity;)Lcom/amap/api/location/LocationManagerProxy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    .line 333
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 334
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 343
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 346
    :cond_0
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave getPositionByMobileNet"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    return-void
.end method

.method private hideSoftInputWindow(Landroid/view/View;)V
    .locals 3

    .line 1406
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 1407
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 1408
    return-void
.end method

.method private initCVV2()V
    .locals 8

    .line 977
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->card_info_cvv2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/ViewStub;

    .line 978
    invoke-virtual {v3}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v4

    .line 980
    sget v0, Lcom/huawei/wallet/R$id;->cardinfo_title_tx:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 981
    sget v0, Lcom/huawei/wallet/R$string;->secure_code:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(I)V

    .line 983
    sget v0, Lcom/huawei/wallet/R$id;->cardinfo_input_edittx:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pay/ui/widget/ClearEditText;

    .line 984
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setInputType(I)V

    .line 985
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_cvv2_tip:I

    invoke-virtual {v6, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setHint(I)V

    .line 986
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 988
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v6, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setFilters([Landroid/text/InputFilter;)V

    .line 990
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x2

    aput-object v6, v0, v1

    .line 991
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$9;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$9;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-static {v0, v1}, Lo/dtb;->a(Landroid/widget/EditText;Lo/dsz;)V

    .line 1000
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$10;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$10;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 1022
    sget v0, Lcom/huawei/wallet/R$id;->cardinfo_tips_img:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 1023
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1024
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$11;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$11;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1032
    return-void
.end method

.method private initDate()V
    .locals 7

    .line 1039
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->card_info_valid_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewStub;

    .line 1040
    invoke-virtual {v2}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v3

    .line 1042
    sget v0, Lcom/huawei/wallet/R$id;->cardinfo_title_tx:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 1043
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_card_date_for_tip:I

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(I)V

    .line 1045
    sget v0, Lcom/huawei/wallet/R$id;->cardinfo_input_edittx:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pay/ui/widget/ClearEditText;

    .line 1046
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setClickable(Z)V

    .line 1047
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setFocusable(Z)V

    .line 1048
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setCursorVisible(Z)V

    .line 1049
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setClearFunctionEnable(Z)V

    .line 1050
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_cardinfo_data:I

    invoke-virtual {v5, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setHint(I)V

    .line 1051
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$12;

    invoke-direct {v0, p0, v5}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$12;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;Lcom/huawei/pay/ui/widget/ClearEditText;)V

    invoke-virtual {v5, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1059
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x1

    aput-object v5, v0, v1

    .line 1061
    sget v0, Lcom/huawei/wallet/R$id;->cardinfo_tips_img:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 1062
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1063
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$13;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$13;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1071
    return-void
.end method

.method private initIdNum()V
    .locals 9

    .line 1078
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->card_info_idnum:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewStub;

    .line 1079
    invoke-virtual {v4}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v5

    .line 1081
    sget v0, Lcom/huawei/wallet/R$id;->cardinfo_title_tx:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 1082
    sget v0, Lcom/huawei/wallet/R$string;->hwpay_cardinfo_id_card_id:I

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(I)V

    .line 1084
    sget v0, Lcom/huawei/wallet/R$id;->cardinfo_input_edittx:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pay/ui/widget/ClearEditText;

    .line 1085
    const/4 v0, 0x2

    invoke-virtual {v7, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setInputType(I)V

    .line 1086
    sget v0, Lcom/huawei/wallet/R$string;->hwpay_input_id_card_tips:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0x12

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setHint(Ljava/lang/CharSequence;)V

    .line 1088
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v7, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setFilters([Landroid/text/InputFilter;)V

    .line 1090
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x4

    aput-object v7, v0, v1

    .line 1091
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$14;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$14;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-static {v0, v1}, Lo/dtb;->a(Landroid/widget/EditText;Lo/dsz;)V

    .line 1100
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$15;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$15;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 1122
    sget v0, Lcom/huawei/wallet/R$id;->cardinfo_tips_img:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 1123
    const/4 v0, 0x4

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1124
    return-void
.end method

.method private initPWD()V
    .locals 6

    .line 858
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->open_card_info_pwd:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/RelativeLayout;

    .line 859
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 860
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->cardinfo_pwd_title_tx:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 861
    sget v0, Lcom/huawei/wallet/R$string;->hwpay_cardinfo_id_pwd:I

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(I)V

    .line 862
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->issuerMode:I

    const/16 v1, 0xd

    if-ne v0, v1, :cond_1

    .line 865
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->cup_cardinfo_pwd_input_edittx:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    .line 866
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->setRecvTouchEventActivity(Landroid/app/Activity;)V

    .line 867
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->setVisibility(I)V

    .line 868
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->setFilters([Landroid/text/InputFilter;)V

    .line 870
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardNum:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->setFpan(Ljava/lang/String;)V

    .line 871
    sget v0, Lcom/huawei/wallet/R$string;->hwpay_cardinfo_id_pwd_hint:I

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->setHint(I)V

    .line 872
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aput-object v5, v0, v1

    .line 873
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    .line 875
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/wallet/R$id;->cup_cardinfo_pwd_input_edittx:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setNextFocusDownId(I)V

    .line 876
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$4;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 892
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$5;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-static {v0, v1}, Lo/dtb;->a(Landroid/widget/EditText;Lo/dsz;)V

    .line 901
    goto :goto_0

    .line 904
    :cond_1
    const-string v0, "There is no this keyboard"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 906
    :goto_0
    return-void
.end method

.method private initPhone()V
    .locals 8

    .line 913
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->card_info_phone:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/ViewStub;

    .line 914
    invoke-virtual {v3}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v4

    .line 916
    sget v0, Lcom/huawei/wallet/R$id;->cardinfo_title_tx:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 917
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_bank_telephone:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(I)V

    .line 919
    sget v0, Lcom/huawei/wallet/R$id;->cardinfo_input_edittx:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pay/ui/widget/ClearEditText;

    .line 920
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setInputType(I)V

    .line 921
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_bank_phoen_hint:I

    invoke-virtual {v6, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setHint(I)V

    .line 922
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v6, v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->setFilters([Landroid/text/InputFilter;)V

    .line 924
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x3

    aput-object v6, v0, v1

    .line 926
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$6;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$6;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-static {v0, v1}, Lo/dtb;->a(Landroid/widget/EditText;Lo/dsz;)V

    .line 935
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$7;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$7;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 960
    sget v0, Lcom/huawei/wallet/R$id;->cardinfo_tips_img:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 961
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 962
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$8;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$8;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 970
    return-void
.end method

.method private initViewStub([Z)V
    .locals 3

    .line 818
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    if-nez v0, :cond_0

    .line 820
    const/4 v0, 0x5

    new-array v0, v0, [Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    .line 822
    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v0, 0x5

    if-ge v2, v0, :cond_1

    .line 824
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aput-object v1, v0, v2

    .line 822
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 827
    :cond_1
    const/4 v0, 0x1

    aget-boolean v0, p1, v0

    if-eqz v0, :cond_2

    .line 829
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->initDate()V

    .line 832
    :cond_2
    const/4 v0, 0x2

    aget-boolean v0, p1, v0

    if-eqz v0, :cond_3

    .line 834
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->initCVV2()V

    .line 837
    :cond_3
    const/4 v0, 0x3

    aget-boolean v0, p1, v0

    if-eqz v0, :cond_4

    .line 839
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->initPhone()V

    .line 842
    :cond_4
    const/4 v0, 0x0

    aget-boolean v0, p1, v0

    if-eqz v0, :cond_5

    .line 844
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->initPWD()V

    .line 847
    :cond_5
    const/4 v0, 0x4

    aget-boolean v0, p1, v0

    if-eqz v0, :cond_6

    .line 849
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->initIdNum()V

    .line 851
    :cond_6
    return-void
.end method

.method private initViews()V
    .locals 2

    .line 449
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->bank_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->bankIconView:Landroid/widget/ImageView;

    .line 450
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->bank_name:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->bankNameView:Landroid/widget/TextView;

    .line 451
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->nfc_card_end_number:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardEndNum:Landroid/widget/TextView;

    .line 452
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->nfc_card_type_credit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardCardType:Landroid/widget/TextView;

    .line 455
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->agree_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceAgreeView:Landroid/widget/CheckBox;

    .line 456
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceAgreeView:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->nfc_wallet_use_licence_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceTermsTitle:Landroid/widget/TextView;

    .line 458
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceTermsTitle:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 459
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->nfc_wallet_use_agreements_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceAgreemntsTitle:Landroid/widget/TextView;

    .line 460
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceAgreemntsTitle:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 461
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->nfc_wallet_use_licence_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceTermsLayout:Landroid/widget/LinearLayout;

    .line 462
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->nfc_wallet_use_agreements_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceAgreementsLayout:Landroid/widget/LinearLayout;

    .line 463
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->nfc_wallet_use_agreements_title_and:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->andText:Landroid/widget/TextView;

    .line 466
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->bind_card_next_step:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->nextStepText:Lo/egd;

    .line 467
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->nextStepText:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 468
    return-void
.end method

.method private refreshCardNameIconInfo(Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)V
    .locals 3

    .line 487
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getIssuerName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 489
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->bankNameView:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getIssuerName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 492
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardEndNum:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_end_number:I

    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardNum:Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getCardNumEndFour(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 494
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardType:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 496
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardCardType:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_type_debit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 497
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getDebitTermsUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceTermsTitleUrl:Ljava/lang/String;

    .line 498
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceTermsTitle:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getDebitTermsTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 502
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardCardType:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_type_credit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 503
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getCreditTermsUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceTermsTitleUrl:Ljava/lang/String;

    .line 504
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceTermsTitle:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getCreditTermsTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 507
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceTermsTitleUrl:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getBankAgreementUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 509
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->nextStepText:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 510
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->isAgreeLicence:Z

    .line 511
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceTermsLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 513
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getBankAgreementUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 515
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceAgreementsLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 519
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceAgreemntsTitle:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getBankAgreementTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 520
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getBankAgreementUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceAgreementsTitleUrl:Ljava/lang/String;

    .line 521
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceTermsTitleUrl:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 523
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->andText:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 526
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->bankIconView:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getLogoIcon()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 527
    return-void
.end method

.method private reportBI()V
    .locals 2

    .line 569
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->issuerId:Ljava/lang/String;

    invoke-interface {v0, v1, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryBankIssuerInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V

    .line 570
    return-void
.end method

.method private showDatePickerDialog(Lcom/huawei/pay/ui/widget/ClearEditText;)V
    .locals 10

    .line 1203
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mCustomDatePickerDialog:Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;

    if-nez v0, :cond_0

    .line 1206
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 1207
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v7, v0, 0x1

    .line 1208
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Ljava/util/Calendar;->get(I)I

    move-result v8

    .line 1209
    const/16 v9, 0xf

    .line 1210
    new-instance v0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$ValidDateListener;

    invoke-direct {v2, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$ValidDateListener;-><init>(Lcom/huawei/pay/ui/widget/ClearEditText;)V

    move v3, v7

    move v4, v8

    move v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mCustomDatePickerDialog:Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;

    .line 1212
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mCustomDatePickerDialog:Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->show(Z)V

    .line 1213
    return-void
.end method

.method private showInfoDialog(I)V
    .locals 8

    .line 1139
    new-instance v3, Lo/egw$c;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 1141
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$layout;->nfc_info_dialog:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 1142
    sget v0, Lcom/huawei/wallet/R$id;->info_body_image:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 1143
    sget v0, Lcom/huawei/wallet/R$id;->info_body_txt:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 1145
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1148
    :pswitch_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_tips_cvv2_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    .line 1149
    sget v0, Lcom/huawei/wallet/R$drawable;->cvv2_tip:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1150
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_tips_cvv2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1151
    goto :goto_1

    .line 1153
    :pswitch_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->hwpay_phone_img_tips_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    .line 1154
    sget v0, Lcom/huawei/wallet/R$drawable;->phone_tips:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1155
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->hwpay_phone_img_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1156
    goto :goto_1

    .line 1158
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_tips_date_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    .line 1159
    sget v0, Lcom/huawei/wallet/R$drawable;->dead_date_tip:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1160
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_tips_date:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1161
    goto :goto_1

    .line 1163
    :goto_0
    const-string v0, "BindCardInputFragment"

    const-string v1, "showInfoDialog, unknown which"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1166
    :goto_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_cvv_code_introduction_ok:I

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$16;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$16;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-virtual {v3, v0, v1}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 1171
    invoke-virtual {v3, v4}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    .line 1172
    invoke-virtual {v3}, Lo/egw$c;->e()Lo/egw;

    move-result-object v7

    .line 1173
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/egw;->setCancelable(Z)V

    .line 1174
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/egw;->setCanceledOnTouchOutside(Z)V

    .line 1175
    invoke-virtual {v7}, Lo/egw;->show()V

    .line 1176
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private stopLocation()V
    .locals 4

    .line 394
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "================Enter stopLocation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    if-eqz v0, :cond_0

    .line 397
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->aMapLocationListener:Lcom/amap/api/location/AMapLocationListener;

    invoke-virtual {v0, v1}, Lcom/amap/api/location/LocationManagerProxy;->removeUpdates(Lcom/amap/api/location/AMapLocationListener;)V

    .line 398
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    invoke-virtual {v0}, Lcom/amap/api/location/LocationManagerProxy;->destroy()V

    .line 400
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    .line 401
    return-void
.end method

.method private throwCvv2Error()V
    .locals 3

    .line 1346
    sget v2, Lcom/huawei/wallet/R$string;->huaweipay_cvv2_error:I

    .line 1347
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    .line 1348
    return-void
.end method

.method private throwIdNumError()V
    .locals 3

    .line 1371
    sget v2, Lcom/huawei/wallet/R$string;->hwpay_idcard_error:I

    .line 1372
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    .line 1373
    return-void
.end method

.method private throwPhoneError()V
    .locals 3

    .line 1359
    sget v2, Lcom/huawei/wallet/R$string;->huaweipay_telephone_error:I

    .line 1360
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardInfoList:[Landroid/widget/EditText;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    .line 1361
    return-void
.end method

.method private validButtonState()V
    .locals 2

    .line 1391
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkCvv2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkPhoneNum()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkIdNum()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->isAgreeLicence:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkPsw()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1393
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->nextStepText:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    goto :goto_0

    .line 1397
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->nextStepText:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 1399
    :goto_0
    return-void
.end method


# virtual methods
.method public bindCardInputNextStep()V
    .locals 5

    .line 1465
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====123=== bindCardInputNextStep \u70b9\u51fb\u8fdb\u5165\u4e0b\u4e00\u6b65"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1466
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;-><init>()V

    .line 1467
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkAndFillInCardInfo(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1468
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "info filled error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1469
    return-void

    .line 1472
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1473
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rootView is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1474
    return-void

    .line 1478
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->hideSoftInputWindow(Landroid/view/View;)V

    .line 1479
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->bindListener:Lcom/huawei/nfc/carrera/ui/bindcard/StartBindListener;

    invoke-interface {v0, v4}, Lcom/huawei/nfc/carrera/ui/bindcard/StartBindListener;->startBind(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)V

    .line 1481
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->reportBI()V

    .line 1482
    return-void
.end method

.method protected destroyLoadingDialog()V
    .locals 4

    .line 1485
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1486
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 1487
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLoadingDialog21:Lo/egn;

    .line 1488
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy mLoadingDialog21"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1490
    :cond_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 1510
    invoke-super {p0, p1, p2, p3}, Landroid/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 1511
    const/16 v0, 0xde

    if-ne v0, p1, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 1512
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult resultCode \uff1a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; requestCode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1513
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->bindCardInputNextStep()V

    goto :goto_0

    .line 1515
    :cond_0
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No this resultCode in onActivityResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1517
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 533
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 534
    sget v0, Lcom/huawei/wallet/R$id;->agree_view:I

    if-ne v0, v4, :cond_1

    .line 536
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 537
    invoke-virtual {p1}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 538
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->isAgreeLicence:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->isAgreeLicence:Z

    .line 539
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->validButtonState()V

    goto/16 :goto_1

    .line 541
    :cond_1
    sget v0, Lcom/huawei/wallet/R$id;->nfc_wallet_use_licence_title:I

    if-ne v0, v4, :cond_2

    .line 543
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 544
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 545
    const-string v0, "webview_title"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceTermsTitle:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 546
    const-string v0, "webview_url"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceTermsTitleUrl:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 547
    invoke-virtual {p0, v5}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->startActivity(Landroid/content/Intent;)V

    .line 548
    goto :goto_1

    .line 549
    :cond_2
    sget v0, Lcom/huawei/wallet/R$id;->nfc_wallet_use_agreements_title:I

    if-ne v0, v4, :cond_3

    .line 551
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 552
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 553
    const-string v0, "webview_title"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceAgreemntsTitle:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 554
    const-string v0, "webview_url"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->licenceAgreementsTitleUrl:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 555
    invoke-virtual {p0, v5}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->startActivity(Landroid/content/Intent;)V

    .line 556
    goto :goto_1

    .line 557
    :cond_3
    sget v0, Lcom/huawei/wallet/R$id;->bind_card_next_step:I

    if-ne v0, v4, :cond_4

    .line 559
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====123===\u70b9\u51fb\u8fdb\u5165\u4e0b\u4e00\u6b65"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkWatchStatusAndNextStep()V

    .line 562
    :cond_4
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 300
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 301
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    .line 302
    const-string v0, "issuer_id"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->issuerId:Ljava/lang/String;

    .line 303
    const-string v0, "card_num"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dtj;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardNum:Ljava/lang/String;

    .line 304
    const-string v0, "card_type"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardType:I

    .line 305
    const-string v0, "issuer_mode"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->issuerMode:I

    .line 306
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/PluginPayAdapter;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    .line 307
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 312
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 313
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x2000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 315
    :cond_0
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_fragment_bind_card_input:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    .line 316
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getCardInfo()[Z

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardKeyList:[Z

    .line 317
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->initViews()V

    .line 318
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->cardKeyList:[Z

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->initViewStub([Z)V

    .line 319
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->issuerId:Ljava/lang/String;

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$MyQueryBankIssuerInfoCallback;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$MyQueryBankIssuerInfoCallback;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryBankIssuerInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V

    .line 321
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123====Enter onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getPositionByMobileNet()V

    .line 326
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->rootView:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1521
    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    .line 1522
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->runnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1523
    return-void
.end method

.method public queryBankIssuerInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)V
    .locals 4

    .line 1413
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1414
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getIssuerName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->issuerId:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/util/NfcHianalyticsUtil;->onReportForCardOpenAction(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1416
    :cond_0
    return-void
.end method

.method protected setErrorIconDismiss(Landroid/widget/EditText;)V
    .locals 2

    .line 1380
    if-eqz p1, :cond_0

    .line 1382
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$drawable;->huaweipay_cardpay_nextbtn:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V

    .line 1384
    :cond_0
    return-void
.end method

.method protected showLoadingDialog(I)V
    .locals 4

    .line 1496
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1497
    new-instance v0, Lo/egn;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLoadingDialog21:Lo/egn;

    .line 1498
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLoadingDialog21:Lo/egn;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 1499
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 1500
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    goto :goto_0

    .line 1502
    :cond_0
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingDialog21 is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1505
    :goto_0
    return-void
.end method

.class public Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;
.super Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;


# static fields
.field private static final CARDINFO_MASSAGE_DELETE_LOAD:I = 0x5

.field private static final CARDINFO_MASSAGE_DISMSS_LOAD:I = 0x2

.field private static final CARDINFO_MASSAGE_REFRESH_VIEW:I = 0x3

.field private static final HANDLER_MASSAGE_SHOW_BACK_ACTIVITY:I = 0x7

.field private static final HANDLER_MASSAGE_SHOW_LODING:I = 0x1

.field private static final HANDLER_MASSAGE_SHOW_SETLOCK_DIALOG:I = 0x6

.field private static final HANDLER_MASSAGE_SHOW_UNLOCK_DIALOG:I = 0x4

.field private static final LOCK_SCREEN:I = 0x1

.field private static final LOCK_SCREEN_NORMAL_STATE:I = 0x0

.field private static final LOCK_SCREEN_NOT_SET_OR_NOT_ACTIVE:I = 0x2

.field private static final LOCK_SCREEN_UNENABLE_LOCK:I = 0x3

.field private static final LOCK_SCREEN_UNENABLE_NOT_ACTIVE:I = 0x4

.field private static final REQUEST_WATCH_TO_SET_THE_ACTIVE:Ljava/lang/String; = "com.huawei.bone.ActiveAdminScreen"

.field private static final REQUEST_WATCH_TO_SET_THE_LOCK_SCREEN:Ljava/lang/String; = "com.huawei.bone.UnlockScreen"

.field private static final REQUEST_WATCH_TO_SET_THE_LOCK_SCREEN_PASSWORD:Ljava/lang/String; = "com.huawei.bone.LockPassword"

.field private static final TAG:Ljava/lang/String; = "CardLockScreenActivity"


# instance fields
.field private fromPage:Ljava/lang/String;

.field private isStatusNotChange:Z

.field private mCardLockScreenContentLly:Landroid/widget/LinearLayout;

.field private mCardLockScreenMultiContentLly:Landroid/widget/LinearLayout;

.field private mContext:Landroid/content/Context;

.field private mCustomDlg:Lo/egw;

.field private mDialogMsg:Ljava/lang/String;

.field private mDialogRightBtnMsg:Ljava/lang/String;

.field private mHandler:Landroid/os/Handler;

.field private mLockScreenTv:Landroid/widget/TextView;

.field private mLockScreeniImageV:Landroid/widget/ImageView;

.field private mMode:I

.field private mNextButton:Lo/egd;

.field private mNoTitleDlg:Lo/egy;

.field private mReferenceId:Ljava/lang/String;

.field private mSetLockScreenButton:Lo/egd;

.field private mSetLockScreeniImageV:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;-><init>()V

    .line 64
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->fromPage:Ljava/lang/String;

    .line 67
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogMsg:Ljava/lang/String;

    .line 69
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogRightBtnMsg:Ljava/lang/String;

    .line 71
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mMode:I

    .line 73
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mReferenceId:Ljava/lang/String;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNoTitleDlg:Lo/egy;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCustomDlg:Lo/egw;

    .line 120
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->isStatusNotChange:Z

    .line 362
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$3;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->isStatusNotChange:Z

    return v0
.end method

.method static synthetic access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogMsg:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$102(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Z)Z
    .locals 0

    .line 37
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->isStatusNotChange:Z

    return p1
.end method

.method static synthetic access$1100(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showDialogUnlock(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1200(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->backActivity()V

    return-void
.end method

.method static synthetic access$1300(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Lo/egw;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCustomDlg:Lo/egw;

    return-object v0
.end method

.method static synthetic access$1302(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Lo/egw;)Lo/egw;
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCustomDlg:Lo/egw;

    return-object p1
.end method

.method static synthetic access$1400(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->refreshStatus()V

    return-void
.end method

.method static synthetic access$1500(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Lo/egy;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNoTitleDlg:Lo/egy;

    return-object v0
.end method

.method static synthetic access$1502(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Lo/egy;)Lo/egy;
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNoTitleDlg:Lo/egy;

    return-object p1
.end method

.method static synthetic access$1600(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->goToBankCardCaptureActivity()V

    return-void
.end method

.method static synthetic access$1700(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->goToInputCardNumActivity(Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->fromPage:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;I)Ljava/lang/String;
    .locals 1

    .line 37
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getWatchLockscreen(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->setWatchLockscreen(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;I)V
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showLoadingDialog(I)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V
    .locals 0

    .line 37
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->destroyLoadingDialog()V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;I)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->refreshLockView(I)V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showDialogSetlock()V

    return-void
.end method

.method static synthetic access$900(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;I)V
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showLoadingDialog(I)V

    return-void
.end method

.method private backActivity()V
    .locals 3

    .line 346
    const-string v0, "AddBankOrBusCardActivity"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->fromPage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 347
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->skipToBankCardCaptureActivity()V

    .line 348
    return-void

    .line 349
    :cond_0
    const-string v0, "CardInfoDetailActivity"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->fromPage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 350
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->toDeleteCard()V

    .line 351
    return-void

    .line 355
    :cond_1
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 357
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->setResult(ILandroid/content/Intent;)V

    .line 359
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->finish()V

    .line 360
    return-void
.end method

.method private getWatchLockscreen(I)Ljava/lang/String;
    .locals 2

    .line 239
    const-string v1, ""

    .line 241
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 242
    const-string v1, "com.huawei.bone.UnlockScreen"

    goto :goto_0

    .line 244
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 245
    const-string v1, "com.huawei.bone.LockPassword"

    goto :goto_0

    .line 247
    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 248
    const-string v1, "com.huawei.bone.UnlockScreen"

    goto :goto_0

    .line 250
    :cond_2
    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    .line 251
    const-string v1, "com.huawei.bone.ActiveAdminScreen"

    .line 253
    :cond_3
    :goto_0
    return-object v1
.end method

.method private goToBankCardCaptureActivity()V
    .locals 5

    .line 481
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goToBankCardCaptureActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    new-instance v4, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;

    invoke-direct {v4}, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;-><init>()V

    .line 484
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$9;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    invoke-virtual {v4, p0, v0}, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;->b(Landroid/app/Activity;Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;)V

    .line 506
    return-void
.end method

.method private goToInputCardNumActivity(Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V
    .locals 3

    .line 515
    invoke-static {}, Lcom/huawei/nfc/carrera/server/card/model/CaptureMethod;->setCameraMode()V

    .line 517
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 518
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 520
    const-string v0, "card_num"

    invoke-virtual {p1}, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 521
    const-string v0, "card_img"

    invoke-virtual {p1}, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;->e()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 524
    :cond_0
    const-class v0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 525
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->startActivity(Landroid/content/Intent;)V

    .line 527
    return-void
.end method

.method private jumpToActivity()V
    .locals 2

    .line 275
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 323
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 324
    return-void
.end method

.method private refreshLockView(I)V
    .locals 4

    .line 164
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " refreshLockView : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 168
    const-string v0, "AddBankOrBusCardActivity"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->fromPage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "BindCardActivity"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->fromPage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    :cond_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogRightBtnMsg:Ljava/lang/String;

    .line 170
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenMultiContentLly:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 171
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenContentLly:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 172
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mSetLockScreenButton:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_goto_setting:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNextButton:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_finish_setting:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockScreeniImageV:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 175
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mSetLockScreeniImageV:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 176
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_unlocked_and_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showHead(I)V

    goto/16 :goto_1

    .line 177
    :cond_1
    const-string v0, "CardInfoDetailActivity"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->fromPage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 178
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_unlocked_screen_meaasge:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogMsg:Ljava/lang/String;

    .line 179
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_unlocked:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogRightBtnMsg:Ljava/lang/String;

    .line 180
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenMultiContentLly:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 181
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenContentLly:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 182
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockScreenTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_unlocked_screen_meaasge:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 183
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mSetLockScreenButton:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_goto_unlocked:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 184
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNextButton:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_finish_unlocked:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockScreeniImageV:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 186
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mSetLockScreeniImageV:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 187
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_unlocked_watch:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showHead(I)V

    goto/16 :goto_1

    .line 191
    :cond_2
    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 192
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_nfc_bt_lock_cannot_next_unlocked_password:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogMsg:Ljava/lang/String;

    .line 193
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogRightBtnMsg:Ljava/lang/String;

    .line 194
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenMultiContentLly:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 195
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenContentLly:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 197
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockScreenTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_add_card_unlocked_password:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 198
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockScreeniImageV:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 199
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mSetLockScreeniImageV:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 200
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNextButton:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_finish_setting:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mSetLockScreenButton:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_goto_setting:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 202
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_screen_password:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showHead(I)V

    goto/16 :goto_1

    .line 204
    :cond_3
    const/4 v0, 0x3

    if-ne p1, v0, :cond_7

    .line 206
    const-string v0, "AddBankOrBusCardActivity"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->fromPage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "BindCardActivity"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->fromPage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 207
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockScreenTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_add_card_unlocked:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 208
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_cannot_next_message:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogMsg:Ljava/lang/String;

    .line 209
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenMultiContentLly:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 210
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenContentLly:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 211
    :cond_5
    const-string v0, "CardInfoDetailActivity"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->fromPage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 212
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockScreenTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_unlocked_screen_meaasge:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 213
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_unlocked_screen_meaasge:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogMsg:Ljava/lang/String;

    .line 214
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenMultiContentLly:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 215
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenContentLly:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 217
    :cond_6
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNextButton:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_finish_unlocked:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mSetLockScreenButton:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_goto_unlocked:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 219
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_unlocked:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogRightBtnMsg:Ljava/lang/String;

    .line 220
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockScreeniImageV:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 221
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mSetLockScreeniImageV:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 222
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_unlocked_watch:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showHead(I)V

    goto :goto_1

    .line 224
    :cond_7
    const/4 v0, 0x4

    if-ne p1, v0, :cond_8

    .line 225
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenMultiContentLly:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 226
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenContentLly:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 227
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_open_huawei_wallet:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogMsg:Ljava/lang/String;

    .line 228
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_set_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogRightBtnMsg:Ljava/lang/String;

    .line 229
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockScreenTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_add_card_condition:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 230
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockScreeniImageV:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 231
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mSetLockScreeniImageV:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 232
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNextButton:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_finish_activity:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 233
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mSetLockScreenButton:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_lock_goto_activity:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 234
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_activity_administrator:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showHead(I)V

    .line 236
    :cond_8
    :goto_1
    return-void
.end method

.method private refreshStatus()V
    .locals 2

    .line 328
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 341
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 342
    return-void
.end method

.method private showDialogSetlock()V
    .locals 9

    .line 385
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCustomDlg:Lo/egw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 386
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCustomDlg:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 387
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDialogSetlock Already show!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    return-void

    .line 391
    :cond_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$layout;->act_lock_screen_setlock_dialog:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 392
    sget v0, Lcom/huawei/wallet/R$id;->act_lock_screen_dialog_tv:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 393
    sget v0, Lcom/huawei/wallet/R$id;->act_lock_screen_dialog_lly:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 394
    sget v0, Lcom/huawei/wallet/R$id;->act_lock_screen_dialog_multi_content_lly:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 395
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogMsg:Ljava/lang/String;

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 396
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 397
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 398
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 400
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 401
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 404
    :goto_0
    new-instance v8, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mContext:Landroid/content/Context;

    invoke-direct {v8, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 405
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_cannot_next:I

    invoke-virtual {v8, v0}, Lo/egw$c;->e(I)Lo/egw$c;

    .line 406
    sget v0, Lcom/huawei/wallet/R$string;->hwpay_dialog_no:I

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$4;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    invoke-virtual {v8, v0, v1}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 412
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogRightBtnMsg:Ljava/lang/String;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$5;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    invoke-virtual {v8, v0, v1}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    .line 418
    invoke-virtual {v8, v4}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    .line 419
    invoke-virtual {v8}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCustomDlg:Lo/egw;

    .line 420
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCustomDlg:Lo/egw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCancelable(Z)V

    .line 422
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCustomDlg:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 424
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCustomDlg:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 426
    :cond_2
    return-void
.end method

.method private showDialogUnlock(Ljava/lang/String;)V
    .locals 5

    .line 429
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNoTitleDlg:Lo/egy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 430
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNoTitleDlg:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 431
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDialogUnlock Already show!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    return-void

    .line 436
    :cond_0
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 437
    invoke-virtual {v0, p1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->hwpay_dialog_no:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$7;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    .line 438
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mDialogRightBtnMsg:Ljava/lang/String;

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$6;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    .line 445
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v4

    .line 452
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNoTitleDlg:Lo/egy;

    .line 453
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNoTitleDlg:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 454
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNoTitleDlg:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 455
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNoTitleDlg:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 457
    :cond_1
    return-void
.end method

.method private skipToBankCardCaptureActivity()V
    .locals 5

    .line 460
    invoke-static {}, Lo/dsx;->e()Lo/dsx;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dsx;->d(Landroid/content/Context;)V

    .line 462
    invoke-static {}, Lo/dsx;->e()Lo/dsx;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$8;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "android.permission.CAMERA"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, p0, v2}, Lo/dsx;->e(Lo/dsx$a;Landroid/app/Activity;[Ljava/lang/String;)V

    .line 475
    return-void
.end method


# virtual methods
.method public nullifyResultCallback(I)V
    .locals 5

    .line 549
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 550
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 553
    :pswitch_0
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nullifyResultCallback: Delete card success,go to NFC HomeFragment."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 556
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 557
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.wallet.ui.cardholder.CardHolderActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 558
    const/high16 v0, 0x4000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 559
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 560
    invoke-virtual {p0, v4}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->startActivity(Landroid/content/Intent;)V

    .line 561
    goto :goto_1

    .line 563
    :pswitch_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_instruction_delete_desc_new:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showToast(I)V

    .line 564
    goto :goto_1

    .line 566
    :pswitch_2
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bindcard_error_connection_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showToast(I)V

    .line 567
    goto :goto_1

    .line 569
    :pswitch_3
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_smscode_unmatch:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showToast(I)V

    .line 570
    goto :goto_1

    .line 572
    :pswitch_4
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_smscode_overtime:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showToast(I)V

    .line 573
    goto :goto_1

    .line 575
    :goto_0
    :pswitch_5
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_others_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showToast(I)V

    .line 578
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->finish()V

    .line 579
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x6
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_0
    .end packed-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 264
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 265
    sget v0, Lcom/huawei/wallet/R$id;->go_to_set_card_lock_screen_tv:I

    if-ne v1, v0, :cond_0

    .line 266
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->refreshStatus()V

    goto :goto_0

    .line 267
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->card_lock_screen_next_button:I

    if-ne v1, v0, :cond_1

    .line 269
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->jumpToActivity()V

    .line 271
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 124
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 125
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->setRequestedOrientation(I)V

    .line 126
    sget v0, Lcom/huawei/wallet/R$layout;->act_lock_screen:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->setContentView(I)V

    .line 127
    iput-object p0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mContext:Landroid/content/Context;

    .line 128
    sget v0, Lcom/huawei/wallet/R$id;->card_lock_screen_tip_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockScreenTv:Landroid/widget/TextView;

    .line 129
    sget v0, Lcom/huawei/wallet/R$id;->go_to_set_card_lock_screen_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mSetLockScreenButton:Lo/egd;

    .line 130
    sget v0, Lcom/huawei/wallet/R$id;->card_lock_screen_next_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNextButton:Lo/egd;

    .line 131
    sget v0, Lcom/huawei/wallet/R$id;->card_lock_screen_imageView:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockScreeniImageV:Landroid/widget/ImageView;

    .line 132
    sget v0, Lcom/huawei/wallet/R$id;->card_set_lock_screen_imageView:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mSetLockScreeniImageV:Landroid/widget/ImageView;

    .line 134
    sget v0, Lcom/huawei/wallet/R$id;->card_lock_screen_content_lly:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenContentLly:Landroid/widget/LinearLayout;

    .line 135
    sget v0, Lcom/huawei/wallet/R$id;->card_lock_screen_multi_content_lly:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mCardLockScreenMultiContentLly:Landroid/widget/LinearLayout;

    .line 137
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mNextButton:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mSetLockScreenButton:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 140
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 142
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 143
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bundle is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->finish()V

    .line 145
    return-void

    .line 148
    :cond_0
    const-string v0, "BANKCARDMODE"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mMode:I

    .line 149
    const-string v0, "FROM_ADD_CARD_PAGE"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->fromPage:Ljava/lang/String;

    .line 150
    const-string v0, "BANKCARREFERENCEID"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mReferenceId:Ljava/lang/String;

    .line 152
    const-string v0, "LOCKSCREENSTATUS"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 153
    iput v5, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    .line 154
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " LockscreenStatus : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; fromPage : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->fromPage:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    invoke-direct {p0, v5}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->refreshLockView(I)V

    .line 160
    invoke-direct {p0, v5}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getWatchLockscreen(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->setWatchLockscreen(Ljava/lang/String;)V

    .line 161
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 258
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 259
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onDestroy()V

    .line 260
    return-void
.end method

.method protected toDeleteCard()V
    .locals 4

    .line 530
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mMode:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 531
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 537
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mReferenceId:Ljava/lang/String;

    iget v2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mMode:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->nullifyCard(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;)V

    goto :goto_0

    .line 541
    :cond_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_others_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showToast(I)V

    .line 544
    :goto_0
    return-void
.end method

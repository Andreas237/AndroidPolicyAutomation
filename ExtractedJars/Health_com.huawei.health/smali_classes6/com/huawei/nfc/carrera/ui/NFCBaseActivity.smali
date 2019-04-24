.class public Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# static fields
.field public static final ADD_CARD_ACTIVITY:Ljava/lang/String; = "AddBankOrBusCardActivity"

.field public static final AW_NAME_CN:Ljava/lang/String; = "com.google.android.wearable.app.cn"

.field public static final BANKCARDMODE:Ljava/lang/String; = "BANKCARDMODE"

.field public static final BANKCARREFERENCEID:Ljava/lang/String; = "BANKCARREFERENCEID"

.field public static final BIND_CARD_ACTIVITY:Ljava/lang/String; = "BindCardActivity"

.field private static final BTTYPEISAW:I = 0x0

.field public static final CREDIT_BANK_CARD:I = 0x3

.field public static final DEBIT_BANK_CARD:I = 0x2

.field public static final DETAIL_CARD_ACTIVITY:Ljava/lang/String; = "CardInfoDetailActivity"

.field private static final DISPLAY_HW_NO_SPLIT_LINE:I = 0x8000

.field private static final DOUBLE_BUTTON:I = 0x2

.field private static final EMUI4_DEFAULT_COLOR:I = -0xf0f10

.field public static final FROM_ADD_CARD_PAGE:Ljava/lang/String; = "FROM_ADD_CARD_PAGE"

.field public static final INCONSISTENT_ACCOUNTS_ATYPISM_STATUS:I = 0x186a4

.field public static final INCONSISTENT_ACCOUNTS_STATUS:I = 0x186a0

.field public static final LOCKSCREENSTATUS:Ljava/lang/String; = "LOCKSCREENSTATUS"

.field public static final PERCENT_MARGIN_30:F = 0.3f

.field private static final SINGLE_BUTTON:I = 0x1

.field private static final TAG:Ljava/lang/String; = "NFCBaseActivity"

.field private static final THREE_BUTTON:I = 0x3

.field public static final TO_ADD:I = 0xde

.field private static final WAIT_TIME:I = 0xbb8


# instance fields
.field private NetworkReceiver:Landroid/content/BroadcastReceiver;

.field customLoadingDialog:Lo/egn;

.field private hasLeftHomeView:Z

.field private loadingAnimation:Landroid/graphics/drawable/AnimationDrawable;

.field private mAbnormalTipJumpTv:Landroid/widget/TextView;

.field private mAbnormalTipTv:Landroid/widget/TextView;

.field private mAbnormalTiplyt:Landroid/widget/LinearLayout;

.field public mAcountStatus:I

.field protected mActionBar:Landroid/app/ActionBar;

.field private mAlertDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

.field public mContext:Landroid/content/Context;

.field private mDeviceBTType:I

.field public mDevicesConnecteStatus:I

.field private mDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

.field private mGoToSettingLyt:Landroid/widget/LinearLayout;

.field private mHandler:Landroid/os/Handler;

.field protected mLoadingDialog21:Lo/egn;

.field public mLockscreenStatus:I

.field public mNetConnected:Z

.field private mNetWorkWaitImg:Landroid/widget/ImageView;

.field private mNetWorkWaitLyt:Landroid/widget/LinearLayout;

.field private final mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field onClickListener:Landroid/view/View$OnClickListener;

.field protected parentBodyLinearLayout:Landroid/widget/LinearLayout;

.field public pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

.field private titleBar:Lo/emr;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->hasLeftHomeView:Z

    .line 94
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mDevicesConnecteStatus:I

    .line 96
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetConnected:Z

    .line 135
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 137
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLockscreenStatus:I

    .line 139
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAcountStatus:I

    .line 240
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mDeviceBTType:I

    .line 646
    new-instance v0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 735
    new-instance v0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->NetworkReceiver:Landroid/content/BroadcastReceiver;

    .line 786
    new-instance v0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$4;-><init>(Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mHandler:Landroid/os/Handler;

    .line 839
    new-instance v0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$5;-><init>(Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;)Landroid/graphics/drawable/AnimationDrawable;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->loadingAnimation:Landroid/graphics/drawable/AnimationDrawable;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->netWorkWaitView()V

    return-void
.end method

.method private initParentView()V
    .locals 2

    .line 249
    sget v0, Lcom/huawei/wallet/R$layout;->huaweipay_base_main_layout:I

    invoke-super {p0, v0}, Lcom/huawei/ui/commonui/base/BaseActivity;->setContentView(I)V

    .line 250
    sget v0, Lcom/huawei/wallet/R$id;->third_party_title_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->titleBar:Lo/emr;

    .line 252
    iput-object p0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    .line 253
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/PluginPayAdapter;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    .line 255
    sget v0, Lcom/huawei/wallet/R$id;->base_main_body_linearlayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    .line 256
    sget v0, Lcom/huawei/wallet/R$id;->nfc_tip_titile_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTiplyt:Landroid/widget/LinearLayout;

    .line 257
    sget v0, Lcom/huawei/wallet/R$id;->nfc_tip_titile_netWorkWait_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetWorkWaitLyt:Landroid/widget/LinearLayout;

    .line 258
    sget v0, Lcom/huawei/wallet/R$id;->nfc_tip_goto_setting_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mGoToSettingLyt:Landroid/widget/LinearLayout;

    .line 259
    sget v0, Lcom/huawei/wallet/R$id;->nfc_tip_titile_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTipTv:Landroid/widget/TextView;

    .line 260
    sget v0, Lcom/huawei/wallet/R$id;->nfc_tip_goto_setting_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTipJumpTv:Landroid/widget/TextView;

    .line 261
    sget v0, Lcom/huawei/wallet/R$id;->nfc_netWorkWait_imageview:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetWorkWaitImg:Landroid/widget/ImageView;

    .line 263
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTiplyt:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTipTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 265
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTipJumpTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 267
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->registerNonLocalBroadcast()V

    .line 268
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->registerReceiver()V

    .line 270
    return-void
.end method

.method private final initVerHorSwitch()V
    .locals 2

    .line 174
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$bool;->IsSupportOrientation:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->setRequestedOrientation(I)V

    goto :goto_0

    .line 180
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->setRequestedOrientation(I)V

    .line 182
    :goto_0
    return-void
.end method

.method private netWorkWaitView()V
    .locals 4

    .line 772
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTiplyt:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetWorkWaitLyt:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetWorkWaitImg:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 773
    :cond_0
    return-void

    .line 776
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTiplyt:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 777
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetWorkWaitLyt:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 778
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$drawable;->hw_health_loading:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->loadingAnimation:Landroid/graphics/drawable/AnimationDrawable;

    .line 779
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetWorkWaitImg:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->loadingAnimation:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 780
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->loadingAnimation:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 781
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 784
    return-void
.end method

.method private registerNonLocalBroadcast()V
    .locals 4

    .line 621
    new-instance v3, Landroid/content/IntentFilter;

    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    .line 623
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 625
    const-string v0, "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS"

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 626
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v3, v1, v2}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 627
    return-void
.end method

.method private registerReceiver()V
    .locals 2

    .line 730
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 731
    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 732
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->NetworkReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 733
    return-void
.end method

.method private unregisterNonLocalBroadcast()V
    .locals 5

    .line 634
    const-string v0, "NFCBaseActivity"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unregisterNonLocalBroadcast()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 635
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 636
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->NetworkReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 639
    goto :goto_0

    .line 637
    :catch_0
    move-exception v4

    .line 638
    const-string v0, "NFCBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 641
    :goto_0
    return-void
.end method


# virtual methods
.method public destroyLoadingDialog()V
    .locals 4

    .line 858
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 859
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 860
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    .line 861
    const-string v0, "NFCBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy mLoadingDialog21"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 863
    :cond_0
    return-void
.end method

.method public dismissProgressDialog()V
    .locals 2

    .line 338
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->customLoadingDialog:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->customLoadingDialog:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->customLoadingDialog:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 342
    :cond_0
    return-void
.end method

.method protected isNetworkConnected(Landroid/content/Context;)V
    .locals 1

    .line 672
    invoke-static {p1}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetConnected:Z

    .line 673
    return-void
.end method

.method protected jumpToAndroidWear()V
    .locals 14

    .line 687
    const-string v4, "com.google.android.wearable.app.cn"

    .line 688
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 690
    const/4 v6, 0x0

    .line 693
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v5, v4, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 697
    goto :goto_0

    .line 694
    :catch_0
    move-exception v7

    .line 695
    const-string v0, "NFCBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick() androidWearNameCn, error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 696
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->IDS_device_hauwei_watch_download_android_wear_tips:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 698
    :goto_0
    if-nez v6, :cond_0

    .line 699
    return-void

    .line 703
    :cond_0
    new-instance v7, Landroid/content/Intent;

    const-string v0, "android.intent.action.MAIN"

    const/4 v1, 0x0

    invoke-direct {v7, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 704
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 705
    iget-object v0, v6, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 708
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 709
    const/4 v1, 0x0

    invoke-virtual {v0, v7, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v8

    .line 711
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/content/pm/ResolveInfo;

    .line 712
    if-eqz v9, :cond_1

    .line 714
    iget-object v0, v9, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v10, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 716
    iget-object v0, v9, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v11, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 718
    new-instance v12, Landroid/content/Intent;

    const-string v0, "android.intent.action.MAIN"

    invoke-direct {v12, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 719
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v12, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 722
    new-instance v13, Landroid/content/ComponentName;

    invoke-direct {v13, v10, v11}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 724
    invoke-virtual {v12, v13}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 725
    invoke-virtual {p0, v12}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->startActivity(Landroid/content/Intent;)V

    .line 727
    :cond_1
    return-void
.end method

.method protected jumpToNetWorkSetting()V
    .locals 2

    .line 678
    new-instance v1, Landroid/content/Intent;

    const-string v0, "android.settings.SETTINGS"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 679
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->startActivity(Landroid/content/Intent;)V

    .line 680
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 164
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 165
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->initVerHorSwitch()V

    .line 168
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->initParentView()V

    .line 169
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 572
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 573
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->dismissProgressDialog()V

    .line 575
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->unregisterNonLocalBroadcast()V

    .line 576
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 577
    return-void
.end method

.method protected onHomeRetrunArrowClick()V
    .locals 0

    .line 566
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->finish()V

    .line 567
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 554
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v1, v0, :cond_0

    .line 556
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onHomeRetrunArrowClick()V

    .line 558
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onResume()V
    .locals 2

    .line 604
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 605
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 606
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceConnectState()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mDevicesConnecteStatus:I

    .line 607
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceBTType()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mDeviceBTType:I

    .line 609
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->isNetworkConnected(Landroid/content/Context;)V

    .line 610
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->refreshView(Z)V

    .line 611
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 582
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 583
    return-void
.end method

.method protected refreshView(Z)V
    .locals 2

    .line 798
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "connectedChanged refreshView DevicesConnecteStatus "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mDevicesConnecteStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; NetConnected : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetConnected:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 810
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTiplyt:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTipTv:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetWorkWaitLyt:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 811
    :cond_0
    return-void

    .line 814
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetWorkWaitLyt:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 816
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mDevicesConnecteStatus:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetConnected:Z

    if-eqz v0, :cond_2

    .line 817
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTiplyt:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 818
    return-void

    .line 820
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTiplyt:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 823
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mDevicesConnecteStatus:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    .line 824
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTipTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_discontected_tip_text:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 825
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTipJumpTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_connect_bluetooth:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 826
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mDeviceBTType:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 827
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mGoToSettingLyt:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 829
    :cond_3
    return-void

    .line 832
    :cond_4
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetConnected:Z

    if-nez v0, :cond_5

    .line 833
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mGoToSettingLyt:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 834
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTipTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_net_error_click_refresh:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 835
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mAbnormalTipJumpTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bt_set_network:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 837
    :cond_5
    return-void
.end method

.method public final removeBodyViews()V
    .locals 1

    .line 407
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 409
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 411
    :cond_0
    return-void
.end method

.method public final setContentView(I)V
    .locals 3

    .line 370
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 372
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 373
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 374
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 375
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 376
    goto :goto_0

    .line 379
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->setContentView(I)V

    .line 381
    :goto_0
    return-void
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 2

    .line 389
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 391
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 392
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 393
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 397
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 399
    :goto_0
    return-void
.end method

.method public setTitle(I)V
    .locals 1

    .line 437
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->setTitle(Ljava/lang/String;)V

    .line 438
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .line 442
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->titleBar:Lo/emr;

    invoke-virtual {v0, p1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 443
    return-void
.end method

.method public setWatchLockscreen(Ljava/lang/String;)V
    .locals 2

    .line 753
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "enter setWatchLockscreen "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 754
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 755
    return-void

    .line 758
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$3;

    invoke-direct {v1, p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$3;-><init>(Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 767
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 768
    return-void
.end method

.method protected final showHead(I)V
    .locals 1

    .line 419
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->setTitle(Ljava/lang/String;)V

    .line 420
    return-void
.end method

.method protected final showHead(Ljava/lang/String;)V
    .locals 1

    .line 432
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->titleBar:Lo/emr;

    invoke-virtual {v0, p1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 433
    return-void
.end method

.method public showLoadingDialog(I)V
    .locals 4

    .line 869
    const-string v0, "NFCBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showLoadingDialog resId : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 870
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 871
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    .line 872
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 873
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 875
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 876
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 877
    const-string v0, "NFCBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 880
    :cond_1
    return-void
.end method

.method protected showLoadingDialog(IZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 4

    .line 888
    const-string v0, "NFCBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showLoadingDialog : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; isCancelable "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 889
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 890
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    .line 891
    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    .line 892
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 893
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0, p3}, Lo/egn;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 894
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0, p2}, Lo/egn;->setCancelable(Z)V

    .line 895
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 897
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 898
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 899
    const-string v0, "NFCBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 901
    :cond_1
    return-void
.end method

.method protected showLoadingDialog(Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 4

    .line 908
    const-string v0, "NFCBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showLoadingDialog : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; isCancelable "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 910
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 911
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    .line 912
    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    .line 913
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0, p1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 914
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0, p3}, Lo/egn;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 915
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0, p2}, Lo/egn;->setCancelable(Z)V

    .line 916
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 918
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 919
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 920
    const-string v0, "NFCBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 922
    :cond_1
    return-void
.end method

.method public showProgressDialog(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 317
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->customLoadingDialog:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->customLoadingDialog:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 319
    return-void

    .line 321
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->customLoadingDialog:Lo/egn;

    .line 322
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->customLoadingDialog:Lo/egn;

    invoke-virtual {v0, p2}, Lo/egn;->e(Ljava/lang/String;)V

    .line 323
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->customLoadingDialog:Lo/egn;

    invoke-virtual {v0, p3}, Lo/egn;->setCancelable(Z)V

    .line 324
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->customLoadingDialog:Lo/egn;

    invoke-virtual {v0, p1}, Lo/egn;->setTitle(Ljava/lang/CharSequence;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->customLoadingDialog:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 326
    return-void
.end method

.method public showToast(I)V
    .locals 0

    .line 280
    invoke-static {p0, p1}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 281
    return-void
.end method

.method public showToast(Ljava/lang/String;)V
    .locals 0

    .line 291
    invoke-static {p0, p1}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;Ljava/lang/String;)V

    .line 292
    return-void
.end method

.method protected watchConnectedChange(I)V
    .locals 0

    .line 924
    return-void
.end method

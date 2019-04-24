.class public final Lcom/huawei/nfc/NFCOpenApiImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/NFCOpenApi;


# static fields
.field private static final KEY_FIRST_INTO_CARDLIST:Ljava/lang/String; = "key_first_into_cardlist"

.field private static final SYNC_LOCK:[B

.field private static final TAG:Ljava/lang/String; = "NFCOpenApiImpl"

.field private static instance:Lcom/huawei/nfc/NFCOpenApiImpl; = null


# instance fields
.field private final cardLostManagerApi:Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

.field private final cardManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

.field private final mContext:Landroid/content/Context;

.field private mDlg:Lo/egv;

.field private mLoadingDialog21:Lo/egn;

.field private final mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field private networkReceiver:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 74
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/NFCOpenApiImpl;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mDlg:Lo/egv;

    .line 413
    new-instance v0, Lcom/huawei/nfc/NFCOpenApiImpl$5;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/NFCOpenApiImpl$5;-><init>(Lcom/huawei/nfc/NFCOpenApiImpl;)V

    iput-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->networkReceiver:Landroid/content/BroadcastReceiver;

    .line 447
    new-instance v0, Lcom/huawei/nfc/NFCOpenApiImpl$6;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/NFCOpenApiImpl$6;-><init>(Lcom/huawei/nfc/NFCOpenApiImpl;)V

    iput-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 88
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 89
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mContext:Landroid/content/Context;

    goto :goto_0

    .line 91
    :cond_0
    iput-object p1, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mContext:Landroid/content/Context;

    .line 94
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->cardManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/LogicApiFactory;->createCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->cardLostManagerApi:Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    .line 96
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/NFCOpenApiImpl;ZLandroid/app/Activity;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/NFCOpenApiImpl;->getClearCardResult(ZLandroid/app/Activity;)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/nfc/NFCOpenApiImpl;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->cardLostManagerApi:Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/nfc/NFCOpenApiImpl;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/NFCOpenApiImpl;->startProgress(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method private cancelProgress(Landroid/app/Activity;)V
    .locals 4

    .line 225
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 227
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mLoadingDialog21:Lo/egn;

    .line 228
    const-string v0, "NFCOpenApiImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy mLoadingDialog21"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    :cond_0
    return-void
.end method

.method private checkAndHandleDeviceStatus(Landroid/app/Activity;)V
    .locals 2

    .line 134
    const-string v0, "nfc checkAndHandleDeviceStatus"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->cardLostManagerApi:Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    new-instance v1, Lcom/huawei/nfc/NFCOpenApiImpl$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/nfc/NFCOpenApiImpl$1;-><init>(Lcom/huawei/nfc/NFCOpenApiImpl;Landroid/app/Activity;)V

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->checkDeviceStatus(Lcom/huawei/nfc/carrera/logic/lostmanager/callback/CheckDeviceStatusCallback;)V

    .line 153
    return-void
.end method

.method private getClearCardResult(ZLandroid/app/Activity;)V
    .locals 4

    .line 234
    invoke-direct {p0, p2}, Lcom/huawei/nfc/NFCOpenApiImpl;->cancelProgress(Landroid/app/Activity;)V

    .line 235
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "end get delete cards result : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 236
    if-eqz p1, :cond_0

    .line 238
    sget v0, Lcom/huawei/wallet/R$string;->nfc_device_status_repair_dlg_deal_success:I

    invoke-static {p2, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    goto :goto_0

    .line 242
    :cond_0
    new-instance v2, Lo/egv$b;

    invoke-direct {v2, p2}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 243
    sget v0, Lcom/huawei/wallet/R$string;->nfc_device_status_repair_dlg_title:I

    invoke-virtual {v2, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 244
    sget v0, Lcom/huawei/wallet/R$string;->nfc_device_status_repair_continue_del_content:I

    invoke-virtual {v2, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 245
    sget v0, Lcom/huawei/wallet/R$string;->nfc_device_status_repair_continue_del_btn:I

    new-instance v1, Lcom/huawei/nfc/NFCOpenApiImpl$4;

    invoke-direct {v1, p0, p2}, Lcom/huawei/nfc/NFCOpenApiImpl$4;-><init>(Lcom/huawei/nfc/NFCOpenApiImpl;Landroid/app/Activity;)V

    invoke-virtual {v2, v0, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 265
    invoke-virtual {v2}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 266
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/egv;->setCancelable(Z)V

    .line 267
    invoke-virtual {v3}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 268
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 271
    :cond_1
    :goto_0
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/NFCOpenApi;
    .locals 4

    .line 78
    sget-object v2, Lcom/huawei/nfc/NFCOpenApiImpl;->SYNC_LOCK:[B

    monitor-enter v2

    .line 79
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/NFCOpenApiImpl;->instance:Lcom/huawei/nfc/NFCOpenApiImpl;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 80
    new-instance v0, Lcom/huawei/nfc/NFCOpenApiImpl;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/NFCOpenApiImpl;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/NFCOpenApiImpl;->instance:Lcom/huawei/nfc/NFCOpenApiImpl;

    .line 82
    :cond_0
    sget-object v0, Lcom/huawei/nfc/NFCOpenApiImpl;->instance:Lcom/huawei/nfc/NFCOpenApiImpl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 83
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public static isDevicesSuportHuaweiPay(Landroid/content/Context;)Z
    .locals 2

    .line 275
    invoke-static {p0}, Lcom/huawei/nfc/util/NFCFragmentUtil;->getNFCShowPlan(Landroid/content/Context;)I

    move-result v1

    .line 276
    const/4 v0, 0x2

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private registerNetWorkReceiver()V
    .locals 3

    .line 408
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 409
    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 410
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->networkReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 411
    return-void
.end method

.method private registerNonLocalBroadcast()V
    .locals 5

    .line 436
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 438
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 440
    const-string v0, "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 441
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 442
    return-void
.end method

.method private startProgress(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 4

    .line 211
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 212
    new-instance v0, Lo/egn;

    sget v1, Lcom/huawei/wallet/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, p1, v1}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-static {p1}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mLoadingDialog21:Lo/egn;

    .line 213
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0, p2}, Lo/egn;->e(Ljava/lang/String;)V

    .line 214
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 215
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCanceledOnTouchOutside(Z)V

    .line 217
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 218
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 219
    const-string v0, "NFCOpenApiImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    :cond_1
    return-void
.end method


# virtual methods
.method public getCardDetailView(Lcom/huawei/wallet/model/unicard/UniCardInfo;Landroid/app/Activity;I)Landroid/view/View;
    .locals 7

    .line 316
    const/4 v4, 0x0

    .line 317
    const-string v0, "NFCOpenApiImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCardDetailView(),info.getCardStatus()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 320
    new-instance v5, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;

    invoke-direct {v5, p2}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;-><init>(Landroid/app/Activity;)V

    .line 321
    invoke-virtual {v5, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->setData(Lcom/huawei/wallet/model/unicard/UniCardInfo;)V

    .line 322
    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v6, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 323
    iput p3, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 324
    invoke-virtual {v5, v6}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 325
    move-object v4, v5

    .line 326
    goto/16 :goto_0

    .line 327
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0x63

    if-eq v0, v1, :cond_1

    .line 328
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0x5c

    if-ne v0, v1, :cond_2

    .line 330
    :cond_1
    new-instance v5, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;

    invoke-direct {v5, p2}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;-><init>(Landroid/content/Context;)V

    .line 331
    invoke-virtual {v5, p3}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->initView(I)Landroid/view/View;

    move-result-object v4

    .line 332
    invoke-virtual {v5, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->setData(Lcom/huawei/wallet/model/unicard/UniCardInfo;)V

    .line 333
    goto/16 :goto_0

    .line 334
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    .line 335
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0xb

    if-eq v0, v1, :cond_3

    .line 336
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_3

    .line 337
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_4

    .line 339
    :cond_3
    new-instance v5, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;

    invoke-direct {v5, p2}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;-><init>(Landroid/content/Context;)V

    .line 340
    invoke-virtual {v5, p3}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->initView(I)Landroid/view/View;

    move-result-object v4

    .line 341
    invoke-virtual {v5, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->setData(Lcom/huawei/wallet/model/unicard/UniCardInfo;)V

    .line 342
    goto :goto_0

    .line 343
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0x5f

    if-eq v0, v1, :cond_5

    .line 344
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0x60

    if-eq v0, v1, :cond_5

    .line 345
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0x61

    if-eq v0, v1, :cond_5

    .line 346
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0x62

    if-eq v0, v1, :cond_5

    .line 347
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 349
    :cond_5
    new-instance v5, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;

    invoke-direct {v5, p2}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;-><init>(Landroid/content/Context;)V

    .line 350
    invoke-virtual {v5, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->setData(Lcom/huawei/wallet/model/unicard/UniCardInfo;)V

    .line 351
    invoke-virtual {v5, p3}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->initView(I)Landroid/view/View;

    move-result-object v4

    .line 352
    goto :goto_0

    .line 353
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0x5e

    if-eq v0, v1, :cond_7

    .line 354
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0x5d

    if-ne v0, v1, :cond_8

    .line 356
    :cond_7
    new-instance v5, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;

    invoke-direct {v5, p2}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;-><init>(Landroid/content/Context;)V

    .line 357
    invoke-virtual {v5, p3}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;->initView(I)Landroid/view/View;

    move-result-object v4

    .line 358
    invoke-virtual {v5, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;->setData(Lcom/huawei/wallet/model/unicard/UniCardInfo;)V

    .line 360
    :cond_8
    :goto_0
    return-object v4
.end method

.method public initNFC(Landroid/app/Activity;)V
    .locals 0

    .line 121
    invoke-direct {p0, p1}, Lcom/huawei/nfc/NFCOpenApiImpl;->checkAndHandleDeviceStatus(Landroid/app/Activity;)V

    .line 126
    invoke-direct {p0}, Lcom/huawei/nfc/NFCOpenApiImpl;->registerNetWorkReceiver()V

    .line 127
    invoke-direct {p0}, Lcom/huawei/nfc/NFCOpenApiImpl;->registerNonLocalBroadcast()V

    .line 129
    return-void
.end method

.method public isCanDragStop(IILjava/util/List;Landroid/content/Context;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;Landroid/content/Context;)Z"
        }
    .end annotation

    .line 293
    if-ne p1, p2, :cond_0

    .line 295
    const/4 v0, 0x0

    return v0

    .line 297
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    .line 298
    add-int/lit8 v0, v2, -0x1

    if-ne p2, v0, :cond_1

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 299
    :cond_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_3

    add-int/lit8 v0, v2, -0x2

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    .line 301
    :cond_2
    sget v0, Lcom/huawei/wallet/R$string;->nfc_set_unactivited_as_default_card_fail:I

    invoke-static {p4, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 302
    const/4 v0, 0x0

    return v0

    .line 304
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public isShowQuickPayTipDialog(Landroid/content/Context;)Z
    .locals 5

    .line 366
    invoke-static {p1}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "key_first_into_cardlist"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 367
    if-eqz v3, :cond_3

    .line 370
    invoke-static {p1}, Lo/dtc;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lo/dtc;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 373
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v4

    .line 375
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 377
    :cond_0
    const/4 v3, 0x0

    goto :goto_0

    .line 381
    :cond_1
    const/4 v3, 0x1

    .line 383
    :goto_0
    goto :goto_1

    .line 386
    :cond_2
    const/4 v3, 0x0

    .line 390
    :cond_3
    :goto_1
    if-eqz v3, :cond_4

    .line 392
    invoke-static {p1}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "key_first_into_cardlist"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putBoolean(Ljava/lang/String;Z)Z

    .line 395
    :cond_4
    return v3
.end method

.method public jumpToAddCardActivity(Landroid/app/Activity;)V
    .locals 2

    .line 282
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 283
    const-class v0, Lcom/huawei/nfc/NFCEntranceActivity;

    invoke-virtual {v1, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 284
    const-string v0, "com.huawei.nfc.intent.action.NFC_ADD_CARD"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 285
    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 286
    invoke-virtual {p1, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 288
    return-void
.end method

.method public onDragStop(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;)V"
        }
    .end annotation

    .line 310
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->cardManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->updateCardOrder(IILjava/util/List;)V

    .line 311
    return-void
.end method

.method public refreshCardList()V
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->cardManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->refreshCardList()V

    .line 115
    return-void
.end method

.method public registerCardListInfoListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->cardManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->registerCardListListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V

    .line 102
    return-void
.end method

.method public setRefreshRF(Z)V
    .locals 1

    .line 401
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->cardManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->setRefreshRF(Z)V

    .line 402
    return-void
.end method

.method public showRepairDeviceDlgJudgeByUser(Landroid/app/Activity;)V
    .locals 5

    .line 157
    const-string v0, "NFC home Fragment : : show judge device status dialog"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 159
    const-string v0, "NFCOpenApiImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAccount showDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mDlg:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 163
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    const-string v0, "NFCOpenApiImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBandUnavailableDialog Already show!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    return-void

    .line 169
    :cond_0
    new-instance v4, Lo/egv$b;

    invoke-direct {v4, p1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 170
    sget v0, Lcom/huawei/wallet/R$string;->nfc_device_status_repair_dlg_title:I

    invoke-virtual {v4, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 171
    sget v0, Lcom/huawei/wallet/R$string;->nfc_device_status_repair_dlg_content:I

    invoke-virtual {v4, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 172
    sget v0, Lcom/huawei/wallet/R$string;->nfc_cancel:I

    new-instance v1, Lcom/huawei/nfc/NFCOpenApiImpl$3;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/NFCOpenApiImpl$3;-><init>(Lcom/huawei/nfc/NFCOpenApiImpl;)V

    invoke-virtual {v4, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_device_status_repair_dlg_do_repair:I

    new-instance v2, Lcom/huawei/nfc/NFCOpenApiImpl$2;

    invoke-direct {v2, p0, p1}, Lcom/huawei/nfc/NFCOpenApiImpl$2;-><init>(Lcom/huawei/nfc/NFCOpenApiImpl;Landroid/app/Activity;)V

    .line 178
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 201
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mDlg:Lo/egv;

    .line 202
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mDlg:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 203
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 204
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->mDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 206
    :cond_1
    return-void
.end method

.method public unregisterCardListListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl;->cardManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->unregisterCardListListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V

    .line 108
    return-void
.end method

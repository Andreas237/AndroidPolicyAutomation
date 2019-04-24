.class public Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;


# static fields
.field static final SERVICE_INTENT_KEY_AID:Ljava/lang/String; = "aid"

.field static final SERVICE_INTENT_KEY_CPLC:Ljava/lang/String; = "cplc"

.field static final SERVICE_INTENT_KEY_DPANID:Ljava/lang/String; = "dpanid"

.field static final SERVICE_INTENT_KEY_MODE:Ljava/lang/String; = "mode"

.field static final SERVICE_INTENT_KEY_SIGN:Ljava/lang/String; = "sign"

.field static final SERVICE_INTENT_KEY_STATUS:Ljava/lang/String; = "status"

.field public static final SERVICE_START_MODE_DEVICES_LOST:Ljava/lang/String; = "devices_lost"


# instance fields
.field private serviceStartedTimes:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->serviceStartedTimes:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->finishOneServiceTask()V

    return-void
.end method

.method private addOneServiceTask()V
    .locals 2

    .line 125
    iget v0, p0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->serviceStartedTimes:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->serviceStartedTimes:I

    .line 126
    return-void
.end method

.method private finishOneServiceTask()V
    .locals 2

    .line 135
    iget v0, p0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->serviceStartedTimes:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->serviceStartedTimes:I

    .line 138
    iget v0, p0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->serviceStartedTimes:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 140
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->stopSelf()V

    .line 142
    invoke-static {}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->releaseLostTaskWakeLock()V

    .line 144
    :cond_0
    return-void
.end method


# virtual methods
.method public handleServerMsgResult(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 149
    const-string v0, "CardLostManagerService finishOneServiceTask"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 150
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService$1;-><init>(Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 158
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 66
    const-string v0, "CardLostManagerService onBind"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 67
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 1

    .line 77
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 78
    const-string v0, "CardLostManagerService onCreate"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 79
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 114
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 115
    const-string v0, "CardLostManagerService onDestroy"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 116
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 11

    .line 84
    const-string v0, "CardLostManagerService onStartCommand"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 86
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->addOneServiceTask()V

    .line 87
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 89
    const-string v0, "CardLostManagerService, but intent is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 90
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->finishOneServiceTask()V

    .line 91
    const/4 v0, 0x2

    return v0

    .line 94
    :cond_0
    const-string v0, "cplc"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 95
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v7

    .line 96
    if-eqz v7, :cond_1

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 98
    :cond_1
    const-string v0, "CardLostManagerService, cplc is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 99
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->finishOneServiceTask()V

    .line 100
    const/4 v0, 0x2

    return v0

    .line 103
    :cond_2
    const-string v0, "aid"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 104
    const-string v0, "status"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 105
    const-string v0, "dpanid"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 106
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    move-object v1, v8

    move-object v2, v9

    move-object v3, v6

    move-object v4, v10

    move-object v5, p0

    invoke-interface/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->handleServerCardLostMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;)V

    .line 108
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method

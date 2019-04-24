.class public Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeleteLocalCardsCallback;


# static fields
.field public static final RSA_PUBLICKEY:Ljava/lang/String; = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCOv0vhs4mPhr7icuEVWuhkHwPGAdmIdQ9IulOGKhV2zAh6COvf+SVvWTWeLIX5/fzSyhFp5BUJAiQjWe7Xr5K2whSJWN+Xgtfwr2H2iiZaul4wGwMep20JyBuaHVm1TZ3A1qbT51reg+H9d6Qy9es96QNjg+iNHgsRUKYZnzNgSQIDAQAB"

.field static final SERVICE_INTENT_KEY_CPLC:Ljava/lang/String; = "cplc"

.field static final SERVICE_INTENT_KEY_SIGN:Ljava/lang/String; = "sign"

.field static final SERVICE_INTENT_KEY_USER:Ljava/lang/String; = "user"


# instance fields
.field private serviceStartedTimes:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->serviceStartedTimes:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->finishOneServiceTask()V

    return-void
.end method

.method private addOneServiceTask()V
    .locals 2

    .line 124
    iget v0, p0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->serviceStartedTimes:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->serviceStartedTimes:I

    .line 125
    return-void
.end method

.method private finishOneServiceTask()V
    .locals 2

    .line 132
    iget v0, p0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->serviceStartedTimes:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->serviceStartedTimes:I

    .line 135
    iget v0, p0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->serviceStartedTimes:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 137
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->stopSelf()V

    .line 139
    invoke-static {}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->releaseLostTaskWakeLock()V

    .line 141
    :cond_0
    return-void
.end method

.method private isAccountStatuMatch(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4

    .line 145
    const/4 v2, 0x0

    .line 148
    :try_start_0
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->checkUserAccount(Ljava/lang/String;)Z
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaAccountNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    move v2, v0

    .line 157
    goto :goto_0

    .line 150
    :catch_0
    move-exception v3

    .line 152
    const-string v0, "there is no account in ta"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 157
    goto :goto_0

    .line 154
    :catch_1
    move-exception v3

    .line 156
    const-string v0, "check account, ta exception"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 158
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NullifyAccountManagerService isAccountMatch: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 159
    return v2
.end method


# virtual methods
.method public handleDeletelocalcardCallback(Z)V
    .locals 2

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NullifyAccountManagerService delete card isSuccess "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 166
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService$1;-><init>(Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 174
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 57
    const-string v0, "NullifyAccountManagerService onBind"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 58
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 1

    .line 64
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 65
    const-string v0, "NullifyAccountManagerService onCreate"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 66
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 115
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 116
    const-string v0, "NullifyAccountManagerService onDestroy"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 117
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 7

    .line 71
    const-string v0, "NullifyAccountManagerService onStartCommand"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 73
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->addOneServiceTask()V

    .line 75
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-static {p0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isEnabledNFC(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 77
    :cond_0
    const-string v0, "CardLostManagerService, isEnabledNFC: false or intent is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 78
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->finishOneServiceTask()V

    .line 79
    const/4 v0, 0x2

    return v0

    .line 82
    :cond_1
    const-string v0, "user"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 83
    const-string v0, "cplc"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 84
    const-string v0, "sign"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 87
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 88
    const-string v0, "uid"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    const-string v0, "cplc"

    invoke-interface {v4, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    invoke-static {v4}, Lo/dtc;->e(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    .line 91
    const-string v0, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCOv0vhs4mPhr7icuEVWuhkHwPGAdmIdQ9IulOGKhV2zAh6COvf+SVvWTWeLIX5/fzSyhFp5BUJAiQjWe7Xr5K2whSJWN+Xgtfwr2H2iiZaul4wGwMep20JyBuaHVm1TZ3A1qbT51reg+H9d6Qy9es96QNjg+iNHgsRUKYZnzNgSQIDAQAB"

    invoke-static {v5, v3, v0}, Lo/eda;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    .line 92
    if-nez v6, :cond_2

    .line 94
    const-string v0, "NullifyAccountManagerService, sign verify return false"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 95
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->finishOneServiceTask()V

    .line 96
    const/4 v0, 0x2

    return v0

    .line 100
    :cond_2
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->isAccountStatuMatch(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 102
    :cond_3
    const-string v0, "NullifyAccountManagerService, user id not match"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 103
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->finishOneServiceTask()V

    .line 104
    const/4 v0, 0x2

    return v0

    .line 108
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->deleteLocalBankCards(Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeleteLocalCardsCallback;)V

    .line 109
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method

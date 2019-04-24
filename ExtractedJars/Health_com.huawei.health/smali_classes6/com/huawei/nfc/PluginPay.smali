.class public Lcom/huawei/nfc/PluginPay;
.super Lo/eac;
.source "SourceFile"


# static fields
.field private static final SYNC_LOCK:[B

.field private static final TAG:Ljava/lang/String; = "PluginPay"

.field private static mInstance:Lcom/huawei/nfc/PluginPay; = null


# instance fields
.field private cardLostManagerApi:Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

.field private isShowPay:Z

.field private mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/PluginPay;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Lo/eac;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/PluginPay;->cardLostManagerApi:Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/PluginPay;->isShowPay:Z

    .line 28
    iput-object p1, p0, Lcom/huawei/nfc/PluginPay;->mContext:Landroid/content/Context;

    .line 29
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;
    .locals 4

    .line 38
    sget-object v2, Lcom/huawei/nfc/PluginPay;->SYNC_LOCK:[B

    monitor-enter v2

    .line 39
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/PluginPay;->mInstance:Lcom/huawei/nfc/PluginPay;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 40
    new-instance v0, Lcom/huawei/nfc/PluginPay;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/nfc/PluginPay;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/PluginPay;->mInstance:Lcom/huawei/nfc/PluginPay;

    .line 42
    :cond_0
    sget-object v0, Lcom/huawei/nfc/PluginPay;->mInstance:Lcom/huawei/nfc/PluginPay;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 43
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public SyncCardInformation()V
    .locals 4

    .line 90
    iget-object v0, p0, Lcom/huawei/nfc/PluginPay;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/PluginPay;->cardLostManagerApi:Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    .line 91
    const-string v0, "PluginPay"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "== card status enter SyncCardInformation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    iget-object v0, p0, Lcom/huawei/nfc/PluginPay;->cardLostManagerApi:Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    new-instance v1, Lcom/huawei/nfc/PluginPay$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/PluginPay$1;-><init>(Lcom/huawei/nfc/PluginPay;)V

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->checkDeviceStatus(Lcom/huawei/nfc/carrera/logic/lostmanager/callback/CheckDeviceStatusCallback;)V

    .line 98
    return-void
.end method

.method public finish()V
    .locals 0

    .line 82
    invoke-super {p0}, Lo/eac;->finish()V

    .line 83
    return-void
.end method

.method public getCardListActivityClass()Ljava/lang/Class;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/lang/Class<*>;"
        }
    .end annotation

    .line 76
    const-string v0, "PluginPay"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCardListActivityClass"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    const/4 v0, 0x0

    return-object v0
.end method

.method public goToCardListActivity()V
    .locals 3

    .line 64
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 65
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.wallet.ui.cardholder.CardHolderActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 66
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 67
    iget-object v0, p0, Lcom/huawei/nfc/PluginPay;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 68
    return-void
.end method

.method public goToDownloadPluginPayActivity()V
    .locals 3

    .line 112
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/nfc/PluginPay;->mContext:Landroid/content/Context;

    const-class v1, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 113
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 114
    iget-object v0, p0, Lcom/huawei/nfc/PluginPay;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 115
    return-void
.end method

.method public isShowPay()Z
    .locals 1

    .line 101
    iget-boolean v0, p0, Lcom/huawei/nfc/PluginPay;->isShowPay:Z

    return v0
.end method

.method public setAdapter(Lo/eab;)V
    .locals 0

    .line 49
    invoke-super {p0, p1}, Lo/eac;->setAdapter(Lo/eab;)V

    .line 50
    return-void
.end method

.method public setShowPay(Z)V
    .locals 0

    .line 105
    iput-boolean p1, p0, Lcom/huawei/nfc/PluginPay;->isShowPay:Z

    .line 106
    return-void
.end method

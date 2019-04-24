.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final mProductID:Ljava/lang/String;

.field private final mRefID:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p5, p6, p4}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;)V

    .line 29
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mRefID:Ljava/lang/String;

    .line 30
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mProductID:Ljava/lang/String;

    .line 31
    return-void
.end method

.method private redownload(Ljava/lang/String;)V
    .locals 6

    .line 64
    const/4 v2, 0x0

    .line 67
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 68
    const-string v0, "ssid"

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 69
    const-string v0, "sign"

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 70
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 71
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mRefID:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mContext:Landroid/content/Context;

    const-string v1, "DOWNLOAD"

    invoke-static {v0, v1, v3, v4, v5}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateServiceManager;->startCUPOperateService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    goto :goto_0

    .line 75
    :catch_0
    move-exception v3

    .line 77
    const-string v0, "parsPushConsumeMsg, get json exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 79
    :goto_0
    return-void
.end method


# virtual methods
.method cleanUnstartedData(Ljava/lang/String;)V
    .locals 0

    .line 84
    return-void
.end method

.method public run()V
    .locals 4

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mRefID:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->isCardDownload(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    const-string v0, "The card already download, return success."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mProductID:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mRefID:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->handleResult(ILjava/lang/String;Ljava/lang/String;)V

    .line 40
    return-void

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mRefID:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 43
    if-eqz v3, :cond_1

    .line 45
    const-string v0, "get tsmlibData from shareperference, retry download."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 46
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->redownload(Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mRefID:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mProductID:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->observeDownloadResult(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 49
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mRefID:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->getTsmLibData(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 51
    const-string v0, "get tsmlibData from service, retry download."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mRefID:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mProductID:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->observeDownloadResult(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 56
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mProductID:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mRefID:Ljava/lang/String;

    const/16 v2, -0x13

    invoke-virtual {p0, v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->handleResult(ILjava/lang/String;Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->mRefID:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;->deleteCard(Ljava/lang/String;)V

    .line 60
    :goto_0
    return-void
.end method

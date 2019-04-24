.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;
.source "SourceFile"


# instance fields
.field private mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;)V

    .line 36
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 37
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;

    .line 38
    return-void
.end method

.method private addCardToTa(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)I
    .locals 4

    .line 102
    const/16 v2, 0x63

    .line 105
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->addCard(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardAlreadyExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNumReachMaxException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaBadParammeterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_3

    .line 106
    const/4 v2, 0x0

    .line 128
    goto :goto_0

    .line 108
    :catch_0
    move-exception v3

    .line 110
    const-string v0, "IssueTrafficCardTask addCardToTa failed WalletTaCardAlreadyExistException. "

    .line 111
    invoke-static {v3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .line 110
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    goto :goto_0

    .line 113
    :catch_1
    move-exception v3

    .line 115
    const-string v0, "IssueTrafficCardTask addCardToTa failed WalletTaCardNumReachMaxException. "

    .line 116
    invoke-static {v3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .line 115
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    const/16 v2, 0x44d

    .line 128
    goto :goto_0

    .line 119
    :catch_2
    move-exception v3

    .line 121
    const-string v0, "IssueTrafficCardTask addCardToTa failed WalletTaBadParammeterException. "

    .line 122
    invoke-static {v3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .line 121
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    goto :goto_0

    .line 124
    :catch_3
    move-exception v3

    .line 126
    const-string v0, "IssueTrafficCardTask addCardToTa failed WalletTaSystemErrorException. "

    .line 127
    invoke-static {v3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .line 126
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    :goto_0
    return v2
.end method

.method private generateTaCardInfo(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    .locals 3

    .line 76
    new-instance v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;-><init>()V

    .line 77
    iput-object p1, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    .line 78
    const/4 v0, 0x2

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    .line 79
    iput p2, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 80
    const/16 v0, 0xb

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    .line 81
    iput-object p1, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    .line 82
    const/4 v0, 0x0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanFour:Ljava/lang/String;

    .line 83
    const/4 v0, 0x0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanDigest:Ljava/lang/String;

    .line 85
    const/4 v0, 0x1

    invoke-static {p5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    .line 87
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p5, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p5

    .line 89
    :cond_0
    iput-object p5, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    .line 90
    const/4 v0, 0x0

    iput-boolean v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    .line 91
    iput-object p3, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    .line 92
    iput-object p4, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    .line 93
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_watch.conf"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_file_name:Ljava/lang/String;

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_icon_watch.png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_name:Ljava/lang/String;

    .line 96
    iput-object p6, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->name:Ljava/lang/String;

    .line 97
    return-object v2
.end method


# virtual methods
.method public addTempTaCard(Ljava/lang/String;)I
    .locals 9

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v7

    .line 50
    if-nez v7, :cond_0

    .line 52
    const/16 v0, 0x63

    return v0

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v8

    .line 55
    if-nez v8, :cond_3

    .line 57
    move-object v0, p0

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    move-object v3, p1

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v4

    .line 58
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v6

    .line 57
    const/16 v2, 0xb

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->generateTaCardInfo(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v8

    .line 60
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getPayInfo()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 62
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getPayInfo()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getRequestId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanDigest:Ljava/lang/String;

    .line 65
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getPhoneNum()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 67
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getPhoneNum()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanFour:Ljava/lang/String;

    .line 69
    :cond_2
    invoke-direct {p0, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->addCardToTa(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)I

    move-result v0

    return v0

    .line 71
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public excuteAction(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->mIssuerId:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->addTempTaCard(Ljava/lang/String;)I

    .line 44
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;

    invoke-interface {p1, p2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;->issueTrafficCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;)V

    .line 45
    return-void
.end method

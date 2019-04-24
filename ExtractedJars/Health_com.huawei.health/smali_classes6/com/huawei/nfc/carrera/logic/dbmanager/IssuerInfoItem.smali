.class public Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private aid:Ljava/lang/String;

.field private appInfo:Ljava/lang/String;

.field private appInfos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/model/AppInfo;>;"
        }
    .end annotation
.end field

.field private bankAgreementTitle:Ljava/lang/String;

.field private bankAgreementUrl:Ljava/lang/String;

.field private busAgreementUrl:Ljava/lang/String;

.field private cityCode:Ljava/lang/String;

.field private contactNumber:Ljava/lang/String;

.field private creditCallCenterNumber:Ljava/lang/String;

.field private creditTcUrl:Ljava/lang/String;

.field private creditTermsTitle:Ljava/lang/String;

.field private creditTermsUrl:Ljava/lang/String;

.field private creditWebsite:Ljava/lang/String;

.field private debitCallCenterNumber:Ljava/lang/String;

.field private debitTcUrl:Ljava/lang/String;

.field private debitTermsTitle:Ljava/lang/String;

.field private debitTermsUrl:Ljava/lang/String;

.field private debitWebsite:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private isSupportDelete:I

.field private issuerCardSupport:Z

.field private issuerId:Ljava/lang/String;

.field private issuerType:I

.field private logoUrl:Ljava/lang/String;

.field private minRechargeAmount:D

.field private mode:I

.field private name:Ljava/lang/String;

.field private payTypeString:Ljava/lang/String;

.field private productId:Ljava/lang/String;

.field private rechargeSupport:Z

.field private reservedInfo:Ljava/lang/String;

.field private sn:I

.field private supportBusFlag:Ljava/lang/String;

.field private supportType:I

.field private timeStamp:J

.field private transferUrl:Ljava/lang/String;

.field private walletVersion:I

.field private wxLedgerSupport:Z

.field private wxPaySupport:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    const-class v0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 235
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->isSupportDelete:I

    .line 201
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->wxLedgerSupport:Z

    .line 206
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->wxPaySupport:Z

    .line 227
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->issuerCardSupport:Z

    .line 233
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->rechargeSupport:Z

    .line 236
    return-void
.end method

.method public constructor <init>(Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;)V
    .locals 4

    .line 238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->isSupportDelete:I

    .line 201
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->wxLedgerSupport:Z

    .line 206
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->wxPaySupport:Z

    .line 227
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->issuerCardSupport:Z

    .line 233
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->rechargeSupport:Z

    .line 239
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->getBundle()Landroid/os/Bundle;

    move-result-object v2

    .line 240
    const-string v0, "issuerId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->issuerId:Ljava/lang/String;

    .line 241
    const-string v0, "name"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->name:Ljava/lang/String;

    .line 242
    const-string v0, "description"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->description:Ljava/lang/String;

    .line 243
    const-string v0, "logoUrl"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->logoUrl:Ljava/lang/String;

    .line 244
    const-string v0, "issuerType"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->issuerType:I

    .line 245
    const-string v0, "supportType"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->supportType:I

    .line 246
    const-string v0, "mode"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->mode:I

    .line 248
    const-string v0, "walletVersion"

    :try_start_0
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->walletVersion:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 251
    goto :goto_0

    .line 249
    :catch_0
    move-exception v3

    .line 250
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->walletVersion:I

    .line 252
    :goto_0
    const-string v0, "contactNumber"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->contactNumber:Ljava/lang/String;

    .line 253
    const-string v0, "debitCallCenterNumber"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitCallCenterNumber:Ljava/lang/String;

    .line 254
    const-string v0, "creditCallCenterNumber"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditCallCenterNumber:Ljava/lang/String;

    .line 255
    const-string v0, "debitTcUrl"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitTcUrl:Ljava/lang/String;

    .line 256
    const-string v0, "creditTcUrl"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditTcUrl:Ljava/lang/String;

    .line 257
    const-string v0, "debitWebsite"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitWebsite:Ljava/lang/String;

    .line 258
    const-string v0, "creditWebsite"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditWebsite:Ljava/lang/String;

    .line 259
    const-string v0, "timeStamp"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->timeStamp:J

    .line 260
    const-string v0, "appInfo"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->appInfo:Ljava/lang/String;

    .line 261
    const-string v0, "reservedInfo"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->reservedInfo:Ljava/lang/String;

    .line 262
    const-string v0, "sn"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->sn:I

    .line 263
    const-string v0, "cityCode"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->cityCode:Ljava/lang/String;

    .line 264
    const-string v0, "payType"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->payTypeString:Ljava/lang/String;

    .line 266
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->parseReservedJson()V

    .line 267
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->parseAppInfoJson()V

    .line 269
    return-void
.end method

.method private parseReserved(Lorg/json/JSONObject;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 377
    const-string v0, "recharge_support"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 379
    const-string v0, "recharge_support"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->rechargeSupport:Z

    .line 381
    :cond_0
    const-string v0, "issuer_support"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 383
    const-string v0, "issuer_support"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->issuerCardSupport:Z

    .line 386
    :cond_1
    return-void
.end method


# virtual methods
.method public getAid()Ljava/lang/String;
    .locals 1

    .line 637
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->aid:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAppInfo()Ljava/lang/String;
    .locals 1

    .line 557
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->appInfo:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAppInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/model/AppInfo;>;"
        }
    .end annotation

    .line 653
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->appInfos:Ljava/util/List;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getBankAgreementTitle()Ljava/lang/String;
    .locals 1

    .line 621
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->bankAgreementTitle:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getBankAgreementUrl()Ljava/lang/String;
    .locals 1

    .line 629
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->bankAgreementUrl:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getBusAgreementUrl()Ljava/lang/String;
    .locals 1

    .line 669
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->busAgreementUrl:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCityCode()Ljava/lang/String;
    .locals 1

    .line 719
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->cityCode:Ljava/lang/String;

    return-object v0
.end method

.method public getContactNumber()Ljava/lang/String;
    .locals 1

    .line 499
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->contactNumber:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCreditCallCenterNumber()Ljava/lang/String;
    .locals 1

    .line 515
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditCallCenterNumber:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCreditTcUrl()Ljava/lang/String;
    .locals 1

    .line 531
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditTcUrl:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCreditTermsTitle()Ljava/lang/String;
    .locals 1

    .line 573
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditTermsTitle:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCreditTermsUrl()Ljava/lang/String;
    .locals 1

    .line 581
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditTermsUrl:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCreditWebsite()Ljava/lang/String;
    .locals 1

    .line 613
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditWebsite:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDebitCallCenterNumber()Ljava/lang/String;
    .locals 1

    .line 507
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitCallCenterNumber:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDebitTcUrl()Ljava/lang/String;
    .locals 1

    .line 523
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitTcUrl:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDebitTermsTitle()Ljava/lang/String;
    .locals 1

    .line 589
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitTermsTitle:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDebitTermsUrl()Ljava/lang/String;
    .locals 1

    .line 597
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitTermsUrl:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDebitWebsite()Ljava/lang/String;
    .locals 1

    .line 605
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitWebsite:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 451
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->description:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getIsSupportDelete()I
    .locals 1

    .line 693
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->isSupportDelete:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getIssuerCardSupport()Z
    .locals 1

    .line 736
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->issuerCardSupport:Z

    return v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 435
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->issuerId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerType()I
    .locals 1

    .line 467
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->issuerType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLogoUrl()Ljava/lang/String;
    .locals 1

    .line 459
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->logoUrl:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMinRechargeAmount()D
    .locals 2

    .line 685
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->minRechargeAmount:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getMode()I
    .locals 1

    .line 483
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->mode:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 443
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->name:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPayTypeString()Ljava/lang/String;
    .locals 1

    .line 727
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->payTypeString:Ljava/lang/String;

    return-object v0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1

    .line 645
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->productId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRechargeSupport()Z
    .locals 1

    .line 746
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->rechargeSupport:Z

    return v0
.end method

.method public getReservedInfo()Ljava/lang/String;
    .locals 1

    .line 565
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->reservedInfo:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSn()I
    .locals 1

    .line 677
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->sn:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getSupportBusFlag()Ljava/lang/String;
    .locals 1

    .line 661
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->supportBusFlag:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSupportType()I
    .locals 1

    .line 475
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->supportType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 539
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->timeStamp:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getTransferUrl()Ljava/lang/String;
    .locals 1

    .line 553
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->transferUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getWalletVersion()I
    .locals 1

    .line 491
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->walletVersion:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public isWxLedgerSupport()Z
    .locals 1

    .line 702
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->wxLedgerSupport:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isWxPaySupport()Z
    .locals 1

    .line 711
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->wxPaySupport:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final parseAppInfoJson()V
    .locals 16

    .line 390
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->appInfo:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->appInfo:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 393
    new-instance v6, Lorg/json/JSONObject;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->appInfo:Ljava/lang/String;

    invoke-direct {v6, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 394
    const-string v0, "appInfoList"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 395
    if-eqz v7, :cond_6

    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_6

    .line 396
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->appInfos:Ljava/util/List;

    .line 397
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v8, v0, :cond_6

    .line 398
    invoke-virtual {v7, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 399
    if-nez v9, :cond_0

    .line 400
    goto/16 :goto_1

    .line 402
    :cond_0
    const-string v10, ""

    .line 403
    const-string v11, ""

    .line 404
    const/4 v12, -0x1

    .line 405
    const-string v13, ""

    .line 406
    const-string v14, ""

    .line 408
    const-string v0, "issuer_app_pkg"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 409
    const-string v0, "issuer_app_pkg"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 411
    :cond_1
    const-string v0, "issuer_app_appId"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 412
    const-string v0, "issuer_app_appId"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 414
    :cond_2
    const-string v0, "supportType"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 415
    const-string v0, "supportType"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 417
    :cond_3
    const-string v0, "apk_icon_url"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 418
    const-string v0, "apk_icon_url"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 420
    :cond_4
    const-string v0, "apk_name"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 421
    const-string v0, "apk_name"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 423
    :cond_5
    new-instance v0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    move-object v1, v10

    move-object v2, v11

    move v3, v12

    move-object v4, v13

    move-object v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    .line 424
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->appInfos:Ljava/util/List;

    invoke-interface {v0, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 397
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 430
    :cond_6
    goto :goto_2

    .line 428
    :catch_0
    move-exception v6

    .line 429
    const-string v0, "parseReservedJson JSONException "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 432
    :goto_2
    return-void
.end method

.method public final parseReservedJson()V
    .locals 3

    .line 300
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->reservedInfo:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_f

    .line 301
    new-instance v2, Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->reservedInfo:Ljava/lang/String;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 303
    const-string v0, "transfer_agreement_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 305
    const-string v0, "transfer_agreement_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->transferUrl:Ljava/lang/String;

    .line 307
    :cond_0
    const-string v0, "credit_terms_title"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 308
    const-string v0, "credit_terms_title"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditTermsTitle:Ljava/lang/String;

    .line 311
    :cond_1
    const-string v0, "credit_terms_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 312
    const-string v0, "credit_terms_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditTermsUrl:Ljava/lang/String;

    .line 315
    :cond_2
    const-string v0, "debit_terms_title"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 316
    const-string v0, "debit_terms_title"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitTermsTitle:Ljava/lang/String;

    .line 319
    :cond_3
    const-string v0, "debit_terms_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 320
    const-string v0, "debit_terms_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitTermsUrl:Ljava/lang/String;

    .line 323
    :cond_4
    const-string v0, "bank_agreement_title"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 324
    const-string v0, "bank_agreement_title"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->bankAgreementTitle:Ljava/lang/String;

    .line 327
    :cond_5
    const-string v0, "bank_agreement_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 328
    const-string v0, "bank_agreement_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->bankAgreementUrl:Ljava/lang/String;

    .line 331
    :cond_6
    const-string v0, "aid"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 332
    const-string v0, "aid"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->aid:Ljava/lang/String;

    .line 335
    :cond_7
    const-string v0, "productId"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 336
    const-string v0, "productId"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->productId:Ljava/lang/String;

    .line 339
    :cond_8
    const-string v0, "bus_support"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 340
    const-string v0, "bus_support"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->supportBusFlag:Ljava/lang/String;

    .line 343
    :cond_9
    const-string v0, "bus_agreement_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 344
    const-string v0, "bus_agreement_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->busAgreementUrl:Ljava/lang/String;

    .line 347
    :cond_a
    const-string v0, "min_recharge_amount"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 348
    const-string v0, "min_recharge_amount"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->minRechargeAmount:D

    .line 350
    :cond_b
    const-string v0, "is_support_delete"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 351
    const-string v0, "is_support_delete"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->isSupportDelete:I

    .line 353
    :cond_c
    const-string v0, "wxledger_support"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 355
    const-string v0, "wxledger_support"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->wxLedgerSupport:Z

    .line 357
    :cond_d
    const-string v0, "wxpay_support"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 359
    const-string v0, "wxpay_support"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->wxPaySupport:Z

    .line 362
    :cond_e
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->parseReserved(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 366
    :cond_f
    goto :goto_0

    .line 364
    :catch_0
    move-exception v2

    .line 365
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parseReservedJson : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 367
    :goto_0
    return-void
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 1

    .line 641
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->aid:Ljava/lang/String;

    .line 642
    return-void
.end method

.method public setAppInfo(Ljava/lang/String;)V
    .locals 1

    .line 561
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->appInfo:Ljava/lang/String;

    .line 562
    return-void
.end method

.method public setAppInfos(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/model/AppInfo;>;)V"
        }
    .end annotation

    .line 657
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->appInfos:Ljava/util/List;

    .line 658
    return-void
.end method

.method public setBankAgreementTitle(Ljava/lang/String;)V
    .locals 1

    .line 625
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->bankAgreementTitle:Ljava/lang/String;

    .line 626
    return-void
.end method

.method public setBankAgreementUrl(Ljava/lang/String;)V
    .locals 1

    .line 633
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->bankAgreementUrl:Ljava/lang/String;

    .line 634
    return-void
.end method

.method public setBusAgreementUrl(Ljava/lang/String;)V
    .locals 1

    .line 673
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->busAgreementUrl:Ljava/lang/String;

    .line 674
    return-void
.end method

.method public setCityCode(Ljava/lang/String;)V
    .locals 0

    .line 723
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->cityCode:Ljava/lang/String;

    .line 724
    return-void
.end method

.method public setContactNumber(Ljava/lang/String;)V
    .locals 1

    .line 503
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->contactNumber:Ljava/lang/String;

    .line 504
    return-void
.end method

.method public setCreditCallCenterNumber(Ljava/lang/String;)V
    .locals 1

    .line 519
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditCallCenterNumber:Ljava/lang/String;

    .line 520
    return-void
.end method

.method public setCreditTcUrl(Ljava/lang/String;)V
    .locals 1

    .line 535
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditTcUrl:Ljava/lang/String;

    .line 536
    return-void
.end method

.method public setCreditTermsTitle(Ljava/lang/String;)V
    .locals 1

    .line 577
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditTermsTitle:Ljava/lang/String;

    .line 578
    return-void
.end method

.method public setCreditTermsUrl(Ljava/lang/String;)V
    .locals 1

    .line 585
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditTermsUrl:Ljava/lang/String;

    .line 586
    return-void
.end method

.method public setCreditWebsite(Ljava/lang/String;)V
    .locals 1

    .line 617
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditWebsite:Ljava/lang/String;

    .line 618
    return-void
.end method

.method public setDebitCallCenterNumber(Ljava/lang/String;)V
    .locals 1

    .line 511
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitCallCenterNumber:Ljava/lang/String;

    .line 512
    return-void
.end method

.method public setDebitTcUrl(Ljava/lang/String;)V
    .locals 1

    .line 527
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitTcUrl:Ljava/lang/String;

    .line 528
    return-void
.end method

.method public setDebitTermsTitle(Ljava/lang/String;)V
    .locals 1

    .line 593
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitTermsTitle:Ljava/lang/String;

    .line 594
    return-void
.end method

.method public setDebitTermsUrl(Ljava/lang/String;)V
    .locals 1

    .line 601
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitTermsUrl:Ljava/lang/String;

    .line 602
    return-void
.end method

.method public setDebitWebsite(Ljava/lang/String;)V
    .locals 1

    .line 609
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitWebsite:Ljava/lang/String;

    .line 610
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 1

    .line 455
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->description:Ljava/lang/String;

    .line 456
    return-void
.end method

.method public setIsSupportDelete(I)V
    .locals 1

    .line 697
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->isSupportDelete:I

    .line 698
    return-void
.end method

.method public setIssuerCardSupport(Z)V
    .locals 0

    .line 741
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->issuerCardSupport:Z

    .line 742
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 1

    .line 439
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->issuerId:Ljava/lang/String;

    .line 440
    return-void
.end method

.method public setIssuerType(I)V
    .locals 1

    .line 471
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->issuerType:I

    .line 472
    return-void
.end method

.method public setLogoUrl(Ljava/lang/String;)V
    .locals 1

    .line 463
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->logoUrl:Ljava/lang/String;

    .line 464
    return-void
.end method

.method public setMinRechargeAmount(D)V
    .locals 2

    .line 689
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->minRechargeAmount:D

    .line 690
    return-void
.end method

.method public setMode(I)V
    .locals 1

    .line 487
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->mode:I

    .line 488
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 1

    .line 447
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->name:Ljava/lang/String;

    .line 448
    return-void
.end method

.method public setPayTypeString(Ljava/lang/String;)V
    .locals 0

    .line 731
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->payTypeString:Ljava/lang/String;

    .line 732
    return-void
.end method

.method public setProductId(Ljava/lang/String;)V
    .locals 1

    .line 649
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->productId:Ljava/lang/String;

    .line 650
    return-void
.end method

.method public setRechargeSupport(Z)V
    .locals 0

    .line 751
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->rechargeSupport:Z

    .line 752
    return-void
.end method

.method public setReservedInfo(Ljava/lang/String;)V
    .locals 1

    .line 569
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->reservedInfo:Ljava/lang/String;

    .line 570
    return-void
.end method

.method public setSn(I)V
    .locals 1

    .line 681
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->sn:I

    .line 682
    return-void
.end method

.method public setSupportBusFlag(Ljava/lang/String;)V
    .locals 1

    .line 665
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->supportBusFlag:Ljava/lang/String;

    .line 666
    return-void
.end method

.method public setSupportType(I)V
    .locals 1

    .line 479
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->supportType:I

    .line 480
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 2

    .line 543
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->timeStamp:J

    .line 544
    return-void
.end method

.method public setTransferUrl(Ljava/lang/String;)V
    .locals 0

    .line 548
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->transferUrl:Ljava/lang/String;

    .line 549
    return-void
.end method

.method public setWalletVersion(I)V
    .locals 1

    .line 495
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->walletVersion:I

    .line 496
    return-void
.end method

.method public setWxLedgerSupport(Z)V
    .locals 1

    .line 707
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->wxLedgerSupport:Z

    .line 708
    return-void
.end method

.method public setWxPaySupport(Z)V
    .locals 1

    .line 715
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->wxPaySupport:Z

    .line 716
    return-void
.end method

.method public toContentValues()Landroid/content/ContentValues;
    .locals 4

    .line 272
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 273
    const-string v0, "issuer_id"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->issuerId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    const-string v0, "name"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->name:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    const-string v0, "description"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->description:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    const-string v0, "logo_url"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->logoUrl:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    const-string v0, "issuer_type"

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->issuerType:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 278
    const-string v0, "support_card_type"

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->supportType:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 279
    const-string v0, "mode"

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->mode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 280
    const-string v0, "wallet_version"

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->walletVersion:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 281
    const-string v0, "contact_num"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->contactNumber:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    const-string v0, "debit_callcenter_num"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitCallCenterNumber:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    const-string v0, "credit_call_center_num"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditCallCenterNumber:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    const-string v0, "debit_tcurl"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitTcUrl:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    const-string v0, "credit_tcurl"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditTcUrl:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    const-string v0, "credit_website_url"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->creditWebsite:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const-string v0, "debit_website_url"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->debitWebsite:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    const-string v0, "timestamp"

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->timeStamp:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 289
    const-string v0, "app_info"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->appInfo:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    const-string v0, "reserved_info"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->reservedInfo:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    const-string v0, "sn"

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->sn:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 292
    const-string v0, "city_code"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->cityCode:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    const-string v0, "pay_type"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->payTypeString:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    return-object v3
.end method

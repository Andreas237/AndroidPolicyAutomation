.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "UninstallTrafficCardSAOperator"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

.field private mUpdateTA:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;Z)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mContext:Landroid/content/Context;

    .line 51
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 52
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

    .line 53
    iput-boolean p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mUpdateTA:Z

    .line 54
    return-void
.end method

.method private handleErr(ILjava/lang/String;)V
    .locals 2

    .line 109
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 112
    :pswitch_0
    const/16 v1, 0xa

    .line 113
    goto :goto_1

    .line 115
    :pswitch_1
    const/16 v1, 0xb

    .line 116
    goto :goto_1

    .line 118
    :pswitch_2
    const/16 v1, 0x19

    .line 119
    goto :goto_1

    .line 125
    :goto_0
    const/16 v1, 0x63

    .line 126
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->reportErr(ILjava/lang/String;)V

    .line 129
    :goto_1
    invoke-direct {p0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->handleResult(I)V

    .line 130
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private handleResult(I)V
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;->handleResult(I)V

    .line 171
    :cond_0
    return-void
.end method

.method private reportErr(ILjava/lang/String;)V
    .locals 5

    .line 197
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 198
    const-string v0, "fail_reason"

    invoke-interface {v4, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    const-string v0, "fail_code"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    const-string v0, "issuerID"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x3611a46c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UninstallTrafficCardSAOperator err : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 202
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 201
    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    return-void
.end method

.method private setRequestInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;)V
    .locals 7

    .line 135
    const/4 v4, 0x0

    .line 137
    const-string v0, "90000029"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mContext:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;-><init>(Landroid/content/Context;)V

    .line 140
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->queryAppCode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 141
    goto :goto_0

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getCityCode()Ljava/lang/String;

    move-result-object v4

    .line 145
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " deleteApplet appCode=\u975e\u5cad\u5357\u901a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    :goto_0
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " deleteApplet appCode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    invoke-virtual {p2, v4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->setAppCode(Ljava/lang/String;)V

    .line 149
    const/4 v5, 0x1

    .line 150
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletInfoApiFactory;->createAppletCardInfoReader(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 151
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1, v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;->readTrafficCardInfo(Ljava/lang/String;Ljava/lang/String;I)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;

    move-result-object v6

    .line 152
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v0

    if-nez v0, :cond_1

    .line 154
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UninstallTrafficCardSAOperator, readTrafficCardInfo successs."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->getCardNum()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->setTrafficCardId(Ljava/lang/String;)V

    goto :goto_1

    .line 160
    :cond_1
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UninstallTrafficCardSAOperator, readTrafficCardInfo err. Code : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    :goto_1
    return-void
.end method

.method private updateTaAndReport(Ljava/lang/String;)Z
    .locals 5

    .line 180
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->removeCardByAid(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 191
    goto :goto_0

    .line 182
    :catch_0
    move-exception v4

    .line 184
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UninstallTrafficCardTask updateTaAndReport WalletTaCardNotExistException, ta removeCard failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    const/4 v0, 0x0

    return v0

    .line 187
    :catch_1
    move-exception v4

    .line 189
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UninstallTrafficCardTask updateTaAndReport WalletTaSystemErrorException, ta removeCard failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    const/4 v0, 0x0

    return v0

    .line 192
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public uninstall(Ljava/lang/String;)Z
    .locals 17

    .line 58
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " deleteApplet "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v6

    .line 60
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UninstallTrafficCardSAOperator uninstall failed. aid is illegal."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    move-object/from16 v0, p0

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->handleResult(I)V

    .line 64
    const/4 v0, 0x0

    return v0

    .line 66
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v7

    .line 67
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v8

    .line 68
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceSN()Ljava/lang/String;

    move-result-object v9

    .line 69
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getBusChipManu()Ljava/lang/String;

    move-result-object v10

    .line 70
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v11

    .line 71
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " cplc : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; imei : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; chipManu : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; model : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    move-object v3, v6

    move-object v4, v11

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v12, v0

    .line 74
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v13

    .line 75
    invoke-virtual {v13}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/nfc/PluginPayAdapter;

    .line 76
    invoke-interface {v14}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v15

    .line 77
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " userID : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    invoke-virtual {v12, v15}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->setAccountUserId(Ljava/lang/String;)V

    .line 79
    invoke-virtual {v12, v9}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->setImei(Ljava/lang/String;)V

    .line 80
    move-object/from16 v0, p1

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->setReason(Ljava/lang/String;)V

    .line 82
    move-object/from16 v0, p0

    invoke-direct {v0, v6, v12}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->setRequestInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;)V

    .line 84
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " deleteApplet setRequestInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createServerAccessService(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;

    move-result-object v0

    invoke-interface {v0, v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;->deleteApplet(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DeleteAppletResponse;

    move-result-object v16

    .line 86
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteApplet response ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DeleteAppletResponse;->getResultCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DeleteAppletResponse;->getResultCode()I

    move-result v0

    if-eqz v0, :cond_1

    .line 88
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DeleteAppletResponse;->getResultCode()I

    move-result v0

    const/16 v1, 0x138a

    if-ne v0, v1, :cond_2

    .line 90
    :cond_1
    const-string v0, "UninstallTrafficCardSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UninstallTrafficCardSAOperator uninstall success!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 92
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mUpdateTA:Z

    if-eqz v0, :cond_2

    .line 93
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->updateTaAndReport(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 95
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v6, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardDeletedStatus(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->handleResult(I)V

    .line 97
    const/4 v0, 0x1

    return v0

    .line 102
    :cond_2
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DeleteAppletResponse;->getResultCode()I

    move-result v0

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DeleteAppletResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->handleErr(ILjava/lang/String;)V

    .line 103
    const/4 v0, 0x0

    return v0
.end method

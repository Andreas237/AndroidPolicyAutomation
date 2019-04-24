.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

.field private mUpdateTA:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;Z)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mContext:Landroid/content/Context;

    .line 35
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 36
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

    .line 37
    iput-boolean p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mUpdateTA:Z

    .line 38
    return-void
.end method

.method private handleTsmOperatorReturnCode(I)I
    .locals 2

    .line 99
    const/16 v1, 0x63

    .line 100
    if-nez p1, :cond_0

    .line 102
    const/4 v1, 0x0

    goto :goto_0

    .line 104
    :cond_0
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    .line 106
    const/16 v1, 0xb

    goto :goto_0

    .line 108
    :cond_1
    const/4 v0, -0x2

    if-ne p1, v0, :cond_2

    .line 110
    const/16 v1, 0x19

    .line 112
    :cond_2
    :goto_0
    return v1
.end method

.method private updateTaAndReport(Ljava/lang/String;)Z
    .locals 4

    .line 123
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->removeCardByAid(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 134
    goto :goto_0

    .line 125
    :catch_0
    move-exception v3

    .line 127
    const-string v0, "UninstallTrafficCardTask updateTaAndReport WalletTaCardNotExistException, ta removeCard failed"

    invoke-static {v0, v3}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    const/4 v0, 0x0

    return v0

    .line 130
    :catch_1
    move-exception v3

    .line 132
    const-string v0, "UninstallTrafficCardTask updateTaAndReport WalletTaSystemErrorException, ta removeCard failed"

    invoke-static {v0, v3}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    const/4 v0, 0x0

    return v0

    .line 137
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 140
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, p1, v1, v2}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardDeletedStatus(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 141
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public uninstall()V
    .locals 11

    .line 42
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v4

    .line 43
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    const-string v0, "UninstallTrafficCardFMOperator uninstall failed. aid is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;->handleResult(I)V

    .line 47
    return-void

    .line 50
    :cond_0
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/SynESETsmOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v0, v4, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/SynESETsmOperator;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/SynESETsmOperator;->excute()I

    move-result v6

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "synESETsmOperator resultCode :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 55
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 57
    invoke-direct {p0, v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->handleTsmOperatorReturnCode(I)I

    move-result v7

    .line 58
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

    invoke-virtual {v0, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;->handleResult(I)V

    .line 60
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 61
    const-string v0, "fail_reason"

    const-string v1, "SynESETsmOperator ERROR"

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    const-string v0, "fail_code"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SynESETsmOperator return resultCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x3611a423

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v8, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 65
    return-void

    .line 69
    :cond_1
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v7, v0, v4, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 70
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;->excute()I

    move-result v8

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeleteSSDTsmOperator result is :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 72
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 74
    invoke-direct {p0, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->handleTsmOperatorReturnCode(I)I

    move-result v9

    .line 75
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

    invoke-virtual {v0, v9}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;->handleResult(I)V

    .line 77
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 78
    const-string v0, "fail_reason"

    const-string v1, "DeleteSSDTsmOperator ERROR"

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    const-string v0, "fail_code"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeleteSSDTsmOperator return excuteResultCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x3611a423

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v10, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 82
    return-void

    .line 86
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mUpdateTA:Z

    if-eqz v0, :cond_3

    .line 88
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->updateTaAndReport(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 90
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;->handleResult(I)V

    .line 93
    :cond_3
    return-void
.end method

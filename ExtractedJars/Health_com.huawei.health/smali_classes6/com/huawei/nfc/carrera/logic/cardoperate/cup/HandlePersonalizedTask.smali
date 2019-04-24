.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask$SetCardDefaultCallbackImpl;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "HandlePersonalizedTask"


# instance fields
.field private final mAid:Ljava/lang/String;

.field private final mContext:Landroid/content/Context;

.field private final mListener:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;

.field private final mRefId:Ljava/lang/String;

.field private final mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;

.field private final taskCplc:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    .line 72
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->taskCplc:Ljava/lang/String;

    .line 73
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mRefId:Ljava/lang/String;

    .line 74
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mAid:Ljava/lang/String;

    .line 75
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;

    .line 76
    iput-object p6, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mListener:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;

    .line 77
    return-void
.end method

.method private getCurCardName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 172
    new-instance v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;-><init>(Landroid/content/Context;)V

    .line 173
    invoke-virtual {v1, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryIssuerInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v2

    .line 174
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 175
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 177
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method private reportBI(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 4

    .line 184
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheCardProductInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    move-result-object v3

    .line 186
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 188
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mAid:Ljava/lang/String;

    const-string v2, ""

    invoke-static {v0, v1, v2, p2, p3}, Lcom/huawei/nfc/carrera/logic/util/NfcHianalyticsUtil;->onReportForCardOpened(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 192
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mAid:Ljava/lang/String;

    iget-object v2, v3, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productName:Ljava/lang/String;

    invoke-static {v0, v1, v2, p2, p3}, Lcom/huawei/nfc/carrera/logic/util/NfcHianalyticsUtil;->onReportForCardOpened(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 194
    :goto_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 87
    const-string v0, "===123=== HandlePersonalizedTask run"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v7

    .line 89
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->taskCplc:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    const-string v0, "personalized, but cplc not match."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 92
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;->notifyHandleResult(I)V

    .line 93
    return-void

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v8

    .line 97
    const/4 v0, 0x0

    if-ne v0, v8, :cond_1

    .line 99
    const-string v0, "personalized, but card not exsited in ta."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 100
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;->notifyHandleResult(I)V

    .line 101
    return-void

    .line 104
    :cond_1
    iget v9, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 105
    packed-switch v9, :pswitch_data_0

    goto :goto_0

    .line 110
    :pswitch_0
    const/4 v0, 0x1

    iput v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 111
    goto :goto_1

    .line 115
    :pswitch_1
    const/4 v0, 0x2

    iput v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 116
    goto :goto_1

    .line 118
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;->notifyHandleResult(I)V

    .line 119
    return-void

    .line 122
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mRefId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mAid:Ljava/lang/String;

    iget v3, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateTaCardInfoForCUP(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v10

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===TA==HandlePersonalizedTask isUpdateCardSuccess="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 127
    const-string v0, "HandlePersonalizedTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " CardEvent PERSONALIZED bank cardEvent END_LOCK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mRefId:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardEvent(Ljava/lang/String;I)V

    .line 130
    if-eqz v10, :cond_6

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mListener:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 135
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mListener:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;

    const-string v1, "DOWNLOAD"

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mRefId:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;->operateFinished(Ljava/lang/String;Ljava/lang/String;I)V

    .line 140
    :cond_2
    iget v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    if-eq v9, v0, :cond_3

    .line 142
    const-string v0, "card status changed, refresh card list now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 147
    :cond_3
    iget v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 149
    iget-object v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->getCurCardName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 150
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mAid:Ljava/lang/String;

    iget-object v2, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v11, v2}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardOpenedNotActiveStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    goto :goto_2

    .line 153
    :cond_4
    iget v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_5

    .line 155
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iget-object v1, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask$SetCardDefaultCallbackImpl;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask$SetCardDefaultCallbackImpl;-><init>()V

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->setCardDefault(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;)V

    .line 156
    iget-object v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->getCurCardName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 157
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mAid:Ljava/lang/String;

    move-object v3, v11

    iget-object v4, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    iget-object v5, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    iget v6, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v2, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardOpenedAvailableStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 159
    iget-object v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    iget-object v1, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    iget v2, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->reportBI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 161
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->remove(Ljava/lang/String;)Z

    .line 162
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;->notifyHandleResult(I)V

    goto :goto_3

    .line 166
    :cond_6
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;->notifyHandleResult(I)V

    .line 168
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5d
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

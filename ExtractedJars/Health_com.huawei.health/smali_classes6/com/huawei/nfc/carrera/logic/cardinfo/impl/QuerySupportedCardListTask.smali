.class public abstract Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final CLIENT_VERSION_CODE:Ljava/lang/String; = "client_version_code"

.field private static final DEVICE_SN_OF_SUPPORT_CARD:Ljava/lang/String; = "device_sn_of_support_card"

.field private static final HUAWEI_HEALTH:Ljava/lang/String; = "HUAWEI-HEALTH"

.field private static final KEY_QUERY_SUPPORTED_CARD_ISSUERS:Ljava/lang/String; = "query_supported_card_issuers"

.field private static final KEY_QUERY_SUPPORTED_CARD_TIME:Ljava/lang/String; = "query_supported_card_time"

.field private static final QUERY_SUPPORT_CARD_VALID_TIME:J = 0x2932e00L

.field private static final ROM_VERSION:Ljava/lang/String; = "rom_version"

.field private static final TAG:Ljava/lang/String; = "QuerySupportedCardListTask"


# instance fields
.field protected mContext:Landroid/content/Context;

.field private mModule:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    .line 59
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    .line 65
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mModule:Ljava/lang/String;

    .line 66
    return-void
.end method

.method private getCardServer()Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;
    .locals 3

    .line 316
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mModule:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mModule:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 318
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mModule:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 322
    :cond_0
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;)V

    .line 324
    :goto_0
    return-object v2
.end method

.method private getDeviceSN()Ljava/lang/String;
    .locals 5

    .line 300
    const-string v0, "QuerySupportedCardListTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getDeviceSN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 302
    const-string v0, ""

    return-object v0

    .line 304
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceSN()Ljava/lang/String;

    move-result-object v4

    .line 305
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 306
    const-string v0, "QuerySupportedCardListTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceSN watchModle is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    const-string v0, ""

    return-object v0

    .line 309
    :cond_1
    return-object v4
.end method

.method private getLocalSupportedIssuers()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 233
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "query_supported_card_issuers"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 234
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 238
    :cond_0
    const-string v0, "\\|"

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 239
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private getVersionStr(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 283
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 284
    const-string v3, ""

    .line 285
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 286
    return-object v3

    .line 288
    :cond_0
    const-string v0, "\\."

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 290
    array-length v0, v4

    const/4 v1, 0x2

    if-gt v0, v1, :cond_1

    .line 291
    return-object p1

    .line 293
    :cond_1
    const/4 v0, 0x0

    aget-object v0, v4, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v1, v4, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "."

    .line 294
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v1, v4, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    .line 296
    return-object v3
.end method

.method private getWearBTVersion()Ljava/lang/String;
    .locals 5

    .line 250
    const-string v0, "QuerySupportedCardListTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getWearBTVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 253
    const-string v0, ""

    return-object v0

    .line 256
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceBTVersion()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->getVersionStr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 258
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 259
    const-string v0, "QuerySupportedCardListTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWearBTVersion btVersion is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    const-string v0, ""

    return-object v0

    .line 262
    :cond_1
    return-object v4
.end method

.method private getWearModle()Ljava/lang/String;
    .locals 5

    .line 267
    const-string v0, "QuerySupportedCardListTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getWearModle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 270
    const-string v0, ""

    return-object v0

    .line 273
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v4

    .line 274
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 275
    const-string v0, "QuerySupportedCardListTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWearModle watchModle is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    const-string v0, ""

    return-object v0

    .line 278
    :cond_1
    return-object v4
.end method

.method private getWearRomVersion()Ljava/lang/String;
    .locals 5

    .line 243
    const-string v0, "QuerySupportedCardListTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getWearRomVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 245
    const-string v0, "HUAWEI-HEALTH"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->getWearModle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->getWearBTVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 246
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private isLastCheckTimeValid(JJ)Z
    .locals 4

    .line 119
    sub-long v0, p3, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    .line 120
    const-wide/32 v0, 0x2932e00

    cmp-long v0, v2, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isRomOrClientVersionChanged()Z
    .locals 13

    .line 129
    const-string v0, "QuerySupportedCardListTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter isRomOrClientVersionChanged "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/utils/PackageUtil;->e(Landroid/content/Context;)I

    move-result v4

    .line 131
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->getWearRomVersion()Ljava/lang/String;

    move-result-object v5

    .line 133
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->getDeviceSN()Ljava/lang/String;

    move-result-object v6

    .line 134
    const-string v0, "QuerySupportedCardListTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " new get clientVersionCode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; romVersion : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "client_version_code"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInt(Ljava/lang/String;I)I

    move-result v7

    .line 136
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "rom_version"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 137
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "device_sn_of_support_card"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 138
    const-string v0, "QuerySupportedCardListTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " local localClientVersion : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; localRomVersion : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; localDevice_SN : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    if-eqz v7, :cond_0

    if-eq v4, v7, :cond_1

    :cond_0
    const/4 v10, 0x1

    goto :goto_0

    :cond_1
    const/4 v10, 0x0

    .line 140
    :goto_0
    const/4 v0, 0x1

    invoke-static {v8, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    const/4 v11, 0x1

    goto :goto_1

    :cond_3
    const/4 v11, 0x0

    .line 141
    :goto_1
    const/4 v0, 0x1

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    const/4 v12, 0x1

    goto :goto_2

    :cond_5
    const/4 v12, 0x0

    .line 143
    :goto_2
    if-eqz v10, :cond_6

    .line 145
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "client_version_code"

    invoke-virtual {v0, v1, v4}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putInt(Ljava/lang/String;I)Z

    .line 147
    :cond_6
    if-eqz v11, :cond_7

    .line 149
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "rom_version"

    invoke-virtual {v0, v1, v5}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putString(Ljava/lang/String;Ljava/lang/String;)Z

    .line 151
    :cond_7
    if-eqz v12, :cond_8

    .line 153
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "device_sn_of_support_card"

    invoke-virtual {v0, v1, v6}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putString(Ljava/lang/String;Ljava/lang/String;)Z

    .line 156
    :cond_8
    if-nez v10, :cond_9

    if-nez v11, :cond_9

    if-eqz v12, :cond_a

    :cond_9
    const/4 v0, 0x1

    goto :goto_3

    :cond_a
    const/4 v0, 0x0

    :goto_3
    return v0
.end method

.method private querySupportedIssuersFromServer()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 174
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/utils/PackageUtil;->e(Landroid/content/Context;)I

    move-result v4

    .line 177
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->getWearModle()Ljava/lang/String;

    move-result-object v5

    .line 178
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->getWearRomVersion()Ljava/lang/String;

    move-result-object v6

    .line 180
    new-instance v7, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;

    invoke-direct {v7}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;-><init>()V

    .line 181
    invoke-virtual {v7, v5}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->setTerminal(Ljava/lang/String;)V

    .line 182
    invoke-virtual {v7, v6}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->setRomVersion(Ljava/lang/String;)V

    .line 183
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->setWalletVersion(Ljava/lang/String;)V

    .line 185
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->getCardServer()Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    move-result-object v8

    .line 186
    invoke-virtual {v8, v7}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->querySupportedCardListByTerminal(Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;)Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;

    move-result-object v9

    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getSupportedCardList querySupportedCardListByTerminal returnCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v9, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 190
    iget v0, v9, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->returnCode:I

    if-nez v0, :cond_1

    .line 192
    iget-object v10, v9, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->issuersString:Ljava/lang/String;

    .line 193
    const/4 v0, 0x1

    invoke-static {v10, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "query_supported_card_issuers"

    invoke-virtual {v0, v1, v10}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putString(Ljava/lang/String;Ljava/lang/String;)Z

    .line 198
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "query_supported_card_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putLong(Ljava/lang/String;Ljava/lang/Long;)Z

    .line 199
    const-string v0, "\\|"

    invoke-virtual {v10, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 201
    :cond_0
    goto/16 :goto_0

    .line 202
    :cond_1
    iget v0, v9, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->returnCode:I

    const/4 v1, -0x4

    if-ne v0, v1, :cond_2

    .line 204
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 205
    const-string v11, "getSupportedCardList querySupportedCardListByTerminal server overload 503"

    .line 206
    const-string v0, "fail_reason"

    invoke-interface {v10, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    const v0, 0x3611a442

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v10, v11, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 208
    goto :goto_0

    .line 211
    :cond_2
    iget v0, v9, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->returnCode:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget v0, v9, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->returnCode:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_3

    .line 214
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 215
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getSupportedCardList querySupportedCardListByTerminal fail, error code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v9, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 216
    const-string v0, "fail_reason"

    invoke-interface {v10, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    const v0, 0x3611a443

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v10, v11, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 218
    goto :goto_0

    .line 221
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getSupportedCardList querySupportedCardListByTerminal "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v9, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 224
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method


# virtual methods
.method protected abstract getSupportedCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)TT;"
        }
    .end annotation
.end method

.method public getSupportedCardList()Ljava/util/Map;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;TT;>;"
        }
    .end annotation

    .line 75
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 76
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItems()Ljava/util/Map;

    move-result-object v5

    .line 77
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    return-object v4

    .line 81
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->getLocalSupportedIssuers()Ljava/util/List;

    move-result-object v6

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getSupportedCardList getLocalSupportedIssuers size : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "query_supported_card_time"

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getLong(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    .line 86
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 89
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v7, v8, v9, v10}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->isLastCheckTimeValid(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->isRomOrClientVersionChanged()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 91
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->querySupportedIssuersFromServer()Ljava/util/List;

    move-result-object v6

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getSupportedCardList querySupportedIssuersFromServer size : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 95
    :cond_2
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    .line 97
    invoke-interface {v5, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 98
    const/4 v0, 0x0

    if-eq v0, v13, :cond_3

    .line 100
    invoke-virtual {p0, v13}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->getSupportedCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Ljava/lang/Object;

    move-result-object v14

    .line 101
    if-eqz v14, :cond_3

    .line 103
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    :cond_3
    goto :goto_0

    .line 107
    :cond_4
    const-string v0, "getSupportedCardList end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 108
    return-object v4
.end method

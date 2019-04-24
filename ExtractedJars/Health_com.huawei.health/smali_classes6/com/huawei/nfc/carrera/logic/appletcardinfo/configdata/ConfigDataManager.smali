.class public final Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;


# static fields
.field private static final APDU_QUERY_CARD_NUM:Ljava/lang/String; = "00B2011400"

.field private static final SYNC_LOCK:[B

.field private static final TAG:Ljava/lang/String; = "ConfigData"

.field private static volatile sInstance:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager; = null


# instance fields
.field private currentApduSet:Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;

.field private hciConfigDatas:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciConfigInfo;>;>;"
        }
    .end annotation
.end field

.field private localApduRepo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;>;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private oriApduDatas:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->oriApduDatas:Ljava/util/Map;

    .line 46
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->localApduRepo:Ljava/util/Map;

    .line 51
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->hciConfigDatas:Ljava/util/Map;

    .line 61
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->mContext:Landroid/content/Context;

    .line 62
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;
    .locals 4

    .line 66
    sget-object v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->sInstance:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 68
    sget-object v2, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->SYNC_LOCK:[B

    monitor-enter v2

    .line 70
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->sInstance:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 72
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->sInstance:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 76
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->sInstance:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;

    return-object v0
.end method

.method private parseJson2ApduSet(Ljava/lang/String;)V
    .locals 9

    .line 138
    const-string v0, "ConfigData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseJson2ApduSet begin for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheCardProductInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    move-result-object v4

    .line 140
    if-nez v4, :cond_0

    .line 141
    const-string v0, "ConfigData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parseJson2ApduSet infoItem is null  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    return-void

    .line 144
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getReservedNField()Ljava/util/List;

    move-result-object v5

    .line 146
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 147
    const-string v0, "ConfigData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseJson2ApduSet oriDatas is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    return-void

    .line 151
    :cond_1
    new-instance v6, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->mContext:Landroid/content/Context;

    invoke-direct {v6, v0, v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 152
    const/4 v7, 0x0

    .line 154
    :try_start_0
    invoke-virtual {v6, p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->parseJson2ApduSet(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    .line 158
    goto :goto_0

    .line 155
    :catch_0
    move-exception v8

    .line 156
    const-string v0, "ConfigData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AppletCardException e : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    return-void

    .line 159
    :goto_0
    const-string v0, "ConfigData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseJson2ApduSet end for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->oriApduDatas:Ljava/util/Map;

    invoke-interface {v0, p1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    return-void
.end method

.method private prepareApdus(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 81
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->oriApduDatas:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;

    .line 82
    if-nez v1, :cond_0

    .line 85
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->parseJson2ApduSet(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->oriApduDatas:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;

    .line 89
    :cond_0
    iput-object v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->currentApduSet:Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;

    .line 90
    return-void
.end method


# virtual methods
.method public getApudList(Ljava/lang/String;I)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 102
    const-string v0, "ConfigData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getApudList begin. productId : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " type : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->prepareApdus(Ljava/lang/String;)V

    .line 104
    const/4 v4, 0x0

    .line 105
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 108
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->currentApduSet:Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;

    const-string v1, "status"

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->getApduByType(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 109
    goto :goto_0

    .line 111
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->currentApduSet:Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;

    const-string v1, "num"

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->getApduByType(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 112
    goto :goto_0

    .line 114
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->currentApduSet:Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;

    const-string v1, "date"

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->getApduByType(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 115
    goto :goto_0

    .line 117
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->currentApduSet:Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;

    const-string v1, "amount"

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->getApduByType(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 118
    goto :goto_0

    .line 120
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->currentApduSet:Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;

    const-string v1, "records"

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->getApduByType(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 121
    goto :goto_0

    .line 123
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->currentApduSet:Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;

    const-string v1, "consumerecords"

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->getApduByType(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 124
    .line 128
    :goto_0
    :pswitch_6
    if-nez v4, :cond_0

    if-eqz p2, :cond_0

    .line 130
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "apdu is null for card "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " apdu type : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 133
    :cond_0
    const-string v0, "ConfigData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getApudList end. productId : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " type : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method public isSameApduNumAndDate(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 95
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->prepareApdus(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->currentApduSet:Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->isSameApduNumAndDate()Z

    move-result v0

    return v0
.end method

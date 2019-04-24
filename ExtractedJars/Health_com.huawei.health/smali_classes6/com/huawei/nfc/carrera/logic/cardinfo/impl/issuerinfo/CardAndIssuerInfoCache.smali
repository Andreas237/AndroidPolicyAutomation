.class public final Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache$IconDownloadCallback;
    }
.end annotation


# static fields
.field public static final BUS_DIC_NAME:Ljava/lang/String; = "bus_support"

.field private static final SYNC_LOCK:Ljava/lang/Object;

.field public static final sCardBusSupprotLock:Ljava/lang/Object;

.field public static final sCardInfoLock:Ljava/lang/Object;

.field private static sInstance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache; = null

.field public static final sIssuerInfoLock:Ljava/lang/Object;


# instance fields
.field private final cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

.field private final cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

.field private final mCardInfos:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;>;"
        }
    .end annotation
.end field

.field private final mContext:Landroid/content/Context;

.field private final mIssuerInfos:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;"
        }
    .end annotation
.end field

.field mRefreshLocalIconCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->SYNC_LOCK:Ljava/lang/Object;

    .line 45
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->sCardInfoLock:Ljava/lang/Object;

    .line 47
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->sIssuerInfoLock:Ljava/lang/Object;

    .line 49
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->sCardBusSupprotLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mCardInfos:Ljava/util/Map;

    .line 43
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mIssuerInfos:Ljava/util/Map;

    .line 150
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache$IconDownloadCallback;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache$IconDownloadCallback;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mRefreshLocalIconCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

    .line 58
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mContext:Landroid/content/Context;

    .line 59
    new-instance v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-direct {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    .line 60
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    .line 61
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;
    .locals 3

    .line 64
    sget-object v1, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->SYNC_LOCK:Ljava/lang/Object;

    monitor-enter v1

    .line 65
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->sInstance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    if-nez v0, :cond_0

    .line 66
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->sInstance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    .line 68
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->sInstance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 69
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public cacheCardProductInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;
    .locals 7

    .line 185
    sget-object v3, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->sCardInfoLock:Ljava/lang/Object;

    monitor-enter v3

    .line 187
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mCardInfos:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    .line 188
    if-nez v4, :cond_1

    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cacheCardProductInfoItem cache is miss, query from db. productId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 191
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->loadLocalCardProductInfo()V

    .line 192
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mCardInfos:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 193
    if-eqz v4, :cond_0

    .line 195
    monitor-exit v3

    return-object v4

    .line 197
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cacheCardProductInfoItem query db is miss, query from server. productId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 198
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {v5, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;)V

    .line 199
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->syncCardProductInfoFromServer()V

    .line 200
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->loadLocalCardProductInfo()V

    .line 201
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mCardInfos:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    .line 203
    if-eqz v4, :cond_1

    .line 205
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    iget-object v1, v4, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->pictureUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mRefreshLocalIconCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

    invoke-virtual {v0, p1, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLocalCardIcon(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 209
    :cond_1
    monitor-exit v3

    return-object v4

    .line 210
    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6
.end method

.method public cacheCardProductInfoItems()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;>;"
        }
    .end annotation

    .line 132
    sget-object v2, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->sCardInfoLock:Ljava/lang/Object;

    monitor-enter v2

    .line 134
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mCardInfos:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->loadLocalCardProductInfo()V

    .line 137
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mCardInfos:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mCardInfos:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 141
    :cond_0
    const-string v0, "cacheCardProductInfoItems query db is empty, query from server."

    :try_start_1
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 142
    new-instance v3, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {v3, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;)V

    .line 143
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->syncIssuerInfoFromServer()V

    .line 144
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->loadLocalCardProductInfo()V

    .line 146
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mCardInfos:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    return-object v0

    .line 147
    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4
.end method

.method public cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;
    .locals 8

    .line 155
    sget-object v4, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->sIssuerInfoLock:Ljava/lang/Object;

    monitor-enter v4

    .line 157
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mIssuerInfos:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 158
    if-nez v5, :cond_1

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cacheIssuerInfoItem cache is miss, query from db. issuerId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 161
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->loadLocalIssuerInfo()V

    .line 162
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mIssuerInfos:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    if-eqz v5, :cond_0

    .line 165
    monitor-exit v4

    return-object v5

    .line 167
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cacheIssuerInfoItem query db is miss, query from server. issuerId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 168
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {v6, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;)V

    .line 169
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->syncIssuerInfoFromServer()V

    .line 170
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->loadLocalIssuerInfo()V

    .line 171
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mIssuerInfos:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 173
    if-eqz v5, :cond_1

    .line 175
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getLogoUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAppInfos()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mRefreshLocalIconCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshCardSmlPics(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    :cond_1
    monitor-exit v4

    return-object v5

    .line 180
    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7
.end method

.method public cacheIssuerInfoItems()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;"
        }
    .end annotation

    .line 112
    sget-object v2, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->sIssuerInfoLock:Ljava/lang/Object;

    monitor-enter v2

    .line 114
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mIssuerInfos:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 116
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->loadLocalIssuerInfo()V

    .line 117
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mIssuerInfos:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 119
    new-instance v0, Ljava/util/LinkedHashMap;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mIssuerInfos:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 121
    :cond_0
    const-string v0, "cacheIssuerInfoItems query db is empty, query from server."

    :try_start_1
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 122
    new-instance v3, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {v3, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;)V

    .line 123
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->syncIssuerInfoFromServer()V

    .line 124
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->loadLocalIssuerInfo()V

    .line 126
    :cond_1
    new-instance v0, Ljava/util/LinkedHashMap;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mIssuerInfos:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    return-object v0

    .line 127
    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4
.end method

.method public loadLocalCardProductInfo()V
    .locals 7

    .line 97
    const-string v0, "loadLocalCardProductInfo begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 98
    sget-object v2, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->sCardInfoLock:Ljava/lang/Object;

    monitor-enter v2

    .line 100
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryCardProductInfo()Ljava/util/List;

    move-result-object v3

    .line 101
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mCardInfos:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 102
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    .line 104
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mCardInfos:Ljava/util/Map;

    iget-object v1, v5, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productId:Ljava/lang/String;

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v2

    throw v6

    .line 107
    :goto_1
    const-string v0, "loadLocalCardProductInfo end."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 108
    return-void
.end method

.method public loadLocalIssuerInfo()V
    .locals 7

    .line 75
    const-string v0, "loadLocalIssuerInfo begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 76
    sget-object v2, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->sIssuerInfoLock:Ljava/lang/Object;

    monitor-enter v2

    .line 78
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryIssuerInfo()Ljava/util/List;

    move-result-object v3

    .line 80
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mIssuerInfos:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 81
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 84
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/IssuerInfoComparator;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/IssuerInfoComparator;-><init>()V

    invoke-static {v3, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 86
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 88
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->mIssuerInfos:Ljava/util/Map;

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    goto :goto_0

    .line 91
    :cond_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v2

    throw v6

    .line 92
    :goto_1
    const-string v0, "loadLocalIssuerInfo end."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 93
    return-void
.end method

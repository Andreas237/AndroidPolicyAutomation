.class public final Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;


# static fields
.field private static final CIRCLE_ANGLE:F = 20.0f

.field public static final DOWNLOAD_APKICON:I = 0x2

.field public static final DOWNLOAD_CARD_ICON:I = 0x0

.field public static final DOWNLOAD_LOGO:I = 0x1

.field public static final DOWNLOAD_RFCONF_FILE:I = 0x3

.field private static final DOWNLOAD_THREAD_POOL_NUMBER:I = 0x3

.field private static final SYNC_LOCK:[B

.field private static final TAG:Ljava/lang/String; = "CardPicRescManager"

.field private static instance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager; = null

.field private static pool:Ljava/util/concurrent/ExecutorService; = null

.field private static final poolLock:Ljava/lang/Object;


# instance fields
.field private iconHeight:I

.field private iconWidth:I

.field private mApkIconCache:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private mDefaultIcon:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private mDefaultLogo:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private mLogoCache:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private mPaint:Landroid/graphics/Paint;

.field private mXfermodeSRC_IN:Landroid/graphics/Xfermode;

.field private refreshApkIconCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;>;"
        }
    .end annotation
.end field

.field private final refreshApkIconLock:Ljava/lang/Object;

.field private final refreshIconAidsLock:Ljava/lang/Object;

.field private refreshIconCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;>;"
        }
    .end annotation
.end field

.field private refreshLogoCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;>;"
        }
    .end annotation
.end field

.field private final refreshLogoLock:Ljava/lang/Object;

.field private refreshRFConfCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;>;"
        }
    .end annotation
.end field

.field private final refreshRFConfLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 89
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->poolLock:Ljava/lang/Object;

    .line 174
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->instance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    .line 181
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 184
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshIconAidsLock:Ljava/lang/Object;

    .line 119
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLogoLock:Ljava/lang/Object;

    .line 124
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshApkIconLock:Ljava/lang/Object;

    .line 129
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshRFConfLock:Ljava/lang/Object;

    .line 134
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mLogoCache:Ljava/util/HashMap;

    .line 139
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mApkIconCache:Ljava/util/HashMap;

    .line 159
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mXfermodeSRC_IN:Landroid/graphics/Xfermode;

    .line 185
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    .line 186
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mPaint:Landroid/graphics/Paint;

    .line 187
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mPaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 189
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$dimen;->card_default_card_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->iconWidth:I

    .line 190
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$dimen;->card_default_card_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->iconHeight:I

    .line 191
    return-void
.end method

.method private getBitmapFromApk(I)Landroid/graphics/Bitmap;
    .locals 3

    .line 820
    const/4 v1, 0x0

    .line 823
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v1, v0

    .line 828
    goto :goto_0

    .line 825
    :catch_0
    move-exception v2

    .line 827
    const-string v0, "getBitmapFromApk, out of memory error!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 830
    :goto_0
    return-object v1
.end method

.method private getBitmapFromStorage(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 4

    .line 793
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dsy;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 795
    const-string v0, "getBitmapFromStorage, but no read sdcard permission."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 796
    const/4 v0, 0x0

    return-object v0

    .line 799
    :cond_0
    const/4 v2, 0x0

    .line 802
    :try_start_0
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 807
    goto :goto_0

    .line 804
    :catch_0
    move-exception v3

    .line 806
    const-string v0, "getBitmapFromStorage, out of memory error!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 809
    :goto_0
    return-object v2
.end method

.method private getCardApkIcon(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 4

    .line 366
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 368
    const-string v0, "getCardLogo, issuerId is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 369
    const/4 v0, 0x0

    return-object v0

    .line 372
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mApkIconCache:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/graphics/Bitmap;

    .line 374
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 376
    return-object v2

    .line 378
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicPathConfig;->getCardApkIconPath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 379
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getCardApkIcon cardApkIconPath : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 380
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getBitmapFromStorage(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 381
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 383
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mApkIconCache:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    :cond_2
    return-object v2
.end method

.method private getCardIconBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 3

    .line 211
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    const-string v0, "getCardIcon, productId is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 214
    const/4 v0, 0x0

    return-object v0

    .line 217
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/wallet/storage/path/NfcStorageUtil;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getCardIcon cardIconPath : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 222
    invoke-static {}, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->a()Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;
    .locals 3

    .line 194
    sget-object v1, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->SYNC_LOCK:[B

    monitor-enter v1

    .line 195
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->instance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    if-nez v0, :cond_0

    .line 196
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->instance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    .line 199
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->instance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 200
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private notifyApkIconResult(Ljava/lang/String;I)V
    .locals 5

    .line 888
    const/4 v2, 0x0

    .line 889
    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshApkIconLock:Ljava/lang/Object;

    monitor-enter v3

    .line 891
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshApkIconCallbacks:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 893
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshApkIconCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

    .line 894
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshApkIconCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 896
    :cond_0
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 897
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 899
    invoke-interface {v2, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;->refreshPicResult(I)V

    .line 901
    :cond_1
    return-void
.end method

.method private notifyRFConfFileResult(Ljava/lang/String;I)V
    .locals 7

    .line 906
    const/4 v4, 0x0

    .line 907
    iget-object v5, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshRFConfLock:Ljava/lang/Object;

    monitor-enter v5

    .line 909
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshRFConfCallbacks:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 911
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshRFConfCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

    .line 912
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshRFConfCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 914
    :cond_0
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 916
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 918
    instance-of v0, v4, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalRFConfCallback;

    if-eqz v0, :cond_1

    .line 920
    const-string v0, "CardPicRescManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifyRFConfFileResult instanceof refreshPicResult  resultCode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 922
    move-object v0, v4

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalRFConfCallback;

    invoke-interface {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalRFConfCallback;->refreshPicResult(Ljava/lang/String;I)V

    goto :goto_1

    .line 926
    :cond_1
    const-string v0, "CardPicRescManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifyRFConfFileResult refreshPicResult  resultCode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 927
    invoke-interface {v4, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;->refreshPicResult(I)V

    .line 930
    :cond_2
    :goto_1
    return-void
.end method

.method private refreshLocalCardApkIcon(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V
    .locals 7

    .line 535
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 537
    :cond_0
    const-string v0, "refreshLocalCardApkIcon, params illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 538
    return-void

    .line 548
    :cond_1
    const/4 v2, 0x0

    .line 549
    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshApkIconLock:Ljava/lang/Object;

    monitor-enter v3

    .line 551
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshApkIconCallbacks:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 553
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshApkIconCallbacks:Ljava/util/Map;

    .line 556
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshApkIconCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 558
    const/4 v2, 0x1

    goto :goto_0

    .line 562
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshApkIconCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 564
    :goto_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 565
    :goto_1
    if-eqz v2, :cond_4

    .line 567
    const-string v0, "refreshLocalCardLogo, but refresh task already existed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 568
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;->refreshPicResult(I)V

    .line 569
    return-void

    .line 572
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/wallet/storage/path/NfcStorageUtil;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 573
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 574
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_5

    .line 576
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startApkIconDownloadTask, appId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 577
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->startApkIconDownloadTask(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 581
    :cond_5
    iget-object v5, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshApkIconLock:Ljava/lang/Object;

    monitor-enter v5

    .line 583
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshApkIconCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 584
    monitor-exit v5

    goto :goto_2

    :catchall_1
    move-exception v6

    monitor-exit v5

    throw v6

    .line 585
    :goto_2
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;->refreshPicResult(I)V

    .line 588
    :goto_3
    return-void
.end method

.method private startApkIconDownloadTask(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 729
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardApkIconDownTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0, p1, p2, p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardApkIconDownTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;)V

    .line 730
    sget-object v3, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->poolLock:Ljava/lang/Object;

    monitor-enter v3

    .line 732
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->pool:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 734
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->pool:Ljava/util/concurrent/ExecutorService;

    .line 737
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->pool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 738
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 739
    :goto_0
    return-void
.end method

.method private startIconDownloadTask(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 771
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0, p1, p2, p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;)V

    .line 773
    sget-object v3, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->poolLock:Ljava/lang/Object;

    monitor-enter v3

    .line 775
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->pool:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 777
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->pool:Ljava/util/concurrent/ExecutorService;

    .line 780
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->pool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 781
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 782
    :goto_0
    return-void
.end method

.method private startLogoDownloadTask(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 709
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardLogoDownloadTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0, p1, p2, p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardLogoDownloadTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;)V

    .line 710
    sget-object v3, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->poolLock:Ljava/lang/Object;

    monitor-enter v3

    .line 712
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->pool:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 714
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->pool:Ljava/util/concurrent/ExecutorService;

    .line 717
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->pool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 718
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 719
    :goto_0
    return-void
.end method

.method private startRFConfDownloadTask(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 750
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardRFConfFileDownloadTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0, p1, p2, p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardRFConfFileDownloadTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;)V

    .line 751
    sget-object v3, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->poolLock:Ljava/lang/Object;

    monitor-enter v3

    .line 753
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->pool:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 755
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->pool:Ljava/util/concurrent/ExecutorService;

    .line 758
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->pool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 759
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 760
    :goto_0
    return-void
.end method


# virtual methods
.method public downloadIconResult(ILjava/lang/String;I)V
    .locals 6

    .line 836
    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 838
    const-string v0, "downloadIconResult, aid is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 839
    return-void

    .line 841
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "downloadIconResult async task, aid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",resultCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 842
    const/4 v2, 0x0

    .line 843
    if-nez p1, :cond_2

    .line 845
    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshIconAidsLock:Ljava/lang/Object;

    monitor-enter v3

    .line 847
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshIconCallbacks:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 849
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshIconCallbacks:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

    .line 850
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshIconCallbacks:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 852
    :cond_1
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 853
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 855
    invoke-interface {v2, p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;->refreshPicResult(I)V

    .line 859
    :cond_2
    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    .line 862
    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLogoLock:Ljava/lang/Object;

    monitor-enter v3

    .line 864
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLogoCallbacks:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 866
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLogoCallbacks:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

    .line 867
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLogoCallbacks:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 869
    :cond_3
    monitor-exit v3

    goto :goto_1

    :catchall_1
    move-exception v5

    monitor-exit v3

    throw v5

    .line 870
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 872
    invoke-interface {v2, p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;->refreshPicResult(I)V

    .line 875
    :cond_4
    const/4 v0, 0x2

    if-ne p1, v0, :cond_5

    .line 877
    invoke-direct {p0, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->notifyApkIconResult(Ljava/lang/String;I)V

    .line 880
    :cond_5
    const/4 v0, 0x3

    if-ne p1, v0, :cond_6

    .line 882
    invoke-direct {p0, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->notifyRFConfFileResult(Ljava/lang/String;I)V

    .line 884
    :cond_6
    return-void
.end method

.method public getCardApkIcons(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/model/AppInfo;>;)V"
        }
    .end annotation

    .line 355
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 357
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    .line 359
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->getIssuerAppMarketId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getCardApkIcon(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->setApkIcon(Landroid/graphics/Bitmap;)V

    .line 360
    goto :goto_0

    .line 362
    :cond_0
    return-void
.end method

.method public getCardIcon(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    .locals 3

    .line 235
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getCardIconBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 236
    const/4 v0, 0x0

    if-ne v0, v1, :cond_4

    .line 238
    const-string v0, "getCardIcon , get default card icon."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 239
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mDefaultIcon:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mDefaultIcon:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    .line 241
    :cond_0
    const/4 v2, 0x0

    .line 242
    const/4 v0, 0x1

    if-ne v0, p2, :cond_1

    .line 245
    sget v0, Lcom/huawei/wallet/R$drawable;->card_default:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getBitmapFromApk(I)Landroid/graphics/Bitmap;

    move-result-object v2

    goto :goto_0

    .line 247
    :cond_1
    const/4 v0, 0x2

    if-ne v0, p2, :cond_2

    .line 250
    sget v0, Lcom/huawei/wallet/R$drawable;->nfc_card_icon_default:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getBitmapFromApk(I)Landroid/graphics/Bitmap;

    move-result-object v2

    goto :goto_0

    .line 254
    :cond_2
    sget v0, Lcom/huawei/wallet/R$drawable;->nfc_card_icon_default:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getBitmapFromApk(I)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 255
    const-string v0, "cardtype illeage........"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 258
    :goto_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mDefaultIcon:Ljava/lang/ref/WeakReference;

    .line 260
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mDefaultIcon:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/graphics/Bitmap;

    .line 262
    :cond_4
    return-object v1
.end method

.method public getCardIconDirPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1003
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/wallet/storage/path/NfcStorageUtil;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCardLogo(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 5

    .line 319
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 321
    const-string v0, "getCardLogo, issuerId is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 322
    const/4 v0, 0x0

    return-object v0

    .line 325
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mLogoCache:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/graphics/Bitmap;

    .line 327
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 329
    return-object v2

    .line 331
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicPathConfig;->getCardLogoPath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 332
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getCardLogo cardLogoPath : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 333
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getBitmapFromStorage(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 334
    const/4 v0, 0x0

    if-ne v0, v2, :cond_4

    .line 336
    const-string v0, "getCardLogo , get default card logo."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 337
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mDefaultLogo:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mDefaultLogo:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    .line 339
    :cond_2
    sget v0, Lcom/huawei/wallet/R$drawable;->nfc_card_logo_default:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getBitmapFromApk(I)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 340
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mDefaultLogo:Ljava/lang/ref/WeakReference;

    .line 342
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mDefaultLogo:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/graphics/Bitmap;

    goto :goto_0

    .line 346
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mLogoCache:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    :goto_0
    return-object v2
.end method

.method public getCardRFConfFilePath(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1015
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/wallet/storage/path/NfcStorageUtil;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRoundedCornerBitmap(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 12

    .line 943
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 945
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 948
    :cond_1
    move v4, p3

    .line 949
    move v5, p2

    .line 950
    const/4 v6, 0x1

    .line 951
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->iconHeight:I

    if-le v4, v0, :cond_2

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->iconWidth:I

    if-gt v5, v0, :cond_3

    .line 953
    :cond_2
    const/4 v6, 0x0

    .line 955
    :cond_3
    move-object v7, p1

    .line 956
    new-instance v8, Landroid/graphics/Canvas;

    invoke-direct {v8}, Landroid/graphics/Canvas;-><init>()V

    .line 958
    if-eqz v6, :cond_5

    .line 960
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->iconHeight:I

    int-to-float v0, v0

    int-to-float v1, v4

    div-float v9, v0, v1

    .line 961
    int-to-float v0, v5

    mul-float/2addr v0, v9

    float-to-int v10, v0

    .line 962
    int-to-float v0, v4

    mul-float/2addr v0, v9

    float-to-int v11, v0

    .line 963
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v10, v11, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 964
    const/4 v0, 0x0

    if-ne v0, v7, :cond_4

    .line 966
    return-object p1

    .line 968
    :cond_4
    invoke-virtual {v8, v7}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 969
    invoke-virtual {v8}, Landroid/graphics/Canvas;->save()I

    .line 970
    invoke-virtual {v8, v9, v9}, Landroid/graphics/Canvas;->scale(FF)V

    .line 971
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v8, p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 972
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 973
    invoke-virtual {v8}, Landroid/graphics/Canvas;->restore()V

    .line 976
    :cond_5
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 977
    new-instance v10, Landroid/graphics/RectF;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v10, v2, v3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 979
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 980
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v11

    .line 981
    const/4 v0, 0x0

    if-ne v0, v11, :cond_6

    .line 983
    return-object v7

    .line 985
    :cond_6
    invoke-virtual {v8, v11}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 986
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 987
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mPaint:Landroid/graphics/Paint;

    const/high16 v1, 0x41a00000    # 20.0f

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-virtual {v8, v10, v1, v2, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 988
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mPaint:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mXfermodeSRC_IN:Landroid/graphics/Xfermode;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 989
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v8, v7, v1, v2, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 990
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 991
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V

    .line 993
    return-object v11
.end method

.method public refreshCardSmlPics(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/logic/model/AppInfo;>;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V"
        }
    .end annotation

    .line 602
    invoke-virtual {p0, p1, p2, p4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLocalCardLogo(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V

    .line 604
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 606
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    .line 608
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->getIssuerAppMarketId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->getApkIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1, p4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLocalCardApkIcon(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V

    .line 609
    goto :goto_0

    .line 611
    :cond_0
    return-void
.end method

.method public refreshLocalCardIcon(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V
    .locals 7

    .line 400
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 402
    :cond_0
    const-string v0, "refreshLocalCardIcon, params illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 403
    return-void

    .line 415
    :cond_1
    const/4 v2, 0x0

    .line 416
    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshIconAidsLock:Ljava/lang/Object;

    monitor-enter v3

    .line 418
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshIconCallbacks:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 420
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshIconCallbacks:Ljava/util/Map;

    .line 423
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshIconCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 425
    const/4 v2, 0x1

    goto :goto_0

    .line 429
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshIconCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 431
    :goto_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 434
    :goto_1
    if-eqz v2, :cond_4

    .line 436
    const-string v0, "refreshLocalCardIcon, but refresh task already existed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 437
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;->refreshPicResult(I)V

    .line 438
    return-void

    .line 440
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "refreshLocalCardIcon, handle the product = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 442
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/wallet/storage/path/NfcStorageUtil;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 443
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "refreshLocalCardIcon, handle the iconFilePath = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 444
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 445
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_5

    .line 448
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file not exists, download product = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 449
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->startIconDownloadTask(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    return-void

    .line 453
    :cond_5
    iget-object v5, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshIconAidsLock:Ljava/lang/Object;

    monitor-enter v5

    .line 455
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshIconCallbacks:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 457
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshIconCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 459
    :cond_6
    monitor-exit v5

    goto :goto_2

    :catchall_1
    move-exception v6

    monitor-exit v5

    throw v6

    .line 460
    :goto_2
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;->refreshPicResult(I)V

    .line 462
    return-void
.end method

.method public refreshLocalCardLogo(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V
    .locals 7

    .line 472
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 474
    :cond_0
    const-string v0, "refreshLocalCardLogo, params illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 475
    return-void

    .line 485
    :cond_1
    const/4 v2, 0x0

    .line 486
    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLogoLock:Ljava/lang/Object;

    monitor-enter v3

    .line 488
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLogoCallbacks:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 490
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLogoCallbacks:Ljava/util/Map;

    .line 493
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLogoCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 495
    const/4 v2, 0x1

    goto :goto_0

    .line 499
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLogoCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 501
    :goto_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 502
    :goto_1
    if-eqz v2, :cond_4

    .line 504
    const-string v0, "refreshLocalCardLogo, but refresh task already existed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 505
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;->refreshPicResult(I)V

    .line 506
    return-void

    .line 509
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/wallet/storage/path/NfcStorageUtil;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 510
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 511
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_5

    .line 513
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startLogoDownloadTask, issuerId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 514
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->startLogoDownloadTask(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 518
    :cond_5
    iget-object v5, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLogoLock:Ljava/lang/Object;

    monitor-enter v5

    .line 520
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLogoCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 521
    monitor-exit v5

    goto :goto_2

    :catchall_1
    move-exception v6

    monitor-exit v5

    throw v6

    .line 522
    :goto_2
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;->refreshPicResult(I)V

    .line 525
    :goto_3
    return-void
.end method

.method public refreshLocalRFConfFiles(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V
    .locals 7

    .line 623
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 625
    :cond_0
    const-string v0, "refreshLocalRFConfFiles, params illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 626
    return-void

    .line 639
    :cond_1
    const/4 v2, 0x0

    .line 640
    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshRFConfLock:Ljava/lang/Object;

    monitor-enter v3

    .line 642
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshRFConfCallbacks:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 644
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshRFConfCallbacks:Ljava/util/Map;

    .line 647
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshRFConfCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 649
    const/4 v2, 0x1

    goto :goto_0

    .line 653
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshRFConfCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 655
    :goto_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 656
    :goto_1
    if-eqz v2, :cond_6

    .line 658
    const-string v0, "refreshLocalRFConfFiles, but refresh task already existed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 659
    if-eqz p3, :cond_5

    .line 661
    instance-of v0, p3, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalRFConfCallback;

    if-eqz v0, :cond_4

    .line 663
    move-object v0, p3

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalRFConfCallback;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalRFConfCallback;->refreshPicResult(Ljava/lang/String;I)V

    goto :goto_2

    .line 667
    :cond_4
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;->refreshPicResult(I)V

    .line 670
    :cond_5
    :goto_2
    return-void

    .line 673
    :cond_6
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/wallet/storage/path/NfcStorageUtil;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 674
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 675
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_7

    .line 677
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startLogoDownloadTask, issuerId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 678
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->startRFConfDownloadTask(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 682
    :cond_7
    iget-object v5, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshRFConfLock:Ljava/lang/Object;

    monitor-enter v5

    .line 684
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshRFConfCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 685
    monitor-exit v5

    goto :goto_3

    :catchall_1
    move-exception v6

    monitor-exit v5

    throw v6

    .line 686
    :goto_3
    if-eqz p3, :cond_9

    .line 688
    instance-of v0, p3, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalRFConfCallback;

    if-eqz v0, :cond_8

    .line 690
    move-object v0, p3

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalRFConfCallback;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalRFConfCallback;->refreshPicResult(Ljava/lang/String;I)V

    goto :goto_4

    .line 694
    :cond_8
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;->refreshPicResult(I)V

    .line 699
    :cond_9
    :goto_4
    return-void
.end method

.method public removeCardIcon(Ljava/lang/String;)V
    .locals 4

    .line 273
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 275
    const-string v0, "removeCardIcon, productId is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 276
    return-void

    .line 279
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/wallet/storage/path/NfcStorageUtil;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 280
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 281
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 283
    invoke-static {}, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->a()Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->b(Ljava/lang/String;)V

    .line 284
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "removeCardIcon finished.productId : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 286
    :cond_1
    return-void
.end method

.method public removeLogo(Ljava/lang/String;)V
    .locals 4

    .line 296
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 298
    const-string v0, "removeLogo, productId is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 299
    return-void

    .line 302
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicPathConfig;->getCardLogoPath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 303
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 304
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 306
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->mLogoCache:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "removeLogo finished.issuerId : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 309
    :cond_1
    return-void
.end method

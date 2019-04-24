.class Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTask;
.super Ljava/lang/Object;
.source "ReceiptScanActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/activities/ReceiptScanActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ReceiptUploadTask"
.end annotation


# instance fields
.field private final callback:Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;

.field private weakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/activities/ReceiptScanActivity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;Lcom/shopkick/app/activities/ReceiptScanActivity;)V
    .locals 0

    .line 276
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 277
    iput-object p1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTask;->callback:Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;

    .line 278
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTask;->weakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private getBase64FromFile(Ljava/io/File;)Ljava/lang/String;
    .locals 9

    .line 340
    iget-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTask;->weakReference:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 341
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/ReceiptScanActivity;

    if-eqz v0, :cond_1

    .line 344
    invoke-static {v0}, Lcom/shopkick/app/activities/ReceiptScanActivity;->access$400(Lcom/shopkick/app/activities/ReceiptScanActivity;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 346
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v2

    long-to-int v2, v2

    .line 347
    new-array v3, v2, [B

    const-string v4, "ReceiptScanActivity"

    .line 348
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "Reading %d byte file."

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v8, 0x0

    aput-object v2, v7, v8

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 352
    :try_start_1
    new-instance v2, Ljava/io/BufferedInputStream;

    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 353
    :try_start_2
    array-length p1, v3

    invoke-virtual {v2, v3, v8, p1}, Ljava/io/BufferedInputStream;->read([BII)I

    .line 355
    new-instance p1, Ljava/lang/String;

    invoke-static {v3}, Lorg/bouncycastle/util/encoders/Base64;->encode([B)[B

    move-result-object v1

    const-string v3, "ASCII"

    invoke-direct {p1, v1, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 363
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 365
    :catch_0
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    return-object p1

    :catchall_0
    move-exception p1

    move-object v1, v2

    goto :goto_1

    :catch_1
    move-exception p1

    move-object v1, v2

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    .line 358
    :goto_0
    :try_start_5
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_1
    if-eqz v1, :cond_0

    .line 363
    :try_start_6
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 365
    :catch_3
    :cond_0
    :try_start_7
    throw p1

    :catchall_2
    move-exception p1

    .line 368
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw p1

    :cond_1
    return-object v1
.end method


# virtual methods
.method public run()V
    .locals 17

    move-object/from16 v0, p0

    .line 283
    iget-object v1, v0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTask;->weakReference:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_4

    .line 284
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/activities/ReceiptScanActivity;

    if-eqz v1, :cond_4

    .line 286
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v2

    invoke-virtual {v1}, Lcom/shopkick/app/activities/ReceiptScanActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getImages(Landroid/content/Context;)Ljava/util/List;

    move-result-object v2

    .line 287
    invoke-static {v1}, Lcom/shopkick/app/activities/ReceiptScanActivity;->access$100(Lcom/shopkick/app/activities/ReceiptScanActivity;)Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 288
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 289
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 290
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 292
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 293
    invoke-static {v1}, Lcom/shopkick/app/activities/ReceiptScanActivity;->access$200(Lcom/shopkick/app/activities/ReceiptScanActivity;)Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    .line 294
    invoke-static {v1}, Lcom/shopkick/app/activities/ReceiptScanActivity;->access$200(Lcom/shopkick/app/activities/ReceiptScanActivity;)Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 295
    invoke-static {v6}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 300
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 301
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/io/File;

    .line 302
    invoke-direct {v0, v6}, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTask;->getBase64FromFile(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v6

    const-string v7, "ReceiptScanActivity"

    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, "Read to a %d char string."

    const/4 v10, 0x1

    new-array v11, v10, [Ljava/lang/Object;

    const/4 v12, 0x0

    .line 310
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v13

    sub-int/2addr v13, v10

    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v11, v12

    .line 309
    invoke-static {v8, v9, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 315
    :cond_2
    new-instance v11, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanRequest;

    invoke-direct {v11}, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanRequest;-><init>()V

    .line 316
    invoke-static {v1}, Lcom/shopkick/app/activities/ReceiptScanActivity;->access$300(Lcom/shopkick/app/activities/ReceiptScanActivity;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v11, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanRequest;->chainId:Ljava/lang/String;

    .line 317
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getLastWidth()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v11, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanRequest;->imageWidth:Ljava/lang/Integer;

    .line 318
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getLastHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v11, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanRequest;->imageHeight:Ljava/lang/Integer;

    .line 319
    iput-object v5, v11, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanRequest;->imageDataList:Ljava/util/List;

    .line 320
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v11, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanRequest;->numberOfReceiptImages:Ljava/lang/Integer;

    .line 321
    iput-object v4, v11, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanRequest;->selectedProductFamilyIds:Ljava/util/List;

    .line 322
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v3, 0x0

    :cond_3
    iput-object v3, v11, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanRequest;->selectedOfferBundleIds:Ljava/util/List;

    .line 324
    iget-object v1, v1, Lcom/shopkick/app/activities/ReceiptScanActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v9, v1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v10, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v12, v0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTask;->callback:Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;

    const/4 v13, 0x1

    sget-object v14, Lnet/toddm/comm/Priority$StartingPriority;->LOW:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v15, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    sget-object v16, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual/range {v9 .. v16}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_4
    return-void
.end method

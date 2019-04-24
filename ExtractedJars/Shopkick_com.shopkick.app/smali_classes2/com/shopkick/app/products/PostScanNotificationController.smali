.class public Lcom/shopkick/app/products/PostScanNotificationController;
.super Ljava/lang/Object;
.source "PostScanNotificationController.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;
    }
.end annotation


# static fields
.field public static final EVENT_POST_SCAN_NOTIFICATION_QUEUE_UPDATED:Ljava/lang/String; = "eventPostScanNotificationUpdated"

.field private static final NOTIFICATION_ID_PREFIX:Ljava/lang/String; = "post_scan_reminder_"

.field private static final QUEUE_FILENAME:Ljava/lang/String; = "PostScanReminderQueue.dat"


# instance fields
.field private alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

.field private context:Landroid/content/Context;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private notificationMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;",
            ">;"
        }
    .end annotation
.end field

.field private queue:Lcom/shopkick/app/queue/SKPersistentQueue;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/util/AlarmScheduler;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 1

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    .line 95
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->context:Landroid/content/Context;

    .line 96
    iput-object p2, p0, Lcom/shopkick/app/products/PostScanNotificationController;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    .line 97
    iput-object p3, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 100
    new-instance p2, Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p3, "PostScanReminderQueue.dat"

    sget-object v0, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    invoke-direct {p2, p1, p3, v0}, Lcom/shopkick/app/queue/SKPersistentQueue;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;)V

    iput-object p2, p0, Lcom/shopkick/app/products/PostScanNotificationController;->queue:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 104
    iget-object p1, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventReceiptScanUploaded"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 105
    iget-object p1, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 107
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController;->readMap()V

    return-void
.end method

.method private readMap()V
    .locals 4

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->queue:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->getObjects()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 113
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 119
    :cond_0
    :try_start_0
    new-instance v1, Ljava/io/ObjectInputStream;

    new-instance v2, Ljava/io/ByteArrayInputStream;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lorg/bouncycastle/util/encoders/Base64;->decode(Ljava/lang/String;)[B

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v1, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 120
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    iput-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 124
    :catch_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    :goto_0
    return-void

    .line 114
    :cond_1
    :goto_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    return-void
.end method

.method private refresh()V
    .locals 7

    .line 337
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 338
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 339
    iget-object v3, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 340
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;

    invoke-static {v5}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$100(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)J

    move-result-wide v5

    cmp-long v5, v5, v1

    if-gtz v5, :cond_0

    .line 341
    :cond_1
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 345
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 346
    iget-object v2, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-void
.end method

.method private removeNotificationByChainId(Ljava/lang/String;)V
    .locals 4

    .line 243
    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 245
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 246
    iget-object v1, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 247
    iget-object v3, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;

    .line 248
    invoke-static {v3}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$200(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 249
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 253
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    .line 254
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 255
    iget-object v1, p0, Lcom/shopkick/app/products/PostScanNotificationController;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "post_scan_reminder_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    .line 256
    iget-object v1, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 260
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController;->writeMap()V

    :cond_4
    return-void
.end method

.method private setNotification(Ljava/lang/String;Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)V
    .locals 12

    if-eqz p2, :cond_2

    .line 265
    invoke-static {p2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$800(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 268
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->context:Landroid/content/Context;

    const v1, 0x7f110036

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 271
    invoke-static {p2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$500(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 272
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f0f002c

    .line 274
    invoke-static {p2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$900(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)I

    move-result v4

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    .line 275
    invoke-static {p2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$500(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v1

    .line 276
    invoke-static {p2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$900(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v2

    .line 273
    invoke-virtual {v0, v3, v4, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    goto :goto_0

    .line 278
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f0f002d

    .line 280
    invoke-static {p2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$900(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)I

    move-result v4

    new-array v2, v2, [Ljava/lang/Object;

    .line 281
    invoke-static {p2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$900(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v1

    .line 279
    invoke-virtual {v0, v3, v4, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    :goto_0
    const/4 v0, 0x5

    .line 287
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "chain_id"

    .line 289
    invoke-static {p2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$200(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Ljava/lang/String;

    move-result-object v3

    .line 288
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "location_id"

    .line 290
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "preselected_product_family_ids"

    .line 292
    invoke-static {p2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$1000(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Ljava/lang/String;

    move-result-object v3

    .line 291
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "notification_type"

    .line 294
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 293
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/ReceiptScanActivity;

    const-class v3, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-direct {v0, v2, v3, v1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 300
    iget-object v2, p0, Lcom/shopkick/app/products/PostScanNotificationController;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "post_scan_reminder_"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 301
    invoke-static {p2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$100(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)J

    move-result-wide v4

    .line 305
    invoke-virtual {v0}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x5

    move-object v7, v10

    move-object v8, v10

    .line 300
    invoke-virtual/range {v2 .. v11}, Lcom/shopkick/app/util/AlarmScheduler;->scheduleAtTimestampMs(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z

    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method private writeMap()V
    .locals 3

    .line 351
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController;->refresh()V

    .line 354
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 355
    new-instance v1, Ljava/io/ObjectOutputStream;

    invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 356
    iget-object v2, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 357
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->flush()V

    .line 358
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V

    .line 359
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/util/encoders/Base64;->encode([B)[B

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    .line 361
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->queue:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->clear()V

    .line 362
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->queue:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/queue/SKPersistentQueue;->addToQueue(Ljava/lang/Object;)V

    .line 364
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventPostScanNotificationUpdated"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 368
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->queue:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->destroy()V

    return-void
.end method

.method public getScheduledProductFamilyIdsByChainId(Ljava/lang/String;)Ljava/util/HashSet;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 153
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 154
    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 156
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController;->refresh()V

    .line 157
    iget-object v1, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;

    .line 158
    invoke-static {v2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$200(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 159
    invoke-static {v2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$300(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public getScheduledTimestamp(Ljava/lang/String;)J
    .locals 2

    .line 328
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;

    if-eqz p1, :cond_0

    .line 329
    invoke-static {p1}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$100(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0
.end method

.method public isNotificationSet(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 139
    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;

    if-eqz p1, :cond_1

    .line 143
    invoke-static {p1, p2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$000(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 144
    invoke-static {p1}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$100(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)J

    move-result-wide p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long p1, p1, v2

    if-lez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :cond_2
    :goto_0
    return v1
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 374
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x57c9a285

    if-eq v0, v1, :cond_1

    const v1, 0x44e6563

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "UserAccountIdChangedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const-string v0, "EventReceiptScanUploaded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 386
    :pswitch_0
    invoke-virtual {p0}, Lcom/shopkick/app/products/PostScanNotificationController;->removeAllNotifications()V

    goto :goto_2

    :pswitch_1
    if-nez p2, :cond_3

    return-void

    :cond_3
    const-string p1, "paramChainId"

    .line 378
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 379
    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    return-void

    .line 381
    :cond_4
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/PostScanNotificationController;->removeNotificationByChainId(Ljava/lang/String;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public removeAllNotifications()V
    .locals 2

    .line 315
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string v1, "post_scan_reminder_"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/AlarmScheduler;->cancelByPrefix(Ljava/lang/String;)V

    .line 318
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 319
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 320
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController;->writeMap()V

    :cond_0
    return-void
.end method

.method public removeNotification(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "post_scan_reminder_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    .line 223
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController;->refresh()V

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;

    if-eqz v0, :cond_1

    .line 227
    invoke-static {v0, p2}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$700(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;Ljava/lang/String;)V

    .line 228
    invoke-static {v0}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$800(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 230
    iget-object p2, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 234
    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/products/PostScanNotificationController;->setNotification(Ljava/lang/String;Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)V

    .line 239
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController;->writeMap()V

    return-void
.end method

.method public setNotification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 3

    .line 181
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "post_scan_reminder_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    .line 184
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController;->refresh()V

    .line 187
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;

    if-nez v0, :cond_0

    .line 189
    new-instance v0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;-><init>(Lcom/shopkick/app/products/PostScanNotificationController$1;)V

    .line 190
    invoke-static {v0, p1}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$202(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    invoke-static {v0, p4}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$502(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    iget-object v1, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {v1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    :cond_0
    invoke-static {v0}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$200(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 197
    invoke-static {v0, p1}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$202(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    :cond_1
    invoke-static {v0}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$500(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p4}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 200
    invoke-static {v0, p4}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$502(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 204
    :cond_2
    invoke-static {v0, p3}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$600(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;Ljava/lang/String;)V

    .line 205
    invoke-static {v0, p5, p6}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->access$102(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;J)J

    .line 206
    iget-object p1, p0, Lcom/shopkick/app/products/PostScanNotificationController;->notificationMap:Ljava/util/HashMap;

    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController;->writeMap()V

    .line 209
    invoke-direct {p0, p2, v0}, Lcom/shopkick/app/products/PostScanNotificationController;->setNotification(Ljava/lang/String;Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)V

    return-void
.end method

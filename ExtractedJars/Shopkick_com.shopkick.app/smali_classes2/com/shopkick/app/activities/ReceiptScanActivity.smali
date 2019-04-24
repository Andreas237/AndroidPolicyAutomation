.class public Lcom/shopkick/app/activities/ReceiptScanActivity;
.super Lcom/shopkick/app/activities/MultiScreenActivity;
.source "ReceiptScanActivity.java"

# interfaces
.implements Lcom/shopkick/app/receipts/IReceiptUploadController;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTask;,
        Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;
    }
.end annotation


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "ReceiptScanActivity"

.field private static final executor:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private final base64EncodeLock:Ljava/lang/Object;

.field private bundleIds:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private chainId:Ljava/lang/String;

.field private locationId:Ljava/lang/String;

.field private productsListed:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private volatile receiptUploadDialog:Landroid/app/ProgressDialog;

.field private final uploadLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 59
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/activities/ReceiptScanActivity;->executor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;-><init>()V

    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->receiptUploadDialog:Landroid/app/ProgressDialog;

    .line 63
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->base64EncodeLock:Ljava/lang/Object;

    .line 64
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->uploadLock:Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/activities/ReceiptScanActivity;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/activities/ReceiptScanActivity;->uploadFinished(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/activities/ReceiptScanActivity;)Ljava/util/Collection;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->productsListed:Ljava/util/Collection;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/activities/ReceiptScanActivity;)Ljava/util/Collection;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->bundleIds:Ljava/util/Collection;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/activities/ReceiptScanActivity;)Ljava/lang/String;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->chainId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/activities/ReceiptScanActivity;)Ljava/lang/Object;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->base64EncodeLock:Ljava/lang/Object;

    return-object p0
.end method

.method private cleanUpForExit()V
    .locals 1

    .line 81
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->clearCache(Landroid/content/Context;)V

    return-void
.end method

.method private dismissDialog()V
    .locals 1

    .line 87
    invoke-virtual {p0}, Lcom/shopkick/app/activities/ReceiptScanActivity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->receiptUploadDialog:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->receiptUploadDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    const/4 v0, 0x0

    .line 89
    iput-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->receiptUploadDialog:Landroid/app/ProgressDialog;

    :cond_0
    return-void
.end method

.method private uploadFinished(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 10

    .line 126
    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanResponse;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 127
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 149
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 150
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanRequest;->selectedProductFamilyIds:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    .line 151
    invoke-virtual {v3}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 153
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->fetchScanInfos(Ljava/util/List;)V

    .line 156
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "paramChainId"

    .line 157
    iget-object v3, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->chainId:Ljava/lang/String;

    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    iget-object v2, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v3, "EventReceiptScanUploaded"

    invoke-virtual {v2, v3, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 162
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    const-string p1, "Chain ID"

    .line 163
    iget-object v2, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->chainId:Ljava/lang/String;

    invoke-interface {v9, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v4

    sget-object p1, Lcom/shopkick/logging/Area;->SCAN:Lcom/shopkick/logging/Area;

    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    const/4 v7, 0x0

    const p1, 0x927c7

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual/range {v4 .. v9}, Lcom/shopkick/logging/EventLogger;->log(JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V

    .line 169
    iget-object p1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string v2, "receipt_scan_reminder"

    invoke-virtual {p1, v2}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    .line 170
    invoke-virtual {p0}, Lcom/shopkick/app/activities/ReceiptScanActivity;->finish()V

    goto :goto_3

    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    .line 130
    iget-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanResponse;->errorMessage:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanResponse;->errorMessage:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_2

    .line 133
    :cond_3
    invoke-static {p0}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 134
    iget-object p1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v3, 0x0

    const p1, 0x7f110155

    .line 135
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/ReceiptScanActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const p1, 0x7f110142

    .line 136
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/ReceiptScanActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x7f11014f

    .line 137
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/ReceiptScanActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/shopkick/app/activities/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/activities/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v8, 0x0

    .line 134
    invoke-virtual/range {v2 .. v8}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_4
    :goto_2
    if-eqz v0, :cond_5

    .line 145
    iget-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v1, :cond_5

    .line 146
    iget-object p1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string v2, "receipt_scan_reminder"

    invoke-virtual {p1, v2}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    .line 173
    :cond_5
    :goto_3
    invoke-direct {p0}, Lcom/shopkick/app/activities/ReceiptScanActivity;->dismissDialog()V

    .line 176
    invoke-virtual {p0}, Lcom/shopkick/app/activities/ReceiptScanActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    instance-of p1, p1, Lcom/shopkick/app/receipts/IReceiptUploadNotificationCallback;

    if-eqz p1, :cond_7

    .line 178
    invoke-virtual {p0}, Lcom/shopkick/app/activities/ReceiptScanActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/receipts/IReceiptUploadNotificationCallback;

    iget-boolean p2, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p2, :cond_6

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/SubmitReceiptScanResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_6

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    invoke-interface {p1, v1}, Lcom/shopkick/app/receipts/IReceiptUploadNotificationCallback;->uploadFinished(Z)V

    :cond_7
    return-void
.end method


# virtual methods
.method public finish()V
    .locals 0

    .line 378
    invoke-direct {p0}, Lcom/shopkick/app/activities/ReceiptScanActivity;->cleanUpForExit()V

    .line 379
    invoke-super {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->finish()V

    return-void
.end method

.method protected handleOnCreate()V
    .locals 2

    .line 68
    invoke-super {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->handleOnCreate()V

    .line 71
    invoke-virtual {p0}, Lcom/shopkick/app/activities/ReceiptScanActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x100

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 72
    invoke-virtual {p0}, Lcom/shopkick/app/activities/ReceiptScanActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x7f060021

    invoke-virtual {p0, v1}, Lcom/shopkick/app/activities/ReceiptScanActivity;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    return-void
.end method

.method public setBundleIds(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 121
    iput-object p1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->bundleIds:Ljava/util/Collection;

    :cond_0
    return-void
.end method

.method public setCallback(Lcom/shopkick/app/receipts/IReceiptUploadNotificationCallback;)V
    .locals 1

    .line 229
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ReceiptScreenActivity does not store a callback. Handle this exception if you understand that your callback will not be set and are okay with that situation. Otherwise, you might be calling the wrong thing."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setChainId(Ljava/lang/String;)V
    .locals 1

    .line 95
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 98
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->chainId:Ljava/lang/String;

    return-void
.end method

.method public setLocationId(Ljava/lang/String;)V
    .locals 1

    .line 103
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 106
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->locationId:Ljava/lang/String;

    return-void
.end method

.method public setProductFamilies(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 113
    iput-object p1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->productsListed:Ljava/util/Collection;

    :cond_0
    return-void
.end method

.method public supportsToolbar()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public upload()Z
    .locals 4

    .line 186
    invoke-virtual {p0}, Lcom/shopkick/app/activities/ReceiptScanActivity;->uploadInProgress()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->chainId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->productsListed:Ljava/util/Collection;

    if-nez v0, :cond_0

    goto :goto_0

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->uploadLock:Ljava/lang/Object;

    monitor-enter v0

    .line 191
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/app/activities/ReceiptScanActivity;->uploadInProgress()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 193
    monitor-exit v0

    return v1

    .line 196
    :cond_1
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getImages(Landroid/content/Context;)Ljava/util/List;

    move-result-object v2

    .line 197
    new-instance v3, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;

    invoke-direct {v3, p0}, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;-><init>(Lcom/shopkick/app/activities/ReceiptScanActivity;)V

    .line 198
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-gtz v2, :cond_2

    .line 201
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v1

    :cond_2
    :try_start_1
    const-string v1, ""

    const v2, 0x7f11054f

    .line 204
    invoke-virtual {p0, v2}, Lcom/shopkick/app/activities/ReceiptScanActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v1, v2}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/ProgressDialog;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->receiptUploadDialog:Landroid/app/ProgressDialog;

    .line 205
    iget-object v1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->receiptUploadDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 212
    :try_start_2
    invoke-virtual {p0}, Lcom/shopkick/app/activities/ReceiptScanActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v1

    instance-of v1, v1, Lcom/shopkick/app/receipts/IReceiptUploadNotificationCallback;

    if-eqz v1, :cond_3

    .line 213
    invoke-virtual {p0}, Lcom/shopkick/app/activities/ReceiptScanActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/receipts/IReceiptUploadNotificationCallback;

    invoke-interface {v1}, Lcom/shopkick/app/receipts/IReceiptUploadNotificationCallback;->uploadStarted()V

    .line 217
    :cond_3
    sget-object v1, Lcom/shopkick/app/activities/ReceiptScanActivity;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTask;

    invoke-direct {v2, v3, p0}, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTask;-><init>(Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;Lcom/shopkick/app/activities/ReceiptScanActivity;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    const/4 v1, 0x1

    .line 218
    monitor-exit v0

    return v1

    :catch_0
    move-exception v1

    .line 209
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :catchall_0
    move-exception v1

    .line 219
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :cond_4
    :goto_0
    return v1
.end method

.method public uploadInProgress()Z
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity;->receiptUploadDialog:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

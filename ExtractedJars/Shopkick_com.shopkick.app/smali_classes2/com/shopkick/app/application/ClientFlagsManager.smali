.class public Lcom/shopkick/app/application/ClientFlagsManager;
.super Ljava/lang/Object;
.source "ClientFlagsManager.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/application/ClientFlagsManager$SaveClientFlagsTask;,
        Lcom/shopkick/app/application/ClientFlagsManager$PostLoadRunnable;,
        Lcom/shopkick/app/application/ClientFlagsManager$LoadClientFlagsTask;
    }
.end annotation


# static fields
.field public static final CLIENT_APP_UI_FLAGS_UPDATED:Ljava/lang/String; = "ClientAppUIFlagsUpdated"

.field public static final CLIENT_FLAGS_LOADED:Ljava/lang/String; = "ClientFlagsLoaded"

.field public static final CLIENT_FLAGS_UPDATED:Ljava/lang/String; = "ClientFlagsUpdated"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private clientAppUIFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

.field public clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

.field private clientFlagsVersion:Ljava/lang/String;

.field private handler:Landroid/os/Handler;

.field private loadClientFlagsExecutor:Ljava/util/concurrent/ExecutorService;

.field private loadClientFlagsFuture:Ljava/util/concurrent/Future;

.field private notifCenter:Lcom/shopkick/app/util/NotificationCenter;

.field protected request:Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListRequest;

.field private skDiskLogger:Lcom/shopkick/app/application/SKDiskLogger;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/SKDiskLogger;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 57
    iput-object p2, p0, Lcom/shopkick/app/application/ClientFlagsManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 58
    iput-object p3, p0, Lcom/shopkick/app/application/ClientFlagsManager;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 59
    iput-object p4, p0, Lcom/shopkick/app/application/ClientFlagsManager;->skDiskLogger:Lcom/shopkick/app/application/SKDiskLogger;

    .line 61
    invoke-direct {p0}, Lcom/shopkick/app/application/ClientFlagsManager;->getNewClientFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    const-string p1, "UserAccountIdChangedEvent"

    .line 63
    invoke-virtual {p3, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/application/ClientFlagsManager;)Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/shopkick/app/application/ClientFlagsManager;->getNewClientFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    move-result-object p0

    return-object p0
.end method

.method private getNewClientFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;
    .locals 3

    .line 137
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;-><init>()V

    .line 138
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postProcess()V

    .line 139
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;-><init>()V

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    .line 140
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->postProcess()V

    const-wide/high16 v1, 0x4010000000000000L    # 4.0

    .line 144
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingBitDetectThreshold:Ljava/lang/Double;

    const/4 v1, 0x0

    .line 145
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdDeptCodesEnabled:Ljava/lang/Boolean;

    const/4 v1, 0x1

    .line 146
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocShouldTryErrorCorrection:Ljava/lang/Boolean;

    return-object v0
.end method

.method private saveFlags(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 152
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    if-eqz v0, :cond_0

    .line 153
    new-instance v1, Lcom/shopkick/app/application/ClientFlagsManager$SaveClientFlagsTask;

    invoke-direct {v1, v0, p1}, Lcom/shopkick/app/application/ClientFlagsManager$SaveClientFlagsTask;-><init>(Lcom/shopkick/app/application/AppPreferences;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 154
    new-array p1, p1, [Ljava/lang/Object;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/application/ClientFlagsManager$SaveClientFlagsTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 155
    iget-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlagsVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setClientFlagsVersion(Ljava/lang/String;)V

    .line 156
    iget-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->skDiskLogger:Lcom/shopkick/app/application/SKDiskLogger;

    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientLogBatchSize:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKDiskLogger;->setBatchSize(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->request:Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListRequest;

    if-ne p1, v0, :cond_4

    .line 172
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_4

    .line 173
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListResponse;

    .line 175
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListResponse;->version:Ljava/lang/String;

    if-eqz p2, :cond_4

    .line 177
    iget-object p2, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsFuture:Ljava/util/concurrent/Future;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const/4 v1, 0x1

    .line 178
    invoke-interface {p2, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 179
    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsFuture:Ljava/util/concurrent/Future;

    .line 180
    iget-object p2, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 181
    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsExecutor:Ljava/util/concurrent/ExecutorService;

    .line 184
    :cond_0
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListResponse;->flags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-nez p2, :cond_1

    return-void

    .line 189
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientAppUIFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    if-eqz p2, :cond_2

    .line 190
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->tabContextOrderOverride:Ljava/util/List;

    .line 193
    :cond_2
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListResponse;->flags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iput-object p2, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    .line 194
    iget-object p2, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->limitBbyScans:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 195
    iget-object p2, p0, Lcom/shopkick/app/application/ClientFlagsManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->bbyAvailableScansLeft:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/shopkick/app/application/AppPreferences;->setBestBuyScanLimit(I)V

    .line 197
    :cond_3
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListResponse;->version:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlagsVersion:Ljava/lang/String;

    .line 198
    iget-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientAppUIFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    .line 200
    iget-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/application/ClientFlagsManager;->saveFlags(Ljava/lang/String;)V

    .line 201
    iget-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ClientFlagsUpdated"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    if-eqz v0, :cond_4

    .line 204
    iget-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientAppUIFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    if-eqz p1, :cond_4

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->tabContextOrderOverride:Ljava/util/List;

    .line 205
    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 206
    iget-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ClientAppUIFlagsUpdated"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :cond_4
    return-void
.end method

.method public getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;
    .locals 2

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientAppUIFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsFuture:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_1

    .line 70
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz v0, :cond_0

    .line 72
    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    .line 73
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientAppUIFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 79
    iget-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    iput-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientAppUIFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    .line 80
    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 76
    iget-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    iput-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientAppUIFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    .line 77
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 82
    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsFuture:Ljava/util/concurrent/Future;

    .line 83
    iget-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 84
    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsExecutor:Ljava/util/concurrent/ExecutorService;

    .line 87
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientAppUIFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    return-object v0
.end method

.method public load()V
    .locals 3

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsFuture:Ljava/util/concurrent/Future;

    if-nez v0, :cond_0

    .line 93
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsExecutor:Ljava/util/concurrent/ExecutorService;

    .line 94
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->handler:Landroid/os/Handler;

    .line 95
    new-instance v0, Lcom/shopkick/app/application/ClientFlagsManager$LoadClientFlagsTask;

    iget-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v2, p0, Lcom/shopkick/app/application/ClientFlagsManager;->handler:Landroid/os/Handler;

    invoke-direct {v0, p0, v1, v2}, Lcom/shopkick/app/application/ClientFlagsManager$LoadClientFlagsTask;-><init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/AppPreferences;Landroid/os/Handler;)V

    .line 96
    iget-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsFuture:Ljava/util/concurrent/Future;

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getClientFlagsVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlagsVersion:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
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

    const-string p2, "UserAccountIdChangedEvent"

    if-ne p1, p2, :cond_0

    .line 231
    invoke-direct {p0}, Lcom/shopkick/app/application/ClientFlagsManager;->getNewClientFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    .line 232
    iget-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientAppUIFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    const/4 p1, 0x0

    .line 233
    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlagsVersion:Ljava/lang/String;

    .line 234
    iget-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/application/ClientFlagsManager;->saveFlags(Ljava/lang/String;)V

    .line 235
    invoke-virtual {p0}, Lcom/shopkick/app/application/ClientFlagsManager;->refresh()V

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public refresh()V
    .locals 10

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->request:Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListRequest;

    if-eqz v0, :cond_0

    .line 118
    iget-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 121
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->request:Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListRequest;

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->request:Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListRequest;

    iget-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlagsVersion:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListRequest;->version:Ljava/lang/String;

    .line 123
    iget-object v2, p0, Lcom/shopkick/app/application/ClientFlagsManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v3, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v4, p0, Lcom/shopkick/app/application/ClientFlagsManager;->request:Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListRequest;

    const/4 v6, 0x0

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v5, p0

    invoke-virtual/range {v2 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method public reset()V
    .locals 2

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->request:Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListRequest;

    if-eqz v0, :cond_0

    .line 129
    iget-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 131
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/application/ClientFlagsManager;->getNewClientFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientAppUIFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    const/4 v0, 0x0

    .line 133
    iput-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->request:Lcom/shopkick/app/fetchers/api/skapi/ClientFlagsListRequest;

    return-void
.end method

.method public setClientAppUIFlags(Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;)V
    .locals 1

    .line 161
    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientAppUIFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    .line 164
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/application/ClientFlagsManager;->saveFlags(Ljava/lang/String;)V

    .line 166
    iget-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "ClientAppUIFlagsUpdated"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method public setClientFlagsFromLoad(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 105
    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    .line 106
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientAppUIFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    :cond_0
    const/4 p1, 0x0

    .line 108
    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsFuture:Ljava/util/concurrent/Future;

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsExecutor:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 110
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 111
    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->loadClientFlagsExecutor:Ljava/util/concurrent/ExecutorService;

    .line 113
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "ClientFlagsLoaded"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

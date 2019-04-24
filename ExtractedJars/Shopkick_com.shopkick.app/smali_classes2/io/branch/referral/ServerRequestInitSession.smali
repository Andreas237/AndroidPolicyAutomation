.class abstract Lio/branch/referral/ServerRequestInitSession;
.super Lio/branch/referral/ServerRequest;
.source "ServerRequestInitSession.java"


# static fields
.field static final ACTION_INSTALL:Ljava/lang/String; = "install"

.field static final ACTION_OPEN:Ljava/lang/String; = "open"

.field private static final STATE_FRESH_INSTALL:I = 0x0

.field private static final STATE_NO_CHANGE:I = 0x1

.field private static final STATE_UPDATE:I = 0x2


# instance fields
.field private final contentDiscoveryManifest_:Lio/branch/indexing/ContentDiscoveryManifest;

.field private final context_:Landroid/content/Context;

.field final systemObserver_:Lio/branch/referral/SystemObserver;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lio/branch/referral/SystemObserver;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lio/branch/referral/ServerRequest;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 34
    iput-object p1, p0, Lio/branch/referral/ServerRequestInitSession;->context_:Landroid/content/Context;

    .line 35
    iput-object p3, p0, Lio/branch/referral/ServerRequestInitSession;->systemObserver_:Lio/branch/referral/SystemObserver;

    .line 36
    iget-object p1, p0, Lio/branch/referral/ServerRequestInitSession;->context_:Landroid/content/Context;

    invoke-static {p1}, Lio/branch/indexing/ContentDiscoveryManifest;->getInstance(Landroid/content/Context;)Lio/branch/indexing/ContentDiscoveryManifest;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/ServerRequestInitSession;->contentDiscoveryManifest_:Lio/branch/indexing/ContentDiscoveryManifest;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lio/branch/referral/ServerRequest;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    .line 41
    iput-object p3, p0, Lio/branch/referral/ServerRequestInitSession;->context_:Landroid/content/Context;

    .line 42
    new-instance p1, Lio/branch/referral/SystemObserver;

    invoke-direct {p1, p3}, Lio/branch/referral/SystemObserver;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lio/branch/referral/ServerRequestInitSession;->systemObserver_:Lio/branch/referral/SystemObserver;

    .line 43
    iget-object p1, p0, Lio/branch/referral/ServerRequestInitSession;->context_:Landroid/content/Context;

    invoke-static {p1}, Lio/branch/indexing/ContentDiscoveryManifest;->getInstance(Landroid/content/Context;)Lio/branch/indexing/ContentDiscoveryManifest;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/ServerRequestInitSession;->contentDiscoveryManifest_:Lio/branch/indexing/ContentDiscoveryManifest;

    return-void
.end method

.method static isInitSessionAction(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    const-string v1, "open"

    .line 82
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "install"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    move v0, p0

    :cond_1
    return v0
.end method

.method private updateInstallStateAndTimestamps(Lorg/json/JSONObject;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 253
    iget-object v0, p0, Lio/branch/referral/ServerRequestInitSession;->systemObserver_:Lio/branch/referral/SystemObserver;

    invoke-virtual {v0}, Lio/branch/referral/SystemObserver;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 257
    :try_start_0
    iget-object v2, p0, Lio/branch/referral/ServerRequestInitSession;->context_:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, p0, Lio/branch/referral/ServerRequestInitSession;->context_:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "bnc_no_value"

    .line 260
    iget-object v4, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v4}, Lio/branch/referral/PrefHelper;->getAppVersion()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_0

    if-eqz v2, :cond_2

    .line 264
    iget-wide v5, v2, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    iget-wide v7, v2, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    sub-long/2addr v5, v7

    const-wide/32 v7, 0x5265c00

    cmp-long v0, v5, v7

    if-ltz v0, :cond_2

    move v1, v4

    goto :goto_1

    .line 267
    :cond_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getAppVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move v1, v4

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    .line 272
    :cond_2
    :goto_1
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Update:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    if-eqz v2, :cond_5

    .line 274
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->FirstInstallTime:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-wide v3, v2, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    invoke-virtual {p1, v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 275
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->LastUpdateTime:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-wide v3, v2, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-virtual {p1, v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 276
    iget-object v0, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v1, "bnc_original_install_time"

    invoke-virtual {v0, v1}, Lio/branch/referral/PrefHelper;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v3, 0x0

    cmp-long v3, v0, v3

    if-nez v3, :cond_3

    .line 278
    iget-wide v0, v2, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 279
    iget-object v3, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v4, "bnc_original_install_time"

    iget-wide v5, v2, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    invoke-virtual {v3, v4, v5, v6}, Lio/branch/referral/PrefHelper;->setLong(Ljava/lang/String;J)V

    .line 281
    :cond_3
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->OriginalInstallTime:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 283
    iget-object v0, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v1, "bnc_last_known_update_time"

    invoke-virtual {v0, v1}, Lio/branch/referral/PrefHelper;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 284
    iget-wide v3, v2, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v3, v0, v3

    if-gez v3, :cond_4

    .line 285
    iget-object v3, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v4, "bnc_previous_update_time"

    invoke-virtual {v3, v4, v0, v1}, Lio/branch/referral/PrefHelper;->setLong(Ljava/lang/String;J)V

    .line 286
    iget-object v0, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v1, "bnc_last_known_update_time"

    iget-wide v2, v2, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-virtual {v0, v1, v2, v3}, Lio/branch/referral/PrefHelper;->setLong(Ljava/lang/String;J)V

    .line 288
    :cond_4
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->PreviousUpdateTime:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v2, "bnc_previous_update_time"

    invoke-virtual {v1, v2}, Lio/branch/referral/PrefHelper;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    :cond_5
    return-void
.end method


# virtual methods
.method public abstract getRequestActionName()Ljava/lang/String;
.end method

.method handleBranchViewIfAvailable(Lio/branch/referral/ServerResponse;)Z
    .locals 4

    if-eqz p1, :cond_3

    .line 89
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v0

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->BranchViewData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 91
    :try_start_0
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object p1

    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->BranchViewData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 92
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestInitSession;->getRequestActionName()Ljava/lang/String;

    move-result-object v0

    .line 93
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v1

    iget-object v1, v1, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_2

    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v1

    iget-object v1, v1, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 94
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v1

    iget-object v1, v1, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    .line 96
    instance-of v2, v1, Lio/branch/referral/Branch$IBranchViewControl;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    .line 97
    move-object v2, v1

    check-cast v2, Lio/branch/referral/Branch$IBranchViewControl;

    invoke-interface {v2}, Lio/branch/referral/Branch$IBranchViewControl;->skipBranchViewsOnThisActivity()Z

    move-result v2

    xor-int/2addr v3, v2

    :cond_0
    if-eqz v3, :cond_1

    .line 100
    invoke-static {}, Lio/branch/referral/BranchViewHandler;->getInstance()Lio/branch/referral/BranchViewHandler;

    move-result-object v2

    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v3

    invoke-virtual {v2, p1, v0, v1, v3}, Lio/branch/referral/BranchViewHandler;->showBranchView(Lorg/json/JSONObject;Ljava/lang/String;Landroid/content/Context;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;)Z

    move-result p1

    goto :goto_0

    .line 102
    :cond_1
    invoke-static {}, Lio/branch/referral/BranchViewHandler;->getInstance()Lio/branch/referral/BranchViewHandler;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lio/branch/referral/BranchViewHandler;->markInstallOrOpenBranchViewPending(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result p1

    goto :goto_0

    .line 105
    :cond_2
    invoke-static {}, Lio/branch/referral/BranchViewHandler;->getInstance()Lio/branch/referral/BranchViewHandler;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lio/branch/referral/BranchViewHandler;->markInstallOrOpenBranchViewPending(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_3
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public abstract hasCallBack()Z
.end method

.method public isGAdsParamsRequired()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method onInitSessionCompleted(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V
    .locals 2

    .line 145
    iget-object v0, p0, Lio/branch/referral/ServerRequestInitSession;->contentDiscoveryManifest_:Lio/branch/indexing/ContentDiscoveryManifest;

    if-eqz v0, :cond_0

    .line 146
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/branch/indexing/ContentDiscoveryManifest;->onBranchInitialised(Lorg/json/JSONObject;)V

    .line 147
    iget-object p1, p2, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_0

    .line 149
    :try_start_0
    invoke-static {}, Lio/branch/indexing/ContentDiscoverer;->getInstance()Lio/branch/indexing/ContentDiscoverer;

    move-result-object p1

    iget-object v0, p2, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    iget-object v1, p2, Lio/branch/referral/Branch;->sessionReferredLink_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lio/branch/indexing/ContentDiscoverer;->onSessionStarted(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    :catch_0
    :cond_0
    iget-object p1, p2, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    invoke-static {p1}, Lio/branch/referral/validators/DeepLinkRoutingValidator;->validate(Ljava/lang/ref/WeakReference;)V

    .line 155
    invoke-virtual {p2}, Lio/branch/referral/Branch;->updateSkipURLFormats()V

    return-void
.end method

.method public onPreExecute()V
    .locals 4

    .line 204
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestInitSession;->getPost()Lorg/json/JSONObject;

    move-result-object v0

    .line 206
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getAppLink()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bnc_no_value"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 207
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AndroidAppLinkURL:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v2}, Lio/branch/referral/PrefHelper;->getAppLink()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    :cond_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getPushIdentifier()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bnc_no_value"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 210
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AndroidPushIdentifier:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v2}, Lio/branch/referral/PrefHelper;->getPushIdentifier()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 213
    :cond_1
    iget-object v1, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getExternalIntentUri()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bnc_no_value"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 214
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->External_Intent_URI:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v2}, Lio/branch/referral/PrefHelper;->getExternalIntentUri()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 216
    :cond_2
    iget-object v1, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getExternalIntentExtra()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bnc_no_value"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 217
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->External_Intent_Extra:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v2}, Lio/branch/referral/PrefHelper;->getExternalIntentExtra()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 220
    :cond_3
    iget-object v1, p0, Lio/branch/referral/ServerRequestInitSession;->contentDiscoveryManifest_:Lio/branch/indexing/ContentDiscoveryManifest;

    if-eqz v1, :cond_4

    .line 221
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "mv"

    .line 222
    iget-object v3, p0, Lio/branch/referral/ServerRequestInitSession;->contentDiscoveryManifest_:Lio/branch/indexing/ContentDiscoveryManifest;

    invoke-virtual {v3}, Lio/branch/indexing/ContentDiscoveryManifest;->getManifestVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "pn"

    .line 223
    iget-object v3, p0, Lio/branch/referral/ServerRequestInitSession;->context_:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "cd"

    .line 224
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_4
    return-void
.end method

.method public onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V
    .locals 2

    .line 118
    :try_start_0
    iget-object p2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v0, "bnc_no_value"

    invoke-virtual {p2, v0}, Lio/branch/referral/PrefHelper;->setLinkClickIdentifier(Ljava/lang/String;)V

    .line 119
    iget-object p2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v0, "bnc_no_value"

    invoke-virtual {p2, v0}, Lio/branch/referral/PrefHelper;->setGoogleSearchInstallIdentifier(Ljava/lang/String;)V

    .line 120
    iget-object p2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v0, "bnc_no_value"

    invoke-virtual {p2, v0}, Lio/branch/referral/PrefHelper;->setGooglePlayReferrer(Ljava/lang/String;)V

    .line 121
    iget-object p2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v0, "bnc_no_value"

    invoke-virtual {p2, v0}, Lio/branch/referral/PrefHelper;->setExternalIntentUri(Ljava/lang/String;)V

    .line 122
    iget-object p2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v0, "bnc_no_value"

    invoke-virtual {p2, v0}, Lio/branch/referral/PrefHelper;->setExternalIntentExtra(Ljava/lang/String;)V

    .line 123
    iget-object p2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v0, "bnc_no_value"

    invoke-virtual {p2, v0}, Lio/branch/referral/PrefHelper;->setAppLink(Ljava/lang/String;)V

    .line 124
    iget-object p2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v0, "bnc_no_value"

    invoke-virtual {p2, v0}, Lio/branch/referral/PrefHelper;->setPushIdentifier(Ljava/lang/String;)V

    .line 125
    iget-object p2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p2, v1}, Lio/branch/referral/PrefHelper;->setIsAppLinkTriggeredInit(Ljava/lang/Boolean;)V

    .line 126
    iget-object p2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v1, "bnc_no_value"

    invoke-virtual {p2, v1}, Lio/branch/referral/PrefHelper;->setInstallReferrerParams(Ljava/lang/String;)V

    .line 127
    iget-object p2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p2, v0}, Lio/branch/referral/PrefHelper;->setIsFullAppConversion(Z)V

    .line 129
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object p2

    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Data:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 130
    new-instance p2, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object p1

    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Data:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 131
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->Clicked_Branch_Link:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 132
    instance-of p1, p0, Lio/branch/referral/ServerRequestRegisterInstall;

    if-eqz p1, :cond_0

    const-string p1, "Branch Install"

    goto :goto_0

    :cond_0
    const-string p1, "Branch Open"

    .line 133
    :goto_0
    new-instance v0, Lio/branch/referral/ExtendedAnswerProvider;

    invoke-direct {v0}, Lio/branch/referral/ExtendedAnswerProvider;-><init>()V

    iget-object v1, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getIdentityID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Lio/branch/referral/ExtendedAnswerProvider;->provideData(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    :catch_0
    :cond_1
    iget-object p1, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string p2, "bnc_previous_update_time"

    invoke-virtual {p1, p2}, Lio/branch/referral/PrefHelper;->getLong(Ljava/lang/String;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_2

    .line 140
    iget-object p1, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string p2, "bnc_previous_update_time"

    iget-object v0, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v1, "bnc_last_known_update_time"

    invoke-virtual {v0, v1}, Lio/branch/referral/PrefHelper;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p1, p2, v0, v1}, Lio/branch/referral/PrefHelper;->setLong(Ljava/lang/String;J)V

    :cond_2
    return-void
.end method

.method protected prepareExecuteWithoutTracking()Z
    .locals 3

    .line 294
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestInitSession;->getPost()Lorg/json/JSONObject;

    move-result-object v0

    .line 295
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AndroidAppLinkURL:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AndroidPushIdentifier:Lio/branch/referral/Defines$Jsonkey;

    .line 296
    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->LinkIdentifier:Lio/branch/referral/Defines$Jsonkey;

    .line 297
    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 319
    :cond_0
    invoke-super {p0}, Lio/branch/referral/ServerRequest;->prepareExecuteWithoutTracking()Z

    move-result v0

    return v0

    .line 299
    :cond_1
    :goto_0
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->DeviceFingerprintID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 300
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->IdentityID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 301
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->FaceBookAppLinkChecked:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 302
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->External_Intent_Extra:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 303
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->External_Intent_URI:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 304
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->FirstInstallTime:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 305
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->LastUpdateTime:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 306
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->OriginalInstallTime:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 307
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->PreviousUpdateTime:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 308
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->InstallBeginTimeStamp:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 309
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ClickedReferrerTimeStamp:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 310
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->HardwareID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 311
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->IsHardwareIDReal:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 312
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->LocalIP:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    const/4 v1, 0x1

    .line 314
    :try_start_0
    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->TrackingDisabled:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return v1
.end method

.method protected setPost(Lorg/json/JSONObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 48
    invoke-super {p0, p1}, Lio/branch/referral/ServerRequest;->setPost(Lorg/json/JSONObject;)V

    .line 49
    iget-object v0, p0, Lio/branch/referral/ServerRequestInitSession;->systemObserver_:Lio/branch/referral/SystemObserver;

    invoke-virtual {v0}, Lio/branch/referral/SystemObserver;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 50
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->AppVersion:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/ServerRequestInitSession;->systemObserver_:Lio/branch/referral/SystemObserver;

    invoke-virtual {v1}, Lio/branch/referral/SystemObserver;->getAppVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    :cond_0
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->FaceBookAppLinkChecked:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getIsAppLinkTriggeredInit()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 53
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->IsReferrable:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getIsReferrable()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 54
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Debug:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getExternDebug()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 56
    invoke-direct {p0, p1}, Lio/branch/referral/ServerRequestInitSession;->updateInstallStateAndTimestamps(Lorg/json/JSONObject;)V

    .line 57
    iget-object v0, p0, Lio/branch/referral/ServerRequestInitSession;->context_:Landroid/content/Context;

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/ServerRequestInitSession;->updateEnvironment(Landroid/content/Context;Lorg/json/JSONObject;)V

    return-void
.end method

.method protected shouldUpdateLimitFacebookTracking()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method updateLinkReferrerParams()V
    .locals 3

    .line 168
    iget-object v0, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getLinkClickIdentifier()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 171
    :try_start_0
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestInitSession;->getPost()Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->LinkIdentifier:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 172
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestInitSession;->getPost()Lorg/json/JSONObject;

    move-result-object v0

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->FaceBookAppLinkChecked:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v2}, Lio/branch/referral/PrefHelper;->getIsAppLinkTriggeredInit()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    :catch_0
    :cond_0
    iget-object v0, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getGoogleSearchInstallIdentifier()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 180
    :try_start_1
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestInitSession;->getPost()Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->GoogleSearchInstallReferrer:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 185
    :catch_1
    :cond_1
    iget-object v0, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getGooglePlayReferrer()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 188
    :try_start_2
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestInitSession;->getPost()Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->GooglePlayInstallReferrer:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 193
    :catch_2
    :cond_2
    iget-object v0, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->isFullAppConversion()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 195
    :try_start_3
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestInitSession;->getPost()Lorg/json/JSONObject;

    move-result-object v0

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AndroidAppLinkURL:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequestInitSession;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v2}, Lio/branch/referral/PrefHelper;->getAppLink()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 196
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestInitSession;->getPost()Lorg/json/JSONObject;

    move-result-object v0

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->IsFullAppConv:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_3
    return-void
.end method

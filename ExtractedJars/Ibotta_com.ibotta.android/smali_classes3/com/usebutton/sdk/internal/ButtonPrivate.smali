.class public Lcom/usebutton/sdk/internal/ButtonPrivate;
.super Ljava/lang/Object;
.source "ButtonPrivate.java"

# interfaces
.implements Lcom/usebutton/sdk/action/ButtonActionsInterface;
.implements Lcom/usebutton/sdk/purchasepath/PurchasePathInterface;


# static fields
.field private static final TAG:Ljava/lang/String; = "ButtonPrivate"

.field static button:Lcom/usebutton/sdk/internal/ButtonPrivate;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field


# instance fields
.field private context:Landroid/content/Context;

.field private final mActionCache:Lcom/usebutton/sdk/internal/api/ActionCache;

.field private mApplicationHooks:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

.field private final mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

.field private final mButtonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

.field private final mCommandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

.field private mConfigurationUpdatePolicy:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

.field private final mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

.field private mImageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

.field private mIsInitialized:Z

.field private mOnApplicationEvents:Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;

.field mOnConfigurationUpdated:Lcom/usebutton/sdk/internal/core/FailableReceiver;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "Lcom/usebutton/sdk/internal/models/Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private mOnShouldSyncEvents:Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;

.field private final mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

.field private final mSecureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

.field private mStarted:Z

.field protected final mStorage:Lcom/usebutton/sdk/internal/core/Storage;

.field private final mSyncEventsHandler:Landroid/os/Handler;

.field private final mSyncManager:Lcom/usebutton/sdk/internal/events/SyncManager;

.field private final mUrlMatcher:Lcom/usebutton/sdk/internal/models/UrlMatcher;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/events/EventTracker;Lcom/usebutton/sdk/internal/core/CommandExecutor;Lcom/usebutton/sdk/internal/util/PackageObserver;Lcom/usebutton/sdk/internal/core/ApplicationHooks;Lcom/usebutton/sdk/internal/api/ActionCache;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/models/UrlMatcher;Lcom/usebutton/sdk/internal/secure/SecureStore;Lcom/usebutton/sdk/internal/ButtonRepository;)V
    .locals 9

    move-object v0, p0

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mSyncEventsHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    .line 82
    iput-boolean v1, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStarted:Z

    .line 83
    iput-boolean v1, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mIsInitialized:Z

    .line 114
    new-instance v1, Lcom/usebutton/sdk/internal/ButtonPrivate$1;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/ButtonPrivate$1;-><init>(Lcom/usebutton/sdk/internal/ButtonPrivate;)V

    iput-object v1, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mOnShouldSyncEvents:Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;

    .line 368
    new-instance v1, Lcom/usebutton/sdk/internal/ButtonPrivate$3;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/ButtonPrivate$3;-><init>(Lcom/usebutton/sdk/internal/ButtonPrivate;)V

    iput-object v1, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mOnConfigurationUpdated:Lcom/usebutton/sdk/internal/core/FailableReceiver;

    .line 399
    new-instance v1, Lcom/usebutton/sdk/internal/ButtonPrivate$4;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/ButtonPrivate$4;-><init>(Lcom/usebutton/sdk/internal/ButtonPrivate;)V

    iput-object v1, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mOnApplicationEvents:Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;

    move-object v1, p1

    .line 92
    iput-object v1, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    move-object v4, p2

    .line 93
    iput-object v4, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    move-object v5, p3

    .line 94
    iput-object v5, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    move-object v6, p4

    .line 95
    iput-object v6, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mCommandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    move-object v2, p5

    .line 96
    iput-object v2, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

    move-object v2, p6

    .line 97
    iput-object v2, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mApplicationHooks:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    move-object/from16 v2, p7

    .line 98
    iput-object v2, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mActionCache:Lcom/usebutton/sdk/internal/api/ActionCache;

    move-object/from16 v2, p8

    .line 99
    iput-object v2, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mImageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    move-object/from16 v2, p9

    .line 100
    iput-object v2, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mUrlMatcher:Lcom/usebutton/sdk/internal/models/UrlMatcher;

    .line 101
    new-instance v8, Lcom/usebutton/sdk/internal/events/SyncManager;

    iget-object v7, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mSyncEventsHandler:Landroid/os/Handler;

    move-object v2, v8

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Lcom/usebutton/sdk/internal/events/SyncManager;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/events/EventTracker;Lcom/usebutton/sdk/internal/core/CommandExecutor;Landroid/os/Handler;)V

    iput-object v8, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mSyncManager:Lcom/usebutton/sdk/internal/events/SyncManager;

    move-object/from16 v1, p10

    .line 102
    iput-object v1, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mSecureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    move-object/from16 v1, p11

    .line 103
    iput-object v1, v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/ButtonPrivate;)Lcom/usebutton/sdk/internal/events/SyncManager;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mSyncManager:Lcom/usebutton/sdk/internal/events/SyncManager;

    return-object p0
.end method

.method static synthetic access$102(Lcom/usebutton/sdk/internal/ButtonPrivate;Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;)Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mConfigurationUpdatePolicy:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    return-object p1
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/ButtonPrivate;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->prepareSdkForSession()V

    return-void
.end method

.method static synthetic access$300(Lcom/usebutton/sdk/internal/ButtonPrivate;)Lcom/usebutton/sdk/internal/events/EventTracker;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    return-object p0
.end method

.method static synthetic access$400(Lcom/usebutton/sdk/internal/ButtonPrivate;)Z
    .locals 0

    .line 58
    iget-boolean p0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mIsInitialized:Z

    return p0
.end method

.method static synthetic access$500(Lcom/usebutton/sdk/internal/ButtonPrivate;)Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getConfigurationUpdatePolicy()Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$600(Lcom/usebutton/sdk/internal/ButtonPrivate;)Lcom/usebutton/sdk/internal/ButtonRepository;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    return-object p0
.end method

.method static synthetic access$700(Lcom/usebutton/sdk/internal/ButtonPrivate;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->onFirstActivityForegrounded()V

    return-void
.end method

.method static synthetic access$800(Lcom/usebutton/sdk/internal/ButtonPrivate;)Lcom/usebutton/sdk/internal/api/ButtonApi;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    return-object p0
.end method

.method static synthetic access$900(Lcom/usebutton/sdk/internal/ButtonPrivate;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->doRegister()V

    return-void
.end method

.method private doRegister()V
    .locals 1

    const/4 v0, 0x0

    .line 190
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->doRegister(Lcom/usebutton/sdk/Button$OnConfigureListener;)V

    return-void
.end method

.method private doRegister(Lcom/usebutton/sdk/Button$OnConfigureListener;)V
    .locals 4
    .param p1    # Lcom/usebutton/sdk/Button$OnConfigureListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 194
    new-instance v0, Lcom/usebutton/sdk/internal/ButtonPrivate$2;

    invoke-direct {v0, p0, p1}, Lcom/usebutton/sdk/internal/ButtonPrivate$2;-><init>(Lcom/usebutton/sdk/internal/ButtonPrivate;Lcom/usebutton/sdk/Button$OnConfigureListener;)V

    .line 215
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mCommandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    new-instance v1, Lcom/usebutton/sdk/internal/commands/CreateSessionCommand;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-direct {v1, v2, v3, v0}, Lcom/usebutton/sdk/internal/commands/CreateSessionCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    invoke-virtual {p1, v1}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatch(Lcom/usebutton/sdk/internal/core/Command;)V

    return-void
.end method

.method public static getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;
    .locals 1

    .line 111
    sget-object v0, Lcom/usebutton/sdk/internal/ButtonPrivate;->button:Lcom/usebutton/sdk/internal/ButtonPrivate;

    return-object v0
.end method

.method private getConfigurationUpdatePolicy()Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;
    .locals 4

    .line 389
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mConfigurationUpdatePolicy:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    if-nez v0, :cond_0

    .line 390
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Storage;->getConfigState()Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;

    move-result-object v0

    .line 391
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v1

    .line 392
    new-instance v2, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    sget-object v3, Lcom/usebutton/sdk/internal/util/TtlReference;->REALTIME_MILLIS_PROVIDER:Lcom/usebutton/sdk/internal/util/TimeProvider;

    .line 393
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->getConfigUpdateMinimumInterval()I

    move-result v1

    invoke-direct {v2, v3, v1, v0}, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;-><init>(Lcom/usebutton/sdk/internal/util/TimeProvider;ILcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mConfigurationUpdatePolicy:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    .line 396
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mConfigurationUpdatePolicy:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    return-object v0
.end method

.method private logStart()V
    .locals 4

    .line 157
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getApplicationId()Ljava/lang/String;

    move-result-object v0

    .line 158
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "Configuration failed (No App ID)"

    .line 159
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v1, "Configured successfully (App ID: %s)"

    const/4 v2, 0x1

    .line 161
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private onFirstActivityForegrounded()V
    .locals 5

    .line 422
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mIsInitialized:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 423
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mIsInitialized:Z

    .line 425
    new-instance v0, Lcom/usebutton/sdk/internal/ButtonPrivate$5;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/ButtonPrivate$5;-><init>(Lcom/usebutton/sdk/internal/ButtonPrivate;)V

    .line 448
    iget-object v1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mCommandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    new-instance v2, Lcom/usebutton/sdk/internal/commands/CheckLoggedInCommand;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    invoke-direct {v2, v0, v3, v4}, Lcom/usebutton/sdk/internal/commands/CheckLoggedInCommand;-><init>(Lcom/usebutton/sdk/internal/core/FailableReceiver;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/api/ButtonApi;)V

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatch(Lcom/usebutton/sdk/internal/core/Command;)V

    :cond_0
    return-void
.end method

.method private prepareSdkForSession()V
    .locals 3

    .line 166
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getConfigurationUpdatePolicy()Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mOnConfigurationUpdated:Lcom/usebutton/sdk/internal/core/FailableReceiver;

    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/ButtonRepository;->fetchConfiguration(Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    const/4 v0, 0x0

    .line 168
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->probeForInstalledApplications(Z)V

    return-void
.end method

.method private probeForInstalledApplications(Z)V
    .locals 5

    .line 185
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mCommandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    new-instance v1, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

    .line 186
    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/util/PackageObserver;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4, p1}, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Landroid/content/pm/PackageManager;Z)V

    .line 185
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatch(Lcom/usebutton/sdk/internal/core/Command;)V

    return-void
.end method

.method public static safelyOpenIntent(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 295
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".test"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 297
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 300
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    if-nez v0, :cond_1

    .line 301
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not find any components to handle: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const-string v0, "ButtonPrivate"

    .line 303
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not find any app that can handle intent "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 308
    sget-object v2, Lcom/usebutton/sdk/internal/ButtonPrivate;->button:Lcom/usebutton/sdk/internal/ButtonPrivate;

    if-eqz v2, :cond_2

    .line 309
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getApplicationHooks()Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->getLastForegroundedActivity()Landroid/app/Activity;

    move-result-object v0

    .line 311
    :cond_2
    instance-of v2, p0, Landroid/app/Activity;

    if-eqz v2, :cond_3

    const-string v1, "ButtonPrivate"

    const-string v2, "Launching intent using an activity as context."

    .line 312
    invoke-static {v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verbose(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const/4 v2, 0x1

    if-eqz v0, :cond_4

    const-string p0, "ButtonPrivate"

    const-string v3, "Launching using former top activity: %s"

    .line 314
    new-array v2, v2, [Ljava/lang/Object;

    .line 315
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v1

    .line 314
    invoke-static {p0, v3, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object p0, v0

    goto :goto_0

    :cond_4
    const-string v3, "ButtonPrivate"

    const-string v4, "Got non-UI context, will launch as new task. %s"

    .line 318
    new-array v2, v2, [Ljava/lang/Object;

    .line 319
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v2, v1

    .line 318
    invoke-static {v3, v4, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/high16 v1, 0x10000000

    .line 320
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 323
    :goto_0
    invoke-static {p0, p1, v0}, Lcom/usebutton/sdk/internal/IntentStarter;->startIntent(Landroid/content/Context;Landroid/content/Intent;Landroid/app/Activity;)V

    return-void
.end method

.method public static setButton(Lcom/usebutton/sdk/internal/ButtonPrivate;)V
    .locals 0

    .line 107
    sput-object p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->button:Lcom/usebutton/sdk/internal/ButtonPrivate;

    return-void
.end method


# virtual methods
.method protected canExchangeUrlForAction(Ljava/net/URL;Z)Z
    .locals 1
    .param p1    # Ljava/net/URL;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 534
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mUrlMatcher:Lcom/usebutton/sdk/internal/models/UrlMatcher;

    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->canExchangeUrl(Ljava/net/URL;Z)Z

    move-result p1

    return p1
.end method

.method public clearAllData()V
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mSecureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/secure/SecureStore;->clear()V

    .line 251
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonRepository;->clear()V

    .line 252
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->doRegister()V

    return-void
.end method

.method public declared-synchronized configure(Lcom/usebutton/sdk/Button$OnConfigureListener;)V
    .locals 3
    .param p1    # Lcom/usebutton/sdk/Button$OnConfigureListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    .line 127
    :try_start_0
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStarted:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 128
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStarted:Z

    .line 129
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->logStart()V

    .line 130
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mCommandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->start()V

    .line 131
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mApplicationHooks:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->start()V

    .line 132
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mOnShouldSyncEvents:Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;

    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->subscribeWeak(Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;)V

    .line 133
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mApplicationHooks:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->getObservable()Lcom/usebutton/sdk/internal/functional/Observable;

    move-result-object v0

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mOnApplicationEvents:Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;

    invoke-interface {v0, v2}, Lcom/usebutton/sdk/internal/functional/Observable;->subscribeWeak(Ljava/lang/Object;)V

    .line 135
    invoke-static {v1}, Lcom/usebutton/sdk/internal/user/UserImpl;->getInstance(Lcom/usebutton/sdk/internal/secure/SecureStore;)Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object v0

    .line 136
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->getPreConfigurationUserIdentifier()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 138
    invoke-virtual {p0, v2}, Lcom/usebutton/sdk/internal/ButtonPrivate;->setUserIdentifier(Ljava/lang/String;)V

    .line 139
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserImpl;->setPreConfigurationUserIdentifier(Ljava/lang/String;)V

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Storage;->getSessionId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 146
    invoke-interface {p1, v1}, Lcom/usebutton/sdk/Button$OnConfigureListener;->onComplete(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    :cond_1
    monitor-exit p0

    return-void

    .line 153
    :cond_2
    :try_start_1
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->doRegister(Lcom/usebutton/sdk/Button$OnConfigureListener;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public doGetAction(Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;Ljava/lang/String;Lcom/usebutton/sdk/internal/AppActionCallbacks;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/usebutton/sdk/internal/AppActionCallbacks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-nez p4, :cond_0

    const-string p1, "Ignoring doGetAction request with null listener."

    .line 467
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-void

    .line 471
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/ButtonPrivate$6;

    invoke-direct {v0, p0, p4}, Lcom/usebutton/sdk/internal/ButtonPrivate$6;-><init>(Lcom/usebutton/sdk/internal/ButtonPrivate;Lcom/usebutton/sdk/internal/AppActionCallbacks;)V

    invoke-virtual {p0, p1, p3, v0, p2}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getPromotions(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/core/FailableReceiver;Lcom/usebutton/sdk/action/ActionQuery;)Lcom/usebutton/sdk/internal/core/Command;

    return-void
.end method

.method public doGetAction(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/AppActionCallbacks;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/internal/AppActionCallbacks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-nez p3, :cond_0

    const-string p1, "Ignoring doGetAction request with null listener."

    .line 494
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-void

    .line 498
    :cond_0
    new-instance v6, Lcom/usebutton/sdk/internal/ButtonPrivate$7;

    invoke-direct {v6, p0, p3}, Lcom/usebutton/sdk/internal/ButtonPrivate$7;-><init>(Lcom/usebutton/sdk/internal/ButtonPrivate;Lcom/usebutton/sdk/internal/AppActionCallbacks;)V

    .line 515
    iget-object p3, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mCommandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    new-instance v7, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    iget-object v5, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

    move-object v0, v7

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/util/PackageObserver;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    invoke-virtual {p3, v7}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatchFirst(Lcom/usebutton/sdk/internal/core/Command;)V

    return-void
.end method

.method public doGetAction(Ljava/net/URL;Ljava/lang/String;Lcom/usebutton/sdk/internal/AppActionCallbacks;)V
    .locals 9
    .param p1    # Ljava/net/URL;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/internal/AppActionCallbacks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 522
    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->canExchangeUrlForAction(Ljava/net/URL;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 523
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mCommandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    new-instance v8, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    iget-object v6, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

    new-instance v7, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mUrlMatcher:Lcom/usebutton/sdk/internal/models/UrlMatcher;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    invoke-direct {v7, p1, v1, v4, p3}, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;-><init>(Ljava/net/URL;Lcom/usebutton/sdk/internal/models/UrlMatcher;Lcom/usebutton/sdk/internal/events/EventTracker;Lcom/usebutton/sdk/internal/AppActionCallbacks;)V

    move-object v1, v8

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v7}, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Ljava/net/URL;Ljava/lang/String;Lcom/usebutton/sdk/internal/util/PackageObserver;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    invoke-virtual {v0, v8}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatchFirst(Lcom/usebutton/sdk/internal/core/Command;)V

    goto :goto_0

    :cond_0
    const-string p2, "ButtonPrivate"

    const-string v1, "Failed to fetch app action for url: \'%s\'"

    const/4 v2, 0x1

    .line 527
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v0

    invoke-static {p2, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    invoke-interface {p3}, Lcom/usebutton/sdk/internal/AppActionCallbacks;->onNoAction()V

    :goto_0
    return-void
.end method

.method public doOnLocaleChanged(Landroid/content/Context;)V
    .locals 3

    .line 358
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getHttp()Lcom/usebutton/sdk/internal/api/Http;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/api/HostInformation;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    .line 359
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/core/Storage;->getApplicationId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lcom/usebutton/sdk/internal/api/HostInformation;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/api/HostInformation;->getUserAgent()Ljava/lang/String;

    move-result-object p1

    .line 358
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/api/Http;->setUserAgent(Ljava/lang/String;)V

    .line 362
    iget-boolean p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mIsInitialized:Z

    if-eqz p1, :cond_0

    .line 363
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getConfigurationUpdatePolicy()Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mOnConfigurationUpdated:Lcom/usebutton/sdk/internal/core/FailableReceiver;

    invoke-virtual {p1, v0, v1}, Lcom/usebutton/sdk/internal/ButtonRepository;->fetchConfiguration(Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    :cond_0
    return-void
.end method

.method public fetch(Lcom/usebutton/sdk/action/ActionRequest;Lcom/usebutton/sdk/action/ActionListener;)V
    .locals 3
    .param p1    # Lcom/usebutton/sdk/action/ActionRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/action/ActionListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-nez p2, :cond_0

    const-string p1, "Ignoring fetch request with null listener."

    .line 590
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-void

    .line 594
    :cond_0
    invoke-virtual {p1}, Lcom/usebutton/sdk/action/ActionRequest;->getButtonId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/usebutton/sdk/action/ActionRequest;->getQuery()Lcom/usebutton/sdk/action/ActionQuery;

    move-result-object v1

    invoke-virtual {p1}, Lcom/usebutton/sdk/action/ActionRequest;->getPubRef()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/usebutton/sdk/internal/ButtonPrivate$9;

    invoke-direct {v2, p0, p2}, Lcom/usebutton/sdk/internal/ButtonPrivate$9;-><init>(Lcom/usebutton/sdk/internal/ButtonPrivate;Lcom/usebutton/sdk/action/ActionListener;)V

    invoke-virtual {p0, v0, v1, p1, v2}, Lcom/usebutton/sdk/internal/ButtonPrivate;->doGetAction(Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;Ljava/lang/String;Lcom/usebutton/sdk/internal/AppActionCallbacks;)V

    return-void
.end method

.method public fetch(Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;Lcom/usebutton/sdk/purchasepath/PurchasePathListener;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/purchasepath/PurchasePathListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-nez p2, :cond_0

    const-string p1, "Ignoring purchase path request with null listener."

    .line 550
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-void

    .line 556
    :cond_0
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-virtual {p1}, Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 562
    invoke-virtual {p1}, Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;->getPubRef()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/usebutton/sdk/internal/ButtonPrivate$8;

    invoke-direct {v1, p0, p2}, Lcom/usebutton/sdk/internal/ButtonPrivate$8;-><init>(Lcom/usebutton/sdk/internal/ButtonPrivate;Lcom/usebutton/sdk/purchasepath/PurchasePathListener;)V

    invoke-virtual {p0, v0, p1, v1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->doGetAction(Ljava/net/URL;Ljava/lang/String;Lcom/usebutton/sdk/internal/AppActionCallbacks;)V

    return-void

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 558
    invoke-interface {p2, v0, p1}, Lcom/usebutton/sdk/purchasepath/PurchasePathListener;->onComplete(Lcom/usebutton/sdk/purchasepath/PurchasePath;Ljava/lang/Throwable;)V

    return-void
.end method

.method public getActionCache()Lcom/usebutton/sdk/internal/api/AppActionCache;
    .locals 1

    .line 459
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mActionCache:Lcom/usebutton/sdk/internal/api/ActionCache;

    return-object v0
.end method

.method public getApi()Lcom/usebutton/sdk/internal/api/ButtonApi;
    .locals 1

    .line 239
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    return-object v0
.end method

.method public getApplicationHooks()Lcom/usebutton/sdk/internal/core/ApplicationHooks;
    .locals 1

    .line 331
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mApplicationHooks:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    return-object v0
.end method

.method public getApplicationId()Ljava/lang/String;
    .locals 1

    .line 219
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getApplicationId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getButtonRepository()Lcom/usebutton/sdk/internal/ButtonRepository;
    .locals 1

    .line 353
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    return-object v0
.end method

.method public getCommandExecutor()Lcom/usebutton/sdk/internal/core/CommandExecutor;
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mCommandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    return-object v0
.end method

.method public getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;
    .locals 1

    .line 339
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonRepository;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v0

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 609
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getCopy()Lcom/usebutton/sdk/internal/models/Configuration$Copy;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 344
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getCopy()Lcom/usebutton/sdk/internal/models/Configuration$Copy;

    move-result-object v0

    return-object v0
.end method

.method public getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    return-object v0
.end method

.method public getExtension()Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 584
    invoke-static {}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->getInstance()Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->getExtension()Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    move-result-object v0

    return-object v0
.end method

.method public getImageLoader()Lcom/usebutton/sdk/internal/ImageLoader;
    .locals 1

    .line 454
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mImageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    return-object v0
.end method

.method public getPackageObserver()Lcom/usebutton/sdk/internal/util/PackageObserver;
    .locals 1

    .line 327
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

    return-object v0
.end method

.method public getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 349
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v0

    return-object v0
.end method

.method public getPromotions(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/core/FailableReceiver;Lcom/usebutton/sdk/action/ActionQuery;)Lcom/usebutton/sdk/internal/core/Command;
    .locals 11
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/usebutton/sdk/action/ActionQuery;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "Lcom/usebutton/sdk/internal/models/AppAction;",
            ">;",
            "Lcom/usebutton/sdk/action/ActionQuery;",
            ")",
            "Lcom/usebutton/sdk/internal/core/Command;"
        }
    .end annotation

    .line 264
    new-instance v10, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mActionCache:Lcom/usebutton/sdk/internal/api/ActionCache;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mImageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    iget-object v5, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

    move-object v0, v10

    move-object v6, p1

    move-object v7, p2

    move-object v8, p4

    move-object v9, p3

    invoke-direct/range {v0 .. v9}, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/api/ActionCache;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/util/PackageObserver;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 267
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getCommandExecutor()Lcom/usebutton/sdk/internal/core/CommandExecutor;

    move-result-object p1

    invoke-virtual {p1, v10}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatchFirst(Lcom/usebutton/sdk/internal/core/Command;)V

    return-object v10
.end method

.method public getSecureStore()Lcom/usebutton/sdk/internal/secure/SecureStore;
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mSecureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    return-object v0
.end method

.method public getStorage()Lcom/usebutton/sdk/internal/core/Storage;
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    return-object v0
.end method

.method public declared-synchronized internalIsStarted()Z
    .locals 1

    monitor-enter p0

    .line 335
    :try_start_0
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStarted:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public isRegistered()Z
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Storage;->getSessionId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public setContext(Landroid/content/Context;)V
    .locals 0

    .line 613
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->context:Landroid/content/Context;

    return-void
.end method

.method public setExtension(Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 578
    invoke-static {}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->getInstance()Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->setExtension(Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;)V

    return-void
.end method

.method public setUserIdentifier(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    .line 272
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 275
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->setUserIdentifier(Ljava/lang/String;)V

    .line 276
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getCommandExecutor()Lcom/usebutton/sdk/internal/core/CommandExecutor;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-direct {v1, v2, v3, p1}, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatch(Lcom/usebutton/sdk/internal/core/Command;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public declared-synchronized stop()V
    .locals 2

    monitor-enter p0

    .line 175
    :try_start_0
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStarted:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    .line 176
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mSyncManager:Lcom/usebutton/sdk/internal/events/SyncManager;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/events/SyncManager;->removeCallbacks()V

    .line 177
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mOnShouldSyncEvents:Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/events/EventTracker;->unsubscribe(Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;)V

    .line 178
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mApplicationHooks:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->getObservable()Lcom/usebutton/sdk/internal/functional/Observable;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mOnApplicationEvents:Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/internal/functional/Observable;->unsubscribe(Ljava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mApplicationHooks:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->stop()V

    .line 180
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mCommandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->stop()V

    const/4 v0, 0x0

    .line 181
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStarted:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 182
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 539
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Button { appId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    .line 540
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getApplicationId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "null}"

    :goto_0
    return-object v0
.end method

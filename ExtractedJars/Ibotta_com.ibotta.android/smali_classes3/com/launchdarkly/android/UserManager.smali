.class Lcom/launchdarkly/android/UserManager;
.super Ljava/lang/Object;
.source "UserManager.java"


# instance fields
.field private final application:Landroid/app/Application;

.field private currentUser:Lcom/launchdarkly/android/LDUser;

.field private final environmentName:Ljava/lang/String;

.field private final executor:Ljava/util/concurrent/ExecutorService;

.field private final fetcher:Lcom/launchdarkly/android/FeatureFlagFetcher;

.field private final flagResponseSharedPreferences:Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

.field private volatile initialized:Z

.field private final jsonParser:Lcom/launchdarkly/android/Util$LazySingleton;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/launchdarkly/android/Util$LazySingleton<",
            "Lcom/google/gson/JsonParser;",
            ">;"
        }
    .end annotation
.end field

.field private final summaryEventSharedPreferences:Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;

.field private final userLocalSharedPreferences:Lcom/launchdarkly/android/UserLocalSharedPreferences;


# direct methods
.method constructor <init>(Landroid/app/Application;Lcom/launchdarkly/android/FeatureFlagFetcher;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-boolean v0, p0, Lcom/launchdarkly/android/UserManager;->initialized:Z

    .line 68
    iput-object p1, p0, Lcom/launchdarkly/android/UserManager;->application:Landroid/app/Application;

    .line 69
    iput-object p2, p0, Lcom/launchdarkly/android/UserManager;->fetcher:Lcom/launchdarkly/android/FeatureFlagFetcher;

    .line 70
    new-instance p2, Lcom/launchdarkly/android/UserLocalSharedPreferences;

    invoke-direct {p2, p1, p4}, Lcom/launchdarkly/android/UserLocalSharedPreferences;-><init>(Landroid/app/Application;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/launchdarkly/android/UserManager;->userLocalSharedPreferences:Lcom/launchdarkly/android/UserLocalSharedPreferences;

    .line 71
    new-instance p2, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LaunchDarkly-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-version"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;-><init>(Landroid/app/Application;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/launchdarkly/android/UserManager;->flagResponseSharedPreferences:Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    .line 72
    new-instance p2, Lcom/launchdarkly/android/response/UserSummaryEventSharedPreferences;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LaunchDarkly-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "-summaryevents"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p2, p1, p4}, Lcom/launchdarkly/android/response/UserSummaryEventSharedPreferences;-><init>(Landroid/app/Application;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/launchdarkly/android/UserManager;->summaryEventSharedPreferences:Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;

    .line 73
    iput-object p3, p0, Lcom/launchdarkly/android/UserManager;->environmentName:Ljava/lang/String;

    .line 75
    new-instance p1, Lcom/launchdarkly/android/Util$LazySingleton;

    new-instance p2, Lcom/launchdarkly/android/UserManager$1;

    invoke-direct {p2, p0}, Lcom/launchdarkly/android/UserManager$1;-><init>(Lcom/launchdarkly/android/UserManager;)V

    invoke-direct {p1, p2}, Lcom/launchdarkly/android/Util$LazySingleton;-><init>(Lcom/launchdarkly/android/Util$Provider;)V

    iput-object p1, p0, Lcom/launchdarkly/android/UserManager;->jsonParser:Lcom/launchdarkly/android/Util$LazySingleton;

    .line 81
    new-instance p1, Lcom/launchdarkly/android/BackgroundThreadExecutor;

    invoke-direct {p1}, Lcom/launchdarkly/android/BackgroundThreadExecutor;-><init>()V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/launchdarkly/android/BackgroundThreadExecutor;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/UserManager;->executor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic access$002(Lcom/launchdarkly/android/UserManager;Z)Z
    .locals 0

    .line 47
    iput-boolean p1, p0, Lcom/launchdarkly/android/UserManager;->initialized:Z

    return p1
.end method

.method static synthetic access$100(Lcom/launchdarkly/android/UserManager;Lcom/google/gson/JsonObject;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserManager;->saveFlagSettings(Lcom/google/gson/JsonObject;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/launchdarkly/android/UserManager;Lcom/launchdarkly/android/response/FlagResponse;)Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserManager;->getSharedPreferencesEntries(Lcom/launchdarkly/android/response/FlagResponse;)Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/launchdarkly/android/UserManager;)Landroid/app/Application;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/launchdarkly/android/UserManager;->application:Landroid/app/Application;

    return-object p0
.end method

.method static synthetic access$300(Lcom/launchdarkly/android/UserManager;)Ljava/lang/String;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/launchdarkly/android/UserManager;->environmentName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/LDUser;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/launchdarkly/android/UserManager;->currentUser:Lcom/launchdarkly/android/LDUser;

    return-object p0
.end method

.method static synthetic access$500(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 47
    invoke-static {p0}, Lcom/launchdarkly/android/UserManager;->userBase64ToJson(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$600(Lcom/launchdarkly/android/UserManager;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/launchdarkly/android/UserManager;->syncCurrentUserToActiveUserAndLog()V

    return-void
.end method

.method static synthetic access$700(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/launchdarkly/android/UserManager;->flagResponseSharedPreferences:Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    return-object p0
.end method

.method static synthetic access$800(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/UserLocalSharedPreferences;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/launchdarkly/android/UserManager;->userLocalSharedPreferences:Lcom/launchdarkly/android/UserLocalSharedPreferences;

    return-object p0
.end method

.method static synthetic access$900(Lcom/launchdarkly/android/UserManager;Ljava/util/List;)Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserManager;->getSharedPreferencesEntries(Ljava/util/List;)Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;

    move-result-object p0

    return-object p0
.end method

.method private getSharedPreferencesEntries(Lcom/launchdarkly/android/response/FlagResponse;)Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;
    .locals 5
    .param p1    # Lcom/launchdarkly/android/response/FlagResponse;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 291
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_1

    .line 295
    invoke-interface {p1}, Lcom/launchdarkly/android/response/FlagResponse;->getValue()Lcom/google/gson/JsonElement;

    move-result-object v1

    .line 296
    invoke-interface {p1}, Lcom/launchdarkly/android/response/FlagResponse;->getKey()Ljava/lang/String;

    move-result-object v2

    .line 298
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserManager;->getSharedPreferencesEntry(Lcom/launchdarkly/android/response/FlagResponse;)Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "Found some unknown feature flag type for key: [%s] value: [%s]"

    const/4 v3, 0x2

    .line 300
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v2

    invoke-static {p1, v3}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 302
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 306
    :cond_1
    :goto_0
    new-instance p1, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;

    invoke-direct {p1, v0}, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method private getSharedPreferencesEntries(Ljava/util/List;)Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;
    .locals 6
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/launchdarkly/android/response/FlagResponse;",
            ">;)",
            "Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;"
        }
    .end annotation

    .line 312
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 315
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/launchdarkly/android/response/FlagResponse;

    .line 316
    invoke-interface {v1}, Lcom/launchdarkly/android/response/FlagResponse;->getValue()Lcom/google/gson/JsonElement;

    move-result-object v2

    .line 317
    invoke-interface {v1}, Lcom/launchdarkly/android/response/FlagResponse;->getKey()Ljava/lang/String;

    move-result-object v3

    .line 319
    invoke-direct {p0, v1}, Lcom/launchdarkly/android/UserManager;->getSharedPreferencesEntry(Lcom/launchdarkly/android/response/FlagResponse;)Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "Found some unknown feature flag type for key: [%s] value: [%s]"

    const/4 v4, 0x2

    .line 321
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const/4 v3, 0x1

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v3

    invoke-static {v1, v4}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 323
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 327
    :cond_1
    new-instance p1, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;

    invoke-direct {p1, v0}, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method private getSharedPreferencesEntry(Lcom/launchdarkly/android/response/FlagResponse;)Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;
    .locals 2
    .param p1    # Lcom/launchdarkly/android/response/FlagResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 334
    invoke-interface {p1}, Lcom/launchdarkly/android/response/FlagResponse;->getKey()Ljava/lang/String;

    move-result-object v0

    .line 335
    invoke-interface {p1}, Lcom/launchdarkly/android/response/FlagResponse;->getValue()Lcom/google/gson/JsonElement;

    move-result-object p1

    .line 337
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->isJsonObject()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->isJsonArray()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 339
    :cond_0
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->isJsonPrimitive()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonPrimitive()Lcom/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonPrimitive;->isBoolean()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 340
    new-instance v1, Lcom/launchdarkly/android/UserLocalSharedPreferences$BooleanSharedPreferencesEntry;

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsBoolean()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences$BooleanSharedPreferencesEntry;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v1

    .line 341
    :cond_1
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->isJsonPrimitive()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonPrimitive()Lcom/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonPrimitive;->isNumber()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 342
    new-instance v1, Lcom/launchdarkly/android/UserLocalSharedPreferences$FloatSharedPreferencesEntry;

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences$FloatSharedPreferencesEntry;-><init>(Ljava/lang/String;Ljava/lang/Float;)V

    return-object v1

    .line 343
    :cond_2
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->isJsonPrimitive()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonPrimitive()Lcom/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonPrimitive;->isString()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 344
    new-instance v1, Lcom/launchdarkly/android/UserLocalSharedPreferences$StringSharedPreferencesEntry;

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences$StringSharedPreferencesEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_3
    const/4 p1, 0x0

    return-object p1

    .line 338
    :cond_4
    :goto_0
    new-instance v1, Lcom/launchdarkly/android/UserLocalSharedPreferences$StringSharedPreferencesEntry;

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences$StringSharedPreferencesEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method static declared-synchronized newInstance(Landroid/app/Application;Lcom/launchdarkly/android/FeatureFlagFetcher;Ljava/lang/String;Ljava/lang/String;)Lcom/launchdarkly/android/UserManager;
    .locals 2

    const-class v0, Lcom/launchdarkly/android/UserManager;

    monitor-enter v0

    .line 64
    :try_start_0
    new-instance v1, Lcom/launchdarkly/android/UserManager;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/launchdarkly/android/UserManager;-><init>(Landroid/app/Application;Lcom/launchdarkly/android/FeatureFlagFetcher;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private parseJson(Ljava/lang/String;)Lcom/google/gson/JsonObject;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 278
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->jsonParser:Lcom/launchdarkly/android/Util$LazySingleton;

    invoke-virtual {v0}, Lcom/launchdarkly/android/Util$LazySingleton;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/JsonParser;

    if-eqz p1, :cond_0

    .line 281
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/google/gson/JsonParser;->parse(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 283
    :goto_0
    invoke-static {p1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;)V

    .line 286
    :cond_0
    new-instance p1, Lcom/google/gson/JsonObject;

    invoke-direct {p1}, Lcom/google/gson/JsonObject;-><init>()V

    return-object p1
.end method

.method private saveFlagSettings(Lcom/google/gson/JsonObject;)V
    .locals 4

    const-string v0, "saveFlagSettings for user key: %s"

    const/4 v1, 0x1

    .line 167
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/launchdarkly/android/UserManager;->currentUser:Lcom/launchdarkly/android/LDUser;

    invoke-virtual {v2}, Lcom/launchdarkly/android/LDUser;->getKey()Lcom/google/gson/JsonPrimitive;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    new-instance v0, Lcom/launchdarkly/android/response/UserFlagResponseStore;

    new-instance v1, Lcom/launchdarkly/android/response/interpreter/PingFlagResponseInterpreter;

    invoke-direct {v1}, Lcom/launchdarkly/android/response/interpreter/PingFlagResponseInterpreter;-><init>()V

    invoke-direct {v0, p1, v1}, Lcom/launchdarkly/android/response/UserFlagResponseStore;-><init>(Lcom/google/gson/JsonObject;Lcom/launchdarkly/android/response/interpreter/FlagResponseInterpreter;)V

    .line 170
    invoke-interface {v0}, Lcom/launchdarkly/android/response/FlagResponseStore;->getFlagResponse()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    .line 172
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->flagResponseSharedPreferences:Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    invoke-interface {v0}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->clear()V

    .line 173
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->flagResponseSharedPreferences:Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    invoke-interface {v0, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->saveAll(Ljava/util/List;)V

    .line 174
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->userLocalSharedPreferences:Lcom/launchdarkly/android/UserLocalSharedPreferences;

    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserManager;->getSharedPreferencesEntries(Ljava/util/List;)Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->saveCurrentUserFlags(Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;)V

    .line 175
    invoke-direct {p0}, Lcom/launchdarkly/android/UserManager;->syncCurrentUserToActiveUserAndLog()V

    :cond_0
    return-void
.end method

.method private syncCurrentUserToActiveUserAndLog()V
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->userLocalSharedPreferences:Lcom/launchdarkly/android/UserLocalSharedPreferences;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->syncCurrentUserToActiveUser()V

    .line 181
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->userLocalSharedPreferences:Lcom/launchdarkly/android/UserLocalSharedPreferences;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->logCurrentUserFlags()V

    return-void
.end method

.method private static userBase64ToJson(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 185
    new-instance v0, Ljava/lang/String;

    const/16 v1, 0x8

    invoke-static {p0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([B)V

    return-object v0
.end method


# virtual methods
.method clearFlagResponseSharedPreferences()V
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 351
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->flagResponseSharedPreferences:Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    invoke-interface {v0}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->clear()V

    return-void
.end method

.method deleteCurrentUserFlag(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 194
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserManager;->parseJson(Ljava/lang/String;)Lcom/google/gson/JsonObject;

    move-result-object v0

    .line 195
    new-instance v1, Lcom/launchdarkly/android/response/UserFlagResponseStore;

    new-instance v2, Lcom/launchdarkly/android/response/interpreter/DeleteFlagResponseInterpreter;

    invoke-direct {v2}, Lcom/launchdarkly/android/response/interpreter/DeleteFlagResponseInterpreter;-><init>()V

    invoke-direct {v1, v0, v2}, Lcom/launchdarkly/android/response/UserFlagResponseStore;-><init>(Lcom/google/gson/JsonObject;Lcom/launchdarkly/android/response/interpreter/FlagResponseInterpreter;)V

    .line 198
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lcom/google/common/util/concurrent/MoreExecutors;->listeningDecorator(Ljava/util/concurrent/ExecutorService;)Lcom/google/common/util/concurrent/ListeningExecutorService;

    move-result-object v0

    .line 199
    new-instance v2, Lcom/launchdarkly/android/UserManager$4;

    invoke-direct {v2, p0, v1, p1}, Lcom/launchdarkly/android/UserManager$4;-><init>(Lcom/launchdarkly/android/UserManager;Lcom/launchdarkly/android/response/FlagResponseStore;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lcom/google/common/util/concurrent/ListeningExecutorService;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method getCurrentUser()Lcom/launchdarkly/android/LDUser;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->currentUser:Lcom/launchdarkly/android/LDUser;

    return-object v0
.end method

.method getCurrentUserSharedPrefs()Landroid/content/SharedPreferences;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->userLocalSharedPreferences:Lcom/launchdarkly/android/UserLocalSharedPreferences;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->getCurrentUserSharedPrefs()Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->flagResponseSharedPreferences:Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    return-object v0
.end method

.method getListenersByKey(Ljava/lang/String;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Collection<",
            "Landroid/util/Pair<",
            "Lcom/launchdarkly/android/FeatureFlagChangeListener;",
            "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;",
            ">;>;"
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->userLocalSharedPreferences:Lcom/launchdarkly/android/UserLocalSharedPreferences;

    invoke-virtual {v0, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->getListener(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method getSummaryEventSharedPreferences()Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->summaryEventSharedPreferences:Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;

    return-object v0
.end method

.method isInitialized()Z
    .locals 1

    .line 189
    iget-boolean v0, p0, Lcom/launchdarkly/android/UserManager;->initialized:Z

    return v0
.end method

.method patchCurrentUserFlags(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 249
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserManager;->parseJson(Ljava/lang/String;)Lcom/google/gson/JsonObject;

    move-result-object v0

    .line 250
    new-instance v1, Lcom/launchdarkly/android/response/UserFlagResponseStore;

    new-instance v2, Lcom/launchdarkly/android/response/interpreter/PatchFlagResponseInterpreter;

    invoke-direct {v2}, Lcom/launchdarkly/android/response/interpreter/PatchFlagResponseInterpreter;-><init>()V

    invoke-direct {v1, v0, v2}, Lcom/launchdarkly/android/response/UserFlagResponseStore;-><init>(Lcom/google/gson/JsonObject;Lcom/launchdarkly/android/response/interpreter/FlagResponseInterpreter;)V

    .line 253
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lcom/google/common/util/concurrent/MoreExecutors;->listeningDecorator(Ljava/util/concurrent/ExecutorService;)Lcom/google/common/util/concurrent/ListeningExecutorService;

    move-result-object v0

    .line 254
    new-instance v2, Lcom/launchdarkly/android/UserManager$6;

    invoke-direct {v2, p0, v1, p1}, Lcom/launchdarkly/android/UserManager$6;-><init>(Lcom/launchdarkly/android/UserManager;Lcom/launchdarkly/android/response/FlagResponseStore;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lcom/google/common/util/concurrent/ListeningExecutorService;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method putCurrentUserFlags(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 221
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserManager;->parseJson(Ljava/lang/String;)Lcom/google/gson/JsonObject;

    move-result-object v0

    .line 222
    new-instance v1, Lcom/launchdarkly/android/response/UserFlagResponseStore;

    new-instance v2, Lcom/launchdarkly/android/response/interpreter/PutFlagResponseInterpreter;

    invoke-direct {v2}, Lcom/launchdarkly/android/response/interpreter/PutFlagResponseInterpreter;-><init>()V

    invoke-direct {v1, v0, v2}, Lcom/launchdarkly/android/response/UserFlagResponseStore;-><init>(Lcom/google/gson/JsonObject;Lcom/launchdarkly/android/response/interpreter/FlagResponseInterpreter;)V

    .line 225
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lcom/google/common/util/concurrent/MoreExecutors;->listeningDecorator(Ljava/util/concurrent/ExecutorService;)Lcom/google/common/util/concurrent/ListeningExecutorService;

    move-result-object v0

    .line 226
    new-instance v2, Lcom/launchdarkly/android/UserManager$5;

    invoke-direct {v2, p0, v1, p1}, Lcom/launchdarkly/android/UserManager$5;-><init>(Lcom/launchdarkly/android/UserManager;Lcom/launchdarkly/android/response/FlagResponseStore;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lcom/google/common/util/concurrent/ListeningExecutorService;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method registerListener(Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->userLocalSharedPreferences:Lcom/launchdarkly/android/UserLocalSharedPreferences;

    invoke-virtual {v0, p1, p2}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->registerListener(Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V

    return-void
.end method

.method setCurrentUser(Lcom/launchdarkly/android/LDUser;)V
    .locals 4

    .line 108
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getAsUrlSafeBase64()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Setting current user to: [%s] [%s]"

    const/4 v2, 0x2

    .line 109
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v0}, Lcom/launchdarkly/android/UserManager;->userBase64ToJson(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    iput-object p1, p0, Lcom/launchdarkly/android/UserManager;->currentUser:Lcom/launchdarkly/android/LDUser;

    .line 111
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->userLocalSharedPreferences:Lcom/launchdarkly/android/UserLocalSharedPreferences;

    invoke-virtual {v0, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->setCurrentUser(Lcom/launchdarkly/android/LDUser;)V

    return-void
.end method

.method unregisterListener(Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->userLocalSharedPreferences:Lcom/launchdarkly/android/UserLocalSharedPreferences;

    invoke-virtual {v0, p1, p2}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->unRegisterListener(Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V

    return-void
.end method

.method updateCurrentUser()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager;->fetcher:Lcom/launchdarkly/android/FeatureFlagFetcher;

    iget-object v1, p0, Lcom/launchdarkly/android/UserManager;->currentUser:Lcom/launchdarkly/android/LDUser;

    invoke-interface {v0, v1}, Lcom/launchdarkly/android/FeatureFlagFetcher;->fetch(Lcom/launchdarkly/android/LDUser;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    .line 117
    new-instance v1, Lcom/launchdarkly/android/UserManager$2;

    invoke-direct {v1, p0}, Lcom/launchdarkly/android/UserManager$2;-><init>(Lcom/launchdarkly/android/UserManager;)V

    .line 131
    invoke-static {}, Lcom/google/common/util/concurrent/MoreExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 117
    invoke-static {v0, v1, v2}, Lcom/google/common/util/concurrent/Futures;->addCallback(Lcom/google/common/util/concurrent/ListenableFuture;Lcom/google/common/util/concurrent/FutureCallback;Ljava/util/concurrent/Executor;)V

    .line 134
    new-instance v1, Lcom/launchdarkly/android/UserManager$3;

    invoke-direct {v1, p0}, Lcom/launchdarkly/android/UserManager$3;-><init>(Lcom/launchdarkly/android/UserManager;)V

    .line 140
    invoke-static {}, Lcom/google/common/util/concurrent/MoreExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 134
    invoke-static {v0, v1, v2}, Lcom/google/common/util/concurrent/Futures;->transform(Lcom/google/common/util/concurrent/ListenableFuture;Lcom/google/common/base/Function;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

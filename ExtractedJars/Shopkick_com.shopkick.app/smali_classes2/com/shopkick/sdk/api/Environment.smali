.class public final Lcom/shopkick/sdk/api/Environment;
.super Ljava/lang/Object;
.source "Environment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;
    }
.end annotation


# static fields
.field private static volatile Instance:Lcom/shopkick/sdk/api/Environment; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field private static final KEY_SERVER_ENV:Ljava/lang/String; = "server_environment"

.field private static final PREFS_FILENAME:Ljava/lang/String; = "com.shopkick.sdk.settings"


# instance fields
.field private final context:Landroid/content/Context;

.field private final defaultServiceEnvironment:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

.field private final envToAuthority:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final envToHttpsFlag:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 54
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/api/Environment;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 10

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/api/Environment;->envToAuthority:Ljava/util/concurrent/ConcurrentHashMap;

    .line 151
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/api/Environment;->envToHttpsFlag:Ljava/util/concurrent/ConcurrentHashMap;

    .line 90
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/api/Environment;->context:Landroid/content/Context;

    .line 91
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->context:Landroid/content/Context;

    const-string v0, "com.shopkick.sdk.settings"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/api/Environment;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 93
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->envToAuthority:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->PROD:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v2, "sdk.shopkick.com"

    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->envToHttpsFlag:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->PROD:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->envToAuthority:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->PRODUCTION:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v2, "sdk.shopkick.com"

    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->envToHttpsFlag:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->PRODUCTION:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->envToAuthority:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->BETA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v2, "beta.shopkick.com"

    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->envToHttpsFlag:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->BETA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->envToAuthority:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->QA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v2, "beta.shopkick.com"

    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->envToHttpsFlag:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->QA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->envToAuthority:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->STAGING:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v2, "beta.shopkick.com"

    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->envToHttpsFlag:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->STAGING:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->envToAuthority:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->ALPHA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v2, "alpha.shopkick.com"

    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->envToHttpsFlag:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->ALPHA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    iget-object p1, p0, Lcom/shopkick/sdk/api/Environment;->context:Landroid/content/Context;

    sget v0, Lcom/shopkick/sdk/R$string;->local_authority:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 113
    iget-object v0, p0, Lcom/shopkick/sdk/api/Environment;->envToAuthority:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v2, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->DEV:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    invoke-virtual {v0, v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    iget-object v0, p0, Lcom/shopkick/sdk/api/Environment;->envToHttpsFlag:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v2, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->DEV:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    iget-object v0, p0, Lcom/shopkick/sdk/api/Environment;->envToAuthority:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v2, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->LOCALHOST:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    invoke-virtual {v0, v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    iget-object v0, p0, Lcom/shopkick/sdk/api/Environment;->envToHttpsFlag:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v2, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->LOCALHOST:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 120
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v2, "Environment: default local authority loaded [%1$s]"

    new-array v6, v3, [Ljava/lang/Object;

    aput-object p1, v6, v1

    .line 119
    invoke-virtual {v0, v4, v5, v2, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 125
    sget-object p1, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->PROD:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    .line 126
    iget-object v0, p0, Lcom/shopkick/sdk/api/Environment;->context:Landroid/content/Context;

    sget v2, Lcom/shopkick/sdk/R$string;->env:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 129
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 130
    invoke-static {v0}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    move-result-object p1

    .line 131
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v4, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 132
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "Environment: default service environment loaded [%1$s]"

    new-array v7, v3, [Ljava/lang/Object;

    aput-object v0, v7, v1

    .line 131
    invoke-virtual {v2, v4, v5, v6, v7}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    move-object v7, v2

    .line 137
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v2, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 138
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    const-string v8, "Environment: Un-parsable \'env\' value found in dev_settings.xml [%1$s]"

    new-array v9, v3, [Ljava/lang/Object;

    aput-object v0, v9, v1

    .line 137
    invoke-virtual/range {v4 .. v9}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    :goto_0
    iput-object p1, p0, Lcom/shopkick/sdk/api/Environment;->defaultServiceEnvironment:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    return-void
.end method

.method public static getInstance()Lcom/shopkick/sdk/api/Environment;
    .locals 2

    .line 61
    sget-object v0, Lcom/shopkick/sdk/api/Environment;->Instance:Lcom/shopkick/sdk/api/Environment;

    if-eqz v0, :cond_0

    .line 64
    sget-object v0, Lcom/shopkick/sdk/api/Environment;->Instance:Lcom/shopkick/sdk/api/Environment;

    return-object v0

    .line 62
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "initialize() must be called before getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static initialize(Landroid/content/Context;)V
    .locals 2

    if-eqz p0, :cond_2

    .line 80
    sget-object v0, Lcom/shopkick/sdk/api/Environment;->Instance:Lcom/shopkick/sdk/api/Environment;

    if-nez v0, :cond_1

    .line 81
    sget-object v0, Lcom/shopkick/sdk/api/Environment;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 82
    :try_start_0
    sget-object v1, Lcom/shopkick/sdk/api/Environment;->Instance:Lcom/shopkick/sdk/api/Environment;

    if-nez v1, :cond_0

    .line 83
    new-instance v1, Lcom/shopkick/sdk/api/Environment;

    invoke-direct {v1, p0}, Lcom/shopkick/sdk/api/Environment;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/shopkick/sdk/api/Environment;->Instance:Lcom/shopkick/sdk/api/Environment;

    .line 85
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void

    .line 76
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'context\' can not be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getCurrentAuthority()Ljava/lang/String;
    .locals 2

    .line 155
    iget-object v0, p0, Lcom/shopkick/sdk/api/Environment;->envToAuthority:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lcom/shopkick/sdk/api/Environment;->getServiceEnvironment()Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCurrentHttpsFlag()Z
    .locals 2

    .line 163
    iget-object v0, p0, Lcom/shopkick/sdk/api/Environment;->envToHttpsFlag:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lcom/shopkick/sdk/api/Environment;->getServiceEnvironment()Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getServiceEnvironment()Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;
    .locals 7

    .line 168
    iget-object v0, p0, Lcom/shopkick/sdk/api/Environment;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "server_environment"

    iget-object v2, p0, Lcom/shopkick/sdk/api/Environment;->defaultServiceEnvironment:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    .line 170
    invoke-virtual {v2}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 168
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 171
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 172
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "Environment: service environment retrieved [%1$s]"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    .line 171
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 175
    invoke-static {v0}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    move-result-object v0

    return-object v0
.end method

.method public setServerEnvironment(Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;)V
    .locals 6

    if-eqz p1, :cond_0

    .line 181
    invoke-virtual {p1}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 182
    iget-object v0, p0, Lcom/shopkick/sdk/api/Environment;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "server_environment"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 183
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 184
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "Environment: service environment updated [%1$s]"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    .line 183
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 180
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'env\' can not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

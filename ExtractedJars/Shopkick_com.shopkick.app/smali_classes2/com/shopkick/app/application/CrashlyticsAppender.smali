.class public Lcom/shopkick/app/application/CrashlyticsAppender;
.super Lcom/shopkick/logging/AppenderBase;
.source "CrashlyticsAppender.java"


# static fields
.field public static final APPENDER_TAG:Ljava/lang/String;

.field private static final CRASHLYTICS_TAG:Ljava/lang/String; = "CRASHLYTICS"

.field private static volatile Instance:Lcom/shopkick/app/application/CrashlyticsAppender; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field private static final SEPARATOR:Ljava/lang/String; = "; "


# instance fields
.field private authority:Ljava/lang/String;

.field private context:Landroid/content/Context;

.field private gitRevision:Ljava/lang/String;

.field private prefs:Lcom/shopkick/app/application/AppPreferences;

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const-class v0, Lcom/shopkick/app/application/CrashlyticsAppender;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/application/CrashlyticsAppender;->APPENDER_TAG:Ljava/lang/String;

    const/4 v0, 0x0

    .line 29
    sput-object v0, Lcom/shopkick/app/application/CrashlyticsAppender;->Instance:Lcom/shopkick/app/application/CrashlyticsAppender;

    .line 30
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/app/application/CrashlyticsAppender;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/AppPreferences;Landroid/content/Context;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/shopkick/logging/AppenderBase;-><init>()V

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    .line 45
    iput-object p1, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 46
    iput-object p2, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->prefs:Lcom/shopkick/app/application/AppPreferences;

    .line 47
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->context:Landroid/content/Context;

    .line 49
    invoke-direct {p0}, Lcom/shopkick/app/application/CrashlyticsAppender;->setup()V

    return-void

    .line 44
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "context cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "prefs cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 42
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "userAccountDataSource cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static getInstance()Lcom/shopkick/app/application/CrashlyticsAppender;
    .locals 2

    .line 69
    sget-object v0, Lcom/shopkick/app/application/CrashlyticsAppender;->Instance:Lcom/shopkick/app/application/CrashlyticsAppender;

    if-eqz v0, :cond_0

    .line 70
    sget-object v0, Lcom/shopkick/app/application/CrashlyticsAppender;->Instance:Lcom/shopkick/app/application/CrashlyticsAppender;

    return-object v0

    .line 69
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "initialize() must be called before getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static initialize(Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/AppPreferences;Landroid/content/Context;)V
    .locals 2

    .line 56
    sget-object v0, Lcom/shopkick/app/application/CrashlyticsAppender;->Instance:Lcom/shopkick/app/application/CrashlyticsAppender;

    if-nez v0, :cond_1

    .line 57
    sget-object v0, Lcom/shopkick/app/application/CrashlyticsAppender;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 58
    :try_start_0
    sget-object v1, Lcom/shopkick/app/application/CrashlyticsAppender;->Instance:Lcom/shopkick/app/application/CrashlyticsAppender;

    if-nez v1, :cond_0

    .line 59
    new-instance v1, Lcom/shopkick/app/application/CrashlyticsAppender;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/app/application/CrashlyticsAppender;-><init>(Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/AppPreferences;Landroid/content/Context;)V

    sput-object v1, Lcom/shopkick/app/application/CrashlyticsAppender;->Instance:Lcom/shopkick/app/application/CrashlyticsAppender;

    .line 61
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
.end method

.method private setup()V
    .locals 5

    .line 77
    new-instance v0, Lcom/crashlytics/android/core/CrashlyticsCore$Builder;

    invoke-direct {v0}, Lcom/crashlytics/android/core/CrashlyticsCore$Builder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/crashlytics/android/core/CrashlyticsCore$Builder;->disabled(Z)Lcom/crashlytics/android/core/CrashlyticsCore$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/crashlytics/android/core/CrashlyticsCore$Builder;->build()Lcom/crashlytics/android/core/CrashlyticsCore;

    move-result-object v0

    .line 78
    iget-object v2, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->context:Landroid/content/Context;

    const/4 v3, 0x1

    new-array v3, v3, [Lio/fabric/sdk/android/Kit;

    new-instance v4, Lcom/crashlytics/android/Crashlytics$Builder;

    invoke-direct {v4}, Lcom/crashlytics/android/Crashlytics$Builder;-><init>()V

    invoke-virtual {v4, v0}, Lcom/crashlytics/android/Crashlytics$Builder;->core(Lcom/crashlytics/android/core/CrashlyticsCore;)Lcom/crashlytics/android/Crashlytics$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/crashlytics/android/Crashlytics$Builder;->build()Lcom/crashlytics/android/Crashlytics;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Lio/fabric/sdk/android/Fabric;->with(Landroid/content/Context;[Lio/fabric/sdk/android/Kit;)Lio/fabric/sdk/android/Fabric;

    .line 79
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    const-string v0, "authority"

    iget-object v1, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->authority:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/crashlytics/android/Crashlytics;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    const-string v0, "gitRevision"

    iget-object v1, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->gitRevision:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/crashlytics/android/Crashlytics;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;
    .locals 1

    .line 197
    sget-object v0, Lcom/shopkick/app/application/CrashlyticsAppender;->APPENDER_TAG:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/shopkick/logging/ConfigurationProvider;->getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;

    move-result-object p1

    return-object p1
.end method

.method public isEnabled(Lcom/shopkick/logging/ConfigurationProvider;)Z
    .locals 3

    .line 117
    invoke-super {p0, p1}, Lcom/shopkick/logging/AppenderBase;->isEnabled(Lcom/shopkick/logging/ConfigurationProvider;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 118
    iget-object p1, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    if-ne p1, v2, :cond_0

    return v1

    .line 120
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->prefs:Lcom/shopkick/app/application/AppPreferences;

    const-string v2, "crashlytics_permission"

    invoke-virtual {p1, v2}, Lcom/shopkick/app/application/AppPreferences;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    .line 123
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->prefs:Lcom/shopkick/app/application/AppPreferences;

    const-string v2, "first_use_completed"

    invoke-virtual {p1, v2}, Lcom/shopkick/app/application/AppPreferences;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->prefs:Lcom/shopkick/app/application/AppPreferences;

    const-string v2, "crashlytics_permission_recorded"

    invoke-virtual {p1, v2}, Lcom/shopkick/app/application/AppPreferences;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    move v0, v1

    :cond_2
    return v0

    :cond_3
    return v0
.end method

.method public log(Lcom/shopkick/logging/Message;Lcom/shopkick/logging/ConfigurationProvider;)V
    .locals 4

    if-eqz p1, :cond_3

    const-string v0, "LEVEL"

    .line 137
    const-class v1, Lcom/shopkick/logging/Level;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/logging/Level;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "TEXT"

    .line 141
    const-class v2, Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "THROWABLE"

    .line 143
    const-class v3, Ljava/lang/Throwable;

    invoke-virtual {p1, v2, v3}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    .line 146
    invoke-virtual {p0, p2}, Lcom/shopkick/app/application/CrashlyticsAppender;->isEnabled(Lcom/shopkick/logging/ConfigurationProvider;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/application/CrashlyticsAppender;->shouldLog(Lcom/shopkick/logging/Message;Lcom/shopkick/logging/ConfigurationProvider;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 147
    sget-object p1, Lcom/shopkick/app/application/CrashlyticsAppender$1;->$SwitchMap$com$shopkick$logging$Level:[I

    invoke-virtual {v0}, Lcom/shopkick/logging/Level;->ordinal()I

    move-result p2

    aget p1, p1, p2

    packed-switch p1, :pswitch_data_0

    .line 188
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 190
    invoke-virtual {v0}, Lcom/shopkick/logging/Level;->name()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2

    const-string v0, "Unsupported log level [level:%1$s]"

    .line 188
    invoke-static {p2, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 178
    :pswitch_0
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isInitialized()Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz v2, :cond_1

    .line 180
    invoke-static {v2}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    goto/16 :goto_0

    .line 182
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "CRASHLYTICS; "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->log(Ljava/lang/String;)V

    goto :goto_0

    .line 171
    :pswitch_1
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isInitialized()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 172
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "CRASHLYTICS; "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->log(Ljava/lang/String;)V

    goto :goto_0

    .line 164
    :pswitch_2
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isInitialized()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 165
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "CRASHLYTICS; "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->log(Ljava/lang/String;)V

    goto :goto_0

    .line 157
    :pswitch_3
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isInitialized()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 158
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "CRASHLYTICS; "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->log(Ljava/lang/String;)V

    goto :goto_0

    .line 150
    :pswitch_4
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isInitialized()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 151
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "CRASHLYTICS; "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->log(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void

    .line 134
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'message\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public recordUserPreference(Z)V
    .locals 2

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->prefs:Lcom/shopkick/app/application/AppPreferences;

    const-string v1, "crashlytics_permission"

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/application/AppPreferences;->putBoolean(Ljava/lang/String;Z)V

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->prefs:Lcom/shopkick/app/application/AppPreferences;

    const-string v0, "crashlytics_permission_recorded"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/AppPreferences;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public setGitRevisionAndAuthority(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 96
    iput-object p1, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->gitRevision:Ljava/lang/String;

    .line 97
    iput-object p2, p0, Lcom/shopkick/app/application/CrashlyticsAppender;->authority:Ljava/lang/String;

    .line 98
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    const-string v0, "authority"

    invoke-static {v0, p2}, Lcom/crashlytics/android/Crashlytics;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    const-string p2, "gitRevision"

    invoke-static {p2, p1}, Lcom/crashlytics/android/Crashlytics;->setString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setUserIdentifier(Ljava/lang/String;)V
    .locals 1

    .line 87
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->setUserIdentifier(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

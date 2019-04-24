.class public Lcom/shopkick/app/application/CrashlyticsWrapper;
.super Ljava/lang/Object;
.source "CrashlyticsWrapper.java"


# static fields
.field public static final SEPARATOR:Ljava/lang/String; = "; "

.field public static final TAG_ACTIVITY:Ljava/lang/String; = "Activity Lifecycle"

.field public static final TAG_SCREEN:Ljava/lang/String; = "Screen Transition"

.field private static crashlyticsWrapper:Lcom/shopkick/app/application/CrashlyticsWrapper;


# instance fields
.field private PRINT_LOGCAT:Z

.field private authority:Ljava/lang/String;

.field private context:Landroid/content/Context;

.field private gitRevision:Ljava/lang/String;

.field private prefs:Lcom/shopkick/app/application/AppPreferences;

.field private started:Z

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/AppPreferences;Landroid/content/Context;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->PRINT_LOGCAT:Z

    .line 42
    iput-object p1, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 43
    iput-object p2, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->prefs:Lcom/shopkick/app/application/AppPreferences;

    .line 44
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->context:Landroid/content/Context;

    return-void
.end method

.method public static getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;
    .locals 1

    .line 48
    sget-object v0, Lcom/shopkick/app/application/CrashlyticsWrapper;->crashlyticsWrapper:Lcom/shopkick/app/application/CrashlyticsWrapper;

    return-object v0
.end method

.method public static init(Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/AppPreferences;Landroid/content/Context;)V
    .locals 1

    .line 35
    sget-object v0, Lcom/shopkick/app/application/CrashlyticsWrapper;->crashlyticsWrapper:Lcom/shopkick/app/application/CrashlyticsWrapper;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Lcom/shopkick/app/application/CrashlyticsWrapper;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/app/application/CrashlyticsWrapper;-><init>(Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/AppPreferences;Landroid/content/Context;)V

    sput-object v0, Lcom/shopkick/app/application/CrashlyticsWrapper;->crashlyticsWrapper:Lcom/shopkick/app/application/CrashlyticsWrapper;

    .line 37
    sget-object p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->crashlyticsWrapper:Lcom/shopkick/app/application/CrashlyticsWrapper;

    invoke-virtual {p0}, Lcom/shopkick/app/application/CrashlyticsWrapper;->maybeStart()V

    :cond_0
    return-void
.end method

.method private logStart()V
    .locals 3

    .line 113
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "DEBUG_FLAG_CRASHLYTICS_TOAST"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Starting crashlytics"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->context:Landroid/content/Context;

    const-string v1, "Starting crashlytics"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 116
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method

.method private start()V
    .locals 6

    .line 76
    new-instance v0, Lcom/crashlytics/android/core/CrashlyticsCore$Builder;

    invoke-direct {v0}, Lcom/crashlytics/android/core/CrashlyticsCore$Builder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/crashlytics/android/core/CrashlyticsCore$Builder;->disabled(Z)Lcom/crashlytics/android/core/CrashlyticsCore$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/crashlytics/android/core/CrashlyticsCore$Builder;->build()Lcom/crashlytics/android/core/CrashlyticsCore;

    move-result-object v0

    .line 77
    iget-object v2, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->context:Landroid/content/Context;

    const/4 v3, 0x1

    new-array v4, v3, [Lio/fabric/sdk/android/Kit;

    new-instance v5, Lcom/crashlytics/android/Crashlytics$Builder;

    invoke-direct {v5}, Lcom/crashlytics/android/Crashlytics$Builder;-><init>()V

    invoke-virtual {v5, v0}, Lcom/crashlytics/android/Crashlytics$Builder;->core(Lcom/crashlytics/android/core/CrashlyticsCore;)Lcom/crashlytics/android/Crashlytics$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/crashlytics/android/Crashlytics$Builder;->build()Lcom/crashlytics/android/Crashlytics;

    move-result-object v0

    aput-object v0, v4, v1

    invoke-static {v2, v4}, Lio/fabric/sdk/android/Fabric;->with(Landroid/content/Context;[Lio/fabric/sdk/android/Kit;)Lio/fabric/sdk/android/Fabric;

    .line 78
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    const-string v0, "authority"

    iget-object v1, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->authority:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/crashlytics/android/Crashlytics;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    const-string v0, "gitRevision"

    iget-object v1, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->gitRevision:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/crashlytics/android/Crashlytics;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    invoke-direct {p0}, Lcom/shopkick/app/application/CrashlyticsWrapper;->logStart()V

    .line 81
    iput-boolean v3, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->started:Z

    return-void
.end method


# virtual methods
.method public isEnabled()Z
    .locals 3

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    if-ne v0, v2, :cond_0

    return v1

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->prefs:Lcom/shopkick/app/application/AppPreferences;

    const-string v2, "crashlytics_permission"

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/AppPreferences;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 97
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->prefs:Lcom/shopkick/app/application/AppPreferences;

    const-string v2, "first_use_completed"

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/AppPreferences;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->prefs:Lcom/shopkick/app/application/AppPreferences;

    const-string v2, "crashlytics_permission_recorded"

    .line 98
    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/AppPreferences;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public log(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 103
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "; "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->log(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public maybeStart()V
    .locals 1

    .line 67
    iget-boolean v0, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->started:Z

    if-eqz v0, :cond_0

    return-void

    .line 70
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/application/CrashlyticsWrapper;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 71
    invoke-direct {p0}, Lcom/shopkick/app/application/CrashlyticsWrapper;->start()V

    :cond_1
    return-void
.end method

.method public recordUserPreference(Z)V
    .locals 3

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->prefs:Lcom/shopkick/app/application/AppPreferences;

    const-string v1, "crashlytics_permission"

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/application/AppPreferences;->putBoolean(Ljava/lang/String;Z)V

    .line 86
    iget-object v0, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->prefs:Lcom/shopkick/app/application/AppPreferences;

    const-string v1, "crashlytics_permission_recorded"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/AppPreferences;->putBoolean(Ljava/lang/String;Z)V

    if-eqz p1, :cond_0

    .line 88
    invoke-virtual {p0}, Lcom/shopkick/app/application/CrashlyticsWrapper;->maybeStart()V

    :cond_0
    return-void
.end method

.method public setGitRevisionAndAuthority(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 58
    iput-object p1, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->gitRevision:Ljava/lang/String;

    .line 59
    iput-object p2, p0, Lcom/shopkick/app/application/CrashlyticsWrapper;->authority:Ljava/lang/String;

    .line 60
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    const-string v0, "authority"

    invoke-static {v0, p2}, Lcom/crashlytics/android/Crashlytics;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    const-string p2, "gitRevision"

    invoke-static {p2, p1}, Lcom/crashlytics/android/Crashlytics;->setString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setUserIdentifier(Ljava/lang/String;)V
    .locals 1

    .line 52
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->setUserIdentifier(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

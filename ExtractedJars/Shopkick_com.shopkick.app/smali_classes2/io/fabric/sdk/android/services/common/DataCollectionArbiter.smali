.class public Lio/fabric/sdk/android/services/common/DataCollectionArbiter;
.super Ljava/lang/Object;
.source "DataCollectionArbiter.java"


# static fields
.field private static final FIREBASE_CRASHLYTICS_COLLECTION_ENABLED:Ljava/lang/String; = "firebase_crashlytics_collection_enabled"

.field private static final FIREBASE_CRASHLYTICS_PREFS:Ljava/lang/String; = "com.google.firebase.crashlytics.prefs"

.field private static instance:Lio/fabric/sdk/android/services/common/DataCollectionArbiter;

.field private static instanceLock:Ljava/lang/Object;


# instance fields
.field private volatile crashlyticsDataCollectionEnabled:Z

.field private volatile crashlyticsDataCollectionExplicitlySet:Z

.field private final firebaseApp:Lio/fabric/sdk/android/services/common/FirebaseApp;

.field private final sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->instanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    const-string v0, "com.google.firebase.crashlytics.prefs"

    const/4 v1, 0x0

    .line 39
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 41
    invoke-static {p1}, Lio/fabric/sdk/android/services/common/FirebaseAppImpl;->getInstance(Landroid/content/Context;)Lio/fabric/sdk/android/services/common/FirebaseApp;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->firebaseApp:Lio/fabric/sdk/android/services/common/FirebaseApp;

    .line 46
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v2, "firebase_crashlytics_collection_enabled"

    invoke-interface {v0, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 47
    iget-object p1, p0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v0, "firebase_crashlytics_collection_enabled"

    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    move v1, v2

    move v2, p1

    goto :goto_0

    .line 51
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 55
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const/16 v3, 0x80

    .line 54
    invoke-virtual {v0, p1, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 57
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v3, "firebase_crashlytics_collection_enabled"

    .line 59
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 61
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v0, "firebase_crashlytics_collection_enabled"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move v1, v2

    move v2, p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 69
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v3, "Fabric"

    const-string v4, "Unable to get PackageManager. Falling through"

    invoke-interface {v0, v3, v4, p1}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    :cond_1
    :goto_0
    iput-boolean v2, p0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->crashlyticsDataCollectionEnabled:Z

    .line 75
    iput-boolean v1, p0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->crashlyticsDataCollectionExplicitlySet:Z

    return-void

    .line 35
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "null context"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static getInstance(Landroid/content/Context;)Lio/fabric/sdk/android/services/common/DataCollectionArbiter;
    .locals 2

    .line 25
    sget-object v0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->instanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 26
    :try_start_0
    sget-object v1, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->instance:Lio/fabric/sdk/android/services/common/DataCollectionArbiter;

    if-nez v1, :cond_0

    .line 27
    new-instance v1, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;

    invoke-direct {v1, p0}, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;-><init>(Landroid/content/Context;)V

    sput-object v1, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->instance:Lio/fabric/sdk/android/services/common/DataCollectionArbiter;

    .line 29
    :cond_0
    sget-object p0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->instance:Lio/fabric/sdk/android/services/common/DataCollectionArbiter;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 30
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public isDataCollectionEnabled()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->crashlyticsDataCollectionExplicitlySet:Z

    if-eqz v0, :cond_0

    .line 80
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->crashlyticsDataCollectionEnabled:Z

    return v0

    .line 82
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->firebaseApp:Lio/fabric/sdk/android/services/common/FirebaseApp;

    if-eqz v0, :cond_1

    .line 83
    invoke-interface {v0}, Lio/fabric/sdk/android/services/common/FirebaseApp;->isDataCollectionDefaultEnabled()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public setCrashlyticsDataCollectionEnabled(Z)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits",
            "ApplySharedPref"
        }
    .end annotation

    .line 90
    iput-boolean p1, p0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->crashlyticsDataCollectionEnabled:Z

    const/4 v0, 0x1

    .line 91
    iput-boolean v0, p0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->crashlyticsDataCollectionExplicitlySet:Z

    .line 92
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "firebase_crashlytics_collection_enabled"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 93
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

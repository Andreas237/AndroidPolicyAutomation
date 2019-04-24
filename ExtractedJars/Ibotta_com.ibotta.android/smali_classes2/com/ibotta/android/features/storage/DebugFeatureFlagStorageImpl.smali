.class public Lcom/ibotta/android/features/storage/DebugFeatureFlagStorageImpl;
.super Ljava/lang/Object;
.source "DebugFeatureFlagStorageImpl.java"

# interfaces
.implements Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;


# instance fields
.field private final ibottaJson:Lcom/ibotta/android/json/IbottaJson;

.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;Lcom/ibotta/android/json/IbottaJson;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorageImpl;->prefs:Landroid/content/SharedPreferences;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorageImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    return-void
.end method


# virtual methods
.method public getFeatureFlagState(Ljava/lang/String;)Lcom/ibotta/android/features/storage/DebugFeatureFlagState;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    .line 43
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorageImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 45
    iget-object v1, p0, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorageImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    const-class v2, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;

    invoke-interface {v1, p1, v2}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p1

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Failed to save test state"

    const/4 v2, 0x0

    .line 48
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-object v0
.end method

.method public hasStateFor(Ljava/lang/String;)Z
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorageImpl;->prefs:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public saveFeatureFlagState(Ljava/lang/String;Lcom/ibotta/android/features/storage/DebugFeatureFlagState;)V
    .locals 2

    .line 30
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorageImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 31
    iget-object v1, p0, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorageImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    invoke-interface {v1, p2}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 32
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Failed to save test state"

    const/4 v0, 0x0

    .line 34
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

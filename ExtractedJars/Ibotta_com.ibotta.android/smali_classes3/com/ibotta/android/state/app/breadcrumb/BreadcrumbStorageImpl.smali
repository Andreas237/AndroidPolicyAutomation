.class public Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorageImpl;
.super Ljava/lang/Object;
.source "BreadcrumbStorageImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final ibottaJson:Lcom/ibotta/android/json/IbottaJson;

.field private final sharedPrefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;Lcom/ibotta/android/json/IbottaJson;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorageImpl;->sharedPrefs:Landroid/content/SharedPreferences;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorageImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    return-void
.end method


# virtual methods
.method public deleteBreadcrumb(Ljava/lang/String;)V
    .locals 3

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorageImpl;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 73
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 74
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string v0, "Deleted breadcrumb: %1$s"

    const/4 v1, 0x1

    .line 76
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public getBreadcrumb(Ljava/lang/String;)Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 52
    const-class v0, Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorageImpl;->getBreadcrumb(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;

    move-result-object p1

    return-object p1
.end method

.method public getBreadcrumb(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 60
    :try_start_0
    iget-object v3, p0, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorageImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    iget-object v4, p0, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorageImpl;->sharedPrefs:Landroid/content/SharedPreferences;

    const-string v5, "{}"

    invoke-interface {v4, p1, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, p2}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v2, "Loaded breadcrumb: name=%1$s, class=%2$s"

    const/4 v4, 0x2

    .line 62
    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v0

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v4, v1

    invoke-static {v2, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_0

    :catch_1
    move-exception p2

    move-object v3, v2

    :goto_0
    const-string v2, "Failed to load breadcrumb: %1$s"

    .line 64
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    invoke-static {p2, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-object v3
.end method

.method public getBreadcrumbNames()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 32
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorageImpl;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public saveBreadcrumb(Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 38
    :try_start_0
    iget-object v2, p0, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorageImpl;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 39
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;->getName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorageImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    invoke-interface {v4, p1}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 40
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string v2, "Saved breadcrumb: %1$s"

    .line 42
    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Failed to save breadcrumb: name=%1$s"

    .line 46
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v0

    invoke-static {v2, v3, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

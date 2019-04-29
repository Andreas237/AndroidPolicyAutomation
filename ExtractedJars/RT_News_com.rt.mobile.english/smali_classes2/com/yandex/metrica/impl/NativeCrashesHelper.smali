.class Lcom/yandex/metrica/impl/NativeCrashesHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/NativeCrashesHelper$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private final b:Landroid/content/Context;

.field private c:Z

.field private d:Z


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->b:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/NativeCrashesHelper;)Ljava/lang/String;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic a(Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    .line 2151
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2152
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    move-result p0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    .line 2154
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    .line 2156
    new-array p0, v1, [Ljava/lang/String;

    return-object p0

    .line 2159
    :cond_0
    new-instance p0, Lcom/yandex/metrica/impl/NativeCrashesHelper$1;

    invoke-direct {p0}, Lcom/yandex/metrica/impl/NativeCrashesHelper$1;-><init>()V

    .line 2167
    invoke-virtual {v0, p0}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    return-object p0

    .line 2168
    :cond_1
    new-array p0, v1, [Ljava/lang/String;

    return-object p0
.end method

.method private static b(Z)Z
    .locals 0

    .line 100
    :try_start_0
    invoke-static {p0}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->logsEnabled(Z)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method

.method private c()Z
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static native cancelSetUpNativeUncaughtExceptionHandler()V
.end method

.method private d()Z
    .locals 1

    .line 95
    invoke-direct {p0}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static native logsEnabled(Z)V
.end method

.method private static native setUpNativeUncaughtExceptionHandler(Ljava/lang/String;)V
.end method


# virtual methods
.method declared-synchronized a(Lcom/yandex/metrica/impl/bf;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    monitor-enter p0

    .line 52
    :try_start_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2109
    new-instance v0, Lcom/yandex/metrica/impl/NativeCrashesHelper$a;

    invoke-direct {v0, p1, p0}, Lcom/yandex/metrica/impl/NativeCrashesHelper$a;-><init>(Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/NativeCrashesHelper;)V

    .line 53
    invoke-interface {p2, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    .line 54
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 51
    monitor-exit p0

    throw p1
.end method

.method declared-synchronized a(Z)V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 2059
    :try_start_0
    iget-boolean p1, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->d:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2060
    invoke-static {v0}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->b(Z)Z

    .line 2061
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/YandexMetricaNativeCrashes"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->a:Ljava/lang/String;

    :cond_0
    const/4 p1, 0x1

    .line 2063
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->d:Z

    .line 1069
    invoke-direct {p0}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1070
    iget-object v1, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->setUpNativeUncaughtExceptionHandler(Ljava/lang/String;)V

    .line 1071
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->c:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1076
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 1074
    :catch_0
    :try_start_1
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    monitor-exit p0

    return-void

    .line 2085
    :cond_2
    :try_start_2
    invoke-direct {p0}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->d()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 2086
    invoke-static {}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->cancelSetUpNativeUncaughtExceptionHandler()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 2091
    :catch_1
    :cond_3
    :try_start_3
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->c:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    monitor-exit p0

    return-void

    .line 40
    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public a()Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper;->c:Z

    return v0
.end method

.method b()Z
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    :try_start_0
    const-string v0, "YandexMetricaNativeModule"

    .line 174
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

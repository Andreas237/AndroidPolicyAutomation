.class public Lcom/twitter/sdk/android/core/internal/MigrationHelper;
.super Ljava/lang/Object;
.source "MigrationHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/twitter/sdk/android/core/internal/MigrationHelper$PrefixFileNameFilter;,
        Lcom/twitter/sdk/android/core/internal/MigrationHelper$FileLastModifiedComparator;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method getLatestFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .line 56
    new-instance v0, Lcom/twitter/sdk/android/core/internal/MigrationHelper$PrefixFileNameFilter;

    invoke-direct {v0, p2}, Lcom/twitter/sdk/android/core/internal/MigrationHelper$PrefixFileNameFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object p1

    .line 57
    new-instance p2, Lcom/twitter/sdk/android/core/internal/MigrationHelper$FileLastModifiedComparator;

    invoke-direct {p2}, Lcom/twitter/sdk/android/core/internal/MigrationHelper$FileLastModifiedComparator;-><init>()V

    invoke-static {p1, p2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 58
    array-length p2, p1

    if-lez p2, :cond_0

    const/4 p2, 0x0

    aget-object p1, p1, p2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method getSharedPreferencesDir(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    .line 52
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    const-string v1, "shared_prefs"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public migrateSessionStore(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 31
    invoke-virtual {p0, p1}, Lcom/twitter/sdk/android/core/internal/MigrationHelper;->getSharedPreferencesDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 39
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 40
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p3

    if-eqz p3, :cond_1

    return-void

    .line 45
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/twitter/sdk/android/core/internal/MigrationHelper;->getLatestFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 47
    invoke-virtual {p1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    :cond_2
    return-void

    :cond_3
    :goto_0
    return-void
.end method

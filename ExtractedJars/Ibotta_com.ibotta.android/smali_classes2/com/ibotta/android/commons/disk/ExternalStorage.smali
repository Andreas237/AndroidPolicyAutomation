.class public final Lcom/ibotta/android/commons/disk/ExternalStorage;
.super Lcom/ibotta/android/commons/disk/BaseStorage;
.source "ExternalStorage.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0010\u00a2\u0006\u0002\u0008\u000bJ\u001d\u0010\u000c\u001a\n \r*\u0004\u0018\u00010\u00080\u00082\u0006\u0010\t\u001a\u00020\nH\u0010\u00a2\u0006\u0002\u0008\u000eR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0005\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ibotta/android/commons/disk/ExternalStorage;",
        "Lcom/ibotta/android/commons/disk/BaseStorage;",
        "()V",
        "isAvailable",
        "",
        "()Z",
        "isWriteable",
        "getCacheDir",
        "Ljava/io/File;",
        "context",
        "Landroid/content/Context;",
        "getCacheDir$ibotta_commons_release",
        "getStorageDir",
        "kotlin.jvm.PlatformType",
        "getStorageDir$ibotta_commons_release",
        "ibotta-commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/android/commons/disk/BaseStorage;-><init>()V

    return-void
.end method


# virtual methods
.method public getCacheDir$ibotta_commons_release(Landroid/content/Context;)Ljava/io/File;
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Lcom/ibotta/android/commons/disk/StorageException;

    sget-object v1, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;->FAILED_CREATE:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "Failed to get CacheDir"

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/commons/disk/StorageException;-><init>(Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public getStorageDir$ibotta_commons_release(Landroid/content/Context;)Ljava/io/File;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public isAvailable()Z
    .locals 2

    .line 10
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    .line 11
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "mounted_ro"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isWriteable()Z
    .locals 3

    .line 16
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 17
    invoke-virtual {p0}, Lcom/ibotta/android/commons/disk/ExternalStorage;->isAvailable()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const-string v1, "mounted_ro"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

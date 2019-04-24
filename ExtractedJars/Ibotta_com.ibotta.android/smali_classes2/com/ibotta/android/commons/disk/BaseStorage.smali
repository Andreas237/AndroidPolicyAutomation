.class public abstract Lcom/ibotta/android/commons/disk/BaseStorage;
.super Ljava/lang/Object;
.source "BaseStorage.kt"

# interfaces
.implements Lcom/ibotta/android/commons/disk/Storage;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStorage.kt\ncom/ibotta/android/commons/disk/BaseStorage\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,75:1\n10720#2,2:76\n*E\n*S KotlinDebug\n*F\n+ 1 BaseStorage.kt\ncom/ibotta/android/commons/disk/BaseStorage\n*L\n47#1,2:76\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0015\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH \u00a2\u0006\u0002\u0008\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH \u00a2\u0006\u0002\u0008\u0011J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0004J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/ibotta/android/commons/disk/BaseStorage;",
        "Lcom/ibotta/android/commons/disk/Storage;",
        "()V",
        "deleteContent",
        "",
        "dir",
        "Ljava/io/File;",
        "quiet",
        "",
        "deleteDir",
        "deleteFile",
        "file",
        "getCacheDir",
        "context",
        "Landroid/content/Context;",
        "getCacheDir$ibotta_commons_release",
        "getStorageDir",
        "getStorageDir$ibotta_commons_release",
        "makeCacheDir",
        "dirName",
        "",
        "makeDir",
        "parentDir",
        "makeStorageDir",
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

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public deleteContent(Ljava/io/File;Z)V
    .locals 8
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 76
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    aget-object v2, p1, v1

    const-string v3, "file"

    .line 48
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 49
    invoke-virtual {p0, v2, p2}, Lcom/ibotta/android/commons/disk/BaseStorage;->deleteDir(Ljava/io/File;Z)V

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    .line 51
    invoke-static {v2}, Lorg/apache/commons/io/FileUtils;->deleteQuietly(Ljava/io/File;)Z

    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 53
    :cond_2
    new-instance p1, Lcom/ibotta/android/commons/disk/StorageException;

    sget-object v3, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;->FAILED_DELETE:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to delete file: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lcom/ibotta/android/commons/disk/StorageException;-><init>(Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :cond_3
    return-void
.end method

.method public deleteDir(Ljava/io/File;Z)V
    .locals 4
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 26
    invoke-static {p1}, Lorg/apache/commons/io/FileUtils;->deleteQuietly(Ljava/io/File;)Z

    goto :goto_0

    .line 29
    :cond_0
    :try_start_0
    invoke-static {p1}, Lorg/apache/commons/io/FileUtils;->deleteDirectory(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception p2

    .line 31
    new-instance v0, Lcom/ibotta/android/commons/disk/StorageException;

    sget-object v1, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;->FAILED_DELETE:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to delete: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    check-cast p2, Ljava/lang/Throwable;

    invoke-direct {v0, v1, p1, p2}, Lcom/ibotta/android/commons/disk/StorageException;-><init>(Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public deleteFile(Ljava/io/File;Z)V
    .locals 6
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 39
    invoke-static {p1}, Lorg/apache/commons/io/FileUtils;->deleteQuietly(Ljava/io/File;)Z

    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p2

    if-eqz p2, :cond_1

    :goto_0
    return-void

    .line 41
    :cond_1
    new-instance p2, Lcom/ibotta/android/commons/disk/StorageException;

    sget-object v1, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;->FAILED_DELETE:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to delete file: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/commons/disk/StorageException;-><init>(Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2
.end method

.method public abstract getCacheDir$ibotta_commons_release(Landroid/content/Context;)Ljava/io/File;
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getStorageDir$ibotta_commons_release(Landroid/content/Context;)Ljava/io/File;
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public makeCacheDir(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
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

    const-string v0, "dirName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0, p1}, Lcom/ibotta/android/commons/disk/BaseStorage;->getCacheDir$ibotta_commons_release(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/commons/disk/BaseStorage;->makeDir(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method protected final makeDir(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 7
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
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

    const-string v0, "parentDir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dirName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-virtual {p0}, Lcom/ibotta/android/commons/disk/BaseStorage;->isWriteable()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 64
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 66
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_1

    .line 67
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 69
    :cond_0
    new-instance p1, Lcom/ibotta/android/commons/disk/StorageException;

    sget-object v2, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;->FAILED_CREATE:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to create directory: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/commons/disk/StorageException;-><init>(Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :cond_1
    :goto_0
    return-object v0

    .line 61
    :cond_2
    new-instance p1, Lcom/ibotta/android/commons/disk/StorageException;

    sget-object v1, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;->NOT_WRITABLE:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "External storage is not currently writeable."

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/commons/disk/StorageException;-><init>(Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public makeStorageDir(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
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

    const-string v0, "dirName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0, p1}, Lcom/ibotta/android/commons/disk/BaseStorage;->getStorageDir$ibotta_commons_release(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/commons/disk/BaseStorage;->makeDir(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

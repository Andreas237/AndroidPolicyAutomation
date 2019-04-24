.class public final Lcom/ibotta/android/commons/disk/StorageSilo;
.super Ljava/lang/Object;
.source "StorageSilo.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStorageSilo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageSilo.kt\ncom/ibotta/android/commons/disk/StorageSilo\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,63:1\n3260#2:64\n3677#2,2:65\n*E\n*S KotlinDebug\n*F\n+ 1 StorageSilo.kt\ncom/ibotta/android/commons/disk/StorageSilo\n*L\n61#1:64\n61#1,2:65\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB!\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0005J\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001cR\u000e\u0010\t\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/ibotta/android/commons/disk/StorageSilo;",
        "",
        "context",
        "Landroid/content/Context;",
        "siloName",
        "",
        "siloType",
        "Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;",
        "(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;)V",
        "TAG",
        "listRegEx",
        "getListRegEx",
        "()Ljava/lang/String;",
        "setListRegEx",
        "(Ljava/lang/String;)V",
        "siloDir",
        "Ljava/io/File;",
        "storage",
        "Lcom/ibotta/android/commons/disk/Storage;",
        "clean",
        "",
        "quiet",
        "",
        "delete",
        "deleteFile",
        "file",
        "name",
        "listFiles",
        "",
        "SiloType",
        "ibotta-commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;

.field private listRegEx:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private siloDir:Ljava/io/File;

.field private storage:Lcom/ibotta/android/commons/disk/Storage;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6
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

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/commons/disk/StorageSilo;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "siloName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "siloType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "StorageSilo"

    .line 17
    iput-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->TAG:Ljava/lang/String;

    const-string v0, ".*"

    .line 20
    iput-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->listRegEx:Ljava/lang/String;

    .line 25
    sget-object v0, Lcom/ibotta/android/commons/disk/StorageSilo$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p3}, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 40
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 39
    :pswitch_0
    new-instance v0, Lcom/ibotta/android/commons/disk/ExternalStorage;

    invoke-direct {v0}, Lcom/ibotta/android/commons/disk/ExternalStorage;-><init>()V

    check-cast v0, Lcom/ibotta/android/commons/disk/Storage;

    iput-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->storage:Lcom/ibotta/android/commons/disk/Storage;

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->storage:Lcom/ibotta/android/commons/disk/Storage;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/commons/disk/Storage;->makeStorageDir(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->siloDir:Ljava/io/File;

    goto :goto_0

    .line 35
    :pswitch_1
    new-instance v0, Lcom/ibotta/android/commons/disk/ExternalStorage;

    invoke-direct {v0}, Lcom/ibotta/android/commons/disk/ExternalStorage;-><init>()V

    check-cast v0, Lcom/ibotta/android/commons/disk/Storage;

    iput-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->storage:Lcom/ibotta/android/commons/disk/Storage;

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->storage:Lcom/ibotta/android/commons/disk/Storage;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/commons/disk/Storage;->makeCacheDir(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->siloDir:Ljava/io/File;

    goto :goto_0

    .line 31
    :pswitch_2
    new-instance v0, Lcom/ibotta/android/commons/disk/InternalStorage;

    invoke-direct {v0}, Lcom/ibotta/android/commons/disk/InternalStorage;-><init>()V

    check-cast v0, Lcom/ibotta/android/commons/disk/Storage;

    iput-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->storage:Lcom/ibotta/android/commons/disk/Storage;

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->storage:Lcom/ibotta/android/commons/disk/Storage;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/commons/disk/Storage;->makeStorageDir(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->siloDir:Ljava/io/File;

    goto :goto_0

    .line 27
    :pswitch_3
    new-instance v0, Lcom/ibotta/android/commons/disk/InternalStorage;

    invoke-direct {v0}, Lcom/ibotta/android/commons/disk/InternalStorage;-><init>()V

    check-cast v0, Lcom/ibotta/android/commons/disk/Storage;

    iput-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->storage:Lcom/ibotta/android/commons/disk/Storage;

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->storage:Lcom/ibotta/android/commons/disk/Storage;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/commons/disk/Storage;->makeCacheDir(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->siloDir:Ljava/io/File;

    .line 44
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "siloName= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", type= "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", path="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->siloDir:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 14
    sget-object p3, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->EXTERNAL_CACHE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/commons/disk/StorageSilo;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;)V

    return-void
.end method


# virtual methods
.method public final clean(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->storage:Lcom/ibotta/android/commons/disk/Storage;

    iget-object v1, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->siloDir:Ljava/io/File;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/commons/disk/Storage;->deleteContent(Ljava/io/File;Z)V

    return-void
.end method

.method public final delete(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->storage:Lcom/ibotta/android/commons/disk/Storage;

    iget-object v1, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->siloDir:Ljava/io/File;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/commons/disk/Storage;->deleteDir(Ljava/io/File;Z)V

    return-void
.end method

.method public final deleteFile(Ljava/io/File;Z)V
    .locals 1
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

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->storage:Lcom/ibotta/android/commons/disk/Storage;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/commons/disk/Storage;->deleteFile(Ljava/io/File;Z)V

    return-void
.end method

.method public final file(Ljava/lang/String;)Ljava/io/File;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->siloDir:Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getListRegEx()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->listRegEx:Ljava/lang/String;

    return-object v0
.end method

.method public final listFiles()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 59
    new-instance v0, Lorg/apache/commons/io/filefilter/RegexFileFilter;

    iget-object v1, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->listRegEx:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/apache/commons/io/filefilter/RegexFileFilter;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/io/FileFilter;

    .line 60
    iget-object v1, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->siloDir:Ljava/io/File;

    invoke-virtual {v1, v0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v0

    const-string v1, "files"

    .line 61
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 65
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    const-string v5, "it"

    .line 61
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_0

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 66
    :cond_1
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method public final setListRegEx(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/commons/disk/StorageSilo;->listRegEx:Ljava/lang/String;

    return-void
.end method

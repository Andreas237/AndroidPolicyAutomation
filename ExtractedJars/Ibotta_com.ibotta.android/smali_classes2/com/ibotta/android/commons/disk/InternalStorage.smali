.class public final Lcom/ibotta/android/commons/disk/InternalStorage;
.super Lcom/ibotta/android/commons/disk/BaseStorage;
.source "InternalStorage.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001d\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\u00080\u00082\u0006\u0010\n\u001a\u00020\u000bH\u0010\u00a2\u0006\u0002\u0008\u000cJ\u001d\u0010\r\u001a\n \t*\u0004\u0018\u00010\u00080\u00082\u0006\u0010\n\u001a\u00020\u000bH\u0010\u00a2\u0006\u0002\u0008\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0005\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ibotta/android/commons/disk/InternalStorage;",
        "Lcom/ibotta/android/commons/disk/BaseStorage;",
        "()V",
        "isAvailable",
        "",
        "()Z",
        "isWriteable",
        "getCacheDir",
        "Ljava/io/File;",
        "kotlin.jvm.PlatformType",
        "context",
        "Landroid/content/Context;",
        "getCacheDir$ibotta_commons_release",
        "getStorageDir",
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


# instance fields
.field private final isAvailable:Z

.field private final isWriteable:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Lcom/ibotta/android/commons/disk/BaseStorage;-><init>()V

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/ibotta/android/commons/disk/InternalStorage;->isAvailable:Z

    .line 7
    iput-boolean v0, p0, Lcom/ibotta/android/commons/disk/InternalStorage;->isWriteable:Z

    return-void
.end method


# virtual methods
.method public getCacheDir$ibotta_commons_release(Landroid/content/Context;)Ljava/io/File;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public getStorageDir$ibotta_commons_release(Landroid/content/Context;)Ljava/io/File;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public isAvailable()Z
    .locals 1

    .line 6
    iget-boolean v0, p0, Lcom/ibotta/android/commons/disk/InternalStorage;->isAvailable:Z

    return v0
.end method

.method public isWriteable()Z
    .locals 1

    .line 7
    iget-boolean v0, p0, Lcom/ibotta/android/commons/disk/InternalStorage;->isWriteable:Z

    return v0
.end method

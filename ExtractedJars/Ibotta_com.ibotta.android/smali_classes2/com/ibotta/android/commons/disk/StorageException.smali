.class public final Lcom/ibotta/android/commons/disk/StorageException;
.super Ljava/lang/Exception;
.source "StorageException.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u000eB%\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ibotta/android/commons/disk/StorageException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "storageIssue",
        "Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;",
        "detailMessage",
        "",
        "throwable",
        "",
        "(Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;Ljava/lang/String;Ljava/lang/Throwable;)V",
        "getStorageIssue",
        "()Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;",
        "setStorageIssue",
        "(Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;)V",
        "StorageIssue",
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
.field private storageIssue:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "detailMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0, p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p1, p0, Lcom/ibotta/android/commons/disk/StorageException;->storageIssue:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    .line 6
    move-object p1, v0

    check-cast p1, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 8
    move-object p3, v0

    check-cast p3, Ljava/lang/Throwable;

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/commons/disk/StorageException;-><init>(Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final getStorageIssue()Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/ibotta/android/commons/disk/StorageException;->storageIssue:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    return-object v0
.end method

.method public final setStorageIssue(Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 6
    iput-object p1, p0, Lcom/ibotta/android/commons/disk/StorageException;->storageIssue:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    return-void
.end method

.class public final Lio/streamroot/dna/core/binary/BinaryDataInteractor;
.super Ljava/lang/Object;
.source "BinaryDataInteractor.kt"

# interfaces
.implements Lio/streamroot/dna/core/js/PanamaInteractor;


# annotations
.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0008H\u0007J \u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0008\u0010\u0012\u001a\u00020\u0008H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/streamroot/dna/core/binary/BinaryDataInteractor;",
        "Lio/streamroot/dna/core/js/PanamaInteractor;",
        "binaryDataStore",
        "Lio/streamroot/dna/core/binary/store/BinaryDataStore;",
        "errorAggregator",
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "(Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lio/streamroot/dna/core/error/ErrorAggregator;)V",
        "allocate",
        "",
        "size",
        "",
        "clearBinaryData",
        "",
        "binaryDataId",
        "mergeBinaryData",
        "binaryDataIdSrc",
        "binaryDataIdDest",
        "offset",
        "name",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

.field private final errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lio/streamroot/dna/core/error/ErrorAggregator;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/binary/store/BinaryDataStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/error/ErrorAggregator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binaryDataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorAggregator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/BinaryDataInteractor;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    iput-object p2, p0, Lio/streamroot/dna/core/binary/BinaryDataInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    return-void
.end method


# virtual methods
.method public final allocate(I)Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 19
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/binary/BinaryDataInteractor;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->allocate(I)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 21
    iget-object v0, p0, Lio/streamroot/dna/core/binary/BinaryDataInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    const-string p1, "-1"

    :goto_0
    return-object p1
.end method

.method public final clearBinaryData(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "binaryDataId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/binary/BinaryDataInteractor;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->recycle(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 40
    iget-object v0, p0, Lio/streamroot/dna/core/binary/BinaryDataInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final mergeBinaryData(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "binaryDataIdSrc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binaryDataIdDest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/binary/BinaryDataInteractor;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    invoke-virtual {v0, p1, p2, p3}, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->merge(Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 31
    iget-object p2, p0, Lio/streamroot/dna/core/binary/BinaryDataInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "SegmentInteractor"

    return-object v0
.end method

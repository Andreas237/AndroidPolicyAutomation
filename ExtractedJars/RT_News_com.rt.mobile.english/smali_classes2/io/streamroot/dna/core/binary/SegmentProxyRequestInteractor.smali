.class public final Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;
.super Ljava/lang/Object;
.source "SegmentProxyRequestInteractor.kt"

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
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0007J0\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;",
        "Lio/streamroot/dna/core/js/PanamaInteractor;",
        "binaryDataStore",
        "Lio/streamroot/dna/core/binary/store/BinaryDataStore;",
        "segmentCallBackStore",
        "Lio/streamroot/dna/core/binary/SegmentCallBackStore;",
        "errorAggregator",
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "(Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lio/streamroot/dna/core/binary/SegmentCallBackStore;Lio/streamroot/dna/core/error/ErrorAggregator;)V",
        "transferListener",
        "Lio/streamroot/dna/core/http/bandwidth/TransferListener;",
        "getTransferListener",
        "()Lio/streamroot/dna/core/http/bandwidth/TransferListener;",
        "setTransferListener",
        "(Lio/streamroot/dna/core/http/bandwidth/TransferListener;)V",
        "name",
        "",
        "onFailure",
        "",
        "proxyRequestId",
        "reason",
        "onSucceed",
        "binaryDataId",
        "recyclable",
        "",
        "totalDurationMs",
        "",
        "totalBytesTransferred",
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

.field private final segmentCallBackStore:Lio/streamroot/dna/core/binary/SegmentCallBackStore;

.field private transferListener:Lio/streamroot/dna/core/http/bandwidth/TransferListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lio/streamroot/dna/core/binary/SegmentCallBackStore;Lio/streamroot/dna/core/error/ErrorAggregator;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/binary/store/BinaryDataStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/binary/SegmentCallBackStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/error/ErrorAggregator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binaryDataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentCallBackStore"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorAggregator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    iput-object p2, p0, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->segmentCallBackStore:Lio/streamroot/dna/core/binary/SegmentCallBackStore;

    iput-object p3, p0, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    return-void
.end method


# virtual methods
.method public final getTransferListener()Lio/streamroot/dna/core/http/bandwidth/TransferListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 16
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->transferListener:Lio/streamroot/dna/core/http/bandwidth/TransferListener;

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "SegmentProxyRequestInteractor"

    return-object v0
.end method

.method public final onFailure(Ljava/lang/String;Ljava/lang/String;)V
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

    const-string v0, "proxyRequestId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reason"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->segmentCallBackStore:Lio/streamroot/dna/core/binary/SegmentCallBackStore;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/binary/SegmentCallBackStore;->getAndRemove(Ljava/lang/String;)Landroid/webkit/ValueCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 45
    invoke-interface {p1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 46
    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/error/ErrorAggregator;->jsError(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 48
    iget-object p2, p0, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final onSucceed(Ljava/lang/String;Ljava/lang/String;ZJJ)V
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

    const-string v0, "proxyRequestId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binaryDataId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_0

    .line 29
    :try_start_0
    iget-object p3, p0, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    invoke-virtual {p3, p2}, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->get(Ljava/lang/String;)Lio/streamroot/dna/core/binary/store/BinaryData;

    move-result-object p2

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p3, p0, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    invoke-virtual {p3, p2}, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->getAndRemove(Ljava/lang/String;)Lio/streamroot/dna/core/binary/store/BinaryData;

    move-result-object p2

    .line 31
    :goto_0
    iget-object p3, p0, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->segmentCallBackStore:Lio/streamroot/dna/core/binary/SegmentCallBackStore;

    invoke-virtual {p3, p1}, Lio/streamroot/dna/core/binary/SegmentCallBackStore;->getAndRemove(Ljava/lang/String;)Landroid/webkit/ValueCallback;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 32
    invoke-interface {p1, p2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 35
    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->transferListener:Lio/streamroot/dna/core/http/bandwidth/TransferListener;

    if-eqz p1, :cond_2

    invoke-interface {p1, p6, p7, p4, p5}, Lio/streamroot/dna/core/http/bandwidth/TransferListener;->onTransferEnd(JJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 37
    :goto_1
    iget-object p2, p0, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :cond_2
    :goto_2
    return-void
.end method

.method public final setTransferListener(Lio/streamroot/dna/core/http/bandwidth/TransferListener;)V
    .locals 0
    .param p1    # Lio/streamroot/dna/core/http/bandwidth/TransferListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 16
    iput-object p1, p0, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->transferListener:Lio/streamroot/dna/core/http/bandwidth/TransferListener;

    return-void
.end method

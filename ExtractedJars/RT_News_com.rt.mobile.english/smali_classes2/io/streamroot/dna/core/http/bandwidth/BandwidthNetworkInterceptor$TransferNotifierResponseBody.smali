.class final Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;
.super Lokhttp3/ResponseBody;
.source "BandwidthNetworkInterceptor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "TransferNotifierResponseBody"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0008\u0010\u0008\u001a\u00020\u0006H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\u000b\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;",
        "Lokhttp3/ResponseBody;",
        "responseBody",
        "transferListener",
        "Lio/streamroot/dna/core/http/bandwidth/TransferListener;",
        "startTime",
        "",
        "(Lokhttp3/ResponseBody;Lio/streamroot/dna/core/http/bandwidth/TransferListener;J)V",
        "contentLength",
        "contentType",
        "Lokhttp3/MediaType;",
        "source",
        "Lokio/BufferedSource;",
        "Lokio/Source;",
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
.field private final responseBody:Lokhttp3/ResponseBody;

.field private final startTime:J

.field private final transferListener:Lio/streamroot/dna/core/http/bandwidth/TransferListener;


# direct methods
.method public constructor <init>(Lokhttp3/ResponseBody;Lio/streamroot/dna/core/http/bandwidth/TransferListener;J)V
    .locals 1
    .param p1    # Lokhttp3/ResponseBody;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/http/bandwidth/TransferListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "responseBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transferListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->responseBody:Lokhttp3/ResponseBody;

    iput-object p2, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->transferListener:Lio/streamroot/dna/core/http/bandwidth/TransferListener;

    iput-wide p3, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->startTime:J

    return-void
.end method

.method public static final synthetic access$getResponseBody$p(Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;)Lokhttp3/ResponseBody;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 40
    iget-object p0, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->responseBody:Lokhttp3/ResponseBody;

    return-object p0
.end method

.method public static final synthetic access$getStartTime$p(Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;)J
    .locals 2

    .line 40
    iget-wide v0, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->startTime:J

    return-wide v0
.end method

.method public static final synthetic access$getTransferListener$p(Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;)Lio/streamroot/dna/core/http/bandwidth/TransferListener;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 40
    iget-object p0, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->transferListener:Lio/streamroot/dna/core/http/bandwidth/TransferListener;

    return-object p0
.end method

.method private final source(Lokio/Source;)Lokio/Source;
    .locals 1

    .line 59
    new-instance v0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody$source$1;

    invoke-direct {v0, p0, p1, p1}, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody$source$1;-><init>(Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;Lokio/Source;Lokio/Source;)V

    check-cast v0, Lokio/Source;

    return-object v0
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 51
    iget-object v0, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->responseBody:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 47
    iget-object v0, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->responseBody:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 55
    iget-object v0, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->responseBody:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    const-string v1, "responseBody.source()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lokio/Source;

    invoke-direct {p0, v0}, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->source(Lokio/Source;)Lokio/Source;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    const-string v1, "Okio.buffer(source(responseBody.source()))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

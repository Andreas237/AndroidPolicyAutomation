.class public final Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;
.super Ljava/lang/Object;
.source "ManifestProcessor.kt"

# interfaces
.implements Lio/streamroot/dna/core/stream/hls/ManifestProcessor;
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;",
        "Lio/streamroot/dna/core/stream/hls/ManifestProcessor;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "absoluteUrlLineProcessor",
        "Lio/streamroot/dna/core/stream/hls/LineProcessor;",
        "customPlaylistHeaderLoader",
        "Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;",
        "(Lio/streamroot/dna/core/stream/hls/LineProcessor;Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;)V",
        "isLive",
        "",
        "lazyInit",
        "appendStatsAnalytics",
        "",
        "statsPayload",
        "Lorg/json/JSONObject;",
        "appendTrafficAnalytics",
        "trafficPayload",
        "processManifest",
        "",
        "manifest",
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
.field private final absoluteUrlLineProcessor:Lio/streamroot/dna/core/stream/hls/LineProcessor;

.field private final customPlaylistHeaderLoader:Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;

.field private isLive:Z

.field private lazyInit:Z


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/stream/hls/LineProcessor;Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/stream/hls/LineProcessor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "absoluteUrlLineProcessor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;->absoluteUrlLineProcessor:Lio/streamroot/dna/core/stream/hls/LineProcessor;

    iput-object p2, p0, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;->customPlaylistHeaderLoader:Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;

    const/4 p1, 0x1

    .line 54
    iput-boolean p1, p0, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;->isLive:Z

    return-void
.end method

.method public synthetic constructor <init>(Lio/streamroot/dna/core/stream/hls/LineProcessor;Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 51
    check-cast p2, Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;

    :cond_0
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;-><init>(Lio/streamroot/dna/core/stream/hls/LineProcessor;Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;)V

    return-void
.end method


# virtual methods
.method public appendControlAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controlPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendControlAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendStatsAnalytics(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "statsPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "live"

    .line 90
    iget-boolean v1, p0, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;->isLive:Z

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    return-void
.end method

.method public appendSupportAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "supportPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendSupportAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendTrafficAnalytics(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "trafficPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "live"

    .line 86
    iget-boolean v1, p0, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;->isLive:Z

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    return-void
.end method

.method public priority()I
    .locals 1

    .line 49
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method

.method public processManifest(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "manifest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    iget-boolean v0, p0, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;->lazyInit:Z

    if-nez v0, :cond_0

    .line 58
    invoke-static {p1}, Lio/streamroot/dna/core/stream/hls/ParsingsKt;->isLiveManifest(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;->isLive:Z

    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p0, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;->lazyInit:Z

    .line 62
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 63
    iget-boolean v1, p0, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;->isLive:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;->customPlaylistHeaderLoader:Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;->customPlaylistHeaderLoader:Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;

    invoke-virtual {v1, p1, v0}, Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;->processHeaderLines(Ljava/lang/String;Ljava/lang/StringBuilder;)I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    move v2, v1

    .line 65
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_3

    .line 67
    invoke-static {p1, v1}, Lio/streamroot/dna/core/stream/hls/ParsingsKt;->httpOrHttps(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 68
    invoke-static {p1, v0, v2, v1}, Lio/streamroot/dna/core/utils/StringExtensionKt;->copyInto(Ljava/lang/String;Ljava/lang/StringBuilder;II)V

    .line 70
    iget-object v2, p0, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;->absoluteUrlLineProcessor:Lio/streamroot/dna/core/stream/hls/LineProcessor;

    invoke-interface {v2, v0, p1, v1}, Lio/streamroot/dna/core/stream/hls/LineProcessor;->processLine(Ljava/lang/StringBuilder;Ljava/lang/String;I)I

    move-result v1

    goto :goto_0

    .line 73
    :cond_2
    invoke-static {p1, v1}, Lio/streamroot/dna/core/utils/StringExtensionKt;->startIndexOfNextLine(Ljava/lang/String;I)I

    move-result v1

    goto :goto_1

    :cond_3
    if-nez v2, :cond_4

    .line 77
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v1, v3, :cond_4

    return-object p1

    .line 80
    :cond_4
    invoke-static {p1, v0, v2, v1}, Lio/streamroot/dna/core/utils/StringExtensionKt;->copyInto(Ljava/lang/String;Ljava/lang/StringBuilder;II)V

    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "manifestBuilder.toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

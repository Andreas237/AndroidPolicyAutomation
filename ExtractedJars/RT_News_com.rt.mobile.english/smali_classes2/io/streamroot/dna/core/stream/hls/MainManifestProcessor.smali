.class public final Lio/streamroot/dna/core/stream/hls/MainManifestProcessor;
.super Ljava/lang/Object;
.source "ManifestProcessor.kt"

# interfaces
.implements Lio/streamroot/dna/core/stream/hls/ManifestProcessor;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lio/streamroot/dna/core/stream/hls/MainManifestProcessor;",
        "Lio/streamroot/dna/core/stream/hls/ManifestProcessor;",
        "absoluteUrlLineProcessor",
        "Lio/streamroot/dna/core/stream/hls/LineProcessor;",
        "ignoreLineProcessor",
        "(Lio/streamroot/dna/core/stream/hls/LineProcessor;Lio/streamroot/dna/core/stream/hls/LineProcessor;)V",
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

.field private final ignoreLineProcessor:Lio/streamroot/dna/core/stream/hls/LineProcessor;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/stream/hls/LineProcessor;Lio/streamroot/dna/core/stream/hls/LineProcessor;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/stream/hls/LineProcessor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/stream/hls/LineProcessor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "absoluteUrlLineProcessor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ignoreLineProcessor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/stream/hls/MainManifestProcessor;->absoluteUrlLineProcessor:Lio/streamroot/dna/core/stream/hls/LineProcessor;

    iput-object p2, p0, Lio/streamroot/dna/core/stream/hls/MainManifestProcessor;->ignoreLineProcessor:Lio/streamroot/dna/core/stream/hls/LineProcessor;

    return-void
.end method


# virtual methods
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

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    move v2, v1

    .line 20
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 22
    invoke-static {p1, v1}, Lio/streamroot/dna/core/stream/hls/ParsingsKt;->httpOrHttps(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 23
    invoke-static {p1, v0, v2, v1}, Lio/streamroot/dna/core/utils/StringExtensionKt;->copyInto(Ljava/lang/String;Ljava/lang/StringBuilder;II)V

    .line 25
    iget-object v2, p0, Lio/streamroot/dna/core/stream/hls/MainManifestProcessor;->absoluteUrlLineProcessor:Lio/streamroot/dna/core/stream/hls/LineProcessor;

    invoke-interface {v2, v0, p1, v1}, Lio/streamroot/dna/core/stream/hls/LineProcessor;->processLine(Ljava/lang/StringBuilder;Ljava/lang/String;I)I

    move-result v1

    goto :goto_0

    .line 28
    :cond_0
    invoke-static {p1, v1}, Lio/streamroot/dna/core/stream/hls/ParsingsKt;->isLatencyTagAtPosition(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 29
    invoke-static {p1, v0, v2, v1}, Lio/streamroot/dna/core/utils/StringExtensionKt;->copyInto(Ljava/lang/String;Ljava/lang/StringBuilder;II)V

    .line 31
    iget-object v2, p0, Lio/streamroot/dna/core/stream/hls/MainManifestProcessor;->ignoreLineProcessor:Lio/streamroot/dna/core/stream/hls/LineProcessor;

    invoke-interface {v2, v0, p1, v1}, Lio/streamroot/dna/core/stream/hls/LineProcessor;->processLine(Ljava/lang/StringBuilder;Ljava/lang/String;I)I

    move-result v1

    goto :goto_0

    .line 35
    :cond_1
    invoke-static {p1, v1}, Lio/streamroot/dna/core/utils/StringExtensionKt;->startIndexOfNextLine(Ljava/lang/String;I)I

    move-result v1

    goto :goto_1

    :cond_2
    if-nez v2, :cond_3

    .line 40
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v1, v3, :cond_3

    return-object p1

    .line 43
    :cond_3
    invoke-static {p1, v0, v2, v1}, Lio/streamroot/dna/core/utils/StringExtensionKt;->copyInto(Ljava/lang/String;Ljava/lang/StringBuilder;II)V

    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "manifestBuilder.toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

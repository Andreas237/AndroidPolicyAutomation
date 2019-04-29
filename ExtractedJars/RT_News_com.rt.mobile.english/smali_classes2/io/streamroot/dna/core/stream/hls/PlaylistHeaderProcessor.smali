.class public final Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;
.super Ljava/lang/Object;
.source "ManifestHeaderProcessor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00082\n\u0010\u000b\u001a\u00060\u000cj\u0002`\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;",
        "",
        "ignoreLineProcessor",
        "Lio/streamroot/dna/core/stream/hls/LineProcessor;",
        "latency",
        "",
        "(Lio/streamroot/dna/core/stream/hls/LineProcessor;I)V",
        "latencyTag",
        "",
        "processHeaderLines",
        "manifest",
        "manifestBuilder",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
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
.field private final ignoreLineProcessor:Lio/streamroot/dna/core/stream/hls/LineProcessor;

.field private final latencyTag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/stream/hls/LineProcessor;I)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/stream/hls/LineProcessor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "ignoreLineProcessor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;->ignoreLineProcessor:Lio/streamroot/dna/core/stream/hls/LineProcessor;

    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "#EXT-X-START:TIME-OFFSET=-"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0xa

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;->latencyTag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final processHeaderLines(Ljava/lang/String;Ljava/lang/StringBuilder;)I
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/StringBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "manifest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manifestBuilder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    move v1, v0

    .line 15
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-static {p1, v0}, Lio/streamroot/dna/core/stream/hls/ParsingsKt;->isSegmentTagAtPosition(Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_1

    .line 16
    invoke-static {p1, v0}, Lio/streamroot/dna/core/stream/hls/ParsingsKt;->isLatencyTagAtPosition(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 17
    invoke-static {p1, p2, v1, v0}, Lio/streamroot/dna/core/utils/StringExtensionKt;->copyInto(Ljava/lang/String;Ljava/lang/StringBuilder;II)V

    .line 19
    iget-object v1, p0, Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;->ignoreLineProcessor:Lio/streamroot/dna/core/stream/hls/LineProcessor;

    invoke-interface {v1, p2, p1, v0}, Lio/streamroot/dna/core/stream/hls/LineProcessor;->processLine(Ljava/lang/StringBuilder;Ljava/lang/String;I)I

    move-result v0

    goto :goto_0

    .line 22
    :cond_0
    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/StringExtensionKt;->startIndexOfNextLine(Ljava/lang/String;I)I

    move-result v0

    goto :goto_1

    .line 26
    :cond_1
    invoke-static {p1, p2, v1, v0}, Lio/streamroot/dna/core/utils/StringExtensionKt;->copyInto(Ljava/lang/String;Ljava/lang/StringBuilder;II)V

    .line 28
    iget-object p1, p0, Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;->latencyTag:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v0
.end method

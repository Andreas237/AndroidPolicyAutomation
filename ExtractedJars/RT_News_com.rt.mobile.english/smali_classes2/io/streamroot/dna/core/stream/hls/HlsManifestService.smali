.class public final Lio/streamroot/dna/core/stream/hls/HlsManifestService;
.super Ljava/lang/Object;
.source "HlsManifestService.kt"

# interfaces
.implements Lio/streamroot/dna/core/stream/ManifestService;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
    disposable = false
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000cH\u0016J\u0018\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000cH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/streamroot/dna/core/stream/hls/HlsManifestService;",
        "Lio/streamroot/dna/core/stream/ManifestService;",
        "Ljava/lang/AutoCloseable;",
        "manifestHandler",
        "Lio/streamroot/dna/core/stream/ManifestHandler;",
        "mainManifestProcessor",
        "Lio/streamroot/dna/core/stream/hls/ManifestProcessor;",
        "playlistManifestProcessor",
        "(Lio/streamroot/dna/core/stream/ManifestHandler;Lio/streamroot/dna/core/stream/hls/ManifestProcessor;Lio/streamroot/dna/core/stream/hls/ManifestProcessor;)V",
        "close",
        "",
        "loadMainManifest",
        "",
        "manifestUrl",
        "Lokhttp3/HttpUrl;",
        "manifestContent",
        "loadPlaylistManifest",
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
.field private final mainManifestProcessor:Lio/streamroot/dna/core/stream/hls/ManifestProcessor;

.field private manifestHandler:Lio/streamroot/dna/core/stream/ManifestHandler;

.field private final playlistManifestProcessor:Lio/streamroot/dna/core/stream/hls/ManifestProcessor;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/stream/ManifestHandler;Lio/streamroot/dna/core/stream/hls/ManifestProcessor;Lio/streamroot/dna/core/stream/hls/ManifestProcessor;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/stream/ManifestHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/stream/hls/ManifestProcessor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/stream/hls/ManifestProcessor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "mainManifestProcessor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "playlistManifestProcessor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/stream/hls/HlsManifestService;->manifestHandler:Lio/streamroot/dna/core/stream/ManifestHandler;

    iput-object p2, p0, Lio/streamroot/dna/core/stream/hls/HlsManifestService;->mainManifestProcessor:Lio/streamroot/dna/core/stream/hls/ManifestProcessor;

    iput-object p3, p0, Lio/streamroot/dna/core/stream/hls/HlsManifestService;->playlistManifestProcessor:Lio/streamroot/dna/core/stream/hls/ManifestProcessor;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x0

    .line 28
    check-cast v0, Lio/streamroot/dna/core/stream/ManifestHandler;

    iput-object v0, p0, Lio/streamroot/dna/core/stream/hls/HlsManifestService;->manifestHandler:Lio/streamroot/dna/core/stream/ManifestHandler;

    return-void
.end method

.method public loadMainManifest(Lokhttp3/HttpUrl;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "manifestUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manifestContent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lio/streamroot/dna/core/stream/hls/HlsManifestService;->manifestHandler:Lio/streamroot/dna/core/stream/ManifestHandler;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lio/streamroot/dna/core/stream/ManifestHandler;->updateMainManifest(Lokhttp3/HttpUrl;Ljava/lang/String;)V

    .line 18
    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/stream/hls/HlsManifestService;->mainManifestProcessor:Lio/streamroot/dna/core/stream/hls/ManifestProcessor;

    invoke-interface {p1, p2}, Lio/streamroot/dna/core/stream/hls/ManifestProcessor;->processManifest(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public loadPlaylistManifest(Lokhttp3/HttpUrl;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "manifestUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manifestContent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lio/streamroot/dna/core/stream/hls/HlsManifestService;->manifestHandler:Lio/streamroot/dna/core/stream/ManifestHandler;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lio/streamroot/dna/core/stream/ManifestHandler;->updatePlaylistManifest(Lokhttp3/HttpUrl;Ljava/lang/String;)V

    .line 24
    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/stream/hls/HlsManifestService;->playlistManifestProcessor:Lio/streamroot/dna/core/stream/hls/ManifestProcessor;

    invoke-interface {p1, p2}, Lio/streamroot/dna/core/stream/hls/ManifestProcessor;->processManifest(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

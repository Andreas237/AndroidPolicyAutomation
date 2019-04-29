.class public final Lio/streamroot/dna/core/stream/dash/DashManifestService;
.super Ljava/lang/Object;
.source "DashManifestService.kt"

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
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/streamroot/dna/core/stream/dash/DashManifestService;",
        "Lio/streamroot/dna/core/stream/ManifestService;",
        "Ljava/lang/AutoCloseable;",
        "manifestHandler",
        "Lio/streamroot/dna/core/stream/ManifestHandler;",
        "(Lio/streamroot/dna/core/stream/ManifestHandler;)V",
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
.field private manifestHandler:Lio/streamroot/dna/core/stream/ManifestHandler;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/stream/ManifestHandler;)V
    .locals 0
    .param p1    # Lio/streamroot/dna/core/stream/ManifestHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/stream/dash/DashManifestService;->manifestHandler:Lio/streamroot/dna/core/stream/ManifestHandler;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x0

    .line 26
    check-cast v0, Lio/streamroot/dna/core/stream/ManifestHandler;

    iput-object v0, p0, Lio/streamroot/dna/core/stream/dash/DashManifestService;->manifestHandler:Lio/streamroot/dna/core/stream/ManifestHandler;

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

    .line 14
    iget-object v0, p0, Lio/streamroot/dna/core/stream/dash/DashManifestService;->manifestHandler:Lio/streamroot/dna/core/stream/ManifestHandler;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lio/streamroot/dna/core/stream/ManifestHandler;->updateMainManifest(Lokhttp3/HttpUrl;Ljava/lang/String;)V

    :cond_0
    return-object p2
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

    .line 20
    iget-object v0, p0, Lio/streamroot/dna/core/stream/dash/DashManifestService;->manifestHandler:Lio/streamroot/dna/core/stream/ManifestHandler;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lio/streamroot/dna/core/stream/ManifestHandler;->updatePlaylistManifest(Lokhttp3/HttpUrl;Ljava/lang/String;)V

    :cond_0
    return-object p2
.end method

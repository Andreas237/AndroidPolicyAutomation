.class public final Lio/streamroot/dna/core/context/config/StreamFormat$Companion;
.super Ljava/lang/Object;
.source "StreamFormat.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/core/context/config/StreamFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/streamroot/dna/core/context/config/StreamFormat$Companion;",
        "",
        "()V",
        "detect",
        "Lio/streamroot/dna/core/context/config/StreamFormat;",
        "manifestUrl",
        "Lokhttp3/HttpUrl;",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lio/streamroot/dna/core/context/config/StreamFormat$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final detect(Lokhttp3/HttpUrl;)Lio/streamroot/dna/core/context/config/StreamFormat;
    .locals 3
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "manifestUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    sget-object v0, Lio/streamroot/dna/core/context/config/StreamFormat;->HLS:Lio/streamroot/dna/core/context/config/StreamFormat;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/context/config/StreamFormat;->isManifestUrl(Lokhttp3/HttpUrl;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lio/streamroot/dna/core/context/config/StreamFormat;->HLS:Lio/streamroot/dna/core/context/config/StreamFormat;

    goto :goto_0

    .line 30
    :cond_0
    sget-object v0, Lio/streamroot/dna/core/context/config/StreamFormat;->DASH:Lio/streamroot/dna/core/context/config/StreamFormat;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/context/config/StreamFormat;->isManifestUrl(Lokhttp3/HttpUrl;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lio/streamroot/dna/core/context/config/StreamFormat;->DASH:Lio/streamroot/dna/core/context/config/StreamFormat;

    :goto_0
    return-object p1

    .line 31
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported manifest "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

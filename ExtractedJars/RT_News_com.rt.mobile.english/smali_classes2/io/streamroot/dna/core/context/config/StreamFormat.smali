.class public final enum Lio/streamroot/dna/core/context/config/StreamFormat;
.super Ljava/lang/Enum;
.source "StreamFormat.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/context/config/StreamFormat$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/streamroot/dna/core/context/config/StreamFormat;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStreamFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamFormat.kt\nio/streamroot/dna/core/context/config/StreamFormat\n*L\n1#1,35:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0017\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/streamroot/dna/core/context/config/StreamFormat;",
        "",
        "manifestRegex",
        "Lkotlin/text/Regex;",
        "segmentRegex",
        "(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;)V",
        "isManifestUrl",
        "",
        "httpUrl",
        "",
        "Lokhttp3/HttpUrl;",
        "isSegmentUrl",
        "HLS",
        "DASH",
        "Companion",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/streamroot/dna/core/context/config/StreamFormat;

.field public static final Companion:Lio/streamroot/dna/core/context/config/StreamFormat$Companion;

.field public static final enum DASH:Lio/streamroot/dna/core/context/config/StreamFormat;

.field public static final enum HLS:Lio/streamroot/dna/core/context/config/StreamFormat;


# instance fields
.field private final manifestRegex:Lkotlin/text/Regex;

.field private final segmentRegex:Lkotlin/text/Regex;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x2

    new-array v0, v0, [Lio/streamroot/dna/core/context/config/StreamFormat;

    const-string v1, "HLS"

    const-string v2, ".*(\\.m3u8?)$"

    .line 7
    new-instance v3, Lkotlin/text/Regex;

    invoke-direct {v3, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const-string v2, ".*(\\.ts)$"

    new-instance v4, Lkotlin/text/Regex;

    invoke-direct {v4, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    new-instance v2, Lio/streamroot/dna/core/context/config/StreamFormat;

    const/4 v5, 0x0

    invoke-direct {v2, v1, v5, v3, v4}, Lio/streamroot/dna/core/context/config/StreamFormat;-><init>(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;)V

    sput-object v2, Lio/streamroot/dna/core/context/config/StreamFormat;->HLS:Lio/streamroot/dna/core/context/config/StreamFormat;

    aput-object v2, v0, v5

    const-string v1, "DASH"

    const-string v2, ".*(\\.mpd)$"

    .line 8
    new-instance v3, Lkotlin/text/Regex;

    invoke-direct {v3, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const-string v2, ".*(\\.mp4|\\.webm|\\.dash|\\.m4s)$"

    new-instance v4, Lkotlin/text/Regex;

    invoke-direct {v4, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    new-instance v2, Lio/streamroot/dna/core/context/config/StreamFormat;

    const/4 v5, 0x1

    invoke-direct {v2, v1, v5, v3, v4}, Lio/streamroot/dna/core/context/config/StreamFormat;-><init>(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;)V

    sput-object v2, Lio/streamroot/dna/core/context/config/StreamFormat;->DASH:Lio/streamroot/dna/core/context/config/StreamFormat;

    aput-object v2, v0, v5

    sput-object v0, Lio/streamroot/dna/core/context/config/StreamFormat;->$VALUES:[Lio/streamroot/dna/core/context/config/StreamFormat;

    new-instance v0, Lio/streamroot/dna/core/context/config/StreamFormat$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/context/config/StreamFormat$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/context/config/StreamFormat;->Companion:Lio/streamroot/dna/core/context/config/StreamFormat$Companion;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/text/Regex;",
            "Lkotlin/text/Regex;",
            ")V"
        }
    .end annotation

    const-string v0, "manifestRegex"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentRegex"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio/streamroot/dna/core/context/config/StreamFormat;->manifestRegex:Lkotlin/text/Regex;

    iput-object p4, p0, Lio/streamroot/dna/core/context/config/StreamFormat;->segmentRegex:Lkotlin/text/Regex;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/streamroot/dna/core/context/config/StreamFormat;
    .locals 1

    const-class v0, Lio/streamroot/dna/core/context/config/StreamFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/core/context/config/StreamFormat;

    return-object p0
.end method

.method public static values()[Lio/streamroot/dna/core/context/config/StreamFormat;
    .locals 1

    sget-object v0, Lio/streamroot/dna/core/context/config/StreamFormat;->$VALUES:[Lio/streamroot/dna/core/context/config/StreamFormat;

    invoke-virtual {v0}, [Lio/streamroot/dna/core/context/config/StreamFormat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/streamroot/dna/core/context/config/StreamFormat;

    return-object v0
.end method


# virtual methods
.method public final isManifestUrl(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "httpUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lio/streamroot/dna/core/context/config/StreamFormat;->manifestRegex:Lkotlin/text/Regex;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method public final isManifestUrl(Lokhttp3/HttpUrl;)Z
    .locals 1
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "httpUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    move-result-object p1

    const-string v0, "httpUrl.encodedPath()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/context/config/StreamFormat;->isManifestUrl(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final isSegmentUrl(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "httpUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lio/streamroot/dna/core/context/config/StreamFormat;->segmentRegex:Lkotlin/text/Regex;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method public final isSegmentUrl(Lokhttp3/HttpUrl;)Z
    .locals 1
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "httpUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    move-result-object p1

    const-string v0, "httpUrl.encodedPath()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/context/config/StreamFormat;->isSegmentUrl(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

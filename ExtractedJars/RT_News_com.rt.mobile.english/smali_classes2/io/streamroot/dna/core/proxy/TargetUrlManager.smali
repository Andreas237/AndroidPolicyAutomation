.class public final Lio/streamroot/dna/core/proxy/TargetUrlManager;
.super Ljava/lang/Object;
.source "TargetUrlManager.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTargetUrlManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetUrlManager.kt\nio/streamroot/dna/core/proxy/TargetUrlManager\n*L\n1#1,75:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00062\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00062\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/streamroot/dna/core/proxy/TargetUrlManager;",
        "",
        "mainManifestUri",
        "Lokhttp3/HttpUrl;",
        "(Lokhttp3/HttpUrl;)V",
        "lastManifestSeenHost",
        "",
        "lastManifestSeenPort",
        "",
        "lastManifestSeenScheme",
        "originRegex",
        "Lkotlin/text/Regex;",
        "pathTemplate",
        "decodeUrl",
        "s",
        "forgeManifestTargetUrl",
        "path",
        "queries",
        "forgeTargetUrl",
        "isMainManifest",
        "",
        "httpUrl",
        "redirectMainManifestUrl",
        "",
        "finalRequestUrl",
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
.field private lastManifestSeenHost:Ljava/lang/String;

.field private lastManifestSeenPort:I

.field private lastManifestSeenScheme:Ljava/lang/String;

.field private mainManifestUri:Lokhttp3/HttpUrl;

.field private final originRegex:Lkotlin/text/Regex;

.field private pathTemplate:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lokhttp3/HttpUrl;)V
    .locals 1
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "mainManifestUri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->mainManifestUri:Lokhttp3/HttpUrl;

    .line 11
    iget-object p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->mainManifestUri:Lokhttp3/HttpUrl;

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object p1

    const-string v0, "mainManifestUri.scheme()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->lastManifestSeenScheme:Ljava/lang/String;

    .line 12
    iget-object p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->mainManifestUri:Lokhttp3/HttpUrl;

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object p1

    const-string v0, "mainManifestUri.host()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->lastManifestSeenHost:Ljava/lang/String;

    .line 13
    iget-object p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->mainManifestUri:Lokhttp3/HttpUrl;

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->port()I

    move-result p1

    iput p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->lastManifestSeenPort:I

    .line 14
    new-instance p1, Lkotlin/text/Regex;

    const-string v0, "dnaOrigin=([^&]*)"

    invoke-direct {p1, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->originRegex:Lkotlin/text/Regex;

    return-void
.end method

.method private final decodeUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "UTF-8"

    .line 74
    invoke-static {p1, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "URLDecoder.decode(s, \"UTF-8\")"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final forgeManifestTargetUrl(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/proxy/TargetUrlManager;->forgeTargetUrl(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object p1

    .line 67
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object p2

    const-string v0, "targetUrl.scheme()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->lastManifestSeenScheme:Ljava/lang/String;

    .line 68
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object p2

    const-string v0, "targetUrl.host()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->lastManifestSeenHost:Ljava/lang/String;

    .line 69
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->port()I

    move-result p2

    iput p2, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->lastManifestSeenPort:I

    return-object p1
.end method

.method public final forgeTargetUrl(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl;
    .locals 13
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, ""

    .line 34
    :goto_0
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->originRegex:Lkotlin/text/Regex;

    move-object v8, p2

    check-cast v8, Ljava/lang/CharSequence;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v9, 0x0

    invoke-static {v0, v8, v9, v1, v2}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v10

    const/4 v11, 0x1

    if-eqz v10, :cond_1

    .line 35
    invoke-interface {v10}, Lkotlin/text/MatchResult;->getGroups()Lkotlin/text/MatchGroupCollection;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, v11}, Lkotlin/text/MatchGroupCollection;->get(I)Lkotlin/text/MatchGroup;

    move-result-object v2

    :cond_1
    move-object v12, v2

    if-eqz v12, :cond_6

    .line 37
    invoke-interface {v10}, Lkotlin/text/MatchResult;->getRange()Lkotlin/ranges/IntRange;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/ranges/IntRange;->getStart()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    const-string v2, "&"

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v7}, Lkotlin/text/StringsKt;->regionMatches$default(Ljava/lang/String;ILjava/lang/String;IIZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 38
    invoke-interface {v10}, Lkotlin/text/MatchResult;->getRange()Lkotlin/ranges/IntRange;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/ranges/IntRange;->getStart()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sub-int/2addr v0, v11

    invoke-interface {v10}, Lkotlin/text/MatchResult;->getRange()Lkotlin/ranges/IntRange;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/ranges/IntRange;->getEndInclusive()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v1, v11

    if-nez p2, :cond_2

    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type kotlin.CharSequence"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v8, v0, v1}, Lkotlin/text/StringsKt;->removeRange(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    .line 40
    :cond_3
    invoke-interface {v10}, Lkotlin/text/MatchResult;->getRange()Lkotlin/ranges/IntRange;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/ranges/IntRange;->getStart()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v10}, Lkotlin/text/MatchResult;->getRange()Lkotlin/ranges/IntRange;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/ranges/IntRange;->getEndInclusive()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v1, v11

    if-nez p2, :cond_4

    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type kotlin.CharSequence"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {v8, v0, v1}, Lkotlin/text/StringsKt;->removeRange(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    .line 43
    :goto_1
    invoke-virtual {v12}, Lkotlin/text/MatchGroup;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/streamroot/dna/core/proxy/TargetUrlManager;->decodeUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/HttpUrl;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 44
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    move-result-object v0

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Cannot parse moved origin"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 46
    :cond_6
    new-instance v0, Lokhttp3/HttpUrl$Builder;

    invoke-direct {v0}, Lokhttp3/HttpUrl$Builder;-><init>()V

    .line 47
    iget-object v1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->lastManifestSeenScheme:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lokhttp3/HttpUrl$Builder;->scheme(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    move-result-object v0

    .line 48
    iget-object v1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->lastManifestSeenHost:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lokhttp3/HttpUrl$Builder;->host(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    move-result-object v0

    .line 49
    iget v1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->lastManifestSeenPort:I

    invoke-virtual {v0, v1}, Lokhttp3/HttpUrl$Builder;->port(I)Lokhttp3/HttpUrl$Builder;

    move-result-object v0

    .line 52
    :goto_2
    iget-object v1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->pathTemplate:Ljava/lang/String;

    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object v1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->pathTemplate:Ljava/lang/String;

    if-nez v1, :cond_8

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_8
    new-array v2, v11, [Ljava/lang/Object;

    aput-object p1, v2, v9

    array-length p1, v2

    invoke-static {v2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "java.lang.String.format(format, *args)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    invoke-virtual {v0, p1}, Lokhttp3/HttpUrl$Builder;->encodedPath(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 54
    move-object p1, p2

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/2addr p1, v11

    if-eqz p1, :cond_c

    .line 55
    invoke-virtual {p2, v9}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v1, 0x26

    if-eq p1, v1, :cond_9

    invoke-virtual {p2, v9}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v1, 0x3f

    if-ne p1, v1, :cond_b

    :cond_9
    if-nez p2, :cond_a

    .line 56
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-virtual {p2, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    const-string p1, "(this as java.lang.String).substring(startIndex)"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    :cond_b
    invoke-virtual {v0, p2}, Lokhttp3/HttpUrl$Builder;->encodedQuery(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 61
    :cond_c
    invoke-virtual {v0}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    move-result-object p1

    const-string p2, "builder.build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final isMainManifest(Lokhttp3/HttpUrl;)Z
    .locals 1
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "httpUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->mainManifestUri:Lokhttp3/HttpUrl;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final redirectMainManifestUrl(Lokhttp3/HttpUrl;)V
    .locals 7
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "finalRequestUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    move-result-object v1

    const-string v0, "newPath"

    .line 18
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->mainManifestUri:Lokhttp3/HttpUrl;

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    move-result-object v0

    const-string v2, "this.mainManifestUri.encodedPath()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v0, v2, v3, v4}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->mainManifestUri:Lokhttp3/HttpUrl;

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    move-result-object v2

    const-string v0, "this.mainManifestUri.encodedPath()"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "%s"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->pathTemplate:Ljava/lang/String;

    .line 21
    :cond_0
    iput-object p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->mainManifestUri:Lokhttp3/HttpUrl;

    .line 22
    iget-object p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->mainManifestUri:Lokhttp3/HttpUrl;

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object p1

    const-string v0, "mainManifestUri.scheme()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->lastManifestSeenScheme:Ljava/lang/String;

    .line 23
    iget-object p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->mainManifestUri:Lokhttp3/HttpUrl;

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object p1

    const-string v0, "mainManifestUri.host()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->lastManifestSeenHost:Ljava/lang/String;

    .line 24
    iget-object p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->mainManifestUri:Lokhttp3/HttpUrl;

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->port()I

    move-result p1

    iput p1, p0, Lio/streamroot/dna/core/proxy/TargetUrlManager;->lastManifestSeenPort:I

    return-void
.end method

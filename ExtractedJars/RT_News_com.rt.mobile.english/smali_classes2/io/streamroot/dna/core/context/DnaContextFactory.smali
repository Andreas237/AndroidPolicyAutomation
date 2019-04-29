.class public final Lio/streamroot/dna/core/context/DnaContextFactory;
.super Ljava/lang/Object;
.source "DnaContextFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0008\u0010\u0008\u001a\u00020\u0007H\u0002Jd\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0012\u0010\u001b\u001a\u00020\u000c2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/streamroot/dna/core/context/DnaContextFactory;",
        "",
        "()V",
        "generateLocalManifestUrl",
        "Lokhttp3/HttpUrl;",
        "manifestUrl",
        "proxyPort",
        "",
        "generateProxyPort",
        "initContext",
        "Lio/streamroot/dna/core/context/DnaContext;",
        "streamrootKey",
        "",
        "latency",
        "contentId",
        "property",
        "backendUrl",
        "experimentalFlags",
        "",
        "context",
        "Landroid/content/Context;",
        "playerInteractor",
        "Lio/streamroot/dna/core/PlayerInteractor;",
        "qosModule",
        "Lio/streamroot/dna/core/QosModule;",
        "bandwidthListener",
        "Lio/streamroot/dna/core/BandwidthListener;",
        "qosModuleType",
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
.field public static final INSTANCE:Lio/streamroot/dna/core/context/DnaContextFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lio/streamroot/dna/core/context/DnaContextFactory;

    invoke-direct {v0}, Lio/streamroot/dna/core/context/DnaContextFactory;-><init>()V

    sput-object v0, Lio/streamroot/dna/core/context/DnaContextFactory;->INSTANCE:Lio/streamroot/dna/core/context/DnaContextFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final generateLocalManifestUrl(Lokhttp3/HttpUrl;I)Lokhttp3/HttpUrl;
    .locals 1

    .line 50
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    move-result-object p1

    const-string v0, "http"

    .line 51
    invoke-virtual {p1, v0}, Lokhttp3/HttpUrl$Builder;->scheme(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    move-result-object p1

    const-string v0, "localhost"

    .line 52
    invoke-virtual {p1, v0}, Lokhttp3/HttpUrl$Builder;->host(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    move-result-object p1

    .line 53
    invoke-virtual {p1, p2}, Lokhttp3/HttpUrl$Builder;->port(I)Lokhttp3/HttpUrl$Builder;

    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    move-result-object p1

    const-string p2, "manifestUrl\n            \u2026ort)\n            .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final generateProxyPort()I
    .locals 2

    .line 57
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit16 v0, v0, 0xbb8

    return v0
.end method

.method private final qosModuleType(Lio/streamroot/dna/core/QosModule;)Ljava/lang/String;
    .locals 4

    if-nez p1, :cond_0

    const-string p1, "default"

    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/reflect/KClass;->getQualifiedName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "io.streamroot.dna"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    const-string p1, "plugin"

    goto :goto_0

    :cond_1
    const-string p1, "custom"

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final initContext(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;JLandroid/content/Context;Lio/streamroot/dna/core/PlayerInteractor;Lio/streamroot/dna/core/QosModule;Lio/streamroot/dna/core/BandwidthListener;)Lio/streamroot/dna/core/context/DnaContext;
    .locals 18
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lio/streamroot/dna/core/PlayerInteractor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lio/streamroot/dna/core/QosModule;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Lio/streamroot/dna/core/BandwidthListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p6

    const-string v1, "streamrootKey"

    move-object/from16 v7, p1

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "contentId"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "backendUrl"

    move-object/from16 v13, p5

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "manifestUrl"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    move-object/from16 v14, p9

    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "playerInteractor"

    move-object/from16 v15, p10

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct/range {p0 .. p0}, Lio/streamroot/dna/core/context/DnaContextFactory;->generateProxyPort()I

    move-result v8

    .line 29
    invoke-direct {v0, v3, v8}, Lio/streamroot/dna/core/context/DnaContextFactory;->generateLocalManifestUrl(Lokhttp3/HttpUrl;I)Lokhttp3/HttpUrl;

    move-result-object v4

    .line 30
    sget-object v1, Lio/streamroot/dna/core/context/config/StreamFormat;->Companion:Lio/streamroot/dna/core/context/config/StreamFormat$Companion;

    invoke-virtual {v1, v3}, Lio/streamroot/dna/core/context/config/StreamFormat$Companion;->detect(Lokhttp3/HttpUrl;)Lio/streamroot/dna/core/context/config/StreamFormat;

    move-result-object v5

    .line 32
    new-instance v9, Lio/streamroot/dna/core/context/config/Media;

    move-object v1, v9

    move/from16 v6, p2

    invoke-direct/range {v1 .. v6}, Lio/streamroot/dna/core/context/config/Media;-><init>(Ljava/lang/String;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lio/streamroot/dna/core/context/config/StreamFormat;I)V

    .line 34
    new-instance v1, Lio/streamroot/dna/core/context/config/SessionInformation;

    .line 35
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v2, "UUID.randomUUID().toString()"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-static/range {p9 .. p9}, Lio/streamroot/dna/core/context/ApplicationBundleIdKt;->bundleId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v12, p11

    .line 41
    invoke-direct {v0, v12}, Lio/streamroot/dna/core/context/DnaContextFactory;->qosModuleType(Lio/streamroot/dna/core/QosModule;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    const/16 v16, 0x80

    const/16 v17, 0x0

    move-object v2, v1

    move-object v4, v7

    move-object/from16 v5, p4

    move v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move/from16 v11, v16

    move-object/from16 v12, v17

    .line 34
    invoke-direct/range {v2 .. v12}, Lio/streamroot/dna/core/context/config/SessionInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILio/streamroot/dna/core/context/config/Media;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    new-instance v8, Lio/streamroot/dna/core/context/DnaContext;

    move-object v2, v8

    move-object v3, v1

    move-object v4, v14

    move-object v5, v15

    move-object/from16 v6, p11

    move-object/from16 v7, p12

    invoke-direct/range {v2 .. v7}, Lio/streamroot/dna/core/context/DnaContext;-><init>(Lio/streamroot/dna/core/context/config/SessionInformation;Landroid/content/Context;Lio/streamroot/dna/core/PlayerInteractor;Lio/streamroot/dna/core/QosModule;Lio/streamroot/dna/core/BandwidthListener;)V

    .line 44
    invoke-virtual/range {p5 .. p5}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lokhttp3/HttpUrl;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    const-string v2, "HttpUrl.parse(backendUrl.toString())!!"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Lio/streamroot/dna/core/context/DnaContext;->asyncLoad$dna_core_release(Lokhttp3/HttpUrl;)V

    return-object v8
.end method

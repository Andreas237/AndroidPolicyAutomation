.class public final Lio/streamroot/dna/core/context/loader/ResponseBodyParserKt;
.super Ljava/lang/Object;
.source "ResponseBodyParser.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nResponseBodyParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBodyParser.kt\nio/streamroot/dna/core/context/loader/ResponseBodyParserKt\n*L\n1#1,122:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002\u001a\u0014\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u001a\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\u0011\u001a\u00020\u00122\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\u00a8\u0006\u0015"
    }
    d2 = {
        "adaptMemoryConfiguration",
        "",
        "config",
        "Lorg/json/JSONObject;",
        "numberConfigurations",
        "",
        "",
        "",
        "parseActivationRules",
        "Lio/streamroot/dna/core/context/loader/ActivationRules;",
        "responseBody",
        "parseAvailabilityZone",
        "parseBackendCounts",
        "Lio/streamroot/dna/core/context/loader/BackendCounts;",
        "jsonObject",
        "parseBackendPaths",
        "Lio/streamroot/dna/core/context/loader/BackendPaths;",
        "parseInjectedConf",
        "Lio/streamroot/dna/core/context/loader/InjectedConf;",
        "parsePropertyParameters",
        "Lio/streamroot/dna/core/context/loader/CustomerProperties;",
        "dna-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private static final adaptMemoryConfiguration(Lorg/json/JSONObject;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Number;",
            ">;)V"
        }
    .end annotation

    .line 95
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getSEGMENT_MEMORY_USAGE_RATIO()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v0

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/MapExtentionsKt;->getConfiguration(Ljava/util/Map;Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    .line 96
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v2

    .line 98
    sget-object p1, Ljava/math/MathContext;->DECIMAL64:Ljava/math/MathContext;

    const-string v4, "MathContext.DECIMAL64"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/math/BigDecimal;

    invoke-direct {v4, v2, v3, p1}, Ljava/math/BigDecimal;-><init>(JLjava/math/MathContext;)V

    .line 99
    sget-object p1, Ljava/math/MathContext;->DECIMAL64:Ljava/math/MathContext;

    const-string v2, "MathContext.DECIMAL64"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/math/BigDecimal;

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;Ljava/math/MathContext;)V

    invoke-virtual {v4, v2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    .line 100
    sget-object v0, Ljava/math/MathContext;->DECIMAL64:Ljava/math/MathContext;

    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->round(Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object p1

    .line 101
    invoke-virtual {p1}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide v0

    const-string p1, "P2P_CACHE_MAX_SIZE"

    .line 103
    invoke-virtual {p0, p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const/4 p1, 0x1

    .line 104
    new-array p1, p1, [Ljava/lang/String;

    const-string v2, "LIVE"

    const/4 v3, 0x0

    aput-object v2, p1, v3

    invoke-static {p0, p1}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->getOrInsertJSONObject(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string p1, "P2P_CACHE_MAX_SIZE"

    .line 105
    invoke-virtual {p0, p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    return-void
.end method

.method public static final parseActivationRules(Ljava/lang/String;)Lio/streamroot/dna/core/context/loader/ActivationRules;
    .locals 4
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    if-eqz p0, :cond_1

    .line 12
    move-object v0, p0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "bypassed"

    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p0

    .line 18
    invoke-static {v0}, Lio/streamroot/dna/core/context/loader/ResponseBodyParserKt;->parseBackendPaths(Lorg/json/JSONObject;)Lio/streamroot/dna/core/context/loader/BackendPaths;

    move-result-object v1

    .line 19
    invoke-static {v0}, Lio/streamroot/dna/core/context/loader/ResponseBodyParserKt;->parsePropertyParameters(Lorg/json/JSONObject;)Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-result-object v2

    .line 20
    invoke-static {v0}, Lio/streamroot/dna/core/context/loader/ResponseBodyParserKt;->parseBackendCounts(Lorg/json/JSONObject;)Lio/streamroot/dna/core/context/loader/BackendCounts;

    move-result-object v0

    .line 22
    new-instance v3, Lio/streamroot/dna/core/context/loader/ActivationRules;

    invoke-direct {v3, p0, v1, v2, v0}, Lio/streamroot/dna/core/context/loader/ActivationRules;-><init>(ZLio/streamroot/dna/core/context/loader/BackendPaths;Lio/streamroot/dna/core/context/loader/CustomerProperties;Lio/streamroot/dna/core/context/loader/BackendCounts;)V

    return-object v3

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final parseAvailabilityZone(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    .line 109
    move-object v1, p0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 113
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "path"

    .line 114
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "JSONObject(responseBody)\u2026       .optString(\"path\")"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_1

    .line 115
    new-instance p0, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlin.CharSequence"

    invoke-direct {p0, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 117
    move-object v1, p0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    move-object p0, v0

    :goto_1
    return-object p0

    :cond_4
    :goto_2
    return-object v0
.end method

.method private static final parseBackendCounts(Lorg/json/JSONObject;)Lio/streamroot/dna/core/context/loader/BackendCounts;
    .locals 3

    const-string v0, "backendCounts"

    .line 66
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "contentActivated"

    .line 68
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    :cond_0
    const/4 v1, 0x1

    if-eqz p0, :cond_1

    const-string v2, "usageQuotaReached"

    .line 69
    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 71
    :cond_1
    new-instance p0, Lio/streamroot/dna/core/context/loader/BackendCounts;

    invoke-direct {p0, v0, v1}, Lio/streamroot/dna/core/context/loader/BackendCounts;-><init>(ZZ)V

    return-object p0
.end method

.method private static final parseBackendPaths(Lorg/json/JSONObject;)Lio/streamroot/dna/core/context/loader/BackendPaths;
    .locals 4

    const-string v0, "backendPaths"

    .line 26
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_3

    const-string v0, "trackerPath"

    const/4 v1, 0x0

    .line 29
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v2, "signalingPath"

    .line 31
    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "klaraPath"

    .line 33
    invoke-virtual {p0, v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 36
    new-instance v1, Lio/streamroot/dna/core/context/loader/BackendPaths;

    invoke-direct {v1, v0, v2, p0}, Lio/streamroot/dna/core/context/loader/BackendPaths;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 34
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid activator response body. key \"klaraPath\" not found"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0

    .line 32
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid activator response body. key \"signalingPath\" not found"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0

    .line 30
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid activator response body. key \"trackerPath\" not found"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0

    .line 27
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid activator response body. key \"backendPaths\" not found"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0
.end method

.method public static final parseInjectedConf(Ljava/lang/String;)Lio/streamroot/dna/core/context/loader/InjectedConf;
    .locals 12
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    if-eqz p0, :cond_0

    .line 75
    move-object v0, p0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 76
    :goto_0
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 77
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 78
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    const-string v1, "config"

    .line 80
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    if-eqz v1, :cond_1

    :goto_1
    move-object v10, v1

    goto :goto_2

    :cond_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    goto :goto_1

    :goto_2
    const-string v1, "NATIVE"

    .line 81
    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 82
    instance-of v2, v1, Lorg/json/JSONObject;

    if-eqz v2, :cond_2

    .line 83
    check-cast v1, Lorg/json/JSONObject;

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, v8

    move-object v4, v9

    invoke-static/range {v1 .. v7}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->parseConfiguration$default(Lorg/json/JSONObject;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/lang/String;ILjava/lang/Object;)V

    .line 86
    :cond_2
    move-object v11, v9

    check-cast v11, Ljava/util/Map;

    invoke-static {v10, v11}, Lio/streamroot/dna/core/context/loader/ResponseBodyParserKt;->adaptMemoryConfiguration(Lorg/json/JSONObject;Ljava/util/Map;)V

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, v10

    move-object v2, p0

    move-object v3, v8

    move-object v4, v9

    .line 87
    invoke-static/range {v1 .. v7}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->parseConfiguration$default(Lorg/json/JSONObject;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/lang/String;ILjava/lang/Object;)V

    const-string v1, "CONF_LABEL"

    .line 89
    invoke-static {}, Lio/streamroot/dna/core/context/config/SessionKt;->getUNDEFINED_CONF_LABEL()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {}, Lio/streamroot/dna/core/context/config/SessionKt;->getUNDEFINED_CONF_LABEL()Ljava/lang/String;

    move-result-object v1

    .line 90
    :goto_3
    new-instance v2, Lio/streamroot/dna/core/context/loader/NativeConf;

    check-cast p0, Ljava/util/Map;

    check-cast v8, Ljava/util/Map;

    invoke-direct {v2, p0, v8, v11}, Lio/streamroot/dna/core/context/loader/NativeConf;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    .line 91
    new-instance p0, Lio/streamroot/dna/core/context/loader/InjectedConf;

    invoke-direct {p0, v1, v2, v0}, Lio/streamroot/dna/core/context/loader/InjectedConf;-><init>(Ljava/lang/String;Lio/streamroot/dna/core/context/loader/NativeConf;Lorg/json/JSONObject;)V

    return-object p0
.end method

.method private static final parsePropertyParameters(Lorg/json/JSONObject;)Lio/streamroot/dna/core/context/loader/CustomerProperties;
    .locals 14

    const-string v0, "propertyParameters"

    .line 40
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "name"

    .line 42
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, v0

    :goto_0
    if-eqz p0, :cond_1

    const-string v1, "detectRangeRequest"

    .line 43
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, v0

    :goto_1
    if-eqz p0, :cond_2

    const-string v1, "mobileBrowserEnabled"

    .line 44
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, v0

    :goto_2
    const-wide/16 v1, 0x0

    if-eqz p0, :cond_3

    const-string v6, "activationRatio"

    .line 45
    invoke-virtual {p0, v6, v1, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v1

    :cond_3
    move-wide v6, v1

    if-eqz p0, :cond_4

    const-string v1, "ssaiEnabled"

    .line 46
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    move-object v8, v1

    goto :goto_3

    :cond_4
    move-object v8, v0

    :goto_3
    if-eqz p0, :cond_5

    const-string v0, "superSeederRatio"

    .line 47
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :cond_5
    move-object v9, v0

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    const-string v1, "cellularOtherUpload"

    .line 48
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    :cond_6
    move v10, v0

    const/4 v0, 0x1

    if-eqz p0, :cond_7

    const-string v1, "cellularOtherDownload"

    .line 49
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    move v11, v1

    goto :goto_4

    :cond_7
    move v11, v0

    :goto_4
    if-eqz p0, :cond_8

    const-string v1, "wifiEthernetUpload"

    .line 50
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    move v12, v1

    goto :goto_5

    :cond_8
    move v12, v0

    :goto_5
    if-eqz p0, :cond_9

    const-string v1, "wifiEthernetDownload"

    .line 51
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p0

    move v13, p0

    goto :goto_6

    :cond_9
    move v13, v0

    .line 53
    :goto_6
    new-instance p0, Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-object v2, p0

    invoke-direct/range {v2 .. v13}, Lio/streamroot/dna/core/context/loader/CustomerProperties;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;DLjava/lang/Boolean;Ljava/lang/Double;ZZZZ)V

    return-object p0
.end method

.class public final Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt;
.super Ljava/lang/Object;
.source "DnaAsyncLoad.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDnaAsyncLoad.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DnaAsyncLoad.kt\nio/streamroot/dna/core/context/loader/DnaAsyncLoadKt\n*L\n1#1,117:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\u001ah\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\"\u0010\u000f\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0010\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u001a\u0008\u0010\u0016\u001a\u00020\u0017H\u0002\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0018"
    }
    d2 = {
        "dnaAsyncLoad",
        "Lkotlinx/coroutines/Job;",
        "androidContextRef",
        "Ljava/lang/ref/WeakReference;",
        "Landroid/content/Context;",
        "stateManager",
        "Lio/streamroot/dna/core/context/state/StateManager;",
        "callFactory",
        "Lokhttp3/Call$Factory;",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "sessionInformation",
        "Lio/streamroot/dna/core/context/config/SessionInformation;",
        "backendUrl",
        "Lokhttp3/HttpUrl;",
        "success",
        "Lkotlin/Function2;",
        "Lio/streamroot/dna/core/context/config/DnaConfiguration;",
        "Lkotlin/coroutines/Continuation;",
        "",
        "",
        "(Ljava/lang/ref/WeakReference;Lio/streamroot/dna/core/context/state/StateManager;Lokhttp3/Call$Factory;Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;",
        "rollDice",
        "",
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
.method public static final synthetic access$rollDice()D
    .locals 2

    .line 1
    invoke-static {}, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt;->rollDice()D

    move-result-wide v0

    return-wide v0
.end method

.method public static final dnaAsyncLoad(Ljava/lang/ref/WeakReference;Lio/streamroot/dna/core/context/state/StateManager;Lokhttp3/Call$Factory;Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;
    .locals 11
    .param p0    # Ljava/lang/ref/WeakReference;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/streamroot/dna/core/context/state/StateManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/streamroot/dna/core/context/config/SessionInformation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lio/streamroot/dna/core/context/state/StateManager;",
            "Lokhttp3/Call$Factory;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lio/streamroot/dna/core/context/config/SessionInformation;",
            "Lokhttp3/HttpUrl;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lio/streamroot/dna/core/context/config/DnaConfiguration;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lkotlinx/coroutines/Job;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object v0, p3

    const-string v1, "androidContextRef"

    move-object v6, p0

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "stateManager"

    move-object v8, p1

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "callFactory"

    move-object v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "sessionInformation"

    move-object v5, p4

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "backendUrl"

    move-object/from16 v4, p5

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "success"

    move-object/from16 v7, p6

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    sget-object v1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    new-instance v10, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;

    const/4 v9, 0x0

    move-object v2, v10

    invoke-direct/range {v2 .. v9}, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;-><init>(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lio/streamroot/dna/core/context/config/SessionInformation;Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;Lio/streamroot/dna/core/context/state/StateManager;Lkotlin/coroutines/Continuation;)V

    move-object v5, v10

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v2, v1

    move-object v3, v0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    return-object v0
.end method

.method private static final rollDice()D
    .locals 4

    const-string v0, "SHA1PRNG"

    .line 113
    invoke-static {v0}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;

    move-result-object v0

    .line 114
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UUID.randomUUID().toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "UTF-8"

    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    const-string v3, "Charset.forName(charsetName)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v1, :cond_0

    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string v2, "(this as java.lang.String).getBytes(charset)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->setSeed([B)V

    .line 115
    invoke-virtual {v0}, Ljava/security/SecureRandom;->nextDouble()D

    move-result-wide v0

    return-wide v0
.end method

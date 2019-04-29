.class public final Lio/streamroot/dna/core/DnaClient$Companion;
.super Ljava/lang/Object;
.source "DnaClient.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/core/DnaClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDnaClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DnaClient.kt\nio/streamroot/dna/core/DnaClient$Companion\n*L\n1#1,406:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00042\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\u000eJ/\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00042\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u00a2\u0006\u0002\u0010\u0012J\u0008\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/streamroot/dna/core/DnaClient$Companion;",
        "",
        "()V",
        "DEFAULT_LATENCY",
        "",
        "NATIVE_LIBRARY_LOADED",
        "NATIVE_LIBRARY_LOAD_FAILED",
        "NATIVE_LIBRARY_LOAD_NEEDED",
        "nativeLibraryStatus",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "generateBufferTarget",
        "minBufferDurationInMS",
        "maxBufferDurationInMS",
        "latencyInMs",
        "(IILjava/lang/Integer;)I",
        "latency",
        "timeUnit",
        "Ljava/util/concurrent/TimeUnit;",
        "(IILjava/lang/Integer;Ljava/util/concurrent/TimeUnit;)I",
        "newBuilder",
        "Lio/streamroot/dna/core/DnaClientBuilder;",
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

    .line 301
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 301
    invoke-direct {p0}, Lio/streamroot/dna/core/DnaClient$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final generateBufferTarget(IILjava/lang/Integer;)I
    .locals 3
    .param p3    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    if-eqz p3, :cond_2

    .line 318
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gt v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "SHA1PRNG"

    .line 321
    invoke-static {p2}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;

    move-result-object p2

    .line 322
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UUID.randomUUID().toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "UTF-8"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    const-string v2, "Charset.forName(charsetName)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_1

    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "(this as java.lang.String).getBytes(charset)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/security/SecureRandom;->setSeed([B)V

    .line 323
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    sub-int/2addr p3, p1

    invoke-virtual {p2, p3}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result p2

    add-int/2addr p2, p1

    :cond_2
    :goto_0
    return p2
.end method

.method public final generateBufferTarget(IILjava/lang/Integer;Ljava/util/concurrent/TimeUnit;)I
    .locals 3
    .param p3    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/TimeUnit;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "timeUnit"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 329
    move-object v0, p0

    check-cast v0, Lio/streamroot/dna/core/DnaClient$Companion;

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 332
    :cond_0
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    int-to-long v1, p3

    invoke-virtual {p4, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p3

    long-to-int p3, p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    .line 329
    :goto_0
    invoke-virtual {v0, p1, p2, p3}, Lio/streamroot/dna/core/DnaClient$Companion;->generateBufferTarget(IILjava/lang/Integer;)I

    move-result p1

    return p1
.end method

.method public final newBuilder()Lio/streamroot/dna/core/DnaClientBuilder;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 306
    new-instance v0, Lio/streamroot/dna/core/DnaClient$Builder;

    invoke-direct {v0}, Lio/streamroot/dna/core/DnaClient$Builder;-><init>()V

    check-cast v0, Lio/streamroot/dna/core/DnaClientBuilder;

    return-object v0
.end method

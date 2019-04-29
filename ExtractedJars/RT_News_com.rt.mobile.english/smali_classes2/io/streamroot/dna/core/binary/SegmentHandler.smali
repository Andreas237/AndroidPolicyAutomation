.class public final Lio/streamroot/dna/core/binary/SegmentHandler;
.super Ljava/lang/Object;
.source "SegmentHandler.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/binary/SegmentHandler$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSegmentHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentHandler.kt\nio/streamroot/dna/core/binary/SegmentHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CallExecutor.kt\nio/streamroot/dna/core/js/CallExecutor\n*L\n1#1,63:1\n1561#2,2:64\n23#3,2:66\n*E\n*S KotlinDebug\n*F\n+ 1 SegmentHandler.kt\nio/streamroot/dna/core/binary/SegmentHandler\n*L\n24#1,2:64\n40#1,2:66\n*E\n"
.end annotation

.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/streamroot/dna/core/binary/SegmentHandler;",
        "",
        "callExecutor",
        "Lio/streamroot/dna/core/js/CallExecutor;",
        "segmentCallBackStore",
        "Lio/streamroot/dna/core/binary/SegmentCallBackStore;",
        "(Lio/streamroot/dna/core/js/CallExecutor;Lio/streamroot/dna/core/binary/SegmentCallBackStore;)V",
        "getSegment",
        "Lio/streamroot/dna/core/binary/SegmentResponse;",
        "url",
        "Lokhttp3/HttpUrl;",
        "headers",
        "",
        "",
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
.field public static final Companion:Lio/streamroot/dna/core/binary/SegmentHandler$Companion;

.field private static final TIMEOUT:J = 0x1388L

.field private static final dummyBinaryData:Lio/streamroot/dna/core/binary/store/BinaryData;


# instance fields
.field private callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

.field private final segmentCallBackStore:Lio/streamroot/dna/core/binary/SegmentCallBackStore;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/streamroot/dna/core/binary/SegmentHandler$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/binary/SegmentHandler$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/binary/SegmentHandler;->Companion:Lio/streamroot/dna/core/binary/SegmentHandler$Companion;

    .line 61
    new-instance v0, Lio/streamroot/dna/core/binary/store/BinaryData;

    const-string v1, "Dummy"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/nio/ByteBuffer;

    invoke-direct {v0, v1, v3, v2}, Lio/streamroot/dna/core/binary/store/BinaryData;-><init>(Ljava/lang/String;[Ljava/nio/ByteBuffer;I)V

    sput-object v0, Lio/streamroot/dna/core/binary/SegmentHandler;->dummyBinaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    return-void
.end method

.method public constructor <init>(Lio/streamroot/dna/core/js/CallExecutor;Lio/streamroot/dna/core/binary/SegmentCallBackStore;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/js/CallExecutor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/binary/SegmentCallBackStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentCallBackStore"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/SegmentHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    iput-object p2, p0, Lio/streamroot/dna/core/binary/SegmentHandler;->segmentCallBackStore:Lio/streamroot/dna/core/binary/SegmentCallBackStore;

    return-void
.end method

.method public static final synthetic access$getDummyBinaryData$cp()Lio/streamroot/dna/core/binary/store/BinaryData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    sget-object v0, Lio/streamroot/dna/core/binary/SegmentHandler;->dummyBinaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    return-object v0
.end method


# virtual methods
.method public final getSegment(Lokhttp3/HttpUrl;Ljava/util/Map;)Lio/streamroot/dna/core/binary/SegmentResponse;
    .locals 7
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/HttpUrl;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/streamroot/dna/core/binary/SegmentResponse;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 23
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 24
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 64
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 24
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_1
    const-string p2, ""

    :goto_1
    const-string v0, "if (headers.isNotEmpty()\u2026\n            \"\"\n        }"

    .line 22
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "url.toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v3, Lio/streamroot/dna/core/binary/SegmentHandler;->dummyBinaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    const/4 v3, 0x0

    .line 33
    :try_start_0
    iget-object v4, p0, Lio/streamroot/dna/core/binary/SegmentHandler;->segmentCallBackStore:Lio/streamroot/dna/core/binary/SegmentCallBackStore;

    new-instance v5, Lio/streamroot/dna/core/binary/SegmentHandler$getSegment$1;

    invoke-direct {v5, v2, v0}, Lio/streamroot/dna/core/binary/SegmentHandler$getSegment$1;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V

    check-cast v5, Landroid/webkit/ValueCallback;

    invoke-virtual {v4, p1, v5}, Lio/streamroot/dna/core/binary/SegmentCallBackStore;->add(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 40
    iget-object v4, p0, Lio/streamroot/dna/core/binary/SegmentHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    .line 66
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Panama.getSegment("

    .line 41
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    move-object v6, p1

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v5, v6}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->encodeAndAppendWithComma(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 43
    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {v5, p1}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->encodeAndAppendWithComma(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 44
    check-cast p2, Ljava/lang/CharSequence;

    invoke-static {v5, p2}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->encodeAndAppend(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string p1, ");"

    .line 45
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    .line 48
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-wide/16 p1, 0x1388

    .line 49
    :try_start_1
    invoke-virtual {v0, p1, p2}, Ljava/lang/Object;->wait(J)V

    .line 50
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/binary/store/BinaryData;

    .line 54
    new-instance p2, Lio/streamroot/dna/core/binary/SegmentResponse;

    sget-object v0, Lio/streamroot/dna/core/binary/SegmentHandler;->dummyBinaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    if-ne p1, v0, :cond_2

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    invoke-direct {p2, p1, v1}, Lio/streamroot/dna/core/binary/SegmentResponse;-><init>(Lio/streamroot/dna/core/binary/store/BinaryData;Z)V

    return-object p2

    :catchall_0
    move-exception p1

    .line 48
    :try_start_3
    monitor-exit v0

    throw p1
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 53
    :catchall_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/binary/store/BinaryData;

    .line 54
    new-instance p2, Lio/streamroot/dna/core/binary/SegmentResponse;

    sget-object v0, Lio/streamroot/dna/core/binary/SegmentHandler;->dummyBinaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    if-ne p1, v0, :cond_3

    goto :goto_3

    :cond_3
    move v1, v3

    :goto_3
    invoke-direct {p2, p1, v1}, Lio/streamroot/dna/core/binary/SegmentResponse;-><init>(Lio/streamroot/dna/core/binary/store/BinaryData;Z)V

    return-object p2

    .line 53
    :catch_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/binary/store/BinaryData;

    .line 54
    new-instance p2, Lio/streamroot/dna/core/binary/SegmentResponse;

    sget-object v0, Lio/streamroot/dna/core/binary/SegmentHandler;->dummyBinaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    if-ne p1, v0, :cond_4

    goto :goto_4

    :cond_4
    move v1, v3

    :goto_4
    invoke-direct {p2, p1, v1}, Lio/streamroot/dna/core/binary/SegmentResponse;-><init>(Lio/streamroot/dna/core/binary/store/BinaryData;Z)V

    return-object p2
.end method

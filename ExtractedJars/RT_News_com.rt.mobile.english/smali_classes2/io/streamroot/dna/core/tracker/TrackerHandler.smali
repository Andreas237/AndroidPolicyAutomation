.class public final Lio/streamroot/dna/core/tracker/TrackerHandler;
.super Ljava/lang/Object;
.source "TrackerHandler.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTrackerHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackerHandler.kt\nio/streamroot/dna/core/tracker/TrackerHandler\n+ 2 CallExecutor.kt\nio/streamroot/dna/core/js/CallExecutor\n*L\n1#1,50:1\n23#2,2:51\n23#2,2:53\n23#2,2:55\n23#2,2:57\n*E\n*S KotlinDebug\n*F\n+ 1 TrackerHandler.kt\nio/streamroot/dna/core/tracker/TrackerHandler\n*L\n11#1,2:51\n19#1,2:53\n31#1,2:55\n39#1,2:57\n*E\n"
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
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000cJ\u0006\u0010\u000f\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/streamroot/dna/core/tracker/TrackerHandler;",
        "",
        "callExecutor",
        "Lio/streamroot/dna/core/js/CallExecutor;",
        "(Lio/streamroot/dna/core/js/CallExecutor;)V",
        "askPeerFailure",
        "",
        "askPeerSuccess",
        "responseBody",
        "",
        "connectionAttempt",
        "requestLength",
        "",
        "connectionCreated",
        "requestAttempt",
        "requestFailure",
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
.field private final callExecutor:Lio/streamroot/dna/core/js/CallExecutor;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/js/CallExecutor;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/js/CallExecutor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/tracker/TrackerHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    return-void
.end method


# virtual methods
.method public final askPeerFailure()V
    .locals 2

    .line 27
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v1, "Panama.trackerAskPeerFailure();"

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    return-void
.end method

.method public final askPeerSuccess(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "responseBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    .line 53
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Panama.trackerAskPeerResponse("

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {v1, p1}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->encodeAndAppend(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string p1, ");"

    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    return-void
.end method

.method public final connectionAttempt(I)V
    .locals 3

    .line 31
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Panama.trackerConnectionAttempt("

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ");"

    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    return-void
.end method

.method public final connectionCreated(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "responseBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Panama.trackerConnectionCreated("

    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {v1, p1}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->encodeAndAppend(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string p1, ");"

    .line 14
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    return-void
.end method

.method public final requestAttempt(I)V
    .locals 3

    .line 39
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Panama.trackerRequestAttempt("

    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ");"

    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    return-void
.end method

.method public final requestFailure()V
    .locals 2

    .line 47
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v1, "Panama.trackerRequestFailure();"

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    return-void
.end method

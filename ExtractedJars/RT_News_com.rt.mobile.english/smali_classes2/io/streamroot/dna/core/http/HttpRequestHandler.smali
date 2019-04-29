.class public final Lio/streamroot/dna/core/http/HttpRequestHandler;
.super Ljava/lang/Object;
.source "HttpRequestHandler.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHttpRequestHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequestHandler.kt\nio/streamroot/dna/core/http/HttpRequestHandler\n+ 2 CallExecutor.kt\nio/streamroot/dna/core/js/CallExecutor\n*L\n1#1,26:1\n23#2,2:27\n*E\n*S KotlinDebug\n*F\n+ 1 HttpRequestHandler.kt\nio/streamroot/dna/core/http/HttpRequestHandler\n*L\n16#1,2:27\n*E\n"
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
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lio/streamroot/dna/core/http/HttpRequestHandler;",
        "",
        "callExecutor",
        "Lio/streamroot/dna/core/js/CallExecutor;",
        "(Lio/streamroot/dna/core/js/CallExecutor;)V",
        "dataResponseCall",
        "",
        "requestId",
        "",
        "binaryDataId",
        "binaryDataSize",
        "",
        "status",
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

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/http/HttpRequestHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    return-void
.end method


# virtual methods
.method public final dataResponseCall(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "requestId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lio/streamroot/dna/core/http/HttpRequestHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Panama.httpRequestDataResponse("

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    invoke-static {v1, p1}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->appendEscapeStringWithComma(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, ""

    .line 19
    :goto_0
    invoke-static {v1, p2}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->appendEscapeStringWithComma(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    invoke-static {v1, p3}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->appendWithComma(Ljava/lang/StringBuilder;I)Ljava/lang/StringBuilder;

    .line 21
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ");"

    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    return-void
.end method

.class public final Lio/streamroot/dna/core/media/MediaElementHandler;
.super Ljava/lang/Object;
.source "MediaElementHandler.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMediaElementHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaElementHandler.kt\nio/streamroot/dna/core/media/MediaElementHandler\n+ 2 CallExecutor.kt\nio/streamroot/dna/core/js/CallExecutor\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n23#2:38\n24#2:41\n1561#3,2:39\n*E\n*S KotlinDebug\n*F\n+ 1 MediaElementHandler.kt\nio/streamroot/dna/core/media/MediaElementHandler\n*L\n17#1:38\n17#1:41\n17#1,2:39\n*E\n"
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
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/streamroot/dna/core/media/MediaElementHandler;",
        "",
        "callExecutor",
        "Lio/streamroot/dna/core/js/CallExecutor;",
        "(Lio/streamroot/dna/core/js/CallExecutor;)V",
        "defaultTimeRange",
        "",
        "updateMediaElement",
        "",
        "playbackTime",
        "",
        "bufferedTimeRanges",
        "",
        "Lio/streamroot/dna/core/TimeRange;",
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

.field private final defaultTimeRange:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/js/CallExecutor;)V
    .locals 3
    .param p1    # Lio/streamroot/dna/core/js/CallExecutor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/media/MediaElementHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    .line 14
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v0, Lio/streamroot/dna/core/TimeRange;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, Lio/streamroot/dna/core/TimeRange;-><init>(JJ)V

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->encodeAndAppendWithComma(Ljava/lang/StringBuilder;Lio/streamroot/dna/core/TimeRange;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "StringBuilder().encodeAn\u2026meRange(0, 0)).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/media/MediaElementHandler;->defaultTimeRange:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final updateMediaElement(JLjava/util/List;)V
    .locals 4
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lio/streamroot/dna/core/TimeRange;",
            ">;)V"
        }
    .end annotation

    const-string v0, "bufferedTimeRanges"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lio/streamroot/dna/core/media/MediaElementHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Panama.updateMediaElement("

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    long-to-double p1, p1

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr p1, v2

    .line 19
    invoke-static {v1, p1, p2}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->appendWithComma(Ljava/lang/StringBuilder;D)Ljava/lang/StringBuilder;

    .line 20
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    .line 28
    check-cast p3, Ljava/lang/Iterable;

    .line 39
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    goto :goto_0

    .line 25
    :pswitch_0
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/TimeRange;

    invoke-static {v1, p1}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->encodeAndAppend(Ljava/lang/StringBuilder;Lio/streamroot/dna/core/TimeRange;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 22
    :pswitch_1
    iget-object p1, p0, Lio/streamroot/dna/core/media/MediaElementHandler;->defaultTimeRange:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 39
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/streamroot/dna/core/TimeRange;

    .line 29
    invoke-static {v1, p2}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->encodeAndAppendWithComma(Ljava/lang/StringBuilder;Lio/streamroot/dna/core/TimeRange;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 31
    :cond_0
    move-object p1, v1

    check-cast p1, Ljava/lang/CharSequence;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lkotlin/text/StringsKt;->dropLast(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    :goto_1
    const-string p1, ");"

    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Lcom/ibotta/android/content/ContentListReducerUtil;
.super Ljava/lang/Object;
.source "ContentListReducerUtil.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00112\u0008\u0008\u0002\u0010\r\u001a\u00020\nJ$\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00152\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00112\u0008\u0008\u0002\u0010\r\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/ibotta/android/content/ContentListReducerUtil;",
        "",
        "contentRowReducer",
        "Lcom/ibotta/android/content/row/ContentRowReducer;",
        "contentCardReducer",
        "Lcom/ibotta/android/content/card/ContentCardReducer;",
        "contentTrackingReducer",
        "Lcom/ibotta/android/content/tracking/ContentTrackingReducer;",
        "(Lcom/ibotta/android/content/row/ContentRowReducer;Lcom/ibotta/android/content/card/ContentCardReducer;Lcom/ibotta/android/content/tracking/ContentTrackingReducer;)V",
        "getTrackingPayload",
        "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
        "displayContent",
        "Lcom/ibotta/android/content/DisplayContent;",
        "contentTrackingPayload",
        "index",
        "",
        "list",
        "",
        "Lcom/ibotta/android/views/list/ContentViewState;",
        "displayContents",
        "stream",
        "Ljava9/util/stream/Stream;",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

.field private final contentRowReducer:Lcom/ibotta/android/content/row/ContentRowReducer;

.field private final contentTrackingReducer:Lcom/ibotta/android/content/tracking/ContentTrackingReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/content/row/ContentRowReducer;Lcom/ibotta/android/content/card/ContentCardReducer;Lcom/ibotta/android/content/tracking/ContentTrackingReducer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/content/row/ContentRowReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/content/card/ContentCardReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/content/tracking/ContentTrackingReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "contentRowReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentCardReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentTrackingReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/ContentListReducerUtil;->contentRowReducer:Lcom/ibotta/android/content/row/ContentRowReducer;

    iput-object p2, p0, Lcom/ibotta/android/content/ContentListReducerUtil;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    iput-object p3, p0, Lcom/ibotta/android/content/ContentListReducerUtil;->contentTrackingReducer:Lcom/ibotta/android/content/tracking/ContentTrackingReducer;

    return-void
.end method

.method public static final synthetic access$getContentCardReducer$p(Lcom/ibotta/android/content/ContentListReducerUtil;)Lcom/ibotta/android/content/card/ContentCardReducer;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/ibotta/android/content/ContentListReducerUtil;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    return-object p0
.end method

.method public static final synthetic access$getContentRowReducer$p(Lcom/ibotta/android/content/ContentListReducerUtil;)Lcom/ibotta/android/content/row/ContentRowReducer;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/ibotta/android/content/ContentListReducerUtil;->contentRowReducer:Lcom/ibotta/android/content/row/ContentRowReducer;

    return-object p0
.end method

.method public static final synthetic access$getTrackingPayload(Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/content/DisplayContent;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;I)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/content/ContentListReducerUtil;->getTrackingPayload(Lcom/ibotta/android/content/DisplayContent;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;I)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p0

    return-object p0
.end method

.method private final getTrackingPayload(Lcom/ibotta/android/content/DisplayContent;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;I)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/content/ContentListReducerUtil;->contentTrackingReducer:Lcom/ibotta/android/content/tracking/ContentTrackingReducer;

    invoke-virtual {p1}, Lcom/ibotta/android/content/DisplayContent;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/content/tracking/ContentTrackingReducer;->getContentTrackingPayload(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic list$default(Lcom/ibotta/android/content/ContentListReducerUtil;Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;ILjava/lang/Object;)Ljava/util/List;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 24
    sget-object p2, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    const-string p3, "NO_TRACKING"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/content/ContentListReducerUtil;->list(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic stream$default(Lcom/ibotta/android/content/ContentListReducerUtil;Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;ILjava/lang/Object;)Ljava9/util/stream/Stream;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 34
    sget-object p2, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    const-string p3, "NO_TRACKING"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/content/ContentListReducerUtil;->stream(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava9/util/stream/Stream;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final list(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/content/DisplayContent;",
            ">;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "displayContents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentTrackingPayload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->asSequence(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/content/ContentListReducerUtil$list$1;

    invoke-direct {v0, p0, p2}, Lcom/ibotta/android/content/ContentListReducerUtil$list$1;-><init>(Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {p1, v0}, Lkotlin/sequences/SequencesKt;->mapIndexed(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;

    move-result-object p1

    .line 30
    invoke-static {p1}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final stream(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava9/util/stream/Stream;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/content/DisplayContent;",
            ">;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Ljava9/util/stream/Stream<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "displayContents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentTrackingPayload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/content/ContentListReducerUtil;->list(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    const-string p2, "StreamSupport.stream(lis\u2026 contentTrackingPayload))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

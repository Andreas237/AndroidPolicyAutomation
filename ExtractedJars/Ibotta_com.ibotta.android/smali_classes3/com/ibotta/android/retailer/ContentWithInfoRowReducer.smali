.class public final Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;
.super Ljava/lang/Object;
.source "ContentWithInfoRowReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cJ\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\nH\u0002J$\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000c2\u0006\u0010\t\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;",
        "",
        "contentListReducerUtil",
        "Lcom/ibotta/android/content/ContentListReducerUtil;",
        "ibottaListViewStyleReducer",
        "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
        "(Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)V",
        "create",
        "Lcom/ibotta/android/views/list/IbottaListViewState;",
        "info",
        "",
        "displayContents",
        "",
        "Lcom/ibotta/android/content/DisplayContent;",
        "createInfoRowSequence",
        "Lkotlin/sequences/Sequence;",
        "Lcom/ibotta/android/views/base/info/InformationRowViewState;",
        "getRows",
        "Lcom/ibotta/android/views/list/ContentViewState;",
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
.field private final contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

.field private final ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/content/ContentListReducerUtil;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "contentListReducerUtil"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ibottaListViewStyleReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;->contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

    iput-object p2, p0, Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    return-void
.end method

.method private final createInfoRowSequence(Ljava/lang/String;)Lkotlin/sequences/Sequence;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/sequences/Sequence<",
            "Lcom/ibotta/android/views/base/info/InformationRowViewState;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 31
    new-array v0, v0, [Lcom/ibotta/android/views/base/info/InformationRowViewState;

    new-instance v1, Lcom/ibotta/android/views/base/info/InformationRowViewState;

    const-string v2, ""

    const-string v3, ""

    sget-object v4, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->EXACT:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    invoke-direct {v1, p1, v2, v3, v4}, Lcom/ibotta/android/views/base/info/InformationRowViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object p1

    return-object p1
.end method

.method private final getRows(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/content/DisplayContent;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;->createInfoRowSequence(Ljava/lang/String;)Lkotlin/sequences/Sequence;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;->contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p2, v1, v2, v1}, Lcom/ibotta/android/content/ContentListReducerUtil;->list$default(Lcom/ibotta/android/content/ContentListReducerUtil;Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, Lkotlin/sequences/SequencesKt;->plus(Lkotlin/sequences/Sequence;Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object p1

    invoke-static {p1}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/content/DisplayContent;",
            ">;)",
            "Lcom/ibotta/android/views/list/IbottaListViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayContents"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    .line 28
    new-instance v11, Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;->getRows(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x7d

    const/4 v10, 0x0

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/list/IbottaListViewState;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    sget-object p1, Lcom/ibotta/android/ilv/ListType;->VERTICAL:Lcom/ibotta/android/ilv/ListType;

    .line 27
    invoke-virtual {v0, v11, p1}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->copyWithStyle(Lcom/ibotta/android/views/list/IbottaListViewState;Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    return-object p1
.end method

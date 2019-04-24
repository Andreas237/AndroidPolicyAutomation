.class public final Lcom/ibotta/android/content/card/deal/DealCardReducer;
.super Ljava/lang/Object;
.source "DealCardReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/deal/DealCardReducer;",
        "",
        "dealImageReducer",
        "Lcom/ibotta/android/content/card/deal/DealImageReducer;",
        "dealSummaryReducer",
        "Lcom/ibotta/android/content/card/deal/DealSummaryReducer;",
        "dealButtonReducer",
        "Lcom/ibotta/android/content/card/deal/DealButtonReducer;",
        "contentBackgroundReducer",
        "Lcom/ibotta/android/content/ContentBackgroundReducer;",
        "(Lcom/ibotta/android/content/card/deal/DealImageReducer;Lcom/ibotta/android/content/card/deal/DealSummaryReducer;Lcom/ibotta/android/content/card/deal/DealButtonReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)V",
        "create",
        "Lcom/ibotta/android/content/card/ContentCardViewState;",
        "dealModel",
        "Lcom/ibotta/api/model/DealModel;",
        "retailerModel",
        "Lcom/ibotta/api/model/RetailerModel;",
        "contentStyle",
        "Lcom/ibotta/android/views/content/ContentStyle;",
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
.field private final contentBackgroundReducer:Lcom/ibotta/android/content/ContentBackgroundReducer;

.field private final dealButtonReducer:Lcom/ibotta/android/content/card/deal/DealButtonReducer;

.field private final dealImageReducer:Lcom/ibotta/android/content/card/deal/DealImageReducer;

.field private final dealSummaryReducer:Lcom/ibotta/android/content/card/deal/DealSummaryReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/content/card/deal/DealImageReducer;Lcom/ibotta/android/content/card/deal/DealSummaryReducer;Lcom/ibotta/android/content/card/deal/DealButtonReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/content/card/deal/DealImageReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/content/card/deal/DealSummaryReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/content/card/deal/DealButtonReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/content/ContentBackgroundReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dealImageReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dealSummaryReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dealButtonReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentBackgroundReducer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/card/deal/DealCardReducer;->dealImageReducer:Lcom/ibotta/android/content/card/deal/DealImageReducer;

    iput-object p2, p0, Lcom/ibotta/android/content/card/deal/DealCardReducer;->dealSummaryReducer:Lcom/ibotta/android/content/card/deal/DealSummaryReducer;

    iput-object p3, p0, Lcom/ibotta/android/content/card/deal/DealCardReducer;->dealButtonReducer:Lcom/ibotta/android/content/card/deal/DealButtonReducer;

    iput-object p4, p0, Lcom/ibotta/android/content/card/deal/DealCardReducer;->contentBackgroundReducer:Lcom/ibotta/android/content/ContentBackgroundReducer;

    return-void
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/DealModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/content/card/ContentCardViewState;
    .locals 19
    .param p1    # Lcom/ibotta/api/model/DealModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    const-string v3, "dealModel"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "retailerModel"

    move-object/from16 v6, p2

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "contentStyle"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v3, Lcom/ibotta/android/content/card/ContentCardViewState;

    .line 17
    move-object v5, v1

    check-cast v5, Lcom/ibotta/api/model/ContentModel;

    .line 19
    iget-object v4, v0, Lcom/ibotta/android/content/card/deal/DealCardReducer;->dealImageReducer:Lcom/ibotta/android/content/card/deal/DealImageReducer;

    invoke-virtual {v4, v1, v2}, Lcom/ibotta/android/content/card/deal/DealImageReducer;->create(Lcom/ibotta/api/model/DealModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/ContentImageViewState;

    move-result-object v9

    .line 20
    iget-object v4, v0, Lcom/ibotta/android/content/card/deal/DealCardReducer;->dealSummaryReducer:Lcom/ibotta/android/content/card/deal/DealSummaryReducer;

    invoke-virtual {v4, v1, v2}, Lcom/ibotta/android/content/card/deal/DealSummaryReducer;->create(Lcom/ibotta/api/model/DealModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/SummaryContentViewState;

    move-result-object v7

    .line 21
    iget-object v1, v0, Lcom/ibotta/android/content/card/deal/DealCardReducer;->contentBackgroundReducer:Lcom/ibotta/android/content/ContentBackgroundReducer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/ibotta/android/content/ContentBackgroundReducer;->create(Z)I

    move-result v13

    .line 22
    iget-object v1, v0, Lcom/ibotta/android/content/card/deal/DealCardReducer;->dealButtonReducer:Lcom/ibotta/android/content/card/deal/DealButtonReducer;

    invoke-virtual {v1}, Lcom/ibotta/android/content/card/deal/DealButtonReducer;->create()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v8

    .line 23
    sget-object v12, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;->GONE:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0xe60

    const/16 v18, 0x0

    move-object v4, v3

    .line 16
    invoke-direct/range {v4 .. v18}, Lcom/ibotta/android/content/card/ContentCardViewState;-><init>(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

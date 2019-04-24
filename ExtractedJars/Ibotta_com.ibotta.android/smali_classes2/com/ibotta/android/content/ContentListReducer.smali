.class public final Lcom/ibotta/android/content/ContentListReducer;
.super Ljava/lang/Object;
.source "ContentListReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nContentListReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentListReducer.kt\ncom/ibotta/android/content/ContentListReducer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1301#2:45\n1370#2,3:46\n*E\n*S KotlinDebug\n*F\n+ 1 ContentListReducer.kt\ncom/ibotta/android/content/ContentListReducer\n*L\n30#1:45\n30#1,3:46\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u0013\u001a\u00020\u00142\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016J\u0016\u0010\u0018\u001a\u00020\u00192\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0008\u0010\u001e\u001a\u00020\u001fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006 "
    }
    d2 = {
        "Lcom/ibotta/android/content/ContentListReducer;",
        "",
        "formatting",
        "Lcom/ibotta/android/util/Formatting;",
        "iblvsReducer",
        "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
        "resources",
        "Landroid/content/res/Resources;",
        "titleBarReducer",
        "Lcom/ibotta/android/title/TitleBarReducer;",
        "(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Landroid/content/res/Resources;Lcom/ibotta/android/title/TitleBarReducer;)V",
        "getFormatting",
        "()Lcom/ibotta/android/util/Formatting;",
        "getIblvsReducer",
        "()Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
        "getResources",
        "()Landroid/content/res/Resources;",
        "getTitleBarReducer",
        "()Lcom/ibotta/android/title/TitleBarReducer;",
        "createContentListViewState",
        "Lcom/ibotta/android/views/content/list/ContentListViewState;",
        "contentModels",
        "",
        "Lcom/ibotta/api/model/ContentModel;",
        "createIbottaListViewState",
        "Lcom/ibotta/android/views/list/IbottaListViewState;",
        "createPwiRetailerRow",
        "Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;",
        "buyableGiftCardModel",
        "Lcom/ibotta/api/model/BuyableGiftCardModel;",
        "createTitleBarViewState",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
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
.field private final formatting:Lcom/ibotta/android/util/Formatting;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final iblvsReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final resources:Landroid/content/res/Resources;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Landroid/content/res/Resources;Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/util/Formatting;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/title/TitleBarReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "formatting"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iblvsReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleBarReducer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/ContentListReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    iput-object p2, p0, Lcom/ibotta/android/content/ContentListReducer;->iblvsReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    iput-object p3, p0, Lcom/ibotta/android/content/ContentListReducer;->resources:Landroid/content/res/Resources;

    iput-object p4, p0, Lcom/ibotta/android/content/ContentListReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method

.method private final createIbottaListViewState(Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;)",
            "Lcom/ibotta/android/views/list/IbottaListViewState;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/content/ContentListReducer;->iblvsReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    new-instance v1, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    invoke-direct {v1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;-><init>()V

    .line 29
    invoke-direct {p0}, Lcom/ibotta/android/content/ContentListReducer;->createTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    .line 30
    check-cast p1, Ljava/lang/Iterable;

    .line 45
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 46
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 47
    check-cast v4, Lcom/ibotta/api/model/ContentModel;

    if-eqz v4, :cond_0

    .line 30
    check-cast v4, Lcom/ibotta/api/model/BuyableGiftCardModel;

    invoke-direct {p0, v4}, Lcom/ibotta/android/content/ContentListReducer;->createPwiRetailerRow(Lcom/ibotta/api/model/BuyableGiftCardModel;)Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type com.ibotta.api.model.BuyableGiftCardModel"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 48
    :cond_1
    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    .line 29
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->rows(Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object p1

    .line 31
    sget-object v1, Lcom/ibotta/android/ilv/ListType;->VERTICAL:Lcom/ibotta/android/ilv/ListType;

    .line 28
    invoke-virtual {v0, p1, v1}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->buildWithStyle(Lcom/ibotta/android/views/list/IbottaListViewState$Builder;Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    return-object p1
.end method

.method private final createPwiRetailerRow(Lcom/ibotta/api/model/BuyableGiftCardModel;)Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;
    .locals 9

    .line 37
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerId()I

    move-result v0

    :goto_0
    move v2, v0

    .line 38
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getLargeIconUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    :goto_1
    move-object v3, v0

    goto :goto_3

    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, ""

    goto :goto_1

    :goto_3
    const/4 v4, 0x0

    .line 39
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v1

    :cond_4
    if-eqz v1, :cond_5

    move-object v5, v1

    goto :goto_4

    :cond_5
    const-string v0, ""

    move-object v5, v0

    .line 40
    :goto_4
    iget-object v0, p0, Lcom/ibotta/android/content/ContentListReducer;->resources:Landroid/content/res/Resources;

    .line 41
    sget v1, Lcom/ibotta/android/reducers/R$string;->pwi_earn_s:I

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    .line 42
    iget-object v8, p0, Lcom/ibotta/android/content/ContentListReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRewardPercentage()F

    move-result p1

    invoke-interface {v8, p1}, Lcom/ibotta/android/util/Formatting;->prettifyFloatToStringPercentage(F)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v6, v7

    .line 40
    invoke-virtual {v0, v1, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string p1, "resources.getString(\n   \u2026dModel.rewardPercentage))"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    .line 36
    new-instance p1, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;-><init>(ILjava/lang/String;Lcom/ibotta/android/views/images/Sizes;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private final createTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 3

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/content/ContentListReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    iget-object v1, p0, Lcom/ibotta/android/content/ContentListReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_all:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v1

    sget v2, Lcom/ibotta/android/reducers/R$dimen;->size_7:I

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final createContentListViewState(Ljava/util/List;)Lcom/ibotta/android/views/content/list/ContentListViewState;
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;)",
            "Lcom/ibotta/android/views/content/list/ContentListViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "contentModels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    new-instance v0, Lcom/ibotta/android/views/content/list/ContentListViewState;

    .line 23
    iget-object v1, p0, Lcom/ibotta/android/content/ContentListReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_pay_with_ibotta:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "resources.getString(R.string.pwi_pay_with_ibotta)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/content/ContentListReducer;->createIbottaListViewState(Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    .line 22
    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/views/content/list/ContentListViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-object v0
.end method

.method public final getFormatting()Lcom/ibotta/android/util/Formatting;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/content/ContentListReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    return-object v0
.end method

.method public final getIblvsReducer()Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/content/ContentListReducer;->iblvsReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/content/ContentListReducer;->resources:Landroid/content/res/Resources;

    return-object v0
.end method

.method public final getTitleBarReducer()Lcom/ibotta/android/title/TitleBarReducer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/content/ContentListReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-object v0
.end method

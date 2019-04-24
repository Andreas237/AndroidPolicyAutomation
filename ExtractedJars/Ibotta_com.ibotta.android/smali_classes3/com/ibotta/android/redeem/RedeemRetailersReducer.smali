.class public final Lcom/ibotta/android/redeem/RedeemRetailersReducer;
.super Ljava/lang/Object;
.source "RedeemRetailersReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRedeemRetailersReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedeemRetailersReducer.kt\ncom/ibotta/android/redeem/RedeemRetailersReducer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1301#2:25\n1370#2,3:26\n*E\n*S KotlinDebug\n*F\n+ 1 RedeemRetailersReducer.kt\ncom/ibotta/android/redeem/RedeemRetailersReducer\n*L\n18#1:25\n18#1,3:26\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008J\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/ibotta/android/redeem/RedeemRetailersReducer;",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "(Landroid/content/res/Resources;)V",
        "create",
        "Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;",
        "retailers",
        "",
        "Lcom/ibotta/api/model/RetailerModel;",
        "createEmpty",
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
.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/redeem/RedeemRetailersReducer;->resources:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public final create(Ljava/util/List;)Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "retailers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    check-cast p1, Ljava/lang/Iterable;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 26
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 27
    check-cast v1, Lcom/ibotta/api/model/RetailerModel;

    .line 18
    new-instance v2, Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;

    .line 19
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v3

    .line 20
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "retailer.name"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getIconUrl()Ljava/lang/String;

    move-result-object v5

    const-string v6, "retailer.iconUrl"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getShortDescription()Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-direct {v2, v3, v4, v5, v1}, Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 28
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 17
    new-instance p1, Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;

    invoke-direct {p1, v0}, Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method public final createEmpty()Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/ibotta/android/redeem/RedeemRetailersReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->retailers_empty:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 13
    sget-object v1, Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;->Companion:Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState$Companion;

    const-string v2, "message"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState$Companion;->createEmptyState(Ljava/lang/String;)Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;

    move-result-object v0

    .line 14
    new-instance v1, Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;-><init>(Ljava/util/List;)V

    return-object v1
.end method

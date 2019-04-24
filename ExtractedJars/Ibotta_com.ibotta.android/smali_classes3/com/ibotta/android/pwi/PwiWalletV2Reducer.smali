.class public final Lcom/ibotta/android/pwi/PwiWalletV2Reducer;
.super Ljava/lang/Object;
.source "PwiWalletV2Reducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPwiWalletV2Reducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PwiWalletV2Reducer.kt\ncom/ibotta/android/pwi/PwiWalletV2Reducer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n667#2:35\n740#2,2:36\n667#2:38\n740#2,2:39\n*E\n*S KotlinDebug\n*F\n+ 1 PwiWalletV2Reducer.kt\ncom/ibotta/android/pwi/PwiWalletV2Reducer\n*L\n28#1:35\n28#1,2:36\n29#1:38\n29#1,2:39\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\u00020\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/ibotta/android/pwi/PwiWalletV2Reducer;",
        "",
        "res",
        "Landroid/content/res/Resources;",
        "(Landroid/content/res/Resources;)V",
        "getRes",
        "()Landroid/content/res/Resources;",
        "createDeleteCardDialogViewState",
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewState;",
        "viewState",
        "Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;",
        "createSpentFilterSelectorViewState",
        "Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;",
        "transactions",
        "",
        "Lcom/ibotta/api/model/pwi/BgcTransaction;",
        "selectedFilterType",
        "Lcom/ibotta/android/views/pwi/wallet/SpentFilter;",
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
.field private final res:Landroid/content/res/Resources;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "res"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;->res:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public final createDeleteCardDialogViewState(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
    .locals 11
    .param p1    # Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    .line 17
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;->res:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_remove_payment_method_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 18
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;->res:Landroid/content/res/Resources;

    .line 19
    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_remove_payment_method_description:I

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getCardType()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v4, v6

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getExpDate()Ljava/lang/String;

    move-result-object p1

    const/4 v5, 0x2

    aput-object p1, v4, v5

    .line 18
    invoke-virtual {v1, v2, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 20
    iget-object p1, p0, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;->res:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->pwi_common_yes:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 21
    iget-object p1, p0, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;->res:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->pwi_common_no:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x45

    const/4 v10, 0x0

    move-object v1, v0

    .line 16
    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final createSpentFilterSelectorViewState(Ljava/util/List;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;
    .locals 12
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/pwi/wallet/SpentFilter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/pwi/BgcTransaction;",
            ">;",
            "Lcom/ibotta/android/views/pwi/wallet/SpentFilter;",
            ")",
            "Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "transactions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedFilterType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 26
    new-array v0, v0, [Lkotlin/Pair;

    .line 27
    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ALL:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    iget-object v2, p0, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;->res:Landroid/content/res/Resources;

    sget v3, Lcom/ibotta/android/reducers/R$string;->pwi_spent_filter_all:I

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-virtual {v2, v3, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v7

    .line 28
    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->SPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    iget-object v2, p0, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;->res:Landroid/content/res/Resources;

    sget v3, Lcom/ibotta/android/reducers/R$string;->pwi_spent_filter_spent:I

    new-array v5, v4, [Ljava/lang/Object;

    check-cast p1, Ljava/lang/Iterable;

    .line 35
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .line 36
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/ibotta/api/model/pwi/BgcTransaction;

    .line 28
    invoke-virtual {v10}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v10

    const-string v11, "transaction.spent"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-interface {v6, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 37
    :cond_1
    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    .line 28
    invoke-virtual {v2, v3, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v4

    const/4 v1, 0x2

    .line 29
    sget-object v2, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->UNSPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    iget-object v3, p0, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;->res:Landroid/content/res/Resources;

    sget v5, Lcom/ibotta/android/reducers/R$string;->pwi_spent_filter_unspent:I

    new-array v6, v4, [Ljava/lang/Object;

    .line 38
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .line 39
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/ibotta/api/model/pwi/BgcTransaction;

    .line 29
    invoke-virtual {v10}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    xor-int/2addr v10, v4

    if-eqz v10, :cond_2

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 40
    :cond_3
    check-cast v8, Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v6, v7

    .line 29
    invoke-virtual {v3, v5, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v0, v1

    .line 26
    invoke-static {v0}, Lkotlin/collections/MapsKt;->hashMapOf([Lkotlin/Pair;)Ljava/util/HashMap;

    move-result-object p1

    .line 25
    new-instance v0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;-><init>(Ljava/util/HashMap;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)V

    return-object v0
.end method

.method public final getRes()Landroid/content/res/Resources;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;->res:Landroid/content/res/Resources;

    return-object v0
.end method

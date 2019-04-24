.class public final Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$getFilter$1;
.super Landroid/widget/Filter;
.source "StoresFeedRecyclerViewAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getFilter()Landroid/widget/Filter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStoresFeedRecyclerViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoresFeedRecyclerViewAdapter.kt\ncom/shopkick/app/store/StoresFeedRecyclerViewAdapter$getFilter$1\n*L\n1#1,245:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u001c\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0014\u00a8\u0006\n"
    }
    d2 = {
        "com/shopkick/app/store/StoresFeedRecyclerViewAdapter$getFilter$1",
        "Landroid/widget/Filter;",
        "performFiltering",
        "Landroid/widget/Filter$FilterResults;",
        "charSequence",
        "",
        "publishResults",
        "",
        "constraint",
        "filterResults",
        "Shopkick_defaultFlavorRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 206
    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$getFilter$1;->this$0:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method


# virtual methods
.method protected performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 10
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 209
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$getFilter$1;->this$0:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-static {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->access$getFeedTiles$p(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;)Ljava/util/ArrayList;

    move-result-object v0

    const-string v1, "feedTiles"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-nez v1, :cond_7

    .line 212
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 213
    move-object v3, v1

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 214
    iget-object v4, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$getFilter$1;->this$0:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-static {v4}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->access$getFeedTiles$p(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v5, v3

    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 215
    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const/4 v8, -0x6

    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v8, :cond_3

    move-object v5, v6

    goto :goto_1

    .line 217
    :cond_3
    :goto_2
    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    if-eqz v7, :cond_1

    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    const-string/jumbo v8, "tile.chainName"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    const-string v8, "(this as java.lang.String).toLowerCase()"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/CharSequence;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    const-string v9, "(this as java.lang.String).toLowerCase()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/lang/CharSequence;

    const/4 v9, 0x2

    invoke-static {v7, v8, v2, v9, v1}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    if-eqz v5, :cond_4

    .line 220
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v5, v3

    .line 223
    :cond_4
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 217
    :cond_5
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 228
    :cond_7
    new-instance p1, Landroid/widget/Filter$FilterResults;

    invoke-direct {p1}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 229
    iput-object v0, p1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    return-object p1
.end method

.method protected publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 2
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/widget/Filter$FilterResults;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 235
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$getFilter$1;->this$0:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getStoreSearchFilter()Landroid/widget/Filter;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$getFilter$1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p2, :cond_0

    .line 236
    iget-object p2, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    check-cast p2, Ljava/util/ArrayList;

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$getFilter$1;->this$0:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-static {v0, p2}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->access$setSearchFilterResults$p(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;Ljava/util/ArrayList;)V

    .line 239
    iget-object p2, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$getFilter$1;->this$0:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-static {p2}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->access$getSearchFilterResults$p(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, ""

    :goto_2
    invoke-static {p2, v0, p1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->access$updateSearchResults(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;Ljava/util/ArrayList;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

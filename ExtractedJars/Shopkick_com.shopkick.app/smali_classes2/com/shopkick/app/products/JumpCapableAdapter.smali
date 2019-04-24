.class public interface abstract Lcom/shopkick/app/products/JumpCapableAdapter;
.super Ljava/lang/Object;
.source "JumpCapableAdapter.java"


# virtual methods
.method public abstract getCategoryTileForPosition(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
.end method

.method public abstract getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.end method

.method public abstract getFilteredTiles()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getItemViewType(I)I
.end method

.method public abstract isHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
.end method

.method public abstract registerAdapterDataObserver(Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;)V
.end method

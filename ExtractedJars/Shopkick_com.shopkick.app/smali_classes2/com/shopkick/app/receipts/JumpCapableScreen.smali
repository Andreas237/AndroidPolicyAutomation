.class public interface abstract Lcom/shopkick/app/receipts/JumpCapableScreen;
.super Ljava/lang/Object;
.source "JumpCapableScreen.java"


# virtual methods
.method public abstract checkJumpHeaderTile()V
.end method

.method public abstract onTilesLoaded(Ljava/util/ArrayList;Ljava/util/HashMap;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showJumpToCategory()V
.end method

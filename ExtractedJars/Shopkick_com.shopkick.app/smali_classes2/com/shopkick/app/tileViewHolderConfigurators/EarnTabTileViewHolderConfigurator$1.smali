.class Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$1;
.super Ljava/util/ArrayList;
.source "EarnTabTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->setupClickLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const/4 p1, 0x4

    .line 152
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$1;->add(Ljava/lang/Object;)Z

    return-void
.end method

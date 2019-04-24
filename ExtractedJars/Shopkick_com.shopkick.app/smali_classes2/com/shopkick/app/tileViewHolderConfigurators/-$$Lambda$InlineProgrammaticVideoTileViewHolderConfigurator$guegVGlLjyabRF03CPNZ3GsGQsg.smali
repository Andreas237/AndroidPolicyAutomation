.class public final synthetic Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$guegVGlLjyabRF03CPNZ3GsGQsg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

.field private final synthetic f$1:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

.field private final synthetic f$2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$guegVGlLjyabRF03CPNZ3GsGQsg;->f$0:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$guegVGlLjyabRF03CPNZ3GsGQsg;->f$1:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$guegVGlLjyabRF03CPNZ3GsGQsg;->f$2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$guegVGlLjyabRF03CPNZ3GsGQsg;->f$0:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$guegVGlLjyabRF03CPNZ3GsGQsg;->f$1:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$guegVGlLjyabRF03CPNZ3GsGQsg;->f$2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->lambda$updateCountdown$60(Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

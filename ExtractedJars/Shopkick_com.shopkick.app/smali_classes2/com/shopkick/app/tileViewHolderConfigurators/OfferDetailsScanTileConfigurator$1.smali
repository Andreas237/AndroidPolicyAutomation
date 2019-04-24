.class Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator$1;
.super Ljava/lang/Object;
.source "OfferDetailsScanTileConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 222
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;

    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;)Lcom/shopkick/app/util/NotificationCenter;

    move-result-object p1

    const-string v0, "ShowVideoBonusKicksDialogFragment"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

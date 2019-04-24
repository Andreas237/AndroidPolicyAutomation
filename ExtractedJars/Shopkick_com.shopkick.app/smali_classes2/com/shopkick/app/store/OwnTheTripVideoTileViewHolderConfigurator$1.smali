.class Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$1;
.super Ljava/lang/Object;
.source "OwnTheTripVideoTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

.field final synthetic val$tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$1;->val$tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 172
    iget-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {p1}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$1;->val$tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method

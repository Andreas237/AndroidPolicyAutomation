.class Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator$1;
.super Ljava/lang/Object;
.source "ReceiptProductSelectorForceItemCheckTileConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;

.field final synthetic val$isK4RRstore:Z


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;Z)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;

    iput-boolean p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator$1;->val$isK4RRstore:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 59
    iget-boolean p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator$1;->val$isK4RRstore:Z

    if-eqz p1, :cond_0

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;Z)V

    .line 61
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;

    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->access$100(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    const-string/jumbo v0, "sk://screen/top/webview?url=https://s3-us-west-2.amazonaws.com/shopkick-prod-programming/Grocery+Launch/Grocery+Receipt+Submission/how-to-receipt.html"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    goto :goto_0

    .line 63
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;Z)V

    .line 64
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    .line 65
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v0

    const-class v1, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;

    .line 66
    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 67
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 68
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->showNextOverlay()V

    :goto_0
    return-void
.end method

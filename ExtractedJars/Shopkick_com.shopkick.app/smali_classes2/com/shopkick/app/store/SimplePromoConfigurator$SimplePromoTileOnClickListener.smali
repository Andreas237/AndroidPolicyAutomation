.class Lcom/shopkick/app/store/SimplePromoConfigurator$SimplePromoTileOnClickListener;
.super Ljava/lang/Object;
.source "SimplePromoConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/SimplePromoConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SimplePromoTileOnClickListener"
.end annotation


# instance fields
.field private promoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field final synthetic this$0:Lcom/shopkick/app/store/SimplePromoConfigurator;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/store/SimplePromoConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/shopkick/app/store/SimplePromoConfigurator$SimplePromoTileOnClickListener;->this$0:Lcom/shopkick/app/store/SimplePromoConfigurator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 147
    iput-object p2, p0, Lcom/shopkick/app/store/SimplePromoConfigurator$SimplePromoTileOnClickListener;->promoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 148
    iput-object p3, p0, Lcom/shopkick/app/store/SimplePromoConfigurator$SimplePromoTileOnClickListener;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 153
    iget-object p1, p0, Lcom/shopkick/app/store/SimplePromoConfigurator$SimplePromoTileOnClickListener;->this$0:Lcom/shopkick/app/store/SimplePromoConfigurator;

    iget-object v0, p0, Lcom/shopkick/app/store/SimplePromoConfigurator$SimplePromoTileOnClickListener;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v1, p0, Lcom/shopkick/app/store/SimplePromoConfigurator$SimplePromoTileOnClickListener;->promoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {p1, v0, v1}, Lcom/shopkick/app/store/SimplePromoConfigurator;->access$001(Lcom/shopkick/app/store/SimplePromoConfigurator;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

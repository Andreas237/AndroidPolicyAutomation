.class public Lcom/shopkick/app/util/CommonClickUtils$OnlineOfferButtonClickListener;
.super Ljava/lang/Object;
.source "CommonClickUtils.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/CommonClickUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OnlineOfferButtonClickListener"
.end annotation


# instance fields
.field private mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 308
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 309
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$OnlineOfferButtonClickListener;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    .line 310
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$OnlineOfferButtonClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 315
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$OnlineOfferButtonClickListener;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$OnlineOfferButtonClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/store/MCommerceManager;->loadOnlineOffer(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

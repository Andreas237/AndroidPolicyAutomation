.class Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;
.super Ljava/lang/Object;
.source "OfferPostScanNotificationTileConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NotificationSetClickListener"
.end annotation


# instance fields
.field private chainId:Ljava/lang/String;

.field private chainName:Ljava/lang/String;

.field private locationId:Ljava/lang/String;

.field private postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

.field private productFamilyId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/products/PostScanNotificationController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    .line 156
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->chainId:Ljava/lang/String;

    .line 157
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->locationId:Ljava/lang/String;

    .line 158
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->productFamilyId:Ljava/lang/String;

    .line 159
    iput-object p5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->chainName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->locationId:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_1

    .line 166
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f090014

    if-eq p1, v0, :cond_2

    const v0, 0x7f0900c6

    if-eq p1, v0, :cond_1

    goto :goto_0

    .line 179
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->locationId:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/products/PostScanNotificationController;->removeNotification(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 168
    :cond_2
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    .line 169
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v0

    const-class v1, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->chainId:Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->locationId:Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->productFamilyId:Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;->chainName:Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    .line 175
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    :goto_0
    return-void

    :cond_3
    :goto_1
    return-void
.end method

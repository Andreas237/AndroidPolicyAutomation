.class public Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "ProductScanInfo.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public additionalDetails:Ljava/lang/String;

.field public barcodeScanCompleted:Ljava/lang/Boolean;

.field public barcodeScanKicks:Ljava/lang/Integer;

.field public barcodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public campaignId:Ljava/lang/String;

.field public chainIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public displayProductHierarchyId:Ljava/lang/String;

.field public displayTaxonomyNodeId:Ljava/lang/String;

.field public expirationTimestamp:Ljava/lang/Long;

.field public imageRecognitionScanCompleted:Ljava/lang/Boolean;

.field public imageRecognitionScanDescriptionText:Ljava/lang/String;

.field public imageRecognitionScanKicks:Ljava/lang/Integer;

.field public imageRecognitionScanLargeImageUrl:Ljava/lang/String;

.field public imageRecognitionScanThumbnailImageUrl:Ljava/lang/String;

.field public imageRecognitionScanTokenId:Ljava/lang/String;

.field public isExpired:Ljava/lang/Boolean;

.field public largeImageUrl:Ljava/lang/String;

.field public minimumAgeForKicks:Ljava/lang/Integer;

.field public minimumPurchaseRequirement:Ljava/lang/Integer;

.field public offerBundleIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public postScanImageUrl:Ljava/lang/String;

.field public productCategory:Ljava/lang/String;

.field public productFamilyId:Ljava/lang/String;

.field public productHierarchyId:Ljava/lang/String;

.field public receiptScanCompleted:Ljava/lang/Boolean;

.field public receiptScanKicks:Ljava/lang/Integer;

.field public scanDetailViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

.field public scanPostRewardOverlayViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

.field public smallImageUrl:Ljava/lang/String;

.field public subtitle:Ljava/lang/String;

.field public taxonomyNodeId:Ljava/lang/String;

.field public title:Ljava/lang/String;

.field public videoCompleted:Ljava/lang/Boolean;

.field public videoDescriptionText:Ljava/lang/String;

.field public videoId:Ljava/lang/Long;

.field public videoKicks:Ljava/lang/Integer;

.field public videoThumbnailImageUrl:Ljava/lang/String;

.field public videoUrl:Ljava/lang/String;

.field public videoUrlType:Ljava/lang/Integer;

.field public viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;
    .locals 2

    .line 72
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    if-eqz p1, :cond_0

    .line 73
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;
    .locals 1

    .line 67
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanCompleted:Ljava/lang/Boolean;

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanCompleted:Ljava/lang/Boolean;

    .line 87
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->isExpired:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->isExpired:Ljava/lang/Boolean;

    .line 88
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->postProcess()V

    .line 89
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->scanDetailViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->postProcess()V

    .line 90
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->scanPostRewardOverlayViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->postProcess()V

    .line 92
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->imageRecognitionScanCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_6

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->imageRecognitionScanCompleted:Ljava/lang/Boolean;

    .line 93
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->videoCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_7

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->videoCompleted:Ljava/lang/Boolean;

    :cond_7
    return-void
.end method

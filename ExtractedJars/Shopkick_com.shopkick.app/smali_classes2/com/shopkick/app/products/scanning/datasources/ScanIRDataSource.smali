.class public Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;
.super Ljava/lang/Object;
.source "ScanIRDataSource.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/craftar/CraftAROnDeviceCollectionManager$AddCollectionListener;
.implements Lcom/craftar/SetOnDeviceCollectionListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;
    }
.end annotation


# static fields
.field public static final EVENT_COLLECTION_LOAD_FAILED:Ljava/lang/String; = "eventCollectionLoadFailed"

.field public static final EVENT_COLLECTION_LOAD_STARTED:Ljava/lang/String; = "eventCollectionLoadStarted"

.field public static final EVENT_COLLECTION_LOAD_SUCCESS:Ljava/lang/String; = "eventCollectionLoadSuccess"

.field public static final EVENT_SCAN_IR_RESPONSE_FAILURE:Ljava/lang/String; = "eventScanIrResponseFailure"

.field public static final EVENT_SCAN_IR_RESPONSE_FAILURE_INTERNET:Ljava/lang/String; = "eventScanIrResponseFailureInternet"

.field public static final EVENT_SCAN_IR_RESPONSE_SUCCESS:Ljava/lang/String; = "eventScanIrResponseSuccess"

.field public static final KEY_COLLECTION_LOAD_STATE:Ljava/lang/String; = "paramCollectionLoadState"

.field public static final KEY_PRODUCT_FAMILY_ID:Ljava/lang/String; = "paramProductFamilyId"

.field public static final KEY_SCAN_IR_RESPONSE:Ljava/lang/String; = "scanIRResponseKey"

.field public static final SCAN_IR_CLIENT_SIDE_VALIDATION_ERROR_WITH_STATUS:Ljava/lang/String; = "scanIRErrorWithStatus"

.field public static final SCAN_IR_ERROR_STATUS_KEY:Ljava/lang/String; = "scanIRErrorStatusKey"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private awardsManager:Lcom/shopkick/app/awards/AwardsManager;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private collectionManager:Lcom/craftar/CraftAROnDeviceCollectionManager;

.field private craftAROnDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

.field private irErrorsRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;

.field private irScanErrors:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ScanError;",
            ">;"
        }
    .end annotation
.end field

.field private irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

.field private irScanResponse:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanResponse;

.field private lastScanTimeMs:J

.field private loadingState:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private tokenID:Ljava/lang/String;

.field private validatingScanDialog:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/awards/AwardsManager;)V
    .locals 0

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 104
    iput-object p3, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 105
    iput-object p4, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 106
    iput-object p5, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 107
    iput-object p6, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    const-wide/16 p2, 0x0

    .line 109
    iput-wide p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->lastScanTimeMs:J

    .line 111
    sget-object p2, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;->EMPTY:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->loadingState:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    .line 113
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->init(Landroid/content/Context;)V

    return-void
.end method

.method private init(Landroid/content/Context;)V
    .locals 1

    .line 120
    invoke-static {}, Lcom/craftar/CraftARSDK;->Instance()Lcom/craftar/CraftARSDK;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/craftar/CraftARSDK;->init(Landroid/content/Context;)V

    .line 123
    invoke-static {}, Lcom/craftar/CraftAROnDeviceCollectionManager;->Instance()Lcom/craftar/CraftAROnDeviceCollectionManager;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->collectionManager:Lcom/craftar/CraftAROnDeviceCollectionManager;

    .line 126
    invoke-static {}, Lcom/craftar/CraftAROnDeviceIR;->Instance()Lcom/craftar/CraftAROnDeviceIR;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->craftAROnDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

    .line 129
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->deleteCollection()V

    return-void
.end method

.method private loadCollection()V
    .locals 2

    .line 249
    sget-object v0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;->LOADING:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    iput-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->loadingState:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    .line 251
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->collectionManager:Lcom/craftar/CraftAROnDeviceCollectionManager;

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->tokenID:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Lcom/craftar/CraftAROnDeviceCollectionManager;->addCollectionWithToken(Ljava/lang/String;Lcom/craftar/CraftAROnDeviceCollectionManager$AddCollectionListener;)V

    const-string v0, "eventCollectionLoadStarted"

    .line 252
    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->notifyEvent(Ljava/lang/String;)V

    return-void
.end method

.method private logFailedScanRequest(I)V
    .locals 5

    .line 282
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    if-eqz v0, :cond_2

    .line 283
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x3b9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 284
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 285
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->lat:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 286
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->lng:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 287
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->accuracy:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAccuracy(Ljava/lang/Double;)V

    .line 288
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->currTimestamp:Ljava/lang/Long;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->coordTimestamp:Ljava/lang/Long;

    if-eqz v1, :cond_0

    .line 289
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->currTimestamp:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v3, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->coordTimestamp:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sub-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCoordAge(Ljava/lang/Integer;)V

    .line 291
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductIds(Ljava/util/ArrayList;)V

    .line 292
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getProductIds()Ljava/util/ArrayList;

    move-result-object v1

    if-nez v1, :cond_1

    .line 293
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductIds(Ljava/util/ArrayList;)V

    .line 295
    :cond_1
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getProductIds()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHttpStatusCode(Ljava/lang/Integer;)V

    const/4 p1, 0x2

    .line 297
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMode(Ljava/lang/String;)V

    .line 299
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public addCollectionFailed(Lcom/craftar/CraftARError;)V
    .locals 0

    .line 334
    sget-object p1, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;->FAILED:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    iput-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->loadingState:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    const-string p1, "eventCollectionLoadFailed"

    .line 335
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->notifyEvent(Ljava/lang/String;)V

    return-void
.end method

.method public addCollectionProgress(F)V
    .locals 0

    return-void
.end method

.method public clearStateOnScreenDestroyed()V
    .locals 2

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 224
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irErrorsRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 225
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    .line 226
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irErrorsRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;

    .line 227
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->validatingScanDialog:Landroid/app/ProgressDialog;

    return-void
.end method

.method public collectionAdded(Lcom/craftar/CraftAROnDeviceCollection;)V
    .locals 1

    .line 329
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->craftAROnDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

    invoke-virtual {v0, p1, p0}, Lcom/craftar/CraftAROnDeviceIR;->setCollection(Lcom/craftar/CraftAROnDeviceCollection;Lcom/craftar/SetOnDeviceCollectionListener;)V

    return-void
.end method

.method public collectionReady(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/craftar/CraftARError;",
            ">;)V"
        }
    .end annotation

    .line 343
    sget-object p1, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;->LOADED:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    iput-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->loadingState:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    const-string p1, "eventCollectionLoadSuccess"

    .line 344
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->notifyEvent(Ljava/lang/String;)V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    if-ne p1, v0, :cond_3

    .line 313
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    const-string p1, "eventScanIrResponseSuccess"

    .line 314
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanResponse;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->notifyEventWithResponse(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanResponse;)V

    goto :goto_0

    :cond_0
    const-string p1, "eventScanIrResponseFailure"

    .line 318
    iget v0, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget v0, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_2

    :cond_1
    const-string p1, "eventScanIrResponseFailureInternet"

    .line 321
    :cond_2
    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanResponse;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->notifyEventWithResponse(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanResponse;)V

    .line 322
    invoke-virtual {p2}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->logFailedScanRequest(I)V

    :cond_3
    :goto_0
    return-void
.end method

.method public deleteCollection()V
    .locals 3

    .line 256
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->tokenID:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 257
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->collectionManager:Lcom/craftar/CraftAROnDeviceCollectionManager;

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->tokenID:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/craftar/CraftAROnDeviceCollectionManager;->deleteCollection(Ljava/lang/String;Lcom/craftar/CraftAROnDeviceCollectionManager$DeleteCollectionListener;)V

    .line 260
    :cond_0
    sget-object v0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;->EMPTY:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    iput-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->loadingState:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    return-void
.end method

.method public destroy()V
    .locals 2

    const/4 v0, 0x0

    .line 133
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->collectionManager:Lcom/craftar/CraftAROnDeviceCollectionManager;

    .line 134
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->craftAROnDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

    invoke-virtual {v1, v0}, Lcom/craftar/CraftAROnDeviceIR;->setCraftARSearchResponseHandler(Lcom/craftar/CraftARSearchResponseHandler;)V

    .line 135
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->craftAROnDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

    .line 137
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->deleteCollection()V

    .line 138
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->validatingScanDialog:Landroid/app/ProgressDialog;

    return-void
.end method

.method public getTokenID()Ljava/lang/String;
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->tokenID:Ljava/lang/String;

    return-object v0
.end method

.method public isLoadingCollection()Z
    .locals 2

    .line 235
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->loadingState:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    sget-object v1, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;->LOADING:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public loadCollection(Ljava/lang/String;)V
    .locals 2

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->tokenID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->loadingState:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    sget-object v1, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;->LOADED:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    if-ne v0, v1, :cond_0

    return-void

    .line 242
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->tokenID:Ljava/lang/String;

    .line 244
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->deleteCollection()V

    .line 245
    invoke-direct {p0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->loadCollection()V

    return-void
.end method

.method public notifyEvent(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 264
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->notifyEventWithResponse(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanResponse;)V

    return-void
.end method

.method public notifyEventWithResponse(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanResponse;)V
    .locals 3

    .line 268
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p2, :cond_1

    .line 271
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanResponse;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v1, :cond_0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanResponse;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, "paramProductFamilyId"

    .line 272
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanResponse;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v1, "scanIRResponseKey"

    .line 274
    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string p2, "paramCollectionLoadState"

    .line 276
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->loadingState:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p2, p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 305
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->validatingScanDialog:Landroid/app/ProgressDialog;

    if-eqz p1, :cond_0

    .line 306
    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method public requestValidateImageRecognition(Ljava/lang/String;[BLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/DeviceInfo;Landroid/app/ProgressDialog;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 6

    .line 150
    iput-object p7, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->validatingScanDialog:Landroid/app/ProgressDialog;

    .line 151
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    if-nez v0, :cond_6

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 155
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {v0}, Lcom/shopkick/app/awards/AwardsManager;->clearExpiredRequests()V

    .line 158
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->lastScanTimeMs:J

    iget-object v4, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v4, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->scanningMinimumIntervalSec:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    mul-int/lit16 v4, v4, 0x3e8

    int-to-long v4, v4

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    .line 159
    invoke-virtual {p7}, Landroid/app/ProgressDialog;->dismiss()V

    .line 161
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p2, "scanIRErrorStatusKey"

    const/4 p3, 0x5

    .line 162
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "scanIRErrorWithStatus"

    invoke-virtual {p2, p3, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void

    .line 167
    :cond_1
    new-instance p7, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    invoke-direct {p7}, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;-><init>()V

    iput-object p7, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    .line 168
    iget-object p7, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    iput-object p1, p7, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->productFamilyId:Ljava/lang/String;

    .line 169
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p7, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->confidence:Ljava/lang/Double;

    .line 170
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    iput-object p4, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->locationId:Ljava/lang/String;

    .line 171
    iput-object p5, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->chainId:Ljava/lang/String;

    .line 174
    new-instance p1, Ljava/lang/String;

    invoke-static {p2}, Lorg/bouncycastle/util/encoders/Base64;->encode([B)[B

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/String;-><init>([B)V

    .line 175
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->imageData:Ljava/lang/String;

    .line 177
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_2

    .line 178
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 179
    invoke-virtual {p6}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDeviceModel(Ljava/lang/String;)V

    const/4 p2, 0x3

    .line 180
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScanImageFailureType(Ljava/lang/Integer;)V

    const/4 p2, 0x2

    .line 181
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMode(Ljava/lang/String;)V

    .line 182
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 186
    :cond_2
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 188
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->lat:Ljava/lang/Double;

    .line 189
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->lng:Ljava/lang/Double;

    .line 190
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result p3

    float-to-double p3, p3

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->accuracy:Ljava/lang/Double;

    .line 191
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->coordTimestamp:Ljava/lang/Long;

    .line 193
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    invoke-virtual {p1}, Landroid/location/Location;->isFromMockProvider()Z

    move-result p3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->mStatus:Ljava/lang/Boolean;

    .line 194
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->provider:Ljava/lang/String;

    .line 196
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->currTimestamp:Ljava/lang/Long;

    .line 197
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    const p2, 0x7f10000a

    invoke-virtual {p6, p2}, Lcom/shopkick/app/application/DeviceInfo;->getKcid(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->kcid:Ljava/lang/String;

    .line 198
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    invoke-virtual {p6}, Lcom/shopkick/app/application/DeviceInfo;->getAdd()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->add:Ljava/lang/String;

    .line 201
    iget-object p1, p8, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz p1, :cond_4

    iget-object p1, p8, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 202
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    iget-object p2, p8, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    invoke-static {p2}, Lcom/shopkick/app/util/DateUtils;->stringToDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p2

    .line 203
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide p2

    .line 202
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->userSpecifiedBirthdateMs:Ljava/lang/Long;

    goto :goto_0

    :cond_4
    const-string/jumbo p1, "user_birthday"

    .line 204
    invoke-virtual {p9, p1}, Lcom/shopkick/app/application/AppPreferences;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 205
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    const-string/jumbo p2, "user_birthday"

    invoke-virtual {p9, p2}, Lcom/shopkick/app/application/AppPreferences;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/shopkick/app/util/DateUtils;->stringToDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p2

    .line 206
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide p2

    .line 205
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->userSpecifiedBirthdateMs:Ljava/lang/Long;

    .line 216
    :cond_5
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->irScanRequest:Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    invoke-virtual {p1, p2, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void

    :cond_6
    :goto_1
    return-void
.end method

.method public setCollectionFailed(Lcom/craftar/CraftARError;)V
    .locals 0

    .line 352
    sget-object p1, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;->FAILED:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    iput-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->loadingState:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource$LoadingState;

    const-string p1, "eventCollectionLoadFailed"

    .line 353
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->notifyEvent(Ljava/lang/String;)V

    return-void
.end method

.method public setCollectionProgress(D)V
    .locals 0

    return-void
.end method

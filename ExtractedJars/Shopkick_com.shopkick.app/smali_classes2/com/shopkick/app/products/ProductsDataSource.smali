.class public Lcom/shopkick/app/products/ProductsDataSource;
.super Lcom/shopkick/app/application/UserSavedStateDataSource;
.source "ProductsDataSource.java"


# static fields
.field public static final PRODUCTS_UPDATED_EVENT:Ljava/lang/String; = "productsUpdatedEvent"

.field public static final PRODUCT_ID_KEY:Ljava/lang/String; = "productIdKey"

.field public static final PRODUCT_KEY:Ljava/lang/String; = "productKey"

.field public static final PRODUCT_SAVED_STATE_UPDATED_EVENT:Ljava/lang/String; = "productSavedStateUpdated"

.field public static final PRODUCT_SAVE_REQUEST_COMPLETED_EVENT:Ljava/lang/String; = "productSaveRequestCompleted"

.field public static final PRODUCT_UPDATE_EVENT:Ljava/lang/String; = "productUpdated"

.field public static final PRODUCT_UPDATE_FAILED_EVENT:Ljava/lang/String; = "productUpdateFailed"


# instance fields
.field private getProductsRequests:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/GetProductsRequest;",
            ">;"
        }
    .end annotation
.end field

.field private productIdToRequestMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/GetProductRequest;",
            ">;"
        }
    .end annotation
.end field

.field private productIdsToProducts:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/Product;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/application/UserSavedStateDataSource;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V

    .line 44
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/products/ProductsDataSource;->productIdToRequestMap:Ljava/util/HashMap;

    .line 46
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/products/ProductsDataSource;->productIdsToProducts:Ljava/util/HashMap;

    .line 47
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/products/ProductsDataSource;->getProductsRequests:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public cancelProductFetch(Ljava/lang/String;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/products/ProductsDataSource;->productIdToRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetProductRequest;

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/products/ProductsDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, p1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    return-void
.end method

.method public clear()V
    .locals 3

    .line 52
    invoke-super {p0}, Lcom/shopkick/app/application/UserSavedStateDataSource;->clear()V

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/products/ProductsDataSource;->productIdsToProducts:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/products/ProductsDataSource;->getProductsRequests:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetProductsRequest;

    .line 56
    iget-object v2, p0, Lcom/shopkick/app/products/ProductsDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    goto :goto_0

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ProductsDataSource;->getProductsRequests:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 170
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/application/UserSavedStateDataSource;->completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    .line 171
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetProductRequest;

    if-eqz v0, :cond_1

    .line 172
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetProductRequest;

    .line 173
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "productIdKey"

    .line 174
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetProductRequest;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    iget-boolean v1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_0

    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v1, :cond_0

    const-string v1, "productKey"

    .line 176
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetProductResponse;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetProductResponse;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    iget-object p2, p0, Lcom/shopkick/app/products/ProductsDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "productUpdated"

    invoke-virtual {p2, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_0

    .line 179
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/products/ProductsDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "productUpdateFailed"

    invoke-virtual {p2, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 181
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/products/ProductsDataSource;->productIdToRequestMap:Ljava/util/HashMap;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetProductRequest;->productId:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 182
    :cond_1
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetProductsRequest;

    if-eqz v0, :cond_4

    .line 183
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetProductsRequest;

    .line 184
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_3

    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 185
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetProductsResponse;

    .line 186
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetProductsResponse;->products:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/Product;

    .line 187
    iget-object v1, p0, Lcom/shopkick/app/products/ProductsDataSource;->productIdsToProducts:Ljava/util/HashMap;

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/Product;->productId:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 189
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/products/ProductsDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "productsUpdatedEvent"

    invoke-virtual {p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_2

    .line 191
    :cond_3
    iget-object p2, p0, Lcom/shopkick/app/products/ProductsDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "productUpdateFailed"

    invoke-virtual {p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 193
    :goto_2
    iget-object p2, p0, Lcom/shopkick/app/products/ProductsDataSource;->getProductsRequests:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_4
    :goto_3
    return-void
.end method

.method protected createSaveOrUnsaveRequest(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    if-eqz p2, :cond_0

    .line 68
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/SaveProductRequest;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/SaveProductRequest;-><init>()V

    .line 69
    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/SaveProductRequest;->productId:Ljava/lang/String;

    return-object p2

    .line 72
    :cond_0
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/UnsaveProductRequest;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/UnsaveProductRequest;-><init>()V

    .line 73
    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/UnsaveProductRequest;->productId:Ljava/lang/String;

    return-object p2
.end method

.method protected didResponseFail(Lcom/shopkick/fetchers/DataResponse;)Z
    .locals 3

    .line 110
    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v0, v0, Lcom/shopkick/app/fetchers/api/skapi/SaveProductResponse;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 111
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/SaveProductResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveProductResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    .line 112
    :cond_1
    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v0, v0, Lcom/shopkick/app/fetchers/api/skapi/UnsaveProductResponse;

    if-eqz v0, :cond_3

    .line 113
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveProductResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveProductResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    return v1

    :cond_3
    return v2
.end method

.method public fetchProduct(Ljava/lang/String;Ljava/lang/String;Landroid/location/Location;)V
    .locals 3

    .line 123
    iget-object v0, p0, Lcom/shopkick/app/products/ProductsDataSource;->productIdToRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 127
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetProductRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetProductRequest;-><init>()V

    .line 128
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetProductRequest;->productId:Ljava/lang/String;

    .line 129
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetProductRequest;->chainId:Ljava/lang/String;

    if-eqz p3, :cond_1

    .line 131
    invoke-virtual {p3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetProductRequest;->latitude:Ljava/lang/Double;

    .line 132
    invoke-virtual {p3}, Landroid/location/Location;->getLongitude()D

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetProductRequest;->longitude:Ljava/lang/Double;

    .line 134
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/products/ProductsDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p2, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 135
    iget-object p2, p0, Lcom/shopkick/app/products/ProductsDataSource;->productIdToRequestMap:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public fetchProducts(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 152
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 156
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetProductsRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetProductsRequest;-><init>()V

    .line 157
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetProductsRequest;->productIds:Ljava/util/List;

    .line 158
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 160
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetProductsRequest;->latitude:Ljava/lang/Double;

    .line 161
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetProductsRequest;->longitude:Ljava/lang/Double;

    .line 164
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/products/ProductsDataSource;->getProductsRequests:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    iget-object p1, p0, Lcom/shopkick/app/products/ProductsDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method public getProductForProductId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/Product;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/products/ProductsDataSource;->productIdsToProducts:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/products/ProductsDataSource;->productIdsToProducts:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/Product;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected getRequestItemId(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;
    .locals 1

    .line 85
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveProductRequest;

    if-eqz v0, :cond_0

    .line 86
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/SaveProductRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveProductRequest;->productId:Ljava/lang/String;

    return-object p1

    .line 87
    :cond_0
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveProductRequest;

    if-eqz v0, :cond_1

    .line 88
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveProductRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveProductRequest;->productId:Ljava/lang/String;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected getSaveRequestCompletedNotificationEvent()Ljava/lang/String;
    .locals 1

    const-string v0, "productSaveRequestCompleted"

    return-object v0
.end method

.method protected getSaveUpdatedNotificationEvent()Ljava/lang/String;
    .locals 1

    const-string v0, "productSavedStateUpdated"

    return-object v0
.end method

.method protected isRequestSaving(Lcom/shopkick/app/fetchers/api/IAPIObject;)Z
    .locals 0

    .line 95
    instance-of p1, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveProductRequest;

    return p1
.end method

.method protected isSaveOrUnsaveRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)Z
    .locals 1

    .line 80
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveProductRequest;

    if-nez v0, :cond_1

    instance-of p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveProductRequest;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

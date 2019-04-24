.class public Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "GetStoreListRequest.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public filterType:Ljava/lang/Integer;

.field public isOnlineStore:Ljava/lang/Boolean;

.field public latitude:Ljava/lang/Double;

.field public longitude:Ljava/lang/Double;

.field public previousPageKey:Ljava/lang/String;

.field public targetType:Ljava/lang/Integer;

.field public userLatitude:Ljava/lang/Double;

.field public userLongitude:Ljava/lang/Double;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;
    .locals 2

    .line 40
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    if-eqz p1, :cond_0

    .line 41
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->isOnlineStore:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->isOnlineStore:Ljava/lang/Boolean;

    :cond_0
    return-void
.end method

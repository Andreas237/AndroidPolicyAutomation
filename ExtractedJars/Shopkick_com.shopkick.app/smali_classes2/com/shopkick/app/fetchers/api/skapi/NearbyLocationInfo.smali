.class public Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "NearbyLocationInfo.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public chainId:Ljava/lang/String;

.field public districtId:Ljava/lang/String;

.field public fencingRadius:Ljava/lang/Integer;

.field public geofencingStateId:Ljava/lang/String;

.field public latitude:Ljava/lang/Double;

.field public locationId:Ljava/lang/String;

.field public longitude:Ljava/lang/Double;

.field public message:Ljava/lang/String;

.field public messageTemplateId:Ljava/lang/Integer;

.field public name:Ljava/lang/String;

.field public redirectSklink:Ljava/lang/String;

.field public summary:Ljava/lang/String;

.field public title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;
    .locals 2

    .line 45
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;

    if-eqz p1, :cond_0

    .line 46
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;
    .locals 1

    .line 40
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 0

    return-void
.end method

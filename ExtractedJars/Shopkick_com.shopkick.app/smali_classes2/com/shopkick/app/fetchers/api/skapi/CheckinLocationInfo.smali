.class public Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "CheckinLocationInfo.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public chainId:Ljava/lang/String;

.field public chainName:Ljava/lang/String;

.field public departmentCodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public departmentId:Ljava/lang/String;

.field public isFavorite:Ljava/lang/Boolean;

.field public isPartner:Ljava/lang/Boolean;

.field public lat:Ljava/lang/Double;

.field public leftImageUrl:Ljava/lang/String;

.field public lng:Ljava/lang/Double;

.field public locationId:Ljava/lang/String;

.field public mainText:Ljava/lang/String;

.field public transmitterIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;
    .locals 2

    .line 44
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    if-eqz p1, :cond_0

    .line 45
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;
    .locals 1

    .line 39
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->isFavorite:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->isFavorite:Ljava/lang/Boolean;

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->isPartner:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->isPartner:Ljava/lang/Boolean;

    :cond_1
    return-void
.end method

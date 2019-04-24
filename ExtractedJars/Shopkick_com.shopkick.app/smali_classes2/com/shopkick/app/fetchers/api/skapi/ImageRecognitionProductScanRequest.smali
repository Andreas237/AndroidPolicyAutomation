.class public Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "ImageRecognitionProductScanRequest.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public accuracy:Ljava/lang/Double;

.field public add:Ljava/lang/String;

.field public chainId:Ljava/lang/String;

.field public comp:Ljava/lang/Boolean;

.field public confidence:Ljava/lang/Double;

.field public coordTimestamp:Ljava/lang/Long;

.field public currTimestamp:Ljava/lang/Long;

.field public fStatus:Ljava/lang/Integer;

.field public imageData:Ljava/lang/String;

.field public imageUuid:Ljava/lang/String;

.field public kcid:Ljava/lang/String;

.field public lat:Ljava/lang/Double;

.field public lng:Ljava/lang/Double;

.field public locationId:Ljava/lang/String;

.field public mStatus:Ljava/lang/Boolean;

.field public productFamilyId:Ljava/lang/String;

.field public provider:Ljava/lang/String;

.field public userSpecifiedBirthdateMs:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;
    .locals 2

    .line 50
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    if-eqz p1, :cond_0

    .line 51
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;
    .locals 1

    .line 45
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->comp:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->comp:Ljava/lang/Boolean;

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->mStatus:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanRequest;->mStatus:Ljava/lang/Boolean;

    :cond_1
    return-void
.end method

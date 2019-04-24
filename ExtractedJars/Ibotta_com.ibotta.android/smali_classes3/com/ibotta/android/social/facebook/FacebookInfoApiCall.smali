.class public Lcom/ibotta/android/social/facebook/FacebookInfoApiCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "FacebookInfoApiCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/android/social/facebook/FacebookInfoResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    return-void
.end method


# virtual methods
.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/social/facebook/FacebookInfoResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/social/facebook/FacebookInfoApiCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/social/facebook/FacebookInfoResponse;

    move-result-object p1

    return-object p1
.end method

.method public getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
    .locals 1

    .line 38
    new-instance v0, Lcom/ibotta/android/social/facebook/FacebookInfoApiExecution;

    invoke-direct {v0}, Lcom/ibotta/android/social/facebook/FacebookInfoApiExecution;-><init>()V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/facebook/info"

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/social/facebook/FacebookInfoResponse;",
            ">;"
        }
    .end annotation

    .line 18
    const-class v0, Lcom/ibotta/android/social/facebook/FacebookInfoResponse;

    return-object v0
.end method

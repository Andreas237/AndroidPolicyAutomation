.class public Lcom/ibotta/api/call/auth/RefreshTokenCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "RefreshTokenCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/auth/RefreshTokenResponse;",
        ">;"
    }
.end annotation


# static fields
.field private static final API_FUNCTION:Ljava/lang/String; = "login/%1$d.json"


# instance fields
.field private final customerId:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    .line 20
    iput p1, p0, Lcom/ibotta/api/call/auth/RefreshTokenCall;->customerId:I

    const/4 p1, 0x1

    .line 21
    invoke-virtual {p0, p1}, Lcom/ibotta/api/call/auth/RefreshTokenCall;->setRequiresAuthToken(Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/auth/RefreshTokenCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/auth/RefreshTokenResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/auth/RefreshTokenResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 36
    const-class v0, Lcom/ibotta/api/call/auth/RefreshTokenResponse;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/auth/RefreshTokenCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/auth/RefreshTokenResponse;

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 4

    const-string v0, "login/%1$d.json"

    const/4 v1, 0x1

    .line 40
    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/ibotta/api/call/auth/RefreshTokenCall;->customerId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 31
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->PUT:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/auth/RefreshTokenResponse;",
            ">;"
        }
    .end annotation

    .line 26
    const-class v0, Lcom/ibotta/api/call/auth/RefreshTokenResponse;

    return-object v0
.end method

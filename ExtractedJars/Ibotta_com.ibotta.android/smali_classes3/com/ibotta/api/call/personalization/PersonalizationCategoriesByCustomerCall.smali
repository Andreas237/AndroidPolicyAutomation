.class public Lcom/ibotta/api/call/personalization/PersonalizationCategoriesByCustomerCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "PersonalizationCategoriesByCustomerCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "customers/%1$d/personalization_categories.json"


# instance fields
.field private customerId:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesByCustomerCall;->setRequiresAuthToken(Z)V

    .line 22
    iput p1, p0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesByCustomerCall;->customerId:I

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

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesByCustomerCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 42
    const-class v0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesByCustomerCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesByCustomerCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/personalization_categories.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesByCustomerCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 32
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;",
            ">;"
        }
    .end annotation

    .line 27
    const-class v0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;

    return-object v0
.end method

.class public Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;
.super Lcom/ibotta/api/JsonParamApiCall;
.source "PersonalizationCategoriesPutCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall$Selections;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/JsonParamApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final customerId:I

.field private final selections:Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall$Selections;


# direct methods
.method public constructor <init>(ILjava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Lcom/ibotta/api/JsonParamApiCall;-><init>()V

    const/4 v0, 0x1

    .line 22
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;->setRequiresAuthToken(Z)V

    .line 23
    iput p1, p0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;->customerId:I

    .line 24
    new-instance p1, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall$Selections;

    invoke-direct {p1, p0, p2}, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall$Selections;-><init>(Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;Ljava/util/Set;)V

    iput-object p1, p0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;->selections:Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall$Selections;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 44
    invoke-super {p0}, Lcom/ibotta/api/JsonParamApiCall;->buildParams()V

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;->selections:Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall$Selections;

    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;->setJsonParam(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 50
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/personalization_categories/selected.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;->customerId:I

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

    .line 34
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->PUT:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/EmptyResponse;",
            ">;"
        }
    .end annotation

    .line 29
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method

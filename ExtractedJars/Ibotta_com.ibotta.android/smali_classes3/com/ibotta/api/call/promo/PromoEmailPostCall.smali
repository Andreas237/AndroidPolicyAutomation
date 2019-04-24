.class public Lcom/ibotta/api/call/promo/PromoEmailPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "PromoEmailPostCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final emails:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final promoId:I

.field private final retailerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, p1, v0, v0}, Lcom/ibotta/api/call/promo/PromoEmailPostCall;-><init>(ILjava/util/List;Ljava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;Ljava/lang/Integer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 22
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->setRequiresAuthToken(Z)V

    .line 23
    iput p1, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->promoId:I

    .line 24
    iput-object p2, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->emails:Ljava/util/List;

    .line 25
    iput-object p3, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->retailerId:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 45
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->params:Ljava/util/Map;

    const-string v1, "promo_id"

    iget v2, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->promoId:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->emails:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 53
    :goto_0
    iget-object v2, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->emails:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 54
    iget-object v2, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->emails:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    iget-object v2, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->emails:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_0

    const-string v2, ","

    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 59
    :cond_1
    iget-object v1, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->params:Ljava/util/Map;

    const-string v2, "emails"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    :cond_2
    iget-object v0, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->retailerId:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 62
    iget-object v0, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->params:Ljava/util/Map;

    const-string v1, "retailer_id"

    iget-object v2, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

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

    .line 68
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 40
    invoke-virtual {p0}, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "promos/%1$d/email.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/promo/PromoEmailPostCall;->promoId:I

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

    .line 35
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

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

    .line 30
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method

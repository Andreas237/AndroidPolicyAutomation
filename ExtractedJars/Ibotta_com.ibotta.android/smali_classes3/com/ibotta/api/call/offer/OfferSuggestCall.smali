.class public Lcom/ibotta/api/call/offer/OfferSuggestCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "OfferSuggestCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/offer/OfferSuggestResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "offers/suggest.json"


# instance fields
.field private final term:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 17
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/offer/OfferSuggestCall;->setRequiresAuthToken(Z)V

    .line 18
    iput-object p1, p0, Lcom/ibotta/api/call/offer/OfferSuggestCall;->term:Ljava/lang/String;

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

    .line 38
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 39
    iget-object v0, p0, Lcom/ibotta/api/call/offer/OfferSuggestCall;->params:Ljava/util/Map;

    const-string v1, "term"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/OfferSuggestCall;->term:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/offer/OfferSuggestCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/OfferSuggestResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/OfferSuggestResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 44
    const-class v0, Lcom/ibotta/api/model/offer/Suggestion;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/offer/OfferSuggestCall;->fromJsonToArrayList(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    .line 46
    new-instance p2, Lcom/ibotta/api/call/offer/OfferSuggestResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/offer/OfferSuggestResponse;-><init>()V

    .line 47
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/offer/OfferSuggestResponse;->setSuggestions(Ljava/util/List;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "offers/suggest.json"

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 28
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/offer/OfferSuggestResponse;",
            ">;"
        }
    .end annotation

    .line 23
    const-class v0, Lcom/ibotta/api/call/offer/OfferSuggestResponse;

    return-object v0
.end method

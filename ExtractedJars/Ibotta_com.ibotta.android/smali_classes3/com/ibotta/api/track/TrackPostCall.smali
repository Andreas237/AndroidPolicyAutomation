.class public Lcom/ibotta/api/track/TrackPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "TrackPostCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private trackEventStringParts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/track/TrackPostCall;->trackEventStringParts:Ljava/util/List;

    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Lcom/ibotta/api/track/TrackPostCall;->setRequiresAuthToken(Z)V

    .line 22
    iget-object v0, p0, Lcom/ibotta/api/track/TrackPostCall;->trackEventStringParts:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

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

    .line 42
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 44
    iget-object v0, p0, Lcom/ibotta/api/track/TrackPostCall;->trackEventStringParts:Ljava/util/List;

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/api/track/TrackPostCall;->params:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lcom/ibotta/api/track/-$$Lambda$3UTE81OtdD1MsPv0pWfRevwPORU;

    invoke-direct {v2, v1}, Lcom/ibotta/api/track/-$$Lambda$3UTE81OtdD1MsPv0pWfRevwPORU;-><init>(Ljava/util/Map;)V

    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/track/TrackPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

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

    .line 49
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "track.json"

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 32
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

    .line 27
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method

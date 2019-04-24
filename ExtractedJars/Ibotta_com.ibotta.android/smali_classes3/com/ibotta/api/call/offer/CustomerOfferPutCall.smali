.class public Lcom/ibotta/api/call/offer/CustomerOfferPutCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerOfferPutCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;,
        Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/offer/CustomerOfferResponse;",
        ">;"
    }
.end annotation


# static fields
.field private static final REWARD_FORMAT:Ljava/lang/String; = "rewards[%1$d][%2$s]"


# instance fields
.field private callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->setRequiresAuthToken(Z)V

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 42
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 44
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    const-string v1, "customer_id"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getCustomerId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    const-string v1, "id"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getOfferId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    const-string v1, "gallery_viewed"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getGalleryViewed()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    const-string v1, "game_viewed"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getGameViewed()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    const-string v1, "engagement_duration"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getEngagementDuration()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    const-string v1, "current_value"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getCurrentValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getSegmentId()I

    move-result v0

    if-lez v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    const-string v1, "segment_id"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getSegmentId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getOfferSegmentId()I

    move-result v0

    if-lez v0, :cond_1

    .line 55
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    const-string v1, "offer_segment_id"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getOfferSegmentId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 58
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    const-string v1, "activated_retailer_id"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getRetailerId()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    :cond_2
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getPendingRetailerVerification()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    const-string v1, "pending_retailer_verification"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getPendingRetailerVerification()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    :cond_3
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getRewards()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getRewards()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 66
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 67
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v4

    const-string v5, "rewards[%1$d][%2$s]"

    const/4 v6, 0x2

    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    const-string v8, "duration"

    const/4 v10, 0x1

    aput-object v8, v7, v10

    invoke-interface {v4, v5, v7}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 72
    invoke-virtual {v1}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->getDuration()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v5

    .line 73
    iget-object v7, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    invoke-interface {v7, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v4

    const-string v5, "rewards[%1$d][%2$s]"

    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v7, v9

    const-string v8, "viewed"

    aput-object v8, v7, v10

    invoke-interface {v4, v5, v7}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 76
    invoke-virtual {v1}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->getViewed()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    .line 77
    iget-object v7, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    invoke-interface {v7, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v4

    const-string v5, "rewards[%1$d][%2$s]"

    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v7, v9

    const-string v8, "engaged"

    aput-object v8, v7, v10

    invoke-interface {v4, v5, v7}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 80
    invoke-virtual {v1}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->getEngaged()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    .line 81
    iget-object v7, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    invoke-interface {v7, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v4

    const-string v5, "rewards[%1$d][%2$s]"

    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v7, v9

    const-string v8, "finished"

    aput-object v8, v7, v10

    invoke-interface {v4, v5, v7}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 84
    invoke-virtual {v1}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->isFinished()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v5

    .line 85
    iget-object v7, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    invoke-interface {v7, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v4

    const-string v5, "rewards[%1$d][%2$s]"

    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v7, v9

    const-string v8, "engagement_id"

    aput-object v8, v7, v10

    invoke-interface {v4, v5, v7}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 88
    invoke-virtual {v1}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->getEngagementId()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    .line 89
    iget-object v7, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    invoke-interface {v7, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    invoke-virtual {v1}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->getResponse()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 92
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v4

    const-string v5, "rewards[%1$d][%2$s]"

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v6, v9

    const-string v2, "response"

    aput-object v2, v6, v10

    invoke-interface {v4, v5, v6}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 93
    invoke-virtual {v1}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->getResponse()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 94
    iget-object v3, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->params:Ljava/util/Map;

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/CustomerOfferResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/CustomerOfferResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 102
    const-class v0, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 104
    new-instance p2, Lcom/ibotta/api/call/offer/CustomerOfferResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/offer/CustomerOfferResponse;-><init>()V

    const-string v0, "offers"

    .line 105
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "offers"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object v0

    :goto_0
    const-string v1, "bonuses"

    .line 106
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "bonuses"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p1

    .line 108
    :goto_1
    invoke-virtual {p2, v0}, Lcom/ibotta/api/call/offer/CustomerOfferResponse;->setOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 109
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/offer/CustomerOfferResponse;->setBonuses(Lcom/fasterxml/jackson/databind/JsonNode;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/offers/%2$s.json/"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    .line 37
    invoke-virtual {v3}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getCustomerId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getOfferId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 36
    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

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
            "Lcom/ibotta/api/call/offer/CustomerOfferResponse;",
            ">;"
        }
    .end annotation

    .line 26
    const-class v0, Lcom/ibotta/api/call/offer/CustomerOfferResponse;

    return-object v0
.end method

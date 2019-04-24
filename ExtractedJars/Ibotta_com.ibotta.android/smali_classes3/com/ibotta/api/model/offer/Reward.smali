.class public Lcom/ibotta/api/model/offer/Reward;
.super Ljava/lang/Object;
.source "Reward.java"

# interfaces
.implements Lcom/ibotta/api/model/RewardModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;,
        Lcom/ibotta/api/model/offer/Reward$SocialContent;
    }
.end annotation


# instance fields
.field private amount:F

.field private answer:I

.field private content:Ljava/lang/String;

.field private engagementId:J

.field private finished:Z

.field private id:I

.field private inviteCount:I

.field private legal:Ljava/lang/String;

.field private linkedOfferIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private liverail:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private options:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/offer/Option;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OptionModel;",
            ">;"
        }
    .end annotation
.end field

.field private questions:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/offer/Question;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/QuestionModel;",
            ">;"
        }
    .end annotation
.end field

.field private response:Ljava/lang/String;

.field private retailer:Lcom/ibotta/api/model/retailer/Retailer;

.field private thumb:Ljava/lang/String;

.field private trackingClickUrl:Ljava/lang/String;

.field private trackingImpressionUrl:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field private viewed:Z

.field private weight:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->options:Ljava/util/List;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->questions:Ljava/util/List;

    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->liverail:Ljava/util/Map;

    .line 49
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->linkedOfferIds:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public getAmount()F
    .locals 1

    .line 67
    iget v0, p0, Lcom/ibotta/api/model/offer/Reward;->amount:F

    return v0
.end method

.method public getAnswer()I
    .locals 1

    .line 178
    iget v0, p0, Lcom/ibotta/api/model/offer/Reward;->answer:I

    return v0
.end method

.method public getAppTrailerContent(Lcom/ibotta/android/json/IbottaJson;)Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 267
    iget-object v1, p0, Lcom/ibotta/api/model/offer/Reward;->content:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 269
    :try_start_0
    const-class v2, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-interface {p1, v1, v2}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/databind/JsonNode;

    const-string v2, "android"

    .line 270
    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "android"

    .line 271
    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;

    invoke-interface {p1, v1, v2}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 274
    sget-object v1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v2, "Failed to parse App Trailer BaseContent."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v1, p1, v2, v3}, Lcom/ibotta/android/logging/Logger;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-object v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getEngagementId()J
    .locals 2

    .line 120
    iget-wide v0, p0, Lcom/ibotta/api/model/offer/Reward;->engagementId:J

    return-wide v0
.end method

.method public getId()I
    .locals 1

    .line 53
    iget v0, p0, Lcom/ibotta/api/model/offer/Reward;->id:I

    return v0
.end method

.method public getInviteCount()I
    .locals 1

    .line 182
    iget v0, p0, Lcom/ibotta/api/model/offer/Reward;->inviteCount:I

    return v0
.end method

.method public getLegal()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->legal:Ljava/lang/String;

    return-object v0
.end method

.method public getLinkedOfferIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 243
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->linkedOfferIds:Ljava/util/Set;

    return-object v0
.end method

.method public getLiverail()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 233
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->liverail:Ljava/util/Map;

    return-object v0
.end method

.method public getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OptionModel;",
            ">;"
        }
    .end annotation

    .line 158
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->options:Ljava/util/List;

    return-object v0
.end method

.method public getQuestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/QuestionModel;",
            ">;"
        }
    .end annotation

    .line 166
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->questions:Ljava/util/List;

    return-object v0
.end method

.method public getResponse()Ljava/lang/String;
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->response:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailer()Lcom/ibotta/api/model/retailer/Retailer;
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->retailer:Lcom/ibotta/api/model/retailer/Retailer;

    return-object v0
.end method

.method public getRewardId()J
    .locals 2

    .line 58
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Reward;->getId()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public getSocialContent(Lcom/ibotta/android/json/IbottaJson;)Lcom/ibotta/api/model/offer/Reward$SocialContent;
    .locals 5

    if-eqz p1, :cond_0

    .line 253
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->content:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 255
    :try_start_0
    const-class v1, Lcom/ibotta/api/model/offer/Reward$SocialContent;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/offer/Reward$SocialContent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 257
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v1, "Failed to deserialize json: %1$s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/ibotta/api/model/offer/Reward;->content:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-interface {v0, p1, v1, v2}, Lcom/ibotta/android/logging/Logger;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getThumb()Ljava/lang/String;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->thumb:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingClickUrl()Ljava/lang/String;
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->trackingClickUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingImpressionUrl()Ljava/lang/String;
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->trackingImpressionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;
    .locals 1

    .line 85
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Reward;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/api/model/TaskModel$Type;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v0

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getWeight()Ljava/lang/Integer;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward;->weight:Ljava/lang/Integer;

    return-object v0
.end method

.method public isFinished()Z
    .locals 1

    .line 150
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Reward;->finished:Z

    return v0
.end method

.method public isViewed()Z
    .locals 1

    .line 141
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Reward;->viewed:Z

    return v0
.end method

.method public setAmount(F)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/ibotta/api/model/offer/Reward;->amount:F

    return-void
.end method

.method public setAnswer(I)V
    .locals 0

    .line 174
    iput p1, p0, Lcom/ibotta/api/model/offer/Reward;->answer:I

    return-void
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->content:Ljava/lang/String;

    return-void
.end method

.method public setEngagementId(J)V
    .locals 0

    .line 129
    iput-wide p1, p0, Lcom/ibotta/api/model/offer/Reward;->engagementId:J

    return-void
.end method

.method public setFinished(Z)V
    .locals 0

    .line 154
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Reward;->finished:Z

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 62
    iput p1, p0, Lcom/ibotta/api/model/offer/Reward;->id:I

    return-void
.end method

.method public setInviteCount(I)V
    .locals 0

    .line 186
    iput p1, p0, Lcom/ibotta/api/model/offer/Reward;->inviteCount:I

    return-void
.end method

.method public setLegal(Ljava/lang/String;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->legal:Ljava/lang/String;

    return-void
.end method

.method public setLinkedOfferIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 247
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->linkedOfferIds:Ljava/util/Set;

    return-void
.end method

.method public setLiverail(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 238
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->liverail:Ljava/util/Map;

    return-void
.end method

.method public setOptions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OptionModel;",
            ">;)V"
        }
    .end annotation

    .line 162
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->options:Ljava/util/List;

    return-void
.end method

.method public setQuestions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/QuestionModel;",
            ">;)V"
        }
    .end annotation

    .line 170
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->questions:Ljava/util/List;

    return-void
.end method

.method public setResponse(Ljava/lang/String;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->response:Ljava/lang/String;

    return-void
.end method

.method public setRetailer(Lcom/ibotta/api/model/retailer/Retailer;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->retailer:Lcom/ibotta/api/model/retailer/Retailer;

    return-void
.end method

.method public setThumb(Ljava/lang/String;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->thumb:Ljava/lang/String;

    return-void
.end method

.method public setTrackingClickUrl(Ljava/lang/String;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->trackingClickUrl:Ljava/lang/String;

    return-void
.end method

.method public setTrackingImpressionUrl(Ljava/lang/String;)V
    .locals 0

    .line 220
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->trackingImpressionUrl:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->type:Ljava/lang/String;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->url:Ljava/lang/String;

    return-void
.end method

.method public setViewed(Z)V
    .locals 0

    .line 145
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Reward;->viewed:Z

    return-void
.end method

.method public setWeight(Ljava/lang/Integer;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward;->weight:Ljava/lang/Integer;

    return-void
.end method

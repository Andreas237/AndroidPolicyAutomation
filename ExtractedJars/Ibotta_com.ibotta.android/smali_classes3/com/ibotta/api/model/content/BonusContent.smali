.class public Lcom/ibotta/api/model/content/BonusContent;
.super Lcom/ibotta/api/model/base/BaseContent;
.source "BonusContent.java"

# interfaces
.implements Lcom/ibotta/api/model/BonusModel;


# instance fields
.field private active:Z

.field private amount:F

.field private bonusQualifications:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/content/QualificationContent;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/QualificationModel;",
            ">;"
        }
    .end annotation
.end field

.field private bonusType:Ljava/lang/String;

.field private transient bonusTypeEnum:Lcom/ibotta/api/model/BonusModel$Type;

.field private cacheKey:Ljava/lang/String;

.field private completed:Z

.field private completedImageUrl:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private eligible:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "elegible"
    .end annotation
.end field

.field private expiration:Ljava/util/Date;

.field private level:I

.field private locked:Z

.field private maxRetailerDistance:Ljava/lang/Integer;

.field private offers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private otherReward:Ljava/lang/String;

.field private percentComplete:F

.field private progressColor:Ljava/lang/String;

.field private progressCount:F

.field private quest:Lcom/ibotta/api/model/QuestModel;

.field private retailerId:I

.field private score:F

.field private sortResults:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/content/SortResultContent;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/SortResultModel;",
            ">;"
        }
    .end annotation
.end field

.field private started:Ljava/util/Date;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "customer_started_time"
    .end annotation
.end field

.field private terms:Ljava/lang/String;

.field private trackingClickUrl:Ljava/lang/String;

.field private trackingImpressionUrl:Ljava/lang/String;

.field private uncompletedImageUrl:Ljava/lang/String;

.field private weight:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/ibotta/api/model/base/BaseContent;-><init>()V

    .line 40
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->offers:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public getAmount()F
    .locals 1

    .line 69
    iget v0, p0, Lcom/ibotta/api/model/content/BonusContent;->amount:F

    return v0
.end method

.method public getBonusQualifications()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/QualificationModel;",
            ">;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->bonusQualifications:Ljava/util/List;

    return-object v0
.end method

.method public getBonusType()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->bonusType:Ljava/lang/String;

    return-object v0
.end method

.method public getBonusTypeEnum()Lcom/ibotta/api/model/BonusModel$Type;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->bonusTypeEnum:Lcom/ibotta/api/model/BonusModel$Type;

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->cacheKey:Ljava/lang/String;

    return-object v0
.end method

.method public getCompletedImageUrl()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->completedImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiration()Ljava/util/Date;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->expiration:Ljava/util/Date;

    return-object v0
.end method

.method public getLevel()I
    .locals 1

    .line 156
    iget v0, p0, Lcom/ibotta/api/model/content/BonusContent;->level:I

    return v0
.end method

.method public getMaxRetailerDistance()Ljava/lang/Integer;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->maxRetailerDistance:Ljava/lang/Integer;

    return-object v0
.end method

.method public getOffers()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 183
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->offers:Ljava/util/Set;

    return-object v0
.end method

.method public getOtherReward()Ljava/lang/String;
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->otherReward:Ljava/lang/String;

    return-object v0
.end method

.method public getPercentComplete()F
    .locals 1

    .line 205
    iget v0, p0, Lcom/ibotta/api/model/content/BonusContent;->percentComplete:F

    return v0
.end method

.method public getProgressColor()Ljava/lang/String;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->progressColor:Ljava/lang/String;

    return-object v0
.end method

.method public getProgressCount()F
    .locals 1

    .line 223
    iget v0, p0, Lcom/ibotta/api/model/content/BonusContent;->progressCount:F

    return v0
.end method

.method public getQuest()Lcom/ibotta/api/model/QuestModel;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 232
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->quest:Lcom/ibotta/api/model/QuestModel;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 241
    iget v0, p0, Lcom/ibotta/api/model/content/BonusContent;->retailerId:I

    return v0
.end method

.method public getScore()F
    .locals 1

    .line 250
    iget v0, p0, Lcom/ibotta/api/model/content/BonusContent;->score:F

    return v0
.end method

.method public getSortResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/SortResultModel;",
            ">;"
        }
    .end annotation

    .line 259
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->sortResults:Ljava/util/List;

    return-object v0
.end method

.method public getStarted()Ljava/util/Date;
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->started:Ljava/util/Date;

    return-object v0
.end method

.method public getTerms()Ljava/lang/String;
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->terms:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingClickUrl()Ljava/lang/String;
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->trackingClickUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingImpressionUrl()Ljava/lang/String;
    .locals 1

    .line 306
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->trackingImpressionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getUncompletedImageUrl()Ljava/lang/String;
    .locals 1

    .line 286
    iget-object v0, p0, Lcom/ibotta/api/model/content/BonusContent;->uncompletedImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getWeight()F
    .locals 1

    .line 315
    iget v0, p0, Lcom/ibotta/api/model/content/BonusContent;->weight:F

    return v0
.end method

.method public isActive()Z
    .locals 1

    .line 60
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/BonusContent;->active:Z

    return v0
.end method

.method public isCompleted()Z
    .locals 1

    .line 111
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/BonusContent;->completed:Z

    return v0
.end method

.method public isEligible()Z
    .locals 1

    .line 138
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/BonusContent;->eligible:Z

    return v0
.end method

.method public isLocked()Z
    .locals 1

    .line 165
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/BonusContent;->locked:Z

    return v0
.end method

.method public setActive(Z)V
    .locals 0

    .line 64
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/BonusContent;->active:Z

    return-void
.end method

.method public setAmount(F)V
    .locals 0

    .line 73
    iput p1, p0, Lcom/ibotta/api/model/content/BonusContent;->amount:F

    return-void
.end method

.method public setBonusQualifications(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/QualificationModel;",
            ">;)V"
        }
    .end annotation

    .line 82
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->bonusQualifications:Ljava/util/List;

    return-void
.end method

.method public setBonusType(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->bonusType:Ljava/lang/String;

    .line 92
    invoke-static {p1}, Lcom/ibotta/api/model/BonusModel$Type;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/BonusModel$Type;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->bonusTypeEnum:Lcom/ibotta/api/model/BonusModel$Type;

    return-void
.end method

.method public setCacheKey(Ljava/lang/String;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->cacheKey:Ljava/lang/String;

    return-void
.end method

.method public setCompleted(Z)V
    .locals 0

    .line 115
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/BonusContent;->completed:Z

    return-void
.end method

.method public setCompletedImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->completedImageUrl:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->description:Ljava/lang/String;

    return-void
.end method

.method public setEligible(Z)V
    .locals 0

    .line 142
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/BonusContent;->eligible:Z

    return-void
.end method

.method public setExpiration(Ljava/util/Date;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->expiration:Ljava/util/Date;

    return-void
.end method

.method public setLevel(I)V
    .locals 0

    .line 160
    iput p1, p0, Lcom/ibotta/api/model/content/BonusContent;->level:I

    return-void
.end method

.method public setLocked(Z)V
    .locals 0

    .line 169
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/BonusContent;->locked:Z

    return-void
.end method

.method public setMaxRetailerDistance(Ljava/lang/Integer;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->maxRetailerDistance:Ljava/lang/Integer;

    return-void
.end method

.method public setOffers(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 188
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->offers:Ljava/util/Set;

    goto :goto_0

    .line 190
    :cond_0
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->offers:Ljava/util/Set;

    :goto_0
    return-void
.end method

.method public setOtherReward(Ljava/lang/String;)V
    .locals 0

    .line 200
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->otherReward:Ljava/lang/String;

    return-void
.end method

.method public setPercentComplete(F)V
    .locals 0

    .line 209
    iput p1, p0, Lcom/ibotta/api/model/content/BonusContent;->percentComplete:F

    return-void
.end method

.method public setProgressColor(Ljava/lang/String;)V
    .locals 0

    .line 218
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->progressColor:Ljava/lang/String;

    return-void
.end method

.method public setProgressCount(F)V
    .locals 0

    .line 227
    iput p1, p0, Lcom/ibotta/api/model/content/BonusContent;->progressCount:F

    return-void
.end method

.method public setQuest(Lcom/ibotta/api/model/QuestModel;)V
    .locals 0
    .param p1    # Lcom/ibotta/api/model/QuestModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 236
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->quest:Lcom/ibotta/api/model/QuestModel;

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 245
    iput p1, p0, Lcom/ibotta/api/model/content/BonusContent;->retailerId:I

    return-void
.end method

.method public setScore(F)V
    .locals 0

    .line 254
    iput p1, p0, Lcom/ibotta/api/model/content/BonusContent;->score:F

    return-void
.end method

.method public setSortResults(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/SortResultModel;",
            ">;)V"
        }
    .end annotation

    .line 263
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->sortResults:Ljava/util/List;

    return-void
.end method

.method public setStarted(Ljava/util/Date;)V
    .locals 0

    .line 272
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->started:Ljava/util/Date;

    return-void
.end method

.method public setTerms(Ljava/lang/String;)V
    .locals 0

    .line 281
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->terms:Ljava/lang/String;

    return-void
.end method

.method public setTrackingClickUrl(Ljava/lang/String;)V
    .locals 0

    .line 301
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->trackingClickUrl:Ljava/lang/String;

    return-void
.end method

.method public setTrackingImpressionUrl(Ljava/lang/String;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->trackingImpressionUrl:Ljava/lang/String;

    return-void
.end method

.method public setUncompletedImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 290
    iput-object p1, p0, Lcom/ibotta/api/model/content/BonusContent;->uncompletedImageUrl:Ljava/lang/String;

    return-void
.end method

.method public setWeight(F)V
    .locals 0

    .line 319
    iput p1, p0, Lcom/ibotta/api/model/content/BonusContent;->weight:F

    return-void
.end method

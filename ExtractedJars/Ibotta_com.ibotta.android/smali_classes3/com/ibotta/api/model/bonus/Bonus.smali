.class public Lcom/ibotta/api/model/bonus/Bonus;
.super Ljava/lang/Object;
.source "Bonus.java"

# interfaces
.implements Lcom/ibotta/api/model/BonusModel;


# instance fields
.field private active:Z

.field private amount:F

.field private bonusQualifications:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/bonus/Qualification;
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

.field private completed:Ljava/util/Date;

.field private completedImageUrl:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private eligible:Z

.field private expiration:Ljava/util/Date;

.field private id:I

.field private idString:Ljava/lang/String;

.field private level:I

.field private link:Ljava/lang/String;

.field private locked:Z

.field private maxRetailerDistance:Ljava/lang/Integer;

.field private name:Ljava/lang/String;

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

.field private sortOrder:Ljava/lang/String;

.field private sortResults:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/bonus/SortResult;
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

.field private terms:Ljava/lang/String;

.field private trackingClickUrl:Ljava/lang/String;

.field private trackingImpressionUrl:Ljava/lang/String;

.field private uncompletedImageUrl:Ljava/lang/String;

.field private weight:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->bonusQualifications:Ljava/util/List;

    .line 40
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->offers:Ljava/util/Set;

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->sortResults:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAmount()F
    .locals 1

    .line 69
    iget v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->amount:F

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
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->bonusQualifications:Ljava/util/List;

    return-object v0
.end method

.method public getBonusType()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->bonusType:Ljava/lang/String;

    return-object v0
.end method

.method public getBonusTypeEnum()Lcom/ibotta/api/model/BonusModel$Type;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->bonusTypeEnum:Lcom/ibotta/api/model/BonusModel$Type;

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->cacheKey:Ljava/lang/String;

    return-object v0
.end method

.method public getCompleted()Ljava/util/Date;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->completed:Ljava/util/Date;

    return-object v0
.end method

.method public getCompletedImageUrl()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->completedImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiration()Ljava/util/Date;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->expiration:Ljava/util/Date;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 160
    iget v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->id:I

    return v0
.end method

.method public getIdString()Ljava/lang/String;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->idString:Ljava/lang/String;

    return-object v0
.end method

.method public getLevel()I
    .locals 1

    .line 178
    iget v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->level:I

    return v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 187
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->link:Ljava/lang/String;

    return-object v0
.end method

.method public getMaxRetailerDistance()Ljava/lang/Integer;
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->maxRetailerDistance:Ljava/lang/Integer;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->name:Ljava/lang/String;

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

    .line 224
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->offers:Ljava/util/Set;

    return-object v0
.end method

.method public getOtherReward()Ljava/lang/String;
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->otherReward:Ljava/lang/String;

    return-object v0
.end method

.method public getPercentComplete()F
    .locals 1

    .line 246
    iget v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->percentComplete:F

    return v0
.end method

.method public getProgressColor()Ljava/lang/String;
    .locals 1

    .line 255
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->progressColor:Ljava/lang/String;

    return-object v0
.end method

.method public getProgressCount()F
    .locals 1

    .line 264
    iget v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->progressCount:F

    return v0
.end method

.method public getQuest()Lcom/ibotta/api/model/QuestModel;
    .locals 1

    .line 273
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->quest:Lcom/ibotta/api/model/QuestModel;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 282
    iget v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->retailerId:I

    return v0
.end method

.method public getScore()F
    .locals 1

    .line 291
    iget v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->score:F

    return v0
.end method

.method public getSortOrder()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 300
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->sortOrder:Ljava/lang/String;

    return-object v0
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

    .line 309
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->sortResults:Ljava/util/List;

    return-object v0
.end method

.method public getStarted()Ljava/util/Date;
    .locals 1

    .line 380
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->started:Ljava/util/Date;

    return-object v0
.end method

.method public getTerms()Ljava/lang/String;
    .locals 1

    .line 318
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->terms:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingClickUrl()Ljava/lang/String;
    .locals 1

    .line 327
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->trackingClickUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingImpressionUrl()Ljava/lang/String;
    .locals 1

    .line 336
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->trackingImpressionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 350
    sget-object v0, Lcom/ibotta/api/model/ContentModel$Type;->NO_OP:Lcom/ibotta/api/model/ContentModel$Type;

    return-object v0
.end method

.method public getTypedId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getUncompletedImageUrl()Ljava/lang/String;
    .locals 1

    .line 362
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->completedImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getWeight()F
    .locals 1

    .line 371
    iget v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->weight:F

    return v0
.end method

.method public isActive()Z
    .locals 1

    .line 60
    iget-boolean v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->active:Z

    return v0
.end method

.method public isCompleted()Z
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->completed:Ljava/util/Date;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isEligible()Z
    .locals 1

    .line 142
    iget-boolean v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->eligible:Z

    return v0
.end method

.method public isLocked()Z
    .locals 1

    .line 197
    iget-boolean v0, p0, Lcom/ibotta/api/model/bonus/Bonus;->locked:Z

    return v0
.end method

.method public setActive(Z)V
    .locals 0

    .line 64
    iput-boolean p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->active:Z

    return-void
.end method

.method public setAmount(F)V
    .locals 0

    .line 73
    iput p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->amount:F

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
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->bonusQualifications:Ljava/util/List;

    return-void
.end method

.method public setBonusType(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->bonusType:Ljava/lang/String;

    .line 92
    invoke-static {p1}, Lcom/ibotta/api/model/BonusModel$Type;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/BonusModel$Type;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->bonusTypeEnum:Lcom/ibotta/api/model/BonusModel$Type;

    return-void
.end method

.method public setCacheKey(Ljava/lang/String;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->cacheKey:Ljava/lang/String;

    return-void
.end method

.method public setCompleted(Ljava/util/Date;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->completed:Ljava/util/Date;

    return-void
.end method

.method public setCompletedImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->completedImageUrl:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->description:Ljava/lang/String;

    return-void
.end method

.method public setEligible(Z)V
    .locals 0

    .line 146
    iput-boolean p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->eligible:Z

    return-void
.end method

.method public setExpiration(Ljava/util/Date;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->expiration:Ljava/util/Date;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 164
    iput p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->id:I

    return-void
.end method

.method public setIdString(Ljava/lang/String;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->idString:Ljava/lang/String;

    return-void
.end method

.method public setLevel(I)V
    .locals 0

    .line 182
    iput p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->level:I

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->link:Ljava/lang/String;

    return-void
.end method

.method public setLocked(Z)V
    .locals 0

    .line 201
    iput-boolean p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->locked:Z

    return-void
.end method

.method public setMaxRetailerDistance(Ljava/lang/Integer;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->maxRetailerDistance:Ljava/lang/Integer;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->name:Ljava/lang/String;

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

    .line 229
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->offers:Ljava/util/Set;

    goto :goto_0

    .line 231
    :cond_0
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->offers:Ljava/util/Set;

    :goto_0
    return-void
.end method

.method public setOtherReward(Ljava/lang/String;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->otherReward:Ljava/lang/String;

    return-void
.end method

.method public setPercentComplete(F)V
    .locals 0

    .line 250
    iput p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->percentComplete:F

    return-void
.end method

.method public setProgressColor(Ljava/lang/String;)V
    .locals 0

    .line 259
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->progressColor:Ljava/lang/String;

    return-void
.end method

.method public setProgressCount(F)V
    .locals 0

    .line 268
    iput p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->progressCount:F

    return-void
.end method

.method public setQuest(Lcom/ibotta/api/model/QuestModel;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->quest:Lcom/ibotta/api/model/QuestModel;

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 286
    iput p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->retailerId:I

    return-void
.end method

.method public setScore(F)V
    .locals 0

    .line 295
    iput p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->score:F

    return-void
.end method

.method public setSortOrder(Ljava/lang/String;)V
    .locals 0

    .line 304
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->sortOrder:Ljava/lang/String;

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

    .line 313
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->sortResults:Ljava/util/List;

    return-void
.end method

.method public setStarted(Ljava/util/Date;)V
    .locals 0

    .line 384
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->started:Ljava/util/Date;

    return-void
.end method

.method public setTerms(Ljava/lang/String;)V
    .locals 0

    .line 322
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->terms:Ljava/lang/String;

    return-void
.end method

.method public setTrackingClickUrl(Ljava/lang/String;)V
    .locals 0

    .line 331
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->trackingClickUrl:Ljava/lang/String;

    return-void
.end method

.method public setTrackingImpressionUrl(Ljava/lang/String;)V
    .locals 0

    .line 340
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->trackingImpressionUrl:Ljava/lang/String;

    return-void
.end method

.method public setUncompletedImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 366
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->uncompletedImageUrl:Ljava/lang/String;

    return-void
.end method

.method public setWeight(F)V
    .locals 0

    .line 375
    iput p1, p0, Lcom/ibotta/api/model/bonus/Bonus;->weight:F

    return-void
.end method

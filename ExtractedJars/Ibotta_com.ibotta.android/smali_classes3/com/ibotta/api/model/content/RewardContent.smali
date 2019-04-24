.class public Lcom/ibotta/api/model/content/RewardContent;
.super Lcom/ibotta/api/model/content/TaskContent;
.source "RewardContent.java"

# interfaces
.implements Lcom/ibotta/api/model/RewardModel;


# instance fields
.field private amount:F

.field private engagementId:J

.field private weight:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/ibotta/api/model/content/TaskContent;-><init>()V

    return-void
.end method


# virtual methods
.method public getAmount()F
    .locals 1

    .line 17
    iget v0, p0, Lcom/ibotta/api/model/content/RewardContent;->amount:F

    return v0
.end method

.method public getEngagementId()J
    .locals 2

    .line 40
    iget-wide v0, p0, Lcom/ibotta/api/model/content/RewardContent;->engagementId:J

    return-wide v0
.end method

.method public getRewardId()J
    .locals 2

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/api/model/content/RewardContent;->getId()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public getWeight()Ljava/lang/Integer;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/api/model/content/RewardContent;->weight:Ljava/lang/Integer;

    return-object v0
.end method

.method public setAmount(F)V
    .locals 0

    .line 21
    iput p1, p0, Lcom/ibotta/api/model/content/RewardContent;->amount:F

    return-void
.end method

.method public setEngagementId(J)V
    .locals 0

    .line 49
    iput-wide p1, p0, Lcom/ibotta/api/model/content/RewardContent;->engagementId:J

    return-void
.end method

.method public setWeight(Ljava/lang/Integer;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/api/model/content/RewardContent;->weight:Ljava/lang/Integer;

    return-void
.end method

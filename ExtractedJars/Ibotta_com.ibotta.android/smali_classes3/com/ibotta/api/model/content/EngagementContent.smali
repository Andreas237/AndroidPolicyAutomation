.class public Lcom/ibotta/api/model/content/EngagementContent;
.super Lcom/ibotta/api/model/content/TaskContent;
.source "EngagementContent.java"

# interfaces
.implements Lcom/ibotta/api/model/EngagementModel;


# instance fields
.field private rewardId:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/ibotta/api/model/content/TaskContent;-><init>()V

    return-void
.end method


# virtual methods
.method public getEngagementId()J
    .locals 2

    .line 18
    invoke-virtual {p0}, Lcom/ibotta/api/model/content/EngagementContent;->getId()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public getRewardId()J
    .locals 2

    .line 13
    iget-wide v0, p0, Lcom/ibotta/api/model/content/EngagementContent;->rewardId:J

    return-wide v0
.end method

.method public setRewardId(J)V
    .locals 0

    .line 22
    iput-wide p1, p0, Lcom/ibotta/api/model/content/EngagementContent;->rewardId:J

    return-void
.end method

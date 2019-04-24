.class public Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;
.super Ljava/lang/Object;
.source "EngagementPresenterState.java"


# annotations
.annotation runtime Lorg/parceler/Parcel;
.end annotation


# instance fields
.field currentRewardId:J

.field currentValue:Ljava/lang/String;

.field engagementResponses:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field linkedOfferId:I

.field linkedRewardId:J

.field offerId:I

.field offerName:Ljava/lang/String;

.field offerSegmentId:I

.field permissionsNeeded:Z

.field retailerId:I

.field segmentId:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 18
    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->retailerId:I

    .line 21
    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->linkedOfferId:I

    const-wide/16 v0, -0x1

    .line 22
    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->currentRewardId:J

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->engagementResponses:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getCurrentRewardId()Ljava/lang/Long;
    .locals 5

    .line 106
    iget-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->currentRewardId:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getCurrentValue()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->currentValue:Ljava/lang/String;

    return-object v0
.end method

.method public getEngagementResponses()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->engagementResponses:Ljava/util/Map;

    return-object v0
.end method

.method public getLinkedOfferId()Ljava/lang/Integer;
    .locals 2

    .line 94
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->linkedOfferId:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getLinkedRewardId()J
    .locals 2

    .line 86
    iget-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->linkedRewardId:J

    return-wide v0
.end method

.method public getOfferId()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->offerId:I

    return v0
.end method

.method public getOfferName()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->offerName:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferSegmentId()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->offerSegmentId:I

    return v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 2

    .line 66
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->retailerId:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSegmentId()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->segmentId:I

    return v0
.end method

.method public isPermissionsNeeded()Z
    .locals 1

    .line 78
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->permissionsNeeded:Z

    return v0
.end method

.method public setCurrentRewardId(Ljava/lang/Long;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 111
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->currentRewardId:J

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    .line 113
    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->currentRewardId:J

    :goto_0
    return-void
.end method

.method public setCurrentValue(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->currentValue:Ljava/lang/String;

    return-void
.end method

.method public setEngagementResponses(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 122
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->engagementResponses:Ljava/util/Map;

    return-void
.end method

.method public setLinkedOfferId(Ljava/lang/Integer;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 99
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->linkedOfferId:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    .line 101
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->linkedOfferId:I

    :goto_0
    return-void
.end method

.method public setLinkedRewardId(J)V
    .locals 0

    .line 90
    iput-wide p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->linkedRewardId:J

    return-void
.end method

.method public setOfferId(I)V
    .locals 0

    .line 30
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->offerId:I

    return-void
.end method

.method public setOfferName(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->offerName:Ljava/lang/String;

    return-void
.end method

.method public setOfferSegmentId(I)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->offerSegmentId:I

    return-void
.end method

.method public setPermissionsNeeded(Z)V
    .locals 0

    .line 82
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->permissionsNeeded:Z

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 71
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->retailerId:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    .line 73
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->retailerId:I

    :goto_0
    return-void
.end method

.method public setSegmentId(I)V
    .locals 0

    .line 46
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->segmentId:I

    return-void
.end method

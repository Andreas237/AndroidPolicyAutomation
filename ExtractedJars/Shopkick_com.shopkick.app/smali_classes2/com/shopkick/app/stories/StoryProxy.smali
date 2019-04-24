.class public Lcom/shopkick/app/stories/StoryProxy;
.super Ljava/lang/Object;
.source "StoryProxy.java"


# instance fields
.field public storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

.field public storyMemberData:Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;

.field public storySocialData:Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;

.field public storyUserData:Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public canBeDisplayed()Z
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyUserData:Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public coverCardTrackingUrl()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 150
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->coverCardTrackingUrl:Ljava/lang/String;

    return-object v0
.end method

.method public coverCardViewabilityTrackingDetails()Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 178
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->coverCardViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    return-object v0
.end method

.method public coverImageUrl()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 135
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->tileImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->tileImageUrl:Ljava/lang/String;

    return-object v0

    .line 136
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public endCardTrackingUrl()Ljava/lang/String;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 157
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->endCardTrackingUrl:Ljava/lang/String;

    return-object v0
.end method

.method public endCardViewabilityTrackingDetails()Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 185
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->endCardViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    return-object v0
.end method

.method public globalSaveCount()Ljava/lang/Long;
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storySocialData:Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;->globalSaveCount:Ljava/lang/Long;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public hasMultipleChainOffers()Z
    .locals 2

    .line 246
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyMemberData:Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 249
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;->hasMultipleChainOffers:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyMemberData:Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;->hasMultipleChainOffers:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_1
    return v1
.end method

.method public hasUserState()Z
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyUserData:Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public imageUrl()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 93
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public isReadyToShowOffers()Z
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyUserData:Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyMemberData:Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isSaved()Z
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyUserData:Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 196
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;->isSaved:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public listId()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 79
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->listId:Ljava/lang/String;

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->name:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->name:Ljava/lang/String;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public offerTokens()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            ">;"
        }
    .end annotation

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyMemberData:Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 242
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;->offerTokens:Ljava/util/List;

    return-object v0
.end method

.method public ownerUserId()Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 121
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->ownerUserId:Ljava/lang/String;

    return-object v0
.end method

.method public previewImageUrl()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 107
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->previewImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public skLink()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 128
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->skLink:Ljava/lang/String;

    return-object v0
.end method

.method public startTime()J
    .locals 2

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->startTime:Ljava/lang/Long;

    if-nez v0, :cond_0

    goto :goto_0

    .line 114
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->startTime:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public storyDescription()Ljava/lang/String;
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 164
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->storyDescription:Ljava/lang/String;

    return-object v0
.end method

.method public storyId()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 72
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->storyId:Ljava/lang/String;

    return-object v0
.end method

.method public storyOwnerName()Ljava/lang/String;
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyUserData:Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 203
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;->storyOwnerName:Ljava/lang/String;

    return-object v0
.end method

.method public storyOwnerThumbnailUrl()Ljava/lang/String;
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyUserData:Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 210
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;->storyOwnerThumbnailUrl:Ljava/lang/String;

    return-object v0
.end method

.method public storyPartnerChainId()Ljava/lang/String;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyUserData:Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 224
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;->storyPartnerChainId:Ljava/lang/String;

    return-object v0
.end method

.method public storyPartnerChainName()Ljava/lang/String;
    .locals 1

    .line 228
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyUserData:Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 231
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;->storyPartnerChainName:Ljava/lang/String;

    return-object v0
.end method

.method public storyPartnerThumbnailUrl()Ljava/lang/String;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyUserData:Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 217
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;->storyPartnerThumbnailUrl:Ljava/lang/String;

    return-object v0
.end method

.method public storyType()Ljava/lang/Integer;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 171
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->storyType:Ljava/lang/Integer;

    return-object v0
.end method

.method public tagIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 100
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->tagIds:Ljava/util/List;

    return-object v0
.end method

.method public tileImageUrl()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 143
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->tileImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public token()Lcom/shopkick/app/fetchers/api/skapi/EntityToken;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 65
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    return-object v0
.end method

.method public update(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 29
    :cond_0
    instance-of v1, p1, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 30
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    iput-object p1, p0, Lcom/shopkick/app/stories/StoryProxy;->storyConfigData:Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    return v2

    .line 32
    :cond_1
    instance-of v1, p1, Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    if-eqz v1, :cond_2

    .line 33
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    iput-object p1, p0, Lcom/shopkick/app/stories/StoryProxy;->storyUserData:Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    return v2

    .line 35
    :cond_2
    instance-of v1, p1, Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;

    if-eqz v1, :cond_3

    .line 36
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;

    iput-object p1, p0, Lcom/shopkick/app/stories/StoryProxy;->storySocialData:Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;

    return v2

    .line 38
    :cond_3
    instance-of v1, p1, Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;

    if-eqz v1, :cond_4

    .line 39
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;

    iput-object p1, p0, Lcom/shopkick/app/stories/StoryProxy;->storyMemberData:Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;

    return v2

    :cond_4
    return v0
.end method

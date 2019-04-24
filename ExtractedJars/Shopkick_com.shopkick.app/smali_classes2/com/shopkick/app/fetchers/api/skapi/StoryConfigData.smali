.class public Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "StoryConfigData.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public coverCardTrackingUrl:Ljava/lang/String;

.field public coverCardViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

.field public endCardTrackingUrl:Ljava/lang/String;

.field public endCardViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

.field public endTime:Ljava/lang/Long;

.field public imageUrl:Ljava/lang/String;

.field public listId:Ljava/lang/String;

.field public name:Ljava/lang/String;

.field public ownerUserId:Ljava/lang/String;

.field public previewImageUrl:Ljava/lang/String;

.field public skLink:Ljava/lang/String;

.field public startTime:Ljava/lang/Long;

.field public storyDescription:Ljava/lang/String;

.field public storyId:Ljava/lang/String;

.field public storyType:Ljava/lang/Integer;

.field public tagIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public tileBackgroundImageUrl:Ljava/lang/String;

.field public tileImageUrl:Ljava/lang/String;

.field public token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;
    .locals 2

    .line 51
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    if-eqz p1, :cond_0

    .line 52
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;
    .locals 1

    .line 46
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->postProcess()V

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->coverCardViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->postProcess()V

    .line 65
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->endCardViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->postProcess()V

    :cond_2
    return-void
.end method

.class public Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "OverlaySpec.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public activeUserEngagementPrimerQuestion:Ljava/lang/String;

.field public activeUserEngagementSecondaryQuestion:Ljava/lang/String;

.field public activeUserEngagementSkUrl:Ljava/lang/String;

.field public activeUserEngagementSurveyQuestion:Ljava/lang/String;

.field public activeUserEngagementSurveyUrl:Ljava/lang/String;

.field public autoDismissDuration:Ljava/lang/Long;

.field public awardDeptName:Ljava/lang/String;

.field public awardErrorMessage:Ljava/lang/String;

.field public awardExtraMessage:Ljava/lang/String;

.field public awardIsOnline:Ljava/lang/Boolean;

.field public awardOverlayState:Ljava/lang/Integer;

.field public awardStoreLogo:Ljava/lang/String;

.field public awards:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/Award;",
            ">;"
        }
    .end annotation
.end field

.field public backgroundColor:Ljava/lang/String;

.field public ballViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

.field public btleId:Ljava/lang/Integer;

.field public buttonTitle:Ljava/lang/String;

.field public buttonUrl:Ljava/lang/String;

.field public buttons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;",
            ">;"
        }
    .end annotation
.end field

.field public cancelButtonTitle:Ljava/lang/String;

.field public celebratoryOverlaySubtype:Ljava/lang/Integer;

.field public chainId:Ljava/lang/String;

.field public chainIsOnlineStore:Ljava/lang/String;

.field public chainLogoUrl:Ljava/lang/String;

.field public chainName:Ljava/lang/String;

.field public coachMarkKey:Ljava/lang/String;

.field public coachMarkMaxViewCount:Ljava/lang/Integer;

.field public configurationId:Ljava/lang/String;

.field public costInKicks:Ljava/lang/Integer;

.field public denominationId:Ljava/lang/String;

.field public departmentId:Ljava/lang/String;

.field public extendsAboveIosStatusBar:Ljava/lang/Boolean;

.field public extraViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

.field public flyUp:Ljava/lang/Boolean;

.field public frequencyCardAnimate:Ljava/lang/Integer;

.field public frequencyCardId:Ljava/lang/Long;

.field public frequencyCardNumStamps:Ljava/lang/Integer;

.field public friendId:Ljava/lang/String;

.field public hasScannedAtLocationToday:Ljava/lang/Boolean;

.field public isSaved:Ljava/lang/Boolean;

.field public kickgoodDetails:Lcom/shopkick/app/fetchers/api/skapi/OverlayKickgoodDetails;

.field public locationId:Ljava/lang/String;

.field public mainImageUrl:Ljava/lang/String;

.field public message:Ljava/lang/String;

.field public numKicks:Ljava/lang/Integer;

.field public nusbLayoutVersion:Ljava/lang/Integer;

.field public offerToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

.field public originScreen:Ljava/lang/Integer;

.field public overlayFlowType:Ljava/lang/Integer;

.field public overlayType:Ljava/lang/String;

.field public pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

.field public poppable:Ljava/lang/Boolean;

.field public preloadUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public presenceCode:Ljava/lang/String;

.field public productFamilyId:Ljava/lang/String;

.field public productFamilyTitle:Ljava/lang/String;

.field public productId:Ljava/lang/String;

.field public productName:Ljava/lang/String;

.field public rateTheAppPrimerQuestion:Ljava/lang/String;

.field public rateTheAppRatingMessage:Ljava/lang/String;

.field public rateTheAppSurveyQuestion:Ljava/lang/String;

.field public rateTheAppSurveyUrl:Ljava/lang/String;

.field public rewardId:Ljava/lang/String;

.field public rewardOverlayType:Ljava/lang/Integer;

.field public scanKickAmount:Ljava/lang/Integer;

.field public scanMissionId:Ljava/lang/String;

.field public seeAllScansSkUrl:Ljava/lang/String;

.field public sharingPlatformImageUrl:Ljava/lang/String;

.field public sharingSkLink:Ljava/lang/String;

.field public sharingTeaserText:Ljava/lang/String;

.field public showChains:Ljava/lang/Boolean;

.field public showFirstScanAnimation:Ljava/lang/Boolean;

.field public showsChrome:Ljava/lang/Boolean;

.field public soundFile:Ljava/lang/String;

.field public startDelay:Ljava/lang/Long;

.field public subtitle:Ljava/lang/String;

.field public tapToDismiss:Ljava/lang/Boolean;

.field public targetSkurl:Ljava/lang/String;

.field public templateId:Ljava/lang/Integer;

.field public title:Ljava/lang/String;

.field public totalKicksThisTrip:Ljava/lang/Integer;

.field public trackingUrl:Ljava/lang/String;

.field public userEmail:Ljava/lang/String;

.field public userScanCount:Ljava/lang/Integer;

.field public userWalkinCount:Ljava/lang/Integer;

.field public verticalAlignType:Ljava/lang/Integer;

.field public videoId:Ljava/lang/String;

.field public videoUrl:Ljava/lang/String;

.field public viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

.field public views:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

.field public walkinKickAmount:Ljava/lang/Integer;

.field public webviewUrl:Ljava/lang/String;

.field public youtubeVideoId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
    .locals 2

    .line 125
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz p1, :cond_0

    .line 126
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 129
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
    .locals 1

    .line 120
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 2

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->tapToDismiss:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->tapToDismiss:Ljava/lang/Boolean;

    .line 138
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->postProcess()V

    .line 139
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->showsChrome:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->showsChrome:Ljava/lang/Boolean;

    .line 140
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->extendsAboveIosStatusBar:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->extendsAboveIosStatusBar:Ljava/lang/Boolean;

    .line 141
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->postProcess()V

    .line 143
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttons:Ljava/util/List;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->postProcess()V

    goto :goto_0

    .line 144
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->poppable:Ljava/lang/Boolean;

    if-nez v0, :cond_6

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->poppable:Ljava/lang/Boolean;

    .line 145
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->kickgoodDetails:Lcom/shopkick/app/fetchers/api/skapi/OverlayKickgoodDetails;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/OverlayKickgoodDetails;->postProcess()V

    .line 146
    :cond_7
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->flyUp:Ljava/lang/Boolean;

    if-nez v0, :cond_8

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->flyUp:Ljava/lang/Boolean;

    .line 148
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awards:Ljava/util/List;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/Award;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/Award;->postProcess()V

    goto :goto_1

    .line 149
    :cond_9
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardIsOnline:Ljava/lang/Boolean;

    if-nez v0, :cond_a

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardIsOnline:Ljava/lang/Boolean;

    .line 150
    :cond_a
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->offerToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->postProcess()V

    .line 151
    :cond_b
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->showChains:Ljava/lang/Boolean;

    if-nez v0, :cond_c

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->showChains:Ljava/lang/Boolean;

    .line 152
    :cond_c
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->hasScannedAtLocationToday:Ljava/lang/Boolean;

    if-nez v0, :cond_d

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->hasScannedAtLocationToday:Ljava/lang/Boolean;

    .line 153
    :cond_d
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->showFirstScanAnimation:Ljava/lang/Boolean;

    if-nez v0, :cond_e

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->showFirstScanAnimation:Ljava/lang/Boolean;

    .line 154
    :cond_e
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->isSaved:Ljava/lang/Boolean;

    if-nez v0, :cond_f

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->isSaved:Ljava/lang/Boolean;

    :cond_f
    return-void
.end method

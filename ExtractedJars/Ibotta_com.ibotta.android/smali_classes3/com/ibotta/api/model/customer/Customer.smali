.class public Lcom/ibotta/api/model/customer/Customer;
.super Ljava/lang/Object;
.source "Customer.java"


# annotations
.annotation runtime Lcom/ibotta/api/security/Confidential;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/customer/Customer$Schedule;,
        Lcom/ibotta/api/model/customer/Customer$Event;,
        Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;,
        Lcom/ibotta/api/model/customer/Customer$InviteMessaging;
    }
.end annotation


# instance fields
.field private allNotificationCount:S

.field private authenticationToken:Ljava/lang/String;

.field private authenticationTokenExpiration:Ljava/util/Date;

.field private balance:F

.field private birthDate:Ljava/util/Date;

.field private confirmationRequired:Z

.field private credentialIntegrations:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "credential_integrations"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/im/CredentialIntegration;",
            ">;"
        }
    .end annotation
.end field

.field private creditConversionRatioMessage:Ljava/lang/String;

.field private credits:I

.field private eligibleForPersonalization:Z

.field private eligibleForPersonalization50:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "eligible_for_personalization_5_0"
    .end annotation
.end field

.field private email:Ljava/lang/String;

.field private firstName:Ljava/lang/String;

.field private friendCode:Ljava/lang/String;

.field private friendCount:Ljava/lang/Long;

.field private friendNotificationCount:S

.field private gender:Ljava/lang/String;

.field private id:I

.field private inviteAmount:F

.field private inviteBonusInfo:Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;

.field private inviteMessaging:Lcom/ibotta/api/model/customer/Customer$InviteMessaging;

.field private inviteUrl:Ljava/lang/String;

.field private invitesRedeemed:I

.field private joinDate:Ljava/util/Date;

.field private lastName:Ljava/lang/String;

.field private lastSweep:Ljava/util/Date;

.field private lifetimeEarnings:F

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

.field private minimumPaypalAmount:F

.field private minimumVenmoAmount:F

.field private monthlyEarnings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private notificationCount:S

.field private offersRedeemed:I

.field private onboardingModules:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "onboarding_recommended_retailers"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/OnboardingModule;",
            ">;"
        }
    .end annotation
.end field

.field private pendingWelcomeBonus:Lcom/ibotta/api/model/customer/PendingWelcomeBonus;

.field private personalizationCategories:Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;

.field private phoneVerified:Z

.field private processingReceiptCount:I

.field private profilePictureUrl:Ljava/lang/String;

.field private receiptsPending:I

.field private receiptsPendingAmount:F

.field private social:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerSocial;",
            ">;"
        }
    .end annotation
.end field

.field private superUser:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "is_super_user"
    .end annotation
.end field

.field private testingRoles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private totalAmountPending:F

.field private totalBonuses:I

.field private totalOffers:I

.field private totalRewards:I

.field private udid:Ljava/lang/String;

.field private vip:Z

.field private voteDownLimit:S

.field private zip:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->social:Ljava/util/List;

    .line 69
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->monthlyEarnings:Ljava/util/Map;

    .line 70
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->liverail:Ljava/util/Map;

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->testingRoles:Ljava/util/List;

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->credentialIntegrations:Ljava/util/List;

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->onboardingModules:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAllNotificationCount()S
    .locals 1

    .line 314
    iget-short v0, p0, Lcom/ibotta/api/model/customer/Customer;->allNotificationCount:S

    return v0
.end method

.method public getAuthenticationToken()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->authenticationToken:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthenticationTokenExpiration()Ljava/util/Date;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->authenticationTokenExpiration:Ljava/util/Date;

    return-object v0
.end method

.method public getBalance()F
    .locals 1

    .line 162
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->balance:F

    return v0
.end method

.method public getBirthDate()Ljava/util/Date;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->birthDate:Ljava/util/Date;

    return-object v0
.end method

.method public getCredentialIntegrations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/im/CredentialIntegration;",
            ">;"
        }
    .end annotation

    .line 500
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->credentialIntegrations:Ljava/util/List;

    return-object v0
.end method

.method public getCreditConversionRatioMessage()Ljava/lang/String;
    .locals 1

    .line 322
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->creditConversionRatioMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getCredits()I
    .locals 1

    .line 170
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->credits:I

    return v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getFirstName()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public getFriendCode()Ljava/lang/String;
    .locals 1

    .line 338
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->friendCode:Ljava/lang/String;

    return-object v0
.end method

.method public getFriendCount()Ljava/lang/Long;
    .locals 1

    .line 346
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->friendCount:Ljava/lang/Long;

    return-object v0
.end method

.method public getFriendNotificationCount()S
    .locals 1

    .line 306
    iget-short v0, p0, Lcom/ibotta/api/model/customer/Customer;->friendNotificationCount:S

    return v0
.end method

.method public getGender()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->gender:Ljava/lang/String;

    return-object v0
.end method

.method public getGenderEnum()Lcom/ibotta/api/call/customer/Gender;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->gender:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/call/customer/Gender;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/call/customer/Gender;

    move-result-object v0

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 78
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->id:I

    return v0
.end method

.method public getInviteAmount()F
    .locals 1

    .line 262
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->inviteAmount:F

    return v0
.end method

.method public getInviteBonusInfo()Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;
    .locals 1

    .line 362
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->inviteBonusInfo:Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;

    return-object v0
.end method

.method public getInviteMessaging()Lcom/ibotta/api/model/customer/Customer$InviteMessaging;
    .locals 1

    .line 354
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->inviteMessaging:Lcom/ibotta/api/model/customer/Customer$InviteMessaging;

    return-object v0
.end method

.method public getInviteUrl()Ljava/lang/String;
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->inviteUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getInvitesRedeemed()I
    .locals 1

    .line 282
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->invitesRedeemed:I

    return v0
.end method

.method public getJoinDate()Ljava/util/Date;
    .locals 1

    .line 378
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->joinDate:Ljava/util/Date;

    return-object v0
.end method

.method public getLastName()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public getLastSweep()Ljava/util/Date;
    .locals 1

    .line 270
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->lastSweep:Ljava/util/Date;

    return-object v0
.end method

.method public getLifetimeEarnings()F
    .locals 1

    .line 178
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->lifetimeEarnings:F

    return v0
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

    .line 483
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->liverail:Ljava/util/Map;

    return-object v0
.end method

.method public getMinimumAmountForType(Lcom/ibotta/api/model/customer/CustomerAccount$Type;)F
    .locals 1

    .line 204
    sget-object v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->PAYPAL:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-ne p1, v0, :cond_0

    .line 205
    iget p1, p0, Lcom/ibotta/api/model/customer/Customer;->minimumPaypalAmount:F

    goto :goto_0

    .line 206
    :cond_0
    sget-object v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->VENMO:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-ne p1, v0, :cond_1

    .line 207
    iget p1, p0, Lcom/ibotta/api/model/customer/Customer;->minimumVenmoAmount:F

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getMinimumPaypalAmount()F
    .locals 1

    .line 186
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->minimumPaypalAmount:F

    return v0
.end method

.method public getMinimumVenmoAmount()F
    .locals 1

    .line 194
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->minimumVenmoAmount:F

    return v0
.end method

.method public getMinimumWithdrawalAmountAvailable()F
    .locals 2

    .line 214
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->minimumPaypalAmount:F

    iget v1, p0, Lcom/ibotta/api/model/customer/Customer;->minimumVenmoAmount:F

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    return v0
.end method

.method public getMonthlyEarnings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 474
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->monthlyEarnings:Ljava/util/Map;

    return-object v0
.end method

.method public getNotificationCount()S
    .locals 1

    .line 298
    iget-short v0, p0, Lcom/ibotta/api/model/customer/Customer;->notificationCount:S

    return v0
.end method

.method public getOffersRedeemed()I
    .locals 1

    .line 274
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->offersRedeemed:I

    return v0
.end method

.method public getOnboardingModules()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/OnboardingModule;",
            ">;"
        }
    .end annotation

    .line 508
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->onboardingModules:Ljava/util/List;

    return-object v0
.end method

.method public getPendingWelcomeBonus()Lcom/ibotta/api/model/customer/PendingWelcomeBonus;
    .locals 1

    .line 458
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->pendingWelcomeBonus:Lcom/ibotta/api/model/customer/PendingWelcomeBonus;

    return-object v0
.end method

.method public getPersonalizationCategories()Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;
    .locals 1

    .line 466
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->personalizationCategories:Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;

    return-object v0
.end method

.method public getProcessingReceiptCount()I
    .locals 1

    .line 234
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->processingReceiptCount:I

    return v0
.end method

.method public getProfilePictureUrl()Ljava/lang/String;
    .locals 1

    .line 290
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->profilePictureUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getReceiptsPending()I
    .locals 1

    .line 226
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->receiptsPending:I

    return v0
.end method

.method public getReceiptsPendingAmount()F
    .locals 1

    .line 218
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->receiptsPendingAmount:F

    return v0
.end method

.method public getSocial()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerSocial;",
            ">;"
        }
    .end annotation

    .line 374
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->social:Ljava/util/List;

    return-object v0
.end method

.method public getTestingRoles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 492
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->testingRoles:Ljava/util/List;

    return-object v0
.end method

.method public getTotalAmountPending()F
    .locals 1

    .line 386
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->totalAmountPending:F

    return v0
.end method

.method public getTotalBonuses()I
    .locals 1

    .line 394
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->totalBonuses:I

    return v0
.end method

.method public getTotalOffers()I
    .locals 1

    .line 402
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->totalOffers:I

    return v0
.end method

.method public getTotalRewards()I
    .locals 1

    .line 410
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer;->totalRewards:I

    return v0
.end method

.method public getUdid()Ljava/lang/String;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->udid:Ljava/lang/String;

    return-object v0
.end method

.method public getVoteDownLimit()S
    .locals 1

    .line 330
    iget-short v0, p0, Lcom/ibotta/api/model/customer/Customer;->voteDownLimit:S

    return v0
.end method

.method public getZip()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer;->zip:Ljava/lang/String;

    return-object v0
.end method

.method public isConfirmationRequired()Z
    .locals 1

    .line 242
    iget-boolean v0, p0, Lcom/ibotta/api/model/customer/Customer;->confirmationRequired:Z

    return v0
.end method

.method public isEligibleForPersonalization()Z
    .locals 1

    .line 442
    iget-boolean v0, p0, Lcom/ibotta/api/model/customer/Customer;->eligibleForPersonalization:Z

    return v0
.end method

.method public isEligibleForPersonalization50()Z
    .locals 1

    .line 450
    iget-boolean v0, p0, Lcom/ibotta/api/model/customer/Customer;->eligibleForPersonalization50:Z

    return v0
.end method

.method public isPhoneVerified()Z
    .locals 1

    .line 426
    iget-boolean v0, p0, Lcom/ibotta/api/model/customer/Customer;->phoneVerified:Z

    return v0
.end method

.method public isSuperUser()Z
    .locals 1

    .line 418
    iget-boolean v0, p0, Lcom/ibotta/api/model/customer/Customer;->superUser:Z

    return v0
.end method

.method public isVip()Z
    .locals 1

    .line 434
    iget-boolean v0, p0, Lcom/ibotta/api/model/customer/Customer;->vip:Z

    return v0
.end method

.method public setAllNotificationCount(S)V
    .locals 0

    .line 318
    iput-short p1, p0, Lcom/ibotta/api/model/customer/Customer;->allNotificationCount:S

    return-void
.end method

.method public setAuthenticationToken(Ljava/lang/String;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->authenticationToken:Ljava/lang/String;

    return-void
.end method

.method public setAuthenticationTokenExpiration(Ljava/util/Date;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->authenticationTokenExpiration:Ljava/util/Date;

    return-void
.end method

.method public setBalance(F)V
    .locals 0

    .line 166
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->balance:F

    return-void
.end method

.method public setBirthDate(Ljava/util/Date;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->birthDate:Ljava/util/Date;

    return-void
.end method

.method public setConfirmationRequired(Z)V
    .locals 0

    .line 246
    iput-boolean p1, p0, Lcom/ibotta/api/model/customer/Customer;->confirmationRequired:Z

    return-void
.end method

.method public setCredentialIntegrations(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/im/CredentialIntegration;",
            ">;)V"
        }
    .end annotation

    .line 504
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->credentialIntegrations:Ljava/util/List;

    return-void
.end method

.method public setCreditConversionRatioMessage(Ljava/lang/String;)V
    .locals 0

    .line 326
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->creditConversionRatioMessage:Ljava/lang/String;

    return-void
.end method

.method public setCredits(I)V
    .locals 0

    .line 174
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->credits:I

    return-void
.end method

.method public setEligibleForPersonalization(Z)V
    .locals 0

    .line 446
    iput-boolean p1, p0, Lcom/ibotta/api/model/customer/Customer;->eligibleForPersonalization:Z

    return-void
.end method

.method public setEligibleForPersonalization50(Z)V
    .locals 0

    .line 454
    iput-boolean p1, p0, Lcom/ibotta/api/model/customer/Customer;->eligibleForPersonalization50:Z

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->email:Ljava/lang/String;

    return-void
.end method

.method public setFirstName(Ljava/lang/String;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->firstName:Ljava/lang/String;

    return-void
.end method

.method public setFriendCode(Ljava/lang/String;)V
    .locals 0

    .line 342
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->friendCode:Ljava/lang/String;

    return-void
.end method

.method public setFriendCount(Ljava/lang/Long;)V
    .locals 0

    .line 350
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->friendCount:Ljava/lang/Long;

    return-void
.end method

.method public setFriendNotificationCount(S)V
    .locals 0

    .line 310
    iput-short p1, p0, Lcom/ibotta/api/model/customer/Customer;->friendNotificationCount:S

    return-void
.end method

.method public setGender(Ljava/lang/String;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->gender:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 82
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->id:I

    return-void
.end method

.method public setInviteAmount(F)V
    .locals 0

    .line 258
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->inviteAmount:F

    return-void
.end method

.method public setInviteBonusInfo(Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;)V
    .locals 0

    .line 366
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->inviteBonusInfo:Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;

    return-void
.end method

.method public setInviteMessaging(Lcom/ibotta/api/model/customer/Customer$InviteMessaging;)V
    .locals 0

    .line 358
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->inviteMessaging:Lcom/ibotta/api/model/customer/Customer$InviteMessaging;

    return-void
.end method

.method public setInviteUrl(Ljava/lang/String;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->inviteUrl:Ljava/lang/String;

    return-void
.end method

.method public setInvitesRedeemed(I)V
    .locals 0

    .line 286
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->invitesRedeemed:I

    return-void
.end method

.method public setJoinDate(Ljava/util/Date;)V
    .locals 0

    .line 382
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->joinDate:Ljava/util/Date;

    return-void
.end method

.method public setLastName(Ljava/lang/String;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->lastName:Ljava/lang/String;

    return-void
.end method

.method public setLastSweep(Ljava/util/Date;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->lastSweep:Ljava/util/Date;

    return-void
.end method

.method public setLifetimeEarnings(F)V
    .locals 0

    .line 182
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->lifetimeEarnings:F

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

    .line 488
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->liverail:Ljava/util/Map;

    return-void
.end method

.method public setMinimumPaypalAmount(F)V
    .locals 0

    .line 190
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->minimumPaypalAmount:F

    return-void
.end method

.method public setMinimumVenmoAmount(F)V
    .locals 0

    .line 198
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->minimumVenmoAmount:F

    return-void
.end method

.method public setMonthlyEarnings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 478
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->monthlyEarnings:Ljava/util/Map;

    return-void
.end method

.method public setNotificationCount(S)V
    .locals 0

    .line 302
    iput-short p1, p0, Lcom/ibotta/api/model/customer/Customer;->notificationCount:S

    return-void
.end method

.method public setOffersRedeemed(I)V
    .locals 0

    .line 278
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->offersRedeemed:I

    return-void
.end method

.method public setPendingWelcomeBonus(Lcom/ibotta/api/model/customer/PendingWelcomeBonus;)V
    .locals 0

    .line 462
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->pendingWelcomeBonus:Lcom/ibotta/api/model/customer/PendingWelcomeBonus;

    return-void
.end method

.method public setPersonalizationCategories(Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;)V
    .locals 0

    .line 470
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->personalizationCategories:Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;

    return-void
.end method

.method public setPhoneVerified(Z)V
    .locals 0

    .line 430
    iput-boolean p1, p0, Lcom/ibotta/api/model/customer/Customer;->phoneVerified:Z

    return-void
.end method

.method public setProcessingReceiptCount(I)V
    .locals 0

    .line 238
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->processingReceiptCount:I

    return-void
.end method

.method public setProfilePictureUrl(Ljava/lang/String;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->profilePictureUrl:Ljava/lang/String;

    return-void
.end method

.method public setReceiptsPending(I)V
    .locals 0

    .line 230
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->receiptsPending:I

    return-void
.end method

.method public setReceiptsPendingAmount(F)V
    .locals 0

    .line 222
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->receiptsPendingAmount:F

    return-void
.end method

.method public setSocial(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerSocial;",
            ">;)V"
        }
    .end annotation

    .line 370
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->social:Ljava/util/List;

    return-void
.end method

.method public setSuperUser(Z)V
    .locals 0

    .line 422
    iput-boolean p1, p0, Lcom/ibotta/api/model/customer/Customer;->superUser:Z

    return-void
.end method

.method public setTestingRoles(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 496
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->testingRoles:Ljava/util/List;

    return-void
.end method

.method public setTotalAmountPending(F)V
    .locals 0

    .line 390
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->totalAmountPending:F

    return-void
.end method

.method public setTotalBonuses(I)V
    .locals 0

    .line 398
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->totalBonuses:I

    return-void
.end method

.method public setTotalOffers(I)V
    .locals 0

    .line 406
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->totalOffers:I

    return-void
.end method

.method public setTotalRewards(I)V
    .locals 0

    .line 414
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer;->totalRewards:I

    return-void
.end method

.method public setUdid(Ljava/lang/String;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->udid:Ljava/lang/String;

    return-void
.end method

.method public setVip(Z)V
    .locals 0

    .line 438
    iput-boolean p1, p0, Lcom/ibotta/api/model/customer/Customer;->vip:Z

    return-void
.end method

.method public setVoteDownLimit(S)V
    .locals 0

    .line 334
    iput-short p1, p0, Lcom/ibotta/api/model/customer/Customer;->voteDownLimit:S

    return-void
.end method

.method public setZip(Ljava/lang/String;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer;->zip:Ljava/lang/String;

    return-void
.end method

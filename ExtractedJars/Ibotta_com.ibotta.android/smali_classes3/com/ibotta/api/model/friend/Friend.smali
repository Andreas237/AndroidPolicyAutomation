.class public Lcom/ibotta/api/model/friend/Friend;
.super Ljava/lang/Object;
.source "Friend.java"


# instance fields
.field private bonusEarningCount:F

.field private bonusEarnings:Ljava/lang/String;

.field private emailHash:Ljava/lang/String;

.field private firstName:Ljava/lang/String;

.field private id:I

.field private joinDate:Ljava/util/Date;

.field private lastName:Ljava/lang/String;

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

.field private profilePictureUrl:Ljava/lang/String;

.field private socials:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private totalBonuses:I

.field private totalEarnings:F

.field private totalOffers:I

.field private totalRewards:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/friend/Friend;->socials:Ljava/util/Map;

    .line 24
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/friend/Friend;->monthlyEarnings:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getBonusEarningCount()F
    .locals 1

    .line 75
    iget v0, p0, Lcom/ibotta/api/model/friend/Friend;->bonusEarningCount:F

    return v0
.end method

.method public getBonusEarnings()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/api/model/friend/Friend;->bonusEarnings:Ljava/lang/String;

    return-object v0
.end method

.method public getEmailHash()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/api/model/friend/Friend;->emailHash:Ljava/lang/String;

    return-object v0
.end method

.method public getFirstName()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/model/friend/Friend;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/ibotta/api/model/friend/Friend;->id:I

    return v0
.end method

.method public getJoinDate()Ljava/util/Date;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/api/model/friend/Friend;->joinDate:Ljava/util/Date;

    return-object v0
.end method

.method public getLastName()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/api/model/friend/Friend;->lastName:Ljava/lang/String;

    return-object v0
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

    .line 131
    iget-object v0, p0, Lcom/ibotta/api/model/friend/Friend;->monthlyEarnings:Ljava/util/Map;

    return-object v0
.end method

.method public getProfilePictureUrl()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/api/model/friend/Friend;->profilePictureUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSocials()Ljava/util/Map;
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

    .line 83
    iget-object v0, p0, Lcom/ibotta/api/model/friend/Friend;->socials:Ljava/util/Map;

    return-object v0
.end method

.method public getTotalBonuses()I
    .locals 1

    .line 99
    iget v0, p0, Lcom/ibotta/api/model/friend/Friend;->totalBonuses:I

    return v0
.end method

.method public getTotalEarnings()F
    .locals 1

    .line 123
    iget v0, p0, Lcom/ibotta/api/model/friend/Friend;->totalEarnings:F

    return v0
.end method

.method public getTotalOffers()I
    .locals 1

    .line 107
    iget v0, p0, Lcom/ibotta/api/model/friend/Friend;->totalOffers:I

    return v0
.end method

.method public getTotalRewards()I
    .locals 1

    .line 115
    iget v0, p0, Lcom/ibotta/api/model/friend/Friend;->totalRewards:I

    return v0
.end method

.method public setBonusEarningCount(F)V
    .locals 0

    .line 79
    iput p1, p0, Lcom/ibotta/api/model/friend/Friend;->bonusEarningCount:F

    return-void
.end method

.method public setBonusEarnings(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/api/model/friend/Friend;->bonusEarnings:Ljava/lang/String;

    return-void
.end method

.method public setEmailHash(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/api/model/friend/Friend;->emailHash:Ljava/lang/String;

    return-void
.end method

.method public setFirstName(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/api/model/friend/Friend;->firstName:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 31
    iput p1, p0, Lcom/ibotta/api/model/friend/Friend;->id:I

    return-void
.end method

.method public setJoinDate(Ljava/util/Date;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/ibotta/api/model/friend/Friend;->joinDate:Ljava/util/Date;

    return-void
.end method

.method public setLastName(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/api/model/friend/Friend;->lastName:Ljava/lang/String;

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

    .line 135
    iput-object p1, p0, Lcom/ibotta/api/model/friend/Friend;->monthlyEarnings:Ljava/util/Map;

    return-void
.end method

.method public setProfilePictureUrl(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/api/model/friend/Friend;->profilePictureUrl:Ljava/lang/String;

    return-void
.end method

.method public setSocials(Ljava/util/Map;)V
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

    .line 87
    iput-object p1, p0, Lcom/ibotta/api/model/friend/Friend;->socials:Ljava/util/Map;

    return-void
.end method

.method public setTotalBonuses(I)V
    .locals 0

    .line 103
    iput p1, p0, Lcom/ibotta/api/model/friend/Friend;->totalBonuses:I

    return-void
.end method

.method public setTotalEarnings(F)V
    .locals 0

    .line 127
    iput p1, p0, Lcom/ibotta/api/model/friend/Friend;->totalEarnings:F

    return-void
.end method

.method public setTotalOffers(I)V
    .locals 0

    .line 111
    iput p1, p0, Lcom/ibotta/api/model/friend/Friend;->totalOffers:I

    return-void
.end method

.method public setTotalRewards(I)V
    .locals 0

    .line 119
    iput p1, p0, Lcom/ibotta/api/model/friend/Friend;->totalRewards:I

    return-void
.end method

.class public Lcom/shopkick/app/points/ProfilePoints;
.super Ljava/lang/Object;
.source "ProfilePoints.java"


# static fields
.field private static final MIN_COINS_DELTA_TO_ANIMATE:I = 0xa

.field public static final PROFILE_POINTS_CHANGED_NOTIFICATION:Ljava/lang/String; = "ProfilePointsChangedEvent"


# instance fields
.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private coinsBalance:I

.field private coinsDelta:I

.field private escrowCoins:I

.field private lifetimeCoins:I

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private shouldAnimateLastCoinsDelta:Z


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p2, p0, Lcom/shopkick/app/points/ProfilePoints;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 28
    iput-object p1, p0, Lcom/shopkick/app/points/ProfilePoints;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 32
    iget-object v0, p0, Lcom/shopkick/app/points/ProfilePoints;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setProfilePointsCoinsBalance(I)V

    .line 33
    iget-object v0, p0, Lcom/shopkick/app/points/ProfilePoints;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setProfilePointsLifetimeCoins(I)V

    .line 34
    iget-object v0, p0, Lcom/shopkick/app/points/ProfilePoints;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setProfilePointsEscrowCoins(I)V

    .line 35
    iput v1, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsBalance:I

    .line 36
    iput v1, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsDelta:I

    .line 37
    iput-boolean v1, p0, Lcom/shopkick/app/points/ProfilePoints;->shouldAnimateLastCoinsDelta:Z

    .line 38
    iput v1, p0, Lcom/shopkick/app/points/ProfilePoints;->lifetimeCoins:I

    return-void
.end method

.method public getCoinsBalance()I
    .locals 1

    .line 96
    iget v0, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsBalance:I

    return v0
.end method

.method public getCoinsDelta()I
    .locals 1

    .line 100
    iget v0, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsDelta:I

    return v0
.end method

.method public getCurrentProgress(I)I
    .locals 1

    .line 125
    invoke-virtual {p0}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/points/ProfilePoints;->getProgress(II)I

    move-result p1

    return p1
.end method

.method public getEscrowCoins()I
    .locals 1

    .line 115
    iget v0, p0, Lcom/shopkick/app/points/ProfilePoints;->escrowCoins:I

    return v0
.end method

.method public getLifetimeCoins()I
    .locals 1

    .line 112
    iget v0, p0, Lcom/shopkick/app/points/ProfilePoints;->lifetimeCoins:I

    return v0
.end method

.method public getProgress(II)I
    .locals 2

    if-ge p2, p1, :cond_0

    const/16 p1, 0x64

    return p1

    :cond_0
    int-to-double v0, p1

    int-to-double p1, p2

    div-double/2addr v0, p1

    const-wide/high16 p1, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, p1

    double-to-int p1, v0

    return p1
.end method

.method public lastCoinsDeltaAnimated()V
    .locals 1

    const/4 v0, 0x0

    .line 108
    iput-boolean v0, p0, Lcom/shopkick/app/points/ProfilePoints;->shouldAnimateLastCoinsDelta:Z

    return-void
.end method

.method public load()V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/points/ProfilePoints;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getProfilePointsCoinsBalance()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsBalance:I

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/points/ProfilePoints;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getProfilePointsLifetimeCoins()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/points/ProfilePoints;->lifetimeCoins:I

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/points/ProfilePoints;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getProfilePointsEscrowCoins()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/points/ProfilePoints;->escrowCoins:I

    return-void
.end method

.method public roundProgress(I)I
    .locals 4

    int-to-double v0, p1

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    div-double/2addr v0, v2

    .line 129
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p1, v0

    mul-int/lit8 p1, p1, 0x5

    return p1
.end method

.method public shouldAnimateLastCoinsDelta()Z
    .locals 1

    .line 104
    iget-boolean v0, p0, Lcom/shopkick/app/points/ProfilePoints;->shouldAnimateLastCoinsDelta:Z

    return v0
.end method

.method public updateWithPointsResponse(Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;)V
    .locals 2

    .line 45
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsBalance:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsBalance:I

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsBalance:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDelta:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDelta:Ljava/lang/Integer;

    .line 46
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_1

    .line 48
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsBalance:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsBalance:I

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/points/ProfilePoints;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget v1, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsBalance:I

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setProfilePointsCoinsBalance(I)V

    .line 52
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDelta:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 53
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDelta:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsDelta:I

    .line 54
    iget p1, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsDelta:I

    if-lez p1, :cond_3

    .line 56
    iget v0, p0, Lcom/shopkick/app/points/ProfilePoints;->lifetimeCoins:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/shopkick/app/points/ProfilePoints;->lifetimeCoins:I

    .line 57
    iget-object p1, p0, Lcom/shopkick/app/points/ProfilePoints;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget v0, p0, Lcom/shopkick/app/points/ProfilePoints;->lifetimeCoins:I

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setProfilePointsLifetimeCoins(I)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 60
    iput p1, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsDelta:I

    .line 63
    :cond_3
    :goto_0
    iget p1, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsDelta:I

    const/16 v0, 0xa

    if-lt p1, v0, :cond_4

    const/4 p1, 0x1

    .line 64
    iput-boolean p1, p0, Lcom/shopkick/app/points/ProfilePoints;->shouldAnimateLastCoinsDelta:Z

    .line 67
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/points/ProfilePoints;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "ProfilePointsChangedEvent"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method public updateWithProfilesPointsResponse(Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsV2Response;)V
    .locals 2

    .line 74
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsV2Response;->coinsBalance:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsV2Response;->coinsBalance:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsBalance:I

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/points/ProfilePoints;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget v1, p0, Lcom/shopkick/app/points/ProfilePoints;->coinsBalance:I

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setProfilePointsCoinsBalance(I)V

    .line 78
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsV2Response;->lifetimeCoins:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 79
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsV2Response;->lifetimeCoins:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/points/ProfilePoints;->lifetimeCoins:I

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/points/ProfilePoints;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget v1, p0, Lcom/shopkick/app/points/ProfilePoints;->lifetimeCoins:I

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setProfilePointsLifetimeCoins(I)V

    .line 82
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsV2Response;->escrowCoins:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 83
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsV2Response;->escrowCoins:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/points/ProfilePoints;->escrowCoins:I

    .line 84
    iget-object p1, p0, Lcom/shopkick/app/points/ProfilePoints;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget v0, p0, Lcom/shopkick/app/points/ProfilePoints;->escrowCoins:I

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setProfilePointsEscrowCoins(I)V

    .line 86
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/points/ProfilePoints;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "ProfilePointsChangedEvent"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

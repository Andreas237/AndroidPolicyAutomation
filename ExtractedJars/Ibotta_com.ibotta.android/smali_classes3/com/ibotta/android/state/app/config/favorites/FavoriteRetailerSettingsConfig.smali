.class public Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;
.super Ljava/lang/Object;
.source "FavoriteRetailerSettingsConfig.java"


# static fields
.field private static final DEFAULT_TX_INTERVAL:J = 0xea60L

.field private static final MAX_ATTEMPTS:I = 0x5


# instance fields
.field private maxAttempts:I

.field private txInterval:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xea60

    .line 13
    iput-wide v0, p0, Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;->txInterval:J

    const/4 v0, 0x5

    .line 14
    iput v0, p0, Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;->maxAttempts:I

    return-void
.end method


# virtual methods
.method public getMaxAttempts()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;->maxAttempts:I

    return v0
.end method

.method public getTxInterval()J
    .locals 2

    .line 17
    iget-wide v0, p0, Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;->txInterval:J

    return-wide v0
.end method

.method public setMaxAttempts(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;->maxAttempts:I

    return-void
.end method

.method public setTxInterval(J)V
    .locals 0

    .line 21
    iput-wide p1, p0, Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;->txInterval:J

    return-void
.end method

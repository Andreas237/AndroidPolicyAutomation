.class public Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;
.super Ljava/lang/Object;
.source "TrackingAppConfig.java"


# static fields
.field private static final DEFAULT_TX_INTERVAL:J = 0xea60L

.field private static final MAX_ATTEMPTS:I = 0x5

.field private static final MAX_ROWS_PER_TABLE:I = 0x3e8

.field private static final MAX_ROWS_PER_TX:I = 0xfa

.field private static final MAX_ROW_AGE:J = 0x5265c00L


# instance fields
.field private maxAttempts:I

.field private maxRowAge:J

.field private maxRowsPerTable:I

.field private maxRowsPerTx:I

.field private txInterval:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xea60

    .line 16
    iput-wide v0, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->txInterval:J

    const/4 v0, 0x5

    .line 17
    iput v0, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->maxAttempts:I

    const/16 v0, 0x3e8

    .line 18
    iput v0, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->maxRowsPerTable:I

    const/16 v0, 0xfa

    .line 19
    iput v0, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->maxRowsPerTx:I

    const-wide/32 v0, 0x5265c00

    .line 20
    iput-wide v0, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->maxRowAge:J

    return-void
.end method


# virtual methods
.method public getMaxAttempts()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->maxAttempts:I

    return v0
.end method

.method public getMaxRowAge()J
    .locals 2

    .line 55
    iget-wide v0, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->maxRowAge:J

    return-wide v0
.end method

.method public getMaxRowsPerTable()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->maxRowsPerTable:I

    return v0
.end method

.method public getMaxRowsPerTx()I
    .locals 1

    .line 47
    iget v0, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->maxRowsPerTx:I

    return v0
.end method

.method public getTxInterval()J
    .locals 2

    .line 23
    iget-wide v0, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->txInterval:J

    return-wide v0
.end method

.method public setMaxAttempts(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->maxAttempts:I

    return-void
.end method

.method public setMaxRowAge(J)V
    .locals 0

    .line 59
    iput-wide p1, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->maxRowAge:J

    return-void
.end method

.method public setMaxRowsPerTable(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->maxRowsPerTable:I

    return-void
.end method

.method public setMaxRowsPerTx(I)V
    .locals 0

    .line 51
    iput p1, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->maxRowsPerTx:I

    return-void
.end method

.method public setTxInterval(J)V
    .locals 0

    .line 27
    iput-wide p1, p0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->txInterval:J

    return-void
.end method

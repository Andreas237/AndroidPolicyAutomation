.class public Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;
.super Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
.source "AccountEvent.java"


# annotations
.annotation runtime Lcom/j256/ormlite/table/DatabaseTable;
    tableName = "account_event"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;-><init>()V

    return-void
.end method


# virtual methods
.method public getPrime1()I
    .locals 1

    const/16 v0, 0x13

    return v0
.end method

.method public getPrime2()I
    .locals 1

    const/16 v0, 0xf1

    return v0
.end method

.method public toTrackEvent()Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;
    .locals 1

    .line 12
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->ACCOUNT:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    invoke-super {p0, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->toTrackEvent(Lcom/ibotta/android/tracking/proprietary/event/TrackType;)Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;

    move-result-object v0

    return-object v0
.end method

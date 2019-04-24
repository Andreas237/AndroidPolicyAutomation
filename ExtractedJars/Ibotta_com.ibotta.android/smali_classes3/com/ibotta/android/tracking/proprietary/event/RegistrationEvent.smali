.class public Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;
.super Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
.source "RegistrationEvent.java"


# annotations
.annotation runtime Lcom/j256/ormlite/table/DatabaseTable;
    tableName = "registration_event"
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

    const/16 v0, 0x653

    return v0
.end method

.method public getPrime2()I
    .locals 1

    const/16 v0, 0x20b

    return v0
.end method

.method public toTrackEvent()Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;
    .locals 1

    .line 13
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->REGISTRATION:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    invoke-super {p0, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->toTrackEvent(Lcom/ibotta/android/tracking/proprietary/event/TrackType;)Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;

    move-result-object v0

    return-object v0
.end method

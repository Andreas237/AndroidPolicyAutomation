.class public Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;
.super Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
.source "SettingsEvent.java"


# annotations
.annotation runtime Lcom/j256/ormlite/table/DatabaseTable;
    tableName = "settings_event"
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

    const/16 v0, 0x3d

    return v0
.end method

.method public getPrime2()I
    .locals 1

    const/16 v0, 0xe9

    return v0
.end method

.method public toTrackEvent()Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

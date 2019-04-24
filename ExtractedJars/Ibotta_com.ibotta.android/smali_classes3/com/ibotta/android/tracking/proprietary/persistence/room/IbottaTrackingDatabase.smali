.class public abstract Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;
.super Landroid/arch/persistence/room/RoomDatabase;
.source "IbottaTrackingDatabase.java"


# annotations
.annotation build Landroid/arch/persistence/room/Database;
    entities = {
        Lcom/ibotta/android/tracking/proprietary/TrackingData;
    }
    exportSchema = false
    version = 0x1
.end annotation

.annotation build Landroid/arch/persistence/room/TypeConverters;
    value = {
        Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Landroid/arch/persistence/room/RoomDatabase;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getTrackingDao()Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;
.end method

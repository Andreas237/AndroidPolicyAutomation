.class public interface abstract Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;
.super Ljava/lang/Object;
.source "TrackingDao.java"


# annotations
.annotation build Landroid/arch/persistence/room/Dao;
.end annotation


# virtual methods
.method public abstract addEntry(Lcom/ibotta/android/tracking/proprietary/TrackingData;)V
    .annotation build Landroid/arch/persistence/room/Insert;
        onConflict = 0x1
    .end annotation
.end method

.method public abstract deleteAllEntries()V
    .annotation build Landroid/arch/persistence/room/Query;
        value = "DELETE FROM TrackingData"
    .end annotation
.end method

.method public abstract deleteEntryForKey(Ljava/lang/String;)V
    .annotation build Landroid/arch/persistence/room/Query;
        value = "DELETE FROM TrackingData where primaryKey LIKE :key"
    .end annotation
.end method

.method public abstract getAllKeys()Ljava/util/List;
    .annotation build Landroid/arch/persistence/room/Query;
        value = "SELECT primaryKey FROM TrackingData"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getEntryForKey(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/TrackingData;
    .annotation build Landroid/arch/persistence/room/Query;
        value = "SELECT * FROM TrackingData where primaryKey LIKE :key"
    .end annotation
.end method

.method public abstract getSize()I
    .annotation build Landroid/arch/persistence/room/Query;
        value = "SELECT COUNT(*) FROM TrackingData"
    .end annotation
.end method

.method public abstract getSizeAsLiveData()Landroid/arch/lifecycle/LiveData;
    .annotation build Landroid/arch/persistence/room/Query;
        value = "SELECT COUNT(*) FROM TrackingData"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/arch/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

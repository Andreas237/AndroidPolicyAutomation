.class public Lcom/ibotta/android/tracking/proprietary/persistence/room/RoomTrackingPersistence;
.super Ljava/lang/Object;
.source "RoomTrackingPersistence.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
        "Lcom/ibotta/tracking/generated/model/Body;",
        ">;"
    }
.end annotation


# instance fields
.field private final trackingDao:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/RoomTrackingPersistence;->trackingDao:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;

    return-void
.end method

.method static synthetic lambda$read$0(Lcom/ibotta/android/tracking/proprietary/TrackingData;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingData;->data:Lcom/ibotta/tracking/generated/model/Body;

    return-object p0
.end method


# virtual methods
.method public delete(Ljava/lang/String;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/RoomTrackingPersistence;->trackingDao:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;->deleteEntryForKey(Ljava/lang/String;)V

    return-void
.end method

.method public destroy()V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/RoomTrackingPersistence;->trackingDao:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;->deleteAllEntries()V

    return-void
.end method

.method public getAllKeys()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/RoomTrackingPersistence;->trackingDao:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;->getAllKeys()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSize()I
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/RoomTrackingPersistence;->trackingDao:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;->getSize()I

    move-result v0

    return v0
.end method

.method public read(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/RoomTrackingPersistence;->trackingDao:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;->getEntryForKey(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/TrackingData;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/tracking/proprietary/persistence/room/-$$Lambda$RoomTrackingPersistence$eez7I5jn99gG1toaZTFbhq24Fzs;->INSTANCE:Lcom/ibotta/android/tracking/proprietary/persistence/room/-$$Lambda$RoomTrackingPersistence$eez7I5jn99gG1toaZTFbhq24Fzs;

    .line 24
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    const/4 v0, 0x0

    .line 25
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/tracking/generated/model/Body;

    return-object p1
.end method

.method public bridge synthetic read(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 14
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/proprietary/persistence/room/RoomTrackingPersistence;->read(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    return-object p1
.end method

.method public write(Ljava/lang/String;Lcom/ibotta/tracking/generated/model/Body;)V
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/RoomTrackingPersistence;->trackingDao:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;

    new-instance v1, Lcom/ibotta/android/tracking/proprietary/TrackingData;

    invoke-direct {v1, p1, p2}, Lcom/ibotta/android/tracking/proprietary/TrackingData;-><init>(Ljava/lang/String;Lcom/ibotta/tracking/generated/model/Body;)V

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;->addEntry(Lcom/ibotta/android/tracking/proprietary/TrackingData;)V

    return-void
.end method

.method public bridge synthetic write(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 14
    check-cast p2, Lcom/ibotta/tracking/generated/model/Body;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/persistence/room/RoomTrackingPersistence;->write(Ljava/lang/String;Lcom/ibotta/tracking/generated/model/Body;)V

    return-void
.end method

.class Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;
.super Landroid/arch/lifecycle/ComputableLiveData;
.source "TrackingDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->getSizeAsLiveData()Landroid/arch/lifecycle/LiveData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/arch/lifecycle/ComputableLiveData<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private _observer:Landroid/arch/persistence/room/InvalidationTracker$Observer;

.field final synthetic this$0:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;

.field final synthetic val$_statement:Landroid/arch/persistence/room/RoomSQLiteQuery;


# direct methods
.method constructor <init>(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;Landroid/arch/persistence/room/RoomSQLiteQuery;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;->this$0:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;

    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;->val$_statement:Landroid/arch/persistence/room/RoomSQLiteQuery;

    invoke-direct {p0}, Landroid/arch/lifecycle/ComputableLiveData;-><init>()V

    return-void
.end method


# virtual methods
.method protected compute()Ljava/lang/Integer;
    .locals 4

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;->_observer:Landroid/arch/persistence/room/InvalidationTracker$Observer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 199
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4$1;

    const-string v2, "TrackingData"

    new-array v3, v1, [Ljava/lang/String;

    invoke-direct {v0, p0, v2, v3}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4$1;-><init>(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;Ljava/lang/String;[Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;->_observer:Landroid/arch/persistence/room/InvalidationTracker$Observer;

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;->this$0:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;

    invoke-static {v0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->access$100(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;)Landroid/arch/persistence/room/RoomDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomDatabase;->getInvalidationTracker()Landroid/arch/persistence/room/InvalidationTracker;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;->_observer:Landroid/arch/persistence/room/InvalidationTracker$Observer;

    invoke-virtual {v0, v2}, Landroid/arch/persistence/room/InvalidationTracker;->addWeakObserver(Landroid/arch/persistence/room/InvalidationTracker$Observer;)V

    .line 207
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;->this$0:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;

    invoke-static {v0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->access$100(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;)Landroid/arch/persistence/room/RoomDatabase;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;->val$_statement:Landroid/arch/persistence/room/RoomSQLiteQuery;

    invoke-virtual {v0, v2}, Landroid/arch/persistence/room/RoomDatabase;->query(Landroid/arch/persistence/db/SupportSQLiteQuery;)Landroid/database/Cursor;

    move-result-object v0

    .line 210
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    .line 212
    invoke-interface {v0, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 215
    :cond_1
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v1

    .line 223
    :cond_2
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-object v3

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    throw v1
.end method

.method protected bridge synthetic compute()Ljava/lang/Object;
    .locals 1

    .line 193
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;->compute()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected finalize()V
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;->val$_statement:Landroid/arch/persistence/room/RoomSQLiteQuery;

    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomSQLiteQuery;->release()V

    return-void
.end method

.class Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$1;
.super Landroid/arch/persistence/room/EntityInsertionAdapter;
.source "TrackingDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;-><init>(Landroid/arch/persistence/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/arch/persistence/room/EntityInsertionAdapter<",
        "Lcom/ibotta/android/tracking/proprietary/TrackingData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;Landroid/arch/persistence/room/RoomDatabase;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$1;->this$0:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;

    invoke-direct {p0, p2}, Landroid/arch/persistence/room/EntityInsertionAdapter;-><init>(Landroid/arch/persistence/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method public bind(Landroid/arch/persistence/db/SupportSQLiteStatement;Lcom/ibotta/android/tracking/proprietary/TrackingData;)V
    .locals 2

    .line 45
    iget-object v0, p2, Lcom/ibotta/android/tracking/proprietary/TrackingData;->primaryKey:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 46
    invoke-interface {p1, v1}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 48
    :cond_0
    iget-object v0, p2, Lcom/ibotta/android/tracking/proprietary/TrackingData;->primaryKey:Ljava/lang/String;

    invoke-interface {p1, v1, v0}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 51
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$1;->this$0:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;

    invoke-static {v0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->access$000(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;)Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;

    move-result-object v0

    iget-object p2, p2, Lcom/ibotta/android/tracking/proprietary/TrackingData;->data:Lcom/ibotta/tracking/generated/model/Body;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;->toString(Lcom/ibotta/tracking/generated/model/Body;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x2

    if-nez p2, :cond_1

    .line 53
    invoke-interface {p1, v0}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_1

    .line 55
    :cond_1
    invoke-interface {p1, v0, p2}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic bind(Landroid/arch/persistence/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    .line 37
    check-cast p2, Lcom/ibotta/android/tracking/proprietary/TrackingData;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$1;->bind(Landroid/arch/persistence/db/SupportSQLiteStatement;Lcom/ibotta/android/tracking/proprietary/TrackingData;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `TrackingData`(`primaryKey`,`data`) VALUES (?,?)"

    return-object v0
.end method

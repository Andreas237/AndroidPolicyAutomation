.class Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$3;
.super Landroid/arch/persistence/room/SharedSQLiteStatement;
.source "TrackingDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;-><init>(Landroid/arch/persistence/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;Landroid/arch/persistence/room/RoomDatabase;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$3;->this$0:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;

    invoke-direct {p0, p2}, Landroid/arch/persistence/room/SharedSQLiteStatement;-><init>(Landroid/arch/persistence/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM TrackingData"

    return-object v0
.end method

.class public final synthetic Lcom/ibotta/android/tracking/proprietary/-$$Lambda$EPCb472uWRAbfMX0foLWD3P3kKY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/arch/lifecycle/Observer;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/-$$Lambda$EPCb472uWRAbfMX0foLWD3P3kKY;->f$0:Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/-$$Lambda$EPCb472uWRAbfMX0foLWD3P3kKY;->f$0:Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;->onDatabaseSizeChanged(Ljava/lang/Integer;)V

    return-void
.end method

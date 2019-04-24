.class public final synthetic Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$0ds01iG_BHOyVU1PoUnJ2ap-34Y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

.field private final synthetic f$1:Z


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$0ds01iG_BHOyVU1PoUnJ2ap-34Y;->f$0:Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    iput-boolean p2, p0, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$0ds01iG_BHOyVU1PoUnJ2ap-34Y;->f$1:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$0ds01iG_BHOyVU1PoUnJ2ap-34Y;->f$0:Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    iget-boolean v1, p0, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$0ds01iG_BHOyVU1PoUnJ2ap-34Y;->f$1:Z

    invoke-static {v0, v1}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->lambda$schedule$0(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;Z)V

    return-void
.end method

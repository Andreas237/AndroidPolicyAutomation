.class public final synthetic Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$TCKvY35QPA3XsG-v5gs0M1PJcpw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$TCKvY35QPA3XsG-v5gs0M1PJcpw;->f$0:Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$TCKvY35QPA3XsG-v5gs0M1PJcpw;->f$0:Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    invoke-static {v0}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->lambda$flush$1(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

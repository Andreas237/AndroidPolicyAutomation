.class public final synthetic Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$JWs2m0hXXOksp5wVPHc6PnYQp-4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$JWs2m0hXXOksp5wVPHc6PnYQp-4;->f$0:Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$JWs2m0hXXOksp5wVPHc6PnYQp-4;->f$0:Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;

    invoke-static {v0}, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->lambda$clearAllEntries$3(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;)V

    return-void
.end method

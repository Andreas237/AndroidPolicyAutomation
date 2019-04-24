.class public final synthetic Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$YZzU8EcIKTP_9gIRu2OajygMDEM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;

.field private final synthetic f$1:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$YZzU8EcIKTP_9gIRu2OajygMDEM;->f$0:Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;

    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$YZzU8EcIKTP_9gIRu2OajygMDEM;->f$1:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$YZzU8EcIKTP_9gIRu2OajygMDEM;->f$0:Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$YZzU8EcIKTP_9gIRu2OajygMDEM;->f$1:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->lambda$addEntry$1(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;Ljava/lang/Object;)V

    return-void
.end method

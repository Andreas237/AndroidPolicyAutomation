.class Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4$1;
.super Landroid/arch/persistence/room/InvalidationTracker$Observer;
.source "TrackingDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;->compute()Ljava/lang/Integer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;


# direct methods
.method varargs constructor <init>(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4$1;->this$1:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;

    invoke-direct {p0, p2, p3}, Landroid/arch/persistence/room/InvalidationTracker$Observer;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onInvalidated(Ljava/util/Set;)V
    .locals 0
    .param p1    # Ljava/util/Set;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 202
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4$1;->this$1:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;->invalidate()V

    return-void
.end method

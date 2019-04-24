.class public final synthetic Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$qYgZyivQjp_DK0Z69hyJa802Lvo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/state/GlobalStateListener;

.field private final synthetic f$1:Lcom/ibotta/android/state/GeofenceStatus;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/state/GlobalStateListener;Lcom/ibotta/android/state/GeofenceStatus;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$qYgZyivQjp_DK0Z69hyJa802Lvo;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    iput-object p2, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$qYgZyivQjp_DK0Z69hyJa802Lvo;->f$1:Lcom/ibotta/android/state/GeofenceStatus;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$qYgZyivQjp_DK0Z69hyJa802Lvo;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    iget-object v1, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$qYgZyivQjp_DK0Z69hyJa802Lvo;->f$1:Lcom/ibotta/android/state/GeofenceStatus;

    invoke-static {v0, v1}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->lambda$onGeofenceStatusChanged$8(Lcom/ibotta/android/state/GlobalStateListener;Lcom/ibotta/android/state/GeofenceStatus;)V

    return-void
.end method

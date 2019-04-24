.class public final synthetic Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$gSr_fGKIAvspMMtcp3nP_4BZLeg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/state/GlobalStateListener;

.field private final synthetic f$1:Lcom/ibotta/android/state/GeofenceNotificationStatus;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/state/GlobalStateListener;Lcom/ibotta/android/state/GeofenceNotificationStatus;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$gSr_fGKIAvspMMtcp3nP_4BZLeg;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    iput-object p2, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$gSr_fGKIAvspMMtcp3nP_4BZLeg;->f$1:Lcom/ibotta/android/state/GeofenceNotificationStatus;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$gSr_fGKIAvspMMtcp3nP_4BZLeg;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    iget-object v1, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$gSr_fGKIAvspMMtcp3nP_4BZLeg;->f$1:Lcom/ibotta/android/state/GeofenceNotificationStatus;

    invoke-static {v0, v1}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->lambda$onGeofenceNotificationStatusChanged$9(Lcom/ibotta/android/state/GlobalStateListener;Lcom/ibotta/android/state/GeofenceNotificationStatus;)V

    return-void
.end method

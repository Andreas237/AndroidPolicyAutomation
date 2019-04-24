.class public final synthetic Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$haPVZuB6QessujYBxGSvTJknJ3o;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/state/GlobalStateListener;

.field private final synthetic f$1:Landroid/location/Location;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/state/GlobalStateListener;Landroid/location/Location;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$haPVZuB6QessujYBxGSvTJknJ3o;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    iput-object p2, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$haPVZuB6QessujYBxGSvTJknJ3o;->f$1:Landroid/location/Location;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$haPVZuB6QessujYBxGSvTJknJ3o;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    iget-object v1, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$haPVZuB6QessujYBxGSvTJknJ3o;->f$1:Landroid/location/Location;

    invoke-static {v0, v1}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->lambda$onLocationChanged$10(Lcom/ibotta/android/state/GlobalStateListener;Landroid/location/Location;)V

    return-void
.end method

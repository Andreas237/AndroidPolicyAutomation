.class Lcom/shopkick/app/location/SKLocationManager$AddGeofencesResultCallback;
.super Ljava/lang/Object;
.source "SKLocationManager.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/location/SKLocationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AddGeofencesResultCallback"
.end annotation


# instance fields
.field locationManagerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/location/SKLocationManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/location/SKLocationManager;)V
    .locals 1

    .line 383
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 384
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/location/SKLocationManager$AddGeofencesResultCallback;->locationManagerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 1

    .line 389
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager$AddGeofencesResultCallback;->locationManagerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/location/SKLocationManager;

    if-eqz v0, :cond_0

    .line 391
    invoke-virtual {v0, p1}, Lcom/shopkick/app/location/SKLocationManager;->onAddGeofencesResult(Lcom/google/android/gms/common/api/Result;)V

    :cond_0
    return-void
.end method

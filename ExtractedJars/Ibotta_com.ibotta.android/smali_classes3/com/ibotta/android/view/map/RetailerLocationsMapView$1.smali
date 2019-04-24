.class Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;
.super Ljava/lang/Object;
.source "RetailerLocationsMapView.java"

# interfaces
.implements Lcom/google/android/gms/maps/LocationSource;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/view/map/RetailerLocationsMapView;->initializeWithMap()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;->this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public activate(Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;)V
    .locals 6

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;->this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-static {v0, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->access$202(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;)Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;

    .line 189
    iget-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;->this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "location"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroid/location/LocationManager;

    .line 191
    iget-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;->this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    iget-object p1, p1, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {p1}, Lcom/ibotta/android/hardware/Hardware;->isFineLocationAvailable()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string v1, "gps"

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    .line 192
    iget-object v5, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;->this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    goto :goto_0

    .line 194
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;->this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    iget-object p1, p1, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {p1}, Lcom/ibotta/android/hardware/Hardware;->isCoarseLocationAvailable()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string v1, "network"

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    .line 195
    iget-object v5, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;->this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public deactivate()V
    .locals 3

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;->this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    .line 182
    iget-object v1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;->this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->access$202(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;)Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;

    .line 183
    iget-object v1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;->this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    return-void
.end method

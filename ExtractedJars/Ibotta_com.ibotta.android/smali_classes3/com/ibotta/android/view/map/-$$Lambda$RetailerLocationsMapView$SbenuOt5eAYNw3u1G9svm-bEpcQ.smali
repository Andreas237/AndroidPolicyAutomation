.class public final synthetic Lcom/ibotta/android/view/map/-$$Lambda$RetailerLocationsMapView$SbenuOt5eAYNw3u1G9svm-bEpcQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/google/android/gms/maps/OnMapReadyCallback;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/view/map/-$$Lambda$RetailerLocationsMapView$SbenuOt5eAYNw3u1G9svm-bEpcQ;->f$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    return-void
.end method


# virtual methods
.method public final onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/view/map/-$$Lambda$RetailerLocationsMapView$SbenuOt5eAYNw3u1G9svm-bEpcQ;->f$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-static {v0, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->lambda$initWithPermissionsGranted$0(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/google/android/gms/maps/GoogleMap;)V

    return-void
.end method

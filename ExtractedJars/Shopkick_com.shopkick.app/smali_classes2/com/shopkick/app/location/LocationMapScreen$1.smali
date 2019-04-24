.class Lcom/shopkick/app/location/LocationMapScreen$1;
.super Ljava/lang/Object;
.source "LocationMapScreen.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/location/LocationMapScreen;->setupMap()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/location/LocationMapScreen;

.field final synthetic val$bc:Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

.field final synthetic val$mapView:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/shopkick/app/location/LocationMapScreen;Landroid/view/View;Lcom/google/android/gms/maps/model/LatLngBounds$Builder;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen$1;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    iput-object p2, p0, Lcom/shopkick/app/location/LocationMapScreen$1;->val$mapView:Landroid/view/View;

    iput-object p3, p0, Lcom/shopkick/app/location/LocationMapScreen$1;->val$bc:Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen$1;->val$mapView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen$1;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-static {v0}, Lcom/shopkick/app/location/LocationMapScreen;->access$000(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/SupportMapFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/SupportMapFragment;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-static {}, Lcom/shopkick/app/location/LocationMapScreen;->access$100()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    div-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 195
    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen$1;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-static {v1}, Lcom/shopkick/app/location/LocationMapScreen;->access$200(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/location/LocationMapScreen$1;->val$bc:Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-virtual {v2}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v2, v0}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    return-void
.end method

.class Lcom/shopkick/app/location/LocationMapScreen$5;
.super Ljava/lang/Object;
.source "LocationMapScreen.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/location/LocationMapScreen;->customizeMap()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/location/LocationMapScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/location/LocationMapScreen;)V
    .locals 0

    .line 367
    iput-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen$5;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMapClick(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    .line 370
    iget-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen$5;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-static {p1}, Lcom/shopkick/app/location/LocationMapScreen;->access$800(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen$5;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-static {p1}, Lcom/shopkick/app/location/LocationMapScreen;->access$800(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->isInfoWindowShown()Z

    move-result p1

    if-nez p1, :cond_0

    .line 371
    iget-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen$5;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-static {p1}, Lcom/shopkick/app/location/LocationMapScreen;->access$800(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->showInfoWindow()V

    :cond_0
    return-void
.end method

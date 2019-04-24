.class Lcom/shopkick/app/location/LocationMapScreen$3;
.super Ljava/lang/Object;
.source "LocationMapScreen.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;


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

    .line 337
    iput-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen$3;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInfoWindowClick(Lcom/google/android/gms/maps/model/Marker;)V
    .locals 0

    .line 340
    iget-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen$3;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/location/LocationMapScreen;->logNavigationTap()V

    .line 341
    iget-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen$3;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-static {p1}, Lcom/shopkick/app/location/LocationMapScreen;->access$300(Lcom/shopkick/app/location/LocationMapScreen;)V

    return-void
.end method

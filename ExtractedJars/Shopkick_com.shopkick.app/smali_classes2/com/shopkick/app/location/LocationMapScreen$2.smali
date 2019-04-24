.class Lcom/shopkick/app/location/LocationMapScreen$2;
.super Ljava/lang/Object;
.source "LocationMapScreen.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;


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

    .line 329
    iput-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen$2;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMarkerClick(Lcom/google/android/gms/maps/model/Marker;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

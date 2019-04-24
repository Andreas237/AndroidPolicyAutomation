.class Lcom/shopkick/app/location/StoreNearbyNotifier$4;
.super Ljava/lang/Object;
.source "StoreNearbyNotifier.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/ReadingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/location/StoreNearbyNotifier;->startRequestingHighAccuracyLocationReadings()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;


# direct methods
.method constructor <init>(Lcom/shopkick/app/location/StoreNearbyNotifier;)V
    .locals 0

    .line 417
    iput-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$4;->this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 0

    return-void
.end method

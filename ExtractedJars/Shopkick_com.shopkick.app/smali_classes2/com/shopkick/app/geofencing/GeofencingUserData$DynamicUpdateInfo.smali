.class public Lcom/shopkick/app/geofencing/GeofencingUserData$DynamicUpdateInfo;
.super Ljava/lang/Object;
.source "GeofencingUserData.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/geofencing/GeofencingUserData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DynamicUpdateInfo"
.end annotation


# instance fields
.field public final requestLocation:Landroid/location/Location;

.field public final requestTime:J


# direct methods
.method public constructor <init>(JLandroid/location/Location;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-wide p1, p0, Lcom/shopkick/app/geofencing/GeofencingUserData$DynamicUpdateInfo;->requestTime:J

    .line 21
    iput-object p3, p0, Lcom/shopkick/app/geofencing/GeofencingUserData$DynamicUpdateInfo;->requestLocation:Landroid/location/Location;

    return-void
.end method

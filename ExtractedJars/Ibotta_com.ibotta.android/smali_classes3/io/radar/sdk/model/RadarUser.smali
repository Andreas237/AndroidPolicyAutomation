.class public final Lio/radar/sdk/model/RadarUser;
.super Ljava/lang/Object;
.source "RadarUser.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/model/RadarUser$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0017\u0018\u0000 )2\u00020\u0001:\u0001)Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0017R\u0011\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u0017\u00a8\u0006*"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarUser;",
        "",
        "id",
        "",
        "userId",
        "deviceId",
        "description",
        "metadata",
        "Lorg/json/JSONObject;",
        "location",
        "Landroid/location/Location;",
        "geofences",
        "",
        "Lio/radar/sdk/model/RadarGeofence;",
        "place",
        "Lio/radar/sdk/model/RadarPlace;",
        "insights",
        "Lio/radar/sdk/model/RadarUserInsights;",
        "stopped",
        "",
        "foreground",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Landroid/location/Location;[Lio/radar/sdk/model/RadarGeofence;Lio/radar/sdk/model/RadarPlace;Lio/radar/sdk/model/RadarUserInsights;ZZ)V",
        "getDescription",
        "()Ljava/lang/String;",
        "getDeviceId",
        "getForeground",
        "()Z",
        "getGeofences",
        "()[Lio/radar/sdk/model/RadarGeofence;",
        "[Lio/radar/sdk/model/RadarGeofence;",
        "getId",
        "getInsights",
        "()Lio/radar/sdk/model/RadarUserInsights;",
        "getLocation",
        "()Landroid/location/Location;",
        "getMetadata",
        "()Lorg/json/JSONObject;",
        "getPlace",
        "()Lio/radar/sdk/model/RadarPlace;",
        "getStopped",
        "getUserId",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# static fields
.field public static final Companion:Lio/radar/sdk/model/RadarUser$Companion;


# instance fields
.field private final description:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final deviceId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final foreground:Z

.field private final geofences:[Lio/radar/sdk/model/RadarGeofence;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final insights:Lio/radar/sdk/model/RadarUserInsights;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final location:Landroid/location/Location;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final metadata:Lorg/json/JSONObject;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final place:Lio/radar/sdk/model/RadarPlace;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final stopped:Z

.field private final userId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/model/RadarUser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/model/RadarUser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/model/RadarUser;->Companion:Lio/radar/sdk/model/RadarUser$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Landroid/location/Location;[Lio/radar/sdk/model/RadarGeofence;Lio/radar/sdk/model/RadarPlace;Lio/radar/sdk/model/RadarUserInsights;ZZ)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # [Lio/radar/sdk/model/RadarGeofence;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lio/radar/sdk/model/RadarPlace;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lio/radar/sdk/model/RadarUserInsights;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/radar/sdk/model/RadarUser;->id:Ljava/lang/String;

    iput-object p2, p0, Lio/radar/sdk/model/RadarUser;->userId:Ljava/lang/String;

    iput-object p3, p0, Lio/radar/sdk/model/RadarUser;->deviceId:Ljava/lang/String;

    iput-object p4, p0, Lio/radar/sdk/model/RadarUser;->description:Ljava/lang/String;

    iput-object p5, p0, Lio/radar/sdk/model/RadarUser;->metadata:Lorg/json/JSONObject;

    iput-object p6, p0, Lio/radar/sdk/model/RadarUser;->location:Landroid/location/Location;

    iput-object p7, p0, Lio/radar/sdk/model/RadarUser;->geofences:[Lio/radar/sdk/model/RadarGeofence;

    iput-object p8, p0, Lio/radar/sdk/model/RadarUser;->place:Lio/radar/sdk/model/RadarPlace;

    iput-object p9, p0, Lio/radar/sdk/model/RadarUser;->insights:Lio/radar/sdk/model/RadarUserInsights;

    iput-boolean p10, p0, Lio/radar/sdk/model/RadarUser;->stopped:Z

    iput-boolean p11, p0, Lio/radar/sdk/model/RadarUser;->foreground:Z

    return-void
.end method


# virtual methods
.method public final getGeofences()[Lio/radar/sdk/model/RadarGeofence;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 45
    iget-object v0, p0, Lio/radar/sdk/model/RadarUser;->geofences:[Lio/radar/sdk/model/RadarGeofence;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object v0, p0, Lio/radar/sdk/model/RadarUser;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInsights()Lio/radar/sdk/model/RadarUserInsights;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 55
    iget-object v0, p0, Lio/radar/sdk/model/RadarUser;->insights:Lio/radar/sdk/model/RadarUserInsights;

    return-object v0
.end method

.method public final getPlace()Lio/radar/sdk/model/RadarPlace;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 50
    iget-object v0, p0, Lio/radar/sdk/model/RadarUser;->place:Lio/radar/sdk/model/RadarPlace;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 20
    iget-object v0, p0, Lio/radar/sdk/model/RadarUser;->userId:Ljava/lang/String;

    return-object v0
.end method

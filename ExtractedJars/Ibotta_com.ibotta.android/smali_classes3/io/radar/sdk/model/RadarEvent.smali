.class public final Lio/radar/sdk/model/RadarEvent;
.super Ljava/lang/Object;
.source "RadarEvent.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/model/RadarEvent$RadarEventType;,
        Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;,
        Lio/radar/sdk/model/RadarEvent$RadarEventVerification;,
        Lio/radar/sdk/model/RadarEvent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0018\u0000 42\u00020\u0001:\u00044567B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\u0010\u000f\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0010\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u001d\u0010\u000f\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010.\u00a8\u00068"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarEvent;",
        "",
        "id",
        "",
        "createdAt",
        "Ljava/util/Date;",
        "actualCreatedAt",
        "live",
        "",
        "type",
        "Lio/radar/sdk/model/RadarEvent$RadarEventType;",
        "geofence",
        "Lio/radar/sdk/model/RadarGeofence;",
        "place",
        "Lio/radar/sdk/model/RadarPlace;",
        "alternatePlaces",
        "",
        "verifiedPlace",
        "verification",
        "Lio/radar/sdk/model/RadarEvent$RadarEventVerification;",
        "confidence",
        "Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;",
        "duration",
        "",
        "location",
        "Landroid/location/Location;",
        "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLio/radar/sdk/model/RadarEvent$RadarEventType;Lio/radar/sdk/model/RadarGeofence;Lio/radar/sdk/model/RadarPlace;[Lio/radar/sdk/model/RadarPlace;Lio/radar/sdk/model/RadarPlace;Lio/radar/sdk/model/RadarEvent$RadarEventVerification;Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;FLandroid/location/Location;)V",
        "getActualCreatedAt",
        "()Ljava/util/Date;",
        "getAlternatePlaces",
        "()[Lio/radar/sdk/model/RadarPlace;",
        "[Lio/radar/sdk/model/RadarPlace;",
        "getConfidence",
        "()Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;",
        "getCreatedAt",
        "getDuration",
        "()F",
        "getGeofence",
        "()Lio/radar/sdk/model/RadarGeofence;",
        "getId",
        "()Ljava/lang/String;",
        "getLive",
        "()Z",
        "getLocation",
        "()Landroid/location/Location;",
        "getPlace",
        "()Lio/radar/sdk/model/RadarPlace;",
        "getType",
        "()Lio/radar/sdk/model/RadarEvent$RadarEventType;",
        "getVerification",
        "()Lio/radar/sdk/model/RadarEvent$RadarEventVerification;",
        "getVerifiedPlace",
        "Companion",
        "RadarEventConfidence",
        "RadarEventType",
        "RadarEventVerification",
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
.field public static final Companion:Lio/radar/sdk/model/RadarEvent$Companion;


# instance fields
.field private final actualCreatedAt:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final alternatePlaces:[Lio/radar/sdk/model/RadarPlace;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final confidence:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final createdAt:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final duration:F

.field private final geofence:Lio/radar/sdk/model/RadarGeofence;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final live:Z

.field private final location:Landroid/location/Location;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final place:Lio/radar/sdk/model/RadarPlace;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final type:Lio/radar/sdk/model/RadarEvent$RadarEventType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final verification:Lio/radar/sdk/model/RadarEvent$RadarEventVerification;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final verifiedPlace:Lio/radar/sdk/model/RadarPlace;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/model/RadarEvent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/model/RadarEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/model/RadarEvent;->Companion:Lio/radar/sdk/model/RadarEvent$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLio/radar/sdk/model/RadarEvent$RadarEventType;Lio/radar/sdk/model/RadarGeofence;Lio/radar/sdk/model/RadarPlace;[Lio/radar/sdk/model/RadarPlace;Lio/radar/sdk/model/RadarPlace;Lio/radar/sdk/model/RadarEvent$RadarEventVerification;Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;FLandroid/location/Location;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lio/radar/sdk/model/RadarEvent$RadarEventType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lio/radar/sdk/model/RadarGeofence;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lio/radar/sdk/model/RadarPlace;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # [Lio/radar/sdk/model/RadarPlace;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lio/radar/sdk/model/RadarPlace;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Lio/radar/sdk/model/RadarEvent$RadarEventVerification;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p13    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actualCreatedAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "verification"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confidence"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/radar/sdk/model/RadarEvent;->id:Ljava/lang/String;

    iput-object p2, p0, Lio/radar/sdk/model/RadarEvent;->createdAt:Ljava/util/Date;

    iput-object p3, p0, Lio/radar/sdk/model/RadarEvent;->actualCreatedAt:Ljava/util/Date;

    iput-boolean p4, p0, Lio/radar/sdk/model/RadarEvent;->live:Z

    iput-object p5, p0, Lio/radar/sdk/model/RadarEvent;->type:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    iput-object p6, p0, Lio/radar/sdk/model/RadarEvent;->geofence:Lio/radar/sdk/model/RadarGeofence;

    iput-object p7, p0, Lio/radar/sdk/model/RadarEvent;->place:Lio/radar/sdk/model/RadarPlace;

    iput-object p8, p0, Lio/radar/sdk/model/RadarEvent;->alternatePlaces:[Lio/radar/sdk/model/RadarPlace;

    iput-object p9, p0, Lio/radar/sdk/model/RadarEvent;->verifiedPlace:Lio/radar/sdk/model/RadarPlace;

    iput-object p10, p0, Lio/radar/sdk/model/RadarEvent;->verification:Lio/radar/sdk/model/RadarEvent$RadarEventVerification;

    iput-object p11, p0, Lio/radar/sdk/model/RadarEvent;->confidence:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    iput p12, p0, Lio/radar/sdk/model/RadarEvent;->duration:F

    iput-object p13, p0, Lio/radar/sdk/model/RadarEvent;->location:Landroid/location/Location;

    return-void
.end method


# virtual methods
.method public final getPlace()Lio/radar/sdk/model/RadarPlace;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 50
    iget-object v0, p0, Lio/radar/sdk/model/RadarEvent;->place:Lio/radar/sdk/model/RadarPlace;

    return-object v0
.end method

.method public final getType()Lio/radar/sdk/model/RadarEvent$RadarEventType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 40
    iget-object v0, p0, Lio/radar/sdk/model/RadarEvent;->type:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    return-object v0
.end method

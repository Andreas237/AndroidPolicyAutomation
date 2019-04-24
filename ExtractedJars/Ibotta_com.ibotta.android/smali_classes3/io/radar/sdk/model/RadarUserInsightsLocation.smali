.class public final Lio/radar/sdk/model/RadarUserInsightsLocation;
.super Ljava/lang/Object;
.source "RadarUserInsightsLocation.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;,
        Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;,
        Lio/radar/sdk/model/RadarUserInsightsLocation$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u0000 \u00132\u00020\u0001:\u0003\u0013\u0014\u0015B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarUserInsightsLocation;",
        "",
        "type",
        "Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;",
        "location",
        "Landroid/location/Location;",
        "confidence",
        "Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;",
        "updatedAt",
        "Ljava/util/Date;",
        "(Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;Landroid/location/Location;Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;Ljava/util/Date;)V",
        "getConfidence",
        "()Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;",
        "getLocation",
        "()Landroid/location/Location;",
        "getType",
        "()Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;",
        "getUpdatedAt",
        "()Ljava/util/Date;",
        "Companion",
        "RadarUserInsightsLocationConfidence",
        "RadarUserInsightsLocationType",
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
.field public static final Companion:Lio/radar/sdk/model/RadarUserInsightsLocation$Companion;


# instance fields
.field private final confidence:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final location:Landroid/location/Location;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final type:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final updatedAt:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/model/RadarUserInsightsLocation$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/model/RadarUserInsightsLocation$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/model/RadarUserInsightsLocation;->Companion:Lio/radar/sdk/model/RadarUserInsightsLocation$Companion;

    return-void
.end method

.method public constructor <init>(Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;Landroid/location/Location;Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;Ljava/util/Date;)V
    .locals 1
    .param p1    # Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confidence"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/radar/sdk/model/RadarUserInsightsLocation;->type:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    iput-object p2, p0, Lio/radar/sdk/model/RadarUserInsightsLocation;->location:Landroid/location/Location;

    iput-object p3, p0, Lio/radar/sdk/model/RadarUserInsightsLocation;->confidence:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;

    iput-object p4, p0, Lio/radar/sdk/model/RadarUserInsightsLocation;->updatedAt:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final getType()Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    iget-object v0, p0, Lio/radar/sdk/model/RadarUserInsightsLocation;->type:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    return-object v0
.end method

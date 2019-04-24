.class public final enum Lio/radar/sdk/Radar$RadarTrackingSync;
.super Ljava/lang/Enum;
.source "Radar.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/Radar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RadarTrackingSync"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/Radar$RadarTrackingSync$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/radar/sdk/Radar$RadarTrackingSync;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lio/radar/sdk/Radar$RadarTrackingSync;",
        "",
        "mode",
        "",
        "(Ljava/lang/String;II)V",
        "getMode$sdk_release",
        "()I",
        "POSSIBLE_STATE_CHANGES",
        "ALL",
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
.field private static final synthetic $VALUES:[Lio/radar/sdk/Radar$RadarTrackingSync;

.field public static final enum ALL:Lio/radar/sdk/Radar$RadarTrackingSync;

.field public static final Companion:Lio/radar/sdk/Radar$RadarTrackingSync$Companion;

.field public static final enum POSSIBLE_STATE_CHANGES:Lio/radar/sdk/Radar$RadarTrackingSync;


# instance fields
.field private final mode:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Lio/radar/sdk/Radar$RadarTrackingSync;

    new-instance v1, Lio/radar/sdk/Radar$RadarTrackingSync;

    const-string v2, "POSSIBLE_STATE_CHANGES"

    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 132
    invoke-direct {v1, v2, v3, v4}, Lio/radar/sdk/Radar$RadarTrackingSync;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lio/radar/sdk/Radar$RadarTrackingSync;->POSSIBLE_STATE_CHANGES:Lio/radar/sdk/Radar$RadarTrackingSync;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/Radar$RadarTrackingSync;

    const-string v2, "ALL"

    const/4 v3, -0x1

    .line 134
    invoke-direct {v1, v2, v4, v3}, Lio/radar/sdk/Radar$RadarTrackingSync;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lio/radar/sdk/Radar$RadarTrackingSync;->ALL:Lio/radar/sdk/Radar$RadarTrackingSync;

    aput-object v1, v0, v4

    sput-object v0, Lio/radar/sdk/Radar$RadarTrackingSync;->$VALUES:[Lio/radar/sdk/Radar$RadarTrackingSync;

    new-instance v0, Lio/radar/sdk/Radar$RadarTrackingSync$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/Radar$RadarTrackingSync$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/Radar$RadarTrackingSync;->Companion:Lio/radar/sdk/Radar$RadarTrackingSync$Companion;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 130
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/radar/sdk/Radar$RadarTrackingSync;->mode:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/radar/sdk/Radar$RadarTrackingSync;
    .locals 1

    const-class v0, Lio/radar/sdk/Radar$RadarTrackingSync;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/radar/sdk/Radar$RadarTrackingSync;

    return-object p0
.end method

.method public static values()[Lio/radar/sdk/Radar$RadarTrackingSync;
    .locals 1

    sget-object v0, Lio/radar/sdk/Radar$RadarTrackingSync;->$VALUES:[Lio/radar/sdk/Radar$RadarTrackingSync;

    invoke-virtual {v0}, [Lio/radar/sdk/Radar$RadarTrackingSync;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/radar/sdk/Radar$RadarTrackingSync;

    return-object v0
.end method


# virtual methods
.method public final getMode$sdk_release()I
    .locals 1

    .line 130
    iget v0, p0, Lio/radar/sdk/Radar$RadarTrackingSync;->mode:I

    return v0
.end method

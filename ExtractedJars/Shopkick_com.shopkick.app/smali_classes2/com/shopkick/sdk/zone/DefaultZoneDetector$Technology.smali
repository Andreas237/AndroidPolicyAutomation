.class public final enum Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;
.super Ljava/lang/Enum;
.source "DefaultZoneDetector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/zone/DefaultZoneDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Technology"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

.field public static final enum GEOFENCE:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

.field public static final enum LOCATION_SERVICE:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

.field public static final enum SHOPKICK_BEACON:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

.field public static final enum WIFI:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 27
    new-instance v0, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    const-string v1, "GEOFENCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->GEOFENCE:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    new-instance v0, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    const-string v1, "LOCATION_SERVICE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->LOCATION_SERVICE:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    new-instance v0, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    const-string v1, "SHOPKICK_BEACON"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->SHOPKICK_BEACON:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    new-instance v0, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    const-string v1, "WIFI"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->WIFI:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    const/4 v0, 0x4

    .line 26
    new-array v0, v0, [Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    sget-object v1, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->GEOFENCE:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->LOCATION_SERVICE:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->SHOPKICK_BEACON:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->WIFI:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    aput-object v1, v0, v5

    sput-object v0, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->$VALUES:[Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;
    .locals 1

    .line 26
    const-class v0, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;
    .locals 1

    .line 26
    sget-object v0, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->$VALUES:[Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    return-object v0
.end method

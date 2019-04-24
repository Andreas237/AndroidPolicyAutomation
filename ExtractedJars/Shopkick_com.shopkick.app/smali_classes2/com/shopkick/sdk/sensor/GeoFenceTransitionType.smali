.class public final enum Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;
.super Ljava/lang/Enum;
.source "GeoFenceTransitionType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

.field public static final enum DWELL:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

.field public static final enum ENTER:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

.field public static final enum EXIT:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;


# instance fields
.field private final numericValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 18
    new-instance v0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    const-string v1, "ENTER"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->ENTER:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    .line 21
    new-instance v0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    const-string v1, "EXIT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v4}, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->EXIT:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    .line 24
    new-instance v0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    const-string v1, "DWELL"

    const/4 v5, 0x4

    invoke-direct {v0, v1, v4, v5}, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->DWELL:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    const/4 v0, 0x3

    .line 15
    new-array v0, v0, [Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    sget-object v1, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->ENTER:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->EXIT:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->DWELL:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->$VALUES:[Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 28
    iput p3, p0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->numericValue:I

    return-void
.end method

.method public static getTransitionTypeFromNumericValue(I)Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;
    .locals 4

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    .line 54
    new-instance v0, Ljava/lang/IllegalArgumentException;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 55
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v3

    const-string p0, "Unsupported GeoFence transition type [%1$s]"

    invoke-static {v1, p0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 50
    :pswitch_0
    sget-object p0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->EXIT:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    return-object p0

    .line 48
    :pswitch_1
    sget-object p0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->ENTER:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    return-object p0

    .line 52
    :cond_0
    sget-object p0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->DWELL:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;
    .locals 1

    .line 15
    const-class v0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;
    .locals 1

    .line 15
    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->$VALUES:[Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    return-object v0
.end method


# virtual methods
.method public getNumericValue()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->numericValue:I

    return v0
.end method

.class public final enum Lcom/mopub/common/LocationService$ValidLocationProvider;
.super Ljava/lang/Enum;
.source "LocationService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/common/LocationService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ValidLocationProvider"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/common/LocationService$ValidLocationProvider;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/common/LocationService$ValidLocationProvider;

.field public static final enum GPS:Lcom/mopub/common/LocationService$ValidLocationProvider;

.field public static final enum NETWORK:Lcom/mopub/common/LocationService$ValidLocationProvider;


# instance fields
.field final name:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 51
    new-instance v0, Lcom/mopub/common/LocationService$ValidLocationProvider;

    const-string v1, "NETWORK"

    const-string v2, "network"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/mopub/common/LocationService$ValidLocationProvider;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/LocationService$ValidLocationProvider;->NETWORK:Lcom/mopub/common/LocationService$ValidLocationProvider;

    .line 52
    new-instance v0, Lcom/mopub/common/LocationService$ValidLocationProvider;

    const-string v1, "GPS"

    const-string v2, "gps"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/mopub/common/LocationService$ValidLocationProvider;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/LocationService$ValidLocationProvider;->GPS:Lcom/mopub/common/LocationService$ValidLocationProvider;

    const/4 v0, 0x2

    .line 50
    new-array v0, v0, [Lcom/mopub/common/LocationService$ValidLocationProvider;

    sget-object v1, Lcom/mopub/common/LocationService$ValidLocationProvider;->NETWORK:Lcom/mopub/common/LocationService$ValidLocationProvider;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/common/LocationService$ValidLocationProvider;->GPS:Lcom/mopub/common/LocationService$ValidLocationProvider;

    aput-object v1, v0, v4

    sput-object v0, Lcom/mopub/common/LocationService$ValidLocationProvider;->$VALUES:[Lcom/mopub/common/LocationService$ValidLocationProvider;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 56
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 57
    iput-object p3, p0, Lcom/mopub/common/LocationService$ValidLocationProvider;->name:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/mopub/common/LocationService$ValidLocationProvider;Landroid/content/Context;)Z
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/mopub/common/LocationService$ValidLocationProvider;->hasRequiredPermissions(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method private hasRequiredPermissions(Landroid/content/Context;)Z
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 66
    sget-object v0, Lcom/mopub/common/LocationService$1;->$SwitchMap$com$mopub$common$LocationService$ValidLocationProvider:[I

    invoke-virtual {p0}, Lcom/mopub/common/LocationService$ValidLocationProvider;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    return v1

    :pswitch_0
    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 71
    invoke-static {p1, v0}, Lcom/mopub/common/util/DeviceUtils;->isPermissionGranted(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    return p1

    :pswitch_1
    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 68
    invoke-static {p1, v0}, Lcom/mopub/common/util/DeviceUtils;->isPermissionGranted(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p1, v0}, Lcom/mopub/common/util/DeviceUtils;->isPermissionGranted(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/LocationService$ValidLocationProvider;
    .locals 1

    .line 50
    const-class v0, Lcom/mopub/common/LocationService$ValidLocationProvider;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/common/LocationService$ValidLocationProvider;

    return-object p0
.end method

.method public static values()[Lcom/mopub/common/LocationService$ValidLocationProvider;
    .locals 1

    .line 50
    sget-object v0, Lcom/mopub/common/LocationService$ValidLocationProvider;->$VALUES:[Lcom/mopub/common/LocationService$ValidLocationProvider;

    invoke-virtual {v0}, [Lcom/mopub/common/LocationService$ValidLocationProvider;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/LocationService$ValidLocationProvider;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/mopub/common/LocationService$ValidLocationProvider;->name:Ljava/lang/String;

    return-object v0
.end method

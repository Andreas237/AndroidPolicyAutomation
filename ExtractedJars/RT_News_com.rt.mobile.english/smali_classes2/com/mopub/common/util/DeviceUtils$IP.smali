.class public final enum Lcom/mopub/common/util/DeviceUtils$IP;
.super Ljava/lang/Enum;
.source "DeviceUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/common/util/DeviceUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "IP"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/common/util/DeviceUtils$IP;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/common/util/DeviceUtils$IP;

.field public static final enum IPv4:Lcom/mopub/common/util/DeviceUtils$IP;

.field public static final enum IPv6:Lcom/mopub/common/util/DeviceUtils$IP;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 265
    new-instance v0, Lcom/mopub/common/util/DeviceUtils$IP;

    const-string v1, "IPv4"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mopub/common/util/DeviceUtils$IP;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/common/util/DeviceUtils$IP;->IPv4:Lcom/mopub/common/util/DeviceUtils$IP;

    new-instance v0, Lcom/mopub/common/util/DeviceUtils$IP;

    const-string v1, "IPv6"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/mopub/common/util/DeviceUtils$IP;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/common/util/DeviceUtils$IP;->IPv6:Lcom/mopub/common/util/DeviceUtils$IP;

    const/4 v0, 0x2

    .line 264
    new-array v0, v0, [Lcom/mopub/common/util/DeviceUtils$IP;

    sget-object v1, Lcom/mopub/common/util/DeviceUtils$IP;->IPv4:Lcom/mopub/common/util/DeviceUtils$IP;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/common/util/DeviceUtils$IP;->IPv6:Lcom/mopub/common/util/DeviceUtils$IP;

    aput-object v1, v0, v3

    sput-object v0, Lcom/mopub/common/util/DeviceUtils$IP;->$VALUES:[Lcom/mopub/common/util/DeviceUtils$IP;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 265
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/util/DeviceUtils$IP;
    .locals 1

    .line 264
    const-class v0, Lcom/mopub/common/util/DeviceUtils$IP;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/common/util/DeviceUtils$IP;

    return-object p0
.end method

.method public static values()[Lcom/mopub/common/util/DeviceUtils$IP;
    .locals 1

    .line 264
    sget-object v0, Lcom/mopub/common/util/DeviceUtils$IP;->$VALUES:[Lcom/mopub/common/util/DeviceUtils$IP;

    invoke-virtual {v0}, [Lcom/mopub/common/util/DeviceUtils$IP;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/util/DeviceUtils$IP;

    return-object v0
.end method

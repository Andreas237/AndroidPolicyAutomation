.class public final enum Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/device/open/HealthDevice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "BOND_STATE"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

.field public static final enum BONDED:Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

.field public static final enum UNBONDED:Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

.field public static final enum UNKNOWN:Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 30
    new-instance v0, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;->UNKNOWN:Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    .line 31
    new-instance v0, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    const-string v1, "BONDED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;->BONDED:Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    .line 32
    new-instance v0, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    const-string v1, "UNBONDED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;->UNBONDED:Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    .line 29
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    sget-object v1, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;->UNKNOWN:Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;->BONDED:Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;->UNBONDED:Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;->$VALUES:[Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;
    .locals 1

    .line 29
    const-class v0, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    return-object v0
.end method

.method public static values()[Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;
    .locals 1

    .line 29
    sget-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;->$VALUES:[Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    invoke-virtual {v0}, [Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;

    return-object v0
.end method

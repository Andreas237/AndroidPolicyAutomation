.class public final enum Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

.field public static final enum NORMAL:Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

.field public static final enum PRIVACY:Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

    const-string v1, "NORMAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;->NORMAL:Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

    const-string v1, "PRIVACY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;->PRIVACY:Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;->NORMAL:Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;->PRIVACY:Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;->$VALUES:[Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;
    .locals 1

    const-class v0, Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

    return-object v0
.end method

.method public static values()[Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;
    .locals 1

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;->$VALUES:[Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

    invoke-virtual {v0}, [Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/updatesdk/sdk/service/annotation/SecurityLevel;

    return-object v0
.end method

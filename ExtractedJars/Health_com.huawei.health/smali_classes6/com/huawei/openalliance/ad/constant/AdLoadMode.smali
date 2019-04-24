.class public final enum Lcom/huawei/openalliance/ad/constant/AdLoadMode;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/openalliance/ad/constant/AdLoadMode;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/openalliance/ad/constant/AdLoadMode;

.field public static final enum CACHE:Lcom/huawei/openalliance/ad/constant/AdLoadMode;

.field public static final enum REAL:Lcom/huawei/openalliance/ad/constant/AdLoadMode;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    const-string v1, "REAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/constant/AdLoadMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadMode;->REAL:Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    const-string v1, "CACHE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/constant/AdLoadMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadMode;->CACHE:Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    sget-object v1, Lcom/huawei/openalliance/ad/constant/AdLoadMode;->REAL:Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/AdLoadMode;->CACHE:Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadMode;->$VALUES:[Lcom/huawei/openalliance/ad/constant/AdLoadMode;

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

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/openalliance/ad/constant/AdLoadMode;
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    return-object v0
.end method

.method public static values()[Lcom/huawei/openalliance/ad/constant/AdLoadMode;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadMode;->$VALUES:[Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    invoke-virtual {v0}, [Lcom/huawei/openalliance/ad/constant/AdLoadMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    return-object v0
.end method

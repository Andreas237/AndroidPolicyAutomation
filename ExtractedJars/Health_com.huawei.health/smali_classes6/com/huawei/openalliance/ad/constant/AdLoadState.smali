.class public final enum Lcom/huawei/openalliance/ad/constant/AdLoadState;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/openalliance/ad/constant/AdLoadState;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/openalliance/ad/constant/AdLoadState;

.field public static final enum LOADED:Lcom/huawei/openalliance/ad/constant/AdLoadState;

.field public static final enum LOADING:Lcom/huawei/openalliance/ad/constant/AdLoadState;

.field public static final enum UNLOAD:Lcom/huawei/openalliance/ad/constant/AdLoadState;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/openalliance/ad/constant/AdLoadState;

    const-string v1, "UNLOAD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/constant/AdLoadState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadState;->UNLOAD:Lcom/huawei/openalliance/ad/constant/AdLoadState;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/AdLoadState;

    const-string v1, "LOADING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/constant/AdLoadState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadState;->LOADING:Lcom/huawei/openalliance/ad/constant/AdLoadState;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/AdLoadState;

    const-string v1, "LOADED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/constant/AdLoadState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadState;->LOADED:Lcom/huawei/openalliance/ad/constant/AdLoadState;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/huawei/openalliance/ad/constant/AdLoadState;

    sget-object v1, Lcom/huawei/openalliance/ad/constant/AdLoadState;->UNLOAD:Lcom/huawei/openalliance/ad/constant/AdLoadState;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/AdLoadState;->LOADING:Lcom/huawei/openalliance/ad/constant/AdLoadState;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/AdLoadState;->LOADED:Lcom/huawei/openalliance/ad/constant/AdLoadState;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadState;->$VALUES:[Lcom/huawei/openalliance/ad/constant/AdLoadState;

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

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/openalliance/ad/constant/AdLoadState;
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/constant/AdLoadState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/constant/AdLoadState;

    return-object v0
.end method

.method public static values()[Lcom/huawei/openalliance/ad/constant/AdLoadState;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadState;->$VALUES:[Lcom/huawei/openalliance/ad/constant/AdLoadState;

    invoke-virtual {v0}, [Lcom/huawei/openalliance/ad/constant/AdLoadState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/openalliance/ad/constant/AdLoadState;

    return-object v0
.end method

.class public final enum Lcom/huawei/openalliance/ad/constant/Scheme;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/openalliance/ad/constant/Scheme;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/openalliance/ad/constant/Scheme;

.field public static final enum ASSET:Lcom/huawei/openalliance/ad/constant/Scheme;

.field public static final enum CONTENT:Lcom/huawei/openalliance/ad/constant/Scheme;

.field public static final enum FILE:Lcom/huawei/openalliance/ad/constant/Scheme;

.field public static final enum HTTP:Lcom/huawei/openalliance/ad/constant/Scheme;

.field public static final enum HTTPS:Lcom/huawei/openalliance/ad/constant/Scheme;

.field public static final enum RES:Lcom/huawei/openalliance/ad/constant/Scheme;


# instance fields
.field scheme:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/huawei/openalliance/ad/constant/Scheme;

    const-string v1, "HTTP"

    const-string v2, "http://"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/Scheme;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->HTTP:Lcom/huawei/openalliance/ad/constant/Scheme;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/Scheme;

    const-string v1, "HTTPS"

    const-string v2, "https://"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/Scheme;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->HTTPS:Lcom/huawei/openalliance/ad/constant/Scheme;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/Scheme;

    const-string v1, "FILE"

    const-string v2, "file://"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/Scheme;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->FILE:Lcom/huawei/openalliance/ad/constant/Scheme;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/Scheme;

    const-string v1, "CONTENT"

    const-string v2, "content://"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/Scheme;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->CONTENT:Lcom/huawei/openalliance/ad/constant/Scheme;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/Scheme;

    const-string v1, "ASSET"

    const-string v2, "asset://"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/Scheme;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->ASSET:Lcom/huawei/openalliance/ad/constant/Scheme;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/Scheme;

    const-string v1, "RES"

    const-string v2, "res://"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/Scheme;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->RES:Lcom/huawei/openalliance/ad/constant/Scheme;

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/huawei/openalliance/ad/constant/Scheme;

    sget-object v1, Lcom/huawei/openalliance/ad/constant/Scheme;->HTTP:Lcom/huawei/openalliance/ad/constant/Scheme;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/Scheme;->HTTPS:Lcom/huawei/openalliance/ad/constant/Scheme;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/Scheme;->FILE:Lcom/huawei/openalliance/ad/constant/Scheme;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/Scheme;->CONTENT:Lcom/huawei/openalliance/ad/constant/Scheme;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/Scheme;->ASSET:Lcom/huawei/openalliance/ad/constant/Scheme;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/Scheme;->RES:Lcom/huawei/openalliance/ad/constant/Scheme;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->$VALUES:[Lcom/huawei/openalliance/ad/constant/Scheme;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/huawei/openalliance/ad/constant/Scheme;->scheme:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/openalliance/ad/constant/Scheme;
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/constant/Scheme;

    return-object v0
.end method

.method public static values()[Lcom/huawei/openalliance/ad/constant/Scheme;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->$VALUES:[Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-virtual {v0}, [Lcom/huawei/openalliance/ad/constant/Scheme;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/openalliance/ad/constant/Scheme;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/constant/Scheme;->scheme:Ljava/lang/String;

    return-object v0
.end method

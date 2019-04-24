.class public final enum Lcom/tencent/mm/opensdk/diffdev/a/g;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/tencent/mm/opensdk/diffdev/a/g;>;"
    }
.end annotation


# static fields
.field public static final enum A:Lcom/tencent/mm/opensdk/diffdev/a/g;

.field public static final enum B:Lcom/tencent/mm/opensdk/diffdev/a/g;

.field public static final enum C:Lcom/tencent/mm/opensdk/diffdev/a/g;

.field private static final synthetic D:[Lcom/tencent/mm/opensdk/diffdev/a/g;

.field public static final enum x:Lcom/tencent/mm/opensdk/diffdev/a/g;

.field public static final enum y:Lcom/tencent/mm/opensdk/diffdev/a/g;

.field public static final enum z:Lcom/tencent/mm/opensdk/diffdev/a/g;


# instance fields
.field private code:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/tencent/mm/opensdk/diffdev/a/g;

    const-string v1, "UUID_EXPIRED"

    const/4 v2, 0x0

    const/16 v3, 0x192

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/mm/opensdk/diffdev/a/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/mm/opensdk/diffdev/a/g;->x:Lcom/tencent/mm/opensdk/diffdev/a/g;

    new-instance v0, Lcom/tencent/mm/opensdk/diffdev/a/g;

    const-string v1, "UUID_CANCELED"

    const/4 v2, 0x1

    const/16 v3, 0x193

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/mm/opensdk/diffdev/a/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/mm/opensdk/diffdev/a/g;->y:Lcom/tencent/mm/opensdk/diffdev/a/g;

    new-instance v0, Lcom/tencent/mm/opensdk/diffdev/a/g;

    const-string v1, "UUID_SCANED"

    const/4 v2, 0x2

    const/16 v3, 0x194

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/mm/opensdk/diffdev/a/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/mm/opensdk/diffdev/a/g;->z:Lcom/tencent/mm/opensdk/diffdev/a/g;

    new-instance v0, Lcom/tencent/mm/opensdk/diffdev/a/g;

    const-string v1, "UUID_CONFIRM"

    const/4 v2, 0x3

    const/16 v3, 0x195

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/mm/opensdk/diffdev/a/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/mm/opensdk/diffdev/a/g;->A:Lcom/tencent/mm/opensdk/diffdev/a/g;

    new-instance v0, Lcom/tencent/mm/opensdk/diffdev/a/g;

    const-string v1, "UUID_KEEP_CONNECT"

    const/4 v2, 0x4

    const/16 v3, 0x198

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/mm/opensdk/diffdev/a/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/mm/opensdk/diffdev/a/g;->B:Lcom/tencent/mm/opensdk/diffdev/a/g;

    new-instance v0, Lcom/tencent/mm/opensdk/diffdev/a/g;

    const-string v1, "UUID_ERROR"

    const/4 v2, 0x5

    const/16 v3, 0x1f4

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/mm/opensdk/diffdev/a/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/mm/opensdk/diffdev/a/g;->C:Lcom/tencent/mm/opensdk/diffdev/a/g;

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/tencent/mm/opensdk/diffdev/a/g;

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/a/g;->x:Lcom/tencent/mm/opensdk/diffdev/a/g;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/a/g;->y:Lcom/tencent/mm/opensdk/diffdev/a/g;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/a/g;->z:Lcom/tencent/mm/opensdk/diffdev/a/g;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/a/g;->A:Lcom/tencent/mm/opensdk/diffdev/a/g;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/a/g;->B:Lcom/tencent/mm/opensdk/diffdev/a/g;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/a/g;->C:Lcom/tencent/mm/opensdk/diffdev/a/g;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lcom/tencent/mm/opensdk/diffdev/a/g;->D:[Lcom/tencent/mm/opensdk/diffdev/a/g;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/tencent/mm/opensdk/diffdev/a/g;->code:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tencent/mm/opensdk/diffdev/a/g;
    .locals 1

    const-class v0, Lcom/tencent/mm/opensdk/diffdev/a/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/tencent/mm/opensdk/diffdev/a/g;

    return-object v0
.end method

.method public static values()[Lcom/tencent/mm/opensdk/diffdev/a/g;
    .locals 1

    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/a/g;->D:[Lcom/tencent/mm/opensdk/diffdev/a/g;

    invoke-virtual {v0}, [Lcom/tencent/mm/opensdk/diffdev/a/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tencent/mm/opensdk/diffdev/a/g;

    return-object v0
.end method


# virtual methods
.method public final getCode()I
    .locals 1

    iget v0, p0, Lcom/tencent/mm/opensdk/diffdev/a/g;->code:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UUIDStatusCode:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/tencent/mm/opensdk/diffdev/a/g;->code:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

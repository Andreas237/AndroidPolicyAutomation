.class public final enum Lcom/huawei/openalliance/ad/download/d;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/openalliance/ad/download/d;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/openalliance/ad/download/d;

.field public static final enum b:Lcom/huawei/openalliance/ad/download/d;

.field public static final enum c:Lcom/huawei/openalliance/ad/download/d;

.field public static final enum d:Lcom/huawei/openalliance/ad/download/d;

.field public static final enum e:Lcom/huawei/openalliance/ad/download/d;

.field public static final enum f:Lcom/huawei/openalliance/ad/download/d;

.field public static final enum g:Lcom/huawei/openalliance/ad/download/d;

.field private static final synthetic h:[Lcom/huawei/openalliance/ad/download/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/openalliance/ad/download/d;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/d;->a:Lcom/huawei/openalliance/ad/download/d;

    new-instance v0, Lcom/huawei/openalliance/ad/download/d;

    const-string v1, "WAITING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/d;->b:Lcom/huawei/openalliance/ad/download/d;

    new-instance v0, Lcom/huawei/openalliance/ad/download/d;

    const-string v1, "DOWNLOADING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/d;->c:Lcom/huawei/openalliance/ad/download/d;

    new-instance v0, Lcom/huawei/openalliance/ad/download/d;

    const-string v1, "DOWNLOADED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/d;->d:Lcom/huawei/openalliance/ad/download/d;

    new-instance v0, Lcom/huawei/openalliance/ad/download/d;

    const-string v1, "FAILED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/d;->e:Lcom/huawei/openalliance/ad/download/d;

    new-instance v0, Lcom/huawei/openalliance/ad/download/d;

    const-string v1, "INSTALLING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/d;->f:Lcom/huawei/openalliance/ad/download/d;

    new-instance v0, Lcom/huawei/openalliance/ad/download/d;

    const-string v1, "INSTALLED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/d;->g:Lcom/huawei/openalliance/ad/download/d;

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/huawei/openalliance/ad/download/d;

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->a:Lcom/huawei/openalliance/ad/download/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->b:Lcom/huawei/openalliance/ad/download/d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->c:Lcom/huawei/openalliance/ad/download/d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->d:Lcom/huawei/openalliance/ad/download/d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->e:Lcom/huawei/openalliance/ad/download/d;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->f:Lcom/huawei/openalliance/ad/download/d;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->g:Lcom/huawei/openalliance/ad/download/d;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/openalliance/ad/download/d;->h:[Lcom/huawei/openalliance/ad/download/d;

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

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/d;
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/download/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/download/d;

    return-object v0
.end method

.method public static values()[Lcom/huawei/openalliance/ad/download/d;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/download/d;->h:[Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {v0}, [Lcom/huawei/openalliance/ad/download/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/openalliance/ad/download/d;

    return-object v0
.end method

.class public final enum Lcom/tencent/stat/a/f;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/tencent/stat/a/f;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/tencent/stat/a/f;

.field public static final enum b:Lcom/tencent/stat/a/f;

.field public static final enum c:Lcom/tencent/stat/a/f;

.field public static final enum d:Lcom/tencent/stat/a/f;

.field public static final enum e:Lcom/tencent/stat/a/f;

.field public static final enum f:Lcom/tencent/stat/a/f;

.field public static final enum g:Lcom/tencent/stat/a/f;

.field public static final enum h:Lcom/tencent/stat/a/f;

.field private static final synthetic j:[Lcom/tencent/stat/a/f;


# instance fields
.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/tencent/stat/a/f;

    const-string v1, "PAGE_VIEW"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/stat/a/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/stat/a/f;->a:Lcom/tencent/stat/a/f;

    new-instance v0, Lcom/tencent/stat/a/f;

    const-string v1, "SESSION_ENV"

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/stat/a/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/stat/a/f;->b:Lcom/tencent/stat/a/f;

    new-instance v0, Lcom/tencent/stat/a/f;

    const-string v1, "ERROR"

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/stat/a/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/stat/a/f;->c:Lcom/tencent/stat/a/f;

    new-instance v0, Lcom/tencent/stat/a/f;

    const-string v1, "CUSTOM"

    const/4 v2, 0x3

    const/16 v3, 0x3e8

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/stat/a/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/stat/a/f;->d:Lcom/tencent/stat/a/f;

    new-instance v0, Lcom/tencent/stat/a/f;

    const-string v1, "ADDITION"

    const/4 v2, 0x4

    const/16 v3, 0x3e9

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/stat/a/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/stat/a/f;->e:Lcom/tencent/stat/a/f;

    new-instance v0, Lcom/tencent/stat/a/f;

    const-string v1, "MONITOR_STAT"

    const/4 v2, 0x5

    const/16 v3, 0x3ea

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/stat/a/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/stat/a/f;->f:Lcom/tencent/stat/a/f;

    new-instance v0, Lcom/tencent/stat/a/f;

    const-string v1, "MTA_GAME_USER"

    const/4 v2, 0x6

    const/16 v3, 0x3eb

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/stat/a/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/stat/a/f;->g:Lcom/tencent/stat/a/f;

    new-instance v0, Lcom/tencent/stat/a/f;

    const-string v1, "NETWORK_MONITOR"

    const/4 v2, 0x7

    const/16 v3, 0x3ec

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/stat/a/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/stat/a/f;->h:Lcom/tencent/stat/a/f;

    const/16 v0, 0x8

    new-array v0, v0, [Lcom/tencent/stat/a/f;

    sget-object v1, Lcom/tencent/stat/a/f;->a:Lcom/tencent/stat/a/f;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/stat/a/f;->b:Lcom/tencent/stat/a/f;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/stat/a/f;->c:Lcom/tencent/stat/a/f;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/stat/a/f;->d:Lcom/tencent/stat/a/f;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/stat/a/f;->e:Lcom/tencent/stat/a/f;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/stat/a/f;->f:Lcom/tencent/stat/a/f;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/stat/a/f;->g:Lcom/tencent/stat/a/f;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/stat/a/f;->h:Lcom/tencent/stat/a/f;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/tencent/stat/a/f;->j:[Lcom/tencent/stat/a/f;

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

    iput p3, p0, Lcom/tencent/stat/a/f;->i:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/tencent/stat/a/f;->i:I

    return v0
.end method

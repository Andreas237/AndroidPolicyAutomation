.class final enum Lo/fsf$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fsf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fsf$d;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fsf$d;

.field public static final enum b:Lo/fsf$d;

.field public static final enum c:Lo/fsf$d;

.field public static final enum d:Lo/fsf$d;

.field public static final enum e:Lo/fsf$d;

.field private static final synthetic o:[Lo/fsf$d;


# instance fields
.field private f:I

.field private g:Ljava/lang/String;

.field private h:I

.field private i:I

.field private k:Lo/fsf$b;

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 435
    new-instance v0, Lo/fsf$d;

    const-string v1, "NULL"

    const-string v3, "NULL"

    sget-object v4, Lo/fsf$b;->b:Lo/fsf$b;

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lo/fsf$d;-><init>(Ljava/lang/String;ILjava/lang/String;Lo/fsf$b;III)V

    sput-object v0, Lo/fsf$d;->a:Lo/fsf$d;

    .line 436
    new-instance v0, Lo/fsf$d;

    const-string v1, "B_3DES_EDE_CBC"

    const-string v3, "DESede/CBC/NoPadding"

    sget-object v4, Lo/fsf$b;->e:Lo/fsf$b;

    const/4 v2, 0x1

    const/16 v5, 0x18

    const/4 v6, 0x4

    const/16 v7, 0x8

    invoke-direct/range {v0 .. v7}, Lo/fsf$d;-><init>(Ljava/lang/String;ILjava/lang/String;Lo/fsf$b;III)V

    sput-object v0, Lo/fsf$d;->b:Lo/fsf$d;

    .line 437
    new-instance v0, Lo/fsf$d;

    const-string v1, "AES_128_CBC"

    const-string v3, "AES/CBC/NoPadding"

    sget-object v4, Lo/fsf$b;->e:Lo/fsf$b;

    const/4 v2, 0x2

    const/16 v5, 0x10

    const/4 v6, 0x4

    const/16 v7, 0x10

    invoke-direct/range {v0 .. v7}, Lo/fsf$d;-><init>(Ljava/lang/String;ILjava/lang/String;Lo/fsf$b;III)V

    sput-object v0, Lo/fsf$d;->d:Lo/fsf$d;

    .line 438
    new-instance v0, Lo/fsf$d;

    const-string v1, "AES_256_CBC"

    const-string v3, "AES/CBC/NoPadding"

    sget-object v4, Lo/fsf$b;->e:Lo/fsf$b;

    const/4 v2, 0x3

    const/16 v5, 0x20

    const/4 v6, 0x4

    const/16 v7, 0x10

    invoke-direct/range {v0 .. v7}, Lo/fsf$d;-><init>(Ljava/lang/String;ILjava/lang/String;Lo/fsf$b;III)V

    sput-object v0, Lo/fsf$d;->e:Lo/fsf$d;

    .line 439
    new-instance v0, Lo/fsf$d;

    const-string v1, "AES_128_CCM_8"

    const-string v3, "CCM"

    sget-object v4, Lo/fsf$b;->d:Lo/fsf$b;

    const/4 v2, 0x4

    const/16 v5, 0x10

    const/4 v6, 0x4

    const/16 v7, 0x8

    const/16 v8, 0x8

    invoke-direct/range {v0 .. v8}, Lo/fsf$d;-><init>(Ljava/lang/String;ILjava/lang/String;Lo/fsf$b;IIII)V

    sput-object v0, Lo/fsf$d;->c:Lo/fsf$d;

    .line 432
    const/4 v0, 0x5

    new-array v0, v0, [Lo/fsf$d;

    sget-object v1, Lo/fsf$d;->a:Lo/fsf$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$d;->b:Lo/fsf$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$d;->d:Lo/fsf$d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$d;->e:Lo/fsf$d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$d;->c:Lo/fsf$d;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lo/fsf$d;->o:[Lo/fsf$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lo/fsf$b;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/fsf$b;III)V"
        }
    .end annotation

    .line 454
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 455
    iput-object p3, p0, Lo/fsf$d;->g:Ljava/lang/String;

    .line 456
    iput-object p4, p0, Lo/fsf$d;->k:Lo/fsf$b;

    .line 457
    iput p5, p0, Lo/fsf$d;->i:I

    .line 458
    iput p6, p0, Lo/fsf$d;->h:I

    .line 459
    iput p7, p0, Lo/fsf$d;->f:I

    .line 460
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lo/fsf$b;IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/fsf$b;IIII)V"
        }
    .end annotation

    .line 464
    invoke-direct/range {p0 .. p7}, Lo/fsf$d;-><init>(Ljava/lang/String;ILjava/lang/String;Lo/fsf$b;III)V

    .line 465
    iput p8, p0, Lo/fsf$d;->p:I

    .line 466
    return-void
.end method

.method private a()I
    .locals 1

    .line 505
    iget v0, p0, Lo/fsf$d;->f:I

    return v0
.end method

.method static synthetic a(Lo/fsf$d;)Ljava/lang/String;
    .locals 1

    .line 432
    invoke-direct {p0}, Lo/fsf$d;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()I
    .locals 1

    .line 488
    iget v0, p0, Lo/fsf$d;->i:I

    return v0
.end method

.method static synthetic b(Lo/fsf$d;)I
    .locals 1

    .line 432
    invoke-direct {p0}, Lo/fsf$d;->a()I

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/fsf$d;)I
    .locals 1

    .line 432
    invoke-direct {p0}, Lo/fsf$d;->d()I

    move-result v0

    return v0
.end method

.method private c()Lo/fsf$b;
    .locals 1

    .line 484
    iget-object v0, p0, Lo/fsf$d;->k:Lo/fsf$b;

    return-object v0
.end method

.method private d()I
    .locals 1

    .line 492
    iget v0, p0, Lo/fsf$d;->h:I

    return v0
.end method

.method static synthetic d(Lo/fsf$d;)I
    .locals 1

    .line 432
    invoke-direct {p0}, Lo/fsf$d;->k()I

    move-result v0

    return v0
.end method

.method private e()Ljava/lang/String;
    .locals 1

    .line 480
    iget-object v0, p0, Lo/fsf$d;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lo/fsf$d;)Lo/fsf$b;
    .locals 1

    .line 432
    invoke-direct {p0}, Lo/fsf$d;->c()Lo/fsf$b;

    move-result-object v0

    return-object v0
.end method

.method private k()I
    .locals 1

    .line 509
    iget v0, p0, Lo/fsf$d;->p:I

    return v0
.end method

.method static synthetic k(Lo/fsf$d;)I
    .locals 1

    .line 432
    invoke-direct {p0}, Lo/fsf$d;->b()I

    move-result v0

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fsf$d;
    .locals 1

    .line 432
    const-class v0, Lo/fsf$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fsf$d;

    return-object v0
.end method

.method public static values()[Lo/fsf$d;
    .locals 1

    .line 432
    sget-object v0, Lo/fsf$d;->o:[Lo/fsf$d;

    invoke-virtual {v0}, [Lo/fsf$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fsf$d;

    return-object v0
.end method

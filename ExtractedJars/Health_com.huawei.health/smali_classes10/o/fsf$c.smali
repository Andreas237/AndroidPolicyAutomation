.class final enum Lo/fsf$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fsf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fsf$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fsf$c;

.field public static final enum b:Lo/fsf$c;

.field public static final enum c:Lo/fsf$c;

.field public static final enum d:Lo/fsf$c;

.field public static final enum e:Lo/fsf$c;

.field public static final enum i:Lo/fsf$c;

.field private static final synthetic k:[Lo/fsf$c;


# instance fields
.field private f:Ljava/lang/String;

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 380
    new-instance v0, Lo/fsf$c;

    const-string v1, "NULL"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fsf$c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lo/fsf$c;->e:Lo/fsf$c;

    .line 381
    new-instance v0, Lo/fsf$c;

    const-string v1, "HMAC_MD5"

    const-string v2, "HmacMD5"

    const/4 v3, 0x1

    const/16 v4, 0x10

    invoke-direct {v0, v1, v3, v2, v4}, Lo/fsf$c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lo/fsf$c;->c:Lo/fsf$c;

    .line 382
    new-instance v0, Lo/fsf$c;

    const-string v1, "HMAC_SHA1"

    const-string v2, "HmacSHA1"

    const/4 v3, 0x2

    const/16 v4, 0x14

    invoke-direct {v0, v1, v3, v2, v4}, Lo/fsf$c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lo/fsf$c;->d:Lo/fsf$c;

    .line 383
    new-instance v0, Lo/fsf$c;

    const-string v1, "HMAC_SHA256"

    const-string v2, "HmacSHA256"

    const/4 v3, 0x3

    const/16 v4, 0x20

    invoke-direct {v0, v1, v3, v2, v4}, Lo/fsf$c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lo/fsf$c;->a:Lo/fsf$c;

    .line 384
    new-instance v0, Lo/fsf$c;

    const-string v1, "HMAC_SHA384"

    const-string v2, "HmacSHA384"

    const/4 v3, 0x4

    const/16 v4, 0x30

    invoke-direct {v0, v1, v3, v2, v4}, Lo/fsf$c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lo/fsf$c;->b:Lo/fsf$c;

    .line 385
    new-instance v0, Lo/fsf$c;

    const-string v1, "HMAC_SHA512"

    const-string v2, "HmacSHA512"

    const/4 v3, 0x5

    const/16 v4, 0x40

    invoke-direct {v0, v1, v3, v2, v4}, Lo/fsf$c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lo/fsf$c;->i:Lo/fsf$c;

    .line 379
    const/4 v0, 0x6

    new-array v0, v0, [Lo/fsf$c;

    sget-object v1, Lo/fsf$c;->e:Lo/fsf$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$c;->c:Lo/fsf$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$c;->d:Lo/fsf$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$c;->a:Lo/fsf$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$c;->b:Lo/fsf$c;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$c;->i:Lo/fsf$c;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lo/fsf$c;->k:[Lo/fsf$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)V"
        }
    .end annotation

    .line 390
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 391
    iput-object p3, p0, Lo/fsf$c;->f:Ljava/lang/String;

    .line 392
    iput p4, p0, Lo/fsf$c;->h:I

    .line 393
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fsf$c;
    .locals 1

    .line 379
    const-class v0, Lo/fsf$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fsf$c;

    return-object v0
.end method

.method public static values()[Lo/fsf$c;
    .locals 1

    .line 379
    sget-object v0, Lo/fsf$c;->k:[Lo/fsf$c;

    invoke-virtual {v0}, [Lo/fsf$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fsf$c;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 416
    iget v0, p0, Lo/fsf$c;->h:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 407
    iget-object v0, p0, Lo/fsf$c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 428
    iget v0, p0, Lo/fsf$c;->h:I

    return v0
.end method

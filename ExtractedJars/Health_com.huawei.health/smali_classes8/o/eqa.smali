.class public final enum Lo/eqa;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/eqa;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/eqa;

.field public static final enum b:Lo/eqa;

.field public static final enum c:Lo/eqa;

.field public static final enum d:Lo/eqa;

.field public static final enum e:Lo/eqa;

.field public static final enum f:Lo/eqa;

.field public static final enum h:Lo/eqa;

.field public static final enum i:Lo/eqa;

.field public static final enum k:Lo/eqa;

.field private static final synthetic n:[Lo/eqa;


# instance fields
.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 9
    new-instance v0, Lo/eqa;

    const-string v1, "SPROTS_CARD"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/eqa;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/eqa;->e:Lo/eqa;

    .line 10
    new-instance v0, Lo/eqa;

    const-string v1, "WEIGHT_CARD"

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/eqa;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/eqa;->c:Lo/eqa;

    .line 11
    new-instance v0, Lo/eqa;

    const-string v1, "SLEEP_CARD"

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/eqa;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/eqa;->a:Lo/eqa;

    .line 12
    new-instance v0, Lo/eqa;

    const-string v1, "STRESS_CARD"

    const/4 v2, 0x3

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lo/eqa;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/eqa;->b:Lo/eqa;

    .line 13
    new-instance v0, Lo/eqa;

    const-string v1, "HEARD_RATE_CARD"

    const/4 v2, 0x4

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lo/eqa;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/eqa;->d:Lo/eqa;

    .line 14
    new-instance v0, Lo/eqa;

    const-string v1, "VO2MAX_CARD"

    const/4 v2, 0x5

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lo/eqa;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/eqa;->k:Lo/eqa;

    .line 15
    new-instance v0, Lo/eqa;

    const-string v1, "BLOOD_PRESSURE_CARD"

    const/4 v2, 0x6

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Lo/eqa;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/eqa;->h:Lo/eqa;

    .line 16
    new-instance v0, Lo/eqa;

    const-string v1, "BLOOD_SUGAR_CARD"

    const/4 v2, 0x7

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lo/eqa;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/eqa;->i:Lo/eqa;

    .line 17
    new-instance v0, Lo/eqa;

    const-string v1, "MANAGEMENT_CARD"

    const/16 v2, 0x8

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, v3}, Lo/eqa;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/eqa;->f:Lo/eqa;

    .line 7
    const/16 v0, 0x9

    new-array v0, v0, [Lo/eqa;

    sget-object v1, Lo/eqa;->e:Lo/eqa;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/eqa;->c:Lo/eqa;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/eqa;->a:Lo/eqa;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/eqa;->b:Lo/eqa;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/eqa;->d:Lo/eqa;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/eqa;->k:Lo/eqa;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/eqa;->h:Lo/eqa;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/eqa;->i:Lo/eqa;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/eqa;->f:Lo/eqa;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sput-object v0, Lo/eqa;->n:[Lo/eqa;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 22
    iput p3, p0, Lo/eqa;->g:I

    .line 23
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/eqa;
    .locals 1

    .line 7
    const-class v0, Lo/eqa;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/eqa;

    return-object v0
.end method

.method public static values()[Lo/eqa;
    .locals 1

    .line 7
    sget-object v0, Lo/eqa;->n:[Lo/eqa;

    invoke-virtual {v0}, [Lo/eqa;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/eqa;

    return-object v0
.end method

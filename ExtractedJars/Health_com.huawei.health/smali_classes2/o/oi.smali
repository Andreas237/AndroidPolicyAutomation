.class public final enum Lo/oi;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/oi;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/oi;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum b:Lo/oi;

.field public static final enum c:Lo/oi;

.field public static final enum d:Lo/oi;

.field public static final enum e:Lo/oi;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum f:Lo/oi;

.field public static final enum g:Lo/oi;

.field public static final enum h:Lo/oi;

.field public static final enum i:Lo/oi;

.field public static final enum k:Lo/oi;

.field private static final synthetic p:[Lo/oi;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 34
    new-instance v0, Lo/oi;

    const-string v1, "ERROR_CORRECTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/oi;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oi;->c:Lo/oi;

    .line 39
    new-instance v0, Lo/oi;

    const-string v1, "CHARACTER_SET"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/oi;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oi;->d:Lo/oi;

    .line 44
    new-instance v0, Lo/oi;

    const-string v1, "DATA_MATRIX_SHAPE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/oi;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oi;->b:Lo/oi;

    .line 52
    new-instance v0, Lo/oi;

    const-string v1, "MIN_SIZE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/oi;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oi;->a:Lo/oi;

    .line 60
    new-instance v0, Lo/oi;

    const-string v1, "MAX_SIZE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/oi;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oi;->e:Lo/oi;

    .line 68
    new-instance v0, Lo/oi;

    const-string v1, "MARGIN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/oi;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oi;->h:Lo/oi;

    .line 73
    new-instance v0, Lo/oi;

    const-string v1, "PDF417_COMPACT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lo/oi;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oi;->g:Lo/oi;

    .line 79
    new-instance v0, Lo/oi;

    const-string v1, "PDF417_COMPACTION"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lo/oi;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oi;->k:Lo/oi;

    .line 85
    new-instance v0, Lo/oi;

    const-string v1, "PDF417_DIMENSIONS"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lo/oi;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oi;->i:Lo/oi;

    .line 93
    new-instance v0, Lo/oi;

    const-string v1, "AZTEC_LAYERS"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lo/oi;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oi;->f:Lo/oi;

    .line 24
    const/16 v0, 0xa

    new-array v0, v0, [Lo/oi;

    sget-object v1, Lo/oi;->c:Lo/oi;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/oi;->d:Lo/oi;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/oi;->b:Lo/oi;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/oi;->a:Lo/oi;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/oi;->e:Lo/oi;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/oi;->h:Lo/oi;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/oi;->g:Lo/oi;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/oi;->k:Lo/oi;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/oi;->i:Lo/oi;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lo/oi;->f:Lo/oi;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sput-object v0, Lo/oi;->p:[Lo/oi;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/oi;
    .locals 1

    .line 24
    const-class v0, Lo/oi;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/oi;

    return-object v0
.end method

.method public static values()[Lo/oi;
    .locals 1

    .line 24
    sget-object v0, Lo/oi;->p:[Lo/oi;

    invoke-virtual {v0}, [Lo/oi;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/oi;

    return-object v0
.end method

.class public final enum Lo/og;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/og;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/og;

.field public static final enum b:Lo/og;

.field public static final enum c:Lo/og;

.field public static final enum d:Lo/og;

.field public static final enum e:Lo/og;

.field public static final enum f:Lo/og;

.field public static final enum g:Lo/og;

.field public static final enum h:Lo/og;

.field public static final enum i:Lo/og;

.field public static final enum k:Lo/og;

.field private static final synthetic l:[Lo/og;

.field public static final enum p:Lo/og;


# instance fields
.field private final n:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 35
    new-instance v0, Lo/og;

    const-string v1, "OTHER"

    const-class v2, Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lo/og;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lo/og;->c:Lo/og;

    .line 41
    new-instance v0, Lo/og;

    const-string v1, "PURE_BARCODE"

    const-class v2, Ljava/lang/Void;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lo/og;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lo/og;->a:Lo/og;

    .line 47
    new-instance v0, Lo/og;

    const-string v1, "POSSIBLE_FORMATS"

    const-class v2, Ljava/util/List;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Lo/og;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lo/og;->d:Lo/og;

    .line 53
    new-instance v0, Lo/og;

    const-string v1, "TRY_HARDER"

    const-class v2, Ljava/lang/Void;

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v2}, Lo/og;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lo/og;->b:Lo/og;

    .line 58
    new-instance v0, Lo/og;

    const-string v1, "CHARACTER_SET"

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, Lo/og;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lo/og;->e:Lo/og;

    .line 63
    new-instance v0, Lo/og;

    const-string v1, "ALLOWED_LENGTHS"

    const-class v2, [I

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3, v2}, Lo/og;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lo/og;->g:Lo/og;

    .line 69
    new-instance v0, Lo/og;

    const-string v1, "ASSUME_CODE_39_CHECK_DIGIT"

    const-class v2, Ljava/lang/Void;

    const/4 v3, 0x6

    invoke-direct {v0, v1, v3, v2}, Lo/og;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lo/og;->k:Lo/og;

    .line 76
    new-instance v0, Lo/og;

    const-string v1, "ASSUME_GS1"

    const-class v2, Ljava/lang/Void;

    const/4 v3, 0x7

    invoke-direct {v0, v1, v3, v2}, Lo/og;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lo/og;->i:Lo/og;

    .line 83
    new-instance v0, Lo/og;

    const-string v1, "RETURN_CODABAR_START_END"

    const-class v2, Ljava/lang/Void;

    const/16 v3, 0x8

    invoke-direct {v0, v1, v3, v2}, Lo/og;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lo/og;->f:Lo/og;

    .line 89
    new-instance v0, Lo/og;

    const-string v1, "NEED_RESULT_POINT_CALLBACK"

    const-class v2, Lo/oy;

    const/16 v3, 0x9

    invoke-direct {v0, v1, v3, v2}, Lo/og;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lo/og;->h:Lo/og;

    .line 99
    new-instance v0, Lo/og;

    const-string v1, "ALLOWED_EAN_EXTENSIONS"

    const-class v2, [I

    const/16 v3, 0xa

    invoke-direct {v0, v1, v3, v2}, Lo/og;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lo/og;->p:Lo/og;

    .line 30
    const/16 v0, 0xb

    new-array v0, v0, [Lo/og;

    sget-object v1, Lo/og;->c:Lo/og;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/og;->a:Lo/og;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/og;->d:Lo/og;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/og;->b:Lo/og;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/og;->e:Lo/og;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/og;->g:Lo/og;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/og;->k:Lo/og;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/og;->i:Lo/og;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/og;->f:Lo/og;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lo/og;->h:Lo/og;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lo/og;->p:Lo/og;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sput-object v0, Lo/og;->l:[Lo/og;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)V"
        }
    .end annotation

    .line 114
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 115
    iput-object p3, p0, Lo/og;->n:Ljava/lang/Class;

    .line 116
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/og;
    .locals 1

    .line 30
    const-class v0, Lo/og;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/og;

    return-object v0
.end method

.method public static values()[Lo/og;
    .locals 1

    .line 30
    sget-object v0, Lo/og;->l:[Lo/og;

    invoke-virtual {v0}, [Lo/og;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/og;

    return-object v0
.end method

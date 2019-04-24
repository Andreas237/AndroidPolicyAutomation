.class public final enum Lo/oq;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/oq;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/oq;

.field public static final enum b:Lo/oq;

.field public static final enum c:Lo/oq;

.field public static final enum d:Lo/oq;

.field public static final enum e:Lo/oq;

.field public static final enum f:Lo/oq;

.field public static final enum g:Lo/oq;

.field public static final enum h:Lo/oq;

.field public static final enum i:Lo/oq;

.field public static final enum k:Lo/oq;

.field private static final synthetic l:[Lo/oq;

.field public static final enum m:Lo/oq;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 30
    new-instance v0, Lo/oq;

    const-string v1, "OTHER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/oq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oq;->a:Lo/oq;

    .line 39
    new-instance v0, Lo/oq;

    const-string v1, "ORIENTATION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/oq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oq;->d:Lo/oq;

    .line 50
    new-instance v0, Lo/oq;

    const-string v1, "BYTE_SEGMENTS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/oq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oq;->c:Lo/oq;

    .line 56
    new-instance v0, Lo/oq;

    const-string v1, "ERROR_CORRECTION_LEVEL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/oq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oq;->e:Lo/oq;

    .line 61
    new-instance v0, Lo/oq;

    const-string v1, "ISSUE_NUMBER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/oq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oq;->b:Lo/oq;

    .line 67
    new-instance v0, Lo/oq;

    const-string v1, "SUGGESTED_PRICE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/oq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oq;->g:Lo/oq;

    .line 73
    new-instance v0, Lo/oq;

    const-string v1, "POSSIBLE_COUNTRY"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lo/oq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oq;->i:Lo/oq;

    .line 78
    new-instance v0, Lo/oq;

    const-string v1, "UPC_EAN_EXTENSION"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lo/oq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oq;->h:Lo/oq;

    .line 83
    new-instance v0, Lo/oq;

    const-string v1, "PDF417_EXTRA_METADATA"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lo/oq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oq;->k:Lo/oq;

    .line 89
    new-instance v0, Lo/oq;

    const-string v1, "STRUCTURED_APPEND_SEQUENCE"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lo/oq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oq;->f:Lo/oq;

    .line 95
    new-instance v0, Lo/oq;

    const-string v1, "STRUCTURED_APPEND_PARITY"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lo/oq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/oq;->m:Lo/oq;

    .line 25
    const/16 v0, 0xb

    new-array v0, v0, [Lo/oq;

    sget-object v1, Lo/oq;->a:Lo/oq;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/oq;->d:Lo/oq;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/oq;->c:Lo/oq;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/oq;->e:Lo/oq;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/oq;->b:Lo/oq;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/oq;->g:Lo/oq;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/oq;->i:Lo/oq;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/oq;->h:Lo/oq;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/oq;->k:Lo/oq;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lo/oq;->f:Lo/oq;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lo/oq;->m:Lo/oq;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sput-object v0, Lo/oq;->l:[Lo/oq;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/oq;
    .locals 1

    .line 25
    const-class v0, Lo/oq;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/oq;

    return-object v0
.end method

.method public static values()[Lo/oq;
    .locals 1

    .line 25
    sget-object v0, Lo/oq;->l:[Lo/oq;

    invoke-virtual {v0}, [Lo/oq;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/oq;

    return-object v0
.end method

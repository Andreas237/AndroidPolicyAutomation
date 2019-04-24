.class public final enum Lo/eif;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/eif;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/eif;

.field public static final enum b:Lo/eif;

.field public static final enum c:Lo/eif;

.field public static final enum d:Lo/eif;

.field public static final enum e:Lo/eif;

.field private static final synthetic h:[Lo/eif;

.field public static final enum k:Lo/eif;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 8
    new-instance v0, Lo/eif;

    const-string v1, "DATE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/eif;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eif;->d:Lo/eif;

    new-instance v0, Lo/eif;

    const-string v1, "DATE_DAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/eif;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eif;->b:Lo/eif;

    .line 9
    new-instance v0, Lo/eif;

    const-string v1, "DATE_WEEK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/eif;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eif;->a:Lo/eif;

    new-instance v0, Lo/eif;

    const-string v1, "DATE_MONTH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/eif;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eif;->c:Lo/eif;

    .line 10
    new-instance v0, Lo/eif;

    const-string v1, "DATE_YEAR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/eif;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eif;->e:Lo/eif;

    new-instance v0, Lo/eif;

    const-string v1, "DATE_ALL"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/eif;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eif;->k:Lo/eif;

    .line 7
    const/4 v0, 0x6

    new-array v0, v0, [Lo/eif;

    sget-object v1, Lo/eif;->d:Lo/eif;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/eif;->b:Lo/eif;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/eif;->a:Lo/eif;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/eif;->c:Lo/eif;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/eif;->e:Lo/eif;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/eif;->k:Lo/eif;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lo/eif;->h:[Lo/eif;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/eif;
    .locals 1

    .line 7
    const-class v0, Lo/eif;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/eif;

    return-object v0
.end method

.method public static values()[Lo/eif;
    .locals 1

    .line 7
    sget-object v0, Lo/eif;->h:[Lo/eif;

    invoke-virtual {v0}, [Lo/eif;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/eif;

    return-object v0
.end method

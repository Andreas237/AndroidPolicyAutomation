.class public final enum Lo/eix;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/eix;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/eix;

.field public static final enum b:Lo/eix;

.field public static final enum c:Lo/eix;

.field public static final enum d:Lo/eix;

.field public static final enum e:Lo/eix;

.field public static final enum f:Lo/eix;

.field private static final synthetic g:[Lo/eix;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 4
    new-instance v0, Lo/eix;

    const-string v1, "UNSET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/eix;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eix;->b:Lo/eix;

    new-instance v0, Lo/eix;

    const-string v1, "DAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/eix;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eix;->c:Lo/eix;

    new-instance v0, Lo/eix;

    const-string v1, "WEEK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/eix;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eix;->a:Lo/eix;

    new-instance v0, Lo/eix;

    const-string v1, "MONTH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/eix;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eix;->d:Lo/eix;

    new-instance v0, Lo/eix;

    const-string v1, "YEAR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/eix;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eix;->e:Lo/eix;

    new-instance v0, Lo/eix;

    const-string v1, "ALL"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/eix;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eix;->f:Lo/eix;

    .line 3
    const/4 v0, 0x6

    new-array v0, v0, [Lo/eix;

    sget-object v1, Lo/eix;->b:Lo/eix;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/eix;->c:Lo/eix;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/eix;->a:Lo/eix;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/eix;->d:Lo/eix;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/eix;->e:Lo/eix;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/eix;->f:Lo/eix;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lo/eix;->g:[Lo/eix;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/eix;
    .locals 1

    .line 3
    const-class v0, Lo/eix;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/eix;

    return-object v0
.end method

.method public static values()[Lo/eix;
    .locals 1

    .line 3
    sget-object v0, Lo/eix;->g:[Lo/eix;

    invoke-virtual {v0}, [Lo/eix;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/eix;

    return-object v0
.end method

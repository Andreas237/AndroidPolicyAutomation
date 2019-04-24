.class public final enum Lo/eiv;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/eiv;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/eiv;

.field public static final enum b:Lo/eiv;

.field public static final enum c:Lo/eiv;

.field public static final enum d:Lo/eiv;

.field public static final enum e:Lo/eiv;

.field private static final synthetic h:[Lo/eiv;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 8
    new-instance v0, Lo/eiv;

    const-string v1, "SUM"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/eiv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eiv;->d:Lo/eiv;

    new-instance v0, Lo/eiv;

    const-string v1, "WALK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/eiv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eiv;->b:Lo/eiv;

    new-instance v0, Lo/eiv;

    const-string v1, "RUN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/eiv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eiv;->a:Lo/eiv;

    new-instance v0, Lo/eiv;

    const-string v1, "BIKE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/eiv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eiv;->c:Lo/eiv;

    new-instance v0, Lo/eiv;

    const-string v1, "CLIMB"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/eiv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eiv;->e:Lo/eiv;

    .line 7
    const/4 v0, 0x5

    new-array v0, v0, [Lo/eiv;

    sget-object v1, Lo/eiv;->d:Lo/eiv;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/eiv;->b:Lo/eiv;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/eiv;->a:Lo/eiv;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/eiv;->c:Lo/eiv;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/eiv;->e:Lo/eiv;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lo/eiv;->h:[Lo/eiv;

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

.method public static valueOf(Ljava/lang/String;)Lo/eiv;
    .locals 1

    .line 7
    const-class v0, Lo/eiv;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/eiv;

    return-object v0
.end method

.method public static values()[Lo/eiv;
    .locals 1

    .line 7
    sget-object v0, Lo/eiv;->h:[Lo/eiv;

    invoke-virtual {v0}, [Lo/eiv;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/eiv;

    return-object v0
.end method

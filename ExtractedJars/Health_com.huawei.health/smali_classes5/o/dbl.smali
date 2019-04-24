.class final enum Lo/dbl;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/dbl;>;"
    }
.end annotation


# static fields
.field public static final enum b:Lo/dbl;

.field public static final enum c:Lo/dbl;

.field private static final synthetic d:[Lo/dbl;

.field public static final enum e:Lo/dbl;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 9
    new-instance v0, Lo/dbl;

    const-string v1, "GRANTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/dbl;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/dbl;->e:Lo/dbl;

    .line 10
    new-instance v0, Lo/dbl;

    const-string v1, "DENIED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/dbl;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/dbl;->b:Lo/dbl;

    .line 11
    new-instance v0, Lo/dbl;

    const-string v1, "NOT_FOUND"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/dbl;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/dbl;->c:Lo/dbl;

    .line 8
    const/4 v0, 0x3

    new-array v0, v0, [Lo/dbl;

    sget-object v1, Lo/dbl;->e:Lo/dbl;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/dbl;->b:Lo/dbl;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/dbl;->c:Lo/dbl;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/dbl;->d:[Lo/dbl;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/dbl;
    .locals 1

    .line 8
    const-class v0, Lo/dbl;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/dbl;

    return-object v0
.end method

.method public static values()[Lo/dbl;
    .locals 1

    .line 8
    sget-object v0, Lo/dbl;->d:[Lo/dbl;

    invoke-virtual {v0}, [Lo/dbl;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/dbl;

    return-object v0
.end method

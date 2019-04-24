.class final enum Lo/ts$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ts;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/ts$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/ts$a;

.field public static final enum b:Lo/ts$a;

.field public static final enum c:Lo/ts$a;

.field public static final enum d:Lo/ts$a;

.field public static final enum e:Lo/ts$a;

.field public static final enum f:Lo/ts$a;

.field private static final synthetic h:[Lo/ts$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 38
    new-instance v0, Lo/ts$a;

    const-string v1, "ALPHA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/ts$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ts$a;->e:Lo/ts$a;

    .line 39
    new-instance v0, Lo/ts$a;

    const-string v1, "LOWER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/ts$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ts$a;->b:Lo/ts$a;

    .line 40
    new-instance v0, Lo/ts$a;

    const-string v1, "MIXED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/ts$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ts$a;->d:Lo/ts$a;

    .line 41
    new-instance v0, Lo/ts$a;

    const-string v1, "PUNCT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/ts$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ts$a;->c:Lo/ts$a;

    .line 42
    new-instance v0, Lo/ts$a;

    const-string v1, "ALPHA_SHIFT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/ts$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ts$a;->a:Lo/ts$a;

    .line 43
    new-instance v0, Lo/ts$a;

    const-string v1, "PUNCT_SHIFT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/ts$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ts$a;->f:Lo/ts$a;

    .line 37
    const/4 v0, 0x6

    new-array v0, v0, [Lo/ts$a;

    sget-object v1, Lo/ts$a;->e:Lo/ts$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ts$a;->b:Lo/ts$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/ts$a;->d:Lo/ts$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/ts$a;->c:Lo/ts$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/ts$a;->a:Lo/ts$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/ts$a;->f:Lo/ts$a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lo/ts$a;->h:[Lo/ts$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 37
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/ts$a;
    .locals 1

    .line 37
    const-class v0, Lo/ts$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/ts$a;

    return-object v0
.end method

.method public static values()[Lo/ts$a;
    .locals 1

    .line 37
    sget-object v0, Lo/ts$a;->h:[Lo/ts$a;

    invoke-virtual {v0}, [Lo/ts$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ts$a;

    return-object v0
.end method

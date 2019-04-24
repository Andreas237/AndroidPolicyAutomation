.class final enum Lo/dbr$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dbr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/dbr$e;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/dbr$e;

.field public static final enum c:Lo/dbr$e;

.field public static final enum d:Lo/dbr$e;

.field private static final synthetic e:[Lo/dbr$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 52
    new-instance v0, Lo/dbr$e;

    const-string v1, "GRANTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/dbr$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/dbr$e;->a:Lo/dbr$e;

    .line 53
    new-instance v0, Lo/dbr$e;

    const-string v1, "DENIED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/dbr$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/dbr$e;->d:Lo/dbr$e;

    .line 54
    new-instance v0, Lo/dbr$e;

    const-string v1, "FOREVER_DENIED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/dbr$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/dbr$e;->c:Lo/dbr$e;

    .line 51
    const/4 v0, 0x3

    new-array v0, v0, [Lo/dbr$e;

    sget-object v1, Lo/dbr$e;->a:Lo/dbr$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/dbr$e;->d:Lo/dbr$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/dbr$e;->c:Lo/dbr$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/dbr$e;->e:[Lo/dbr$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 51
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/dbr$e;
    .locals 1

    .line 51
    const-class v0, Lo/dbr$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/dbr$e;

    return-object v0
.end method

.method public static values()[Lo/dbr$e;
    .locals 1

    .line 51
    sget-object v0, Lo/dbr$e;->e:[Lo/dbr$e;

    invoke-virtual {v0}, [Lo/dbr$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/dbr$e;

    return-object v0
.end method

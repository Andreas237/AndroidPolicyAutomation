.class final enum Lo/ta$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ta;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/ta$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/ta$a;

.field public static final enum b:Lo/ta$a;

.field public static final enum c:Lo/ta$a;

.field private static final synthetic e:[Lo/ta$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 38
    new-instance v0, Lo/ta$a;

    const-string v1, "NUMERIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/ta$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ta$a;->b:Lo/ta$a;

    .line 39
    new-instance v0, Lo/ta$a;

    const-string v1, "ALPHA"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/ta$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ta$a;->a:Lo/ta$a;

    .line 40
    new-instance v0, Lo/ta$a;

    const-string v1, "ISO_IEC_646"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/ta$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ta$a;->c:Lo/ta$a;

    .line 37
    const/4 v0, 0x3

    new-array v0, v0, [Lo/ta$a;

    sget-object v1, Lo/ta$a;->b:Lo/ta$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ta$a;->a:Lo/ta$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/ta$a;->c:Lo/ta$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/ta$a;->e:[Lo/ta$a;

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

.method public static valueOf(Ljava/lang/String;)Lo/ta$a;
    .locals 1

    .line 37
    const-class v0, Lo/ta$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/ta$a;

    return-object v0
.end method

.method public static values()[Lo/ta$a;
    .locals 1

    .line 37
    sget-object v0, Lo/ta$a;->e:[Lo/ta$a;

    invoke-virtual {v0}, [Lo/ta$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ta$a;

    return-object v0
.end method

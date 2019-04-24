.class public final enum Lo/blu;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/blu;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/blu;

.field public static final enum b:Lo/blu;

.field public static final enum c:Lo/blu;

.field public static final enum d:Lo/blu;

.field public static final enum e:Lo/blu;

.field private static final synthetic k:[Lo/blu;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Lo/blu;

    const-string v1, "SLEF"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/blu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/blu;->e:Lo/blu;

    .line 21
    new-instance v0, Lo/blu;

    const-string v1, "FRIEND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/blu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/blu;->d:Lo/blu;

    .line 26
    new-instance v0, Lo/blu;

    const-string v1, "ACCEPT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/blu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/blu;->b:Lo/blu;

    .line 31
    new-instance v0, Lo/blu;

    const-string v1, "JOIN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/blu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/blu;->c:Lo/blu;

    .line 36
    new-instance v0, Lo/blu;

    const-string v1, "INVITE_MEMBER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/blu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/blu;->a:Lo/blu;

    .line 11
    const/4 v0, 0x5

    new-array v0, v0, [Lo/blu;

    sget-object v1, Lo/blu;->e:Lo/blu;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/blu;->d:Lo/blu;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/blu;->b:Lo/blu;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/blu;->c:Lo/blu;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/blu;->a:Lo/blu;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lo/blu;->k:[Lo/blu;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/blu;
    .locals 1

    .line 11
    const-class v0, Lo/blu;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/blu;

    return-object v0
.end method

.method public static values()[Lo/blu;
    .locals 1

    .line 11
    sget-object v0, Lo/blu;->k:[Lo/blu;

    invoke-virtual {v0}, [Lo/blu;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/blu;

    return-object v0
.end method

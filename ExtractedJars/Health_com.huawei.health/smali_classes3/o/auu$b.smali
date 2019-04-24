.class public final enum Lo/auu$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/auu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/auu$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/auu$b;

.field public static final enum b:Lo/auu$b;

.field public static final enum c:Lo/auu$b;

.field public static final enum d:Lo/auu$b;

.field public static final enum e:Lo/auu$b;

.field private static final synthetic f:[Lo/auu$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 39
    new-instance v0, Lo/auu$b;

    const-string v1, "UserNotify"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/auu$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/auu$b;->b:Lo/auu$b;

    .line 41
    new-instance v0, Lo/auu$b;

    const-string v1, "GroupList"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/auu$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/auu$b;->c:Lo/auu$b;

    .line 43
    new-instance v0, Lo/auu$b;

    const-string v1, "GroupDetail"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/auu$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/auu$b;->e:Lo/auu$b;

    .line 45
    new-instance v0, Lo/auu$b;

    const-string v1, "SingleChat"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/auu$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/auu$b;->d:Lo/auu$b;

    .line 47
    new-instance v0, Lo/auu$b;

    const-string v1, "GroupChat"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/auu$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/auu$b;->a:Lo/auu$b;

    .line 36
    const/4 v0, 0x5

    new-array v0, v0, [Lo/auu$b;

    sget-object v1, Lo/auu$b;->b:Lo/auu$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/auu$b;->c:Lo/auu$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/auu$b;->e:Lo/auu$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/auu$b;->d:Lo/auu$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/auu$b;->a:Lo/auu$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lo/auu$b;->f:[Lo/auu$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 36
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/auu$b;
    .locals 1

    .line 36
    const-class v0, Lo/auu$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/auu$b;

    return-object v0
.end method

.method public static values()[Lo/auu$b;
    .locals 1

    .line 36
    sget-object v0, Lo/auu$b;->f:[Lo/auu$b;

    invoke-virtual {v0}, [Lo/auu$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/auu$b;

    return-object v0
.end method

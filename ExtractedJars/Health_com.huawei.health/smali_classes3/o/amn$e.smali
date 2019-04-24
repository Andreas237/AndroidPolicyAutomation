.class public final enum Lo/amn$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/amn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/amn$e;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/amn$e;

.field public static final enum b:Lo/amn$e;

.field public static final enum c:Lo/amn$e;

.field public static final enum d:Lo/amn$e;

.field public static final enum e:Lo/amn$e;

.field private static final synthetic k:[Lo/amn$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 42
    new-instance v0, Lo/amn$e;

    const-string v1, "STATE_IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/amn$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/amn$e;->c:Lo/amn$e;

    .line 43
    new-instance v0, Lo/amn$e;

    const-string v1, "STATE_ENTER_RUNNING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/amn$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/amn$e;->a:Lo/amn$e;

    .line 44
    new-instance v0, Lo/amn$e;

    const-string v1, "STATE_EXIT_RUNNING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/amn$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/amn$e;->b:Lo/amn$e;

    .line 47
    new-instance v0, Lo/amn$e;

    const-string v1, "STATE_ENTER_BICYCLE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/amn$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/amn$e;->d:Lo/amn$e;

    .line 48
    new-instance v0, Lo/amn$e;

    const-string v1, "STATE_EXIT_BICYCLE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/amn$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/amn$e;->e:Lo/amn$e;

    .line 40
    const/4 v0, 0x5

    new-array v0, v0, [Lo/amn$e;

    sget-object v1, Lo/amn$e;->c:Lo/amn$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/amn$e;->a:Lo/amn$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/amn$e;->b:Lo/amn$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/amn$e;->d:Lo/amn$e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/amn$e;->e:Lo/amn$e;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lo/amn$e;->k:[Lo/amn$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 40
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/amn$e;
    .locals 1

    .line 40
    const-class v0, Lo/amn$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/amn$e;

    return-object v0
.end method

.method public static values()[Lo/amn$e;
    .locals 1

    .line 40
    sget-object v0, Lo/amn$e;->k:[Lo/amn$e;

    invoke-virtual {v0}, [Lo/amn$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/amn$e;

    return-object v0
.end method

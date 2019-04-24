.class public final enum Lo/exn$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/exn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/exn$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/exn$a;

.field public static final enum b:Lo/exn$a;

.field public static final enum c:Lo/exn$a;

.field public static final enum d:Lo/exn$a;

.field public static final enum e:Lo/exn$a;

.field private static final synthetic f:[Lo/exn$a;

.field public static final enum g:Lo/exn$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 101
    new-instance v0, Lo/exn$a;

    const-string v1, "FITNESS_UNSPECIFIC_SLEEP_TIME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/exn$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/exn$a;->a:Lo/exn$a;

    .line 102
    new-instance v0, Lo/exn$a;

    const-string v1, "FITNESS_TOTAL_SLEEP_TIME"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/exn$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/exn$a;->b:Lo/exn$a;

    .line 103
    new-instance v0, Lo/exn$a;

    const-string v1, "FITNESS_DEEP_SLEEP_TIME"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/exn$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/exn$a;->d:Lo/exn$a;

    .line 104
    new-instance v0, Lo/exn$a;

    const-string v1, "FITNESS_SHALLOW_SLEEP_TIME"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/exn$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/exn$a;->e:Lo/exn$a;

    .line 105
    new-instance v0, Lo/exn$a;

    const-string v1, "FITNESS_WAKEUP_DURATION"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/exn$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/exn$a;->c:Lo/exn$a;

    .line 106
    new-instance v0, Lo/exn$a;

    const-string v1, "FITNESS_WAKEUP_TIME"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/exn$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/exn$a;->g:Lo/exn$a;

    .line 100
    const/4 v0, 0x6

    new-array v0, v0, [Lo/exn$a;

    sget-object v1, Lo/exn$a;->a:Lo/exn$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/exn$a;->b:Lo/exn$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/exn$a;->d:Lo/exn$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/exn$a;->e:Lo/exn$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/exn$a;->c:Lo/exn$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/exn$a;->g:Lo/exn$a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lo/exn$a;->f:[Lo/exn$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 100
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/exn$a;
    .locals 1

    .line 100
    const-class v0, Lo/exn$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/exn$a;

    return-object v0
.end method

.method public static values()[Lo/exn$a;
    .locals 1

    .line 100
    sget-object v0, Lo/exn$a;->f:[Lo/exn$a;

    invoke-virtual {v0}, [Lo/exn$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/exn$a;

    return-object v0
.end method

.class final enum Lo/cwc$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/cwc$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/cwc$b;

.field public static final enum b:Lo/cwc$b;

.field public static final enum c:Lo/cwc$b;

.field public static final enum d:Lo/cwc$b;

.field public static final enum e:Lo/cwc$b;

.field private static final synthetic i:[Lo/cwc$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 125
    new-instance v0, Lo/cwc$b;

    const-string v1, "STATE_PAUSE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/cwc$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cwc$b;->a:Lo/cwc$b;

    .line 126
    new-instance v0, Lo/cwc$b;

    const-string v1, "STATE_RESUME"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/cwc$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cwc$b;->d:Lo/cwc$b;

    .line 127
    new-instance v0, Lo/cwc$b;

    const-string v1, "STATE_STOP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/cwc$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cwc$b;->e:Lo/cwc$b;

    .line 128
    new-instance v0, Lo/cwc$b;

    const-string v1, "STATE_REPORT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/cwc$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cwc$b;->c:Lo/cwc$b;

    .line 129
    new-instance v0, Lo/cwc$b;

    const-string v1, "STATE_REPORTCURRENTSTEP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/cwc$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cwc$b;->b:Lo/cwc$b;

    .line 124
    const/4 v0, 0x5

    new-array v0, v0, [Lo/cwc$b;

    sget-object v1, Lo/cwc$b;->a:Lo/cwc$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/cwc$b;->d:Lo/cwc$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/cwc$b;->e:Lo/cwc$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/cwc$b;->c:Lo/cwc$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/cwc$b;->b:Lo/cwc$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lo/cwc$b;->i:[Lo/cwc$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 124
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/cwc$b;
    .locals 1

    .line 124
    const-class v0, Lo/cwc$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/cwc$b;

    return-object v0
.end method

.method public static values()[Lo/cwc$b;
    .locals 1

    .line 124
    sget-object v0, Lo/cwc$b;->i:[Lo/cwc$b;

    invoke-virtual {v0}, [Lo/cwc$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/cwc$b;

    return-object v0
.end method

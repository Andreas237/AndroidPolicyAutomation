.class final enum Lo/eji$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/eji$c;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lo/eji$c;

.field public static final enum b:Lo/eji$c;

.field public static final enum d:Lo/eji$c;

.field public static final enum e:Lo/eji$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 69
    new-instance v0, Lo/eji$c;

    const-string v1, "Content"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/eji$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eji$c;->b:Lo/eji$c;

    new-instance v0, Lo/eji$c;

    const-string v1, "MarkView"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/eji$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eji$c;->d:Lo/eji$c;

    new-instance v0, Lo/eji$c;

    const-string v1, "Other"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/eji$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eji$c;->e:Lo/eji$c;

    .line 68
    const/4 v0, 0x3

    new-array v0, v0, [Lo/eji$c;

    sget-object v1, Lo/eji$c;->b:Lo/eji$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/eji$c;->d:Lo/eji$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/eji$c;->e:Lo/eji$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/eji$c;->a:[Lo/eji$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 68
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/eji$c;
    .locals 1

    .line 68
    const-class v0, Lo/eji$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/eji$c;

    return-object v0
.end method

.method public static values()[Lo/eji$c;
    .locals 1

    .line 68
    sget-object v0, Lo/eji$c;->a:[Lo/eji$c;

    invoke-virtual {v0}, [Lo/eji$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/eji$c;

    return-object v0
.end method

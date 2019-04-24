.class final enum Lo/aqj$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aqj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/aqj$c;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lo/aqj$c;

.field public static final enum b:Lo/aqj$c;

.field public static final enum d:Lo/aqj$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 39
    new-instance v0, Lo/aqj$c;

    const-string v1, "NOT_FOLLOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/aqj$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aqj$c;->d:Lo/aqj$c;

    .line 40
    new-instance v0, Lo/aqj$c;

    const-string v1, "NON_FRIEND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/aqj$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aqj$c;->b:Lo/aqj$c;

    .line 37
    const/4 v0, 0x2

    new-array v0, v0, [Lo/aqj$c;

    sget-object v1, Lo/aqj$c;->d:Lo/aqj$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/aqj$c;->b:Lo/aqj$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/aqj$c;->a:[Lo/aqj$c;

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

.method public static valueOf(Ljava/lang/String;)Lo/aqj$c;
    .locals 1

    .line 37
    const-class v0, Lo/aqj$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/aqj$c;

    return-object v0
.end method

.method public static values()[Lo/aqj$c;
    .locals 1

    .line 37
    sget-object v0, Lo/aqj$c;->a:[Lo/aqj$c;

    invoke-virtual {v0}, [Lo/aqj$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/aqj$c;

    return-object v0
.end method

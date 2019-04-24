.class public final enum Lo/cfy$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cfy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/cfy$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/cfy$a;

.field public static final enum b:Lo/cfy$a;

.field private static final synthetic e:[Lo/cfy$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 37
    new-instance v0, Lo/cfy$a;

    const-string v1, "Yes"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/cfy$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cfy$a;->b:Lo/cfy$a;

    new-instance v0, Lo/cfy$a;

    const-string v1, "No"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/cfy$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cfy$a;->a:Lo/cfy$a;

    .line 36
    const/4 v0, 0x2

    new-array v0, v0, [Lo/cfy$a;

    sget-object v1, Lo/cfy$a;->b:Lo/cfy$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/cfy$a;->a:Lo/cfy$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/cfy$a;->e:[Lo/cfy$a;

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

.method public static valueOf(Ljava/lang/String;)Lo/cfy$a;
    .locals 1

    .line 36
    const-class v0, Lo/cfy$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/cfy$a;

    return-object v0
.end method

.method public static values()[Lo/cfy$a;
    .locals 1

    .line 36
    sget-object v0, Lo/cfy$a;->e:[Lo/cfy$a;

    invoke-virtual {v0}, [Lo/cfy$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/cfy$a;

    return-object v0
.end method

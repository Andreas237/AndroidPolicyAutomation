.class public final enum Lo/xx$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/xx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/xx$b;>;"
    }
.end annotation


# static fields
.field public static final enum b:Lo/xx$b;

.field private static final synthetic d:[Lo/xx$b;

.field public static final enum e:Lo/xx$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 83
    new-instance v0, Lo/xx$b;

    const-string v1, "FRIEND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/xx$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/xx$b;->e:Lo/xx$b;

    new-instance v0, Lo/xx$b;

    const-string v1, "SELF"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/xx$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/xx$b;->b:Lo/xx$b;

    .line 82
    const/4 v0, 0x2

    new-array v0, v0, [Lo/xx$b;

    sget-object v1, Lo/xx$b;->e:Lo/xx$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/xx$b;->b:Lo/xx$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/xx$b;->d:[Lo/xx$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 82
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/xx$b;
    .locals 1

    .line 82
    const-class v0, Lo/xx$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/xx$b;

    return-object v0
.end method

.method public static values()[Lo/xx$b;
    .locals 1

    .line 82
    sget-object v0, Lo/xx$b;->d:[Lo/xx$b;

    invoke-virtual {v0}, [Lo/xx$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/xx$b;

    return-object v0
.end method

.class final enum Lo/fku$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fku;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fku$d;>;"
    }
.end annotation


# static fields
.field public static final enum b:Lo/fku$d;

.field public static final enum c:Lo/fku$d;

.field private static final synthetic d:[Lo/fku$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 88
    new-instance v0, Lo/fku$d;

    const-string v1, "RUNNING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fku$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fku$d;->b:Lo/fku$d;

    new-instance v0, Lo/fku$d;

    const-string v1, "SHUTDOWN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/fku$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fku$d;->c:Lo/fku$d;

    .line 87
    const/4 v0, 0x2

    new-array v0, v0, [Lo/fku$d;

    sget-object v1, Lo/fku$d;->b:Lo/fku$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fku$d;->c:Lo/fku$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/fku$d;->d:[Lo/fku$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 87
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fku$d;
    .locals 1

    .line 87
    const-class v0, Lo/fku$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fku$d;

    return-object v0
.end method

.method public static values()[Lo/fku$d;
    .locals 1

    .line 87
    sget-object v0, Lo/fku$d;->d:[Lo/fku$d;

    invoke-virtual {v0}, [Lo/fku$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fku$d;

    return-object v0
.end method

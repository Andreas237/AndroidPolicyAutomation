.class final enum Lo/bvu$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bvu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/bvu$d;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lo/bvu$d;

.field public static final enum b:Lo/bvu$d;

.field public static final enum c:Lo/bvu$d;

.field public static final enum d:Lo/bvu$d;

.field public static final enum e:Lo/bvu$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 77
    new-instance v0, Lo/bvu$d;

    const-string v1, "URI"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/bvu$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bvu$d;->e:Lo/bvu$d;

    new-instance v0, Lo/bvu$d;

    const-string v1, "ASSET"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/bvu$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bvu$d;->d:Lo/bvu$d;

    new-instance v0, Lo/bvu$d;

    const-string v1, "RAW"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/bvu$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bvu$d;->c:Lo/bvu$d;

    new-instance v0, Lo/bvu$d;

    const-string v1, "SD"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/bvu$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bvu$d;->b:Lo/bvu$d;

    .line 76
    const/4 v0, 0x4

    new-array v0, v0, [Lo/bvu$d;

    sget-object v1, Lo/bvu$d;->e:Lo/bvu$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/bvu$d;->d:Lo/bvu$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/bvu$d;->c:Lo/bvu$d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/bvu$d;->b:Lo/bvu$d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/bvu$d;->a:[Lo/bvu$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 76
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/bvu$d;
    .locals 1

    .line 76
    const-class v0, Lo/bvu$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/bvu$d;

    return-object v0
.end method

.method public static values()[Lo/bvu$d;
    .locals 1

    .line 76
    sget-object v0, Lo/bvu$d;->a:[Lo/bvu$d;

    invoke-virtual {v0}, [Lo/bvu$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/bvu$d;

    return-object v0
.end method

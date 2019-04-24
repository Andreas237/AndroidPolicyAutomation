.class final enum Lo/efh$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/efh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/efh$b;>;"
    }
.end annotation


# static fields
.field private static final synthetic c:[Lo/efh$b;

.field public static final enum d:Lo/efh$b;

.field public static final enum e:Lo/efh$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 107
    new-instance v0, Lo/efh$b;

    const-string v1, "ORTHO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/efh$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/efh$b;->e:Lo/efh$b;

    new-instance v0, Lo/efh$b;

    const-string v1, "FRUSTUM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/efh$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/efh$b;->d:Lo/efh$b;

    .line 106
    const/4 v0, 0x2

    new-array v0, v0, [Lo/efh$b;

    sget-object v1, Lo/efh$b;->e:Lo/efh$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/efh$b;->d:Lo/efh$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/efh$b;->c:[Lo/efh$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 106
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/efh$b;
    .locals 1

    .line 106
    const-class v0, Lo/efh$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/efh$b;

    return-object v0
.end method

.method public static values()[Lo/efh$b;
    .locals 1

    .line 106
    sget-object v0, Lo/efh$b;->c:[Lo/efh$b;

    invoke-virtual {v0}, [Lo/efh$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/efh$b;

    return-object v0
.end method

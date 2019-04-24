.class public final enum Lo/enw$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/enw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/enw$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/enw$b;

.field private static final synthetic c:[Lo/enw$b;

.field public static final enum e:Lo/enw$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 76
    new-instance v0, Lo/enw$b;

    const-string v1, "NO_BIND_DEVICE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/enw$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/enw$b;->a:Lo/enw$b;

    new-instance v0, Lo/enw$b;

    const-string v1, "EXIST_TYPE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/enw$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/enw$b;->e:Lo/enw$b;

    .line 75
    const/4 v0, 0x2

    new-array v0, v0, [Lo/enw$b;

    sget-object v1, Lo/enw$b;->a:Lo/enw$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/enw$b;->e:Lo/enw$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/enw$b;->c:[Lo/enw$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 75
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/enw$b;
    .locals 1

    .line 75
    const-class v0, Lo/enw$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/enw$b;

    return-object v0
.end method

.method public static values()[Lo/enw$b;
    .locals 1

    .line 75
    sget-object v0, Lo/enw$b;->c:[Lo/enw$b;

    invoke-virtual {v0}, [Lo/enw$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/enw$b;

    return-object v0
.end method

.class public final enum Lo/eiq$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eiq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/eiq$d;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/eiq$d;

.field public static final enum b:Lo/eiq$d;

.field private static final synthetic e:[Lo/eiq$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 314
    new-instance v0, Lo/eiq$d;

    const-string v1, "YOFFSET_CEIL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/eiq$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eiq$d;->a:Lo/eiq$d;

    new-instance v0, Lo/eiq$d;

    const-string v1, "YOFFSET_FLOOR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/eiq$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eiq$d;->b:Lo/eiq$d;

    .line 313
    const/4 v0, 0x2

    new-array v0, v0, [Lo/eiq$d;

    sget-object v1, Lo/eiq$d;->a:Lo/eiq$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/eiq$d;->b:Lo/eiq$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/eiq$d;->e:[Lo/eiq$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 313
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/eiq$d;
    .locals 1

    .line 313
    const-class v0, Lo/eiq$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/eiq$d;

    return-object v0
.end method

.method public static values()[Lo/eiq$d;
    .locals 1

    .line 313
    sget-object v0, Lo/eiq$d;->e:[Lo/eiq$d;

    invoke-virtual {v0}, [Lo/eiq$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/eiq$d;

    return-object v0
.end method

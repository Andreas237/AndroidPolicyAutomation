.class public final enum Lo/ewf$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ewf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/ewf$d;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lo/ewf$d;

.field public static final enum b:Lo/ewf$d;

.field public static final enum d:Lo/ewf$d;

.field public static final enum e:Lo/ewf$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 595
    new-instance v0, Lo/ewf$d;

    const-string v1, "LINE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/ewf$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ewf$d;->e:Lo/ewf$d;

    new-instance v0, Lo/ewf$d;

    const-string v1, "BAR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/ewf$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ewf$d;->d:Lo/ewf$d;

    new-instance v0, Lo/ewf$d;

    const-string v1, "RANGE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/ewf$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ewf$d;->b:Lo/ewf$d;

    .line 594
    const/4 v0, 0x3

    new-array v0, v0, [Lo/ewf$d;

    sget-object v1, Lo/ewf$d;->e:Lo/ewf$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ewf$d;->d:Lo/ewf$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/ewf$d;->b:Lo/ewf$d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/ewf$d;->a:[Lo/ewf$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 594
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/ewf$d;
    .locals 1

    .line 594
    const-class v0, Lo/ewf$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/ewf$d;

    return-object v0
.end method

.method public static values()[Lo/ewf$d;
    .locals 1

    .line 594
    sget-object v0, Lo/ewf$d;->a:[Lo/ewf$d;

    invoke-virtual {v0}, [Lo/ewf$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ewf$d;

    return-object v0
.end method

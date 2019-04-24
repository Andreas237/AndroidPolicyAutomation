.class public final enum Lo/ehv$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ehv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/ehv$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/ehv$c;

.field public static final enum b:Lo/ehv$c;

.field public static final enum c:Lo/ehv$c;

.field public static final enum d:Lo/ehv$c;

.field public static final enum e:Lo/ehv$c;

.field private static final synthetic f:[Lo/ehv$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 68
    new-instance v0, Lo/ehv$c;

    const-string v1, "BAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/ehv$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ehv$c;->a:Lo/ehv$c;

    new-instance v0, Lo/ehv$c;

    const-string v1, "BUBBLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/ehv$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ehv$c;->e:Lo/ehv$c;

    new-instance v0, Lo/ehv$c;

    const-string v1, "LINE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/ehv$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ehv$c;->c:Lo/ehv$c;

    new-instance v0, Lo/ehv$c;

    const-string v1, "CANDLE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/ehv$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ehv$c;->b:Lo/ehv$c;

    new-instance v0, Lo/ehv$c;

    const-string v1, "SCATTER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/ehv$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ehv$c;->d:Lo/ehv$c;

    .line 67
    const/4 v0, 0x5

    new-array v0, v0, [Lo/ehv$c;

    sget-object v1, Lo/ehv$c;->a:Lo/ehv$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ehv$c;->e:Lo/ehv$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/ehv$c;->c:Lo/ehv$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/ehv$c;->b:Lo/ehv$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/ehv$c;->d:Lo/ehv$c;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lo/ehv$c;->f:[Lo/ehv$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 67
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/ehv$c;
    .locals 1

    .line 67
    const-class v0, Lo/ehv$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/ehv$c;

    return-object v0
.end method

.method public static values()[Lo/ehv$c;
    .locals 1

    .line 67
    sget-object v0, Lo/ehv$c;->f:[Lo/ehv$c;

    invoke-virtual {v0}, [Lo/ehv$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ehv$c;

    return-object v0
.end method

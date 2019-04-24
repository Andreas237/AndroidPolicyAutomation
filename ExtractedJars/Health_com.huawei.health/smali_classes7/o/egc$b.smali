.class public final enum Lo/egc$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/egc$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/egc$b;

.field public static final enum b:Lo/egc$b;

.field public static final enum c:Lo/egc$b;

.field public static final enum d:Lo/egc$b;

.field public static final enum e:Lo/egc$b;

.field private static final synthetic g:[Lo/egc$b;

.field public static final enum h:Lo/egc$b;

.field public static final enum i:Lo/egc$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 14
    new-instance v0, Lo/egc$b;

    const-string v1, "SOLID_FLOWER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/egc$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/egc$b;->a:Lo/egc$b;

    .line 15
    new-instance v0, Lo/egc$b;

    const-string v1, "SOLID_PENTAGON"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/egc$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/egc$b;->e:Lo/egc$b;

    .line 16
    new-instance v0, Lo/egc$b;

    const-string v1, "SOLID_CIRCLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/egc$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/egc$b;->b:Lo/egc$b;

    .line 17
    new-instance v0, Lo/egc$b;

    const-string v1, "HOLLOW_HEXAGON"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/egc$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/egc$b;->d:Lo/egc$b;

    .line 18
    new-instance v0, Lo/egc$b;

    const-string v1, "HOLLOW_TRIANGLE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/egc$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/egc$b;->c:Lo/egc$b;

    .line 19
    new-instance v0, Lo/egc$b;

    const-string v1, "HOLLOW_CIRCLE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/egc$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/egc$b;->i:Lo/egc$b;

    .line 20
    new-instance v0, Lo/egc$b;

    const-string v1, "HOLLOW_TETRAGONUM"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lo/egc$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/egc$b;->h:Lo/egc$b;

    .line 13
    const/4 v0, 0x7

    new-array v0, v0, [Lo/egc$b;

    sget-object v1, Lo/egc$b;->a:Lo/egc$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/egc$b;->e:Lo/egc$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/egc$b;->b:Lo/egc$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/egc$b;->d:Lo/egc$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/egc$b;->c:Lo/egc$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/egc$b;->i:Lo/egc$b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/egc$b;->h:Lo/egc$b;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lo/egc$b;->g:[Lo/egc$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/egc$b;
    .locals 1

    .line 13
    const-class v0, Lo/egc$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/egc$b;

    return-object v0
.end method

.method public static values()[Lo/egc$b;
    .locals 1

    .line 13
    sget-object v0, Lo/egc$b;->g:[Lo/egc$b;

    invoke-virtual {v0}, [Lo/egc$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/egc$b;

    return-object v0
.end method

.class public final enum Lo/ekv$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ekv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/ekv$a;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lo/ekv$a;

.field public static final enum b:Lo/ekv$a;

.field public static final enum c:Lo/ekv$a;

.field public static final enum d:Lo/ekv$a;

.field public static final enum e:Lo/ekv$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 407
    new-instance v0, Lo/ekv$a;

    const-string v1, "LINEAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/ekv$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekv$a;->c:Lo/ekv$a;

    .line 408
    new-instance v0, Lo/ekv$a;

    const-string v1, "STEPPED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/ekv$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekv$a;->d:Lo/ekv$a;

    .line 409
    new-instance v0, Lo/ekv$a;

    const-string v1, "CUBIC_BEZIER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/ekv$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekv$a;->e:Lo/ekv$a;

    .line 410
    new-instance v0, Lo/ekv$a;

    const-string v1, "HORIZONTAL_BEZIER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/ekv$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekv$a;->b:Lo/ekv$a;

    .line 406
    const/4 v0, 0x4

    new-array v0, v0, [Lo/ekv$a;

    sget-object v1, Lo/ekv$a;->c:Lo/ekv$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ekv$a;->d:Lo/ekv$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/ekv$a;->e:Lo/ekv$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/ekv$a;->b:Lo/ekv$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/ekv$a;->a:[Lo/ekv$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 406
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/ekv$a;
    .locals 1

    .line 406
    const-class v0, Lo/ekv$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/ekv$a;

    return-object v0
.end method

.method public static values()[Lo/ekv$a;
    .locals 1

    .line 406
    sget-object v0, Lo/ekv$a;->a:[Lo/ekv$a;

    invoke-virtual {v0}, [Lo/ekv$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ekv$a;

    return-object v0
.end method

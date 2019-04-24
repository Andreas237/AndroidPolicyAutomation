.class public final enum Lo/egl$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/egl$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/egl$c;

.field public static final enum b:Lo/egl$c;

.field public static final enum c:Lo/egl$c;

.field public static final enum d:Lo/egl$c;

.field public static final enum e:Lo/egl$c;

.field private static final synthetic h:[Lo/egl$c;

.field public static final enum k:Lo/egl$c;


# instance fields
.field f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 391
    new-instance v0, Lo/egl$c;

    const-string v1, "CHART_ALL"

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lo/egl$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/egl$c;->c:Lo/egl$c;

    new-instance v0, Lo/egl$c;

    const-string v1, "CHART_YEAR"

    const/4 v2, 0x1

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lo/egl$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/egl$c;->e:Lo/egl$c;

    new-instance v0, Lo/egl$c;

    const-string v1, "CHART_MONTH"

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lo/egl$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/egl$c;->b:Lo/egl$c;

    new-instance v0, Lo/egl$c;

    const-string v1, "CHART_WEEK"

    const/4 v2, 0x3

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/egl$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/egl$c;->d:Lo/egl$c;

    new-instance v0, Lo/egl$c;

    const-string v1, "CHART_DAY"

    const/4 v2, 0x4

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/egl$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/egl$c;->a:Lo/egl$c;

    new-instance v0, Lo/egl$c;

    const-string v1, "CHART_UNKNOWN"

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/egl$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/egl$c;->k:Lo/egl$c;

    .line 390
    const/4 v0, 0x6

    new-array v0, v0, [Lo/egl$c;

    sget-object v1, Lo/egl$c;->c:Lo/egl$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/egl$c;->e:Lo/egl$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/egl$c;->b:Lo/egl$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/egl$c;->d:Lo/egl$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/egl$c;->a:Lo/egl$c;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/egl$c;->k:Lo/egl$c;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lo/egl$c;->h:[Lo/egl$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 395
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 396
    iput p3, p0, Lo/egl$c;->f:I

    .line 397
    return-void
.end method

.method public static c(Lo/eic;)Lo/egl$c;
    .locals 2

    .line 419
    invoke-virtual {p0}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 420
    sget-object v0, Lo/egl$c;->a:Lo/egl$c;

    return-object v0

    .line 421
    :cond_0
    invoke-virtual {p0}, Lo/eic;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 422
    sget-object v0, Lo/egl$c;->d:Lo/egl$c;

    return-object v0

    .line 423
    :cond_1
    invoke-virtual {p0}, Lo/eic;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 424
    sget-object v0, Lo/egl$c;->b:Lo/egl$c;

    return-object v0

    .line 425
    :cond_2
    invoke-virtual {p0}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 426
    sget-object v0, Lo/egl$c;->e:Lo/egl$c;

    return-object v0

    .line 427
    :cond_3
    invoke-virtual {p0}, Lo/eic;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 428
    sget-object v0, Lo/egl$c;->c:Lo/egl$c;

    return-object v0

    .line 430
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "query UserLevelView unknown Exception"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/egl$c;
    .locals 1

    .line 390
    const-class v0, Lo/egl$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/egl$c;

    return-object v0
.end method

.method public static values()[Lo/egl$c;
    .locals 1

    .line 390
    sget-object v0, Lo/egl$c;->h:[Lo/egl$c;

    invoke-virtual {v0}, [Lo/egl$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/egl$c;

    return-object v0
.end method

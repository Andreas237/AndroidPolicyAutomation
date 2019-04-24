.class public final enum Lo/dxp;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/dxp;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/dxp;

.field public static final enum b:Lo/dxp;

.field public static final enum c:Lo/dxp;

.field public static final enum d:Lo/dxp;

.field public static final enum e:Lo/dxp;

.field public static final enum f:Lo/dxp;

.field public static final enum h:Lo/dxp;

.field public static final enum i:Lo/dxp;

.field public static final enum k:Lo/dxp;

.field private static final synthetic l:[Lo/dxp;


# instance fields
.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 12
    new-instance v0, Lo/dxp;

    const-string v1, "REPORT_INITAL"

    const-string v2, "reportInital"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lo/dxp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/dxp;->c:Lo/dxp;

    .line 14
    new-instance v0, Lo/dxp;

    const-string v1, "REPORT_CYCLE"

    const-string v2, "reportCycle"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lo/dxp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/dxp;->e:Lo/dxp;

    .line 16
    new-instance v0, Lo/dxp;

    const-string v1, "REPORT_RUN"

    const-string v2, "reportRun"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Lo/dxp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/dxp;->d:Lo/dxp;

    .line 18
    new-instance v0, Lo/dxp;

    const-string v1, "REPORT_STEP"

    const-string v2, "reportStep"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v2}, Lo/dxp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/dxp;->b:Lo/dxp;

    .line 20
    new-instance v0, Lo/dxp;

    const-string v1, "REPORT_SLEEP"

    const-string v2, "reportSleep"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, Lo/dxp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/dxp;->a:Lo/dxp;

    .line 22
    new-instance v0, Lo/dxp;

    const-string v1, "REPORT_FITNESS"

    const-string v2, "reportFitness"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3, v2}, Lo/dxp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/dxp;->h:Lo/dxp;

    .line 24
    new-instance v0, Lo/dxp;

    const-string v1, "REPORT_WEIGHT"

    const-string v2, "reportWeight"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v3, v2}, Lo/dxp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/dxp;->f:Lo/dxp;

    .line 26
    new-instance v0, Lo/dxp;

    const-string v1, "REPORT_REWARD"

    const-string v2, "reportReward"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v3, v2}, Lo/dxp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/dxp;->i:Lo/dxp;

    .line 28
    new-instance v0, Lo/dxp;

    const-string v1, "REPORT_SUMARY"

    const-string v2, "reportSumary"

    const/16 v3, 0x8

    invoke-direct {v0, v1, v3, v2}, Lo/dxp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/dxp;->k:Lo/dxp;

    .line 7
    const/16 v0, 0x9

    new-array v0, v0, [Lo/dxp;

    sget-object v1, Lo/dxp;->c:Lo/dxp;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/dxp;->e:Lo/dxp;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/dxp;->d:Lo/dxp;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/dxp;->b:Lo/dxp;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/dxp;->a:Lo/dxp;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/dxp;->h:Lo/dxp;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/dxp;->f:Lo/dxp;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/dxp;->i:Lo/dxp;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/dxp;->k:Lo/dxp;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sput-object v0, Lo/dxp;->l:[Lo/dxp;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 33
    iput-object p3, p0, Lo/dxp;->g:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/dxp;
    .locals 1

    .line 7
    const-class v0, Lo/dxp;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/dxp;

    return-object v0
.end method

.method public static values()[Lo/dxp;
    .locals 1

    .line 7
    sget-object v0, Lo/dxp;->l:[Lo/dxp;

    invoke-virtual {v0}, [Lo/dxp;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/dxp;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/dxp;->g:Ljava/lang/String;

    return-object v0
.end method

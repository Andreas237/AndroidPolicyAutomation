.class public final enum Lo/eic;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/eic;>;"
    }
.end annotation


# static fields
.field public static final enum A:Lo/eic;

.field public static final enum B:Lo/eic;

.field public static final enum C:Lo/eic;

.field public static final enum D:Lo/eic;

.field public static final enum E:Lo/eic;

.field public static final enum F:Lo/eic;

.field public static final enum G:Lo/eic;

.field public static final enum H:Lo/eic;

.field public static final enum I:Lo/eic;

.field public static final enum J:Lo/eic;

.field public static final enum K:Lo/eic;

.field public static final enum L:Lo/eic;

.field public static final enum M:Lo/eic;

.field public static final enum N:Lo/eic;

.field public static final enum O:Lo/eic;

.field public static final enum P:Lo/eic;

.field public static final enum Q:Lo/eic;

.field public static final enum R:Lo/eic;

.field public static final enum S:Lo/eic;

.field public static final enum T:Lo/eic;

.field public static final enum U:Lo/eic;

.field public static final enum V:Lo/eic;

.field public static final enum W:Lo/eic;

.field public static final enum X:Lo/eic;

.field private static final synthetic Y:[Lo/eic;

.field public static final enum a:Lo/eic;

.field public static final enum ac:Lo/eic;

.field public static final enum b:Lo/eic;

.field public static final enum c:Lo/eic;

.field public static final enum d:Lo/eic;

.field public static final enum e:Lo/eic;

.field public static final enum f:Lo/eic;

.field public static final enum g:Lo/eic;

.field public static final enum h:Lo/eic;

.field public static final enum i:Lo/eic;

.field public static final enum j:Lo/eic;

.field public static final enum k:Lo/eic;

.field public static final enum l:Lo/eic;

.field public static final enum m:Lo/eic;

.field public static final enum n:Lo/eic;

.field public static final enum o:Lo/eic;

.field public static final enum p:Lo/eic;

.field public static final enum q:Lo/eic;

.field public static final enum r:Lo/eic;

.field public static final enum s:Lo/eic;

.field public static final enum t:Lo/eic;

.field public static final enum u:Lo/eic;

.field public static final enum v:Lo/eic;

.field public static final enum w:Lo/eic;

.field public static final enum x:Lo/eic;

.field public static final enum y:Lo/eic;

.field public static final enum z:Lo/eic;


# instance fields
.field private Z:Lo/eif;

.field private aa:Lo/ehy;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 12
    new-instance v0, Lo/eic;

    const-string v1, "NoDataPlaceHolder"

    sget-object v2, Lo/ehy;->e:Lo/ehy;

    sget-object v3, Lo/eif;->d:Lo/eif;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->a:Lo/eic;

    .line 14
    new-instance v0, Lo/eic;

    const-string v1, "StepDayDetail"

    sget-object v2, Lo/ehy;->b:Lo/ehy;

    sget-object v3, Lo/eif;->b:Lo/eif;

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->d:Lo/eic;

    .line 15
    new-instance v0, Lo/eic;

    const-string v1, "StepWeekDetail"

    sget-object v2, Lo/ehy;->b:Lo/ehy;

    sget-object v3, Lo/eif;->a:Lo/eif;

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->e:Lo/eic;

    .line 16
    new-instance v0, Lo/eic;

    const-string v1, "StepMonthDetail"

    sget-object v2, Lo/ehy;->b:Lo/ehy;

    sget-object v3, Lo/eif;->c:Lo/eif;

    const/4 v4, 0x3

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->b:Lo/eic;

    .line 17
    new-instance v0, Lo/eic;

    const-string v1, "StepYearDetail"

    sget-object v2, Lo/ehy;->b:Lo/ehy;

    sget-object v3, Lo/eif;->e:Lo/eif;

    const/4 v4, 0x4

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->c:Lo/eic;

    .line 19
    new-instance v0, Lo/eic;

    const-string v1, "CaloriesDayDetail"

    sget-object v2, Lo/ehy;->c:Lo/ehy;

    sget-object v3, Lo/eif;->b:Lo/eif;

    const/4 v4, 0x5

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->g:Lo/eic;

    .line 20
    new-instance v0, Lo/eic;

    const-string v1, "CaloriesWeekDetail"

    sget-object v2, Lo/ehy;->c:Lo/ehy;

    sget-object v3, Lo/eif;->a:Lo/eif;

    const/4 v4, 0x6

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->f:Lo/eic;

    .line 21
    new-instance v0, Lo/eic;

    const-string v1, "CaloriesMonthDetail"

    sget-object v2, Lo/ehy;->c:Lo/ehy;

    sget-object v3, Lo/eif;->c:Lo/eif;

    const/4 v4, 0x7

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->h:Lo/eic;

    .line 22
    new-instance v0, Lo/eic;

    const-string v1, "CaloriesYearDetail"

    sget-object v2, Lo/ehy;->c:Lo/ehy;

    sget-object v3, Lo/eif;->e:Lo/eif;

    const/16 v4, 0x8

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->k:Lo/eic;

    .line 24
    new-instance v0, Lo/eic;

    const-string v1, "DistanceDayDetail"

    sget-object v2, Lo/ehy;->a:Lo/ehy;

    sget-object v3, Lo/eif;->b:Lo/eif;

    const/16 v4, 0x9

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->i:Lo/eic;

    .line 25
    new-instance v0, Lo/eic;

    const-string v1, "DistanceWeekDetail"

    sget-object v2, Lo/ehy;->a:Lo/ehy;

    sget-object v3, Lo/eif;->a:Lo/eif;

    const/16 v4, 0xa

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->o:Lo/eic;

    .line 26
    new-instance v0, Lo/eic;

    const-string v1, "DistanceMonthDetail"

    sget-object v2, Lo/ehy;->a:Lo/ehy;

    sget-object v3, Lo/eif;->c:Lo/eif;

    const/16 v4, 0xb

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->l:Lo/eic;

    .line 27
    new-instance v0, Lo/eic;

    const-string v1, "DistanceYearDetail"

    sget-object v2, Lo/ehy;->a:Lo/ehy;

    sget-object v3, Lo/eif;->e:Lo/eif;

    const/16 v4, 0xc

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->m:Lo/eic;

    .line 29
    new-instance v0, Lo/eic;

    const-string v1, "ClimbDayDetail"

    sget-object v2, Lo/ehy;->d:Lo/ehy;

    sget-object v3, Lo/eif;->b:Lo/eif;

    const/16 v4, 0xd

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->p:Lo/eic;

    .line 30
    new-instance v0, Lo/eic;

    const-string v1, "ClimbWeekDetail"

    sget-object v2, Lo/ehy;->d:Lo/ehy;

    sget-object v3, Lo/eif;->a:Lo/eif;

    const/16 v4, 0xe

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->n:Lo/eic;

    .line 31
    new-instance v0, Lo/eic;

    const-string v1, "ClimbMonthDetail"

    sget-object v2, Lo/ehy;->d:Lo/ehy;

    sget-object v3, Lo/eif;->c:Lo/eif;

    const/16 v4, 0xf

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->s:Lo/eic;

    .line 32
    new-instance v0, Lo/eic;

    const-string v1, "ClimbYearDetail"

    sget-object v2, Lo/ehy;->d:Lo/ehy;

    sget-object v3, Lo/eif;->e:Lo/eif;

    const/16 v4, 0x10

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->u:Lo/eic;

    .line 34
    new-instance v0, Lo/eic;

    const-string v1, "SportRunWeekDetail"

    sget-object v2, Lo/ehy;->k:Lo/ehy;

    sget-object v3, Lo/eif;->a:Lo/eif;

    const/16 v4, 0x11

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->q:Lo/eic;

    .line 35
    new-instance v0, Lo/eic;

    const-string v1, "SportRunMonthDetail"

    sget-object v2, Lo/ehy;->k:Lo/ehy;

    sget-object v3, Lo/eif;->c:Lo/eif;

    const/16 v4, 0x12

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->r:Lo/eic;

    .line 36
    new-instance v0, Lo/eic;

    const-string v1, "SportRunYearDetail"

    sget-object v2, Lo/ehy;->k:Lo/ehy;

    sget-object v3, Lo/eif;->e:Lo/eif;

    const/16 v4, 0x13

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->t:Lo/eic;

    .line 37
    new-instance v0, Lo/eic;

    const-string v1, "SportRunSumDetail"

    sget-object v2, Lo/ehy;->k:Lo/ehy;

    sget-object v3, Lo/eif;->k:Lo/eif;

    const/16 v4, 0x14

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->z:Lo/eic;

    .line 39
    new-instance v0, Lo/eic;

    const-string v1, "SportWalkWeekDetail"

    sget-object v2, Lo/ehy;->f:Lo/ehy;

    sget-object v3, Lo/eif;->a:Lo/eif;

    const/16 v4, 0x15

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->x:Lo/eic;

    .line 40
    new-instance v0, Lo/eic;

    const-string v1, "SportWalkMonthDetail"

    sget-object v2, Lo/ehy;->f:Lo/ehy;

    sget-object v3, Lo/eif;->c:Lo/eif;

    const/16 v4, 0x16

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->y:Lo/eic;

    .line 41
    new-instance v0, Lo/eic;

    const-string v1, "SportWalkYearDetail"

    sget-object v2, Lo/ehy;->f:Lo/ehy;

    sget-object v3, Lo/eif;->e:Lo/eif;

    const/16 v4, 0x17

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->v:Lo/eic;

    .line 42
    new-instance v0, Lo/eic;

    const-string v1, "SportWalkSumDetail"

    sget-object v2, Lo/ehy;->f:Lo/ehy;

    sget-object v3, Lo/eif;->k:Lo/eif;

    const/16 v4, 0x18

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->w:Lo/eic;

    .line 44
    new-instance v0, Lo/eic;

    const-string v1, "SportBikeWeekDetail"

    sget-object v2, Lo/ehy;->i:Lo/ehy;

    sget-object v3, Lo/eif;->a:Lo/eif;

    const/16 v4, 0x19

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->B:Lo/eic;

    .line 45
    new-instance v0, Lo/eic;

    const-string v1, "SportBikeMonthDetail"

    sget-object v2, Lo/ehy;->i:Lo/ehy;

    sget-object v3, Lo/eif;->c:Lo/eif;

    const/16 v4, 0x1a

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->j:Lo/eic;

    .line 46
    new-instance v0, Lo/eic;

    const-string v1, "SportBikeYearDetail"

    sget-object v2, Lo/ehy;->i:Lo/ehy;

    sget-object v3, Lo/eif;->e:Lo/eif;

    const/16 v4, 0x1b

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->A:Lo/eic;

    .line 47
    new-instance v0, Lo/eic;

    const-string v1, "SportBikeSumDetail"

    sget-object v2, Lo/ehy;->i:Lo/ehy;

    sget-object v3, Lo/eif;->k:Lo/eif;

    const/16 v4, 0x1c

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->D:Lo/eic;

    .line 49
    new-instance v0, Lo/eic;

    const-string v1, "TimeStrengthDayDetail"

    sget-object v2, Lo/ehy;->g:Lo/ehy;

    sget-object v3, Lo/eif;->b:Lo/eif;

    const/16 v4, 0x1d

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->C:Lo/eic;

    .line 50
    new-instance v0, Lo/eic;

    const-string v1, "TimeStrengthWeekDetail"

    sget-object v2, Lo/ehy;->g:Lo/ehy;

    sget-object v3, Lo/eif;->a:Lo/eif;

    const/16 v4, 0x1e

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->E:Lo/eic;

    .line 51
    new-instance v0, Lo/eic;

    const-string v1, "TimeStrengthMonthDetail"

    sget-object v2, Lo/ehy;->g:Lo/ehy;

    sget-object v3, Lo/eif;->c:Lo/eif;

    const/16 v4, 0x1f

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->I:Lo/eic;

    .line 52
    new-instance v0, Lo/eic;

    const-string v1, "TimeStrengthYearDetail"

    sget-object v2, Lo/ehy;->g:Lo/ehy;

    sget-object v3, Lo/eif;->e:Lo/eif;

    const/16 v4, 0x20

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->H:Lo/eic;

    .line 54
    new-instance v0, Lo/eic;

    const-string v1, "SportFitnessWeekDetail"

    sget-object v2, Lo/ehy;->p:Lo/ehy;

    sget-object v3, Lo/eif;->a:Lo/eif;

    const/16 v4, 0x21

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->G:Lo/eic;

    .line 55
    new-instance v0, Lo/eic;

    const-string v1, "SportFitnessMonthDetail"

    sget-object v2, Lo/ehy;->p:Lo/ehy;

    sget-object v3, Lo/eif;->c:Lo/eif;

    const/16 v4, 0x22

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->F:Lo/eic;

    .line 56
    new-instance v0, Lo/eic;

    const-string v1, "SportFitnessYearDetail"

    sget-object v2, Lo/ehy;->p:Lo/ehy;

    sget-object v3, Lo/eif;->e:Lo/eif;

    const/16 v4, 0x23

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->N:Lo/eic;

    .line 57
    new-instance v0, Lo/eic;

    const-string v1, "SportFitnessSumDetail"

    sget-object v2, Lo/ehy;->p:Lo/ehy;

    sget-object v3, Lo/eif;->k:Lo/eif;

    const/16 v4, 0x24

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->K:Lo/eic;

    .line 59
    new-instance v0, Lo/eic;

    const-string v1, "CoreSleepWeekDetail"

    sget-object v2, Lo/ehy;->o:Lo/ehy;

    sget-object v3, Lo/eif;->a:Lo/eif;

    const/16 v4, 0x25

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->M:Lo/eic;

    .line 60
    new-instance v0, Lo/eic;

    const-string v1, "CoreSleepMonthDetail"

    sget-object v2, Lo/ehy;->o:Lo/ehy;

    sget-object v3, Lo/eif;->c:Lo/eif;

    const/16 v4, 0x26

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->J:Lo/eic;

    .line 61
    new-instance v0, Lo/eic;

    const-string v1, "CoreSleepYearDetail"

    sget-object v2, Lo/ehy;->o:Lo/ehy;

    sget-object v3, Lo/eif;->e:Lo/eif;

    const/16 v4, 0x27

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->L:Lo/eic;

    .line 64
    new-instance v0, Lo/eic;

    const-string v1, "PressureDayDetail"

    sget-object v2, Lo/ehy;->l:Lo/ehy;

    sget-object v3, Lo/eif;->b:Lo/eif;

    const/16 v4, 0x28

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->O:Lo/eic;

    .line 65
    new-instance v0, Lo/eic;

    const-string v1, "PressureWeekDetail"

    sget-object v2, Lo/ehy;->l:Lo/ehy;

    sget-object v3, Lo/eif;->a:Lo/eif;

    const/16 v4, 0x29

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->P:Lo/eic;

    .line 66
    new-instance v0, Lo/eic;

    const-string v1, "PressureMonthDetail"

    sget-object v2, Lo/ehy;->l:Lo/ehy;

    sget-object v3, Lo/eif;->c:Lo/eif;

    const/16 v4, 0x2a

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->Q:Lo/eic;

    .line 67
    new-instance v0, Lo/eic;

    const-string v1, "PressureYearDetail"

    sget-object v2, Lo/ehy;->l:Lo/ehy;

    sget-object v3, Lo/eif;->e:Lo/eif;

    const/16 v4, 0x2b

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->R:Lo/eic;

    .line 69
    new-instance v0, Lo/eic;

    const-string v1, "WeightWeekDetail"

    sget-object v2, Lo/ehy;->n:Lo/ehy;

    sget-object v3, Lo/eif;->a:Lo/eif;

    const/16 v4, 0x2c

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->S:Lo/eic;

    .line 70
    new-instance v0, Lo/eic;

    const-string v1, "WeightMonthDetail"

    sget-object v2, Lo/ehy;->n:Lo/ehy;

    sget-object v3, Lo/eif;->c:Lo/eif;

    const/16 v4, 0x2d

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->T:Lo/eic;

    .line 71
    new-instance v0, Lo/eic;

    const-string v1, "WeightYearDetail"

    sget-object v2, Lo/ehy;->n:Lo/ehy;

    sget-object v3, Lo/eif;->e:Lo/eif;

    const/16 v4, 0x2e

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->W:Lo/eic;

    .line 73
    new-instance v0, Lo/eic;

    const-string v1, "HeartRateDayDetail"

    sget-object v2, Lo/ehy;->h:Lo/ehy;

    sget-object v3, Lo/eif;->b:Lo/eif;

    const/16 v4, 0x2f

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->U:Lo/eic;

    .line 74
    new-instance v0, Lo/eic;

    const-string v1, "HeartRateWeekDetail"

    sget-object v2, Lo/ehy;->h:Lo/ehy;

    sget-object v3, Lo/eif;->a:Lo/eif;

    const/16 v4, 0x30

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->V:Lo/eic;

    .line 75
    new-instance v0, Lo/eic;

    const-string v1, "HeartRateMonthDetail"

    sget-object v2, Lo/ehy;->h:Lo/ehy;

    sget-object v3, Lo/eif;->c:Lo/eif;

    const/16 v4, 0x31

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->X:Lo/eic;

    .line 76
    new-instance v0, Lo/eic;

    const-string v1, "HeartRateYearDetail"

    sget-object v2, Lo/ehy;->h:Lo/ehy;

    sget-object v3, Lo/eif;->e:Lo/eif;

    const/16 v4, 0x32

    invoke-direct {v0, v1, v4, v2, v3}, Lo/eic;-><init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V

    sput-object v0, Lo/eic;->ac:Lo/eic;

    .line 10
    const/16 v0, 0x33

    new-array v0, v0, [Lo/eic;

    sget-object v1, Lo/eic;->a:Lo/eic;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->d:Lo/eic;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->e:Lo/eic;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->b:Lo/eic;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->c:Lo/eic;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->g:Lo/eic;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->f:Lo/eic;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->h:Lo/eic;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->k:Lo/eic;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->i:Lo/eic;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->o:Lo/eic;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->l:Lo/eic;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->m:Lo/eic;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->p:Lo/eic;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->n:Lo/eic;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->s:Lo/eic;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->u:Lo/eic;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->q:Lo/eic;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->r:Lo/eic;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->t:Lo/eic;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->z:Lo/eic;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->x:Lo/eic;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->y:Lo/eic;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->v:Lo/eic;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->w:Lo/eic;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->B:Lo/eic;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->j:Lo/eic;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->A:Lo/eic;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->D:Lo/eic;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->C:Lo/eic;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->E:Lo/eic;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->I:Lo/eic;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->H:Lo/eic;

    const/16 v2, 0x20

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->G:Lo/eic;

    const/16 v2, 0x21

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->F:Lo/eic;

    const/16 v2, 0x22

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->N:Lo/eic;

    const/16 v2, 0x23

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->K:Lo/eic;

    const/16 v2, 0x24

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->M:Lo/eic;

    const/16 v2, 0x25

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->J:Lo/eic;

    const/16 v2, 0x26

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->L:Lo/eic;

    const/16 v2, 0x27

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->O:Lo/eic;

    const/16 v2, 0x28

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->P:Lo/eic;

    const/16 v2, 0x29

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->Q:Lo/eic;

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->R:Lo/eic;

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->S:Lo/eic;

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->T:Lo/eic;

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->W:Lo/eic;

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->U:Lo/eic;

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->V:Lo/eic;

    const/16 v2, 0x30

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->X:Lo/eic;

    const/16 v2, 0x31

    aput-object v1, v0, v2

    sget-object v1, Lo/eic;->ac:Lo/eic;

    const/16 v2, 0x32

    aput-object v1, v0, v2

    sput-object v0, Lo/eic;->Y:[Lo/eic;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILo/ehy;Lo/eif;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ehy;Lo/eif;)V"
        }
    .end annotation

    .line 90
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 91
    iput-object p3, p0, Lo/eic;->aa:Lo/ehy;

    .line 92
    iput-object p4, p0, Lo/eic;->Z:Lo/eif;

    .line 93
    return-void
.end method

.method public static d(Lo/ehy;Lo/eif;)Lo/eic;
    .locals 5

    .line 82
    invoke-static {}, Lo/eic;->values()[Lo/eic;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 83
    iget-object v0, v4, Lo/eic;->aa:Lo/ehy;

    if-ne v0, p0, :cond_0

    iget-object v0, v4, Lo/eic;->Z:Lo/eif;

    if-ne v0, p1, :cond_0

    .line 84
    return-object v4

    .line 82
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 87
    :cond_1
    sget-object v0, Lo/eic;->a:Lo/eic;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/eic;
    .locals 1

    .line 10
    const-class v0, Lo/eic;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/eic;

    return-object v0
.end method

.method public static values()[Lo/eic;
    .locals 1

    .line 10
    sget-object v0, Lo/eic;->Y:[Lo/eic;

    invoke-virtual {v0}, [Lo/eic;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/eic;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 126
    iget-object v0, p0, Lo/eic;->Z:Lo/eif;

    sget-object v1, Lo/eif;->k:Lo/eif;

    if-ne v0, v1, :cond_0

    .line 127
    const/4 v0, 0x1

    return v0

    .line 129
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 2

    .line 118
    iget-object v0, p0, Lo/eic;->Z:Lo/eif;

    sget-object v1, Lo/eif;->e:Lo/eif;

    if-ne v0, v1, :cond_0

    .line 119
    const/4 v0, 0x1

    return v0

    .line 121
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 2

    .line 111
    iget-object v0, p0, Lo/eic;->Z:Lo/eif;

    sget-object v1, Lo/eif;->c:Lo/eif;

    if-ne v0, v1, :cond_0

    .line 112
    const/4 v0, 0x1

    return v0

    .line 114
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()Z
    .locals 2

    .line 97
    iget-object v0, p0, Lo/eic;->Z:Lo/eif;

    sget-object v1, Lo/eif;->b:Lo/eif;

    if-ne v0, v1, :cond_0

    .line 98
    const/4 v0, 0x1

    return v0

    .line 100
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e()Z
    .locals 2

    .line 104
    iget-object v0, p0, Lo/eic;->Z:Lo/eif;

    sget-object v1, Lo/eif;->a:Lo/eif;

    if-ne v0, v1, :cond_0

    .line 105
    const/4 v0, 0x1

    return v0

    .line 107
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f()Z
    .locals 2

    .line 150
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->c:Lo/ehy;

    if-ne v0, v1, :cond_0

    .line 151
    const/4 v0, 0x1

    return v0

    .line 153
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public g()Z
    .locals 2

    .line 143
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->b:Lo/ehy;

    if-ne v0, v1, :cond_0

    .line 144
    const/4 v0, 0x1

    return v0

    .line 146
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public h()Z
    .locals 2

    .line 157
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->a:Lo/ehy;

    if-ne v0, v1, :cond_0

    .line 158
    const/4 v0, 0x1

    return v0

    .line 160
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i()Z
    .locals 2

    .line 134
    iget-object v0, p0, Lo/eic;->Z:Lo/eif;

    sget-object v1, Lo/eif;->b:Lo/eif;

    if-ne v0, v1, :cond_0

    .line 135
    const/4 v0, 0x0

    return v0

    .line 137
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public k()Z
    .locals 2

    .line 164
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->d:Lo/ehy;

    if-ne v0, v1, :cond_0

    .line 165
    const/4 v0, 0x1

    return v0

    .line 167
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public l()Z
    .locals 1

    .line 171
    invoke-virtual {p0}, Lo/eic;->m()Z

    move-result v0

    if-nez v0, :cond_0

    .line 172
    invoke-virtual {p0}, Lo/eic;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 173
    invoke-virtual {p0}, Lo/eic;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 176
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public m()Z
    .locals 2

    .line 187
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->f:Lo/ehy;

    if-ne v0, v1, :cond_0

    .line 188
    const/4 v0, 0x1

    return v0

    .line 190
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public n()Z
    .locals 2

    .line 194
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->i:Lo/ehy;

    if-ne v0, v1, :cond_0

    .line 195
    const/4 v0, 0x1

    return v0

    .line 197
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public o()Z
    .locals 2

    .line 180
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->k:Lo/ehy;

    if-ne v0, v1, :cond_0

    .line 181
    const/4 v0, 0x1

    return v0

    .line 183
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public p()Z
    .locals 2

    .line 201
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->g:Lo/ehy;

    if-ne v0, v1, :cond_0

    .line 202
    const/4 v0, 0x1

    return v0

    .line 204
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public q()Z
    .locals 2

    .line 219
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->o:Lo/ehy;

    if-ne v0, v1, :cond_0

    .line 220
    const/4 v0, 0x1

    return v0

    .line 222
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public r()Z
    .locals 2

    .line 208
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->p:Lo/ehy;

    if-ne v0, v1, :cond_0

    .line 209
    const/4 v0, 0x1

    return v0

    .line 211
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public s()Z
    .locals 2

    .line 234
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->b:Lo/ehy;

    if-ne v0, v1, :cond_0

    .line 235
    const/4 v0, 0x1

    return v0

    .line 236
    :cond_0
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->a:Lo/ehy;

    if-ne v0, v1, :cond_1

    .line 237
    const/4 v0, 0x1

    return v0

    .line 238
    :cond_1
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->c:Lo/ehy;

    if-ne v0, v1, :cond_2

    .line 239
    const/4 v0, 0x1

    return v0

    .line 240
    :cond_2
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->d:Lo/ehy;

    if-ne v0, v1, :cond_3

    .line 241
    const/4 v0, 0x1

    return v0

    .line 242
    :cond_3
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->g:Lo/ehy;

    if-ne v0, v1, :cond_4

    .line 243
    const/4 v0, 0x1

    return v0

    .line 244
    :cond_4
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->h:Lo/ehy;

    if-ne v0, v1, :cond_5

    .line 245
    const/4 v0, 0x1

    return v0

    .line 247
    :cond_5
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->k:Lo/ehy;

    if-eq v0, v1, :cond_6

    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->f:Lo/ehy;

    if-eq v0, v1, :cond_6

    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->i:Lo/ehy;

    if-eq v0, v1, :cond_6

    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->p:Lo/ehy;

    if-ne v0, v1, :cond_7

    .line 251
    :cond_6
    const/4 v0, 0x1

    return v0

    .line 253
    :cond_7
    const/4 v0, 0x0

    return v0
.end method

.method public u()Z
    .locals 2

    .line 226
    iget-object v0, p0, Lo/eic;->aa:Lo/ehy;

    sget-object v1, Lo/ehy;->h:Lo/ehy;

    if-ne v0, v1, :cond_0

    .line 227
    const/4 v0, 0x1

    return v0

    .line 229
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

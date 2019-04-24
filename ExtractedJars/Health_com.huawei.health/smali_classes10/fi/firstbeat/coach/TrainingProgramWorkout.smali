.class public Lfi/firstbeat/coach/TrainingProgramWorkout;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public cooldown:Lfi/firstbeat/coach/WorkoutProfile;

.field public dayNumber:I

.field public distance:I

.field public duration:I

.field public phraseNumber:I

.field public plan:Lfi/firstbeat/ete/FBTexercise;

.field public rest:Lfi/firstbeat/coach/WorkoutProfile;

.field public trainingEffect:I

.field public warmup:Lfi/firstbeat/coach/WorkoutProfile;

.field public weekPhraseNumber:I

.field public work:Lfi/firstbeat/coach/WorkoutProfile;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Lfi/firstbeat/ete/FBTexercise;

    invoke-direct {v0}, Lfi/firstbeat/ete/FBTexercise;-><init>()V

    iput-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->plan:Lfi/firstbeat/ete/FBTexercise;

    .line 31
    new-instance v0, Lfi/firstbeat/coach/WorkoutProfile;

    invoke-direct {v0}, Lfi/firstbeat/coach/WorkoutProfile;-><init>()V

    iput-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->warmup:Lfi/firstbeat/coach/WorkoutProfile;

    .line 36
    new-instance v0, Lfi/firstbeat/coach/WorkoutProfile;

    invoke-direct {v0}, Lfi/firstbeat/coach/WorkoutProfile;-><init>()V

    iput-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->work:Lfi/firstbeat/coach/WorkoutProfile;

    .line 41
    new-instance v0, Lfi/firstbeat/coach/WorkoutProfile;

    invoke-direct {v0}, Lfi/firstbeat/coach/WorkoutProfile;-><init>()V

    iput-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->rest:Lfi/firstbeat/coach/WorkoutProfile;

    .line 46
    new-instance v0, Lfi/firstbeat/coach/WorkoutProfile;

    invoke-direct {v0}, Lfi/firstbeat/coach/WorkoutProfile;-><init>()V

    iput-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->cooldown:Lfi/firstbeat/coach/WorkoutProfile;

    return-void
.end method


# virtual methods
.method public uadpDC1()V
    .locals 0

    .line 71
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 75
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 79
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 83
    return-void
.end method

.method public uadpDC5()V
    .locals 0

    .line 87
    return-void
.end method

.method public uadpDC6()V
    .locals 0

    .line 91
    return-void
.end method

.method public uadpDC7()V
    .locals 0

    .line 95
    return-void
.end method

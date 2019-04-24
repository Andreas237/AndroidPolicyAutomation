.class public Lfi/firstbeat/coach/CoachC;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfi/firstbeat/coach/Coach;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native addRunningExercise(IIIII)I
.end method

.method public native getAdvice(I[I)[Lfi/firstbeat/coach/TrainingProgramWorkout;
.end method

.method public native getDateId(III)I
.end method

.method public native getFeedbackPhraseNumber()I
.end method

.method public native getFitnessClass()I
.end method

.method public native getFitnessLevelIncreaseIn28d()I
.end method

.method public native getMonthlyLoad()I
.end method

.method public native getParameters()Lfi/firstbeat/coach/CoachVars;
.end method

.method public native getRecommendationExceedBy()I
.end method

.method public native getVersion()Ljava/lang/String;
.end method

.method public native setParameters(Lfi/firstbeat/coach/CoachVars;)I
.end method

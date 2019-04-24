.class public Lfi/firstbeat/coach/RacePrediction;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native getCurrentTime(Lfi/firstbeat/coach/CoachRaceType;Lfi/firstbeat/coach/CoachVars;)I
.end method

.method public static native getImproveMode(III)I
.end method

.method public static native getMinDaysToRace(Lfi/firstbeat/coach/CoachRaceType;)I
.end method

.method public static native getPossibleWeeklyExerciseCount(Lfi/firstbeat/coach/CoachRaceType;)[I
.end method

.method public static native getPotentialTime(Lfi/firstbeat/coach/CoachRaceType;ILfi/firstbeat/coach/CoachVars;)I
.end method

.method public static native getRunningFitnessLevelEstimate(Lfi/firstbeat/coach/CoachRaceType;I)I
.end method

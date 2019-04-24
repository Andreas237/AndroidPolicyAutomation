.class public Lfi/firstbeat/coach/CoachVars;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public endDate:I

.field public eteVars:Lfi/firstbeat/ete/FBTvars;

.field public improveMode:I

.field public lastTlBaseUpdate:I

.field public latestExerciseTime:I

.field public latestFeedbackPhraseNumber:I

.field public nowDate:I

.field public previousToPreviousTrainingLevel:I

.field public previousTrainingLevel:I

.field public startDate:I

.field public trainingGoal:I

.field public trainingLevel:I

.field public weeklyTrainingDays:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Lfi/firstbeat/ete/FBTvars;

    invoke-direct {v0}, Lfi/firstbeat/ete/FBTvars;-><init>()V

    iput-object v0, p0, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 117
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpDC1()V
    .locals 0

    .line 122
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 126
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 130
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 134
    return-void
.end method

.method public uadpDC5()V
    .locals 0

    .line 138
    return-void
.end method

.method public uadpDC6()V
    .locals 0

    .line 142
    return-void
.end method

.method public uadpDC7()V
    .locals 0

    .line 146
    return-void
.end method

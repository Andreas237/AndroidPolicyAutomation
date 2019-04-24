.class public Lfi/firstbeat/coach/WorkoutProfile;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public duration:I

.field public heartRate:Lfi/firstbeat/coach/WorkoutLimits;

.field public intensity:Lfi/firstbeat/coach/WorkoutLimits;

.field public runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Lfi/firstbeat/coach/WorkoutLimits;

    invoke-direct {v0}, Lfi/firstbeat/coach/WorkoutLimits;-><init>()V

    iput-object v0, p0, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    .line 11
    new-instance v0, Lfi/firstbeat/coach/WorkoutLimits;

    invoke-direct {v0}, Lfi/firstbeat/coach/WorkoutLimits;-><init>()V

    iput-object v0, p0, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    .line 13
    new-instance v0, Lfi/firstbeat/coach/WorkoutLimits;

    invoke-direct {v0}, Lfi/firstbeat/coach/WorkoutLimits;-><init>()V

    iput-object v0, p0, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    return-void
.end method


# virtual methods
.method public uadpDC1()V
    .locals 0

    .line 19
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 23
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 27
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 31
    return-void
.end method

.class public final enum Lfi/firstbeat/coach/CoachRaceType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lfi/firstbeat/coach/CoachRaceType;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lfi/firstbeat/coach/CoachRaceType;

.field public static final enum COACH_RACE_TYPE_10K:Lfi/firstbeat/coach/CoachRaceType;

.field public static final enum COACH_RACE_TYPE_5K:Lfi/firstbeat/coach/CoachRaceType;

.field public static final enum COACH_RACE_TYPE_HALF_MARATHON:Lfi/firstbeat/coach/CoachRaceType;

.field public static final enum COACH_RACE_TYPE_MARATHON:Lfi/firstbeat/coach/CoachRaceType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 4
    new-instance v0, Lfi/firstbeat/coach/CoachRaceType;

    const-string v1, "COACH_RACE_TYPE_5K"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfi/firstbeat/coach/CoachRaceType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfi/firstbeat/coach/CoachRaceType;->COACH_RACE_TYPE_5K:Lfi/firstbeat/coach/CoachRaceType;

    .line 5
    new-instance v0, Lfi/firstbeat/coach/CoachRaceType;

    const-string v1, "COACH_RACE_TYPE_10K"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lfi/firstbeat/coach/CoachRaceType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfi/firstbeat/coach/CoachRaceType;->COACH_RACE_TYPE_10K:Lfi/firstbeat/coach/CoachRaceType;

    .line 6
    new-instance v0, Lfi/firstbeat/coach/CoachRaceType;

    const-string v1, "COACH_RACE_TYPE_HALF_MARATHON"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lfi/firstbeat/coach/CoachRaceType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfi/firstbeat/coach/CoachRaceType;->COACH_RACE_TYPE_HALF_MARATHON:Lfi/firstbeat/coach/CoachRaceType;

    .line 7
    new-instance v0, Lfi/firstbeat/coach/CoachRaceType;

    const-string v1, "COACH_RACE_TYPE_MARATHON"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lfi/firstbeat/coach/CoachRaceType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfi/firstbeat/coach/CoachRaceType;->COACH_RACE_TYPE_MARATHON:Lfi/firstbeat/coach/CoachRaceType;

    .line 3
    const/4 v0, 0x4

    new-array v0, v0, [Lfi/firstbeat/coach/CoachRaceType;

    sget-object v1, Lfi/firstbeat/coach/CoachRaceType;->COACH_RACE_TYPE_5K:Lfi/firstbeat/coach/CoachRaceType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lfi/firstbeat/coach/CoachRaceType;->COACH_RACE_TYPE_10K:Lfi/firstbeat/coach/CoachRaceType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lfi/firstbeat/coach/CoachRaceType;->COACH_RACE_TYPE_HALF_MARATHON:Lfi/firstbeat/coach/CoachRaceType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lfi/firstbeat/coach/CoachRaceType;->COACH_RACE_TYPE_MARATHON:Lfi/firstbeat/coach/CoachRaceType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lfi/firstbeat/coach/CoachRaceType;->$VALUES:[Lfi/firstbeat/coach/CoachRaceType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lfi/firstbeat/coach/CoachRaceType;
    .locals 1

    .line 3
    const-class v0, Lfi/firstbeat/coach/CoachRaceType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lfi/firstbeat/coach/CoachRaceType;

    return-object v0
.end method

.method public static values()[Lfi/firstbeat/coach/CoachRaceType;
    .locals 1

    .line 3
    sget-object v0, Lfi/firstbeat/coach/CoachRaceType;->$VALUES:[Lfi/firstbeat/coach/CoachRaceType;

    invoke-virtual {v0}, [Lfi/firstbeat/coach/CoachRaceType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfi/firstbeat/coach/CoachRaceType;

    return-object v0
.end method

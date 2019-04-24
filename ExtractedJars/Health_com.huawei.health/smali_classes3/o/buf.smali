.class public Lo/buf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/util/Calendar;
    .locals 3

    .line 130
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 131
    const-string v0, "yyyy-MM-dd"

    invoke-static {p0, v0}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    .line 132
    if-eqz v2, :cond_0

    .line 133
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 135
    :cond_0
    return-object v1
.end method

.method private static b(Lfi/firstbeat/coach/modle/CoachParams;)V
    .locals 3

    .line 139
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v1

    .line 140
    if-eqz v1, :cond_1

    .line 141
    invoke-interface {v1}, Lo/brr;->a()Lo/brw;

    move-result-object v2

    .line 142
    if-eqz v2, :cond_1

    .line 143
    invoke-interface {v2}, Lo/brw;->getAge()I

    move-result v0

    invoke-virtual {p0, v0}, Lfi/firstbeat/coach/modle/CoachParams;->setAge(I)V

    .line 144
    invoke-interface {v2}, Lo/brw;->getHeight()I

    move-result v0

    invoke-virtual {p0, v0}, Lfi/firstbeat/coach/modle/CoachParams;->setHeight(I)V

    .line 145
    invoke-interface {v2}, Lo/brw;->getWeight()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lfi/firstbeat/coach/modle/CoachParams;->setWeight(I)V

    .line 146
    invoke-interface {v2}, Lo/brw;->getGender()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, v0}, Lfi/firstbeat/coach/modle/CoachParams;->setGender(I)V

    .line 149
    :cond_1
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    .line 73
    invoke-static {p0, p2}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    .line 74
    invoke-static {p1, p2}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4

    .line 75
    if-eqz v4, :cond_0

    if-eqz v3, :cond_0

    .line 76
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bxz;->d(J)I

    move-result v0

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bxz;->d(J)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    return v0

    .line 78
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static c(I)Lfi/firstbeat/coach/CoachRaceType;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 59
    sget-object v1, Lfi/firstbeat/coach/CoachRaceType;->COACH_RACE_TYPE_5K:Lfi/firstbeat/coach/CoachRaceType;

    .line 60
    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    .line 61
    sget-object v1, Lfi/firstbeat/coach/CoachRaceType;->COACH_RACE_TYPE_10K:Lfi/firstbeat/coach/CoachRaceType;

    goto :goto_0

    .line 62
    :cond_0
    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    .line 63
    sget-object v1, Lfi/firstbeat/coach/CoachRaceType;->COACH_RACE_TYPE_HALF_MARATHON:Lfi/firstbeat/coach/CoachRaceType;

    goto :goto_0

    .line 64
    :cond_1
    const/4 v0, 0x3

    if-ne p0, v0, :cond_2

    .line 65
    sget-object v1, Lfi/firstbeat/coach/CoachRaceType;->COACH_RACE_TYPE_MARATHON:Lfi/firstbeat/coach/CoachRaceType;

    .line 67
    :cond_2
    :goto_0
    return-object v1
.end method

.method public static c(Lfi/firstbeat/coach/modle/CoachParams;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lfi/firstbeat/coach/modle/CoachParams;)Ljava/util/List<Lcom/huawei/health/suggestion/model/CoachParamsMaping;>;"
        }
    .end annotation

    .line 90
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 91
    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getAge()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    const/16 v3, 0x6e

    invoke-static {v4, v1, v0, v2, v3}, Lo/buf;->d(Ljava/util/List;IIII)I

    move-result v0

    invoke-virtual {p0, v0}, Lfi/firstbeat/coach/modle/CoachParams;->setAge(I)V

    .line 92
    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getWeight()I

    move-result v0

    const/4 v1, 0x2

    const/16 v2, 0x23

    const/16 v3, 0xfa

    invoke-static {v4, v1, v0, v2, v3}, Lo/buf;->d(Ljava/util/List;IIII)I

    move-result v0

    invoke-virtual {p0, v0}, Lfi/firstbeat/coach/modle/CoachParams;->setWeight(I)V

    .line 93
    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getHeight()I

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0x64

    const/16 v3, 0xfa

    invoke-static {v4, v1, v0, v2, v3}, Lo/buf;->d(Ljava/util/List;IIII)I

    move-result v0

    invoke-virtual {p0, v0}, Lfi/firstbeat/coach/modle/CoachParams;->setHeight(I)V

    .line 94
    return-object v4
.end method

.method private static d(Ljava/util/List;IIII)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/CoachParamsMaping;>;IIII)I"
        }
    .end annotation

    .line 157
    invoke-static {p2, p3, p4}, Lo/buf;->e(III)I

    move-result v1

    .line 158
    if-eq p2, v1, :cond_0

    .line 159
    new-instance v0, Lcom/huawei/health/suggestion/model/CoachParamsMaping;

    invoke-direct {v0, p1, p2, v1}, Lcom/huawei/health/suggestion/model/CoachParamsMaping;-><init>(III)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    :cond_0
    return v1
.end method

.method public static e(I)I
    .locals 2

    .line 105
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 107
    :pswitch_0
    const/4 v1, 0x2

    .line 108
    goto :goto_1

    .line 111
    :pswitch_1
    const/4 v1, 0x2

    .line 112
    goto :goto_1

    .line 115
    :pswitch_2
    const/4 v1, 0x3

    .line 116
    goto :goto_1

    .line 119
    :pswitch_3
    const/4 v1, 0x4

    .line 120
    goto :goto_1

    .line 123
    :goto_0
    const/4 v1, 0x2

    .line 126
    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static e(III)I
    .locals 0

    .line 168
    if-ge p0, p1, :cond_0

    .line 169
    return p1

    .line 170
    :cond_0
    if-le p0, p2, :cond_1

    .line 171
    return p2

    .line 173
    :cond_1
    return p0
.end method

.method public static e(ILjava/util/Calendar;)Lfi/firstbeat/coach/modle/CoachParams;
    .locals 2

    .line 43
    new-instance v1, Lfi/firstbeat/coach/modle/CoachParams;

    invoke-direct {v1}, Lfi/firstbeat/coach/modle/CoachParams;-><init>()V

    .line 44
    invoke-static {p0}, Lo/buf;->e(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lfi/firstbeat/coach/modle/CoachParams;->setTrainingGoal(I)V

    .line 45
    invoke-static {p0}, Lo/buc;->c(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lfi/firstbeat/coach/modle/CoachParams;->setDaysOfPlan(I)V

    .line 46
    invoke-virtual {v1, p1}, Lfi/firstbeat/coach/modle/CoachParams;->setStartDate(Ljava/util/Calendar;)V

    .line 47
    invoke-static {v1}, Lo/buf;->b(Lfi/firstbeat/coach/modle/CoachParams;)V

    .line 48
    return-object v1
.end method

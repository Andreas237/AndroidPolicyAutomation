.class public Lo/bvt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 3

    .line 62
    const-string v0, "[0-9]+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 63
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    const/4 v0, 0x1

    return v0

    .line 67
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Ljava/util/List<Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 197
    if-eqz p0, :cond_1

    .line 198
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 199
    invoke-static {v2}, Lo/bvt;->e(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    :cond_0
    goto :goto_0

    .line 204
    :cond_1
    return-void
.end method

.method public static c(I)Lo/bwn;
    .locals 9
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 106
    if-eqz p0, :cond_0

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    const/16 v0, 0x13

    if-ne p0, v0, :cond_1

    .line 107
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_unit_week:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    add-int/lit8 v3, p0, 0x1

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 108
    new-instance v7, Lo/bwn;

    const/4 v0, 0x0

    invoke-direct {v7, v0, v8, p0}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    .line 109
    goto :goto_0

    .line 110
    :cond_1
    new-instance v7, Lo/bwn;

    const-string v0, ""

    const/4 v1, 0x0

    invoke-direct {v7, v1, v0, p0}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    .line 112
    :goto_0
    return-object v7
.end method

.method public static c(Lcom/huawei/health/suggestion/model/WorkoutRecord;Ljava/text/SimpleDateFormat;[Ljava/lang/String;)V
    .locals 7

    .line 71
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireTrajectoryId()Ljava/lang/String;

    move-result-object v4

    .line 72
    invoke-static {v4}, Lo/bvt;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    const-string v0, "_"

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 74
    invoke-static {v5}, Lo/bvt;->e([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    :try_start_0
    new-instance v0, Ljava/util/Date;

    const/4 v1, 0x0

    aget-object v1, v5, v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p2, v1

    .line 77
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/text/SimpleDateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    const/4 v2, 0x0

    aget-object v2, v5, v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, p2, v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    goto :goto_0

    .line 78
    :catch_0
    move-exception v6

    .line 79
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getExeTimeTemp error trajectoryId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    :cond_0
    :goto_0
    return-void
.end method

.method public static c(Ljava/util/List;Ljava/util/List;Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bwn;>;Ljava/util/List<Lo/bwn;>;Lcom/huawei/health/suggestion/model/Plan;)V"
        }
    .end annotation

    .line 118
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/Plan;->getWeekCount()I

    move-result v0

    const/16 v1, 0x8

    if-gt v0, v1, :cond_1

    .line 119
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/Plan;->getWeekCount()I

    move-result v0

    if-ge v7, v0, :cond_0

    .line 120
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_unit_week:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    add-int/lit8 v3, v7, 0x1

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 121
    new-instance v9, Lo/bwn;

    const/4 v0, 0x0

    invoke-direct {v9, v0, v8, v7}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    .line 122
    invoke-interface {p0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    invoke-virtual {v9}, Lo/bwn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bwn;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    goto :goto_2

    .line 127
    :cond_1
    const/4 v7, 0x0

    :goto_1
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/Plan;->getWeekCount()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 129
    invoke-static {v7}, Lo/bvt;->c(I)Lo/bwn;

    move-result-object v8

    .line 130
    invoke-interface {p0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    invoke-virtual {v8}, Lo/bwn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bwn;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 134
    :cond_2
    :goto_2
    return-void
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 1

    .line 52
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "_"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "_"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Lcom/huawei/health/suggestion/model/WorkoutRecord;Ljava/util/Date;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 224
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 225
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-static {p3, v0}, Lo/bzv;->a(Ljava/util/Date;Ljava/util/Date;)I

    move-result v2

    .line 226
    if-ltz v2, :cond_1

    .line 227
    div-int/lit8 v2, v2, 0x7

    goto :goto_0

    .line 230
    :cond_0
    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bzv;->a(Ljava/util/Date;Ljava/util/Date;)I

    move-result v2

    .line 232
    :cond_1
    :goto_0
    return v2
.end method

.method public static final e(D)Ljava/lang/String;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    .line 87
    const-string v0, "%02d\'%02d\""

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    const-wide/16 v4, 0x3c

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    const-wide/16 v4, 0x3c

    rem-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;I)Lo/bwn;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 93
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 94
    new-instance v2, Lo/bwn;

    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v2, v1, v0, p2}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    goto :goto_0

    .line 95
    :cond_0
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/16 v1, 0xf

    if-ne v0, v1, :cond_1

    .line 96
    new-instance v2, Lo/bwn;

    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v2, v1, v0, p2}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    goto :goto_0

    .line 98
    :cond_1
    new-instance v2, Lo/bwn;

    const-string v0, ""

    const/4 v1, 0x0

    invoke-direct {v2, v1, v0, p2}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    .line 100
    :goto_0
    return-object v2
.end method

.method public static e(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;II)Lo/bwn;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 213
    const/4 v0, 0x3

    if-ne p3, v0, :cond_0

    .line 214
    invoke-static {p0, p1, p2}, Lo/bvt;->e(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;I)Lo/bwn;

    move-result-object v2

    goto :goto_0

    .line 216
    :cond_0
    new-instance v2, Lo/bwn;

    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v2, v1, v0, p2}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    .line 218
    :goto_0
    const/4 v0, 0x6

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 219
    return-object v2
.end method

.method public static e(Ljava/util/Calendar;Ljava/util/List;ILjava/text/DecimalFormat;Lcom/huawei/health/suggestion/model/WorkoutRecord;ILcom/huawei/health/suggestion/model/Userinfo;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Calendar;Ljava/util/List<Lo/bwn;>;ILjava/text/DecimalFormat;Lcom/huawei/health/suggestion/model/WorkoutRecord;ILcom/huawei/health/suggestion/model/Userinfo;)V"
        }
    .end annotation

    .line 137
    invoke-static {p1, p5}, Lo/buk;->a(Ljava/util/List;I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 138
    invoke-interface {p1, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/bwn;

    .line 139
    if-nez p2, :cond_0

    .line 140
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lo/bwn;->b(I)V

    .line 141
    invoke-virtual {v6}, Lo/bwn;->q()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {p4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDistance()F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Lo/bzr;->i(D)D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-float v0, v0

    invoke-virtual {v6, v0}, Lo/bwn;->h(F)Lo/bwn;

    .line 143
    invoke-virtual {p4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/bzr;->i(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bzr;->a(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    .line 144
    invoke-virtual {v6}, Lo/bwn;->s()F

    move-result v0

    add-float/2addr v0, v7

    invoke-virtual {v6, v0}, Lo/bwn;->k(F)Lo/bwn;

    .line 145
    invoke-static {}, Lo/bzr;->c()I

    move-result v0

    invoke-virtual {v6}, Lo/bwn;->s()F

    move-result v1

    float-to-int v1, v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Lo/bwn;->s()F

    move-result v3

    float-to-double v3, v3

    invoke-virtual {p3, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/bwn;->b(Ljava/lang/String;)Lo/bwn;

    .line 146
    goto/16 :goto_2

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 147
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/bwn;->b(I)V

    .line 148
    invoke-virtual {v6}, Lo/bwn;->q()F

    move-result v0

    invoke-virtual {p4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireCalorie()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lo/bwn;->h(F)Lo/bwn;

    .line 149
    invoke-virtual {v6}, Lo/bwn;->s()F

    move-result v0

    invoke-virtual {p4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lo/bwn;->k(F)Lo/bwn;

    .line 150
    invoke-virtual {v6}, Lo/bwn;->s()F

    move-result v0

    invoke-virtual {v6, v0}, Lo/bwn;->i(F)Lo/bwn;

    .line 151
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/text/DecimalFormat;

    const-string v4, "#"

    invoke-direct {v3, v4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Lo/bwn;->s()F

    move-result v4

    const/high16 v5, 0x447a0000    # 1000.0f

    div-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/bwn;->b(Ljava/lang/String;)Lo/bwn;

    goto/16 :goto_2

    .line 153
    :cond_1
    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    .line 154
    invoke-virtual {p4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/bzr;->i(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bzr;->a(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    .line 155
    invoke-virtual {v6}, Lo/bwn;->q()F

    move-result v0

    add-float/2addr v0, v7

    invoke-virtual {v6, v0}, Lo/bwn;->h(F)Lo/bwn;

    .line 156
    invoke-virtual {v6}, Lo/bwn;->s()F

    move-result v0

    invoke-virtual {p4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lo/bwn;->k(F)Lo/bwn;

    .line 157
    invoke-virtual {v6}, Lo/bwn;->v()F

    move-result v0

    invoke-virtual {p4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lo/bwn;->f(F)V

    .line 158
    invoke-virtual {v6}, Lo/bwn;->q()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v6}, Lo/bwn;->v()F

    move-result v0

    invoke-virtual {v6}, Lo/bwn;->q()F

    move-result v1

    div-float/2addr v0, v1

    :goto_0
    invoke-virtual {v6, v0}, Lo/bwn;->i(F)Lo/bwn;

    .line 159
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lo/bwn;->b(I)V

    .line 160
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lo/bzr;->e()I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Lo/bwn;->n()F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Lo/bvt;->e(D)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/bwn;->b(Ljava/lang/String;)Lo/bwn;

    .line 162
    goto :goto_2

    :cond_3
    const/4 v0, 0x3

    if-ne p2, v0, :cond_5

    .line 163
    invoke-virtual {v6}, Lo/bwn;->v()F

    move-result v0

    invoke-virtual {p4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lo/bwn;->f(F)V

    .line 164
    const/4 v0, 0x0

    if-ne v0, p0, :cond_4

    .line 165
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "diffRecordType null == firstDay"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0, p4, p6}, Lo/btj;->d(Lcom/huawei/health/suggestion/model/WorkoutRecord;Lcom/huawei/health/suggestion/model/Userinfo;)F

    move-result v0

    invoke-virtual {v6, v0}, Lo/bwn;->c(F)Lo/bwn;

    goto :goto_1

    .line 168
    :cond_4
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0, p4, p6}, Lo/btj;->e(Lcom/huawei/health/suggestion/model/WorkoutRecord;Lcom/huawei/health/suggestion/model/Userinfo;)F

    move-result v0

    invoke-virtual {v6, v0}, Lo/bwn;->c(F)Lo/bwn;

    .line 170
    :goto_1
    invoke-virtual {v6}, Lo/bwn;->v()F

    move-result v0

    invoke-virtual {v6}, Lo/bwn;->o()F

    move-result v1

    div-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    invoke-static {v0}, Lo/bya;->c(F)F

    move-result v0

    invoke-virtual {v6, v0}, Lo/bwn;->k(F)Lo/bwn;

    .line 171
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/bwn;->b(I)V

    .line 172
    invoke-virtual {v6}, Lo/bwn;->s()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/bwn;->b(Ljava/lang/String;)Lo/bwn;

    .line 176
    :cond_5
    :goto_2
    return-void
.end method

.method public static e(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z
    .locals 2

    .line 207
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e([Ljava/lang/String;)Z
    .locals 2

    .line 57
    array-length v0, p0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    aget-object v0, p0, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    aget-object v0, p0, v0

    invoke-static {v0}, Lo/bvt;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

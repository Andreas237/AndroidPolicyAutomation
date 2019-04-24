.class public Lcom/huawei/health/suggestion/receiver/AlarmReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field private static a:I

.field private static c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const/4 v0, 0x0

    sput v0, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->a:I

    .line 37
    const/4 v0, 0x0

    sput v0, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification;
    .locals 2

    .line 149
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dbc;->e()Landroid/app/Notification$Builder;

    move-result-object v1

    .line 151
    invoke-static {p1, v1}, Lo/ene;->c(Landroid/content/Context;Landroid/app/Notification$Builder;)V

    .line 152
    invoke-virtual {v1, p2}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 153
    invoke-virtual {v1, p3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 154
    invoke-virtual {v1, p4}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 155
    invoke-virtual {v1, p5}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 156
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 157
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 158
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 159
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 161
    invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;"
        }
    .end annotation

    .line 123
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v4

    .line 124
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 125
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 126
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 128
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWorkoutId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 129
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    :cond_0
    const-string v0, "Suggestion_AlarmReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==today have workouts: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 134
    :cond_2
    return-object v5
.end method

.method private c(Lcom/huawei/health/suggestion/model/Plan;)Ljava/lang/String;
    .locals 5

    .line 103
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 105
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    .line 107
    invoke-direct {p0, p1, v2}, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->a(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 108
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/model/PlanWorkout;

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 110
    :goto_0
    if-eqz v4, :cond_2

    .line 111
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_1

    .line 112
    invoke-static {p1}, Lo/bxj;->a(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 113
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 115
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDayTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 118
    :cond_2
    const-string v0, ""

    return-object v0
.end method

.method private static d()V
    .locals 1

    .line 95
    invoke-static {}, Lo/bzv;->b()I

    move-result v0

    sput v0, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->c:I

    .line 96
    return-void
.end method

.method private static e()V
    .locals 1

    .line 99
    invoke-static {}, Lo/bzv;->b()I

    move-result v0

    sput v0, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->a:I

    .line 100
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 17

    .line 41
    const-string v0, "Suggestion_AlarmReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63a5\u6536\u95f9\u949f\u5e7f\u64ad-----------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_5

    .line 43
    const-string v0, "userId"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 44
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v8

    .line 45
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/AccountInfo;->isLogin()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 46
    const-string v0, "planType"

    move-object/from16 v1, p2

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v9

    .line 47
    if-nez v9, :cond_2

    .line 48
    new-instance v10, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/suggestion/receiver/NotificationReceiver;

    move-object/from16 v1, p1

    invoke-direct {v10, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 49
    const-string v0, "planType"

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 50
    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/high16 v2, 0x8000000

    invoke-static {v0, v1, v10, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v11

    .line 52
    invoke-static {}, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->e()V

    .line 53
    sget v12, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->a:I

    .line 54
    sget v0, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->a:I

    sget v1, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->c:I

    if-ne v0, v1, :cond_0

    .line 55
    sget v0, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->a:I

    add-int/lit8 v12, v0, 0x1

    .line 57
    :cond_0
    const-string v0, "Suggestion_AlarmReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Constants.PlanType.RUN notifyId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v13

    .line 60
    const/4 v0, 0x0

    if-ne v0, v13, :cond_1

    .line 61
    const-string v0, "Suggestion_AlarmReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive() Plan = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    return-void

    .line 65
    :cond_1
    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v14

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_exercise_remind:I

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 67
    move-object/from16 v0, p0

    invoke-direct {v0, v13}, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->c(Lcom/huawei/health/suggestion/model/Plan;)Ljava/lang/String;

    move-result-object v16

    .line 68
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, v16

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v4, v14

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-object/from16 v6, v16

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object v6, v11

    invoke-direct/range {v1 .. v6}, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->a(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {v0, v12, v1}, Lo/dbc;->b(ILandroid/app/Notification;)V

    .line 69
    goto/16 :goto_0

    :cond_2
    const/4 v0, 0x3

    if-ne v9, v0, :cond_5

    .line 70
    new-instance v10, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/suggestion/receiver/NotificationReceiver;

    move-object/from16 v1, p1

    invoke-direct {v10, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 71
    const-string v0, "planType"

    const/4 v1, 0x3

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 72
    move-object/from16 v0, p1

    const/4 v1, 0x3

    const/high16 v2, 0x8000000

    invoke-static {v0, v1, v10, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v11

    .line 74
    invoke-static {}, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->d()V

    .line 75
    sget v12, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->c:I

    .line 76
    sget v0, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->a:I

    sget v1, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->c:I

    if-ne v0, v1, :cond_3

    .line 77
    sget v0, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->c:I

    add-int/lit8 v12, v0, 0x1

    .line 79
    :cond_3
    const-string v0, "Suggestion_AlarmReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Constants.PlanType.PACKAGE notifyId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v13

    .line 81
    const/4 v0, 0x0

    if-ne v0, v13, :cond_4

    .line 82
    const-string v0, "Suggestion_AlarmReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "plan is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    return-void

    .line 85
    :cond_4
    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v14

    .line 86
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_home_remind_workout:I

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 87
    move-object/from16 v0, p0

    invoke-direct {v0, v13}, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->c(Lcom/huawei/health/suggestion/model/Plan;)Ljava/lang/String;

    move-result-object v16

    .line 88
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, v16

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v4, v14

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-object/from16 v6, v16

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object v6, v11

    invoke-direct/range {v1 .. v6}, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;->a(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {v0, v12, v1}, Lo/dbc;->b(ILandroid/app/Notification;)V

    .line 92
    :cond_5
    :goto_0
    return-void
.end method

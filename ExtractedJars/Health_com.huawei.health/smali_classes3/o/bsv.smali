.class public Lo/bsv;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 8

    .line 134
    if-eqz p0, :cond_1

    .line 135
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v4

    .line 136
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 137
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 138
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 139
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v7

    .line 140
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-static {v7, v0}, Lo/bsv;->c(Ljava/util/Date;Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    const-string v0, "DataImplRemindHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancel today planRemind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v2, 0x8000000

    invoke-static {v0, v5, v1, v2}, Lo/bsv;->b(Landroid/content/Context;ILandroid/content/Intent;I)V

    .line 136
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 148
    :cond_1
    return-void
.end method

.method public static b(Landroid/content/Context;ILandroid/content/Intent;I)V
    .locals 6

    .line 69
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/AlarmManager;

    .line 70
    invoke-static {p0, p1, p2, p3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    .line 71
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 72
    const-string v0, "DataImplRemindHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancel remind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    invoke-virtual {v5}, Landroid/app/PendingIntent;->cancel()V

    .line 74
    invoke-virtual {v4, v5}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 76
    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/util/Date;ILandroid/content/Intent;I)V
    .locals 6

    .line 51
    invoke-static {p0, p2, p3, p4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 52
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 53
    invoke-virtual {v4, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 54
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/app/AlarmManager;

    .line 56
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {v5, v2, v0, v1, v3}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    .line 58
    :cond_0
    return-void
.end method

.method public static c(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 7

    .line 121
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    .line 122
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v4

    .line 123
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 124
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 125
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 126
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v2, 0x8000000

    invoke-static {v0, v5, v1, v2}, Lo/bsv;->b(Landroid/content/Context;ILandroid/content/Intent;I)V

    .line 123
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 131
    :cond_1
    return-void
.end method

.method private static c(Ljava/util/Date;Ljava/util/Date;)Z
    .locals 5

    .line 151
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 152
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 153
    invoke-virtual {v2, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 154
    invoke-virtual {v3, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 155
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 156
    const/4 v0, 0x6

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 158
    :goto_0
    return v4
.end method

.method public static d()V
    .locals 1

    .line 36
    const-string v0, "isOpenRemind"

    invoke-static {v0}, Lo/cag;->e(Ljava/lang/String;)I

    .line 38
    const-string v0, "remindTime"

    invoke-static {v0}, Lo/cag;->e(Ljava/lang/String;)I

    .line 39
    return-void
.end method

.method public static e(Lcom/huawei/health/suggestion/model/Plan;ZI)V
    .locals 9

    .line 85
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v3

    .line 86
    const/4 v0, 0x0

    if-eq v0, p0, :cond_4

    const/4 v0, 0x0

    if-eq v0, v3, :cond_4

    .line 87
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v4

    .line 88
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 89
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 90
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 91
    new-instance v7, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;

    invoke-direct {v7, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 93
    if-eqz p1, :cond_0

    .line 94
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v8

    .line 95
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 96
    invoke-static {p2}, Lo/bzr;->b(I)I

    move-result v0

    const/16 v1, 0xb

    invoke-virtual {v8, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 97
    invoke-static {p2}, Lo/bzr;->a(I)I

    move-result v0

    const/16 v1, 0xc

    invoke-virtual {v8, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 98
    const-string v0, "userId"

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 99
    const-string v0, "planType"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 100
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v8}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    const/high16 v2, 0x8000000

    invoke-static {v0, v1, v5, v7, v2}, Lo/bsv;->b(Landroid/content/Context;Ljava/util/Date;ILandroid/content/Intent;I)V

    .line 101
    goto :goto_1

    .line 102
    :cond_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x8000000

    invoke-static {v0, v5, v7, v1}, Lo/bsv;->b(Landroid/content/Context;ILandroid/content/Intent;I)V

    .line 88
    :cond_1
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 106
    :cond_2
    if-eqz p1, :cond_3

    .line 107
    const-string v0, "remindTime"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    const-string v0, "isOpenRemind"

    const-string v1, "1"

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 110
    :cond_3
    const-string v0, "isOpenRemind"

    invoke-static {v0}, Lo/cag;->e(Ljava/lang/String;)I

    .line 113
    :cond_4
    :goto_2
    return-void
.end method

.class public Lcom/huawei/health/receiver/HealthAchieveNotificationService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field private static c:Ljava/lang/String;

.field private static e:Ljava/lang/String;


# instance fields
.field private a:Ljava/util/concurrent/ExecutorService;

.field b:Landroid/os/Handler;

.field private d:Landroid/content/Context;

.field private f:Landroid/app/PendingIntent;

.field private h:I

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 40
    const-string v0, "PLGACHIEVE_"

    sput-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->c:Ljava/lang/String;

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "HealthAchieveNotificationService"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 43
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->a:Ljava/util/concurrent/ExecutorService;

    .line 55
    new-instance v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService$4;-><init>(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)V

    iput-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->b:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)Landroid/content/Context;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    return-object v0
.end method

.method private a()Ljava/lang/String;
    .locals 6

    .line 178
    const-string v2, ""

    .line 179
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v3

    .line 180
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 181
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "getLoginInfo"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 182
    invoke-interface {v3, v4}, Lo/dti;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 183
    const-string v0, "huid"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 185
    :cond_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 186
    const-string v0, "SharedPreferenceUtil"

    const-string v1, "getSharedPreference huid null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    const-string v0, ""

    return-object v0

    .line 189
    :cond_1
    return-object v2
.end method

.method static synthetic b(Lcom/huawei/health/receiver/HealthAchieveNotificationService;I)I
    .locals 0

    .line 39
    iput p1, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->h:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)I
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->k:I

    return v0
.end method

.method static synthetic c(Lcom/huawei/health/receiver/HealthAchieveNotificationService;I)I
    .locals 0

    .line 39
    iput p1, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->k:I

    return p1
.end method

.method private c()V
    .locals 15

    .line 108
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOversea"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    return-void

    .line 112
    :cond_0
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAchieveAlarm start HealthAchieveNotificationService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    const-wide/32 v7, 0x240c8400

    .line 114
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/app/AlarmManager;

    .line 115
    new-instance v10, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    invoke-direct {v10, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 116
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v11

    .line 117
    const/4 v0, 0x7

    invoke-virtual {v11, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v12, v0, -0x1

    .line 118
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dayOfWeeks="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    const/4 v0, 0x0

    if-ne v0, v12, :cond_1

    .line 120
    const/4 v12, 0x7

    .line 122
    :cond_1
    rsub-int/lit8 v0, v12, 0x7

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x5

    invoke-virtual {v11, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 123
    const/16 v0, 0xb

    invoke-virtual {v11, v0}, Ljava/util/Calendar;->get(I)I

    move-result v13

    .line 124
    div-int/lit8 v0, v13, 0x2

    add-int/lit8 v14, v0, 0x9

    .line 125
    const/16 v0, 0xb

    invoke-virtual {v11, v0, v14}, Ljava/util/Calendar;->set(II)V

    .line 126
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startAchieveAlarm  Calendar="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/util/Calendar;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    const/4 v1, 0x0

    const/high16 v2, 0x8000000

    invoke-static {v0, v1, v10, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->f:Landroid/app/PendingIntent;

    .line 128
    move-object v0, v9

    invoke-virtual {v11}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    move-wide v4, v7

    iget-object v6, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->f:Landroid/app/PendingIntent;

    const/4 v1, 0x0

    const-wide/32 v4, 0x240c8400

    invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V

    .line 130
    return-void
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 39
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    return-object v0
.end method

.method private d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 9

    .line 251
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ready to show messsage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 253
    const/4 v0, 0x7

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    .line 254
    const/4 v0, 0x1

    if-ne v0, v5, :cond_1

    .line 255
    const/16 v0, 0xb

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 256
    const/16 v0, 0x9

    if-le v6, v0, :cond_0

    const/16 v0, 0x15

    if-ge v6, v0, :cond_0

    .line 257
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "message type is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isNofified: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getNotified()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    invoke-direct {p0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->f()V

    .line 259
    new-instance v7, Lo/fhd;

    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    invoke-direct {v7, v0, p1}, Lo/fhd;-><init>(Landroid/content/Context;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 260
    invoke-virtual {v7}, Lo/fhd;->d()V

    .line 261
    invoke-direct {p0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->i()Ljava/lang/String;

    move-result-object v8

    .line 262
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "date is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    const-string v1, "_alarmStartFlag"

    invoke-static {v0, v1, v8}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    :cond_0
    goto :goto_0

    .line 266
    :cond_1
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Today isn\'t Monday!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    return-void

    .line 270
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)I
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->h:I

    return v0
.end method

.method private e()V
    .locals 8

    .line 133
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOversea"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    return-void

    .line 137
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 138
    const/4 v0, 0x7

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    .line 139
    const/4 v0, 0x1

    if-ne v0, v5, :cond_1

    .line 140
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    const-string v1, "_alarmStartFlag"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 141
    invoke-direct {p0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->i()Ljava/lang/String;

    move-result-object v7

    .line 142
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 143
    invoke-virtual {p0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->b()V

    .line 146
    :cond_1
    return-void
.end method

.method private f()V
    .locals 4

    .line 273
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshWeeklyReport!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 275
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/health/receiver/HealthAchieveNotificationService$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService$1;-><init>(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 285
    :cond_0
    return-void
.end method

.method private i()Ljava/lang/String;
    .locals 7

    .line 288
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 289
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    .line 290
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 291
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 292
    const-string v0, "-"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 293
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 294
    return-object v6
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 194
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    const-string v1, "_weekReportNo"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 196
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    const-string v1, "_weekMinReportNo"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 197
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->a:Ljava/util/concurrent/ExecutorService;

    .line 200
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;

    invoke-direct {v1, p0, v2, v3}, Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;-><init>(Lcom/huawei/health/receiver/HealthAchieveNotificationService;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 245
    return-void
.end method

.method public d(II)V
    .locals 7

    .line 150
    new-instance v4, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;-><init>()V

    .line 151
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    const v1, 0x7f0210d4

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    const v1, 0x7f0210d7

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgContent(Ljava/lang/String;)V

    .line 153
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setFlag(I)V

    .line 154
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgType(I)V

    .line 155
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setWeight(I)V

    .line 156
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setReadFlag(I)V

    .line 158
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setCreateTime(J)V

    .line 159
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messagecenter://sportReport?report_stype=1&min_report_no="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&max_report_no="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUri(Ljava/lang/String;)V

    .line 161
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPosition(I)V

    .line 163
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgPosition(I)V

    .line 164
    invoke-direct {p0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->a()Ljava/lang/String;

    move-result-object v5

    .line 165
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getReportMsg mUserProfile.getHuid()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    invoke-virtual {v4, v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setHuid(Ljava/lang/String;)V

    .line 168
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    const-string v1, "_achieve_msg_id_week"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 169
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "---processWeekly msgId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    const-string v6, "136"

    .line 173
    :cond_0
    invoke-virtual {v4, v6}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgId(Ljava/lang/String;)V

    .line 174
    invoke-direct {p0, v4}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 175
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 77
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 83
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 84
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    invoke-virtual {p0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    .line 86
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 87
    invoke-direct {p0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->c()V

    .line 89
    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 299
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthAchieveNotificationService onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 301
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->a:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 302
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 305
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->b:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 306
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->b:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 307
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->b:Landroid/os/Handler;

    .line 309
    :cond_1
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 5

    .line 93
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 96
    invoke-direct {p0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e()V

    goto :goto_0

    .line 98
    :cond_0
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    :goto_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 101
    :catch_0
    move-exception v4

    .line 102
    sget-object v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start Notification Service failed "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    const/4 v0, 0x0

    invoke-super {p0, v0, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method

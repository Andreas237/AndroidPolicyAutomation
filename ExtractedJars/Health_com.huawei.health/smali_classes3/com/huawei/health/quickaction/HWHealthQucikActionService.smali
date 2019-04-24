.class public Lcom/huawei/health/quickaction/HWHealthQucikActionService;
.super Lcom/huawei/android/quickaction/QuickActionService;
.source "SourceFile"


# instance fields
.field private a:[I

.field private b:[Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/huawei/android/quickaction/QuickActionService;-><init>()V

    .line 31
    const-class v0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->c:Ljava/lang/String;

    return-void
.end method

.method private b(ILandroid/content/Intent;)Landroid/app/PendingIntent;
    .locals 5

    .line 123
    const/4 v4, 0x0

    .line 124
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 125
    if-eqz p1, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 126
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->c:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "i=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, p2, v1}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    goto :goto_0

    .line 129
    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, p2, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    goto :goto_0

    .line 132
    :cond_2
    if-nez p1, :cond_3

    .line 133
    iget-object v0, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->c:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "i=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, p2, v1}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    goto :goto_0

    .line 136
    :cond_3
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, p2, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    .line 139
    :goto_0
    return-object v4
.end method

.method private c()V
    .locals 3

    .line 143
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 144
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->a:[I

    .line 152
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->e:Landroid/content/Context;

    .line 153
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020038

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->e:Landroid/content/Context;

    .line 154
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02045a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->e:Landroid/content/Context;

    .line 155
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020090

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->e:Landroid/content/Context;

    .line 156
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200a0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->e:Landroid/content/Context;

    .line 157
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020072

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->b:[Ljava/lang/String;

    goto :goto_0

    .line 160
    :cond_0
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->a:[I

    .line 166
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->e:Landroid/content/Context;

    .line 167
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020038

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->e:Landroid/content/Context;

    .line 168
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02045a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->e:Landroid/content/Context;

    .line 169
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200a0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->b:[Ljava/lang/String;

    .line 172
    :goto_0
    return-void

    :array_0
    .array-data 4
        0x7f05040f
        0x7f05035c
        0x7f0505d4
        0x7f0505d7
        0x7f050a83
    .end array-data

    :array_1
    .array-data 4
        0x7f05040f
        0x7f05035c
        0x7f0505d7
    .end array-data
.end method


# virtual methods
.method public b(Landroid/content/ComponentName;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/ComponentName;)Ljava/util/List<Lcom/huawei/android/quickaction/QuickAction;>;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_user_agree"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 50
    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_1

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not agree user xieyi or not login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    const/4 v0, 0x0

    return-object v0

    .line 54
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->c()V

    .line 55
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 56
    new-instance v6, Landroid/content/ComponentName;

    const-class v0, Lcom/huawei/health/quickaction/QuickActionStartRunService;

    invoke-direct {v6, p0, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 57
    new-instance v7, Landroid/content/ComponentName;

    const-class v0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;

    invoke-direct {v7, p0, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 58
    new-instance v8, Landroid/content/ComponentName;

    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-direct {v8, p0, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 59
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 62
    new-instance v9, Landroid/content/ComponentName;

    const-class v0, Lcom/huawei/health/quickaction/TranPlanService;

    invoke-direct {v9, p0, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 63
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    :cond_2
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_3

    .line 67
    new-instance v9, Landroid/content/ComponentName;

    const-class v0, Lcom/huawei/health/quickaction/QuickActionStartOperationService;

    invoke-direct {v9, p0, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 68
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    :cond_3
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 95
    const/4 v10, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v10, v0, :cond_5

    .line 96
    new-instance v11, Landroid/content/Intent;

    invoke-direct {v11}, Landroid/content/Intent;-><init>()V

    .line 97
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ComponentName;

    invoke-virtual {v11, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 98
    invoke-direct {p0, v10, v11}, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->b(ILandroid/content/Intent;)Landroid/app/PendingIntent;

    move-result-object v12

    .line 100
    if-eqz v12, :cond_4

    iget-object v0, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->b:[Ljava/lang/String;

    array-length v0, v0

    if-ge v10, v0, :cond_4

    .line 101
    invoke-virtual {v12}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v13

    .line 102
    if-eqz v13, :cond_4

    .line 103
    new-instance v0, Lcom/huawei/android/quickaction/QuickAction;

    iget-object v1, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->b:[Ljava/lang/String;

    aget-object v1, v1, v10

    .line 107
    invoke-virtual {p0}, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->a:[I

    aget v3, v3, v10

    invoke-static {v2, v3}, Lcom/huawei/android/quickaction/ActionIcon;->createWithResource(Landroid/content/Context;I)Lcom/huawei/android/quickaction/ActionIcon;

    move-result-object v2

    .line 109
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/ComponentName;

    invoke-direct {v0, v1, v2, v3, v13}, Lcom/huawei/android/quickaction/QuickAction;-><init>(Ljava/lang/String;Lcom/huawei/android/quickaction/ActionIcon;Landroid/content/ComponentName;Landroid/content/IntentSender;)V

    .line 103
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 115
    :cond_5
    return-object v9

    .line 116
    :catch_0
    move-exception v10

    .line 117
    iget-object v0, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    return-object v9
.end method

.method public onCreate()V
    .locals 4

    .line 41
    invoke-super {p0}, Lcom/huawei/android/quickaction/QuickActionService;->onCreate()V

    .line 42
    iget-object v0, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    iput-object p0, p0, Lcom/huawei/health/quickaction/HWHealthQucikActionService;->e:Landroid/content/Context;

    .line 45
    return-void
.end method

.class public Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const-class v0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 147
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->i()V

    .line 148
    return-void
.end method

.method public c(Landroid/net/Uri;)V
    .locals 9

    .line 99
    const/4 v4, 0x0

    .line 100
    const/4 v5, 0x0

    .line 101
    const/4 v6, 0x0

    .line 103
    const-string v0, "id"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 104
    const-string v0, "version"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 105
    const-string v0, "skip_type"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v4

    .line 112
    goto :goto_0

    .line 106
    :catch_0
    move-exception v7

    .line 107
    sget-object v0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goFitnessPage IllegalArgumentException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    return-void

    .line 109
    :catch_1
    move-exception v7

    .line 110
    sget-object v0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goFitnessPage Exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    return-void

    .line 115
    :goto_0
    const-string v0, "course"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    const/4 v7, 0x4

    .line 118
    :try_start_1
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result v0

    move v7, v0

    .line 121
    goto :goto_1

    .line 119
    :catch_2
    move-exception v8

    .line 120
    sget-object v0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goFitnessPage "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    :goto_1
    new-instance v8, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 124
    const-string v0, "intent_key_topicid"

    invoke-virtual {v8, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 125
    invoke-virtual {p0, v8}, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->startActivity(Landroid/content/Intent;)V

    .line 127
    goto :goto_2

    .line 128
    :cond_0
    sget-object v0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "goFitnessPage id= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " version="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    new-instance v7, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {v7, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 130
    const/high16 v0, 0x10000000

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 131
    const-string v0, "ISFROMSCHEME"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 132
    const-string v0, "workoutid"

    invoke-virtual {v7, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 133
    const-string v0, "version"

    invoke-virtual {v7, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 134
    invoke-virtual {p0, v7}, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->startActivity(Landroid/content/Intent;)V

    .line 139
    :goto_2
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 10

    .line 41
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 42
    iput-object p0, p0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->c:Landroid/content/Context;

    .line 43
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 44
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 45
    sget-object v0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand(Intent intent) intent == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-void

    .line 48
    :cond_0
    invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v5

    .line 49
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 50
    sget-object v0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand(Intent intent) schemeData == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    return-void

    .line 53
    :cond_1
    invoke-virtual {v5}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v6

    .line 54
    const-string v0, "/fitnesspage"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 55
    sget-object v0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "path is incorrect!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    return-void

    .line 58
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v7

    .line 59
    sget-object v0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginit_isLogined"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    invoke-static {}, Lo/ale;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v7}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_4

    .line 62
    :cond_3
    sget-object v0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StartHealth to MainActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v8

    .line 64
    const-string v0, "schemeDataType"

    const/4 v1, 0x2

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 65
    const-string v0, " schemeParamUri"

    invoke-virtual {v8, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 66
    invoke-virtual {p0, v8}, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->startActivity(Landroid/content/Intent;)V

    .line 67
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->finish()V

    .line 69
    goto :goto_1

    .line 71
    :cond_4
    const/4 v8, -0x1

    .line 72
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->getAdapter()Lo/eab;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 73
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->b()I

    move-result v8

    .line 76
    :cond_5
    const/4 v0, 0x2

    if-ne v8, v0, :cond_6

    .line 77
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->finish()V

    .line 78
    return-void

    .line 80
    :cond_6
    invoke-virtual {v5}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v9

    .line 81
    sget-object v0, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitness scheme query = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    const/4 v0, 0x0

    if-ne v0, v9, :cond_7

    .line 84
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->a()V

    goto :goto_0

    .line 86
    :cond_7
    invoke-virtual {p0, v5}, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->c(Landroid/net/Uri;)V

    .line 89
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->finish()V

    .line 92
    :goto_1
    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 152
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 153
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeFitnessActivity;->finish()V

    .line 154
    return-void
.end method

.class public Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private a()V
    .locals 1

    .line 206
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->h()I

    .line 207
    return-void
.end method

.method private b()V
    .locals 1

    .line 196
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->d()I

    .line 197
    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 7

    .line 119
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleHwMusicRequest"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    const/4 v4, 0x0

    .line 125
    if-eqz p1, :cond_0

    .line 126
    const-string v0, "isSelected"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    .line 127
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "huaweimusic isSelected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    :cond_0
    goto :goto_0

    .line 129
    :catch_0
    move-exception v5

    .line 130
    const/4 v4, 0x0

    .line 131
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Landroid/os/BadParcelableException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v5

    .line 135
    invoke-virtual {v5}, Lo/cbu;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 136
    invoke-virtual {v5}, Lo/cbu;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 137
    const/16 v0, 0x102

    invoke-direct {p0, v0}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->e(I)V

    goto/16 :goto_1

    .line 139
    :cond_1
    new-instance v6, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 140
    const/high16 v0, 0x4000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 141
    const-string v0, "isSelected"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 142
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "huaweimusic to sporting"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    invoke-virtual {p0, v6}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->startActivity(Landroid/content/Intent;)V

    .line 144
    goto :goto_1

    .line 150
    :cond_2
    new-instance v6, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/MainActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 151
    const/high16 v0, 0x4000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 153
    const-string v0, "isSelected"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 154
    const-string v0, "sportType"

    const/16 v1, 0x102

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 155
    const-string v0, "isToSportTab"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 156
    const-string v0, "mLaunchSource"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 157
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "huaweimusic to params"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 159
    invoke-virtual {p0, v6}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->startActivity(Landroid/content/Intent;)V

    .line 162
    :cond_3
    :goto_1
    return-void
.end method

.method private c(Landroid/net/Uri;)I
    .locals 2

    .line 166
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    .line 167
    const-string v0, "running"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    const/16 v0, 0x102

    return v0

    .line 169
    :cond_0
    const-string v0, "walking"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 170
    const/16 v0, 0x101

    return v0

    .line 171
    :cond_1
    const-string v0, "cycling"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 172
    const/16 v0, 0x103

    return v0

    .line 173
    :cond_2
    const-string v0, "indoorRunning"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 174
    const/16 v0, 0x108

    return v0

    .line 176
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private c()V
    .locals 2

    .line 216
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity$1;-><init>(Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;)V

    invoke-virtual {v0, v1}, Lo/cbl;->b(Lo/ceu;)I

    .line 227
    return-void
.end method

.method private e(I)V
    .locals 8

    .line 182
    const/4 v6, -0x1

    .line 183
    const/high16 v7, -0x40800000    # -1.0f

    .line 185
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    move v2, p1

    move v3, v6

    move v4, v7

    const/4 v1, 0x0

    const/4 v3, -0x1

    const/high16 v4, -0x40800000    # -1.0f

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cbl;->c(IIIFLo/ceu;)I

    .line 186
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    return-void
.end method


# virtual methods
.method public c(Landroid/content/Intent;)V
    .locals 8

    .line 73
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand(Intent intent)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    if-nez p1, :cond_0

    .line 75
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand(Intent intent) intent == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    return-void

    .line 79
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    .line 80
    if-nez v4, :cond_1

    .line 81
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand(Intent intent) data == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    return-void

    .line 85
    :cond_1
    invoke-virtual {v4}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v5

    .line 86
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Host "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    if-eqz v5, :cond_2

    const-string v0, "com.android.mediacenter"

    .line 88
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->b(Landroid/content/Intent;)V

    .line 90
    return-void

    .line 92
    :cond_2
    const/4 v6, 0x0

    .line 94
    const-string v0, "action"

    :try_start_0
    invoke-virtual {v4, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v6

    .line 101
    goto :goto_0

    .line 95
    :catch_0
    move-exception v7

    .line 96
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand IllegalArgumentException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-void

    .line 98
    :catch_1
    move-exception v7

    .line 99
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand Exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    return-void

    .line 102
    :goto_0
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand(Intent intent) queryParameter = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    const-string v0, "start"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 105
    invoke-direct {p0, v4}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->c(Landroid/net/Uri;)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->e(I)V

    goto :goto_1

    .line 106
    :cond_3
    const-string v0, "pause"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 107
    invoke-direct {p0}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->b()V

    goto :goto_1

    .line 108
    :cond_4
    const-string v0, "resume"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 109
    invoke-direct {p0}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->a()V

    goto :goto_1

    .line 110
    :cond_5
    const-string v0, "stop"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 111
    invoke-direct {p0}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->c()V

    .line 116
    :cond_6
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 46
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 48
    iput-object p0, p0, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->c:Landroid/content/Context;

    .line 51
    iget-object v0, p0, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->c:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_user_agree"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 52
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "agree="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    iget-object v0, p0, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v5

    .line 54
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginit_isLogined"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v5}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_2

    .line 56
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    .line 57
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 58
    invoke-virtual {p0, v6}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->startActivity(Landroid/content/Intent;)V

    .line 60
    :cond_1
    goto :goto_0

    .line 61
    :cond_2
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/cwc;->c(Landroid/content/Context;)Lo/cwc;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->setAdapter(Lo/eab;)V

    .line 62
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 64
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->c(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    goto :goto_0

    .line 65
    :catch_0
    move-exception v6

    .line 66
    const-string v0, "Track_HWHealthSoundActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/soundaction/HWHealthSoundActionActivity;->finish()V

    .line 70
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 231
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 232
    return-void
.end method

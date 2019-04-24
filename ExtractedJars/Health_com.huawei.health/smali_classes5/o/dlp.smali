.class public Lo/dlp;
.super Lo/dlv;
.source "SourceFile"


# instance fields
.field private a:Lo/dln;

.field private c:Lcom/huawei/cloudservice/CloudAccount;

.field private d:Ljava/util/concurrent/ExecutorService;

.field private e:Landroid/content/Context;

.field private g:Lcom/huawei/hwid/core/datatype/UserInfo;

.field private i:Lcom/huawei/hihealth/HiUserInfo;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 57
    invoke-direct {p0, p1}, Lo/dlv;-><init>(Landroid/content/Context;)V

    .line 58
    iput-object p1, p0, Lo/dlp;->e:Landroid/content/Context;

    .line 59
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dlp;->d:Ljava/util/concurrent/ExecutorService;

    .line 60
    iget-object v0, p0, Lo/dlp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iput-object v0, p0, Lo/dlp;->a:Lo/dln;

    .line 61
    return-void
.end method

.method static synthetic a(Lo/dlp;Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 0

    .line 38
    iput-object p1, p0, Lo/dlp;->i:Lcom/huawei/hihealth/HiUserInfo;

    return-object p1
.end method

.method static synthetic a(Lo/dlp;)Lcom/huawei/hwid/core/datatype/UserInfo;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/dlp;->g:Lcom/huawei/hwid/core/datatype/UserInfo;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 204
    iget-object v0, p0, Lo/dlp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dlp$2;

    invoke-direct {v1, p0}, Lo/dlp$2;-><init>(Lo/dlp;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 239
    return-void
.end method

.method static synthetic b(Lo/dlp;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/dlp;->i:Lcom/huawei/hihealth/HiUserInfo;

    return-object v0
.end method

.method static synthetic b(Lo/dlp;Lcom/huawei/hwid/core/datatype/UserInfo;)Lcom/huawei/hwid/core/datatype/UserInfo;
    .locals 0

    .line 38
    iput-object p1, p0, Lo/dlp;->g:Lcom/huawei/hwid/core/datatype/UserInfo;

    return-object p1
.end method

.method static synthetic c(Lo/dlp;)Lo/dln;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/dlp;->a:Lo/dln;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 170
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAccountInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    iput-object v0, p0, Lo/dlp;->c:Lcom/huawei/cloudservice/CloudAccount;

    .line 172
    iget-object v0, p0, Lo/dlp;->c:Lcom/huawei/cloudservice/CloudAccount;

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lo/dlp;->c:Lcom/huawei/cloudservice/CloudAccount;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const-string v2, "1000"

    new-instance v3, Lo/dlp$5;

    invoke-direct {v3, p0}, Lo/dlp$5;-><init>(Lo/dlp;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/cloudservice/CloudAccount;->getUserInfo(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    goto :goto_0

    .line 196
    :cond_0
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "account null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/dlp;)Landroid/content/Context;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/dlp;->e:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 5

    .line 134
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAbnormalInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    iget-object v0, p0, Lo/dlp;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlp$4;

    invoke-direct {v1, p0}, Lo/dlp$4;-><init>(Lo/dlp;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 162
    iget-object v0, p0, Lo/dlp;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onboarding_skip_current_time"

    .line 163
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 162
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 164
    return-void
.end method

.method public c()V
    .locals 0

    .line 125
    invoke-direct {p0}, Lo/dlp;->d()V

    .line 127
    invoke-direct {p0}, Lo/dlp;->a()V

    .line 128
    return-void
.end method

.method public e()V
    .locals 13

    .line 65
    invoke-super {p0}, Lo/dlv;->e()V

    .line 68
    iget-object v0, p0, Lo/dlp;->e:Landroid/content/Context;

    const/16 v1, 0x2725

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "abnoral_information"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 70
    const-string v0, "ai-exception-001"

    const/16 v1, 0x7534

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v5

    .line 73
    iget-object v0, p0, Lo/dlp;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onboarding_skip"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 75
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNoLongerRecommend = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, ", enable = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", isSetOnBoarding = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v5, :cond_0

    const-string v0, "1"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 78
    :cond_0
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AbnormalSmarter no recommend delete"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    iget-object v0, p0, Lo/dlp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    const v1, 0xea60

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    .line 80
    return-void

    .line 83
    :cond_1
    const-wide/16 v7, 0x0

    .line 84
    iget-object v0, p0, Lo/dlp;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onboarding_skip_current_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 85
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 87
    :try_start_0
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v7, v0

    .line 90
    goto :goto_0

    .line 88
    :catch_0
    move-exception v10

    .line 89
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    :cond_2
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-nez v0, :cond_3

    .line 94
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no onboading skipTime == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-void

    .line 99
    :cond_3
    const-string v0, "ai-exception-001"

    const-string v1, "after_num_date_generate_exception_prompt"

    const/16 v2, 0x7534

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 100
    const/4 v11, 0x7

    .line 101
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 103
    :try_start_1
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    move v11, v0

    .line 106
    goto :goto_1

    .line 104
    :catch_1
    move-exception v12

    .line 105
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    :cond_4
    :goto_1
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "day = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    const-string v2, " skipDay = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v7

    long-to-float v0, v0

    const v1, 0x4ca4cb80    # 8.64E7f

    div-float v12, v0, v1

    .line 112
    int-to-float v0, v11

    cmpl-float v0, v12, v0

    if-lez v0, :cond_5

    .line 113
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkInfoAbnormal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    invoke-virtual {p0}, Lo/dlp;->c()V

    goto :goto_2

    .line 116
    :cond_5
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "less seven"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    :goto_2
    return-void
.end method

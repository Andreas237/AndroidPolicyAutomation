.class public Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "HWCrowdApi"

.field private static final lockObject:Ljava/lang/Object;

.field private static mInstance:Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;->lockObject:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method

.method public static getmInstance()Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;
    .locals 4

    .line 32
    sget-object v2, Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;->lockObject:Ljava/lang/Object;

    monitor-enter v2

    .line 33
    :try_start_0
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;->mInstance:Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 34
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;

    invoke-direct {v0}, Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;-><init>()V

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;->mInstance:Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;

    .line 36
    :cond_0
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;->mInstance:Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 37
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public gotoFeedBack(Landroid/content/Context;Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;Lo/dcd;)V
    .locals 10

    .line 41
    new-instance v4, Lo/dby;

    invoke-direct {v4}, Lo/dby;-><init>()V

    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dby;->c(Ljava/lang/String;)V

    .line 43
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSiteId()I

    move-result v5

    .line 44
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dby;->f(Ljava/lang/String;)V

    .line 45
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v6

    .line 46
    invoke-virtual {v4, v6}, Lo/dby;->d(Ljava/lang/String;)V

    .line 47
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 48
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    const-string v7, "000000000000000"

    .line 51
    :cond_0
    invoke-virtual {v4, v7}, Lo/dby;->a(Ljava/lang/String;)V

    .line 52
    const/4 v8, 0x0

    .line 54
    :try_start_0
    invoke-static {p1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getDeviceType()Ljava/lang/String;

    move-result-object v9

    .line 55
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    .line 56
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v8, v0

    .line 60
    :cond_1
    goto :goto_0

    .line 58
    :catch_0
    move-exception v9

    .line 59
    const-string v0, "HWCrowdApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exception:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    :goto_0
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dby;->e(Ljava/lang/Integer;)V

    .line 62
    invoke-static {p1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getAccountName()Ljava/lang/String;

    move-result-object v9

    .line 63
    invoke-virtual {v4, v9}, Lo/dby;->e(Ljava/lang/String;)V

    .line 64
    const-string v0, "Android"

    invoke-virtual {v4, v0}, Lo/dby;->b(Ljava/lang/String;)V

    .line 65
    const v0, 0x280de80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dby;->a(Ljava/lang/Integer;)V

    .line 66
    const-string v0, "HWCrowdApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "siteID:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " sToken :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " deviceId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v3, v7}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " deviceType: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " accountName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    invoke-static {}, Lo/dce;->c()Lo/dce;

    move-result-object v0

    invoke-virtual {v0, p1, v4, p2, p3}, Lo/dce;->e(Landroid/content/Context;Lo/dby;Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;Lo/dcd;)V

    .line 68
    return-void
.end method

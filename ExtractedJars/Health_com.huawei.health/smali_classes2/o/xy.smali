.class public Lo/xy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:[Ljava/lang/String;

.field private static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 58
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_PHONE_STATE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lo/xy;->a:[Ljava/lang/String;

    .line 66
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/xy;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 6

    .line 94
    sget-object v4, Lo/xy;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 95
    const-string v0, "PSocial_Utils"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter refreshToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 99
    invoke-static {}, Lo/xw;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lo/xy$3;

    invoke-direct {v1}, Lo/xy$3;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 107
    :goto_0
    return-void
.end method

.method public static b()Z
    .locals 1

    .line 149
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    return v0
.end method

.method public static c(Landroid/content/Context;F)I
    .locals 3

    .line 89
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 90
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 145
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getDeviceType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Lo/xv;
    .locals 15

    .line 110
    sget-object v6, Lo/xy;->b:Ljava/lang/Object;

    monitor-enter v6

    .line 111
    :try_start_0
    new-instance v7, Lo/xv;

    invoke-direct {v7}, Lo/xv;-><init>()V

    .line 112
    invoke-static {p0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v8

    .line 114
    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    .line 116
    invoke-virtual {v8}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v9, ""

    goto :goto_0

    :cond_0
    invoke-virtual {v8}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v9

    .line 117
    :goto_0
    invoke-virtual {v8}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    const-string v10, ""

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v10

    .line 118
    :goto_1
    invoke-virtual {v8}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    const-string v11, ""

    goto :goto_2

    :cond_2
    invoke-virtual {v8}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v11

    .line 119
    :goto_2
    invoke-virtual {v8}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v12

    .line 120
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v13

    .line 121
    move-object v0, v7

    move-object v1, v9

    move-object v2, v10

    move-object v3, v11

    move v4, v12

    move-object v5, v13

    invoke-virtual/range {v0 .. v5}, Lo/xv;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    :cond_3
    monitor-exit v6

    return-object v7

    .line 125
    :catchall_0
    move-exception v14

    monitor-exit v6

    throw v14
.end method

.method public static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 141
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

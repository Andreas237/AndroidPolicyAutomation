.class public final Lcom/huawei/phoneserviceuni/common/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "SIMUtils"

.field private static final c:Ljava/lang/Object;

.field private static d:Lcom/huawei/phoneserviceuni/common/a/b; = null


# instance fields
.field private b:Lcom/huawei/phoneserviceuni/common/a/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/b;->c:Ljava/lang/Object;

    .line 27
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/b;->d:Lcom/huawei/phoneserviceuni/common/a/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-direct {p0}, Lcom/huawei/phoneserviceuni/common/a/b;->c()V

    .line 32
    return-void
.end method

.method public static a()Lcom/huawei/phoneserviceuni/common/a/b;
    .locals 4

    .line 35
    sget-object v2, Lcom/huawei/phoneserviceuni/common/a/b;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 36
    :try_start_0
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/b;->d:Lcom/huawei/phoneserviceuni/common/a/b;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 37
    new-instance v0, Lcom/huawei/phoneserviceuni/common/a/b;

    invoke-direct {v0}, Lcom/huawei/phoneserviceuni/common/a/b;-><init>()V

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/b;->d:Lcom/huawei/phoneserviceuni/common/a/b;

    .line 39
    :cond_0
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/b;->d:Lcom/huawei/phoneserviceuni/common/a/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 40
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private c()V
    .locals 3

    .line 55
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/phoneserviceuni/common/a/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    const-string v0, "SIMUtils"

    const-string v1, "init SIMUtils choose MTK mutil"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    new-instance v0, Lcom/huawei/phoneserviceuni/common/a/a/b;

    invoke-direct {v0}, Lcom/huawei/phoneserviceuni/common/a/a/b;-><init>()V

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/a/b;->b:Lcom/huawei/phoneserviceuni/common/a/a/a;

    goto :goto_0

    .line 58
    :cond_0
    invoke-direct {p0}, Lcom/huawei/phoneserviceuni/common/a/b;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 59
    const-string v0, "SIMUtils"

    const-string v1, "init SIMUtils choose HW mutil"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    new-instance v0, Lcom/huawei/phoneserviceuni/common/a/a/d;

    invoke-direct {v0}, Lcom/huawei/phoneserviceuni/common/a/a/d;-><init>()V

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/a/b;->b:Lcom/huawei/phoneserviceuni/common/a/a/a;

    goto :goto_0

    .line 62
    :cond_1
    const-string v0, "SIMUtils"

    const-string v1, "init SIMUtils choose single"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    new-instance v0, Lcom/huawei/phoneserviceuni/common/a/a/e;

    invoke-direct {v0}, Lcom/huawei/phoneserviceuni/common/a/a/e;-><init>()V

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/a/b;->b:Lcom/huawei/phoneserviceuni/common/a/a/a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    .line 71
    :goto_0
    goto :goto_1

    .line 65
    :catch_0
    move-exception v2

    .line 67
    const-string v0, "SIMUtils"

    const-string v1, "createSim Exception "

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    goto :goto_1

    .line 68
    :catch_1
    move-exception v2

    .line 70
    const-string v0, "SIMUtils"

    const-string v1, "createSim Error error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    :goto_1
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/a/b;->b:Lcom/huawei/phoneserviceuni/common/a/a/a;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 75
    const-string v0, "SIMUtils"

    const-string v1, "Fail to create sim, so init singleSIM"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    new-instance v0, Lcom/huawei/phoneserviceuni/common/a/a/e;

    invoke-direct {v0}, Lcom/huawei/phoneserviceuni/common/a/a/e;-><init>()V

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/a/b;->b:Lcom/huawei/phoneserviceuni/common/a/a/a;

    .line 78
    :cond_2
    return-void
.end method

.method private d()Z
    .locals 4

    .line 87
    const-string v0, "com.mediatek.common.featureoption.FeatureOption"

    const-string v1, "MTK_GEMINI_SUPPORT"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    .line 89
    return v3
.end method

.method private e()Z
    .locals 7

    .line 99
    const/4 v5, 0x0

    .line 101
    const-string v0, "android.telephony.MSimTelephonyManager"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 102
    invoke-direct {p0}, Lcom/huawei/phoneserviceuni/common/a/b;->f()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "isMultiSimEnabled"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 101
    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 105
    goto :goto_0

    .line 103
    :catch_0
    move-exception v6

    .line 104
    const-string v0, "SIMUtils"

    const-string v1, "isHwGeminiSupport ClassNotFoundException wrong "

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    :goto_0
    return v5
.end method

.method private f()Ljava/lang/Object;
    .locals 5

    .line 111
    const-string v0, "android.telephony.MSimTelephonyManager"

    const-string v1, "getDefault"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 113
    return-object v4
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/a/b;->b:Lcom/huawei/phoneserviceuni/common/a/a/a;

    invoke-interface {v0, p1}, Lcom/huawei/phoneserviceuni/common/a/a/a;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 45
    return-object v1
.end method

.method public b()Lcom/huawei/phoneserviceuni/common/a/a/c;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/a/b;->b:Lcom/huawei/phoneserviceuni/common/a/a/a;

    invoke-interface {v0}, Lcom/huawei/phoneserviceuni/common/a/a/a;->a()Lcom/huawei/phoneserviceuni/common/a/a/c;

    move-result-object v0

    return-object v0
.end method

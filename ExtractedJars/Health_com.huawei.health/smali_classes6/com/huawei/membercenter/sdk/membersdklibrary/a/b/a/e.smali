.class public final Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;


# instance fields
.field private a:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    invoke-direct {p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->c()V

    .line 16
    return-void
.end method

.method public static declared-synchronized a()Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;
    .locals 4

    const-class v2, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;

    monitor-enter v2

    .line 19
    :try_start_0
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 20
    new-instance v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;

    invoke-direct {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;-><init>()V

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;

    .line 22
    :cond_0
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private c()V
    .locals 4

    .line 37
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    const-string v0, "SIMUtils"

    const-string v1, "init SIMUtils choose MTK mutil"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    new-instance v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/b;

    invoke-direct {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/b;-><init>()V

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->a:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/a;

    goto :goto_0

    .line 40
    :cond_0
    invoke-direct {p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 41
    const-string v0, "SIMUtils"

    const-string v1, "init SIMUtils choose HW mutil"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    new-instance v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/d;

    invoke-direct {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/d;-><init>()V

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->a:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/a;

    goto :goto_0

    .line 44
    :cond_1
    const-string v0, "SIMUtils"

    const-string v1, "init SIMUtils choose single"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    new-instance v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/f;

    invoke-direct {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/f;-><init>()V

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->a:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    .line 53
    :goto_0
    goto :goto_1

    .line 47
    :catch_0
    move-exception v3

    .line 49
    const-string v0, "SIMUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createSim Exception "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    goto :goto_1

    .line 50
    :catch_1
    move-exception v3

    .line 52
    const-string v0, "SIMUtils"

    const-string v1, "Error error"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    :goto_1
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->a:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/a;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 57
    const-string v0, "SIMUtils"

    const-string v1, "Fail to create sim, so init singleSIM"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    new-instance v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/f;

    invoke-direct {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/f;-><init>()V

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->a:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/a;

    .line 60
    :cond_2
    return-void
.end method

.method private d()Z
    .locals 4

    .line 69
    const-string v0, "com.mediatek.common.featureoption.FeatureOption"

    const-string v1, "MTK_GEMINI_SUPPORT"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    .line 71
    return v3
.end method

.method private e()Z
    .locals 7

    .line 81
    const/4 v5, 0x0

    .line 83
    const-string v0, "android.telephony.MSimTelephonyManager"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 84
    invoke-direct {p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->f()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "isMultiSimEnabled"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 83
    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 87
    goto :goto_0

    .line 85
    :catch_0
    move-exception v6

    .line 86
    const-string v0, "SIMUtils"

    const-string v1, "isHwGeminiSupport ClassNotFoundException wrong "

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    :goto_0
    return v5
.end method

.method private f()Ljava/lang/Object;
    .locals 5

    .line 92
    const-string v0, "android.telephony.MSimTelephonyManager"

    const-string v1, "getDefault"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 94
    return-object v4
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->a:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/a;

    invoke-interface {v0, p1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/a;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 27
    return-object v1
.end method

.method public b()Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->a:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/a;

    invoke-interface {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/a;->a()Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    move-result-object v0

    return-object v0
.end method

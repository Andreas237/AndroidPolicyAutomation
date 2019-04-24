.class public Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/a;


# instance fields
.field private a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/d;->a:Ljava/lang/Object;

    .line 28
    invoke-direct {p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/d;->b()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/d;->a:Ljava/lang/Object;

    .line 30
    return-void
.end method

.method private b()Ljava/lang/Object;
    .locals 5

    .line 38
    const-string v0, "android.telephony.MSimTelephonyManager"

    const-string v1, "getDefault"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 40
    return-object v4
.end method


# virtual methods
.method public a()Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;
    .locals 1

    .line 34
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;->a:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    return-object v0
.end method

.method public a(I)Ljava/lang/String;
    .locals 9

    .line 69
    const-string v7, ""

    .line 71
    const-string v0, "android.telephony.MSimTelephonyManager"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/d;->a:Ljava/lang/Object;

    const-string v2, "getDeviceId"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    .line 72
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 71
    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v7, v0

    .line 75
    goto :goto_0

    .line 73
    :catch_0
    move-exception v8

    .line 74
    const-string v0, "NormalMutilSim"

    const-string v1, "imei ClassNotFoundException exception:"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    :goto_0
    if-nez v7, :cond_0

    .line 77
    const-string v7, ""

    .line 79
    :cond_0
    return-object v7
.end method

.class public Lcom/huawei/phoneserviceuni/common/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/phoneserviceuni/common/a/a/a;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    const-class v0, Lcom/huawei/phoneserviceuni/common/a/a/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a/b;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    invoke-direct {p0}, Lcom/huawei/phoneserviceuni/common/a/a/b;->b()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/a/a/b;->b:Ljava/lang/Object;

    .line 22
    return-void
.end method

.method private b()Ljava/lang/Object;
    .locals 5

    .line 45
    const-string v0, "com.mediatek.telephony.TelephonyManagerEx"

    const-string v1, "getDefault"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 47
    return-object v4
.end method


# virtual methods
.method public a()Lcom/huawei/phoneserviceuni/common/a/a/c;
    .locals 1

    .line 41
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a/c;->b:Lcom/huawei/phoneserviceuni/common/a/a/c;

    return-object v0
.end method

.method public a(I)Ljava/lang/String;
    .locals 9

    .line 26
    const-string v7, ""

    .line 28
    const-string v0, "com.mediatek.telephony.TelephonyManagerEx"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/phoneserviceuni/common/a/a/b;->b:Ljava/lang/Object;

    const-string v2, "getDeviceId"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 28
    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v7, v0

    .line 32
    goto :goto_0

    .line 30
    :catch_0
    move-exception v8

    .line 31
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a/b;->a:Ljava/lang/String;

    const-string v1, "imei ClassNotFoundException exception:"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    :goto_0
    if-nez v7, :cond_0

    .line 34
    const-string v7, ""

    .line 36
    :cond_0
    return-object v7
.end method

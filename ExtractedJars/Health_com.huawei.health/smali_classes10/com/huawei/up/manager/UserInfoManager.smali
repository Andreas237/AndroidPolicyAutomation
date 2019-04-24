.class public Lcom/huawei/up/manager/UserInfoManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "UserInfoManager"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/up/manager/UserInfoManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 30
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/up/manager/UserInfoManager;->getAuthorization(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getAuthorization(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 43
    const/16 v2, 0x3e8

    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Digest user="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",nonce="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",response="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 47
    invoke-static {v4, p2}, Lcom/huawei/up/utils/HMACSHA256;->getHmacSha256(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 48
    return-object v5
.end method


# virtual methods
.method public getUserInfo(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 9

    .line 71
    :try_start_0
    new-instance v0, Lcom/huawei/up/manager/UserInfoManager$1;

    move-object v1, p0

    move-object v2, p3

    move-object v3, p2

    move-object v4, p1

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/huawei/up/manager/UserInfoManager$1;-><init>(Lcom/huawei/up/manager/UserInfoManager;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V

    invoke-virtual {p0, p1, p3, v0}, Lcom/huawei/up/manager/UserInfoManager;->serviceTokenAuth(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    goto :goto_0

    .line 121
    :catch_0
    move-exception v8

    .line 122
    const/4 v0, 0x0

    if-eq v0, p6, :cond_0

    .line 123
    const/4 v0, -0x1

    invoke-interface {p6, v0}, Lcom/huawei/up/callback/CommonCallback;->onFail(I)V

    .line 126
    :cond_0
    :goto_0
    return-void
.end method

.method public serviceTokenAuth(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 53
    new-instance v0, Lcom/huawei/up/request/ServiceTokenAuthRequest;

    move-object v1, p1

    move-object v2, p2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "0"

    invoke-static {p1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/login/ui/login/LoginInit;->getDeviceId()Ljava/lang/String;

    move-result-object v5

    const-string v6, "42000000"

    invoke-direct/range {v0 .. v6}, Lcom/huawei/up/request/ServiceTokenAuthRequest;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v0

    .line 54
    invoke-virtual {v7}, Lcom/huawei/up/request/ServiceTokenAuthRequest;->packageRequest()Ljava/util/HashMap;

    move-result-object v8

    .line 55
    invoke-virtual {v7, v8}, Lcom/huawei/up/request/ServiceTokenAuthRequest;->execute(Ljava/util/HashMap;)Lorg/apache/http/HttpResponse;

    move-result-object v9

    .line 56
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    .line 57
    invoke-virtual {v7, v9}, Lcom/huawei/up/request/ServiceTokenAuthRequest;->unPackageRequest(Lorg/apache/http/HttpResponse;)Landroid/os/Bundle;

    move-result-object v10

    .line 58
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 59
    invoke-interface {p3, v10}, Lcom/huawei/up/callback/CommonCallback;->onSuccess(Landroid/os/Bundle;)V

    .line 61
    :cond_0
    goto :goto_0

    .line 62
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p3, :cond_2

    .line 63
    const/4 v0, -0x1

    invoke-interface {p3, v0}, Lcom/huawei/up/callback/CommonCallback;->onFail(I)V

    .line 67
    :cond_2
    :goto_0
    return-void
.end method

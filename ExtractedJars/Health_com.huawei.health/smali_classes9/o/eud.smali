.class public Lo/eud;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eud$a;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Lo/euh;

.field private d:Ljava/lang/String;

.field private e:Lcom/tencent/tauth/Tencent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const-class v0, Lo/eud;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/eud;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lo/euh;)V
    .locals 7

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eud;->b:Lo/euh;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eud;->d:Ljava/lang/String;

    .line 46
    if-nez p1, :cond_0

    .line 47
    return-void

    .line 49
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    .line 50
    iput-object p1, p0, Lo/eud;->a:Landroid/app/Activity;

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    const/4 v1, 0x1

    invoke-static {v4, v1}, Lo/eun;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "022RL4gJS02pvrGH3v8zmCHQRmUtBdKBIkHdaVP/g8B"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 51
    invoke-static {v4, v0}, Lo/eun;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eud;->d:Ljava/lang/String;

    .line 53
    iget-object v0, p0, Lo/eud;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 54
    const-string v6, ""

    .line 55
    const-string v0, "com.huawei.health"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    iget-object v6, p0, Lo/eud;->d:Ljava/lang/String;

    goto :goto_0

    .line 58
    :cond_1
    const-string v6, "209207"

    .line 61
    :goto_0
    sget-object v0, Lo/eud;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "QQ() context="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", callback="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    iput-object p2, p0, Lo/eud;->b:Lo/euh;

    .line 64
    invoke-static {v6, p1}, Lcom/tencent/tauth/Tencent;->createInstance(Ljava/lang/String;Landroid/content/Context;)Lcom/tencent/tauth/Tencent;

    move-result-object v0

    iput-object v0, p0, Lo/eud;->e:Lcom/tencent/tauth/Tencent;

    .line 66
    iget-object v0, p0, Lo/eud;->e:Lcom/tencent/tauth/Tencent;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 68
    iget-object v0, p0, Lo/eud;->b:Lo/euh;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/euh;->a(Z)V

    goto :goto_1

    .line 72
    :cond_2
    iget-object v0, p0, Lo/eud;->b:Lo/euh;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/euh;->a(Z)V

    .line 74
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/eud;)Lo/euh;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/eud;->b:Lo/euh;

    return-object v0
.end method

.method static synthetic c(Lo/eud;)Landroid/app/Activity;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/eud;->a:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic c()Ljava/lang/String;
    .locals 1

    .line 24
    sget-object v0, Lo/eud;->c:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 182
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 183
    new-instance v5, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 184
    new-instance v6, Lcom/tencent/connect/auth/QQToken;

    invoke-direct {v6, p2}, Lcom/tencent/connect/auth/QQToken;-><init>(Ljava/lang/String;)V

    .line 185
    iget-object v0, p0, Lo/eud;->d:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lcom/tencent/connect/auth/QQToken;->setAppId(Ljava/lang/String;)V

    .line 186
    invoke-virtual {v6, p3}, Lcom/tencent/connect/auth/QQToken;->setOpenId(Ljava/lang/String;)V

    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, p2, v0}, Lcom/tencent/connect/auth/QQToken;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    new-instance v7, Lcom/tencent/connect/UserInfo;

    invoke-direct {v7, p1, v6}, Lcom/tencent/connect/UserInfo;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V

    .line 189
    new-instance v0, Lo/eud$4;

    invoke-direct {v0, p0, v5, v4}, Lo/eud$4;-><init>(Lo/eud;Ljava/util/concurrent/CountDownLatch;Ljava/lang/StringBuffer;)V

    invoke-virtual {v7, v0}, Lcom/tencent/connect/UserInfo;->getUserInfo(Lcom/tencent/tauth/IUiListener;)V

    .line 233
    :try_start_0
    invoke-virtual {v5}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 238
    goto :goto_0

    .line 235
    :catch_0
    move-exception v8

    .line 237
    sget-object v0, Lo/eud;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onComplete latch.await();"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    :goto_0
    move-object v8, p4

    .line 241
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 243
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v8

    .line 246
    :cond_0
    return-object v8
.end method

.method public e()V
    .locals 4

    .line 81
    new-instance v3, Lo/eud$a;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, Lo/eud$a;-><init>(Lo/eud;Lo/eud$4;)V

    .line 82
    iget-object v0, p0, Lo/eud;->e:Lcom/tencent/tauth/Tencent;

    iget-object v1, p0, Lo/eud;->a:Landroid/app/Activity;

    const-string v2, "all"

    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/tauth/Tencent;->login(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I

    .line 86
    return-void
.end method

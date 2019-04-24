.class public Lo/fhl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fhl$a;
    }
.end annotation


# instance fields
.field private c:Landroid/app/Activity;

.field private d:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lo/fhl;->c:Landroid/app/Activity;

    .line 35
    return-void
.end method

.method static synthetic c(Lo/fhl;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lo/fhl;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 63
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 64
    const/16 v0, 0x76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    const/16 v0, 0x2719

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->getCountryCode(Lo/dcx;)Ljava/lang/String;

    move-result-object v9

    .line 68
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v10

    .line 69
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v11

    .line 70
    new-instance v12, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;

    invoke-direct {v12}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;-><init>()V

    .line 71
    move-object v0, v12

    move-object v1, p1

    move-object v2, p2

    move-object v4, v8

    move-object v5, v9

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, "_"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lo/fhl$5;

    invoke-direct {v7, p0}, Lo/fhl$5;-><init>(Lo/fhl;)V

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->signHttpReq(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lo/czi;)Ljava/lang/String;

    .line 82
    return-void
.end method


# virtual methods
.method public b(Landroid/content/Context;)V
    .locals 3

    .line 37
    new-instance v2, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    iget-object v0, p0, Lo/fhl;->c:Landroid/app/Activity;

    invoke-direct {v2, v0}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;-><init>(Landroid/app/Activity;)V

    .line 38
    new-instance v0, Lo/fhl$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1, p0}, Lo/fhl$a;-><init>(Lo/fhl;Landroid/os/Looper;Lo/fhl;)V

    iput-object v0, p0, Lo/fhl;->d:Landroid/os/Handler;

    .line 39
    iget-object v0, p0, Lo/fhl;->d:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->initHandler(Landroid/os/Handler;)V

    .line 40
    new-instance v0, Lo/fhl$1;

    invoke-direct {v0, p0, v2, p1}, Lo/fhl$1;-><init>(Lo/fhl;Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;Landroid/content/Context;)V

    new-instance v1, Lo/fhl$2;

    invoke-direct {v1, p0}, Lo/fhl$2;-><init>(Lo/fhl;)V

    invoke-virtual {v2, p1, v0, v1}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->hmsConnect(Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;)V

    .line 60
    return-void
.end method

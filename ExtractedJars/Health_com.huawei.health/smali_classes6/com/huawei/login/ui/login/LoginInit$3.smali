.class Lcom/huawei/login/ui/login/LoginInit$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/login/ui/login/LoginInit;->clearToken()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/login/ui/login/LoginInit;


# direct methods
.method constructor <init>(Lcom/huawei/login/ui/login/LoginInit;)V
    .locals 0

    .line 484
    iput-object p1, p0, Lcom/huawei/login/ui/login/LoginInit$3;->this$0:Lcom/huawei/login/ui/login/LoginInit;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 487
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setAccessToken(Ljava/lang/String;Lo/dcx;)V

    .line 488
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setSeverToken(Ljava/lang/String;Lo/dcx;)V

    .line 489
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setIsLogined(Z)V

    .line 491
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/LoginCache;->configServerToken(Ljava/lang/String;)V

    .line 492
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/LoginCache;->configAccessToken(Ljava/lang/String;)V

    .line 493
    return-void
.end method

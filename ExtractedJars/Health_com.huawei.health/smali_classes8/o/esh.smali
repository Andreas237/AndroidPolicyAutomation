.class public Lo/esh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

.field private c:Landroid/content/SharedPreferences;

.field private d:Ljava/lang/String;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/esh;->e:Landroid/content/Context;

    .line 29
    const-string v0, "Service_Card"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lo/esh;->c:Landroid/content/SharedPreferences;

    .line 30
    iget-object v0, p0, Lo/esh;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/esh;->d:Ljava/lang/String;

    .line 31
    iget-object v0, p0, Lo/esh;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    iput-object v0, p0, Lo/esh;->a:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    .line 32
    return-void
.end method

.method private b(I)V
    .locals 3

    .line 63
    iget-object v0, p0, Lo/esh;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Beta_Upgrade_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 64
    return-void
.end method

.method private d(I)Z
    .locals 3

    .line 59
    iget-object v0, p0, Lo/esh;->c:Landroid/content/SharedPreferences;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Beta_Upgrade_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public d()V
    .locals 4

    .line 54
    const-string v0, "UIHLH_ServiceInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshServiceFW start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    iget-object v0, p0, Lo/esh;->a:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    iget-object v1, p0, Lo/esh;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->initOpenServiceDB(Ljava/lang/String;)I

    .line 56
    return-void
.end method

.method public e()V
    .locals 5

    .line 35
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    iget-object v0, p0, Lo/esh;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->e(Landroid/content/Context;)I

    move-result v4

    .line 38
    invoke-direct {p0, v4}, Lo/esh;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    const-string v0, "UIHLH_ServiceInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initService, new Beta Version! refresh DB, version is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    iget-object v0, p0, Lo/esh;->a:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    iget-object v1, p0, Lo/esh;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->initOpenServiceDB(Ljava/lang/String;)I

    .line 41
    invoke-direct {p0, v4}, Lo/esh;->b(I)V

    .line 43
    :cond_0
    goto :goto_0

    .line 45
    :cond_1
    iget-object v0, p0, Lo/esh;->a:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    iget-object v1, p0, Lo/esh;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->initHomePageService(Ljava/lang/String;)V

    .line 47
    :goto_0
    iget-object v0, p0, Lo/esh;->a:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryAllService()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->isEmpty(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 48
    const-string v0, "UIHLH_ServiceInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initService, if no service exist refresh service"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    iget-object v0, p0, Lo/esh;->a:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    iget-object v1, p0, Lo/esh;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->initOpenServiceDB(Ljava/lang/String;)I

    .line 51
    :cond_2
    return-void
.end method

.class Lcom/huawei/multisimservice/MultiSimService$1;
.super Lo/dsu$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/multisimservice/MultiSimService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/multisimservice/MultiSimService;


# direct methods
.method constructor <init>(Lcom/huawei/multisimservice/MultiSimService;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/multisimservice/MultiSimService$1;->d:Lcom/huawei/multisimservice/MultiSimService;

    invoke-direct {p0}, Lo/dsu$d;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/String;)Landroid/os/IBinder;
    .locals 4

    .line 78
    const-string v0, "MultiSimService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceBinder input packageName is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 81
    :cond_0
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceBinder input para error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    const/4 v0, 0x0

    return-object v0

    .line 84
    :cond_1
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$1;->d:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v0}, Lcom/huawei/multisimservice/MultiSimService;->d(Lcom/huawei/multisimservice/MultiSimService;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$1;->d:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v0}, Lcom/huawei/multisimservice/MultiSimService;->d(Lcom/huawei/multisimservice/MultiSimService;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 85
    const-string v0, "MultiSimService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Service already bind with"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/multisimservice/MultiSimService$1;->d:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v2}, Lcom/huawei/multisimservice/MultiSimService;->d(Lcom/huawei/multisimservice/MultiSimService;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    const/4 v0, 0x0

    return-object v0

    .line 89
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/cwo;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 90
    const-string v0, "MultiSimService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AuthUtils failure with"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    const/4 v0, 0x0

    return-object v0

    .line 94
    :cond_3
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$1;->d:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v0, p1}, Lcom/huawei/multisimservice/MultiSimService;->c(Lcom/huawei/multisimservice/MultiSimService;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    invoke-static {}, Lo/div;->c()Lo/div;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/multisimservice/MultiSimService$1;->d:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v1}, Lcom/huawei/multisimservice/MultiSimService;->d(Lcom/huawei/multisimservice/MultiSimService;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/div;->e(Ljava/lang/String;)V

    .line 97
    const-string v0, "com.huawei.hwmultisim"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 98
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceBinder return mAttachedDeviceBinder"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$1;->d:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v0}, Lcom/huawei/multisimservice/MultiSimService;->e(Lcom/huawei/multisimservice/MultiSimService;)Lo/dsr$c;

    move-result-object v0

    return-object v0

    .line 101
    :cond_4
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceBinder return mIOpenMultiSimBinder"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$1;->d:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v0}, Lcom/huawei/multisimservice/MultiSimService;->c(Lcom/huawei/multisimservice/MultiSimService;)Lo/dst$d;

    move-result-object v0

    return-object v0
.end method

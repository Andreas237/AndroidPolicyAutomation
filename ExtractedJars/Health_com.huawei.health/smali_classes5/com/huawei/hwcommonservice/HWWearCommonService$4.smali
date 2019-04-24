.class Lcom/huawei/hwcommonservice/HWWearCommonService$4;
.super Lo/dbx$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwcommonservice/HWWearCommonService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/hwcommonservice/HWWearCommonService;


# direct methods
.method constructor <init>(Lcom/huawei/hwcommonservice/HWWearCommonService;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$4;->e:Lcom/huawei/hwcommonservice/HWWearCommonService;

    invoke-direct {p0}, Lo/dbx$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Landroid/os/IBinder;
    .locals 4

    .line 79
    const-string v0, "HWWearCommonService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceBinder input packageName is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    :cond_0
    const-string v0, "HWWearCommonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceBinder input para error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    const/4 v0, 0x0

    return-object v0

    .line 86
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/cwo;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 87
    const-string v0, "HWWearCommonService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AuthUtils failure with"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    const/4 v0, 0x0

    return-object v0

    .line 91
    .line 97
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

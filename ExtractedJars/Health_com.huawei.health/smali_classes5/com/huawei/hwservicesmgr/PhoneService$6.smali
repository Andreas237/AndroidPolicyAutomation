.class Lcom/huawei/hwservicesmgr/PhoneService$6;
.super Lo/dbx$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/PhoneService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwservicesmgr/PhoneService;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/PhoneService;)V
    .locals 0

    .line 946
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/PhoneService$6;->b:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {p0}, Lo/dbx$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Landroid/os/IBinder;
    .locals 11

    .line 949
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceBinder input packageName is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 950
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 951
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v5

    .line 953
    invoke-virtual {v4, v5}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v6

    .line 954
    if-eqz v6, :cond_1

    .line 955
    move-object v7, v6

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_1

    aget-object v10, v7, v9

    .line 957
    const-string v0, "com.huawei.health"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 958
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter verifyPackageNameByUid true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 959
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$6;->b:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->a(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/djz$d;

    move-result-object v0

    return-object v0

    .line 955
    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 963
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

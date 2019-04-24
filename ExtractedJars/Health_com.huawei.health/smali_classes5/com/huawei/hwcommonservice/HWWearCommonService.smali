.class public Lcom/huawei/hwcommonservice/HWWearCommonService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private final c:Lo/dbv$a;

.field private final d:Lo/dbx$a;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 54
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 76
    new-instance v0, Lcom/huawei/hwcommonservice/HWWearCommonService$4;

    invoke-direct {v0, p0}, Lcom/huawei/hwcommonservice/HWWearCommonService$4;-><init>(Lcom/huawei/hwcommonservice/HWWearCommonService;)V

    iput-object v0, p0, Lcom/huawei/hwcommonservice/HWWearCommonService;->d:Lo/dbx$a;

    .line 102
    new-instance v0, Lcom/huawei/hwcommonservice/HWWearCommonService$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwcommonservice/HWWearCommonService$1;-><init>(Lcom/huawei/hwcommonservice/HWWearCommonService;)V

    iput-object v0, p0, Lcom/huawei/hwcommonservice/HWWearCommonService;->c:Lo/dbv$a;

    .line 55
    const-string v0, "HWWearCommonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWWearCommonService construct"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4

    .line 60
    const-string v0, "HWWearCommonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBind service "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    iget-object v0, p0, Lcom/huawei/hwcommonservice/HWWearCommonService;->d:Lo/dbx$a;

    return-object v0
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 1

    .line 67
    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result v0

    .line 68
    return v0
.end method

.class public Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService;
.super Landroid/app/Service;


# static fields
.field private static final TAG:Ljava/lang/String; = "ConnectionSdkService"


# instance fields
.field mBinder:Lcom/huawei/hwCloudJs/a/a$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService$1;-><init>(Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService;)V

    iput-object v0, p0, Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService;->mBinder:Lcom/huawei/hwCloudJs/a/a$a;

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    const-string v0, "ConnectionSdkService"

    const-string v1, "onBind"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService;->mBinder:Lcom/huawei/hwCloudJs/a/a$a;

    return-object v0
.end method

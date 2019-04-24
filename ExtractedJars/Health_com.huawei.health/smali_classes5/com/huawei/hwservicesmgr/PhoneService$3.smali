.class Lcom/huawei/hwservicesmgr/PhoneService$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/PhoneService;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/hwservicesmgr/PhoneService;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/PhoneService;)V
    .locals 0

    .line 422
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/PhoneService$3;->d:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 4

    .line 436
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSDK exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 425
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSDK Success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$3;->d:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->b(Lcom/huawei/hwservicesmgr/PhoneService;)V

    .line 427
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .line 431
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSDK failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    return-void
.end method

.class Lo/dkw$e$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dkw$e;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dkw$e;


# direct methods
.method constructor <init>(Lo/dkw$e;)V
    .locals 0

    .line 2215
    iput-object p1, p0, Lo/dkw$e$2;->e:Lo/dkw$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 2218
    iget-object v0, p0, Lo/dkw$e$2;->e:Lo/dkw$e;

    iget-object v0, v0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 2219
    iget-object v0, p0, Lo/dkw$e$2;->e:Lo/dkw$e;

    iget-object v0, v0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "30s timeout"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2220
    return-void
.end method

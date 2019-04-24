.class Lo/dkw$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dkw;->a(Ljava/lang/String;IILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dkw;


# direct methods
.method constructor <init>(Lo/dkw;)V
    .locals 0

    .line 832
    iput-object p1, p0, Lo/dkw$6;->c:Lo/dkw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 835
    iget-object v0, p0, Lo/dkw$6;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 836
    iget-object v0, p0, Lo/dkw$6;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dkw$6;->c:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->d(Lo/dkw;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x19643

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 837
    return-void
.end method

.class Lo/dkw$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dkw;->e(Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dkw;


# direct methods
.method constructor <init>(Lo/dkw;)V
    .locals 0

    .line 1374
    iput-object p1, p0, Lo/dkw$4;->d:Lo/dkw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 1377
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PeriodRRIFileUtil save2File onResponse."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1378
    iget-object v0, p0, Lo/dkw$4;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1379
    return-void
.end method

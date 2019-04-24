.class Lo/dlh$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlh;->b(Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dlh;


# direct methods
.method constructor <init>(Lo/dlh;)V
    .locals 0

    .line 526
    iput-object p1, p0, Lo/dlh$5;->b:Lo/dlh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 530
    iget-object v0, p0, Lo/dlh$5;->b:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 531
    return-void
.end method

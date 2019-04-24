.class Lo/dlh$1;
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
.field final synthetic a:Lo/dlh;


# direct methods
.method constructor <init>(Lo/dlh;)V
    .locals 0

    .line 536
    iput-object p1, p0, Lo/dlh$1;->a:Lo/dlh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 1

    .line 540
    iget-object v0, p0, Lo/dlh$1;->a:Lo/dlh;

    invoke-virtual {v0}, Lo/dlh;->b()V

    .line 541
    return-void
.end method

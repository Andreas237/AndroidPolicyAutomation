.class Lo/dkw$5;
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
.field final synthetic e:Lo/dkw;


# direct methods
.method constructor <init>(Lo/dkw;)V
    .locals 0

    .line 1389
    iput-object p1, p0, Lo/dkw$5;->e:Lo/dkw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 1

    .line 1393
    iget-object v0, p0, Lo/dkw$5;->e:Lo/dkw;

    invoke-virtual {v0}, Lo/dkw;->b()V

    .line 1394
    return-void
.end method

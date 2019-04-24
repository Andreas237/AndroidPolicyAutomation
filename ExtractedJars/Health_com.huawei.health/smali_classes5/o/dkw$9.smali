.class Lo/dkw$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dkw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dkw;


# direct methods
.method constructor <init>(Lo/dkw;)V
    .locals 0

    .line 1829
    iput-object p1, p0, Lo/dkw$9;->a:Lo/dkw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 1832
    move-object v0, p2

    check-cast v0, [B

    move-object v4, v0

    check-cast v4, [B

    .line 1833
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    array-length v0, v4

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 1834
    :cond_0
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse(), error data, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1835
    return-void

    .line 1839
    :cond_1
    const/4 v0, 0x1

    aget-byte v5, v4, v0

    .line 1841
    const/16 v0, 0xb

    if-ne v0, v5, :cond_2

    .line 1842
    iget-object v0, p0, Lo/dkw$9;->a:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->i(Lo/dkw;)Z

    move-result v0

    .line 1846
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f53\u524d\u53ef\u7ef4\u53ef\u6d4b\u72b6\u6001\u7e41\u5fd9\u6216\u8005\u4e0d\u652f\u6301\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1847
    return-void

    .line 1851
    :cond_2
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dkq;->c(Z)V

    .line 1852
    const/4 v0, 0x1

    if-eq v0, v5, :cond_3

    const/4 v0, 0x2

    if-eq v0, v5, :cond_3

    const/4 v0, 0x3

    if-eq v0, v5, :cond_3

    const/4 v0, 0x4

    if-eq v0, v5, :cond_3

    const/4 v0, 0x5

    if-eq v0, v5, :cond_3

    const/4 v0, 0x6

    if-ne v0, v5, :cond_4

    .line 1858
    :cond_3
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dkq;->a(I)V

    .line 1863
    :cond_4
    iget-object v0, p0, Lo/dkw$9;->a:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1864
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 1865
    iput v5, v6, Landroid/os/Message;->what:I

    .line 1866
    iput-object v4, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1867
    iget-object v0, p0, Lo/dkw$9;->a:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1869
    :cond_5
    return-void
.end method

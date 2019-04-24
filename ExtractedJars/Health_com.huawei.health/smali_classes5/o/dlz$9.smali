.class Lo/dlz$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lo/dlz;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dlz;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 708
    iput-object p1, p0, Lo/dlz$9;->d:Lo/dlz;

    iput-object p2, p0, Lo/dlz$9;->c:Ljava/util/List;

    iput-object p3, p0, Lo/dlz$9;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 711
    if-nez p1, :cond_0

    .line 713
    iget-object v0, p0, Lo/dlz$9;->d:Lo/dlz;

    invoke-static {v0}, Lo/dlz;->d(Lo/dlz;)Lo/dly;

    move-result-object v0

    const-string v1, "show_device"

    iget-object v2, p0, Lo/dlz$9;->c:Ljava/util/List;

    iget-object v3, p0, Lo/dlz$9;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, p2, v2, v3}, Lo/dly;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 715
    :cond_0
    iget-object v0, p0, Lo/dlz$9;->d:Lo/dlz;

    new-instance v1, Lo/dlz$9$5;

    invoke-direct {v1, p0}, Lo/dlz$9$5;-><init>(Lo/dlz$9;)V

    invoke-virtual {v0, v1}, Lo/dlz;->e(Lo/egg;)V

    .line 726
    :goto_0
    return-void
.end method

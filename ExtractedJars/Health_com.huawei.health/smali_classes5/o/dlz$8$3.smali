.class Lo/dlz$8$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz$8;->c(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dlz$8;


# direct methods
.method constructor <init>(Lo/dlz$8;)V
    .locals 0

    .line 735
    iput-object p1, p0, Lo/dlz$8$3;->b:Lo/dlz$8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 738
    if-nez p1, :cond_0

    .line 739
    iget-object v0, p0, Lo/dlz$8$3;->b:Lo/dlz$8;

    iget-object v0, v0, Lo/dlz$8;->a:Lo/dlz;

    invoke-static {v0}, Lo/dlz;->d(Lo/dlz;)Lo/dly;

    move-result-object v0

    const-string v1, "show_device"

    iget-object v2, p0, Lo/dlz$8$3;->b:Lo/dlz$8;

    iget-object v2, v2, Lo/dlz$8;->e:Ljava/util/List;

    iget-object v3, p0, Lo/dlz$8$3;->b:Lo/dlz$8;

    iget-object v3, v3, Lo/dlz$8;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, p2, v2, v3}, Lo/dly;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 741
    :cond_0
    iget-object v0, p0, Lo/dlz$8$3;->b:Lo/dlz$8;

    iget-object v0, v0, Lo/dlz$8;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 743
    :goto_0
    return-void
.end method

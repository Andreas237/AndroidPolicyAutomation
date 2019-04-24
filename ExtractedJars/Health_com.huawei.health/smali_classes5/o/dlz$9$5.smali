.class Lo/dlz$9$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz$9;->c(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dlz$9;


# direct methods
.method constructor <init>(Lo/dlz$9;)V
    .locals 0

    .line 715
    iput-object p1, p0, Lo/dlz$9$5;->c:Lo/dlz$9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 718
    if-nez p1, :cond_0

    .line 719
    iget-object v0, p0, Lo/dlz$9$5;->c:Lo/dlz$9;

    iget-object v0, v0, Lo/dlz$9;->d:Lo/dlz;

    invoke-static {v0}, Lo/dlz;->d(Lo/dlz;)Lo/dly;

    move-result-object v0

    const-string v1, "show_service"

    iget-object v2, p0, Lo/dlz$9$5;->c:Lo/dlz$9;

    iget-object v2, v2, Lo/dlz$9;->c:Ljava/util/List;

    iget-object v3, p0, Lo/dlz$9$5;->c:Lo/dlz$9;

    iget-object v3, v3, Lo/dlz$9;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, p2, v2, v3}, Lo/dly;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 721
    :cond_0
    iget-object v0, p0, Lo/dlz$9$5;->c:Lo/dlz$9;

    iget-object v0, v0, Lo/dlz$9;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 723
    :goto_0
    return-void
.end method

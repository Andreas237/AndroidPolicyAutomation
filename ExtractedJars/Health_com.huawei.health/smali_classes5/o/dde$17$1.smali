.class Lo/dde$17$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dde$17;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dde$17;


# direct methods
.method constructor <init>(Lo/dde$17;)V
    .locals 0

    .line 3057
    iput-object p1, p0, Lo/dde$17$1;->a:Lo/dde$17;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 3060
    move-object v2, p2

    check-cast v2, Ljava/util/List;

    .line 3061
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 3062
    new-instance v3, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    invoke-direct {v3}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;-><init>()V

    .line 3063
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3064
    iget-object v0, p0, Lo/dde$17$1;->a:Lo/dde$17;

    iget-object v0, v0, Lo/dde$17;->c:Lo/dde;

    iget-object v1, p0, Lo/dde$17$1;->a:Lo/dde$17;

    iget-object v1, v1, Lo/dde$17;->c:Lo/dde;

    invoke-static {v1}, Lo/dde;->b(Lo/dde;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lo/dde;->d(Lo/dde;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3066
    :cond_0
    return-void
.end method

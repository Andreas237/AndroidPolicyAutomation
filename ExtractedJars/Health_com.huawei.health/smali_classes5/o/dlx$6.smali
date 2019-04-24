.class Lo/dlx$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlx;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dlx;

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/dlx;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 354
    iput-object p1, p0, Lo/dlx$6;->c:Lo/dlx;

    iput-object p2, p0, Lo/dlx$6;->e:Ljava/util/List;

    iput-object p3, p0, Lo/dlx$6;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 357
    if-nez p1, :cond_0

    .line 358
    iget-object v0, p0, Lo/dlx$6;->c:Lo/dlx;

    const-string v1, "show_device"

    iget-object v2, p0, Lo/dlx$6;->e:Ljava/util/List;

    iget-object v3, p0, Lo/dlx$6;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, p2, v2, v3}, Lo/dlx;->b(Lo/dlx;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 360
    :cond_0
    iget-object v0, p0, Lo/dlx$6;->c:Lo/dlx;

    new-instance v1, Lo/dlx$6$5;

    invoke-direct {v1, p0}, Lo/dlx$6$5;-><init>(Lo/dlx$6;)V

    invoke-static {v0, v1}, Lo/dlx;->b(Lo/dlx;Lo/egg;)V

    .line 369
    :goto_0
    return-void
.end method

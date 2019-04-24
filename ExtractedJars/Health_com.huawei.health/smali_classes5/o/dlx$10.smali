.class Lo/dlx$10;
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
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/dlx;


# direct methods
.method constructor <init>(Lo/dlx;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 372
    iput-object p1, p0, Lo/dlx$10;->d:Lo/dlx;

    iput-object p2, p0, Lo/dlx$10;->b:Ljava/util/List;

    iput-object p3, p0, Lo/dlx$10;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 375
    if-nez p1, :cond_0

    .line 376
    iget-object v0, p0, Lo/dlx$10;->d:Lo/dlx;

    const-string v1, "show_service"

    iget-object v2, p0, Lo/dlx$10;->b:Ljava/util/List;

    iget-object v3, p0, Lo/dlx$10;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, p2, v2, v3}, Lo/dlx;->b(Lo/dlx;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 378
    :cond_0
    iget-object v0, p0, Lo/dlx$10;->d:Lo/dlx;

    new-instance v1, Lo/dlx$10$1;

    invoke-direct {v1, p0}, Lo/dlx$10$1;-><init>(Lo/dlx$10;)V

    invoke-static {v0, v1}, Lo/dlx;->d(Lo/dlx;Lo/egg;)V

    .line 388
    :goto_0
    return-void
.end method

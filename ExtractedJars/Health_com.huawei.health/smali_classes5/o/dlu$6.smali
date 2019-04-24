.class Lo/dlu$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlu;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dlu;

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/dlu;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 421
    iput-object p1, p0, Lo/dlu$6;->a:Lo/dlu;

    iput-object p2, p0, Lo/dlu$6;->e:Ljava/util/List;

    iput-object p3, p0, Lo/dlu$6;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 424
    if-nez p1, :cond_0

    .line 425
    iget-object v0, p0, Lo/dlu$6;->a:Lo/dlu;

    const-string v1, "show_device"

    iget-object v2, p0, Lo/dlu$6;->e:Ljava/util/List;

    iget-object v3, p0, Lo/dlu$6;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, p2, v2, v3}, Lo/dlu;->b(Lo/dlu;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 427
    :cond_0
    iget-object v0, p0, Lo/dlu$6;->a:Lo/dlu;

    new-instance v1, Lo/dlu$6$2;

    invoke-direct {v1, p0}, Lo/dlu$6$2;-><init>(Lo/dlu$6;)V

    invoke-virtual {v0, v1}, Lo/dlu;->b(Lo/egg;)V

    .line 436
    :goto_0
    return-void
.end method

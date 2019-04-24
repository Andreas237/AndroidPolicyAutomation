.class Lo/dlu$8;
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
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:Lo/dlu;


# direct methods
.method constructor <init>(Lo/dlu;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 439
    iput-object p1, p0, Lo/dlu$8;->e:Lo/dlu;

    iput-object p2, p0, Lo/dlu$8;->d:Ljava/util/List;

    iput-object p3, p0, Lo/dlu$8;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 442
    if-nez p1, :cond_0

    .line 443
    iget-object v0, p0, Lo/dlu$8;->e:Lo/dlu;

    const-string v1, "show_service"

    iget-object v2, p0, Lo/dlu$8;->d:Ljava/util/List;

    iget-object v3, p0, Lo/dlu$8;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, p2, v2, v3}, Lo/dlu;->b(Lo/dlu;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 445
    :cond_0
    iget-object v0, p0, Lo/dlu$8;->e:Lo/dlu;

    new-instance v1, Lo/dlu$8$2;

    invoke-direct {v1, p0}, Lo/dlu$8$2;-><init>(Lo/dlu$8;)V

    invoke-static {v0, v1}, Lo/dlu;->d(Lo/dlu;Lo/egg;)V

    .line 455
    :goto_0
    return-void
.end method

.class Lo/dlz$8;
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
.field final synthetic a:Lo/dlz;

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/dlz;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 729
    iput-object p1, p0, Lo/dlz$8;->a:Lo/dlz;

    iput-object p2, p0, Lo/dlz$8;->e:Ljava/util/List;

    iput-object p3, p0, Lo/dlz$8;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 732
    if-nez p1, :cond_0

    .line 733
    iget-object v0, p0, Lo/dlz$8;->a:Lo/dlz;

    invoke-static {v0}, Lo/dlz;->d(Lo/dlz;)Lo/dly;

    move-result-object v0

    const-string v1, "show_service"

    iget-object v2, p0, Lo/dlz$8;->e:Ljava/util/List;

    iget-object v3, p0, Lo/dlz$8;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, p2, v2, v3}, Lo/dly;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 735
    :cond_0
    iget-object v0, p0, Lo/dlz$8;->a:Lo/dlz;

    new-instance v1, Lo/dlz$8$3;

    invoke-direct {v1, p0}, Lo/dlz$8$3;-><init>(Lo/dlz$8;)V

    invoke-virtual {v0, v1}, Lo/dlz;->b(Lo/egg;)V

    .line 747
    :goto_0
    return-void
.end method

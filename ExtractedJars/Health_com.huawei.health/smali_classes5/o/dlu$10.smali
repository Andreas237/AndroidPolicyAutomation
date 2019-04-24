.class Lo/dlu$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlu;->b(Landroid/content/Context;ILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dlu;

.field final synthetic c:Lo/egg;


# direct methods
.method constructor <init>(Lo/dlu;Lo/egg;)V
    .locals 0

    .line 382
    iput-object p1, p0, Lo/dlu$10;->b:Lo/dlu;

    iput-object p2, p0, Lo/dlu$10;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 385
    move-object v3, p2

    check-cast v3, Ljava/util/List;

    .line 386
    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 387
    :cond_0
    iget-object v0, p0, Lo/dlu$10;->c:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_0

    .line 389
    :cond_1
    iget-object v0, p0, Lo/dlu$10;->c:Lo/egg;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 391
    :goto_0
    return-void
.end method

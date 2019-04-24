.class Lo/bxc$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxc;->c(Lo/bxc$a;Lcom/huawei/health/suggestion/model/Plan;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lo/bxc;

.field final synthetic e:Lcom/huawei/health/suggestion/model/Plan;


# direct methods
.method constructor <init>(Lo/bxc;Ljava/util/List;Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lo/bxc$10;->c:Lo/bxc;

    iput-object p2, p0, Lo/bxc$10;->b:Ljava/util/List;

    iput-object p3, p0, Lo/bxc$10;->e:Lcom/huawei/health/suggestion/model/Plan;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 193
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->i()V

    .line 194
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    iget-object v1, p0, Lo/bxc$10;->b:Ljava/util/List;

    iget-object v2, p0, Lo/bxc$10;->e:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/brt;->a(Ljava/util/List;Ljava/lang/String;)V

    .line 196
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 197
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    const-string v0, "type"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    sget-object v0, Lo/dae;->bm:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 201
    iget-object v0, p0, Lo/bxc$10;->c:Lo/bxc;

    invoke-virtual {v0}, Lo/bxc;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 202
    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 203
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    sget-object v0, Lo/dae;->ds:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 206
    :cond_0
    return-void
.end method

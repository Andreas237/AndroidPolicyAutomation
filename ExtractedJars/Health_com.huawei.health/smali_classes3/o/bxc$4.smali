.class Lo/bxc$4;
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
.field final synthetic b:Lo/bxc;


# direct methods
.method constructor <init>(Lo/bxc;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lo/bxc$4;->b:Lo/bxc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 128
    invoke-virtual {p1}, Landroid/view/View;->hasWindowFocus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    const-string v0, "Suggestion_MyPlanInfoAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "on click return because window not has focus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    return-void

    .line 133
    :cond_0
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Lo/brt;->e([I)V

    .line 134
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 135
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    const-string v0, "type"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    sget-object v0, Lo/dae;->bl:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 139
    iget-object v0, p0, Lo/bxc$4;->b:Lo/bxc;

    invoke-virtual {v0}, Lo/bxc;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 140
    invoke-interface {v4}, Ljava/util/Map;->clear()V

    .line 141
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    sget-object v0, Lo/dae;->dr:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 144
    :cond_1
    return-void

    :array_0
    .array-data 4
        0x1
    .end array-data
.end method

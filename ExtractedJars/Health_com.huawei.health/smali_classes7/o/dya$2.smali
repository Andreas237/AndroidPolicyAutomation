.class Lo/dya$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dya;->b(Lo/dya$e;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic c:Lo/dya;


# direct methods
.method constructor <init>(Lo/dya;Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lo/dya$2;->c:Lo/dya;

    iput-object p2, p0, Lo/dya$2;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 104
    if-ltz p3, :cond_0

    iget-object v0, p0, Lo/dya$2;->c:Lo/dya;

    invoke-static {v0}, Lo/dya;->b(Lo/dya;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lo/dya$2;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p3, v0, :cond_1

    .line 105
    :cond_0
    const-string v0, "PLGACHIEVE_MyMedalRecyclerViewAdapter"

    const-string v1, "IndexOutOfBoundsException"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    return-void

    .line 108
    :cond_1
    iget-object v0, p0, Lo/dya$2;->c:Lo/dya;

    invoke-static {v0}, Lo/dya;->b(Lo/dya;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lo/dya$2;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dvz;

    .line 109
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 110
    iget-object v0, p0, Lo/dya$2;->c:Lo/dya;

    invoke-static {v0}, Lo/dya;->d(Lo/dya;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.pluginachievement.ui.AchieveMedalDetailActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 111
    invoke-virtual {v4}, Lo/dvz;->a()Ljava/lang/String;

    move-result-object v6

    .line 112
    new-instance v7, Lo/dvu;

    invoke-direct {v7}, Lo/dvu;-><init>()V

    .line 113
    invoke-virtual {v7, v6}, Lo/dvu;->b(Ljava/lang/String;)V

    .line 114
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/dvu;->c(I)V

    .line 115
    const-string v0, "medal_res_id"

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 116
    invoke-virtual {v4}, Lo/dvz;->d()I

    move-result v0

    if-lez v0, :cond_2

    .line 117
    const-string v0, "medal_des_id"

    invoke-virtual {v4}, Lo/dvz;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 119
    :cond_2
    const-string v0, "medal_des_id"

    invoke-virtual {v4}, Lo/dvz;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 121
    :goto_0
    const-string v0, "medal_content_id"

    invoke-virtual {v4}, Lo/dvz;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 122
    const-string v0, "medal_type_level"

    invoke-virtual {v4}, Lo/dvz;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 123
    const-string v0, "medal_gain_time"

    invoke-virtual {v4}, Lo/dvz;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    const-string v0, "click_x"

    iget-object v1, p0, Lo/dya$2;->c:Lo/dya;

    invoke-static {v1}, Lo/dya;->c(Lo/dya;)F

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;F)Landroid/content/Intent;

    .line 125
    const-string v0, "click_y"

    iget-object v1, p0, Lo/dya$2;->c:Lo/dya;

    invoke-static {v1}, Lo/dya;->e(Lo/dya;)F

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;F)Landroid/content/Intent;

    .line 126
    const-string v0, "medal_type"

    iget-object v1, p0, Lo/dya$2;->a:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 127
    invoke-virtual {v4}, Lo/dvz;->d()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_3

    .line 128
    const-string v0, "medal_obtain_id"

    const-string v1, "true"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    .line 130
    :cond_3
    const-string v0, "medal_obtain_id"

    const-string v1, "false"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 132
    :goto_1
    const-string v0, "promotion_name"

    invoke-virtual {v4}, Lo/dvz;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 133
    const-string v0, "promotion_url"

    invoke-virtual {v4}, Lo/dvz;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 134
    iget-object v0, p0, Lo/dya$2;->c:Lo/dya;

    invoke-static {v0}, Lo/dya;->d(Lo/dya;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 135
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 136
    const-string v0, "cilck"

    const-string v1, "1"

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_4

    .line 138
    const-string v0, "name"

    invoke-virtual {v4}, Lo/dvz;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    const-string v0, "className"

    iget-object v1, p0, Lo/dya$2;->a:Ljava/lang/String;

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    const-string v0, "type"

    invoke-virtual {v4}, Lo/dvz;->m()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    const-string v0, "label"

    invoke-virtual {v4}, Lo/dvz;->n()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    :cond_4
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->V:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v8, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 145
    invoke-virtual {v4}, Lo/dvz;->h()I

    move-result v0

    if-lez v0, :cond_6

    .line 146
    sget v0, Lcom/huawei/pluginachievement/R$id;->gridview_medal_jincheng:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    .line 147
    const-string v0, ""

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    const/4 v0, 0x4

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 150
    iget-object v0, p0, Lo/dya$2;->c:Lo/dya;

    invoke-static {v0}, Lo/dya;->a(Lo/dya;)Lo/dyq;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 151
    iget-object v0, p0, Lo/dya$2;->c:Lo/dya;

    invoke-static {v0}, Lo/dya;->a(Lo/dya;)Lo/dyq;

    move-result-object v0

    invoke-interface {v0, v6}, Lo/dyq;->e(Ljava/lang/String;)V

    .line 155
    :cond_5
    iget-object v0, p0, Lo/dya$2;->c:Lo/dya;

    invoke-static {v0}, Lo/dya;->d(Lo/dya;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/dwr;->d(Lo/dvf;)Z

    .line 158
    :cond_6
    return-void
.end method

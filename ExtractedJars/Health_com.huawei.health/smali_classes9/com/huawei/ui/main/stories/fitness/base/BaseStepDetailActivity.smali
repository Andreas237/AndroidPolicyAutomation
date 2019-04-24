.class public abstract Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/ui/commonui/base/BaseActivity;"
    }
.end annotation


# instance fields
.field protected c:Lo/eyk;

.field protected d:Lo/emr;

.field protected f:Lo/eyl;

.field protected g:Lo/eyd;

.field protected h:Lo/faa;

.field protected i:I

.field protected k:Lo/eih$e;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->i:I

    .line 220
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$5;-><init>(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->k:Lo/eih$e;

    return-void
.end method

.method private a(I)Z
    .locals 1

    .line 131
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_stepmodule_detail_layout:I

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private g()V
    .locals 3

    .line 117
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->d:Lo/emr;

    .line 118
    sget v0, Lcom/huawei/ui/main/R$id;->classified_button_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eyl;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->f:Lo/eyl;

    .line 119
    sget v0, Lcom/huawei/ui/main/R$id;->classified_view_place:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/faa;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->h:Lo/faa;

    .line 120
    new-instance v0, Lo/eyk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->f:Lo/eyl;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->h:Lo/faa;

    invoke-direct {v0, p0, v1, v2}, Lo/eyk;-><init>(Landroid/content/Context;Lo/eyl;Lo/faa;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->c:Lo/eyk;

    .line 121
    return-void
.end method


# virtual methods
.method protected abstract a()Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;
.end method

.method protected a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 4

    .line 298
    new-instance v2, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$4;

    invoke-direct {v2, p0, p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$4;-><init>(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;Landroid/app/Activity;Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)V

    .line 305
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->i()Lo/ehy;

    move-result-object v0

    sget-object v1, Lo/eif;->e:Lo/eif;

    invoke-static {v0, v1}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v3

    .line 306
    invoke-virtual {v2, v3}, Lo/ezs;->setStepDatatype(Lo/eic;)V

    .line 307
    return-object v2
.end method

.method protected a(Landroid/content/Intent;)V
    .locals 0

    .line 107
    return-void
.end method

.method protected a(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Lo/eih$e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lo/ezh;>(TT;Ljava/lang/String;Ljava/lang/String;Lo/eih$e;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .line 169
    new-instance v0, Lo/ezk;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/ezk;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;Lo/eih$e;)V

    move-object v6, v0

    .line 171
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->n()Lo/eyd;

    move-result-object v0

    invoke-virtual {v0}, Lo/eyd;->b()Lo/eyv;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/ezk;->setCustomCalculator(Lo/eyv;)V

    .line 173
    new-instance v7, Lo/eze;

    invoke-direct {v7, p0, p1, p5, p6}, Lo/eze;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->n()Lo/eyd;

    move-result-object v0

    invoke-virtual {v0}, Lo/eyd;->c()Lo/eyv;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/eze;->setCustomCalculator(Lo/eyv;)V

    .line 177
    new-instance v8, Lo/eyt;

    invoke-direct {v8, p0, p1}, Lo/eyt;-><init>(Landroid/content/Context;Lo/ezh;)V

    .line 178
    invoke-virtual {v8, v6, v7}, Lo/eyt;->a(Lo/ezj;Lo/ezj;)V

    .line 181
    invoke-virtual {p1, v8}, Lo/ezh;->b(Lo/ezj;)V

    .line 182
    return-void
.end method

.method protected b(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 4

    .line 272
    new-instance v2, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$1;

    invoke-direct {v2, p0, p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$1;-><init>(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;Landroid/app/Activity;Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)V

    .line 279
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->i()Lo/ehy;

    move-result-object v0

    sget-object v1, Lo/eif;->a:Lo/eif;

    invoke-static {v0, v1}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v3

    .line 280
    invoke-virtual {v2, v3}, Lo/ezq;->setStepDatatype(Lo/eic;)V

    .line 281
    return-object v2
.end method

.method protected abstract b()V
.end method

.method protected b(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lo/ezh;>(TT;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .line 217
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->k:Lo/eih$e;

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->a(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Lo/eih$e;Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    return-void
.end method

.method protected c(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 4

    .line 286
    new-instance v2, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$2;

    invoke-direct {v2, p0, p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$2;-><init>(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;Landroid/app/Activity;Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)V

    .line 292
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->i()Lo/ehy;

    move-result-object v0

    sget-object v1, Lo/eif;->c:Lo/eif;

    invoke-static {v0, v1}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v3

    .line 293
    invoke-virtual {v2, v3}, Lo/eza;->setStepDatatype(Lo/eic;)V

    .line 294
    return-object v2
.end method

.method protected abstract c()V
.end method

.method protected d()V
    .locals 0

    .line 101
    return-void
.end method

.method protected abstract d(Lo/ejf;)V
.end method

.method protected d(Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lo/ezh;>(TT;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .line 202
    new-instance v0, Lo/ezk;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    iget-object v5, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->k:Lo/eih$e;

    invoke-direct/range {v0 .. v5}, Lo/ezk;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;Lo/eih$e;)V

    move-object v6, v0

    .line 204
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->n()Lo/eyd;

    move-result-object v0

    invoke-virtual {v0}, Lo/eyd;->b()Lo/eyv;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/ezk;->setCustomCalculator(Lo/eyv;)V

    .line 207
    new-instance v7, Lo/ezr;

    invoke-direct {v7, p0}, Lo/ezr;-><init>(Landroid/content/Context;)V

    .line 208
    invoke-virtual {v7, v6}, Lo/ezr;->c(Lo/ezj;)V

    .line 209
    invoke-virtual {p1, v7}, Lo/ezh;->b(Lo/ezj;)V

    .line 210
    return-void
.end method

.method protected e()Landroid/view/View;
    .locals 1

    .line 249
    const/4 v0, 0x0

    return-object v0
.end method

.method protected e(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 4

    .line 259
    new-instance v2, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$3;

    invoke-direct {v2, p0, p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$3;-><init>(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;Landroid/app/Activity;Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)V

    .line 266
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->i()Lo/ehy;

    move-result-object v0

    sget-object v1, Lo/eif;->b:Lo/eif;

    invoke-static {v0, v1}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v3

    .line 267
    invoke-virtual {v2, v3}, Lo/eyn;->setStepDatatype(Lo/eic;)V

    .line 268
    return-object v2
.end method

.method protected e(Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lo/ezh;>(TT;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .line 234
    new-instance v0, Lo/ezk;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    iget-object v5, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->k:Lo/eih$e;

    invoke-direct/range {v0 .. v5}, Lo/ezk;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;Lo/eih$e;)V

    move-object v6, v0

    .line 236
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->n()Lo/eyd;

    move-result-object v0

    invoke-virtual {v0}, Lo/eyd;->b()Lo/eyv;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/ezk;->setCustomCalculator(Lo/eyv;)V

    .line 238
    new-instance v7, Lo/evx;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->k:Lo/eih$e;

    invoke-direct {v7, p0, p1, v0}, Lo/evx;-><init>(Landroid/content/Context;Lo/ezh;Lo/eih$e;)V

    .line 239
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->n()Lo/eyd;

    move-result-object v0

    invoke-virtual {v0}, Lo/eyd;->b()Lo/eyv;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/evx;->setCustomCalculator(Lo/eyv;)V

    .line 241
    new-instance v8, Lo/eyt;

    invoke-direct {v8, p0, p1}, Lo/eyt;-><init>(Landroid/content/Context;Lo/ezh;)V

    .line 242
    invoke-virtual {v8, v6, v7}, Lo/eyt;->a(Lo/ezj;Lo/ezj;)V

    .line 245
    invoke-virtual {p1, v8}, Lo/ezh;->b(Lo/ezj;)V

    .line 246
    return-void
.end method

.method protected f()V
    .locals 0

    .line 124
    return-void
.end method

.method protected h()I
    .locals 1

    .line 127
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_stepmodule_detail_layout:I

    return v0
.end method

.method public abstract i()Lo/ehy;
.end method

.method protected k()V
    .locals 0

    .line 104
    return-void
.end method

.method public l()Z
    .locals 1

    .line 110
    const/4 v0, 0x1

    return v0
.end method

.method protected m()V
    .locals 4

    .line 88
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 89
    if-eqz v2, :cond_0

    .line 90
    const-string v0, "sportPageIndex"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 91
    if-ltz v3, :cond_0

    const/4 v0, 0x3

    if-gt v3, v0, :cond_0

    .line 92
    iput v3, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->i:I

    .line 95
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->i:I

    if-eqz v0, :cond_1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->f:Lo/eyl;

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->i:I

    invoke-virtual {v0, v1}, Lo/eyl;->e(I)V

    .line 98
    :cond_1
    return-void
.end method

.method public n()Lo/eyd;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->g:Lo/eyd;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 64
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 65
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->h()I

    move-result v2

    .line 66
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->setContentView(I)V

    .line 67
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->a(Landroid/content/Intent;)V

    .line 68
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->e()Landroid/view/View;

    move-result-object v3

    .line 69
    invoke-direct {p0, v2}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v3, :cond_0

    .line 70
    sget v0, Lcom/huawei/ui/main/R$id;->extension:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 71
    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-virtual {v4, v3, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;II)V

    .line 76
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->f()V

    .line 77
    new-instance v0, Lo/eyd;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eyd;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->g:Lo/eyd;

    .line 78
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->g()V

    .line 79
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->b()V

    .line 80
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->k()V

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->g:Lo/eyd;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->d(Lo/ejf;)V

    .line 82
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->p()V

    .line 83
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->c()V

    .line 84
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->d()V

    .line 85
    return-void
.end method

.method protected p()V
    .locals 3

    .line 147
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 149
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->a()Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->e(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->a()Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->a()Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->c(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->a()Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->c:Lo/eyk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->g:Lo/eyd;

    invoke-virtual {v0, v2, v1}, Lo/eyk;->a(Ljava/util/List;Lo/ejf;)V

    .line 158
    return-void
.end method

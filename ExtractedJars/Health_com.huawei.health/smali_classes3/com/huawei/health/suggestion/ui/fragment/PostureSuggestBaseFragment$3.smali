.class Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$3;
.super Lo/buv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/buv<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;


# direct methods
.method varargs constructor <init>(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;Ljava/util/List;[I)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$3;->e:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    invoke-direct {p0, p2, p3}, Lo/buv;-><init>(Ljava/util/List;[I)V

    return-void
.end method


# virtual methods
.method public c(Lo/bvr;ILcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 10

    .line 132
    const-string v9, ""

    .line 135
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$3;->e:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$3;->e:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->m:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_grop_sec_rtl:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 137
    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v3

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 138
    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 136
    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$3;->e:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->m:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_grop_sec:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 141
    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 142
    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v3

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 140
    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 144
    :goto_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_iv_train_pic:I

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquirePicUrl()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {p1, v0, v1, v2}, Lo/bvr;->d(ILjava/lang/String;I)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->tv_train_title_adv:I

    .line 145
    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->tv_train_n_adv:I

    .line 146
    invoke-virtual {v0, v1, v9}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fitness_rec_gap:I

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_second_nogap:I

    .line 148
    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGap()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGap()I

    move-result v5

    int-to-double v5, v5

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 147
    invoke-static {v2, v3, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 149
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$3;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq p2, v0, :cond_1

    .line 150
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_train_seg_adv:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/bvr;->a(II)V

    .line 152
    :cond_1
    return-void
.end method

.method public synthetic e(Lo/bvr;ILjava/lang/Object;)V
    .locals 1

    .line 129
    move-object v0, p3

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$3;->c(Lo/bvr;ILcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    return-void
.end method

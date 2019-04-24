.class public Lo/cip;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private c:Lo/chk;

.field private d:Lo/chk;

.field private e:Landroid/view/View;

.field private f:Landroid/widget/TextView;

.field private g:Lo/chk;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/view/View;

.field private o:Landroid/view/View;

.field private p:Landroid/widget/TextView;

.field private r:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lo/cip;->a:Landroid/content/Context;

    .line 41
    iput p2, p0, Lo/cip;->b:I

    .line 42
    return-void
.end method

.method private b()Landroid/view/View;
    .locals 4

    .line 64
    iget-object v0, p0, Lo/cip;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_viewholder_train:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 65
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_sp_xg:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chk;

    iput-object v0, p0, Lo/cip;->c:Lo/chk;

    .line 66
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_sp_anaerobic_xg:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chk;

    iput-object v0, p0, Lo/cip;->d:Lo/chk;

    .line 67
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_sp_ox:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chk;

    iput-object v0, p0, Lo/cip;->g:Lo/chk;

    .line 68
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_ox_msg:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->i:Landroid/widget/TextView;

    .line 69
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_detail_ox:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->f:Landroid/widget/TextView;

    .line 70
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_detail_ox_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->k:Landroid/widget/TextView;

    .line 71
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_xg:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->h:Landroid/widget/TextView;

    .line 72
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_effectshow:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->l:Landroid/widget/TextView;

    .line 73
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_anaerobic_xg:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->m:Landroid/widget/TextView;

    .line 74
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_anaerobic_effectshow:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->p:Landroid/widget/TextView;

    .line 75
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_train_divider:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/cip;->o:Landroid/view/View;

    .line 76
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_aerobic_train_divider:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/cip;->n:Landroid/view/View;

    .line 77
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_train_divider_two:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/cip;->r:Landroid/view/View;

    .line 78
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_track_detail_xg_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cip;->e(Landroid/widget/TextView;I)V

    .line 79
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_track_detail_anaerobic_xg_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cip;->e(Landroid/widget/TextView;I)V

    .line 80
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_track_detail_ox_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cip;->e(Landroid/widget/TextView;I)V

    .line 81
    iget-object v0, p0, Lo/cip;->h:Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-direct {p0, v0, v1}, Lo/cip;->e(Landroid/widget/TextView;I)V

    .line 82
    iget-object v0, p0, Lo/cip;->l:Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cip;->e(Landroid/widget/TextView;I)V

    .line 83
    iget-object v0, p0, Lo/cip;->m:Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-direct {p0, v0, v1}, Lo/cip;->e(Landroid/widget/TextView;I)V

    .line 84
    iget-object v0, p0, Lo/cip;->p:Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cip;->e(Landroid/widget/TextView;I)V

    .line 85
    iget-object v0, p0, Lo/cip;->f:Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-direct {p0, v0, v1}, Lo/cip;->e(Landroid/widget/TextView;I)V

    .line 86
    iget-object v0, p0, Lo/cip;->k:Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cip;->e(Landroid/widget/TextView;I)V

    .line 87
    iget-object v0, p0, Lo/cip;->i:Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cip;->e(Landroid/widget/TextView;I)V

    .line 88
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->pluginmotiontrack_detail_title_train_textview:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-direct {p0, v0, v1}, Lo/cip;->e(Landroid/widget/TextView;I)V

    .line 89
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_ritire_duration_name:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cip;->e(Landroid/widget/TextView;I)V

    .line 90
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_ritire_duration:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-direct {p0, v0, v1}, Lo/cip;->e(Landroid/widget/TextView;I)V

    .line 94
    iget-object v0, p0, Lo/cip;->c:Lo/chk;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Lo/chk;->d(I)Lo/chk;

    .line 95
    iget-object v0, p0, Lo/cip;->d:Lo/chk;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Lo/chk;->d(I)Lo/chk;

    .line 96
    iget-object v0, p0, Lo/cip;->g:Lo/chk;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Lo/chk;->d(I)Lo/chk;

    .line 97
    iget-object v0, p0, Lo/cip;->o:Landroid/view/View;

    sget v1, Lo/cdw;->k:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 98
    iget-object v0, p0, Lo/cip;->n:Landroid/view/View;

    sget v1, Lo/cdw;->k:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 99
    iget-object v0, p0, Lo/cip;->r:Landroid/view/View;

    sget v1, Lo/cdw;->k:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 100
    return-object v3
.end method

.method private c(FZ)V
    .locals 8

    .line 163
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    .line 164
    iget-object v0, p0, Lo/cip;->h:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    const/4 v5, 0x6

    new-array v5, v5, [F

    fill-array-data v5, :array_0

    .line 167
    invoke-static {p1}, Lo/cgl;->e(F)F

    move-result v6

    .line 168
    iget-object v0, p0, Lo/cip;->a:Landroid/content/Context;

    invoke-static {v0, v6}, Lo/cgl;->e(Landroid/content/Context;F)Ljava/lang/String;

    move-result-object v7

    .line 169
    iget-object v0, p0, Lo/cip;->c:Lo/chk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chk;->a(I)Lo/chk;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/chk;->c(F)Lo/chk;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chk;->d(Z)Lo/chk;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/chk;->e([F)Lo/chk;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/chk;->c(Ljava/lang/String;)Lo/chk;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/chk;->a(Z)Lo/chk;

    .line 170
    goto :goto_0

    .line 171
    :cond_0
    iget-object v0, p0, Lo/cip;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_train_train:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 172
    iget-object v0, p0, Lo/cip;->o:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 174
    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x40000000    # 2.0f
        0x40400000    # 3.0f
        0x40800000    # 4.0f
        0x40a00000    # 5.0f
        0x40c00000    # 6.0f
    .end array-data
.end method

.method private c(IZ)V
    .locals 7

    .line 140
    if-lez p1, :cond_1

    .line 141
    invoke-static {}, Lo/cgm;->b()Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-static {v0}, Lo/cgl;->b(Lcom/huawei/up/model/UserInfomation;)[Ljava/lang/Integer;

    move-result-object v6

    .line 142
    iget-object v0, p0, Lo/cip;->g:Lo/chk;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Lo/chk;->c(F)Lo/chk;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chk;->a(I)Lo/chk;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chk;->d(Z)Lo/chk;

    move-result-object v0

    const/4 v1, 0x7

    new-array v1, v1, [I

    sget v2, Lo/cdw;->g:I

    const/4 v3, 0x0

    aput v2, v1, v3

    sget v2, Lo/cdw;->m:I

    const/4 v3, 0x1

    aput v2, v1, v3

    sget v2, Lo/cdw;->o:I

    const/4 v3, 0x2

    aput v2, v1, v3

    sget v2, Lo/cdw;->l:I

    const/4 v3, 0x3

    aput v2, v1, v3

    sget v2, Lo/cdw;->p:I

    const/4 v3, 0x4

    aput v2, v1, v3

    sget v2, Lo/cdw;->n:I

    const/4 v3, 0x5

    aput v2, v1, v3

    sget v2, Lo/cdw;->u:I

    const/4 v3, 0x6

    aput v2, v1, v3

    .line 143
    invoke-virtual {v0, v1}, Lo/chk;->c([I)Lo/chk;

    move-result-object v0

    .line 144
    invoke-virtual {v0, v6}, Lo/chk;->c([Ljava/lang/Integer;)Lo/chk;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/chk;->a(Z)Lo/chk;

    .line 145
    iget-object v0, p0, Lo/cip;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 146
    iget v0, p0, Lo/cip;->b:I

    const/16 v1, 0x65

    if-ne v0, v1, :cond_0

    .line 147
    iget-object v0, p0, Lo/cip;->f:Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 148
    iget-object v0, p0, Lo/cip;->k:Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 149
    iget-object v0, p0, Lo/cip;->f:Landroid/widget/TextView;

    int-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 151
    :cond_0
    iget-object v0, p0, Lo/cip;->f:Landroid/widget/TextView;

    sget v1, Lo/cdw;->s:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 152
    iget-object v0, p0, Lo/cip;->k:Landroid/widget/TextView;

    sget v1, Lo/cdw;->q:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 153
    iget-object v0, p0, Lo/cip;->f:Landroid/widget/TextView;

    int-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    :goto_0
    iget-object v0, p0, Lo/cip;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lo/cip;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_ox_level:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lo/cip;->a:Landroid/content/Context;

    invoke-static {v4, v6, p1}, Lo/cgl;->c(Landroid/content/Context;[Ljava/lang/Integer;I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    goto :goto_1

    .line 157
    :cond_1
    iget-object v0, p0, Lo/cip;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_train_vo2max:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 158
    iget-object v0, p0, Lo/cip;->r:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 160
    :goto_1
    return-void
.end method

.method private d(Ljava/lang/Integer;)V
    .locals 5

    .line 194
    iget-object v0, p0, Lo/cip;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    .line 195
    iget-object v0, p0, Lo/cip;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_recotime_hour_formart:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 196
    iget-object v0, p0, Lo/cip;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_ritire_duration:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    goto :goto_0

    .line 199
    :cond_0
    iget-object v0, p0, Lo/cip;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_ritire:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 201
    :goto_0
    return-void
.end method

.method private e()Landroid/view/View;
    .locals 4

    .line 104
    iget-object v0, p0, Lo/cip;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_viewholder_train:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 105
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_sp_xg:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chk;

    iput-object v0, p0, Lo/cip;->c:Lo/chk;

    .line 106
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_sp_anaerobic_xg:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chk;

    iput-object v0, p0, Lo/cip;->d:Lo/chk;

    .line 107
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_sp_ox:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chk;

    iput-object v0, p0, Lo/cip;->g:Lo/chk;

    .line 108
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_xg:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->h:Landroid/widget/TextView;

    .line 109
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_effectshow:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->l:Landroid/widget/TextView;

    .line 110
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_anaerobic_xg:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->m:Landroid/widget/TextView;

    .line 111
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_anaerobic_effectshow:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->p:Landroid/widget/TextView;

    .line 112
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_detail_ox:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->f:Landroid/widget/TextView;

    .line 113
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_detail_ox_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->k:Landroid/widget/TextView;

    .line 114
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_ox_msg:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cip;->i:Landroid/widget/TextView;

    .line 115
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_train_divider:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/cip;->o:Landroid/view/View;

    .line 116
    iget-object v0, p0, Lo/cip;->o:Landroid/view/View;

    sget v1, Lo/cdw;->t:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 117
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_aerobic_train_divider:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/cip;->n:Landroid/view/View;

    .line 118
    iget-object v0, p0, Lo/cip;->n:Landroid/view/View;

    sget v1, Lo/cdw;->t:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 119
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_train_divider_two:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/cip;->r:Landroid/view/View;

    .line 120
    iget-object v0, p0, Lo/cip;->r:Landroid/view/View;

    sget v1, Lo/cdw;->t:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 121
    return-object v3
.end method

.method private e(FZ)V
    .locals 8

    .line 177
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    .line 178
    iget-object v0, p0, Lo/cip;->m:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    const/4 v5, 0x6

    new-array v5, v5, [F

    fill-array-data v5, :array_0

    .line 181
    invoke-static {p1}, Lo/cgl;->e(F)F

    move-result v6

    .line 182
    iget-object v0, p0, Lo/cip;->a:Landroid/content/Context;

    invoke-static {v0, v6}, Lo/cgl;->e(Landroid/content/Context;F)Ljava/lang/String;

    move-result-object v7

    .line 183
    iget-object v0, p0, Lo/cip;->d:Lo/chk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chk;->a(I)Lo/chk;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/chk;->c(F)Lo/chk;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chk;->d(Z)Lo/chk;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/chk;->e([F)Lo/chk;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/chk;->c(Ljava/lang/String;)Lo/chk;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/chk;->a(Z)Lo/chk;

    .line 184
    goto :goto_0

    .line 185
    :cond_0
    iget-object v0, p0, Lo/cip;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_anaerobic_train_train:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 186
    iget-object v0, p0, Lo/cip;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 188
    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x40000000    # 2.0f
        0x40400000    # 3.0f
        0x40800000    # 4.0f
        0x40a00000    # 5.0f
        0x40c00000    # 6.0f
    .end array-data
.end method

.method private e(Landroid/widget/TextView;I)V
    .locals 0

    .line 125
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 126
    return-void
.end method


# virtual methods
.method public a(IFFI)V
    .locals 2

    .line 129
    iget-object v0, p0, Lo/cip;->e:Landroid/view/View;

    if-nez v0, :cond_0

    .line 130
    return-void

    .line 132
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v1

    .line 133
    invoke-direct {p0, p2, v1}, Lo/cip;->c(FZ)V

    .line 134
    invoke-direct {p0, p3, v1}, Lo/cip;->e(FZ)V

    .line 135
    invoke-direct {p0, p1, v1}, Lo/cip;->c(IZ)V

    .line 136
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cip;->d(Ljava/lang/Integer;)V

    .line 137
    return-void
.end method

.method public d()Landroid/view/View;
    .locals 5

    .line 46
    iget v0, p0, Lo/cip;->b:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 48
    :sswitch_0
    invoke-direct {p0}, Lo/cip;->e()Landroid/view/View;

    move-result-object v4

    .line 49
    goto :goto_1

    .line 51
    :sswitch_1
    invoke-direct {p0}, Lo/cip;->b()Landroid/view/View;

    move-result-object v4

    .line 52
    goto :goto_1

    .line 54
    :goto_0
    const-string v0, "Track_TrainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildView unknow style"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    new-instance v4, Landroid/view/View;

    iget-object v0, p0, Lo/cip;->a:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 58
    :goto_1
    iput-object v4, p0, Lo/cip;->e:Landroid/view/View;

    .line 59
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0x65 -> :sswitch_1
    .end sparse-switch
.end method

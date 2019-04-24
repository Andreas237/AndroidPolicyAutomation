.class public Lo/bwe;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
.implements Lo/bwk$c;


# instance fields
.field public a:Landroid/widget/ImageView;

.field public b:Landroid/widget/SeekBar;

.field public c:Lo/efy;

.field public d:Landroid/widget/ImageView;

.field public e:Landroid/widget/SeekBar;

.field public f:Landroid/widget/ImageView;

.field public g:Landroid/widget/RelativeLayout;

.field public h:Landroid/widget/SeekBar;

.field public i:Lo/bwt;

.field public k:Landroid/widget/ImageView;

.field private l:Landroid/widget/LinearLayout;

.field public m:Landroid/widget/ImageView;

.field private n:Landroid/widget/RelativeLayout;

.field private o:Landroid/widget/RelativeLayout;

.field private p:Lo/efy;

.field private q:Lo/efy;

.field private r:Landroid/widget/ImageView;

.field private s:Lo/efy;

.field private t:Lo/efy;

.field private u:Lo/efy;

.field private w:Lo/bwk$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 62
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 66
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 70
    return-void
.end method

.method private a()V
    .locals 5

    .line 111
    iget-object v0, p0, Lo/bwe;->b:Landroid/widget/SeekBar;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 112
    iget-object v0, p0, Lo/bwe;->e:Landroid/widget/SeekBar;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 113
    iget-object v0, p0, Lo/bwe;->h:Landroid/widget/SeekBar;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 115
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "voicecoachviewcount"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 116
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    const-string v2, "1000"

    .line 119
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "voicecoachviewbg"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 120
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 121
    const-string v3, "1000"

    .line 123
    :cond_1
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "voicecoachviewguide"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 124
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 125
    const-string v4, "1000"

    .line 128
    :cond_2
    iget-object v0, p0, Lo/bwe;->b:Landroid/widget/SeekBar;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 129
    iget-object v0, p0, Lo/bwe;->e:Landroid/widget/SeekBar;

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 130
    iget-object v0, p0, Lo/bwe;->h:Landroid/widget/SeekBar;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 131
    return-void
.end method

.method private e()V
    .locals 2

    .line 147
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_swh_count:I

    invoke-virtual {p0, v0}, Lo/bwe;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwk;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwk;->b(Z)Lo/bwk;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bwk;->setOnSwitchStateChangeListener(Lo/bwk$c;)V

    .line 148
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_swh_bg:I

    invoke-virtual {p0, v0}, Lo/bwe;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwk;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwk;->b(Z)Lo/bwk;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bwk;->setOnSwitchStateChangeListener(Lo/bwk$c;)V

    .line 149
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_swh_guide:I

    invoke-virtual {p0, v0}, Lo/bwe;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwk;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwk;->b(Z)Lo/bwk;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bwk;->setOnSwitchStateChangeListener(Lo/bwk$c;)V

    .line 150
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 212
    iget-object v0, p0, Lo/bwe;->u:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 213
    invoke-virtual {p0}, Lo/bwe;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_pic_coachset_w:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v2, v0

    .line 214
    invoke-virtual {p0}, Lo/bwe;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_pic_coachset_h:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v3, v0

    .line 215
    iget-object v0, p0, Lo/bwe;->r:Landroid/widget/ImageView;

    invoke-static {p5, v2, v3, v0}, Lo/cam;->c(Ljava/lang/String;IILandroid/widget/ImageView;)V

    .line 217
    iget-object v0, p0, Lo/bwe;->q:Lo/efy;

    invoke-virtual {v0, p4}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 218
    iget-object v0, p0, Lo/bwe;->p:Lo/efy;

    invoke-virtual {v0, p2}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 219
    iget-object v0, p0, Lo/bwe;->t:Lo/efy;

    invoke-virtual {v0, p3}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 220
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 202
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bwe;->setVisibility(I)V

    .line 203
    iget-object v0, p0, Lo/bwe;->n:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 204
    iget-object v0, p0, Lo/bwe;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 205
    iget-object v0, p0, Lo/bwe;->o:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 206
    iget-object v0, p0, Lo/bwe;->l:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 207
    iget-object v0, p0, Lo/bwe;->s:Lo/efy;

    invoke-virtual {p0}, Lo/bwe;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_curr_action:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 208
    invoke-direct/range {p0 .. p5}, Lo/bwe;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    return-void
.end method

.method public b()Lo/bwt;
    .locals 1

    .line 260
    iget-object v0, p0, Lo/bwe;->i:Lo/bwt;

    return-object v0
.end method

.method public c()V
    .locals 1

    .line 196
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/bwe;->setVisibility(I)V

    .line 197
    iget-object v0, p0, Lo/bwe;->i:Lo/bwt;

    invoke-virtual {v0}, Lo/bwt;->e()Lo/bwt;

    .line 198
    return-void
.end method

.method public d()V
    .locals 2

    .line 224
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bwe;->setVisibility(I)V

    .line 225
    iget-object v0, p0, Lo/bwe;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 226
    iget-object v0, p0, Lo/bwe;->n:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 227
    return-void
.end method

.method public d(Landroid/view/View;Z)V
    .locals 4

    .line 154
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    .line 155
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_swh_bg:I

    if-ne v3, v0, :cond_0

    .line 156
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "coachviewbg"

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    iget-object v0, p0, Lo/bwe;->h:Landroid/widget/SeekBar;

    invoke-virtual {v0, p2}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 158
    iget-object v0, p0, Lo/bwe;->w:Lo/bwk$c;

    if-eqz v0, :cond_3

    .line 159
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 160
    iget-object v0, p0, Lo/bwe;->w:Lo/bwk$c;

    invoke-interface {v0, p1, p2}, Lo/bwk$c;->d(Landroid/view/View;Z)V

    goto :goto_0

    .line 162
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_swh_guide:I

    if-ne v3, v0, :cond_1

    .line 163
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "coachviewguide"

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    iget-object v0, p0, Lo/bwe;->e:Landroid/widget/SeekBar;

    invoke-virtual {v0, p2}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 165
    iget-object v0, p0, Lo/bwe;->w:Lo/bwk$c;

    if-eqz v0, :cond_3

    .line 166
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 167
    iget-object v0, p0, Lo/bwe;->w:Lo/bwk$c;

    invoke-interface {v0, p1, p2}, Lo/bwk$c;->d(Landroid/view/View;Z)V

    goto :goto_0

    .line 170
    :cond_1
    iget-object v0, p0, Lo/bwe;->w:Lo/bwk$c;

    if-eqz v0, :cond_2

    .line 171
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 172
    iget-object v0, p0, Lo/bwe;->w:Lo/bwk$c;

    invoke-interface {v0, p1, p2}, Lo/bwk$c;->d(Landroid/view/View;Z)V

    .line 174
    :cond_2
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "coachviewcount"

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    iget-object v0, p0, Lo/bwe;->b:Landroid/widget/SeekBar;

    invoke-virtual {v0, p2}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 177
    :cond_3
    :goto_0
    return-void
.end method

.method public d(Lo/bwk$c;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lo/bwe;->w:Lo/bwk$c;

    .line 257
    return-void
.end method

.method public e(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 180
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bwe;->setVisibility(I)V

    .line 181
    iget-object v0, p0, Lo/bwe;->n:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 182
    iget-object v0, p0, Lo/bwe;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 183
    iget-object v0, p0, Lo/bwe;->l:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 184
    iget-object v0, p0, Lo/bwe;->o:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 186
    iget-object v0, p0, Lo/bwe;->i:Lo/bwt;

    invoke-virtual {v0, p1}, Lo/bwt;->a(I)Lo/bwt;

    .line 187
    if-nez p2, :cond_0

    .line 188
    iget-object v0, p0, Lo/bwe;->s:Lo/efy;

    invoke-virtual {p0}, Lo/bwe;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_last_exe:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 190
    :cond_0
    iget-object v0, p0, Lo/bwe;->s:Lo/efy;

    invoke-virtual {p0}, Lo/bwe;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_next_exe:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 192
    :goto_0
    move-object v0, p0

    move-object v1, p3

    move-object v2, p4

    move-object v3, p5

    move-object v4, p6

    move-object v5, p7

    invoke-direct/range {v0 .. v5}, Lo/bwe;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    return-void
.end method

.method protected onFinishInflate()V
    .locals 3

    .line 74
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishInflate()V

    .line 75
    invoke-virtual {p0}, Lo/bwe;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->common_black_60alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/bwe;->setBackgroundColor(I)V

    .line 76
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/bwe;->setClickable(Z)V

    .line 77
    invoke-virtual {p0}, Lo/bwe;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_coach_view_setting:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 79
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_ll_volice_set:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/bwe;->n:Landroid/widget/RelativeLayout;

    .line 80
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_pb_count:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lo/bwe;->b:Landroid/widget/SeekBar;

    .line 81
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_pb_guide:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lo/bwe;->e:Landroid/widget/SeekBar;

    .line 82
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_pb_bg:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lo/bwe;->h:Landroid/widget/SeekBar;

    .line 83
    sget v0, Lcom/huawei/health/suggestion/R$id;->coach_set_iv_bg_pre:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwe;->a:Landroid/widget/ImageView;

    .line 84
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_iv_stop:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwe;->f:Landroid/widget/ImageView;

    .line 85
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_iv_continue:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwe;->m:Landroid/widget/ImageView;

    .line 86
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_voice_ok:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwe;->k:Landroid/widget/ImageView;

    .line 88
    sget v0, Lcom/huawei/health/suggestion/R$id;->coach_set_iv_bg_nex:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwe;->d:Landroid/widget/ImageView;

    .line 89
    sget v0, Lcom/huawei/health/suggestion/R$id;->coach_set_tv_bg:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwe;->c:Lo/efy;

    .line 91
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_tv_motion:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwe;->s:Lo/efy;

    .line 93
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_tv_motionkcal:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwe;->p:Lo/efy;

    .line 95
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_tv_motiontime:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwe;->t:Lo/efy;

    .line 97
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_tv_motionname:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwe;->u:Lo/efy;

    .line 99
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_iv_motion:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwe;->r:Landroid/widget/ImageView;

    .line 100
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_tp_countdown:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwt;

    iput-object v0, p0, Lo/bwe;->i:Lo/bwt;

    .line 101
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_tv_worn:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwe;->q:Lo/efy;

    .line 103
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_ll_show_pause:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/bwe;->g:Landroid/widget/RelativeLayout;

    .line 104
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_rl_coach_rest:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/bwe;->o:Landroid/widget/RelativeLayout;

    .line 105
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rl_coach_set_pause:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bwe;->l:Landroid/widget/LinearLayout;

    .line 106
    invoke-direct {p0}, Lo/bwe;->a()V

    .line 107
    invoke-direct {p0}, Lo/bwe;->e()V

    .line 108
    return-void
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    .line 233
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 238
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 243
    return-void
.end method

.method public setVisibility(I)V
    .locals 3

    .line 247
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 248
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 249
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "voicecoachviewcount"

    iget-object v2, p0, Lo/bwe;->b:Landroid/widget/SeekBar;

    invoke-virtual {v2}, Landroid/widget/SeekBar;->getProgress()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 250
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "voicecoachviewbg"

    iget-object v2, p0, Lo/bwe;->h:Landroid/widget/SeekBar;

    invoke-virtual {v2}, Landroid/widget/SeekBar;->getProgress()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 251
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "voicecoachviewguide"

    iget-object v2, p0, Lo/bwe;->e:Landroid/widget/SeekBar;

    invoke-virtual {v2}, Landroid/widget/SeekBar;->getProgress()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 253
    :cond_0
    return-void
.end method

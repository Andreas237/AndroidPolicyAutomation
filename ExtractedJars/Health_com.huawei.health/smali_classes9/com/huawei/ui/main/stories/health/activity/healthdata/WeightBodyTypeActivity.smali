.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private A:D

.field private B:I

.field private C:I

.field private D:Lo/acn;

.field private E:B

.field private F:I

.field private G:J

.field private H:Z

.field private I:I

.field private b:Landroid/widget/TextView;

.field private c:Landroid/content/Context;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/ImageView;

.field private j:D

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/widget/ImageView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/ImageView;

.field private p:Landroid/widget/ImageView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Lo/feq;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    const-class v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private a()V
    .locals 2

    .line 78
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_image:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->e:Landroid/widget/ImageView;

    .line 79
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->d:Landroid/widget/TextView;

    .line 80
    sget v0, Lcom/huawei/ui/main/R$id;->health_doby_type_suggestion_des:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->b:Landroid/widget/TextView;

    .line 81
    sget v0, Lcom/huawei/ui/main/R$id;->body_fat_tv_other:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/feq;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->v:Lo/feq;

    .line 82
    sget v0, Lcom/huawei/ui/main/R$id;->body_fat_tv_chinese:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->y:Landroid/widget/TextView;

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 85
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_img_1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->k:Landroid/widget/ImageView;

    .line 86
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_img_2:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->h:Landroid/widget/ImageView;

    .line 87
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_img_3:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->f:Landroid/widget/ImageView;

    .line 88
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_img_4:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->g:Landroid/widget/ImageView;

    .line 89
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_img_5:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->i:Landroid/widget/ImageView;

    .line 90
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_img_6:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->l:Landroid/widget/ImageView;

    .line 91
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_img_7:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->p:Landroid/widget/ImageView;

    .line 92
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_img_8:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->n:Landroid/widget/ImageView;

    .line 93
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_img_9:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->o:Landroid/widget/ImageView;

    .line 95
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_tv_1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->m:Landroid/widget/TextView;

    .line 96
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_tv_2:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->t:Landroid/widget/TextView;

    .line 97
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_tv_3:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->u:Landroid/widget/TextView;

    .line 98
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_tv_4:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->r:Landroid/widget/TextView;

    .line 99
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_tv_5:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->q:Landroid/widget/TextView;

    .line 100
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_tv_6:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->s:Landroid/widget/TextView;

    .line 101
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_tv_7:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->x:Landroid/widget/TextView;

    .line 102
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_tv_8:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->w:Landroid/widget/TextView;

    .line 103
    sget v0, Lcom/huawei/ui/main/R$id;->body_type_tv_9:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->z:Landroid/widget/TextView;

    .line 104
    return-void
.end method

.method private b()V
    .locals 7

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->D:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->j:D

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->D:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->A:D

    .line 109
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->D:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->u()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->B:I

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->D:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->q()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->I:I

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->D:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->t()B

    move-result v0

    iput-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->E:B

    .line 112
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->E:B

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->j:D

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->A:D

    iget v5, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->B:I

    iget v6, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->I:I

    invoke-static/range {v0 .. v6}, Lo/acm;->d(BDDII)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->C:I

    .line 113
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->d()V

    .line 114
    return-void
.end method

.method private d()V
    .locals 7

    .line 117
    sget-object v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "body type is ::"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->C:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->H:Z

    if-eqz v0, :cond_2

    .line 120
    new-instance v0, Ljava/util/Date;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->G:J

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v5

    .line 121
    new-instance v0, Ljava/util/Date;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->D:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v6

    .line 122
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->C:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->C:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->C:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_interpretation_negative:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 125
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_interpretation_positive:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 127
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    const/4 v2, 0x1

    aput-object v6, v1, v2

    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->F:I

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-static {v2, v3}, Lo/fej;->d(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->C:I

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-static {v2, v3}, Lo/fej;->d(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 130
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->d:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->C:I

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-static {v1, v2}, Lo/fej;->d(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->C:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 133
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_01b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_01b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 136
    goto/16 :goto_2

    .line 138
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_02b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_02b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 141
    goto/16 :goto_2

    .line 143
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_03b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_03b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 146
    goto/16 :goto_2

    .line 148
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_04b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_04b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->r:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 151
    goto/16 :goto_2

    .line 153
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_05b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_05b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 156
    goto/16 :goto_2

    .line 158
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_06b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_06b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->s:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 161
    goto/16 :goto_2

    .line 163
    :pswitch_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->p:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_07b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_07b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->x:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 166
    goto :goto_2

    .line 168
    :pswitch_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_08b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_08b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->w:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 171
    goto :goto_2

    .line 173
    :pswitch_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_09b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_09b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->z:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 176
    goto :goto_2

    .line 178
    :goto_1
    sget-object v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "body type get is wrong..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->finish()V

    .line 182
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 56
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 57
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_body_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->setContentView(I)V

    .line 58
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    .line 59
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 60
    if-nez v4, :cond_0

    .line 61
    sget-object v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    return-void

    .line 64
    :cond_0
    const-string v0, "weightBean_key"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lo/acn;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->D:Lo/acn;

    .line 65
    const-string v0, "start_time"

    const-wide/16 v1, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->G:J

    .line 66
    const-string v0, "start_type"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->F:I

    .line 67
    const-string v0, "is_show_change"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->H:Z

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->D:Lo/acn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 69
    sget-object v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWeightBean is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->finish()V

    .line 71
    return-void

    .line 73
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->a()V

    .line 74
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->b()V

    .line 75
    return-void
.end method

.method public onResume()V
    .locals 3

    .line 186
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ja"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->v:Lo/feq;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/feq;->setVisibility(I)V

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->y:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 192
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->v:Lo/feq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/feq;->setVisibility(I)V

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;->y:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 195
    :goto_0
    return-void
.end method

.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final c:[I

.field private static final e:[I


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/os/Handler;

.field private C:Lo/acu;

.field private D:Landroid/widget/TextView;

.field private E:D

.field private F:Landroid/view/View;

.field private G:Lo/emr;

.field private H:Landroid/widget/LinearLayout;

.field private I:J

.field private J:Lo/acn;

.field private K:Landroid/widget/LinearLayout;

.field private L:I

.field private M:Landroid/widget/TextView;

.field private N:I

.field private R:B

.field private a:I

.field private b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

.field private d:I

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Lo/emg;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/LinearLayout;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/LinearLayout;

.field private z:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->c:[I

    .line 54
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->e:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x3c
        0x64
    .end array-data

    :array_1
    .array-data 4
        0x37
        0x46
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 83
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->B:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 2

    .line 858
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->k:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 859
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 860
    return-void
.end method

.method private a(D)V
    .locals 4

    .line 251
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 254
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->g(D)V

    .line 255
    goto/16 :goto_1

    .line 258
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->f(D)V

    .line 259
    goto/16 :goto_1

    .line 262
    :pswitch_2
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d(D)V

    .line 263
    goto :goto_1

    .line 266
    :pswitch_3
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->h(D)V

    .line 267
    goto :goto_1

    .line 270
    :pswitch_4
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b(D)V

    .line 271
    goto :goto_1

    .line 274
    :pswitch_5
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i(D)V

    .line 275
    goto :goto_1

    .line 278
    :pswitch_6
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->e(D)V

    .line 279
    goto :goto_1

    .line 282
    :pswitch_7
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->k(D)V

    .line 283
    goto :goto_1

    .line 286
    :pswitch_8
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->c(D)V

    .line 287
    goto :goto_1

    .line 289
    :pswitch_9
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->n(D)V

    .line 290
    goto :goto_1

    .line 292
    :pswitch_a
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o(D)V

    .line 293
    goto :goto_1

    .line 295
    :pswitch_b
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->J:Lo/acn;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->e(Lo/acn;)V

    .line 296
    goto :goto_1

    .line 298
    :pswitch_c
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->p(D)V

    .line 299
    goto :goto_1

    .line 301
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->finish()V

    .line 302
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "type not found "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_0
        :pswitch_7
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_8
        :pswitch_c
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 780
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->m:Landroid/widget/TextView;

    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 782
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 783
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->n:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 785
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->n:Landroid/widget/TextView;

    invoke-direct {p0, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 787
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->p:Landroid/widget/TextView;

    invoke-direct {p0, p3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 789
    return-void
.end method

.method private b()V
    .locals 5

    .line 113
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 114
    if-nez v4, :cond_0

    .line 115
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    return-void

    .line 118
    :cond_0
    const-string v0, "weight_details_type_key"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    .line 119
    const-string v0, "weight_details_data_key"

    const-wide/16 v1, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->E:D

    .line 120
    const-string v0, "weight_details_weight_bean_key"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lo/acn;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->J:Lo/acn;

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->J:Lo/acn;

    if-nez v0, :cond_1

    .line 122
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWeightBean is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->finish()V

    .line 124
    return-void

    .line 126
    :cond_1
    const-string v0, "weight_details_time"

    const-wide/16 v1, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->I:J

    .line 127
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->C:Lo/acu;

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->J:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->u()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->J:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->q()I

    move-result v0

    if-lez v0, :cond_2

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->J:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->u()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->L:I

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->J:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->t()B

    move-result v0

    iput-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->J:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->q()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->N:I

    goto :goto_0

    .line 133
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->C:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->b()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->L:I

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->C:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->c()B

    move-result v0

    iput-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->C:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->d()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->N:I

    .line 137
    :goto_0
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->L:I

    invoke-static {v0}, Lo/fea;->a(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    .line 139
    return-void
.end method

.method private b(D)V
    .locals 8

    .line 339
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->m(D)V

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_muscle:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_muscle_intro:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 344
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_muscle_formula:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0x14

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->N:I

    invoke-static {p1, p2, v0, v1}, Lo/feb;->d(DBI)I

    move-result v5

    .line 348
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 349
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    invoke-static {v0, v1, v2, v5}, Lo/fea;->c(IIII)Ljava/lang/String;

    move-result-object v6

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->h:Landroid/widget/TextView;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->I:J

    invoke-static {v6, v1, v2}, Lo/fea;->c(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 351
    goto :goto_1

    .line 352
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a()V

    .line 355
    :goto_1
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->N:I

    invoke-static {v0, v1}, Lo/feb;->c(BI)[Ljava/lang/String;

    move-result-object v6

    .line 356
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 357
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    aget-object v1, v6, v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x1

    aget-object v2, v6, v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cxh;->e(D)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 359
    :cond_2
    const/4 v0, 0x0

    aget-object v0, v6, v0

    const/4 v1, 0x1

    aget-object v1, v6, v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    :goto_2
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->N:I

    invoke-static {p1, p2, v0, v1}, Lo/feb;->a(DBI)D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l(D)V

    .line 364
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    const/4 v3, -0x1

    invoke-direct {p0, v0, v1, v3, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d(IIII)V

    .line 366
    const/4 v0, 0x3

    new-array v7, v0, [I

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    const/4 v1, 0x0

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    const/4 v1, 0x1

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    const/4 v1, 0x2

    aput v0, v7, v1

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    add-int/lit8 v2, v5, -0x1

    aget v2, v7, v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 368
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->N:I

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    invoke-static {p1, p2, v0, v1, v2}, Lo/fek;->d(DBILandroid/widget/TextView;)V

    .line 369
    return-void
.end method

.method private c()V
    .locals 2

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->tv_weight_details_value:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->f:Landroid/widget/TextView;

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->tv_weight_details_value_unit:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->g:Landroid/widget/TextView;

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->g:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->type_intro_content:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->health_body_index_level:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->health_suggestion_content:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->k:Landroid/widget/TextView;

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->health_suggestion_content_des:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->h:Landroid/widget/TextView;

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->health_stand_sugg_info_tv:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->M:Landroid/widget/TextView;

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_details_seekbar_value_1:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->m:Landroid/widget/TextView;

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_details_seekbar_value_2:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->n:Landroid/widget/TextView;

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_details_seekbar_value_3:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->p:Landroid/widget/TextView;

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_mid_progressbar:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emg;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l:Lo/emg;

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_details_text_1:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->u:Landroid/widget/TextView;

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_details_text_2:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->t:Landroid/widget/TextView;

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_details_text_3:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->s:Landroid/widget/TextView;

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_details_text_4:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->q:Landroid/widget/TextView;

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->seek_bar_parent:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->y:Landroid/widget/LinearLayout;

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_details_seekbar_top_tv_layout:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->K:Landroid/widget/LinearLayout;

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->health_details_middle_split_line:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->F:Landroid/view/View;

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->health_details_tips_layout:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->H:Landroid/widget/LinearLayout;

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->details_formula_intro:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r:Landroid/widget/TextView;

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->fitness_detail_titlebar:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_detail_ideal_layout:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->v:Landroid/widget/LinearLayout;

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_details_ideal_type_tv:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->w:Landroid/widget/TextView;

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_details_ideal_value:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->x:Landroid/widget/TextView;

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_details_ideal_value_unit:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->z:Landroid/widget/TextView;

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->M:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->details_type_small_title:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->j:Landroid/widget/TextView;

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->details_type_ideal_title:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->D:Landroid/widget/TextView;

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->details_type_ideal_tips:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->A:Landroid/widget/TextView;

    .line 192
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d()V

    .line 193
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->e()V

    .line 194
    return-void
.end method

.method private c(D)V
    .locals 9

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 410
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 411
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 412
    new-instance v6, Landroid/text/SpannableString;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_hw_show_bodyage_unit_years_old:I

    double-to-int v2, p1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v7, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 414
    :cond_0
    new-instance v6, Landroid/text/SpannableString;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_hw_show_bodyage_unit_years_old:I

    double-to-int v2, p1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    double-to-int v4, p1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 416
    :goto_0
    new-instance v8, Landroid/text/SpannableString;

    invoke-direct {v8, v6}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 417
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/16 v1, 0xd

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v6}, Landroid/text/SpannableString;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 418
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/16 v1, 0x28

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 421
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_bodyage:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 422
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_bodyage_intro:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 423
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 425
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 426
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->F:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 427
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a()V

    .line 428
    return-void
.end method

.method private d()V
    .locals 3

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_Image_progressbar:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 202
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    if-nez v0, :cond_1

    .line 203
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_details_progressbar_3b:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 204
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 205
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_details_progressbar_1b:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 206
    :cond_2
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_3

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_3

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_3

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_4

    .line 208
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_weight_share_progressbar_1:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 209
    :cond_4
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_5

    .line 210
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_details_progressbar_2b:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 211
    :cond_5
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_d

    .line 212
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_details_progressbar_4b:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 215
    :cond_6
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    if-nez v0, :cond_8

    .line 216
    :cond_7
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_details_progressbar_3:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 217
    :cond_8
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_9

    .line 218
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_details_progressbar_1:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 219
    :cond_9
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_a

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_a

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_a

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_a

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_b

    .line 221
    :cond_a
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_weight_share_progressbar:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 222
    :cond_b
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_c

    .line 223
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_details_progressbar_2:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 224
    :cond_c
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_d

    .line 225
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_details_progressbar_4:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 228
    :cond_d
    :goto_0
    return-void
.end method

.method private d(D)V
    .locals 8

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_sport_cal_unit_new:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_metabolism:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_metabolism_intro:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 380
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_metabolism_formula:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 381
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r:Landroid/widget/TextView;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0x10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0x12

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/16 v2, 0x28

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 383
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->L:I

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    invoke-static {p1, p2, v0, v1}, Lo/feb;->b(DIB)I

    move-result v5

    .line 384
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 385
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    invoke-static {v0, v1, v2, v5}, Lo/fea;->c(IIII)Ljava/lang/String;

    move-result-object v6

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->h:Landroid/widget/TextView;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->I:J

    invoke-static {v6, v1, v2}, Lo/fea;->c(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 387
    goto :goto_1

    .line 388
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a()V

    .line 391
    :goto_1
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->L:I

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    invoke-static {v0, v1}, Lo/feb;->e(IB)[Ljava/lang/String;

    move-result-object v6

    .line 392
    const/4 v0, 0x0

    aget-object v0, v6, v0

    const/4 v1, 0x1

    aget-object v1, v6, v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->L:I

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    invoke-static {p1, p2, v0, v1}, Lo/feb;->d(DIB)D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l(D)V

    .line 396
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    const/4 v3, -0x1

    invoke-direct {p0, v0, v1, v3, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d(IIII)V

    .line 398
    const/4 v0, 0x3

    new-array v7, v0, [I

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    const/4 v1, 0x0

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    const/4 v1, 0x1

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    const/4 v1, 0x2

    aput v0, v7, v1

    .line 399
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    add-int/lit8 v2, v5, -0x1

    aget v2, v7, v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 400
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->L:I

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    invoke-static {p1, p2, v0, v1, v2}, Lo/fek;->e(DIBLandroid/widget/TextView;)V

    .line 401
    return-void
.end method

.method private d(IIII)V
    .locals 2

    .line 793
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 794
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(I)V

    .line 795
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v0, p4}, Landroid/widget/TextView;->setText(I)V

    .line 796
    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    .line 797
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->s:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 799
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->s:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 800
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(I)V

    .line 802
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 828
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    .line 829
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    .line 830
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v2, v3, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 832
    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-static {v2, v3, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 3

    .line 840
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 841
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 842
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 844
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    .line 845
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "CN"

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 846
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 847
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 849
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a()V

    .line 851
    :goto_0
    return-void
.end method

.method private e(D)V
    .locals 7

    .line 311
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r(D)V

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_protein:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_protein_intro:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_protein_formula:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 315
    invoke-static {p1, p2}, Lo/feb;->f(D)I

    move-result v4

    .line 316
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 317
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    invoke-static {v0, v1, v2, v4}, Lo/fea;->c(IIII)Ljava/lang/String;

    move-result-object v5

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->h:Landroid/widget/TextView;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->I:J

    invoke-static {v5, v1, v2}, Lo/fea;->c(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 319
    goto :goto_1

    .line 320
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a()V

    .line 322
    :goto_1
    invoke-static {}, Lo/feb;->e()[Ljava/lang/String;

    move-result-object v5

    .line 323
    const/4 v0, 0x0

    aget-object v0, v5, v0

    const/4 v1, 0x1

    aget-object v1, v5, v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    invoke-static {p1, p2}, Lo/feb;->a(D)D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l(D)V

    .line 327
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    const/4 v3, -0x1

    invoke-direct {p0, v0, v1, v3, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d(IIII)V

    .line 329
    const/4 v0, 0x3

    new-array v6, v0, [I

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    const/4 v1, 0x0

    aput v0, v6, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    const/4 v1, 0x1

    aput v0, v6, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    const/4 v1, 0x2

    aput v0, v6, v1

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    add-int/lit8 v2, v4, -0x1

    aget v2, v6, v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    invoke-static {p1, p2, v0}, Lo/fek;->d(DLandroid/widget/TextView;)V

    .line 332
    return-void
.end method

.method private e(Lo/acn;)V
    .locals 21

    .line 669
    invoke-virtual/range {p1 .. p1}, Lo/acn;->d()D

    move-result-wide v0

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->m(D)V

    .line 670
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 671
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->w:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_ideal_weight:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 673
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_ideal_weight_intor:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 674
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_ideal_weight_des:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 676
    invoke-virtual/range {p1 .. p1}, Lo/acn;->f()D

    move-result-wide v9

    .line 677
    const-wide/16 v0, 0x0

    cmpg-double v0, v9, v0

    if-gtz v0, :cond_0

    .line 678
    invoke-virtual/range {p1 .. p1}, Lo/acn;->d()D

    move-result-wide v0

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->N:I

    move-object/from16 v3, p0

    iget v3, v3, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->N:I

    mul-int/2addr v2, v3

    int-to-double v2, v2

    const-wide v4, 0x3f1a36e2eb1c432dL    # 1.0E-4

    mul-double/2addr v2, v4

    div-double v9, v0, v2

    .line 679
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initWeight, bmi == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 680
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, v9, v10}, Ljava/math/BigDecimal;-><init>(D)V

    sget-object v1, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v9

    .line 682
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 684
    invoke-static {v9, v10}, Lo/feb;->e(D)D

    move-result-wide v0

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l(D)V

    .line 685
    invoke-static {v9, v10}, Lo/feb;->i(D)I

    move-result v8

    goto :goto_0

    .line 688
    :cond_1
    invoke-static {v9, v10}, Lo/feb;->d(D)D

    move-result-wide v0

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l(D)V

    .line 689
    invoke-static {v9, v10}, Lo/feb;->h(D)I

    move-result v8

    .line 691
    :goto_0
    move-object/from16 v0, p0

    iget-byte v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->N:I

    invoke-static {v0, v1}, Lo/acm;->e(BI)D

    move-result-wide v11

    .line 692
    const-wide/16 v0, 0x0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_2

    .line 693
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initWeight, no standweight... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 694
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->finish()V

    .line 695
    return-void

    .line 697
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lo/acn;->d()D

    move-result-wide v0

    sub-double v13, v0, v11

    .line 698
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    move-result-wide v15

    .line 700
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 701
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_lb_string:I

    invoke-static {v11, v12}, Lo/cxh;->e(D)D

    move-result-wide v2

    double-to-int v2, v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v11, v12}, Lo/cxh;->e(D)D

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x1

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .line 702
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_lb_string:I

    invoke-static/range {v15 .. v16}, Lo/cxh;->e(D)D

    move-result-wide v2

    double-to-int v2, v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static/range {v15 .. v16}, Lo/cxh;->e(D)D

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x1

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    .line 703
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->x:Landroid/widget/TextView;

    invoke-static {v11, v12}, Lo/cxh;->e(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 704
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->z:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 706
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_kg_string:I

    double-to-int v2, v11

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x1

    const/4 v5, 0x1

    invoke-static {v11, v12, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .line 707
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_kg_string:I

    move-wide v2, v15

    double-to-int v2, v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    move-wide v4, v15

    const/4 v6, 0x1

    const/4 v7, 0x1

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    .line 708
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->x:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v11, v12, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 709
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->z:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_kg:I

    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 712
    :goto_1
    const-wide/16 v0, 0x0

    cmpl-double v0, v13, v0

    if-lez v0, :cond_4

    .line 713
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_suggest_description_more_than_ideal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v17

    .line 714
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->M:Landroid/widget/TextView;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v18, v1, v2

    const/4 v2, 0x1

    aput-object v19, v1, v2

    move-object/from16 v2, v17

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 715
    :cond_4
    const-wide/16 v0, 0x0

    cmpg-double v0, v13, v0

    if-gez v0, :cond_5

    .line 716
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_suggest_description_less_than_ideal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v17

    .line 717
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->M:Landroid/widget/TextView;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v18, v1, v2

    const/4 v2, 0x1

    aput-object v19, v1, v2

    move-object/from16 v2, v17

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 719
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_suggest_description_equal_ideal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v17

    .line 720
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->M:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v18, v1, v2

    move-object/from16 v2, v17

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 722
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->v:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 723
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 724
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->M:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 725
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->K:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 726
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->j:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 727
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->j:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_ideal_weight:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 728
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    move-object/from16 v4, p0

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d(IIII)V

    .line 729
    const/4 v0, 0x4

    new-array v0, v0, [I

    move-object/from16 v20, v0

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    const/4 v1, 0x0

    aput v0, v20, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    const/4 v1, 0x1

    aput v0, v20, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    const/4 v1, 0x2

    aput v0, v20, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    const/4 v1, 0x3

    aput v0, v20, v1

    .line 730
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    add-int/lit8 v2, v8, -0x1

    aget v2, v20, v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 731
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    invoke-static {v9, v10, v0}, Lo/fek;->b(DLandroid/widget/TextView;)V

    .line 732
    return-void
.end method

.method private f(D)V
    .locals 7

    .line 564
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r(D)V

    .line 565
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_water:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 566
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_water_intro:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_water_formula:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 569
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    invoke-static {p1, p2, v0}, Lo/feb;->c(DB)I

    move-result v4

    .line 570
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 571
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    invoke-static {v0, v1, v2, v4}, Lo/fea;->c(IIII)Ljava/lang/String;

    move-result-object v5

    .line 572
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->h:Landroid/widget/TextView;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->I:J

    invoke-static {v5, v1, v2}, Lo/fea;->c(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 573
    goto :goto_1

    .line 574
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a()V

    .line 577
    :goto_1
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    invoke-static {v0}, Lo/feb;->d(B)[Ljava/lang/String;

    move-result-object v5

    .line 578
    const/4 v0, 0x0

    aget-object v0, v5, v0

    const/4 v1, 0x1

    aget-object v1, v5, v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 580
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    invoke-static {p1, p2, v0}, Lo/feb;->e(DB)D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l(D)V

    .line 582
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_hydropenia:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fine:I

    const/4 v3, -0x1

    invoke-direct {p0, v0, v1, v3, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d(IIII)V

    .line 584
    const/4 v0, 0x3

    new-array v6, v0, [I

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_hydropenia:I

    const/4 v1, 0x0

    aput v0, v6, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    const/4 v1, 0x1

    aput v0, v6, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fine:I

    const/4 v1, 0x2

    aput v0, v6, v1

    .line 585
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    add-int/lit8 v2, v4, -0x1

    aget v2, v6, v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 586
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    invoke-static {p1, p2, v0, v1}, Lo/fek;->e(DBLandroid/widget/TextView;)V

    .line 587
    return-void
.end method

.method private g(D)V
    .locals 10

    .line 476
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r(D)V

    .line 477
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_bodyfat_rate:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 478
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_adipose_intro:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_adipose_formula:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 480
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->w:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_ideal_body_fat:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 481
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->j:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_bodyfat_rate:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->D:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_ideal_body_fat:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 483
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->A:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_ideal_body_fat_formula:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 485
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->L:I

    invoke-static {v0, v1}, Lo/acm;->c(BI)D

    move-result-wide v4

    .line 486
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_suggest_description_ideal_fat:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 487
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->M:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v4, v5, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-static {v0}, Lo/cxa;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 489
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->x:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v4, v5, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->z:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 492
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->x:Landroid/widget/TextView;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-static {v4, v5, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->z:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 495
    :goto_0
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    cmpl-double v0, v4, v0

    if-eqz v0, :cond_2

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->M:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->v:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->j:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 500
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->D:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->A:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 504
    :cond_2
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->L:I

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    invoke-static {v0, v1}, Lo/feb;->a(IB)[Ljava/lang/String;

    move-result-object v7

    .line 505
    const/4 v0, 0x0

    aget-object v0, v7, v0

    const/4 v1, 0x1

    aget-object v1, v7, v1

    const/4 v2, 0x2

    aget-object v2, v7, v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->L:I

    invoke-static {p1, p2, v0, v1}, Lo/feb;->c(DBI)I

    move-result v8

    .line 508
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 509
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    invoke-static {v0, v1, v2, v8}, Lo/fea;->c(IIII)Ljava/lang/String;

    move-result-object v9

    .line 510
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->h:Landroid/widget/TextView;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->I:J

    invoke-static {v9, v1, v2}, Lo/fea;->c(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 511
    goto :goto_2

    .line 512
    :cond_4
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a()V

    .line 515
    :goto_2
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->L:I

    invoke-static {p1, p2, v0, v1}, Lo/feb;->b(DBI)D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l(D)V

    .line 517
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_inclined_fat:I

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d(IIII)V

    .line 519
    const/4 v0, 0x4

    new-array v9, v0, [I

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    const/4 v1, 0x0

    aput v0, v9, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    const/4 v1, 0x1

    aput v0, v9, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_inclined_fat:I

    const/4 v1, 0x2

    aput v0, v9, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    const/4 v1, 0x3

    aput v0, v9, v1

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    add-int/lit8 v2, v8, -0x1

    aget v2, v9, v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 521
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->L:I

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    invoke-static {p1, p2, v0, v1, v2}, Lo/fek;->b(DBILandroid/widget/TextView;)V

    .line 522
    return-void
.end method

.method private h(D)V
    .locals 8

    .line 593
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 594
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_haslet_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 595
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_haslet:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 596
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_haslet_intro:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 597
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0xa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0x64

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 599
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_haslet_formula:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 601
    invoke-static {p1, p2}, Lo/feb;->k(D)I

    move-result v5

    .line 602
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 603
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    invoke-static {v0, v1, v2, v5}, Lo/fea;->c(IIII)Ljava/lang/String;

    move-result-object v6

    .line 604
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->h:Landroid/widget/TextView;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->I:J

    invoke-static {v6, v1, v2}, Lo/fea;->c(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 605
    goto :goto_1

    .line 606
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a()V

    .line 609
    :goto_1
    invoke-static {}, Lo/feb;->b()[Ljava/lang/String;

    move-result-object v6

    .line 610
    const/4 v0, 0x0

    aget-object v0, v6, v0

    const/4 v1, 0x1

    aget-object v1, v6, v1

    const/4 v2, 0x2

    aget-object v2, v6, v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 612
    invoke-static {p1, p2}, Lo/feb;->c(D)D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l(D)V

    .line 614
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_warn:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_dangerous:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d(IIII)V

    .line 616
    const/4 v0, 0x4

    new-array v7, v0, [I

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    const/4 v1, 0x0

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_warn:I

    const/4 v1, 0x1

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    const/4 v1, 0x2

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_dangerous:I

    const/4 v1, 0x3

    aput v0, v7, v1

    .line 617
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    add-int/lit8 v2, v5, -0x1

    aget v2, v7, v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 618
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    invoke-static {p1, p2, v0}, Lo/fek;->c(DLandroid/widget/TextView;)V

    .line 619
    return-void
.end method

.method private i(D)V
    .locals 8

    .line 530
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->m(D)V

    .line 531
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_bone:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 532
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_bone_intro:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 533
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_bone_formula:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 535
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->J:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    double-to-float v0, v0

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    invoke-static {p1, p2, v0, v1}, Lo/feb;->b(DFB)I

    move-result v5

    .line 536
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 537
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    invoke-static {v0, v1, v2, v5}, Lo/fea;->c(IIII)Ljava/lang/String;

    move-result-object v6

    .line 538
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->h:Landroid/widget/TextView;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->I:J

    invoke-static {v6, v1, v2}, Lo/fea;->c(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 539
    goto :goto_1

    .line 540
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a()V

    .line 543
    :goto_1
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->J:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->d()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v0, v1}, Lo/feb;->d(BF)[Ljava/lang/String;

    move-result-object v6

    .line 544
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initBoneSalt user weight == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->J:Lo/acn;

    invoke-virtual {v3}, Lo/acn;->d()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 545
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 546
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    aget-object v1, v6, v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x1

    aget-object v2, v6, v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cxh;->e(D)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 548
    :cond_2
    const/4 v0, 0x0

    aget-object v0, v6, v0

    const/4 v1, 0x1

    aget-object v1, v6, v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 551
    :goto_2
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->J:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->d()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {p1, p2, v0, v1}, Lo/feb;->c(DBF)D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l(D)V

    .line 553
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    const/4 v3, -0x1

    invoke-direct {p0, v0, v1, v3, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d(IIII)V

    .line 555
    const/4 v0, 0x3

    new-array v7, v0, [I

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    const/4 v1, 0x0

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    const/4 v1, 0x1

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    const/4 v1, 0x2

    aput v0, v7, v1

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    add-int/lit8 v2, v5, -0x1

    aget v2, v7, v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 557
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->J:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->d()D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    invoke-static {p1, p2, v0, v1, v2}, Lo/fek;->b(DBFLandroid/widget/TextView;)V

    .line 558
    return-void
.end method

.method private k(D)V
    .locals 6

    .line 434
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 435
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->g:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_BMI:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 437
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_bmi_intro:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_bmi_formula:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 442
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 443
    invoke-static {}, Lo/feb;->c()[Ljava/lang/String;

    move-result-object v5

    .line 444
    const/4 v0, 0x0

    aget-object v0, v5, v0

    const/4 v1, 0x1

    aget-object v1, v5, v1

    const/4 v2, 0x2

    aget-object v2, v5, v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 446
    invoke-static {p1, p2}, Lo/feb;->e(D)D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l(D)V

    .line 447
    invoke-static {p1, p2}, Lo/feb;->i(D)I

    move-result v4

    .line 448
    goto :goto_0

    .line 449
    :cond_0
    invoke-static {}, Lo/feb;->a()[Ljava/lang/String;

    move-result-object v5

    .line 450
    const/4 v0, 0x0

    aget-object v0, v5, v0

    const/4 v1, 0x1

    aget-object v1, v5, v1

    const/4 v2, 0x2

    aget-object v2, v5, v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    invoke-static {p1, p2}, Lo/feb;->d(D)D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l(D)V

    .line 453
    invoke-static {p1, p2}, Lo/feb;->h(D)I

    move-result v4

    .line 456
    :goto_0
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 457
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d:I

    iget-byte v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a:I

    invoke-static {v0, v1, v2, v4}, Lo/fea;->c(IIII)Ljava/lang/String;

    move-result-object v5

    .line 458
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->h:Landroid/widget/TextView;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->I:J

    invoke-static {v5, v1, v2}, Lo/fea;->c(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 459
    goto :goto_2

    .line 460
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a()V

    .line 464
    :goto_2
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_weight:I

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_super_weight:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d(IIII)V

    .line 466
    const/4 v0, 0x4

    new-array v5, v0, [I

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    const/4 v1, 0x0

    aput v0, v5, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    const/4 v1, 0x1

    aput v0, v5, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_weight:I

    const/4 v1, 0x2

    aput v0, v5, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_super_weight:I

    const/4 v1, 0x3

    aput v0, v5, v1

    .line 467
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    add-int/lit8 v2, v4, -0x1

    aget v2, v5, v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    invoke-static {p1, p2, v0}, Lo/fek;->a(DLandroid/widget/TextView;)V

    .line 469
    return-void
.end method

.method private l(D)V
    .locals 5

    .line 806
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, p1

    double-to-int v4, v0

    .line 807
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "progress ==  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 809
    rsub-int/lit8 v4, v4, 0x64

    .line 811
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l:Lo/emg;

    invoke-virtual {v0, v4}, Lo/emg;->setProgress(I)V

    .line 812
    return-void
.end method

.method private m(D)V
    .locals 5

    .line 769
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 770
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->f:Landroid/widget/TextView;

    invoke-static {p1, p2}, Lo/cxh;->e(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 771
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 773
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 774
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_kg:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 776
    :goto_0
    return-void
.end method

.method private n(D)V
    .locals 7

    .line 625
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "into initHeartRate == "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 626
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 627
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_measure_pressure_result_heart_rate_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 628
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_string:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 630
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_heartrate_intro:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->c:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    int-to-double v2, v2

    .line 631
    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->c:[I

    const/4 v3, 0x1

    aget v2, v2, v3

    int-to-double v2, v2

    .line 632
    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->e:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    int-to-double v2, v2

    .line 633
    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sget-object v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->e:[I

    const/4 v3, 0x1

    aget v2, v2, v3

    int-to-double v2, v2

    .line 634
    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 635
    const-wide/high16 v2, 0x4049000000000000L    # 50.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 630
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 636
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 637
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 638
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 639
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->F:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 640
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a()V

    .line 641
    return-void
.end method

.method private o(D)V
    .locals 7

    .line 647
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "into initPressIndex == "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 649
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_pressure_index:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 650
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_Pressindex_intro:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 651
    invoke-static {p1, p2}, Lo/feb;->g(D)I

    move-result v4

    .line 652
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a()V

    .line 653
    invoke-static {}, Lo/feb;->d()[Ljava/lang/String;

    move-result-object v5

    .line 654
    const/4 v0, 0x0

    aget-object v0, v5, v0

    const/4 v1, 0x1

    aget-object v1, v5, v1

    const/4 v2, 0x2

    aget-object v2, v5, v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 655
    invoke-static {p1, p2}, Lo/feb;->b(D)D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l(D)V

    .line 657
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_relaxed:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_normal:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_grade_item_3:I

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_highly:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d(IIII)V

    .line 659
    const/4 v0, 0x4

    new-array v6, v0, [I

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_relaxed:I

    const/4 v1, 0x0

    aput v0, v6, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_normal:I

    const/4 v1, 0x1

    aput v0, v6, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_grade_item_3:I

    const/4 v1, 0x2

    aput v0, v6, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_highly:I

    const/4 v1, 0x3

    aput v0, v6, v1

    .line 660
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    add-int/lit8 v2, v4, -0x1

    aget v2, v6, v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 661
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    invoke-static {p1, p2, v0}, Lo/fek;->e(DLandroid/widget/TextView;)V

    .line 662
    return-void
.end method

.method private p(D)V
    .locals 10

    .line 739
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->m(D)V

    .line 740
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->G:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_skeletal_muscle_mass:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 741
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_skeletal_muscle_formula:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 742
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-wide/high16 v2, 0x4044000000000000L    # 40.0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 743
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->r:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 744
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->N:I

    invoke-static {p1, p2, v0, v1}, Lo/feb;->g(DBI)I

    move-result v7

    .line 745
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->N:I

    invoke-static {v0, v1}, Lo/feb;->e(BI)[Ljava/lang/String;

    move-result-object v8

    .line 747
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 748
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    aget-object v1, v8, v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x1

    aget-object v2, v8, v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cxh;->e(D)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 750
    :cond_0
    const/4 v0, 0x0

    aget-object v0, v8, v0

    const/4 v1, 0x1

    aget-object v1, v8, v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 753
    :goto_0
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->N:I

    invoke-static {p1, p2, v0, v1}, Lo/feb;->e(DBI)D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->l(D)V

    .line 755
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    const/4 v3, -0x1

    invoke-direct {p0, v0, v1, v3, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->d(IIII)V

    .line 757
    const/4 v0, 0x3

    new-array v9, v0, [I

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    const/4 v1, 0x0

    aput v0, v9, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    const/4 v1, 0x1

    aput v0, v9, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    const/4 v1, 0x2

    aput v0, v9, v1

    .line 758
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    add-int/lit8 v2, v7, -0x1

    aget v2, v9, v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 759
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a()V

    .line 760
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->R:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->N:I

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->o:Landroid/widget/TextView;

    invoke-static {p1, p2, v0, v1, v2}, Lo/fek;->a(DBILandroid/widget/TextView;)V

    .line 761
    return-void
.end method

.method private r(D)V
    .locals 3

    .line 863
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-static {v0}, Lo/cxa;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 864
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 865
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 866
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 868
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 869
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 871
    :goto_0
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 817
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 100
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 101
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_weight_details:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->setContentView(I)V

    .line 102
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    .line 104
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->b()V

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->c()V

    .line 107
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 821
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 822
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 143
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 145
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->E:D

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;->a(D)V

    .line 146
    return-void
.end method

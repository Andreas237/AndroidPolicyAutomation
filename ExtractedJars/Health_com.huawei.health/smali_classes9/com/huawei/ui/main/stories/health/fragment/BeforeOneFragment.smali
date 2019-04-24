.class public Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;
.super Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/ffb$a;
.implements Lo/fdu;
.implements Lo/fdw;


# instance fields
.field private A:Landroid/view/View;

.field private B:Landroid/widget/ScrollView;

.field private C:Landroid/view/View;

.field private D:Landroid/view/View;

.field private E:Landroid/widget/TextView;

.field private F:Landroid/widget/TextView;

.field private G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private H:Landroid/widget/ImageView;

.field private I:Landroid/widget/ImageView;

.field private J:Landroid/widget/RelativeLayout;

.field private K:Landroid/widget/LinearLayout;

.field private L:Lo/emn;

.field private M:Lo/fcv;

.field private N:Lo/fei;

.field private O:Landroid/support/v7/widget/LinearLayoutManager;

.field private P:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

.field private Q:Lo/fcn;

.field private R:Ljava/util/Date;

.field private S:Z

.field private T:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

.field private X:Landroid/view/View$OnClickListener;

.field public f:Lo/fcu;

.field private g:Landroid/widget/TableLayout;

.field protected h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

.field private i:I

.field private j:Lo/fdz;

.field private k:Lo/elp;

.field private l:Landroid/widget/LinearLayout;

.field private m:Landroid/widget/LinearLayout;

.field private n:Landroid/view/View;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/LinearLayout;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/SeekBar;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/SeekBar;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 151
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;-><init>()V

    .line 140
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->G:Ljava/util/ArrayList;

    .line 153
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->R:Ljava/util/Date;

    .line 154
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->S:Z

    .line 881
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$4;-><init>(Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->X:Landroid/view/View$OnClickListener;

    .line 152
    return-void
.end method

.method private a(Lo/fcv;)V
    .locals 5

    .line 299
    invoke-virtual {p1}, Lo/fcv;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->K:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->J:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 303
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->K:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->J:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 306
    :goto_0
    invoke-virtual {p1}, Lo/fcv;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->v:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff007dff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff007dff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff007dff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff007dff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->y:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff007dff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->x:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff007dff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 314
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->v:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff000000:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff000000:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff000000:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->y:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff000000:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff000000:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->x:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff000000:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 321
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->o:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/fcv;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->E:Landroid/widget/TextView;

    new-instance v1, Ljava/util/Date;

    invoke-virtual {p1}, Lo/fcv;->d()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    const/16 v2, 0x14

    invoke-static {v1, v2}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->F:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/fcv;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/fby;->c(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->r:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/fcv;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->q:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/fcv;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->u:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/fcv;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->v:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/fcv;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->t:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/fcv;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    invoke-virtual {p1}, Lo/fcv;->c()D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->d(D)V

    .line 330
    invoke-virtual {p1}, Lo/fcv;->h()I

    move-result v4

    .line 331
    const-string v0, "BeforeOneFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "progress == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mProgressBar.getProgress() == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->w:Landroid/widget/SeekBar;

    invoke-virtual {v3}, Landroid/widget/SeekBar;->getProgress()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    invoke-virtual {p1}, Lo/fcv;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lo/fcv;->k()I

    move-result v1

    invoke-direct {p0, v4, v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->d(ILjava/lang/String;I)V

    .line 333
    invoke-direct {p0, v4}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->i(I)V

    .line 335
    return-void
.end method

.method public static b(J)Ljava/lang/String;
    .locals 5

    .line 255
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 256
    invoke-virtual {v1, p0, p1}, Ljava/util/Date;->setTime(J)V

    .line 257
    const-string v2, ""

    .line 258
    const-string v2, "HH:mm"

    .line 259
    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0, v2}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 260
    invoke-virtual {v3, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 261
    return-object v4
.end method

.method private b(Landroid/view/View;)V
    .locals 2

    .line 515
    sget v0, Lcom/huawei/ui/main/R$id;->before_one_header_progress_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->A:Landroid/view/View;

    .line 516
    sget v0, Lcom/huawei/ui/main/R$id;->before_one_weight_progress_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->D:Landroid/view/View;

    .line 517
    sget v0, Lcom/huawei/ui/main/R$id;->before_one_set_goal_weight_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->C:Landroid/view/View;

    .line 518
    sget v0, Lcom/huawei/ui/main/R$id;->before_one_weight_progress:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->z:Landroid/widget/SeekBar;

    .line 519
    sget v0, Lcom/huawei/ui/main/R$id;->before_one_weight_progress_des:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->s:Landroid/widget/TextView;

    .line 521
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 522
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->D:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 523
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->C:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 524
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->A:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 526
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->D:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 527
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->C:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 528
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->A:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 531
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;I)V
    .locals 5

    .line 388
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->s:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_weekly_achieve:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 391
    :cond_0
    const-string v3, ""

    .line 392
    const-string v4, ""

    .line 393
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 394
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_measure_weight_value_unit_eng:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 396
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_measure_weight_value_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 398
    :goto_0
    if-lez p2, :cond_2

    .line 399
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_show_distance_target_weight_loss_des:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 401
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_show_distance_target_weight_gain_des:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 403
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->s:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 405
    :goto_2
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;)I
    .locals 1

    .line 110
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->i:I

    return v0
.end method

.method private d(D)V
    .locals 3

    .line 337
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v0}, Lo/cxa;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 338
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->y:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->x:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->x:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 342
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->y:Landroid/widget/TextView;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->x:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 345
    :goto_0
    return-void
.end method

.method private d(ILjava/lang/String;I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StringFormatMatches"
        }
    .end annotation

    .line 366
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 367
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 368
    if-nez p1, :cond_0

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->D:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->C:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 372
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->D:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->C:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 374
    invoke-direct {p0, p2, p3}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->c(Ljava/lang/String;I)V

    goto :goto_0

    .line 377
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->D:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->C:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 382
    :cond_2
    :goto_0
    return-void
.end method

.method private e(II)Landroid/view/View;
    .locals 8

    .line 852
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->weight_more_popwindow_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 853
    sget v0, Lcom/huawei/ui/main/R$id;->weight_more_single_button:I

    invoke-static {v3, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 854
    sget v0, Lcom/huawei/ui/main/R$id;->weight_more_divide_line:I

    invoke-static {v3, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    .line 855
    const-string v6, ""

    .line 856
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 857
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_user_profile_target:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 858
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 859
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_adjust:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 860
    :cond_1
    const/4 v0, 0x3

    if-ne v0, p1, :cond_2

    .line 861
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_main_btn_state_settings:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 864
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 865
    const/4 v0, 0x1

    if-ne v0, v7, :cond_3

    .line 866
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 868
    :cond_3
    if-lez v7, :cond_5

    .line 869
    add-int/lit8 v0, v7, -0x1

    if-ne p2, v0, :cond_4

    .line 870
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 872
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 877
    :cond_5
    :goto_1
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 878
    return-object v3
.end method

.method public static final e(I)Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;
    .locals 3

    .line 164
    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    invoke-direct {v1}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;-><init>()V

    .line 165
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 166
    const-string v0, "type"

    invoke-virtual {v2, v0, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 167
    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->setArguments(Landroid/os/Bundle;)V

    .line 168
    return-object v1
.end method

.method private e(Landroid/view/View;)V
    .locals 8

    .line 409
    sget v0, Lcom/huawei/ui/main/R$id;->hw_suggest_parent:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->p:Landroid/widget/LinearLayout;

    .line 410
    sget v0, Lcom/huawei/ui/main/R$id;->hwSubHeader:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emn;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->L:Lo/emn;

    .line 411
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-direct {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->O:Landroid/support/v7/widget/LinearLayoutManager;

    .line 412
    new-instance v0, Lo/fcn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-direct {v0, v1}, Lo/fcn;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->Q:Lo/fcn;

    .line 413
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->L:Lo/emn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emn;->setFocusableInTouchMode(Z)V

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->L:Lo/emn;

    invoke-virtual {v0}, Lo/emn;->requestFocus()Z

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->L:Lo/emn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->O:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0, v1}, Lo/emn;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 418
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_time_date_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->E:Landroid/widget/TextView;

    .line 419
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_time_week_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->F:Landroid/widget/TextView;

    .line 432
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_mid_time:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->o:Landroid/widget/TextView;

    .line 433
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_mid_weight:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->q:Landroid/widget/TextView;

    .line 434
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_mid_weight_unit:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->u:Landroid/widget/TextView;

    .line 435
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weightandfat_mid_weight:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->t:Landroid/widget/TextView;

    .line 436
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weightandfat_mid_weight_unit:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->v:Landroid/widget/TextView;

    .line 437
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_fat_mid_weight:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->y:Landroid/widget/TextView;

    .line 438
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_fat_mid_weight_unit:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->x:Landroid/widget/TextView;

    .line 439
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->u:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 440
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->v:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 441
    sget v0, Lcom/huawei/ui/main/R$id;->before_one_value_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->J:Landroid/widget/RelativeLayout;

    .line 442
    sget v0, Lcom/huawei/ui/main/R$id;->before_one_have_fat_value_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->K:Landroid/widget/LinearLayout;

    .line 443
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_mid_desc:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->r:Landroid/widget/TextView;

    .line 444
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->r:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 446
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->L:Lo/emn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emn;->setVisibility(I)V

    goto :goto_0

    .line 448
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->L:Lo/emn;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emn;->setVisibility(I)V

    .line 451
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_mid_progressbar:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->w:Landroid/widget/SeekBar;

    .line 452
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_Image_progressbar:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 454
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->e(Landroid/widget/ImageView;)V

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    invoke-virtual {v0}, Lo/fcu;->a()Landroid/view/View;

    move-result-object v6

    .line 457
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 458
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 459
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_left:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->H:Landroid/widget/ImageView;

    .line 460
    sget v0, Lcom/huawei/ui/main/R$id;->left_arrow_iv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->m:Landroid/widget/LinearLayout;

    .line 461
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_right:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->I:Landroid/widget/ImageView;

    .line 462
    sget v0, Lcom/huawei/ui/main/R$id;->right_arrow_iv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->l:Landroid/widget/LinearLayout;

    .line 463
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 464
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->H:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_right_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->I:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_left_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 467
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->H:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_left_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->I:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_right_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 470
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->I:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 471
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->H:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 472
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->l:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 473
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->m:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->m:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->l:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->H:Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->I:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/fcu;->c(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 475
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->n()V

    .line 479
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b(Landroid/view/View;)V

    .line 481
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->p()V

    .line 483
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 484
    sget v0, Lcom/huawei/ui/main/R$id;->day_message_service:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->k(I)V

    .line 486
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->day_weight_reduce_fat:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h(I)V

    .line 487
    return-void
.end method

.method private e(Landroid/widget/ImageView;)V
    .locals 1

    .line 591
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 592
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_equipment_progressbar_reversal:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 594
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_equipment_progressbar:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 596
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;)V
    .locals 0

    .line 110
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->m()V

    return-void
.end method

.method private g()Z
    .locals 3

    .line 568
    const/4 v1, 0x0

    .line 569
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->i()I

    move-result v2

    .line 570
    const/4 v0, 0x1

    if-ne v0, v2, :cond_0

    .line 571
    const/4 v1, 0x1

    .line 573
    :cond_0
    return v1
.end method

.method private h()V
    .locals 2

    .line 539
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->g:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->i:Landroid/widget/LinearLayout;

    if-nez v0, :cond_1

    .line 541
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->finish()V

    .line 542
    return-void

    .line 544
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    invoke-virtual {v0}, Lo/fcu;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 545
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 547
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 549
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    invoke-virtual {v0}, Lo/fcu;->k()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 550
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 552
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 554
    :goto_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 555
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    .line 558
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 559
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->l()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    .line 562
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 565
    :goto_2
    return-void
.end method

.method private h(I)V
    .locals 3

    .line 507
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->T:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    .line 508
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 509
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v2

    .line 510
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->T:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    invoke-virtual {v2, p1, v0}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 511
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 512
    return-void
.end method

.method private i(I)V
    .locals 2

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->j:Lo/fdz;

    invoke-virtual {v0}, Lo/fdz;->a()V

    .line 350
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->z:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    if-eq p1, v0, :cond_1

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->z:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->j:Lo/fdz;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->z:Landroid/widget/SeekBar;

    invoke-virtual {v0, p1, v1}, Lo/fdz;->c(ILandroid/widget/SeekBar;)V

    goto :goto_0

    .line 356
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->w:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    if-eq p1, v0, :cond_1

    .line 357
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->w:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->j:Lo/fdz;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->w:Landroid/widget/SeekBar;

    invoke-virtual {v0, p1, v1}, Lo/fdz;->c(ILandroid/widget/SeekBar;)V

    .line 362
    :cond_1
    :goto_0
    return-void
.end method

.method private k()Lo/fcu;
    .locals 3

    .line 206
    const/4 v2, 0x0

    .line 207
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->i:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 209
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->i:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 210
    new-instance v2, Lo/fcx;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;

    invoke-direct {v2, v0, v1}, Lo/fcx;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    goto :goto_0

    .line 212
    :cond_1
    new-instance v2, Lo/fcz;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;

    invoke-direct {v2, v0, v1}, Lo/fcz;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    .line 214
    :goto_0
    instance-of v0, v2, Lo/fcz;

    if-eqz v0, :cond_2

    .line 215
    move-object v0, v2

    check-cast v0, Lo/fcz;

    invoke-virtual {v0, p0}, Lo/fcz;->e(Lo/fdu;)V

    .line 218
    :cond_2
    return-object v2
.end method

.method private k(I)V
    .locals 7

    .line 491
    const-string v0, "BeforeOneFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showConfiguredPageFragment"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    new-instance v0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->P:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    .line 493
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 494
    const-string v0, "PAGE_TYPE"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 495
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->P:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->setArguments(Landroid/os/Bundle;)V

    .line 497
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v5

    .line 498
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v6

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->P:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v6, p1, v0}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 500
    invoke-virtual {v6}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 501
    return-void
.end method

.method private l()Z
    .locals 1

    .line 782
    invoke-static {}, Lo/ahu;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 783
    const/4 v0, 0x1

    return v0

    .line 785
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private m()V
    .locals 1

    .line 806
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->k:Lo/elp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->k:Lo/elp;

    invoke-virtual {v0}, Lo/elp;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 807
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->k:Lo/elp;

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 809
    :cond_0
    return-void
.end method

.method private n()V
    .locals 2

    .line 581
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->o:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 582
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->t:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 583
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->y:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 584
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->q:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 585
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->r:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 586
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->w:Landroid/widget/SeekBar;

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 587
    return-void
.end method

.method private o()V
    .locals 1

    .line 599
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    invoke-virtual {v0}, Lo/fcu;->c()V

    .line 601
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->C:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 604
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 605
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 607
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->J:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 608
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 609
    return-void
.end method

.method private p()V
    .locals 3

    .line 790
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->weight_more_popwindow_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->n:Landroid/view/View;

    .line 791
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->n:Landroid/view/View;

    invoke-direct {v0, v1, v2}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->k:Lo/elp;

    .line 792
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_more_list_parent:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TableLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->g:Landroid/widget/TableLayout;

    .line 793
    return-void
.end method

.method private r()Z
    .locals 2

    .line 907
    const/4 v1, 0x0

    .line 908
    invoke-static {}, Lo/ahd;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 909
    const/4 v1, 0x1

    .line 911
    :cond_0
    return v1
.end method

.method private u()V
    .locals 6

    .line 812
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->g:Landroid/widget/TableLayout;

    invoke-virtual {v0}, Landroid/widget/TableLayout;->removeAllViews()V

    .line 813
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 814
    invoke-static {}, Lo/ahu;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 815
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->G:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 817
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 818
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->G:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 824
    :cond_1
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lo/fdr;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 825
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->G:Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 828
    :cond_2
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_6

    .line 829
    new-instance v5, Landroid/widget/TableRow;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-direct {v5, v0}, Landroid/widget/TableRow;-><init>(Landroid/content/Context;)V

    .line 830
    new-instance v0, Landroid/widget/TableRow$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/TableRow$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v0}, Landroid/widget/TableRow;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 831
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->G:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0, v4}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->e(II)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TableRow;->addView(Landroid/view/View;)V

    .line 832
    if-nez v4, :cond_4

    .line 833
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 834
    sget v0, Lcom/huawei/ui/main/R$drawable;->popup_weight_user_listview_item_selector3:I

    invoke-virtual {v5, v0}, Landroid/widget/TableRow;->setBackgroundResource(I)V

    goto :goto_1

    .line 836
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$drawable;->popup_weight_user_listview_item_selector1:I

    invoke-virtual {v5, v0}, Landroid/widget/TableRow;->setBackgroundResource(I)V

    goto :goto_1

    .line 838
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v4, v0, :cond_5

    .line 839
    sget v0, Lcom/huawei/ui/main/R$drawable;->popup_weight_user_listview_item_selector2:I

    invoke-virtual {v5, v0}, Landroid/widget/TableRow;->setBackgroundResource(I)V

    goto :goto_1

    .line 841
    :cond_5
    sget v0, Lcom/huawei/ui/main/R$drawable;->popup_weight_user_listview_item_selector:I

    invoke-virtual {v5, v0}, Landroid/widget/TableRow;->setBackgroundResource(I)V

    .line 843
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->G:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/TableRow;->setId(I)V

    .line 844
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->X:Landroid/view/View$OnClickListener;

    invoke-virtual {v5, v0}, Landroid/widget/TableRow;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 845
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->g:Landroid/widget/TableLayout;

    invoke-virtual {v0, v5}, Landroid/widget/TableLayout;->addView(Landroid/view/View;)V

    .line 828
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 847
    :cond_6
    const-string v0, "BeforeOneFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "moreButtonType.size == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->G:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 848
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    invoke-virtual {v0}, Lo/fcu;->h()Lo/fcv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->M:Lo/fcv;

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->M:Lo/fcv;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->a(Lo/fcv;)V

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->N:Lo/fei;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->N:Lo/fei;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/fei;->b(Z)V

    .line 245
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    invoke-virtual {v0}, Lo/fcu;->b()Ljava/util/List;

    move-result-object v2

    .line 246
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->L:Lo/emn;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emn;->setVisibility(I)V

    goto :goto_0

    .line 248
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_2

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->L:Lo/emn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emn;->setVisibility(I)V

    .line 251
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->Q:Lo/fcn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    invoke-virtual {v1}, Lo/fcu;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fcn;->e(Ljava/util/List;)V

    .line 252
    return-void
.end method

.method public a(I)V
    .locals 4

    .line 757
    const-string v0, "BeforeOneFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processSlid  --- slid "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 758
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 759
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->H:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 760
    return-void

    .line 762
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fcu;->a(I)V

    goto :goto_0

    .line 763
    :cond_1
    const/4 v0, 0x1

    if-ne v0, p1, :cond_3

    .line 764
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->I:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    .line 765
    return-void

    .line 767
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fcu;->a(I)V

    .line 770
    :cond_3
    :goto_0
    return-void
.end method

.method protected a(Landroid/view/View;)V
    .locals 11

    .line 656
    const-string v0, "BeforeOneFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setEmptyView====="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->N:Lo/fei;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 660
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 661
    return-void

    .line 663
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->weight_no_data_title_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 664
    sget v0, Lcom/huawei/ui/main/R$id;->weight_no_data_get_data_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    .line 665
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 666
    sget v0, Lcom/huawei/ui/main/R$drawable;->pic_weight_nodata:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 667
    sget v0, Lcom/huawei/ui/main/R$drawable;->pic_weight_nodata:I

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    goto :goto_0

    .line 669
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$drawable;->weight_background:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 670
    sget v0, Lcom/huawei/ui/main/R$drawable;->weight_background:I

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 672
    :goto_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_4

    .line 673
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->N:Lo/fei;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/fei;->b(Z)V

    .line 674
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->S:Z

    if-eqz v0, :cond_3

    .line 675
    invoke-static {}, Lo/fiz;->b()Lo/fiz;

    move-result-object v6

    .line 676
    invoke-virtual {v6}, Lo/fiz;->h()J

    move-result-wide v7

    .line 677
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v9

    .line 678
    cmp-long v0, v7, v9

    if-eqz v0, :cond_2

    .line 679
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 680
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 681
    invoke-virtual {v6, v9, v10}, Lo/fiz;->a(J)V

    goto :goto_1

    .line 683
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 684
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 686
    :goto_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->S:Z

    .line 687
    sget v0, Lcom/huawei/ui/main/R$id;->no_data_day_message_service:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->k(I)V

    .line 688
    sget v0, Lcom/huawei/ui/main/R$id;->no_data_weight_reduce_fat:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h(I)V

    .line 691
    :cond_3
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$3;-><init>(Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;)V

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 700
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$5;-><init>(Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;)V

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    .line 709
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->N:Lo/fei;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/fei;->b(Z)V

    .line 711
    :goto_2
    return-void
.end method

.method public a(Lo/fei;)V
    .locals 2

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->N:Lo/fei;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 223
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->N:Lo/fei;

    .line 225
    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 1

    .line 774
    const/4 v0, -0x3

    if-ne v0, p1, :cond_0

    .line 775
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h()V

    .line 777
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 2

    .line 715
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    instance-of v0, v0, Lo/fcz;

    if-eqz v0, :cond_0

    .line 716
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    check-cast v0, Lo/fcz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fcz;->e(I)V

    .line 718
    :cond_0
    return-void
.end method

.method protected c(Landroid/view/View;)V
    .locals 2

    .line 193
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->e(Landroid/view/View;)V

    .line 194
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->o()V

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->Q:Lo/fcn;

    invoke-virtual {v0, p0}, Lo/fcn;->d(Lo/fdw;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->L:Lo/emn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->Q:Lo/fcn;

    invoke-virtual {v0, v1}, Lo/emn;->setAdapter(Lo/flg$a;)V

    .line 198
    return-void
.end method

.method public c(Ljava/util/Date;)V
    .locals 4

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    invoke-virtual {v0, p1}, Lo/fcu;->c(Ljava/util/Date;)V

    goto :goto_0

    .line 231
    :cond_0
    const-string v0, "BeforeOneFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mInteractor is null ,sendMessage failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    :goto_0
    return-void
.end method

.method public c(Z)V
    .locals 4

    .line 613
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    if-nez v0, :cond_0

    .line 614
    new-instance v0, Lo/fcz;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;

    invoke-direct {v0, v1, v2}, Lo/fcz;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    .line 616
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    instance-of v0, v0, Lo/fcz;

    if-eqz v0, :cond_1

    .line 617
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    check-cast v0, Lo/fcz;

    invoke-virtual {v0, p0}, Lo/fcz;->e(Lo/fdu;)V

    .line 622
    :cond_1
    if-nez p1, :cond_2

    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-virtual {v0}, Lo/acs;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 623
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 624
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->R:Ljava/util/Date;

    invoke-virtual {v0, v1}, Lo/fcu;->e(Ljava/util/Date;)V

    .line 625
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->B:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 626
    sget-object v0, Lo/acs;->c:Lo/acs;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/acs;->d(Z)V

    goto :goto_0

    .line 628
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    invoke-virtual {v0}, Lo/fcu;->k()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 629
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    invoke-virtual {v0}, Lo/fcu;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_5

    .line 630
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->c()V

    .line 631
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h()V

    goto :goto_0

    .line 634
    :cond_4
    const-string v0, "BeforeOneFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mInteractor.getCurrentUserWeightData() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 635
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->c()V

    .line 636
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h()V

    .line 639
    :cond_5
    :goto_0
    return-void
.end method

.method protected d(Landroid/view/View;)Landroid/view/View;
    .locals 1

    .line 643
    sget v0, Lcom/huawei/ui/main/R$id;->before_one_no_empty:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->B:Landroid/widget/ScrollView;

    .line 644
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->B:Landroid/widget/ScrollView;

    return-object v0
.end method

.method public d(I)V
    .locals 2

    .line 916
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->Q:Lo/fcn;

    invoke-virtual {v0, p1}, Lo/fcn;->e(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 917
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->Q:Lo/fcn;

    invoke-virtual {v1, p1}, Lo/fcn;->e(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fcu;->a(Ljava/lang/Object;)V

    .line 919
    :cond_0
    return-void
.end method

.method protected e()I
    .locals 1

    .line 202
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_before_one_view:I

    return v0
.end method

.method public f()V
    .locals 3

    .line 797
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->k:Lo/elp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->k:Lo/elp;

    invoke-virtual {v0}, Lo/elp;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 798
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->u()V

    .line 799
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->k:Lo/elp;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->n:Landroid/view/View;

    invoke-virtual {v0, v1}, Lo/elp;->e(Landroid/view/View;)V

    .line 800
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->k:Lo/elp;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->e:Lo/ems;

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Lo/elp;->c(Landroid/view/View;I)V

    .line 802
    :cond_0
    return-void
.end method

.method protected i()V
    .locals 2

    .line 187
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->k()Lo/fcu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    .line 188
    new-instance v0, Lo/fdz;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;

    invoke-direct {v0, v1}, Lo/fdz;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->j:Lo/fdz;

    .line 189
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 742
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->l:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_0

    .line 743
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fcu;->a(I)V

    goto :goto_0

    .line 744
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->m:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_1

    .line 745
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fcu;->a(I)V

    goto :goto_0

    .line 746
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->J:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_2

    .line 747
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    instance-of v0, v0, Lo/fcz;

    if-eqz v0, :cond_2

    .line 748
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 749
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    check-cast v0, Lo/fcz;

    invoke-virtual {v0}, Lo/fcz;->p()V

    .line 753
    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 175
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->onCreate(Landroid/os/Bundle;)V

    .line 176
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 177
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->i:I

    .line 179
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->S:Z

    .line 180
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->h:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    .line 181
    invoke-static {p0}, Lo/ffb;->setUserSlidWeightDayViewListener(Lo/ffb$a;)V

    .line 183
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 722
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->onDestroy()V

    .line 723
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->j:Lo/fdz;

    if-eqz v0, :cond_0

    .line 724
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->j:Lo/fdz;

    invoke-virtual {v0}, Lo/fdz;->a()V

    .line 726
    :cond_0
    invoke-static {}, Lo/ffb;->b()V

    .line 728
    sget-object v0, Lo/acs;->c:Lo/acs;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/acs;->d(Z)V

    .line 729
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 733
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->onResume()V

    .line 734
    const-string v0, "BeforeOneFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 735
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    instance-of v0, v0, Lo/fcz;

    if-eqz v0, :cond_0

    .line 736
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    check-cast v0, Lo/fcz;

    invoke-virtual {v0}, Lo/fcz;->g()V

    .line 738
    :cond_0
    return-void
.end method

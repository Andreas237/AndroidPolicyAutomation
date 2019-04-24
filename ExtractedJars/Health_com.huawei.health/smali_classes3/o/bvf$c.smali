.class public Lo/bvf$c;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bvf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Lo/efy;

.field private b:Landroid/widget/ImageView;

.field private c:Lo/efy;

.field private d:Lo/efy;

.field private e:Lo/efy;

.field private h:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 322
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 323
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_show_fit_child_item_chief_fit_data_text:I

    .line 324
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvf$c;->a:Lo/efy;

    .line 325
    sget v0, Lcom/huawei/health/suggestion/R$id;->wear_type_imageView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bvf$c;->b:Landroid/widget/ImageView;

    .line 326
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_show_fit_child_item_left_date_text:I

    .line 327
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvf$c;->e:Lo/efy;

    .line 328
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_show_fit_item_center_text:I

    .line 329
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvf$c;->d:Lo/efy;

    .line 330
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_fit_history_child_item_right_text:I

    .line 331
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvf$c;->c:Lo/efy;

    .line 332
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_show_main_layout_fit_history_bottom_image_interval:I

    .line 333
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bvf$c;->h:Landroid/widget/ImageView;

    .line 336
    return-void
.end method

.method private b(J)Ljava/lang/String;
    .locals 3

    .line 387
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "Md"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 388
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lo/bvf$c;)Lo/efy;
    .locals 1

    .line 312
    iget-object v0, p0, Lo/bvf$c;->a:Lo/efy;

    return-object v0
.end method


# virtual methods
.method public d(Lcom/huawei/health/suggestion/model/WorkoutRecord;Z)V
    .locals 7

    .line 342
    iget-object v0, p0, Lo/bvf$c;->itemView:Landroid/view/View;

    new-instance v1, Lo/bvf$c$2;

    invoke-direct {v1, p0, p1}, Lo/bvf$c$2;-><init>(Lo/bvf$c;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 354
    iget-object v0, p0, Lo/bvf$c;->a:Lo/efy;

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 357
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWearType()I

    move-result v2

    .line 358
    const/4 v0, 0x2

    if-ne v0, v2, :cond_0

    .line 359
    iget-object v0, p0, Lo/bvf$c;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->ic_watchwear_gray_2:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 360
    iget-object v0, p0, Lo/bvf$c;->b:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 361
    :cond_0
    const/4 v0, 0x1

    if-ne v0, v2, :cond_1

    .line 362
    iget-object v0, p0, Lo/bvf$c;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->ic_watchwear_gray_1:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 363
    iget-object v0, p0, Lo/bvf$c;->b:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 365
    :cond_1
    iget-object v0, p0, Lo/bvf$c;->b:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 368
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v3

    .line 369
    iget-object v0, p0, Lo/bvf$c;->e:Lo/efy;

    invoke-direct {p0, v3, v4}, Lo/bvf$c;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 371
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    invoke-static {v0}, Lo/bzr;->d(F)F

    move-result v0

    invoke-static {v0}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v5

    .line 373
    iget-object v0, p0, Lo/bvf$c;->c:Lo/efy;

    invoke-virtual {v0, v5}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 375
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v6

    .line 376
    iget-object v0, p0, Lo/bvf$c;->d:Lo/efy;

    div-int/lit16 v1, v6, 0x3e8

    invoke-static {v1}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 378
    if-eqz p2, :cond_2

    .line 379
    iget-object v0, p0, Lo/bvf$c;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 381
    :cond_2
    iget-object v0, p0, Lo/bvf$c;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 384
    :goto_1
    return-void
.end method

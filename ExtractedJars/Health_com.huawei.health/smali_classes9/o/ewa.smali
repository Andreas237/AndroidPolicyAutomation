.class public Lo/ewa;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/Space;

.field private f:Landroid/widget/Space;

.field private g:Lo/dch;

.field private h:Ljava/lang/String;

.field private i:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 4

    .line 57
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 58
    iput-object p1, p0, Lo/ewa;->i:Landroid/content/Context;

    .line 59
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_no_data_service_layout:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ewa;->d:Landroid/widget/LinearLayout;

    .line 60
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_no_data_service_image:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ewa;->a:Landroid/widget/ImageView;

    .line 61
    iget-object v0, p0, Lo/ewa;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 62
    iget-object v0, p0, Lo/ewa;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 63
    iget-object v0, p0, Lo/ewa;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lo/ewa;->i:Landroid/content/Context;

    const v1, 0x42ba999a    # 93.3f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 65
    iget-object v0, p0, Lo/ewa;->i:Landroid/content/Context;

    const v1, 0x43294ccd    # 169.3f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_0

    .line 67
    :cond_0
    iget-object v0, p0, Lo/ewa;->i:Landroid/content/Context;

    const/high16 v1, 0x42b00000    # 88.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 68
    iget-object v0, p0, Lo/ewa;->i:Landroid/content/Context;

    const/high16 v1, 0x43200000    # 160.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 70
    :goto_0
    iget-object v0, p0, Lo/ewa;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    iget-object v0, p0, Lo/ewa;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 72
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_no_data_service_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ewa;->c:Landroid/widget/TextView;

    .line 73
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_no_data_service_content:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ewa;->b:Landroid/widget/TextView;

    .line 74
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_service_linear_left_padding:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Space;

    iput-object v0, p0, Lo/ewa;->e:Landroid/widget/Space;

    .line 75
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_service_linear_right_padding:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Space;

    iput-object v0, p0, Lo/ewa;->f:Landroid/widget/Space;

    .line 76
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getUserID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ewa;->h:Ljava/lang/String;

    .line 79
    return-void
.end method

.method static synthetic a(Lo/ewa;)Lo/dch;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/ewa;->g:Lo/dch;

    return-object v0
.end method

.method static synthetic c(Lo/ewa;Lo/dch;)Lo/dch;
    .locals 0

    .line 43
    iput-object p1, p0, Lo/ewa;->g:Lo/dch;

    return-object p1
.end method

.method static synthetic d(Lo/ewa;)Landroid/content/Context;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/ewa;->i:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lo/ewa;)Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/ewa;->h:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public d(Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;IZZ)V
    .locals 5

    .line 82
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 83
    return-void

    .line 85
    :cond_0
    if-eqz p3, :cond_1

    .line 86
    iget-object v0, p0, Lo/ewa;->e:Landroid/widget/Space;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Space;->setVisibility(I)V

    goto :goto_0

    .line 88
    :cond_1
    iget-object v0, p0, Lo/ewa;->e:Landroid/widget/Space;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Space;->setVisibility(I)V

    .line 91
    :goto_0
    if-eqz p4, :cond_2

    .line 92
    iget-object v0, p0, Lo/ewa;->f:Landroid/widget/Space;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Space;->setVisibility(I)V

    goto :goto_1

    .line 94
    :cond_2
    iget-object v0, p0, Lo/ewa;->f:Landroid/widget/Space;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Space;->setVisibility(I)V

    .line 96
    :goto_1
    iget-object v0, p0, Lo/ewa;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    iget-object v0, p0, Lo/ewa;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/ewa;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "recommendcloud"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "sleepServiceConfig"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "res"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 100
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 102
    iget-object v0, p0, Lo/ewa;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->load(Ljava/io/File;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    new-instance v1, Lo/fiw;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lo/fiw;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->transform(Lcom/squareup/picasso/Transformation;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/picasso/RequestCreator;->fit()Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->pic_sleepservice_banner_bg:I

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->error(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v1, p0, Lo/ewa;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 104
    :cond_3
    iget-object v0, p0, Lo/ewa;->itemView:Landroid/view/View;

    new-instance v1, Lo/ewa$1;

    invoke-direct {v1, p0, p1, p2}, Lo/ewa$1;-><init>(Lo/ewa;Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    return-void
.end method

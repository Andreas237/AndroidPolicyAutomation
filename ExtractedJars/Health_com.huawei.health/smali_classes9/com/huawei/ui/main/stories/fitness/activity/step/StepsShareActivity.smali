.class public Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$c;,
        Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$a;
    }
.end annotation


# instance fields
.field private A:D

.field private B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private C:Ljava/util/Date;

.field private D:D

.field private E:Landroid/content/Context;

.field private F:Landroid/os/Handler;

.field private G:I

.field private H:Lcom/huawei/up/model/UserInfomation;

.field private I:Ljava/util/Date;

.field private a:Landroid/view/View;

.field protected b:Landroid/graphics/drawable/AnimationDrawable;

.field c:Lo/dav;

.field private d:Landroid/view/View;

.field private e:Landroid/view/View;

.field private f:Landroid/widget/TextView;

.field private g:I

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:D

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/ImageView;

.field private r:Landroid/widget/TextView;

.field private s:Lo/emr;

.field private t:Lo/eyf;

.field private u:Landroid/widget/ImageView;

.field private v:Lo/cmj;

.field private w:Ljava/util/Date;

.field private x:Landroid/graphics/drawable/BitmapDrawable;

.field private y:Landroid/widget/Button;

.field private z:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e:Landroid/view/View;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->d:Landroid/view/View;

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->g:I

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->x:Landroid/graphics/drawable/BitmapDrawable;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->z:Landroid/graphics/Bitmap;

    .line 100
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->j:D

    .line 101
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->A:D

    .line 102
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->D:D

    .line 115
    new-instance v0, Lo/dav;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo/dav;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c:Lo/dav;

    .line 241
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->F:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;D)D
    .locals 0

    .line 60
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->D:D

    return-wide p1
.end method

.method public static a(J)J
    .locals 3

    .line 626
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 627
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 628
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 629
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 630
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 631
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 632
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/content/Context;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->E:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->z:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method private a()V
    .locals 4

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->rl_share_before:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->ll_share_after:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->d:Landroid/view/View;

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->d:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->tv_share_steps_title_avg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->f:Landroid/widget/TextView;

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->tv_share_steps_content_avg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->k:Landroid/widget/TextView;

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->tv_share_content_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->h:Landroid/widget/TextView;

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->tv_share_title_calories:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->i:Landroid/widget/TextView;

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->tv_share_content_calories:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->m:Landroid/widget/TextView;

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->tv_share_content_calories_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->p:Landroid/widget/TextView;

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->tv_share_title_distance:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->n:Landroid/widget/TextView;

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->tv_share_content_distance:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->o:Landroid/widget/TextView;

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->tv_share_content_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->l:Landroid/widget/TextView;

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->view_share_barchart:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eyf;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t:Lo/eyf;

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->img_share_loading:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->q:Landroid/widget/ImageView;

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->tv_share_username:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->r:Landroid/widget/TextView;

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->img_share_userphoto:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->u:Landroid/widget/ImageView;

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->steps_detail_share_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s:Lo/emr;

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_share_activity_detail_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setVisibility(I)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->steps_detail_share_btn:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->y:Landroid/widget/Button;

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->y:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->y:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->r:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->u:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->r:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->u:Landroid/widget/ImageView;

    invoke-static {p0, v0, v1}, Lo/fiy;->b(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    goto :goto_0

    .line 197
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->r:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->u:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 200
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->F:Landroid/os/Handler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->F:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 202
    return-void
.end method

.method private a(F)V
    .locals 15

    .line 639
    const/4 v5, 0x0

    .line 640
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 641
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "goalValue"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->G:I

    .line 642
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mStartDay"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->C:Ljava/util/Date;

    .line 643
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mEndDay"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->I:Ljava/util/Date;

    .line 644
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "barData"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 645
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 646
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->F:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 647
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->F:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 648
    return-void

    .line 650
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->B:Ljava/util/List;

    .line 651
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 652
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->B:Ljava/util/List;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide v1

    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    cmpl-double v1, v1, v3

    if-nez v1, :cond_2

    const-wide/16 v1, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide v1

    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 651
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 656
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->B:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->b(Ljava/util/List;)V

    .line 657
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI barData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->B:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    iget v6, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->G:I

    .line 661
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->B:Ljava/util/List;

    invoke-static {v0}, Lo/fiy;->e(Ljava/util/List;)D

    move-result-wide v7

    .line 662
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI 1 maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  goalValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->G:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 663
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->G:I

    int-to-double v0, v0

    const-wide v2, 0x3fe9c18fa0000000L    # 0.8048780560493469

    mul-double/2addr v0, v2

    cmpg-double v0, v7, v0

    if-gez v0, :cond_4

    .line 664
    const/4 v6, 0x0

    .line 667
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t:Lo/eyf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 669
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t:Lo/eyf;

    const/4 v1, 0x1

    move/from16 v2, p1

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(F)V

    .line 671
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t:Lo/eyf;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->white:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 672
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->white:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 671
    invoke-virtual {v0, v1, v2}, Lo/eyf;->setBarColor(II)V

    .line 673
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t:Lo/eyf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eyf;->a(Z)V

    .line 676
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 677
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 678
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->C:Ljava/util/Date;

    const/16 v1, 0x18

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v10

    .line 679
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v10, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v9, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v11

    .line 680
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "00000"

    invoke-virtual {v0, v9, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v12

    .line 681
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t:Lo/eyf;

    invoke-virtual {v0, v11, v12}, Lo/eyf;->setPadding(FF)V

    .line 683
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t:Lo/eyf;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(Ljava/lang/String;)V

    .line 685
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t:Lo/eyf;

    double-to-int v1, v7

    int-to-double v1, v1

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->G:I

    int-to-double v3, v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/eyf;->a(DD)D

    move-result-wide v7

    .line 686
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI 2 maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  goalValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->G:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  targetValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 687
    invoke-static {v7, v8}, Lo/exj;->e(D)D

    move-result-wide v7

    .line 688
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI 3 maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  goalValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->G:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  targetValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 689
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t:Lo/eyf;

    invoke-virtual {v0, v7, v8}, Lo/eyf;->a(D)V

    .line 690
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 691
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 692
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    .line 693
    int-to-double v0, v6

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 695
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->B:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/eyf;->e(Ljava/util/List;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v0, v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->j:D

    .line 697
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t:Lo/eyf;

    invoke-virtual {v0, v13}, Lo/eyf;->c(Ljava/util/ArrayList;)V

    .line 698
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t:Lo/eyf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 700
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->g:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    .line 701
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 702
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mTotalSteps"

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->D:D

    double-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    int-to-double v0, v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->D:D

    .line 703
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "yearValidSize"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v14

    .line 704
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "validSize is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 705
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->j:D

    .line 706
    if-lez v14, :cond_6

    .line 707
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->D:D

    int-to-double v2, v14

    div-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->j:D

    .line 711
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->C:Ljava/util/Date;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->I:Ljava/util/Date;

    invoke-direct {p0, p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e(Landroid/content/Context;Ljava/util/Date;Ljava/util/Date;)V

    goto :goto_2

    .line 713
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->F:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v14

    .line 714
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->F:Landroid/os/Handler;

    invoke-virtual {v0, v14}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 716
    :goto_2
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end of updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 718
    :cond_8
    return-void
.end method

.method private a(I)V
    .locals 4

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->q:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->b:Landroid/graphics/drawable/AnimationDrawable;

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->q:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->b:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 316
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 318
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_step_today_step:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_start_track_target_type_calorie:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_sport_distance:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 322
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 325
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 330
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mCurrentDay"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->w:Ljava/util/Date;

    .line 332
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->w:Ljava/util/Date;

    if-nez v0, :cond_2

    .line 333
    return-void

    .line 335
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->w:Ljava/util/Date;

    const v2, 0x10018

    invoke-static {v1, v2}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 337
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCurrentDay="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->w:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " System.currentTimeMillis()="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->w:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/fiy;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 340
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->d()V

    goto/16 :goto_1

    .line 342
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->w:Ljava/util/Date;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a(Landroid/content/Context;Ljava/util/Date;)V

    .line 345
    goto/16 :goto_1

    .line 347
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_steps_share_week_average:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_steps_share_daily_max:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_step_data_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->l:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 354
    const/high16 v0, 0x41300000    # 11.0f

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a(F)V

    .line 356
    goto/16 :goto_1

    .line 358
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_steps_share_month_average:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 359
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_steps_share_daily_max:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 360
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_step_data_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 361
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->l:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 364
    const/high16 v0, 0x40a00000    # 5.0f

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a(F)V

    .line 366
    goto :goto_1

    .line 368
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_steps_share_year_average:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_steps_share_daily_max:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_step_data_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->l:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 374
    const/high16 v0, 0x41100000    # 9.0f

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a(F)V

    .line 376
    .line 380
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private a(Landroid/content/Context;Ljava/util/Date;)V
    .locals 6

    .line 443
    new-instance v3, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v3}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 444
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a(J)J

    move-result-wide v4

    .line 445
    invoke-virtual {v3, v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 446
    const-wide/32 v0, 0x5265bff

    add-long/2addr v0, v4

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 447
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 450
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "step_sum"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "calorie_sum"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "distance_sum"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 451
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 452
    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 453
    invoke-static {p1}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$c;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$c;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;I)V

    invoke-virtual {v0, v3, v1}, Lo/clq;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 454
    return-void

    nop

    :array_0
    .array-data 4
        0x9c42
        0x9c43
        0x9c44
    .end array-data
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)I
    .locals 1

    .line 60
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->g:I

    return v0
.end method

.method private b(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 596
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 598
    invoke-static {p1}, Lo/fiy;->e(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->A:D

    .line 599
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 600
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->D:D

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->D:D

    .line 599
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 602
    :cond_0
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->D:D

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->j:D

    .line 604
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;D)D
    .locals 0

    .line 60
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->j:D

    return-wide p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/view/View;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;D)D
    .locals 0

    .line 60
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->A:D

    return-wide p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/graphics/Bitmap;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->z:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/up/model/UserInfomation;
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->H:Lcom/huawei/up/model/UserInfomation;

    return-object p1
.end method

.method private d()V
    .locals 5

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->v:Lo/cmj;

    if-eqz v0, :cond_0

    .line 384
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->v:Lo/cmj;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$a;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)V

    invoke-virtual {v0, v1}, Lo/cmj;->e(Lo/cmo;)Z

    goto :goto_0

    .line 386
    :cond_0
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHealthOpenSDK ==null ,get data failed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->F:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 388
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->F:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 390
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D
    .locals 2

    .line 60
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->j:D

    return-wide v0
.end method

.method private e()V
    .locals 18

    .line 744
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScreenCutAnimation enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 747
    const/4 v0, 0x1

    const/high16 v1, 0x43c80000    # 400.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v9

    .line 748
    const/4 v0, 0x1

    const/high16 v1, 0x43610000    # 225.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v10

    .line 750
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v11

    .line 751
    invoke-virtual {v11}, Landroid/view/Display;->getWidth()I

    move-result v12

    .line 752
    invoke-virtual {v11}, Landroid/view/Display;->getHeight()I

    move-result v13

    .line 754
    int-to-float v0, v12

    div-float v14, v10, v0

    .line 755
    int-to-float v0, v13

    div-float v15, v9, v0

    .line 756
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScreenCutAnimation scaleX="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " scaleY="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 757
    cmpl-float v0, v14, v15

    if-lez v0, :cond_0

    move/from16 v16, v14

    goto :goto_0

    :cond_0
    move/from16 v16, v15

    .line 759
    :goto_0
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    move/from16 v2, v16

    move/from16 v4, v16

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    move-object/from16 v17, v0

    .line 761
    move-object/from16 v0, v17

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 763
    move-object/from16 v0, v17

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setRepeatCount(I)V

    .line 764
    move-object/from16 v0, v17

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setFillAfter(Z)V

    .line 765
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$1;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)V

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/view/animation/ScaleAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 783
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a:Landroid/view/View;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 784
    return-void
.end method

.method private e(Landroid/content/Context;Ljava/util/Date;Ljava/util/Date;)V
    .locals 9

    .line 458
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 459
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a(J)J

    move-result-wide v5

    .line 460
    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a(J)J

    move-result-wide v7

    .line 461
    invoke-virtual {v4, v5, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 462
    invoke-virtual {v4, v7, v8}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 463
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 464
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "step_max"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 465
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDayMaxStepsOfYear..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 467
    const/4 v0, 0x7

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 468
    invoke-static {p1}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$c;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$c;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;I)V

    invoke-virtual {v0, v4, v1}, Lo/clq;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 470
    return-void

    nop

    :array_0
    .array-data 4
        0x9c42
    .end array-data
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a(I)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->o:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D
    .locals 2

    .line 60
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->D:D

    return-wide v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->m:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D
    .locals 2

    .line 60
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->A:D

    return-wide v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->k:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/Date;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->C:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Lo/eyf;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t:Lo/eyf;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/Date;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->I:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->h:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/List;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->B:Ljava/util/List;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/view/View;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e:Landroid/view/View;

    return-object v0
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->q:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/os/Handler;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->F:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e()V

    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Lcom/huawei/up/model/UserInfomation;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->H:Lcom/huawei/up/model/UserInfomation;

    return-object v0
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/Button;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->y:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic w(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/view/View;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->d:Landroid/view/View;

    return-object v0
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Lo/emr;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s:Lo/emr;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 5

    .line 205
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 207
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 208
    return-void

    .line 210
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 211
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 212
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission isnotHasPermissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 214
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 215
    :goto_0
    if-nez v4, :cond_3

    .line 216
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    .line 217
    return-void

    .line 220
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 221
    goto :goto_1

    .line 222
    :cond_4
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 226
    :cond_5
    :goto_1
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 4

    .line 724
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$4;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;Landroid/content/Context;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 741
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 120
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 121
    iput-object p0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->E:Landroid/content/Context;

    .line 122
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->activity_steps_share_detail:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e:Landroid/view/View;

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->setContentView(Landroid/view/View;)V

    .line 124
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 125
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "index"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->g:I

    .line 127
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a()V

    .line 128
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 588
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy reycle bitmap and drawable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->x:Landroid/graphics/drawable/BitmapDrawable;

    .line 590
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->z:Landroid/graphics/Bitmap;

    .line 591
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 593
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 230
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCode=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 232
    array-length v0, p2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 233
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission success"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 236
    :cond_0
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission Failed"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    :cond_1
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 132
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume mDrawable="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->x:Landroid/graphics/drawable/BitmapDrawable;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "mBitmap="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->z:Landroid/graphics/Bitmap;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->v:Lo/cmj;

    if-nez v0, :cond_0

    .line 134
    invoke-static {p0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgb;->c()Lo/cmj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->v:Lo/cmj;

    .line 136
    :cond_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 137
    return-void
.end method

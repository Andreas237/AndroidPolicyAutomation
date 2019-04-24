.class public Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$b;
    }
.end annotation


# static fields
.field private static i:Landroid/os/Handler;

.field private static l:J

.field private static n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private static p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lo/egd;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Lo/egd;

.field private e:Lo/dlz;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/util/concurrent/ExecutorService;

.field private k:Landroid/content/Context;

.field private m:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 112
    new-instance v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$2;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$2;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->m:Landroid/widget/LinearLayout;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)Landroid/content/Context;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a()Landroid/os/Handler;
    .locals 1

    .line 58
    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->i:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(J)J
    .locals 0

    .line 58
    sput-wide p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->l:J

    return-wide p0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->f:Ljava/lang/String;

    return-object p1
.end method

.method private b()V
    .locals 3

    .line 156
    sget v0, Lcom/huawei/ui/main/R$id;->dialog_text_alert_btn_negative:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->d:Lo/egd;

    .line 157
    sget v0, Lcom/huawei/ui/main/R$id;->dialog_text_alert_btn_positive:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a:Lo/egd;

    .line 158
    sget v0, Lcom/huawei/ui/main/R$id;->custom_text_shop_dailog_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->c:Landroid/widget/TextView;

    .line 159
    sget v0, Lcom/huawei/ui/main/R$id;->custom_text_shop_dailog_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->b:Landroid/widget/TextView;

    .line 160
    sget v0, Lcom/huawei/ui/main/R$id;->custom_text_shop_dailog_container:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->m:Landroid/widget/LinearLayout;

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->d:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_setting_go_see:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->d:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 167
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->h()V

    .line 169
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->d()V

    return-void
.end method

.method private static b(JJJ)Z
    .locals 4

    .line 257
    const-string v0, "WeightRecommendActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    const-string v0, "WeightRecommendActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "endTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    const-string v0, "WeightRecommendActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "localTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    cmp-long v0, p0, p2

    if-ltz v0, :cond_0

    cmp-long v0, p0, p4

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic c()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 58
    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic c(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 58
    sput-object p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    return-object p0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->g:Ljava/lang/String;

    return-object p1
.end method

.method private d()V
    .locals 5

    .line 142
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_weight_recommend_dialog:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->setContentView(I)V

    .line 143
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->getWindow()Landroid/view/Window;

    move-result-object v3

    .line 144
    const/16 v0, 0x50

    invoke-virtual {v3, v0}, Landroid/view/Window;->setGravity(I)V

    .line 145
    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v4

    .line 146
    const/4 v0, -0x1

    iput v0, v4, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 147
    const/4 v0, -0x2

    iput v0, v4, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 148
    const v0, 0x3f19999a    # 0.6f

    iput v0, v4, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 149
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 150
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 151
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 152
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->b()V

    .line 153
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)Lo/dlz;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->e:Lo/dlz;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 99
    const-string v0, "WeightRecommendActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showRecommendDialog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->h:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    :cond_0
    const-string v0, "WeightRecommendActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executorService is shutdown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->h:Ljava/util/concurrent/ExecutorService;

    .line 104
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$4;-><init>(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 110
    return-void
.end method

.method private h()V
    .locals 21

    .line 180
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 181
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, 0x0

    const/4 v1, -0x2

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v12, v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 182
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {v12, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 184
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v13

    .line 185
    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 186
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    const-string v1, "1"

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->g:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/fhv;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    const/4 v14, 0x0

    :goto_0
    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v14, v0, :cond_3

    .line 189
    sget v0, Lcom/huawei/ui/main/R$layout;->commonui_custom_goods_item:I

    const/4 v1, 0x0

    invoke-virtual {v13, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 190
    sget v0, Lcom/huawei/ui/main/R$id;->custom_text_alert_dailog_name:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 191
    sget v0, Lcom/huawei/ui/main/R$id;->custom_text_alert_dailog_cost:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 192
    sget v0, Lcom/huawei/ui/main/R$id;->custom_text_alert_dailog_img:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/widget/ImageView;

    .line 194
    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getOriginalPrice()Ljava/lang/String;

    move-result-object v9

    .line 195
    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getDiscountPrice()Ljava/lang/String;

    move-result-object v10

    .line 200
    sget-wide v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->l:J

    sget-object v2, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v2}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getDicountStartTime()J

    move-result-wide v2

    sget-object v4, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    invoke-interface {v4, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v4}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getDiscountEndTime()J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->b(JJJ)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v11, v10

    goto :goto_1

    :cond_0
    move-object v11, v9

    .line 202
    :goto_1
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 203
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 205
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getName()Ljava/lang/String;

    move-result-object v16

    .line 206
    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 207
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_last_suggest_kind"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 209
    const-string v0, "WeightRecommendActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lastRecommendStr = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v17, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "show_service"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 211
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 213
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u00a5 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 216
    :goto_2
    sget v0, Lcom/huawei/ui/main/R$drawable;->message_ad:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/fis;->a(ILandroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v18

    .line 217
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_messageCenter_ad_logo:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v19

    .line 218
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    sget-object v1, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v1}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->pic_popup_device:I

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->placeholder(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->pic_popup_device:I

    .line 219
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->error(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    const/high16 v2, 0x42900000    # 72.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    .line 220
    const/high16 v3, 0x42900000    # 72.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    .line 219
    invoke-virtual {v0, v1, v2}, Lcom/squareup/picasso/RequestCreator;->resize(II)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    .line 220
    invoke-virtual {v0}, Lcom/squareup/picasso/RequestCreator;->centerCrop()Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$3;

    move-object/from16 v2, p0

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-direct {v1, v2, v15, v3, v4}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$3;-><init>(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;Landroid/widget/ImageView;Landroid/graphics/Bitmap;Ljava/lang/String;)V

    invoke-virtual {v0, v15, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;Lcom/squareup/picasso/Callback;)V

    .line 238
    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getPurchaseUrl()Ljava/lang/String;

    move-result-object v20

    .line 239
    new-instance v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$1;

    move-object/from16 v1, p0

    move-object/from16 v2, v20

    move-object/from16 v3, v16

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$1;-><init>(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 251
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 187
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    .line 254
    :cond_3
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a:Lo/egd;

    if-ne p1, v0, :cond_1

    .line 267
    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    sget-object v1, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v1}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fhv;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 269
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 270
    const-string v0, "url"

    sget-object v1, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v1}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getPurchaseUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 271
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, 0x3

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 273
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->finish()V

    .line 274
    goto :goto_0

    .line 275
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->finish()V

    goto :goto_0

    .line 277
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->d:Lo/egd;

    if-ne p1, v0, :cond_2

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    const-string v1, "2"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->g:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/fhv;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->finish()V

    .line 281
    :cond_2
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 79
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 80
    iput-object p0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    .line 81
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->finish()V

    .line 83
    return-void

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dmn;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 86
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->finish()V

    .line 87
    return-void

    .line 89
    :cond_1
    new-instance v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$b;-><init>(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)V

    sput-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->i:Landroid/os/Handler;

    .line 90
    new-instance v0, Lo/dlz;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dlz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->e:Lo/dlz;

    .line 91
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->h:Ljava/util/concurrent/ExecutorService;

    .line 92
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->e()V

    .line 93
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 314
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 315
    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 316
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->i:Landroid/os/Handler;

    .line 318
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->h:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_1

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 322
    :cond_1
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 326
    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    sget-object v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 327
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->k:Landroid/content/Context;

    const-string v1, "2"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->g:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/fhv;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

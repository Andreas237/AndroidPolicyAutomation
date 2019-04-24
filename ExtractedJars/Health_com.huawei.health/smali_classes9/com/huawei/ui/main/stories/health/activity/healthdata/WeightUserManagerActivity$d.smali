.class Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/view/LayoutInflater;

.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acu;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/acu;>;)V"
        }
    .end annotation

    .line 329
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 327
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->c:Ljava/util/List;

    .line 330
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->a:Landroid/view/LayoutInflater;

    .line 331
    invoke-direct {p0, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->b(Ljava/util/List;)V

    .line 332
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/acu;>;)V"
        }
    .end annotation

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 337
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->notifyDataSetChanged()V

    .line 338
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;Ljava/util/List;)V
    .locals 0

    .line 324
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->b(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public b(I)Lo/acu;
    .locals 4

    .line 348
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    .line 349
    :cond_0
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "position param exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    const/4 v0, 0x0

    return-object v0

    .line 352
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acu;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 324
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->b(I)Lo/acu;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 357
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 362
    const/4 v4, 0x0

    .line 363
    if-nez p2, :cond_0

    .line 364
    new-instance v4, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;

    invoke-direct {v4, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;)V

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/main/R$layout;->item_weight_user_manager_list_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 366
    sget v0, Lcom/huawei/ui/main/R$id;->item_weight_current_user_photo:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 367
    sget v0, Lcom/huawei/ui/main/R$id;->item_right_title_text:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 368
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_weight_user_manager_arrow:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 369
    sget v0, Lcom/huawei/ui/main/R$id;->user_manager_line:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;Landroid/view/View;)Landroid/view/View;

    .line 370
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 372
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;

    .line 374
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v1, p1, 0x1

    if-ne v0, v1, :cond_1

    .line 375
    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 377
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 380
    :goto_1
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->b(I)Lo/acu;

    move-result-object v5

    .line 382
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-static {v0, v5, v1, v2}, Lo/fdr;->a(Landroid/content/Context;Lo/acu;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    goto :goto_2

    .line 385
    :cond_2
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserNameAndPhoto user is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 388
    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_left_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3

    .line 390
    :cond_3
    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d$a;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 392
    :goto_3
    return-object p2
.end method

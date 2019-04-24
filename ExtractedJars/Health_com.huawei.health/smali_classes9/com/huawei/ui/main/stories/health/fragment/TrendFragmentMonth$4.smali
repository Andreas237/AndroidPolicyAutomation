.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V
    .locals 0

    .line 215
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 15

    .line 218
    move-object/from16 v0, p1

    invoke-super {p0, v0}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 220
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity isn\'t exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    return-void

    .line 223
    :cond_0
    move-object/from16 v0, p1

    iget v0, v0, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_f

    .line 225
    :pswitch_0
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage()GET_HEALTH_DATA_GOAL_SECCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    move-object/from16 v1, p1

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/util/List;)Ljava/util/List;

    .line 228
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "goalDataList=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 230
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;I)I

    .line 233
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "goalValue=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;F)F

    .line 237
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;F)F

    .line 230
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_3
    goto :goto_1

    .line 243
    :cond_4
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goalValue is MyTargetActivity.WEIGHT_MATCH_VALUE =60"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    const/16 v1, 0x3c

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;I)I

    .line 245
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    const-wide/high16 v1, 0x404e000000000000L    # 60.0

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    double-to-int v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;I)I

    .line 248
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;F)F

    .line 251
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;F)F

    .line 255
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Lo/fdn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F

    move-result v2

    const/16 v3, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fet;->i(I)V

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 262
    goto/16 :goto_f

    .line 264
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_8

    goto/16 :goto_f

    .line 279
    :cond_8
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UPDATE_UI timeType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_f

    .line 283
    :cond_9
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UPDATE_UI mLoadingLayout = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    goto/16 :goto_f

    .line 287
    :pswitch_2
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->n(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_data_month_average:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->t(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 293
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 294
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValueAndUint() lb isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;->d()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->r(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-virtual {v6, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->floatValue()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 297
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;->e()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->u(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-virtual {v6, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->floatValue()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 302
    goto/16 :goto_2

    .line 303
    :cond_a
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValueAndUint() kg isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;->d()F

    move-result v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->r(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-virtual {v6, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->floatValue()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 306
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;->e()F

    move-result v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->u(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-virtual {v6, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->floatValue()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    :goto_2
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;->c()F

    move-result v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-virtual {v6, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->floatValue()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->t(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 323
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;->d()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_b

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->r(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 327
    :cond_b
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;->c()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_c

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->t(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 331
    :cond_c
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;->e()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_21

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->u(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_f

    .line 337
    :pswitch_3
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 342
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 343
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValueAndUint() lb isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->e()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 345
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->c()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 346
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 349
    :cond_d
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 351
    :goto_3
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->a()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 352
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->i()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v11

    .line 353
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 354
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 356
    :cond_e
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 358
    :goto_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 359
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 360
    goto/16 :goto_8

    .line 361
    :cond_f
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValueAndUint() kg isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->e()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 363
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->c()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 364
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 366
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->C(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 368
    :cond_10
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->C(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 371
    :goto_5
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->e()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_11

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->c()F

    move-result v0

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->e()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_11

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->A(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_6

    .line 375
    :cond_11
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->A(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 378
    :goto_6
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->a()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 379
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->i()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v11

    .line 380
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "muscleData.setText"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "muscleData.setText"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_7

    .line 385
    :cond_12
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 388
    :goto_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 391
    :goto_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 392
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->d()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 393
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 394
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 396
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v9, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_9

    .line 399
    :cond_13
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/high16 v3, 0x41500000    # 13.0f

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    :goto_9
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 402
    goto/16 :goto_d

    .line 404
    :cond_14
    const-string v8, ""

    .line 405
    const-string v9, ""

    .line 406
    const-string v10, ""

    .line 407
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_15

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 408
    :cond_15
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->d()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 409
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 410
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 411
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v9, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_a

    .line 414
    :cond_16
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/high16 v3, 0x41500000    # 13.0f

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 416
    :goto_a
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_d

    .line 418
    :cond_17
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 419
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->d()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 420
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 421
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 422
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 423
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v9, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_b

    .line 425
    :cond_18
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/high16 v3, 0x41500000    # 13.0f

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 427
    :goto_b
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 428
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_d

    .line 432
    :cond_19
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->d()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 433
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 434
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->d()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 435
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v8, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_c

    .line 438
    :cond_1a
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/high16 v3, 0x41500000    # 13.0f

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 440
    :goto_c
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 446
    :goto_d
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->e()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1b

    .line 447
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 450
    :cond_1b
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->d()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1c

    .line 451
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 452
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 454
    :cond_1c
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->a()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_21

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_f

    .line 460
    :pswitch_4
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    .line 461
    const/4 v0, 0x0

    invoke-static {v8, v0}, Lo/fec;->e(Ljava/util/List;I)F

    move-result v9

    .line 462
    const/4 v0, 0x1

    invoke-static {v8, v0}, Lo/fec;->e(Ljava/util/List;I)F

    move-result v10

    .line 463
    const/4 v0, 0x2

    invoke-static {v8, v0}, Lo/fec;->e(Ljava/util/List;I)F

    move-result v11

    .line 465
    invoke-static {v9}, Lo/fec;->d(F)F

    move-result v9

    .line 466
    invoke-static {v10}, Lo/fec;->d(F)F

    move-result v10

    .line 467
    invoke-static {v11}, Lo/fec;->d(F)F

    move-result v11

    .line 469
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 470
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setChanges()isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->D(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 472
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->E(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_e

    .line 474
    :cond_1d
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setChanges()is not ShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->D(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 476
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->E(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 487
    :goto_e
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    float-to-double v1, v9

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc8

    invoke-static {v0, v1, v2, v9}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/lang/String;IF)Ljava/lang/String;

    move-result-object v12

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    float-to-double v1, v11

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xca

    invoke-static {v0, v1, v2, v11}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/lang/String;IF)Ljava/lang/String;

    move-result-object v14

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->H(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->F(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 491
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    float-to-double v1, v10

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc9

    invoke-static {v0, v1, v2, v10}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/lang/String;IF)Ljava/lang/String;

    move-result-object v13

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->G(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->I(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 495
    goto/16 :goto_f

    .line 497
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;I)V

    .line 498
    goto/16 :goto_f

    .line 500
    :pswitch_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    if-eqz v0, :cond_21

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Lo/fdn;

    move-result-object v0

    if-eqz v0, :cond_21

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->M(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_1f

    .line 502
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Lo/acu;

    move-result-object v0

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    if-ne v0, v1, :cond_1e

    .line 503
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->J(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V

    .line 505
    :cond_1e
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Lo/fdn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->M(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    goto/16 :goto_f

    .line 510
    :cond_1f
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->M(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v0

    const/16 v1, 0xc9

    if-ne v0, v1, :cond_20

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Lo/fdn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->K(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->N(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->M(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 512
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 513
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 514
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 515
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    goto :goto_f

    .line 517
    :cond_20
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Lo/fdn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->R(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->S(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->M(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 518
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 521
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 528
    :cond_21
    :goto_f
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

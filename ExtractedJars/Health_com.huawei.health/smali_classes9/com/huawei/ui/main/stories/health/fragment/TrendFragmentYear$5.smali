.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 15

    .line 220
    move-object/from16 v0, p1

    invoke-super {p0, v0}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 222
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity isn\'t exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    return-void

    .line 225
    :cond_0
    move-object/from16 v0, p1

    iget v0, v0, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_f

    .line 227
    :pswitch_0
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage()GET_HEALTH_DATA_GOAL_SECCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    move-object/from16 v1, p1

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/util/List;)Ljava/util/List;

    .line 231
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "goalDataList=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 233
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;I)I

    .line 236
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "goalValue=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;F)F

    .line 240
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;F)F

    .line 233
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_3
    goto :goto_1

    .line 246
    :cond_4
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goalValue is MyTargetActivity.WEIGHT_MATCH_VALUE =60"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    const/16 v1, 0x3c

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;I)I

    .line 248
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    const-wide/high16 v1, 0x404e000000000000L    # 60.0

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    double-to-int v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;I)I

    .line 251
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;F)F

    .line 254
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;F)F

    .line 259
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fdn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F

    move-result v2

    const/16 v3, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fet;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fet;->i(I)V

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fet;

    move-result-object v0

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->m(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 266
    goto/16 :goto_f

    .line 268
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->n(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->n(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v0

    const/4 v1, 0x6

    if-ne v1, v0, :cond_8

    goto/16 :goto_f

    .line 283
    :cond_8
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UPDATE_UI timeType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_f

    .line 287
    :cond_9
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UPDATE_UI mLoadingLayout = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->n(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    goto/16 :goto_f

    .line 291
    :pswitch_2
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_data_year_average:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->t(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 297
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 298
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValueAndUint() lb isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->e()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->r(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

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

    .line 301
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->c()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

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

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 306
    goto/16 :goto_2

    .line 307
    :cond_a
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValueAndUint() kg isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->e()F

    move-result v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->r(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

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

    .line 310
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->c()F

    move-result v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

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

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    :goto_2
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->a()F

    move-result v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

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

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->t(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 327
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->e()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_b

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->r(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 331
    :cond_b
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->a()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_c

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->t(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 335
    :cond_c
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->c()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_21

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 337
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_f

    .line 341
    :pswitch_3
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 346
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 347
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValueAndUint() lb isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->a()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 349
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->c()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 350
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 353
    :cond_d
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

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

    .line 355
    :goto_3
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->d()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 356
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->f()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v11

    .line 357
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->C(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 360
    :cond_e
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->C(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

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

    .line 362
    :goto_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 363
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 364
    goto/16 :goto_8

    .line 365
    :cond_f
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValueAndUint() kg isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->a()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 367
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->c()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 368
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->D(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 372
    :cond_10
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

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

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->D(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

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

    .line 375
    :goto_5
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->a()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_11

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->c()F

    move-result v0

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->a()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_11

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->A(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_6

    .line 379
    :cond_11
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->A(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 382
    :goto_6
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->d()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 383
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->f()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v11

    .line 384
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

    .line 385
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

    .line 386
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 387
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->C(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_7

    .line 389
    :cond_12
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->C(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

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

    .line 392
    :goto_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 395
    :goto_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 396
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->e()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 397
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 398
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 400
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 401
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v9, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_9

    .line 403
    :cond_13
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

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

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 405
    :goto_9
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 406
    goto/16 :goto_d

    .line 408
    :cond_14
    const-string v8, ""

    .line 409
    const-string v9, ""

    .line 410
    const-string v10, ""

    .line 411
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_15

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 412
    :cond_15
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->e()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 413
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 414
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 415
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v9, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_a

    .line 418
    :cond_16
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

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

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 420
    :goto_a
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_d

    .line 422
    :cond_17
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 423
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->e()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 424
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 425
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 426
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 427
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v9, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_b

    .line 429
    :cond_18
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

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

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 431
    :goto_b
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 432
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_d

    .line 436
    :cond_19
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->e()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 437
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 438
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->e()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 439
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 440
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v8, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_c

    .line 442
    :cond_1a
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

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

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 444
    :goto_c
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 450
    :goto_d
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->a()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1b

    .line 451
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 452
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 454
    :cond_1b
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->e()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1c

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 458
    :cond_1c
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->d()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_21

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->C(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_f

    .line 464
    :pswitch_4
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    .line 465
    const/4 v0, 0x0

    invoke-static {v8, v0}, Lo/fec;->e(Ljava/util/List;I)F

    move-result v9

    .line 466
    const/4 v0, 0x1

    invoke-static {v8, v0}, Lo/fec;->e(Ljava/util/List;I)F

    move-result v10

    .line 467
    const/4 v0, 0x2

    invoke-static {v8, v0}, Lo/fec;->e(Ljava/util/List;I)F

    move-result v11

    .line 469
    invoke-static {v9}, Lo/fec;->d(F)F

    move-result v9

    .line 470
    invoke-static {v10}, Lo/fec;->d(F)F

    move-result v10

    .line 471
    invoke-static {v11}, Lo/fec;->d(F)F

    move-result v11

    .line 473
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 474
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setChanges()isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->H(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 476
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->F(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_e

    .line 478
    :cond_1d
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setChanges()is not ShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->H(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 480
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->F(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 487
    :goto_e
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    float-to-double v1, v9

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc8

    invoke-static {v0, v1, v2, v9}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/lang/String;IF)Ljava/lang/String;

    move-result-object v12

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    float-to-double v1, v11

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xca

    invoke-static {v0, v1, v2, v11}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/lang/String;IF)Ljava/lang/String;

    move-result-object v14

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->I(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->G(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 491
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    float-to-double v1, v10

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc9

    invoke-static {v0, v1, v2, v10}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/lang/String;IF)Ljava/lang/String;

    move-result-object v13

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->E(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->J(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 494
    goto/16 :goto_f

    .line 496
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;I)V

    .line 497
    goto/16 :goto_f

    .line 499
    :pswitch_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fet;

    move-result-object v0

    if-eqz v0, :cond_21

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fdn;

    move-result-object v0

    if-eqz v0, :cond_21

    .line 500
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_1f

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->K(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/acu;

    move-result-object v0

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    if-ne v0, v1, :cond_1e

    .line 502
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->M(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)V

    .line 504
    :cond_1e
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fdn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fet;

    move-result-object v0

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->m(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    goto/16 :goto_f

    .line 509
    :cond_1f
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v0

    const/16 v1, 0xc9

    if-ne v0, v1, :cond_20

    .line 510
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fdn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->N(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->R(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fet;

    move-result-object v0

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 512
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->m(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 513
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 514
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    goto :goto_f

    .line 516
    :cond_20
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fdn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->O(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 517
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fet;

    move-result-object v0

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 518
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->m(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 527
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

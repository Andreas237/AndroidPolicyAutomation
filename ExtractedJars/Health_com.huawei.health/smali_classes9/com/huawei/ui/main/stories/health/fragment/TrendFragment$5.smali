.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V
    .locals 0

    .line 220
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 15

    .line 223
    move-object/from16 v0, p1

    invoke-super {p0, v0}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 225
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity isn\'t exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    return-void

    .line 228
    :cond_0
    move-object/from16 v0, p1

    iget v0, v0, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_f

    .line 230
    :pswitch_0
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage()GET_HEALTH_DATA_GOAL_SECCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    move-object/from16 v1, p1

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/util/List;)Ljava/util/List;

    .line 233
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "goalDataList=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 235
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;I)I

    .line 238
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "goalValue=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;F)F

    .line 242
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;F)F

    .line 235
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_3
    goto :goto_1

    .line 248
    :cond_4
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goalValue is MyTargetActivity.WEIGHT_MATCH_VALUE =60"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    const/16 v1, 0x3c

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;I)I

    .line 250
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    const-wide/high16 v1, 0x404e000000000000L    # 60.0

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    double-to-int v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;I)I

    .line 253
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;F)F

    .line 256
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;F)F

    .line 260
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fdn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F

    move-result v2

    const/16 v3, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fet;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fet;->i(I)V

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fet;

    move-result-object v0

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 267
    goto/16 :goto_f

    .line 269
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->m(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->m(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_8

    goto/16 :goto_f

    .line 274
    :cond_8
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UPDATE_UI timeType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_f

    .line 278
    :cond_9
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UPDATE_UI mLoadingLayout = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->m(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    goto/16 :goto_f

    .line 282
    :pswitch_2
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_data_week_average:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->n(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 288
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 289
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValueAndUint() lb isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;->a()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->u(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

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

    .line 292
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;->b()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

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

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->n(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 296
    goto/16 :goto_2

    .line 297
    :cond_a
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValueAndUint() kg isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;->a()F

    move-result v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->u(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

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
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;->b()F

    move-result v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

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

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->n(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 305
    :goto_2
    new-instance v6, Ljava/math/BigDecimal;

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;->c()F

    move-result v0

    float-to-double v0, v0

    invoke-direct {v6, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->r(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

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

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 309
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;->a()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_b

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->u(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->n(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 313
    :cond_b
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;->c()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_c

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->r(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 317
    :cond_c
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;->b()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_21

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_f

    .line 323
    :pswitch_3
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 328
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 329
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValueAndUint() lb isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->a()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 331
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->d()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 332
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 335
    :cond_d
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

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

    .line 337
    :goto_3
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->e()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 338
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->i()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v11

    .line 339
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 342
    :cond_e
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

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

    .line 344
    :goto_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 346
    goto/16 :goto_8

    .line 347
    :cond_f
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValueAndUint() kg isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->a()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 349
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->d()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 350
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->A(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 354
    :cond_10
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

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
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->A(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

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

    .line 357
    :goto_5
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->a()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_11

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->d()F

    move-result v0

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->a()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_11

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->C(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 359
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->D(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_6

    .line 361
    :cond_11
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->C(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->D(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 364
    :goto_6
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->e()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 365
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->i()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v11

    .line 366
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

    .line 367
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

    .line 368
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_7

    .line 371
    :cond_12
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

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

    .line 374
    :goto_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 377
    :goto_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 378
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->c()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 379
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 380
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 382
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v9, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_9

    .line 385
    :cond_13
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

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

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 387
    :goto_9
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 388
    goto/16 :goto_d

    .line 390
    :cond_14
    const-string v8, ""

    .line 391
    const-string v9, ""

    .line 392
    const-string v10, ""

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_15

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 394
    :cond_15
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->c()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 395
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 396
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 397
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 398
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v9, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_a

    .line 400
    :cond_16
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

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

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 402
    :goto_a
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_d

    .line 404
    :cond_17
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 405
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->c()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 406
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 407
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 408
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v9, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_b

    .line 411
    :cond_18
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

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

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 413
    :goto_b
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_d

    .line 418
    :cond_19
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->c()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 419
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->b()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 420
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->c()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 421
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 422
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v8, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_c

    .line 424
    :cond_1a
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

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

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 426
    :goto_c
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 432
    :goto_d
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->a()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1b

    .line 433
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 434
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 436
    :cond_1b
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->c()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1c

    .line 437
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 440
    :cond_1c
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->e()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_21

    .line 441
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 442
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_f

    .line 446
    :pswitch_4
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    .line 447
    const/4 v0, 0x0

    invoke-static {v8, v0}, Lo/fec;->e(Ljava/util/List;I)F

    move-result v9

    .line 448
    const/4 v0, 0x1

    invoke-static {v8, v0}, Lo/fec;->e(Ljava/util/List;I)F

    move-result v10

    .line 449
    const/4 v0, 0x2

    invoke-static {v8, v0}, Lo/fec;->e(Ljava/util/List;I)F

    move-result v11

    .line 451
    invoke-static {v9}, Lo/fec;->d(F)F

    move-result v9

    .line 452
    invoke-static {v10}, Lo/fec;->d(F)F

    move-result v10

    .line 453
    invoke-static {v11}, Lo/fec;->d(F)F

    move-result v11

    .line 455
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 456
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setChanges()isShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 458
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->F(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_e

    .line 460
    :cond_1d
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setChanges()is not ShowImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 462
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->F(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 473
    :goto_e
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    float-to-double v1, v9

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc8

    invoke-static {v0, v1, v2, v9}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/lang/String;IF)Ljava/lang/String;

    move-result-object v12

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    float-to-double v1, v11

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xca

    invoke-static {v0, v1, v2, v11}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/lang/String;IF)Ljava/lang/String;

    move-result-object v14

    .line 475
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->H(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 476
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->G(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 477
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    float-to-double v1, v10

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc9

    invoke-static {v0, v1, v2, v10}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/lang/String;IF)Ljava/lang/String;

    move-result-object v13

    .line 478
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->E(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->I(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 481
    goto/16 :goto_f

    .line 483
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;I)V

    .line 484
    goto/16 :goto_f

    .line 486
    :pswitch_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fet;

    move-result-object v0

    if-eqz v0, :cond_21

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fdn;

    move-result-object v0

    if-eqz v0, :cond_21

    .line 487
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_1f

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->J(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/acu;

    move-result-object v0

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    if-ne v0, v1, :cond_1e

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->N(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V

    .line 491
    :cond_1e
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fdn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fet;

    move-result-object v0

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 494
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 495
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    goto/16 :goto_f

    .line 496
    :cond_1f
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v0

    const/16 v1, 0xc9

    if-ne v0, v1, :cond_20

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fdn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->M(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->K(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fet;

    move-result-object v0

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 500
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    goto :goto_f

    .line 503
    :cond_20
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fdn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->P(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->O(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 504
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fet;

    move-result-object v0

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 514
    :cond_21
    :goto_f
    return-void

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

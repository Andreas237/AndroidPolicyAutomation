.class Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 244
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 245
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 247
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)I

    move-result v0

    if-nez v0, :cond_1

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->k(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->h(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 250
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v5

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-static {v5, v6, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 253
    goto :goto_0

    .line 254
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 256
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->m(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Lo/eyf;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/eyf;->setVisibility(I)V

    goto/16 :goto_1

    .line 257
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->m(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Lo/eyf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->setVisibility(I)V

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->k(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->h(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->o(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->l(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/Date;

    move-result-object v2

    const/16 v3, 0x18

    invoke-static {v2, v3}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    .line 264
    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->n(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/Date;

    move-result-object v2

    const/16 v3, 0x18

    invoke-static {v2, v3}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 263
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->m(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Lo/eyf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->l(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/Date;

    move-result-object v2

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->p(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/eyf;->e(Ljava/util/List;Ljava/util/List;)V

    goto/16 :goto_1

    .line 268
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->m(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Lo/eyf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->setVisibility(I)V

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->k(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->h(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->o(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->l(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/Date;

    move-result-object v2

    const/16 v3, 0x18

    invoke-static {v2, v3}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    .line 275
    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->n(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/Date;

    move-result-object v2

    const/16 v3, 0x18

    invoke-static {v2, v3}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 274
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->m(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Lo/eyf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->l(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/Date;

    move-result-object v2

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->p(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/eyf;->e(Ljava/util/List;Ljava/util/List;)V

    goto/16 :goto_1

    .line 278
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->m(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Lo/eyf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->setVisibility(I)V

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->k(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->h(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->o(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->l(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/Date;

    move-result-object v2

    const/16 v3, 0x14

    invoke-static {v2, v3}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    .line 285
    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->n(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/Date;

    move-result-object v2

    const/16 v3, 0x14

    invoke-static {v2, v3}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 284
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->m(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Lo/eyf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->l(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/Date;

    move-result-object v2

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->p(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/eyf;->e(Ljava/util/List;Ljava/util/List;)V

    .line 291
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->r(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->b:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 297
    goto :goto_2

    .line 300
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;I)V

    .line 301
    goto :goto_2

    .line 303
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c(Landroid/content/Context;)V

    .line 304
    .line 309
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

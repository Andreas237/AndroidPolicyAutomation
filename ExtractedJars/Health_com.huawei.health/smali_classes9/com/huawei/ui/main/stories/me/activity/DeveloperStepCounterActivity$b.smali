.class Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)V
    .locals 1

    .line 279
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 280
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->d:Ljava/lang/ref/WeakReference;

    .line 281
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 10

    .line 285
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    .line 287
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 288
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyHandler handleMessage activity null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    return-void

    .line 291
    :cond_0
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyHandler handleMessage msg.what:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 294
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->k(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " | "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->h(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->n(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->h(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->i(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->m(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->o(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 296
    goto/16 :goto_1

    .line 299
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->p(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->i(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->l(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->m(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->r(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->o(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->n(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->h(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->i(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->m(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->o(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->q(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->u(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->s(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->t(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->t(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "##"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 308
    const/4 v7, 0x0

    :goto_0
    array-length v0, v6

    if-ge v7, v0, :cond_2

    .line 309
    aget-object v0, v6, v7

    if-eqz v0, :cond_1

    aget-object v0, v6, v7

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 310
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v8, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 312
    new-instance v9, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-direct {v9, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 313
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " restart "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " times  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    aget-object v2, v6, v7

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->s(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v9, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 308
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 317
    :cond_2
    goto :goto_1

    .line 321
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->z(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->x(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 322
    .line 327
    :cond_3
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

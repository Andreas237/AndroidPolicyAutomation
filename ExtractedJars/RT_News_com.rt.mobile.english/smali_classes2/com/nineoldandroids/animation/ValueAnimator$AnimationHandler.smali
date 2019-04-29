.class Lcom/nineoldandroids/animation/ValueAnimator$AnimationHandler;
.super Landroid/os/Handler;
.source "ValueAnimator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nineoldandroids/animation/ValueAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AnimationHandler"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 570
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/nineoldandroids/animation/ValueAnimator$1;)V
    .locals 0

    .line 570
    invoke-direct {p0}, Lcom/nineoldandroids/animation/ValueAnimator$AnimationHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 14

    .line 586
    invoke-static {}, Lcom/nineoldandroids/animation/ValueAnimator;->access$000()Ljava/lang/ThreadLocal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 587
    invoke-static {}, Lcom/nineoldandroids/animation/ValueAnimator;->access$100()Ljava/lang/ThreadLocal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 588
    iget p1, p1, Landroid/os/Message;->what:I

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_9

    :pswitch_0
    move v6, v5

    goto :goto_4

    .line 592
    :pswitch_1
    invoke-static {}, Lcom/nineoldandroids/animation/ValueAnimator;->access$200()Ljava/lang/ThreadLocal;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 593
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-gtz v6, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_0

    goto :goto_0

    :cond_0
    move v6, v5

    goto :goto_1

    :cond_1
    :goto_0
    move v6, v4

    .line 601
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-lez v7, :cond_4

    .line 602
    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    .line 604
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 605
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    move v9, v4

    :goto_2
    if-ge v9, v8, :cond_2

    .line 607
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/nineoldandroids/animation/ValueAnimator;

    .line 609
    invoke-static {v10}, Lcom/nineoldandroids/animation/ValueAnimator;->access$300(Lcom/nineoldandroids/animation/ValueAnimator;)J

    move-result-wide v11

    cmp-long v13, v11, v2

    if-nez v13, :cond_3

    .line 610
    invoke-static {v10}, Lcom/nineoldandroids/animation/ValueAnimator;->access$400(Lcom/nineoldandroids/animation/ValueAnimator;)V

    goto :goto_3

    .line 612
    :cond_3
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 620
    :cond_4
    :goto_4
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v7

    .line 621
    invoke-static {}, Lcom/nineoldandroids/animation/ValueAnimator;->access$500()Ljava/lang/ThreadLocal;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 622
    invoke-static {}, Lcom/nineoldandroids/animation/ValueAnimator;->access$600()Ljava/lang/ThreadLocal;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/ArrayList;

    .line 626
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v10

    move v11, v4

    :goto_5
    if-ge v11, v10, :cond_6

    .line 628
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/nineoldandroids/animation/ValueAnimator;

    .line 629
    invoke-static {v12, v7, v8}, Lcom/nineoldandroids/animation/ValueAnimator;->access$700(Lcom/nineoldandroids/animation/ValueAnimator;J)Z

    move-result v13

    if-eqz v13, :cond_5

    .line 630
    invoke-virtual {p1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    .line 633
    :cond_6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-lez v10, :cond_8

    move v11, v4

    :goto_6
    if-ge v11, v10, :cond_7

    .line 636
    invoke-virtual {p1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/nineoldandroids/animation/ValueAnimator;

    .line 637
    invoke-static {v12}, Lcom/nineoldandroids/animation/ValueAnimator;->access$400(Lcom/nineoldandroids/animation/ValueAnimator;)V

    .line 638
    invoke-static {v12, v5}, Lcom/nineoldandroids/animation/ValueAnimator;->access$802(Lcom/nineoldandroids/animation/ValueAnimator;Z)Z

    .line 639
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    .line 641
    :cond_7
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 646
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    move v10, p1

    move p1, v4

    :goto_7
    if-ge p1, v10, :cond_b

    .line 649
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/nineoldandroids/animation/ValueAnimator;

    .line 650
    invoke-virtual {v11, v7, v8}, Lcom/nineoldandroids/animation/ValueAnimator;->animationFrame(J)Z

    move-result v12

    if-eqz v12, :cond_9

    .line 651
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 653
    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ne v12, v10, :cond_a

    add-int/lit8 p1, p1, 0x1

    goto :goto_7

    :cond_a
    add-int/lit8 v10, v10, -0x1

    .line 664
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_7

    .line 667
    :cond_b
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_d

    .line 668
    :goto_8
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v4, p1, :cond_c

    .line 669
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nineoldandroids/animation/ValueAnimator;

    invoke-static {p1}, Lcom/nineoldandroids/animation/ValueAnimator;->access$900(Lcom/nineoldandroids/animation/ValueAnimator;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    .line 671
    :cond_c
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    :cond_d
    if-eqz v6, :cond_f

    .line 676
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_f

    .line 677
    :cond_e
    invoke-static {}, Lcom/nineoldandroids/animation/ValueAnimator;->access$1000()J

    move-result-wide v0

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v9

    sub-long v11, v9, v7

    sub-long v6, v0, v11

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    invoke-virtual {p0, v5, v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator$AnimationHandler;->sendEmptyMessageDelayed(IJ)Z

    :cond_f
    :goto_9
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

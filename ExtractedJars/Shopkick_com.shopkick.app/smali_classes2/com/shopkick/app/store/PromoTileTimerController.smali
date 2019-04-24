.class public Lcom/shopkick/app/store/PromoTileTimerController;
.super Ljava/lang/Object;
.source "PromoTileTimerController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;
    }
.end annotation


# instance fields
.field expiryTs:Ljava/lang/Long;

.field private headerViews:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field

.field lastMillisUntilFinished:J

.field private timer:Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->headerViews:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/store/PromoTileTimerController;J)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/store/PromoTileTimerController;->onTick(J)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/store/PromoTileTimerController;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/shopkick/app/store/PromoTileTimerController;->onFinish()V

    return-void
.end method

.method private onFinish()V
    .locals 10

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->headerViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 122
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    .line 125
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/adapter/ViewHolder;

    if-nez v2, :cond_1

    .line 127
    new-instance v2, Lcom/shopkick/app/adapter/ViewHolder;

    invoke-direct {v2}, Lcom/shopkick/app/adapter/ViewHolder;-><init>()V

    .line 128
    invoke-virtual {v2, v1}, Lcom/shopkick/app/adapter/ViewHolder;->populate(Landroid/view/View;)V

    .line 129
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_1
    const v1, 0x7f0901aa

    .line 132
    invoke-virtual {v2, v1}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    const v3, 0x7f0901ae

    .line 133
    invoke-virtual {v2, v3}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    const v4, 0x7f0901a6

    .line 134
    invoke-virtual {v2, v4}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f0901ad

    .line 135
    invoke-virtual {v2, v5}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v5

    const v6, 0x7f0901af

    .line 136
    invoke-virtual {v2, v6}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v6

    const v7, 0x7f0901b0

    .line 137
    invoke-virtual {v2, v7}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    const/16 v7, 0x8

    .line 139
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 140
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 141
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 143
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v3, "%02d"

    const/4 v4, 0x1

    new-array v7, v4, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v1, v3, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v3, "%02d"

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v8

    invoke-static {v1, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v3, "%02d"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 148
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->headerViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    .line 149
    iput-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->timer:Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;

    return-void
.end method

.method private onTick(J)V
    .locals 2

    .line 73
    iput-wide p1, p0, Lcom/shopkick/app/store/PromoTileTimerController;->lastMillisUntilFinished:J

    .line 74
    iget-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->headerViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 75
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    .line 77
    invoke-direct {p0, v1, p1, p2}, Lcom/shopkick/app/store/PromoTileTimerController;->updateTimer(Landroid/view/View;J)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private updateTimer(Landroid/view/View;J)V
    .locals 16

    move-object/from16 v0, p1

    move-wide/from16 v1, p2

    .line 83
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toDays(J)J

    move-result-wide v3

    .line 84
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v1, v2}, Ljava/util/concurrent/TimeUnit;->toHours(J)J

    move-result-wide v5

    sget-object v7, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v3, v4}, Ljava/util/concurrent/TimeUnit;->toHours(J)J

    move-result-wide v7

    sub-long/2addr v5, v7

    .line 85
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    move-result-wide v7

    sget-object v9, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v9, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    move-result-wide v9

    sub-long/2addr v7, v9

    sget-object v9, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 86
    invoke-virtual {v9, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    move-result-wide v9

    sub-long/2addr v7, v9

    .line 87
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v9, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v1

    sget-object v9, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v9, v3, v4}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v9

    sub-long/2addr v1, v9

    sget-object v9, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 88
    invoke-virtual {v9, v5, v6}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v9

    sub-long/2addr v1, v9

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v9, v7, v8}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v9

    sub-long/2addr v1, v9

    .line 90
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/shopkick/app/adapter/ViewHolder;

    if-nez v9, :cond_0

    .line 92
    new-instance v9, Lcom/shopkick/app/adapter/ViewHolder;

    invoke-direct {v9}, Lcom/shopkick/app/adapter/ViewHolder;-><init>()V

    .line 93
    invoke-virtual {v9, v0}, Lcom/shopkick/app/adapter/ViewHolder;->populate(Landroid/view/View;)V

    .line 94
    invoke-virtual {v0, v9}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_0
    const v0, 0x7f0901aa

    .line 97
    invoke-virtual {v9, v0}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    const v10, 0x7f0901ae

    .line 98
    invoke-virtual {v9, v10}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v10

    const v11, 0x7f0901a6

    .line 99
    invoke-virtual {v9, v11}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v11

    const v12, 0x7f0901ad

    .line 100
    invoke-virtual {v9, v12}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v12

    const v13, 0x7f0901af

    .line 101
    invoke-virtual {v9, v13}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v13

    const v14, 0x7f0901b0

    .line 102
    invoke-virtual {v9, v14}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v9

    const-wide/16 v14, 0x1

    cmp-long v14, v3, v14

    const/4 v15, 0x0

    if-gez v14, :cond_1

    const/16 v3, 0x8

    .line 105
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 106
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 107
    invoke-virtual {v11, v3}, Landroid/view/View;->setVisibility(I)V

    move-object/from16 p1, v9

    const/4 v14, 0x1

    goto :goto_0

    .line 109
    :cond_1
    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setVisibility(I)V

    .line 110
    invoke-virtual {v10, v15}, Landroid/widget/TextView;->setVisibility(I)V

    .line 111
    invoke-virtual {v11, v15}, Landroid/view/View;->setVisibility(I)V

    .line 112
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v10

    const-string v11, "%d"

    move-object/from16 p1, v9

    const/4 v14, 0x1

    new-array v9, v14, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v9, v15

    invoke-static {v10, v11, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    :goto_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v3, "%02d"

    new-array v4, v14, [Ljava/lang/Object;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v15

    invoke-static {v0, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v3, "%02d"

    new-array v4, v14, [Ljava/lang/Object;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v15

    invoke-static {v0, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v3, "%02d"

    new-array v4, v14, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v4, v15

    invoke-static {v0, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 67
    invoke-virtual {p0}, Lcom/shopkick/app/store/PromoTileTimerController;->stop()V

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->headerViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    .line 69
    iput-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->expiryTs:Ljava/lang/Long;

    return-void
.end method

.method public registerView(Landroid/view/View;)V
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->headerViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 27
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p1, :cond_0

    return-void

    .line 31
    :cond_1
    iget-wide v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->lastMillisUntilFinished:J

    invoke-direct {p0, p1, v0, v1}, Lcom/shopkick/app/store/PromoTileTimerController;->updateTimer(Landroid/view/View;J)V

    .line 32
    iget-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->headerViews:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public setExpiryTs(J)V
    .locals 0

    .line 46
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/store/PromoTileTimerController;->expiryTs:Ljava/lang/Long;

    return-void
.end method

.method public start()V
    .locals 11

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->expiryTs:Ljava/lang/Long;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/store/PromoTileTimerController;->timer:Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;

    if-nez v1, :cond_1

    .line 51
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    move-wide v6, v2

    goto :goto_0

    :cond_0
    move-wide v6, v0

    .line 53
    :goto_0
    new-instance v0, Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;

    const-wide/16 v8, 0x3e8

    move-object v5, v0

    move-object v10, p0

    invoke-direct/range {v5 .. v10}, Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;-><init>(JJLcom/shopkick/app/store/PromoTileTimerController;)V

    iput-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->timer:Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->timer:Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;

    invoke-virtual {v0}, Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;->start()Landroid/os/CountDownTimer;

    :cond_1
    return-void
.end method

.method public stop()V
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->timer:Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;

    if-eqz v0, :cond_0

    .line 61
    invoke-virtual {v0}, Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;->cancel()V

    const/4 v0, 0x0

    .line 62
    iput-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController;->timer:Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;

    :cond_0
    return-void
.end method

.method public unregisterView(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    .line 36
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/store/PromoTileTimerController;->headerViews:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 37
    iget-object v1, p0, Lcom/shopkick/app/store/PromoTileTimerController;->headerViews:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 38
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p1, :cond_0

    .line 39
    iget-object p1, p0, Lcom/shopkick/app/store/PromoTileTimerController;->headerViews:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

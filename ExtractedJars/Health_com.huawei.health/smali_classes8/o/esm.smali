.class public Lo/esm;
.super Lo/esn;
.source "SourceFile"

# interfaces
.implements Lo/esp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/esm$c;,
        Lo/esm$e;,
        Lo/esm$a;
    }
.end annotation


# instance fields
.field private a:Lo/esq;

.field private b:Lo/esm$a;

.field private e:Lo/esr;

.field private f:Landroid/content/BroadcastReceiver;

.field private g:Lo/esm$e;

.field private h:Lo/esm$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 81
    invoke-direct {p0, p1}, Lo/esn;-><init>(Landroid/content/Context;)V

    .line 64
    new-instance v0, Lo/esm$1;

    invoke-direct {v0, p0}, Lo/esm$1;-><init>(Lo/esm;)V

    iput-object v0, p0, Lo/esm;->f:Landroid/content/BroadcastReceiver;

    .line 231
    new-instance v0, Lo/esm$e;

    invoke-direct {v0, p0}, Lo/esm$e;-><init>(Lo/esm;)V

    iput-object v0, p0, Lo/esm;->g:Lo/esm$e;

    .line 307
    new-instance v0, Lo/esm$c;

    invoke-direct {v0, p0}, Lo/esm$c;-><init>(Lo/esm;)V

    iput-object v0, p0, Lo/esm;->h:Lo/esm$c;

    .line 82
    return-void
.end method

.method static synthetic a(Lo/esm;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/esm;->k()V

    return-void
.end method

.method static synthetic b(Lo/esm;)Lo/esq;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 293
    new-instance v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 294
    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 295
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 296
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 297
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 298
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "wear_device_type_datas"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 299
    invoke-virtual {v2, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 300
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 301
    const/4 v0, 0x7

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 303
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 304
    iget-object v0, p0, Lo/esm;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lo/esm;->h:Lo/esm$c;

    invoke-interface {v0, v2, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 305
    return-void

    nop

    :array_0
    .array-data 4
        0xa9ec
    .end array-data
.end method

.method static synthetic c(Lo/esm;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/esm;->e()V

    return-void
.end method

.method private static c(Ljava/lang/String;)Z
    .locals 3

    .line 454
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 455
    const/4 v0, 0x1

    return v0

    .line 456
    :catch_0
    move-exception v2

    .line 457
    const/4 v0, 0x0

    return v0

    .line 458
    :catch_1
    move-exception v2

    .line 459
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lo/esm;)Lo/esr;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/esm;->e:Lo/esr;

    return-object v0
.end method

.method private d(Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;)V
    .locals 6

    .line 283
    new-instance v0, Lo/esm$a;

    invoke-direct {v0, p0}, Lo/esm$a;-><init>(Lo/esm;)V

    iput-object v0, p0, Lo/esm;->b:Lo/esm$a;

    .line 284
    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportStartTime()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportEndTime()J

    move-result-wide v2

    iget-object v4, p0, Lo/esm;->d:Landroid/content/Context;

    .line 285
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lo/esm;->g:Lo/esm$e;

    .line 284
    invoke-static/range {v0 .. v5}, Lo/etp;->a(JJLandroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 286
    return-void
.end method

.method static synthetic d(Ljava/lang/String;)Z
    .locals 1

    .line 44
    invoke-static {p0}, Lo/esm;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/esm;)Lo/esm$a;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/esm;->b:Lo/esm$a;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 150
    new-instance v0, Lo/esr;

    iget-object v1, p0, Lo/esm;->d:Landroid/content/Context;

    invoke-direct {v0, v1, p0}, Lo/esr;-><init>(Landroid/content/Context;Lo/esp;)V

    iput-object v0, p0, Lo/esm;->e:Lo/esr;

    .line 151
    iget-object v0, p0, Lo/esm;->e:Lo/esr;

    invoke-virtual {v0}, Lo/esr;->a()V

    .line 152
    return-void
.end method

.method private i()V
    .locals 6

    .line 467
    iget-object v0, p0, Lo/esm;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 468
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 469
    const-string v0, "com.huawei.hihealth.action_data_refresh"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 470
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 471
    iget-object v0, p0, Lo/esm;->f:Landroid/content/BroadcastReceiver;

    invoke-virtual {v4, v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 472
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver  registe success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 474
    :cond_0
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver  registe fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    :goto_0
    return-void
.end method

.method private k()V
    .locals 4

    .line 502
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->g:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 503
    iget-object v0, p0, Lo/esm;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 504
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->g:Landroid/view/View;

    iget-object v1, p0, Lo/esm;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->home_sports_card_background1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 507
    :cond_0
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->g:Landroid/view/View;

    iget-object v1, p0, Lo/esm;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->home_sports_card_background0:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 510
    :cond_1
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCardBackground() mPreviewCardViewHolder.view is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 160
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    invoke-virtual {p0}, Lo/esm;->b()V

    .line 162
    iget-object v0, p0, Lo/esm;->e:Lo/esr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 163
    iget-object v0, p0, Lo/esm;->e:Lo/esr;

    invoke-virtual {v0}, Lo/esr;->c()V

    .line 164
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esm;->e:Lo/esr;

    .line 167
    :cond_0
    iget-object v0, p0, Lo/esm;->b:Lo/esm$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 168
    iget-object v0, p0, Lo/esm;->b:Lo/esm$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/esm$a;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 169
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esm;->b:Lo/esm$a;

    .line 172
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esm;->f:Landroid/content/BroadcastReceiver;

    .line 173
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esm;->c:Lo/eqw;

    .line 174
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esm;->a:Lo/esq;

    .line 175
    return-void
.end method

.method public a(Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;)V
    .locals 4

    .line 182
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 184
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->c:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportTime()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportTypeName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 186
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportKeepTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 187
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportUnit()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportSpeed()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportSpeedUnit()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 191
    iget-object v0, p0, Lo/esm;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 192
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->b:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    .line 194
    :cond_0
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->b:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 198
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 201
    :pswitch_0
    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportStartTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportEndTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 202
    invoke-direct {p0, p1}, Lo/esm;->d(Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;)V

    goto :goto_2

    .line 206
    :pswitch_1
    invoke-direct {p0}, Lo/esm;->k()V

    .line 207
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 208
    goto :goto_2

    .line 210
    :pswitch_2
    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportStartTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->getSportEndTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 211
    invoke-direct {p0, p1}, Lo/esm;->d(Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;)V

    goto :goto_2

    .line 215
    :pswitch_3
    invoke-direct {p0}, Lo/esm;->k()V

    .line 216
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 217
    goto :goto_2

    .line 219
    :goto_1
    invoke-direct {p0}, Lo/esm;->k()V

    .line 220
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    iget-object v0, v0, Lo/esq;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 221
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSprotResultData: sporttype is default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    :cond_1
    :goto_2
    invoke-direct {p0}, Lo/esm;->c()V

    goto :goto_3

    .line 227
    :cond_2
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPreviewCardViewHolder is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 139
    const-string v0, "SportsRecordingCard-getCardViewHolder enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 140
    invoke-super {p0, p1, p2}, Lo/esn;->b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v0

    check-cast v0, Lo/esq;

    iput-object v0, p0, Lo/esm;->a:Lo/esq;

    .line 141
    invoke-direct {p0}, Lo/esm;->e()V

    .line 142
    invoke-direct {p0}, Lo/esm;->i()V

    .line 143
    iget-object v0, p0, Lo/esm;->a:Lo/esq;

    return-object v0
.end method

.method public b()V
    .locals 5

    .line 482
    iget-object v0, p0, Lo/esm;->f:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 484
    :try_start_0
    iget-object v0, p0, Lo/esm;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 485
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 486
    iget-object v0, p0, Lo/esm;->f:Landroid/content/BroadcastReceiver;

    invoke-virtual {v4, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 487
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver unregister"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 489
    :cond_0
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver unregister fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 493
    :goto_0
    goto :goto_1

    .line 491
    :catch_0
    move-exception v4

    .line 492
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IllegalArgumentException  mHiBroadcasetReceiver unregister"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    :cond_1
    :goto_1
    return-void
.end method

.method public d()V
    .locals 2

    .line 271
    invoke-super {p0}, Lo/esn;->d()V

    .line 273
    iget-object v0, p0, Lo/esm;->e:Lo/esr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 274
    iget-object v0, p0, Lo/esm;->e:Lo/esr;

    invoke-virtual {v0}, Lo/esr;->d()V

    .line 276
    :cond_0
    return-void
.end method

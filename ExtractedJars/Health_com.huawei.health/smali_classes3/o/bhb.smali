.class public Lo/bhb;
.super Lo/bfl;
.source "SourceFile"


# instance fields
.field private f:Landroid/widget/ImageView;

.field private g:Lo/emu;

.field private h:Landroid/widget/TextView;

.field private i:Lo/atv;

.field private k:Lo/axc;

.field private l:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 104
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bhb;->h:Landroid/widget/TextView;

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bhb;->g:Lo/emu;

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bhb;->f:Landroid/widget/ImageView;

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bhb;->l:Landroid/view/View;

    .line 105
    return-void
.end method

.method private b(Lo/ayh;)V
    .locals 3

    .line 253
    invoke-virtual {p1}, Lo/ayh;->d()Lcom/huawei/health/sns/model/group/Group;

    move-result-object v2

    .line 254
    invoke-virtual {p1}, Lo/ayh;->b()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 258
    :pswitch_0
    iget-object v0, p0, Lo/bhb;->g:Lo/emu;

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v0

    if-nez v0, :cond_0

    .line 260
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSaveToContractMode(I)V

    goto :goto_0

    .line 264
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSaveToContractMode(I)V

    .line 266
    :goto_0
    invoke-virtual {p0, v2}, Lo/bhb;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 267
    goto :goto_3

    .line 271
    :pswitch_1
    iget-object v0, p0, Lo/bhb;->g:Lo/emu;

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v0

    if-nez v0, :cond_1

    .line 273
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setShowNicknameMode(I)V

    goto :goto_1

    .line 277
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setShowNicknameMode(I)V

    .line 279
    :goto_1
    invoke-virtual {p0, v2}, Lo/bhb;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 280
    goto :goto_3

    .line 284
    :pswitch_2
    iget-object v0, p0, Lo/bhb;->g:Lo/emu;

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v0

    if-nez v0, :cond_2

    .line 286
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setStickTime(Ljava/lang/String;)V

    .line 287
    invoke-virtual {p0, v2}, Lo/bhb;->a(Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_3

    .line 291
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setStickTime(Ljava/lang/String;)V

    .line 292
    invoke-virtual {p0, v2}, Lo/bhb;->a(Lcom/huawei/health/sns/model/group/Group;)V

    .line 294
    goto :goto_3

    .line 298
    :pswitch_3
    iget-object v0, p0, Lo/bhb;->g:Lo/emu;

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v0

    if-nez v0, :cond_3

    .line 300
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    goto :goto_2

    .line 304
    :cond_3
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 306
    :goto_2
    invoke-virtual {p0, v2}, Lo/bhb;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 307
    .line 312
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private c(I)Ljava/lang/String;
    .locals 3

    .line 207
    const/4 v2, 0x0

    .line 208
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 211
    :pswitch_0
    iget-object v0, p0, Lo/bhb;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_normal_group_save_contact:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 212
    goto :goto_0

    .line 214
    :pswitch_1
    iget-object v0, p0, Lo/bhb;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_normal_group_show_nickname:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 215
    goto :goto_0

    .line 217
    :pswitch_2
    iget-object v0, p0, Lo/bhb;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_set_conversation_top:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 218
    goto :goto_0

    .line 220
    :pswitch_3
    iget-object v0, p0, Lo/bhb;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_normal_group_msg_disturb:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 221
    .line 225
    :goto_0
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private c(Lo/ayh;)V
    .locals 8

    .line 322
    invoke-virtual {p1}, Lo/ayh;->b()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 324
    iget-object v0, p0, Lo/bhb;->g:Lo/emu;

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v7, 0x0

    goto :goto_0

    :cond_0
    const/4 v7, 0x1

    .line 325
    :goto_0
    iget-object v0, p0, Lo/bhb;->k:Lo/axc;

    if-nez v0, :cond_1

    .line 327
    new-instance v0, Lo/axc;

    invoke-direct {v0}, Lo/axc;-><init>()V

    iput-object v0, p0, Lo/bhb;->k:Lo/axc;

    .line 329
    :cond_1
    const/4 v0, 0x6

    const/16 v1, 0x66

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 330
    iget-object v0, p0, Lo/bhb;->k:Lo/axc;

    iget-object v1, p0, Lo/bhb;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lo/ayh;->a()J

    move-result-wide v3

    move v5, v7

    const/4 v2, 0x1

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/axc;->d(Landroid/content/Context;IJIZ)V

    .line 331
    goto :goto_2

    .line 332
    :cond_2
    invoke-virtual {p1}, Lo/ayh;->b()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_5

    .line 334
    iget-object v0, p0, Lo/bhb;->g:Lo/emu;

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v7, 0x0

    goto :goto_1

    :cond_3
    const/4 v7, 0x1

    .line 335
    :goto_1
    iget-object v0, p0, Lo/bhb;->k:Lo/axc;

    if-nez v0, :cond_4

    .line 337
    new-instance v0, Lo/axc;

    invoke-direct {v0}, Lo/axc;-><init>()V

    iput-object v0, p0, Lo/bhb;->k:Lo/axc;

    .line 339
    :cond_4
    const/4 v0, 0x6

    const/16 v1, 0x67

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 340
    iget-object v0, p0, Lo/bhb;->k:Lo/axc;

    invoke-virtual {p1}, Lo/ayh;->a()J

    move-result-wide v1

    .line 341
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 340
    const/4 v4, 0x1

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/axc;->c(JILjava/lang/String;)V

    .line 343
    :cond_5
    :goto_2
    return-void
.end method

.method private c(Lo/bfh;)V
    .locals 2

    .line 235
    invoke-virtual {p1}, Lo/bfh;->isNeedHideDivider()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 237
    iget-object v0, p0, Lo/bhb;->f:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 241
    :cond_0
    iget-object v0, p0, Lo/bhb;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 243
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/bhb;Lo/ayh;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lo/bhb;->e(Lo/ayh;)V

    return-void
.end method

.method private e(Lo/ayh;)V
    .locals 1

    .line 194
    invoke-virtual {p1}, Lo/ayh;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 196
    invoke-direct {p0, p1}, Lo/bhb;->b(Lo/ayh;)V

    goto :goto_0

    .line 201
    :cond_0
    invoke-direct {p0, p1}, Lo/bhb;->c(Lo/ayh;)V

    .line 203
    :goto_0
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 352
    iget-object v0, p0, Lo/bhb;->i:Lo/atv;

    if-nez v0, :cond_0

    .line 354
    new-instance v0, Lo/atv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atv;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lo/bhb;->i:Lo/atv;

    .line 356
    :cond_0
    const/4 v0, 0x4

    const/16 v1, 0x155

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 357
    iget-object v0, p0, Lo/bhb;->i:Lo/atv;

    invoke-virtual {v0, p1}, Lo/atv;->a(Lcom/huawei/health/sns/model/group/Group;)V

    .line 358
    return-void
.end method

.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 110
    sget v0, Lcom/huawei/android/sns/R$id;->text_switch:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhb;->h:Landroid/widget/TextView;

    .line 111
    sget v0, Lcom/huawei/android/sns/R$id;->switch_switch:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lo/bhb;->g:Lo/emu;

    .line 112
    sget v0, Lcom/huawei/android/sns/R$id;->divider_imageview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bhb;->f:Landroid/widget/ImageView;

    .line 113
    sget v0, Lcom/huawei/android/sns/R$id;->layout_switch:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bhb;->l:Landroid/view/View;

    .line 114
    invoke-virtual {p0, p1}, Lo/bhb;->a(Landroid/view/View;)V

    .line 115
    return-object p0
.end method

.method protected d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 367
    iget-object v0, p0, Lo/bhb;->i:Lo/atv;

    if-nez v0, :cond_0

    .line 369
    new-instance v0, Lo/atv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atv;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lo/bhb;->i:Lo/atv;

    .line 371
    :cond_0
    const/4 v0, 0x4

    const/16 v1, 0x155

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 372
    iget-object v0, p0, Lo/bhb;->i:Lo/atv;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/atv;->d(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 373
    return-void
.end method

.method public e(Lo/bfh;)V
    .locals 7

    .line 122
    invoke-super {p0, p1}, Lo/bfl;->e(Lo/bfh;)V

    .line 123
    instance-of v0, p1, Lo/ayh;

    if-eqz v0, :cond_5

    .line 125
    move-object v3, p1

    check-cast v3, Lo/ayh;

    .line 126
    invoke-direct {p0, p1}, Lo/bhb;->c(Lo/bfh;)V

    .line 127
    invoke-virtual {v3}, Lo/ayh;->b()I

    move-result v4

    .line 128
    invoke-direct {p0, v4}, Lo/bhb;->c(I)Ljava/lang/String;

    move-result-object v5

    .line 129
    if-eqz v5, :cond_0

    .line 131
    iget-object v0, p0, Lo/bhb;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    :cond_0
    iget-object v0, p0, Lo/bhb;->g:Lo/emu;

    invoke-virtual {v3}, Lo/ayh;->c()I

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 135
    iget-object v0, p0, Lo/bhb;->g:Lo/emu;

    new-instance v1, Lo/bhb$1;

    invoke-direct {v1, p0, v3}, Lo/bhb$1;-><init>(Lo/bhb;Lo/ayh;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 150
    invoke-virtual {v3}, Lo/ayh;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 152
    iget-object v0, p0, Lo/bhb;->l:Landroid/view/View;

    new-instance v1, Lo/bhb$3;

    invoke-direct {v1, p0, v3}, Lo/bhb$3;-><init>(Lo/bhb;Lo/ayh;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    :cond_2
    invoke-virtual {p0}, Lo/bhb;->c()Landroid/view/View;

    move-result-object v6

    .line 163
    if-eqz v6, :cond_4

    .line 165
    invoke-virtual {v3}, Lo/ayh;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 168
    iget-object v0, p0, Lo/bhb;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bhb;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_black_100_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 173
    :cond_3
    iget-object v0, p0, Lo/bhb;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bhb;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_black_10_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 175
    :goto_1
    iget-object v0, p0, Lo/bhb;->g:Lo/emu;

    invoke-virtual {v3}, Lo/ayh;->i()Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setEnabled(Z)V

    .line 176
    invoke-virtual {v3}, Lo/ayh;->i()Z

    move-result v0

    invoke-virtual {v6, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 178
    :cond_4
    goto :goto_2

    .line 181
    :cond_5
    const-string v0, "NormalGroupSwitchCard"

    const-string v1, "data not instanceof NormalGroupSwitch"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    :goto_2
    return-void
.end method

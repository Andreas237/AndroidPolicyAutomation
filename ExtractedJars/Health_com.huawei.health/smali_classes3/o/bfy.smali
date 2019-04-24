.class public Lo/bfy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    .locals 4

    .line 170
    invoke-static {p0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    .line 171
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    sget-object v1, Lo/bgh$c;->b:Lo/bgh$c;

    invoke-virtual {v0, v2, v1}, Lo/bgh;->a(Ljava/lang/CharSequence;Lo/bgh$c;)Ljava/lang/CharSequence;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/text/SpannableStringBuilder;

    .line 172
    return-object v3
.end method

.method private b(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/Class;)Ljava/lang/CharSequence;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/Class<TT;>;)Ljava/lang/CharSequence;"
        }
    .end annotation

    .line 488
    move-object v3, p2

    .line 489
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 491
    :cond_0
    return-object v3

    .line 493
    :cond_1
    instance-of v0, p2, Landroid/text/SpannableStringBuilder;

    if-eqz v0, :cond_2

    .line 495
    move-object v0, p2

    check-cast v0, Landroid/text/SpannableStringBuilder;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, p3}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v4

    .line 496
    if-eqz v4, :cond_2

    array-length v0, v4

    if-lez v0, :cond_2

    .line 498
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_conversation_content_text_width:I

    .line 499
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    .line 500
    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-static {p2, v0, v5, v1}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    move-result-object v3

    .line 503
    :cond_2
    return-object v3
.end method

.method public static b(Lo/axv;)Ljava/lang/CharSequence;
    .locals 6

    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v5

    .line 53
    invoke-virtual {p0}, Lo/axv;->l()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 58
    :pswitch_0
    invoke-static {v5, p0}, Lo/bfy;->d(Landroid/content/Context;Lo/axv;)Ljava/lang/CharSequence;

    move-result-object v4

    .line 59
    goto :goto_0

    .line 63
    :pswitch_1
    sget v0, Lcom/huawei/android/sns/R$string;->sns_chat_type_image:I

    invoke-virtual {v5, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 64
    goto :goto_0

    .line 68
    :pswitch_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_chat_type_voice:I

    invoke-virtual {v5, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 69
    goto :goto_0

    .line 78
    :pswitch_3
    invoke-virtual {p0}, Lo/axv;->h()Ljava/lang/CharSequence;

    move-result-object v4

    .line 79
    goto :goto_0

    .line 83
    :pswitch_4
    sget v0, Lcom/huawei/android/sns/R$string;->sns_chat_type_link:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/axv;->h()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Lo/bny;->a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 84
    goto :goto_0

    .line 88
    :pswitch_5
    sget v0, Lcom/huawei/android/sns/R$string;->sns_content_type_unknow_text:I

    invoke-virtual {v5, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 89
    goto :goto_0

    .line 93
    :pswitch_6
    sget v0, Lcom/huawei/android/sns/R$string;->sns_transmit_link:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_grp_invite_message_title:I

    .line 94
    invoke-virtual {v5, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 93
    invoke-virtual {v5, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 95
    .line 100
    :goto_0
    :pswitch_7
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_5
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_3
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_3
        :pswitch_6
        :pswitch_2
    .end packed-switch
.end method

.method public static c(I)Ljava/lang/String;
    .locals 2

    .line 154
    const/16 v0, 0x63

    if-le p0, v0, :cond_0

    .line 156
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_max_unread_number:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 159
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Lo/bga$e;Lo/axv;)V
    .locals 3

    .line 454
    invoke-virtual {p2}, Lo/axv;->i()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 456
    invoke-virtual {p2}, Lo/axv;->o()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 458
    invoke-virtual {p1}, Lo/bga$e;->a()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 460
    invoke-virtual {p1}, Lo/bga$e;->a()Landroid/widget/TextView;

    move-result-object v0

    .line 461
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_send_status_sending:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 460
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 463
    :cond_0
    invoke-virtual {p1}, Lo/bga$e;->c()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 465
    invoke-virtual {p1}, Lo/bga$e;->c()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 468
    :cond_1
    invoke-virtual {p2}, Lo/axv;->o()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 470
    invoke-virtual {p1}, Lo/bga$e;->e()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 472
    invoke-virtual {p1}, Lo/bga$e;->e()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 476
    :cond_2
    :goto_0
    return-void
.end method

.method private static d(Landroid/content/Context;Lo/axv;)Ljava/lang/CharSequence;
    .locals 6

    .line 113
    invoke-virtual {p1}, Lo/axv;->h()Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bqz;->a(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    const/4 v0, 0x0

    return-object v0

    .line 118
    :cond_0
    invoke-virtual {p1}, Lo/axv;->i()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 120
    const-string v4, ""

    .line 121
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 123
    const-string v0, "<font color=\'#ff3320\' >%s</font>  <font>%s</font>"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_send_status_draft:I

    .line 124
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/axv;->h()Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 123
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 128
    :cond_1
    const-string v0, "<font color=\'#eb3e22\' >%s</font>  <font>%s</font>"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_send_status_draft:I

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 129
    invoke-virtual {p1}, Lo/axv;->h()Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 128
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 131
    :goto_0
    invoke-static {v4}, Lo/bfy;->b(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v5

    .line 132
    return-object v5

    .line 134
    :cond_2
    invoke-virtual {p1}, Lo/axv;->h()Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/bqz;->a(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 137
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    .line 138
    invoke-virtual {p1}, Lo/axv;->h()Ljava/lang/CharSequence;

    move-result-object v1

    sget-object v2, Lo/bgh$c;->b:Lo/bgh$c;

    .line 137
    invoke-virtual {v0, v1, v2}, Lo/bgh;->a(Ljava/lang/CharSequence;Lo/bgh$c;)Ljava/lang/CharSequence;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/text/SpannableStringBuilder;

    .line 139
    return-object v4

    .line 141
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method private d(Lo/axv;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 5

    .line 426
    invoke-virtual {p1}, Lo/axv;->l()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 428
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bnr;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 430
    return-object p2

    .line 433
    :cond_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v3

    .line 435
    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 436
    move-object v2, v4

    .line 437
    goto :goto_0

    .line 440
    :cond_1
    move-object v2, p2

    .line 442
    :goto_0
    return-object v2
.end method

.method private d(Lo/axv;)Ljava/lang/String;
    .locals 1

    .line 298
    invoke-virtual {p1}, Lo/axv;->t()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lo/bga$e;Lo/axv;Ljava/lang/CharSequence;)V
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 186
    invoke-virtual {p1}, Lo/bga$e;->b()Landroid/widget/TextView;

    move-result-object v7

    .line 187
    if-nez v7, :cond_0

    .line 189
    return-void

    .line 191
    :cond_0
    move-object/from16 v0, p3

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bqz;->a(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 193
    const/4 v0, 0x4

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 197
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 198
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v8

    .line 199
    move-object/from16 v9, p3

    .line 200
    invoke-virtual/range {p2 .. p2}, Lo/axv;->i()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 201
    invoke-virtual/range {p2 .. p2}, Lo/axv;->l()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    .line 202
    invoke-virtual/range {p2 .. p2}, Lo/axv;->l()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    .line 204
    invoke-virtual/range {p2 .. p2}, Lo/axv;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 206
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lo/axv;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 209
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 210
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$plurals;->sns_msg_unread_count:I

    .line 211
    invoke-virtual/range {p2 .. p2}, Lo/axv;->m()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Lo/axv;->m()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 210
    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 212
    const-string v0, "<font color=\'#89000000\' >%s</font>  <font>%s</font>"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v10, v1, v2

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 213
    invoke-static {v11}, Lo/bfy;->b(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v12

    .line 215
    const-class v0, Lo/bnt;

    invoke-direct {p0, v7, v12, v0}, Lo/bfy;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/Class;)Ljava/lang/CharSequence;

    move-result-object v13

    .line 216
    invoke-virtual {v7, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    :goto_0
    move-object/from16 v0, p2

    invoke-direct {p0, p1, v0}, Lo/bfy;->c(Lo/bga$e;Lo/axv;)V

    .line 221
    return-void
.end method

.method public b(Lo/bga$e;Lo/axv;)V
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 271
    invoke-virtual {p1}, Lo/bga$e;->b()Landroid/widget/TextView;

    move-result-object v4

    .line 272
    if-nez v4, :cond_0

    .line 274
    return-void

    .line 276
    :cond_0
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v5

    .line 277
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 278
    const-string v6, ""

    .line 279
    invoke-direct {p0, p2}, Lo/bfy;->d(Lo/axv;)Ljava/lang/String;

    move-result-object v7

    .line 280
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 282
    const-string v0, "<font color=\'#ff3320\' >%s</font>  <font>%s</font>"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_send_status_draft:I

    .line 283
    invoke-virtual {v5, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    .line 282
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 287
    :cond_1
    const-string v0, "<font color=\'#eb3e22\' >%s</font>  <font>%s</font>"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_send_status_draft:I

    .line 288
    invoke-virtual {v5, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    .line 287
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 290
    :goto_0
    invoke-static {v6}, Lo/bfy;->b(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v8

    .line 292
    const-class v0, Lo/bnt;

    invoke-direct {p0, v4, v8, v0}, Lo/bfy;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/Class;)Ljava/lang/CharSequence;

    move-result-object v9

    .line 293
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 294
    return-void
.end method

.method public c(Lo/bga$e;Lo/axv;Ljava/lang/CharSequence;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 234
    invoke-virtual {p1}, Lo/bga$e;->b()Landroid/widget/TextView;

    move-result-object v2

    .line 235
    if-nez v2, :cond_0

    .line 237
    return-void

    .line 239
    :cond_0
    const/4 v0, 0x1

    invoke-static {p3, v0}, Lo/bqz;->a(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 241
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 245
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 247
    invoke-direct {p0, p2, p3}, Lo/bfy;->d(Lo/axv;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    .line 249
    invoke-virtual {p2}, Lo/axv;->i()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 250
    invoke-virtual {p2}, Lo/axv;->l()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    .line 251
    invoke-virtual {p2}, Lo/axv;->l()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    .line 253
    invoke-virtual {p2}, Lo/axv;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lo/axv;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 258
    :cond_2
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    sget-object v1, Lo/bgh$c;->b:Lo/bgh$c;

    invoke-virtual {v0, v3, v1}, Lo/bgh;->a(Ljava/lang/CharSequence;Lo/bgh$c;)Ljava/lang/CharSequence;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/text/SpannableStringBuilder;

    .line 260
    const-class v0, Lo/bnt;

    invoke-direct {p0, v2, v4, v0}, Lo/bfy;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/Class;)Ljava/lang/CharSequence;

    move-result-object v5

    .line 261
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 265
    :goto_0
    invoke-direct {p0, p1, p2}, Lo/bfy;->c(Lo/bga$e;Lo/axv;)V

    .line 266
    return-void
.end method

.method public e(Lo/bga$e;Lo/axv;)V
    .locals 16
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 352
    invoke-virtual/range {p1 .. p1}, Lo/bga$e;->b()Landroid/widget/TextView;

    move-result-object v7

    .line 353
    if-nez v7, :cond_0

    .line 355
    return-void

    .line 357
    :cond_0
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v8

    .line 358
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lo/bfy;->d(Lo/axv;)Ljava/lang/String;

    move-result-object v9

    .line 359
    const/4 v0, 0x1

    invoke-static {v9, v0}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 361
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 362
    const-string v10, ""

    .line 363
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 365
    const-string v0, "<font color=\'#ff3320\' >%s</font>  <font>%s</font>"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_send_status_draft:I

    .line 366
    invoke-virtual {v8, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    .line 365
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    goto :goto_0

    .line 370
    :cond_1
    const-string v0, "<font color=\'#eb3e22\' >%s</font>  <font>%s</font>"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_send_status_draft:I

    .line 371
    invoke-virtual {v8, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    .line 370
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 373
    :goto_0
    invoke-static {v10}, Lo/bfy;->b(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v11

    .line 375
    const-class v0, Lo/bnt;

    move-object/from16 v1, p0

    invoke-direct {v1, v7, v11, v0}, Lo/bfy;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/Class;)Ljava/lang/CharSequence;

    move-result-object v12

    .line 376
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 378
    goto/16 :goto_3

    .line 381
    .line 382
    :cond_2
    invoke-static/range {p2 .. p2}, Lo/bfy;->b(Lo/axv;)Ljava/lang/CharSequence;

    move-result-object v10

    .line 383
    const/4 v0, 0x1

    invoke-static {v10, v0}, Lo/bqz;->a(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 385
    const/4 v0, 0x4

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_2

    .line 389
    :cond_3
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 390
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v10}, Lo/bfy;->d(Lo/axv;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v11

    .line 393
    invoke-virtual/range {p2 .. p2}, Lo/axv;->p()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 394
    invoke-virtual/range {p2 .. p2}, Lo/axv;->m()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_4

    .line 396
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 397
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$plurals;->sns_msg_unread_count:I

    .line 398
    invoke-virtual/range {p2 .. p2}, Lo/axv;->m()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    .line 399
    invoke-virtual/range {p2 .. p2}, Lo/axv;->m()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 397
    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 400
    const-string v0, "<font color=\'#89000000\' >%s</font>  <font>%s</font>"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v13, v1, v2

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 402
    invoke-static {v14}, Lo/bfy;->b(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v15

    .line 403
    const-class v0, Lo/bnt;

    move-object/from16 v1, p0

    invoke-direct {v1, v7, v15, v0}, Lo/bfy;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/Class;)Ljava/lang/CharSequence;

    move-result-object v12

    .line 404
    goto :goto_1

    .line 407
    :cond_4
    const-class v0, Lo/bnt;

    move-object/from16 v1, p0

    invoke-direct {v1, v7, v11, v0}, Lo/bfy;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/Class;)Ljava/lang/CharSequence;

    move-result-object v12

    .line 409
    :goto_1
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 412
    :goto_2
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lo/bfy;->c(Lo/bga$e;Lo/axv;)V

    .line 414
    :goto_3
    return-void
.end method

.method public e(Lo/bga$e;Lo/axv;Ljava/lang/CharSequence;)V
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 305
    invoke-virtual {p1}, Lo/bga$e;->b()Landroid/widget/TextView;

    move-result-object v4

    .line 306
    if-nez v4, :cond_0

    .line 308
    return-void

    .line 310
    :cond_0
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v5

    .line 311
    const/4 v0, 0x1

    invoke-static {p3, v0}, Lo/bqz;->a(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 317
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 319
    invoke-virtual {p2}, Lo/axv;->l()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    .line 320
    invoke-virtual {p2}, Lo/axv;->l()I

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_3

    .line 323
    :cond_2
    const-class v0, Lo/bnt;

    invoke-direct {p0, v4, p3, v0}, Lo/bfy;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/Class;)Ljava/lang/CharSequence;

    move-result-object v6

    .line 324
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 326
    goto :goto_0

    .line 329
    :cond_3
    move-object v6, p3

    .line 330
    invoke-virtual {p2}, Lo/axv;->i()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 331
    invoke-virtual {p2}, Lo/axv;->l()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_4

    .line 333
    invoke-virtual {p2}, Lo/axv;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 335
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lo/axv;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 338
    :cond_4
    const-string v0, "<font color=\'#eb3e22\' >%s</font>  <font>%s</font>"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_someone_reffer_me:I

    .line 339
    invoke-virtual {v5, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    .line 338
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 340
    invoke-static {v7}, Lo/bfy;->b(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v8

    .line 342
    const-class v0, Lo/bnt;

    invoke-direct {p0, v4, v8, v0}, Lo/bfy;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/Class;)Ljava/lang/CharSequence;

    move-result-object v9

    .line 343
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    :goto_0
    return-void
.end method

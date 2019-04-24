.class public Lo/bla;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/health/sns/model/search/SNSSearchBean;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lo/bla;->e:Landroid/content/Context;

    .line 40
    iput-object p2, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 41
    return-void
.end method

.method private a()Z
    .locals 3

    .line 155
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMatchType()I

    move-result v1

    .line 157
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    .line 159
    const/4 v0, 0x1

    return v0

    .line 161
    :cond_0
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUIMatchType()I

    move-result v2

    .line 163
    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    .line 165
    const/4 v0, 0x1

    return v0

    .line 168
    :cond_1
    const/4 v0, 0x3

    if-ne v1, v0, :cond_2

    const/4 v0, 0x3

    if-ne v2, v0, :cond_2

    .line 171
    const/4 v0, 0x1

    return v0

    .line 174
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private b(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    .locals 3

    .line 283
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 285
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getKeyColorText()Ljava/lang/String;

    move-result-object v2

    .line 287
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 289
    :cond_0
    return-object v1

    .line 292
    :cond_1
    invoke-direct {p0, p1, v2}, Lo/bla;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 294
    return-object v1
.end method

.method private b(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Lcom/huawei/health/sns/model/search/MemberSearchBean;I)V
    .locals 9

    .line 362
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getSearchKey()Ljava/lang/String;

    move-result-object v6

    .line 364
    const/4 v8, 0x0

    .line 365
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v7

    .line 366
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v8, v0, 0x1

    .line 367
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, v6

    move v4, p4

    add-int v5, p4, v8

    invoke-direct/range {v0 .. v5}, Lo/bla;->d(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableStringBuilder;

    .line 368
    return-void
.end method

.method private b()Z
    .locals 2

    .line 122
    const/4 v1, 0x0

    .line 123
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getBeanType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 126
    :pswitch_0
    invoke-direct {p0}, Lo/bla;->a()Z

    move-result v1

    .line 127
    goto :goto_0

    .line 129
    :pswitch_1
    invoke-direct {p0}, Lo/bla;->g()Z

    move-result v1

    .line 130
    goto :goto_0

    .line 132
    :pswitch_2
    const/4 v1, 0x1

    .line 133
    goto :goto_0

    .line 136
    :pswitch_3
    const/4 v1, 0x0

    .line 137
    goto :goto_0

    .line 139
    :pswitch_4
    invoke-direct {p0}, Lo/bla;->e()Z

    move-result v1

    .line 140
    .line 145
    :goto_0
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private d(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableStringBuilder;
    .locals 13

    .line 469
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 470
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 473
    if-ltz p4, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    move/from16 v1, p5

    if-le v1, v0, :cond_1

    .line 475
    :cond_0
    return-object p1

    .line 479
    :cond_1
    move/from16 v0, p4

    move/from16 v1, p5

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 481
    invoke-virtual {v4, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 482
    const/4 v0, -0x1

    if-le v5, v0, :cond_2

    .line 485
    move/from16 v0, p4

    invoke-virtual {v2, v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v5

    .line 486
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v5

    invoke-direct {p0, p1, v5, v0}, Lo/bla;->d(Landroid/text/SpannableStringBuilder;II)V

    goto :goto_1

    .line 491
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v6

    .line 493
    move/from16 v7, p4

    .line 494
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    .line 495
    move-object v9, v6

    array-length v10, v9

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_5

    aget-char v12, v9, v11

    .line 498
    add-int/lit8 v0, v8, -0x1

    if-le v7, v0, :cond_3

    .line 500
    goto :goto_1

    .line 502
    :cond_3
    invoke-virtual {v2, v12, v7}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    .line 503
    add-int/lit8 v7, v5, 0x1

    .line 504
    add-int/lit8 v0, v5, 0x1

    invoke-direct {p0, p1, v5, v0}, Lo/bla;->d(Landroid/text/SpannableStringBuilder;II)V

    .line 507
    move/from16 v0, p5

    if-lt v5, v0, :cond_4

    .line 509
    goto :goto_1

    .line 495
    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 513
    :cond_5
    :goto_1
    return-object p1
.end method

.method private d(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    .locals 11

    .line 305
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 307
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getKeyColorText()Ljava/lang/String;

    move-result-object v3

    .line 309
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMemberBean()Ljava/util/ArrayList;

    move-result-object v4

    .line 310
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 312
    :cond_0
    return-object v2

    .line 316
    :cond_1
    const/4 v6, 0x0

    .line 317
    const/4 v7, 0x0

    .line 319
    const/4 v8, -0x1

    .line 321
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/health/sns/model/search/MemberSearchBean;

    .line 323
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v5

    .line 324
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 326
    goto :goto_0

    .line 328
    :cond_2
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v7, v0, 0x1

    .line 330
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getSearchType()I

    move-result v8

    .line 332
    packed-switch v8, :pswitch_data_0

    goto :goto_1

    .line 335
    :pswitch_0
    invoke-direct {p0, v2, p1, v10, v6}, Lo/bla;->b(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Lcom/huawei/health/sns/model/search/MemberSearchBean;I)V

    .line 336
    goto :goto_1

    .line 339
    :pswitch_1
    invoke-direct {p0, v2, p1, v10, v6}, Lo/bla;->d(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Lcom/huawei/health/sns/model/search/MemberSearchBean;I)V

    .line 340
    .line 345
    :goto_1
    add-int/2addr v6, v7

    .line 346
    goto :goto_0

    .line 348
    :cond_3
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private d(Landroid/text/SpannableStringBuilder;II)V
    .locals 4

    .line 227
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    .line 229
    if-ltz p2, :cond_0

    if-le p3, v3, :cond_1

    .line 231
    :cond_0
    return-void

    .line 233
    :cond_1
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 235
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    iget-object v1, p0, Lo/bla;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_search_word_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v1, 0x22

    invoke-virtual {p1, v0, p2, p3, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 240
    :cond_2
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    iget-object v1, p0, Lo/bla;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_ya_lan:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v1, 0x22

    invoke-virtual {p1, v0, p2, p3, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 243
    :goto_0
    return-void
.end method

.method private d(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Lcom/huawei/health/sns/model/search/MemberSearchBean;I)V
    .locals 13

    .line 382
    const/4 v7, 0x0

    .line 383
    const/4 v8, 0x0

    .line 384
    const/4 v9, 0x0

    .line 385
    const/4 v10, 0x0

    .line 391
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v6

    .line 392
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getMatchIndex()I

    move-result v7

    .line 393
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getMatchCount()I

    move-result v8

    .line 396
    invoke-static {v6}, Lo/bqv;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 398
    add-int v9, v7, v8

    .line 400
    if-ltz v7, :cond_0

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    if-le v9, v0, :cond_1

    .line 402
    :cond_0
    return-void

    .line 405
    :cond_1
    invoke-virtual {v11, v7, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    .line 406
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v10, v0, 0x1

    .line 407
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, v12

    move/from16 v4, p4

    add-int v5, p4, v10

    invoke-direct/range {v0 .. v5}, Lo/bla;->d(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableStringBuilder;

    .line 409
    return-void
.end method

.method private e(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    .locals 7

    .line 253
    const/4 v1, 0x0

    .line 255
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMatchIndex()I

    move-result v2

    .line 256
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMatchCount()I

    move-result v3

    .line 259
    invoke-static {p1}, Lo/bqv;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 261
    add-int v5, v2, v3

    .line 263
    if-ltz v2, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-le v5, v0, :cond_1

    .line 265
    :cond_0
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 266
    return-object v1

    .line 269
    :cond_1
    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 271
    invoke-direct {p0, p1, v6}, Lo/bla;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 272
    return-object v1
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    .locals 12

    .line 420
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 423
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 424
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 427
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    .line 428
    const/4 v0, -0x1

    if-le v4, v0, :cond_0

    .line 430
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v4

    invoke-direct {p0, v1, v4, v0}, Lo/bla;->d(Landroid/text/SpannableStringBuilder;II)V

    goto :goto_1

    .line 435
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    .line 437
    const/4 v6, 0x0

    .line 438
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    .line 439
    move-object v8, v5

    array-length v9, v8

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_2

    aget-char v11, v8, v10

    .line 442
    add-int/lit8 v0, v7, -0x1

    if-le v6, v0, :cond_1

    .line 444
    goto :goto_1

    .line 446
    :cond_1
    invoke-virtual {v2, v11, v6}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 447
    add-int/lit8 v6, v4, 0x1

    .line 448
    add-int/lit8 v0, v4, 0x1

    invoke-direct {p0, v1, v4, v0}, Lo/bla;->d(Landroid/text/SpannableStringBuilder;II)V

    .line 439
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 451
    :cond_2
    :goto_1
    return-object v1
.end method

.method private e()Z
    .locals 3

    .line 184
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMatchType()I

    move-result v1

    .line 186
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    .line 188
    const/4 v0, 0x1

    return v0

    .line 190
    :cond_0
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUIDisplayNameMatchType()I

    move-result v2

    .line 192
    const/16 v0, 0x8

    if-ne v1, v0, :cond_1

    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    .line 195
    const/4 v0, 0x1

    return v0

    .line 198
    :cond_1
    const/4 v0, 0x2

    if-ne v1, v0, :cond_2

    const/4 v0, 0x3

    if-ne v2, v0, :cond_2

    .line 201
    const/4 v0, 0x1

    return v0

    .line 204
    :cond_2
    const/4 v0, 0x3

    if-ne v1, v0, :cond_3

    const/4 v0, 0x4

    if-ne v2, v0, :cond_3

    .line 207
    const/4 v0, 0x1

    return v0

    .line 209
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private g()Z
    .locals 2

    .line 219
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMatchType()I

    move-result v1

    .line 221
    const/4 v0, 0x3

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public c()Landroid/text/SpannableStringBuilder;
    .locals 4

    .line 50
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-direct {p0}, Lo/bla;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 54
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 55
    return-object v2

    .line 58
    :cond_0
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSearchType()I

    move-result v3

    .line 59
    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 62
    :pswitch_0
    invoke-direct {p0, v1}, Lo/bla;->b(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 63
    goto :goto_1

    .line 66
    :pswitch_1
    invoke-direct {p0, v1}, Lo/bla;->e(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 67
    goto :goto_1

    .line 69
    :goto_0
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 72
    :goto_1
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public d()Landroid/text/SpannableStringBuilder;
    .locals 5

    .line 82
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v1

    .line 83
    const/4 v2, 0x0

    .line 85
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 88
    return-object v2

    .line 91
    :cond_0
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getBeanType()I

    move-result v3

    .line 92
    const/4 v0, 0x3

    if-ne v3, v0, :cond_1

    .line 94
    invoke-direct {p0, v1}, Lo/bla;->d(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 95
    return-object v2

    .line 98
    :cond_1
    iget-object v0, p0, Lo/bla;->d:Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSearchType()I

    move-result v4

    .line 99
    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 102
    :pswitch_0
    invoke-direct {p0, v1}, Lo/bla;->b(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 103
    goto :goto_1

    .line 106
    :pswitch_1
    invoke-direct {p0, v1}, Lo/bla;->e(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 107
    goto :goto_1

    .line 109
    :goto_0
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 112
    :goto_1
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

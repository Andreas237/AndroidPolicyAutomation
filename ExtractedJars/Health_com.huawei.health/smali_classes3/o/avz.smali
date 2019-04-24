.class public Lo/avz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/avz;->a:Landroid/content/ContentResolver;

    .line 55
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 437
    invoke-direct {p0, p1}, Lo/avz;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 439
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 440
    const-string v0, " and "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "group_name like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/health/sns/model/search/SNSSearchBean;)Z
    .locals 6

    .line 377
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSearchShortPinyin()Ljava/lang/String;

    move-result-object v1

    .line 378
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getKeyColorText()Ljava/lang/String;

    move-result-object v2

    .line 379
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 381
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 385
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 387
    const/4 v4, -0x1

    .line 389
    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    .line 391
    if-gez v4, :cond_2

    .line 393
    const/4 v0, 0x0

    return v0

    .line 395
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    .line 396
    invoke-virtual {p1, v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMatchIndex(I)V

    .line 397
    invoke-virtual {p1, v5}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMatchCount(I)V

    .line 398
    const/4 v0, 0x1

    return v0
.end method

.method private b()Ljava/lang/String;
    .locals 1

    .line 207
    const-string v0, "group_type =? and group_name <> ?"

    .line 208
    return-object v0
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lo/avz;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0, p1}, Lo/avz;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 105
    return-object v2
.end method

.method private b(Lcom/huawei/health/sns/model/search/SNSSearchBean;)Z
    .locals 3

    .line 348
    const/4 v1, 0x0

    .line 349
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSearchType()I

    move-result v2

    .line 351
    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 354
    :pswitch_0
    const/4 v1, 0x1

    .line 355
    goto :goto_0

    .line 357
    :pswitch_1
    invoke-direct {p0, p1}, Lo/avz;->a(Lcom/huawei/health/sns/model/search/SNSSearchBean;)Z

    move-result v1

    .line 358
    goto :goto_0

    .line 360
    :pswitch_2
    invoke-direct {p0, p1}, Lo/avz;->d(Lcom/huawei/health/sns/model/search/SNSSearchBean;)Z

    move-result v1

    .line 361
    .line 366
    :goto_0
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private c()Ljava/lang/String;
    .locals 1

    .line 170
    const-string v0, " and alias_match_type=0"

    .line 171
    return-object v0
.end method

.method private c(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 78
    const/4 v1, 0x0

    .line 79
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 82
    :pswitch_0
    invoke-direct {p0, p2}, Lo/avz;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 83
    goto :goto_0

    .line 85
    :pswitch_1
    invoke-direct {p0, p2}, Lo/avz;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 86
    goto :goto_0

    .line 88
    :pswitch_2
    invoke-direct {p0, p2}, Lo/avz;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 89
    .line 93
    :goto_0
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 453
    invoke-static {p1}, Lo/bqz;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 454
    return-object v0
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 132
    invoke-direct {p0, p1}, Lo/avz;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " and search_full_pinyin like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lo/avz;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lo/avz;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 136
    return-object v4
.end method

.method private d(Ljava/lang/String;I)Ljava/lang/String;
    .locals 4

    .line 183
    invoke-direct {p0, p1}, Lo/avz;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 185
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    const-string v0, "case"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " when group_name like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " then "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " when search_short_pinyin like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " then "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    :cond_0
    const-string v0, " else 0 end "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    const-string v0, " as alias_match_type"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Lcom/huawei/health/sns/model/search/SNSSearchBean;)Z
    .locals 6

    .line 409
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSearchPinyinFenci()Ljava/lang/String;

    move-result-object v1

    .line 410
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getKeyColorText()Ljava/lang/String;

    move-result-object v2

    .line 411
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 413
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 417
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 419
    const/4 v0, 0x2

    new-array v4, v0, [I

    .line 420
    invoke-static {v4, v3, v1}, Lo/avr;->a([ILjava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 421
    if-eqz v5, :cond_2

    .line 423
    const/4 v0, 0x0

    aget v0, v4, v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMatchIndex(I)V

    .line 424
    const/4 v0, 0x1

    aget v0, v4, v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMatchCount(I)V

    .line 426
    :cond_2
    return v5
.end method

.method private e(I)I
    .locals 2

    .line 322
    const/4 v1, 0x0

    .line 323
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 326
    :pswitch_0
    const/16 v1, 0xb

    .line 327
    goto :goto_0

    .line 329
    :pswitch_1
    const/16 v1, 0x9

    .line 330
    goto :goto_0

    .line 332
    :pswitch_2
    const/16 v1, 0xa

    .line 333
    .line 337
    :goto_0
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 116
    invoke-direct {p0, p1}, Lo/avz;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " and search_short_pinyin like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lo/avz;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lo/avz;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 121
    return-object v4
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 160
    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1, p2}, Lo/avz;->d(ILjava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;I)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 66
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2}, Lo/avz;->d(ILjava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;I)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 148
    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1, p2}, Lo/avz;->d(ILjava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public d(ILjava/lang/String;I)Ljava/util/ArrayList;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;I)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 221
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 222
    new-instance v7, Lo/att;

    invoke-direct {v7}, Lo/att;-><init>()V

    .line 224
    const/4 v8, 0x0

    .line 228
    const/4 v0, 0x2

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    .line 229
    invoke-static/range {p3 .. p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    const-string v0, "\'\'"

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 231
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lo/avz;->c(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 234
    invoke-virtual {v7}, Lo/att;->c()[Ljava/lang/String;

    move-result-object v12

    .line 235
    array-length v13, v12

    .line 236
    add-int/lit8 v0, v13, 0x1

    new-array v11, v0, [Ljava/lang/String;

    .line 238
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v12, v0, v11, v1, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 240
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p1

    invoke-direct {v0, v1, v2}, Lo/avz;->d(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v11, v13

    .line 243
    const-string v14, "sort_pinyin asc, create_time desc"

    .line 244
    move-object v15, v14

    .line 245
    move/from16 v0, p3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 248
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "grp_name_flag asc, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 250
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/avz;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    move-object v2, v11

    move-object v3, v10

    move-object v4, v9

    move-object v5, v15

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 251
    const/16 v16, 0x0

    .line 252
    const/16 v17, 0x0

    .line 253
    if-eqz v8, :cond_3

    .line 255
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 257
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 258
    const/16 v18, 0x0

    .line 262
    :cond_1
    invoke-virtual {v7, v8}, Lo/att;->a(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v18

    .line 265
    new-instance v16, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/health/sns/model/search/SNSSearchBean;-><init>()V

    .line 267
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/health/sns/model/group/Group;->getSearchFullPinyin()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSearchFullPinyin(Ljava/lang/String;)V

    .line 268
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/health/sns/model/group/Group;->getSearchShortPinyin()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSearchShortPinyin(Ljava/lang/String;)V

    .line 269
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/health/sns/model/group/Group;->getSearchPinyinFenci()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSearchPinyinFenci(Ljava/lang/String;)V

    .line 270
    move-object/from16 v0, v16

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setBeanType(I)V

    .line 271
    move-object/from16 v0, v16

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setCardType(I)V

    .line 272
    sget-object v0, Lo/bfp$c;->f:Lo/bfp$c;

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setEventType(Lo/bfp$c;)V

    .line 273
    move-object/from16 v0, v16

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setKeyColorText(Ljava/lang/String;)V

    .line 276
    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v0, v1}, Lo/avz;->e(I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMatchType(I)V

    .line 278
    move-object/from16 v0, v16

    move/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSearchType(I)V

    .line 281
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setUserId(J)V

    .line 282
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageUrl(Ljava/lang/String;)V

    .line 283
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setOldImageUrl(Ljava/lang/String;)V

    .line 284
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageURLDownload(Ljava/lang/String;)V

    .line 285
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setTitle(Ljava/lang/String;)V

    .line 287
    move-object/from16 v0, v16

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setGroup(Lcom/huawei/health/sns/model/group/Group;)V

    .line 289
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Lo/avz;->b(Lcom/huawei/health/sns/model/search/SNSSearchBean;)Z

    move-result v17

    .line 290
    if-eqz v17, :cond_2

    .line 292
    move-object/from16 v0, v16

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    :cond_2
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 305
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 307
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 308
    const/4 v8, 0x0

    goto :goto_0

    .line 299
    :catch_0
    move-exception v9

    .line 301
    const-string v0, ""

    const-string v1, "getGroupList SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 305
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 307
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 308
    const/4 v8, 0x0

    goto :goto_0

    .line 305
    :catchall_0
    move-exception v19

    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 307
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 308
    const/4 v8, 0x0

    .line 310
    :cond_4
    throw v19

    .line 311
    :cond_5
    :goto_0
    return-object v6
.end method

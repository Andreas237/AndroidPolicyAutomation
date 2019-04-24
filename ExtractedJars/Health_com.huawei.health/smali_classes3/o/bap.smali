.class public final Lo/bap;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/bap;


# instance fields
.field private a:J

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ban;>;"
        }
    .end annotation
.end field

.field private d:Landroid/support/v4/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LongSparseArray<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Long;>;>;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 5

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/bap;->e:Ljava/lang/Object;

    .line 77
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/bap;->a:J

    .line 97
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lo/bap;->d:Landroid/support/v4/util/LongSparseArray;

    .line 119
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "sensitive_sp"

    .line 120
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 121
    if-eqz v3, :cond_0

    .line 123
    const-string v0, "sensitive_sp_key"

    const/4 v1, 0x0

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 124
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 126
    const-string v0, "spUpdateSTKey"

    const-wide/16 v1, 0x0

    invoke-interface {v3, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lo/bap;->a:J

    .line 127
    invoke-static {v4}, Lo/ban;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/bap;->b:Ljava/util/List;

    .line 130
    :cond_0
    return-void
.end method

.method private b(I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lo/ban;>;"
        }
    .end annotation

    .line 253
    const/4 v1, 0x0

    .line 254
    iget-object v2, p0, Lo/bap;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 256
    :try_start_0
    iget-object v0, p0, Lo/bap;->b:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bap;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 258
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 259
    iget-object v0, p0, Lo/bap;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ban;

    .line 261
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lo/ban;->d()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 263
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 265
    :cond_0
    goto :goto_0

    .line 267
    :cond_1
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 269
    :goto_1
    return-object v1
.end method

.method public static declared-synchronized b()Lo/bap;
    .locals 3

    const-class v1, Lo/bap;

    monitor-enter v1

    .line 139
    :try_start_0
    sget-object v0, Lo/bap;->c:Lo/bap;

    if-nez v0, :cond_0

    .line 141
    new-instance v0, Lo/bap;

    invoke-direct {v0}, Lo/bap;-><init>()V

    sput-object v0, Lo/bap;->c:Lo/bap;

    .line 143
    :cond_0
    sget-object v0, Lo/bap;->c:Lo/bap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private c(Lo/ban;)Ljava/lang/String;
    .locals 4

    .line 280
    const/4 v1, 0x0

    .line 281
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    .line 282
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    .line 283
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 285
    const-string v0, "zh"

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 287
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/ban;->c(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 289
    :cond_0
    const-string v0, "en"

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 291
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lo/ban;->c(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 296
    :cond_1
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lo/ban;->c(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 301
    :cond_2
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lo/ban;->c(I)Ljava/lang/String;

    move-result-object v1

    .line 303
    :goto_0
    return-object v1
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 544
    const-string v1, "[`~!@#$%^&\\\\_\\s*()+=|{}\':;\',\\[\\].<>/?\uff5e\uff01\uff20\uff03\uffe5\uff05\u2026\u2026\uff06\uff3c\uff5c\uff0a\uff08\uff09\u2014\u2014\uff0b\uff5b\uff5d\u3010\u3011\u2018\uff1b\uff1a\u201c\u201d\u2019\u3002\uff0c\u3001\uff1f]"

    .line 545
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 546
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 547
    const-string v0, ""

    invoke-virtual {v3, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(J)V
    .locals 1

    .line 523
    iget-object v0, p0, Lo/bap;->d:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->remove(J)V

    .line 524
    return-void
.end method

.method public a(Landroid/os/Handler;)V
    .locals 2

    .line 321
    const-string v0, "Sensitive"

    const-string v1, "requestServerInfo return,not support sentive words"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    return-void
.end method

.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 14

    .line 415
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgAssistJson()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 418
    return-void

    .line 421
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v2

    .line 422
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v3

    .line 424
    const/4 v0, 0x1

    if-ne v2, v0, :cond_2

    .line 426
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v3, v4, v0}, Lo/bap;->d(JLjava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 427
    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 431
    new-instance v6, Lo/bao;

    invoke-direct {v6}, Lo/bao;-><init>()V

    .line 432
    const/4 v7, 0x0

    .line 433
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 435
    invoke-virtual {v6, p1, v9}, Lo/bao;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v7

    .line 436
    invoke-virtual {v6, v7}, Lo/bao;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 437
    goto :goto_0

    .line 439
    :cond_1
    goto/16 :goto_2

    .line 440
    :cond_2
    const/16 v0, 0x8

    if-ne v2, v0, :cond_6

    .line 442
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v5

    .line 443
    if-nez v5, :cond_3

    .line 445
    return-void

    .line 448
    :cond_3
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->f:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_6

    .line 450
    move-object v6, v5

    check-cast v6, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 452
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 454
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v3, v4, v0}, Lo/bap;->d(JLjava/lang/String;)Ljava/util/List;

    move-result-object v8

    .line 455
    if-eqz v8, :cond_4

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 457
    invoke-interface {v7, v8}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 461
    :cond_4
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkBrief()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v3, v4, v0}, Lo/bap;->d(JLjava/lang/String;)Ljava/util/List;

    move-result-object v9

    .line 462
    if-eqz v9, :cond_5

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 464
    invoke-interface {v7, v9}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 468
    :cond_5
    const/4 v10, 0x0

    .line 470
    new-instance v11, Lo/bao;

    invoke-direct {v11}, Lo/bao;-><init>()V

    .line 471
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/String;

    .line 473
    invoke-virtual {v11, p1, v13}, Lo/bao;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v10

    .line 474
    invoke-virtual {v11, v10}, Lo/bao;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 475
    goto :goto_1

    .line 478
    :cond_6
    :goto_2
    return-void
.end method

.method public b(J)V
    .locals 1

    .line 533
    invoke-static {}, Lo/bas;->a()Lo/bas;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/bas;->a(J)V

    .line 534
    return-void
.end method

.method public c(JLjava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 155
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 157
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 161
    :cond_1
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/bap;->b(I)Ljava/util/List;

    move-result-object v2

    .line 163
    const/4 v3, 0x0

    .line 164
    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 166
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ban;

    .line 168
    if-eqz v5, :cond_2

    invoke-direct {p0, p3}, Lo/bap;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/ban;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 171
    invoke-direct {p0, v5}, Lo/bap;->c(Lo/ban;)Ljava/lang/String;

    move-result-object v3

    .line 172
    goto :goto_1

    .line 174
    :cond_2
    goto :goto_0

    .line 176
    :cond_3
    :goto_1
    return-object v3
.end method

.method protected d(JLjava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/lang/String;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 187
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 193
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/bap;->b(I)Ljava/util/List;

    move-result-object v2

    .line 195
    invoke-static {}, Lo/bas;->a()Lo/bas;

    move-result-object v0

    invoke-virtual {v0, p1, p2, v2}, Lo/bas;->b(JLjava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 197
    const/4 v4, 0x0

    .line 198
    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 200
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 201
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ban;

    .line 203
    if-eqz v6, :cond_2

    invoke-direct {p0, p3}, Lo/bap;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/ban;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 205
    invoke-direct {p0, v6}, Lo/bap;->c(Lo/ban;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    invoke-static {}, Lo/bas;->a()Lo/bas;

    move-result-object v0

    invoke-virtual {v6}, Lo/ban;->c()I

    move-result v1

    invoke-virtual {v0, p1, p2, v1}, Lo/bas;->b(JI)V

    .line 208
    :cond_2
    goto :goto_0

    .line 210
    :cond_3
    return-object v4
.end method

.method public d()V
    .locals 1

    .line 311
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bap;->a(Landroid/os/Handler;)V

    .line 312
    return-void
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 222
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 224
    const/4 v0, 0x0

    return-object v0

    .line 227
    :cond_0
    const-string v1, ""

    .line 229
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/bap;->b(I)Ljava/util/List;

    move-result-object v2

    .line 231
    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 233
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ban;

    .line 235
    if-eqz v4, :cond_1

    invoke-direct {p0, p1}, Lo/bap;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/ban;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 237
    invoke-direct {p0, v4}, Lo/bap;->c(Lo/ban;)Ljava/lang/String;

    move-result-object v1

    .line 238
    goto :goto_1

    .line 240
    :cond_1
    goto :goto_0

    .line 242
    :cond_2
    :goto_1
    return-object v1
.end method

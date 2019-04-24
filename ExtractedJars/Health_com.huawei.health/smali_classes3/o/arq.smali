.class public Lo/arq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private e:Landroid/content/ContentResolver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const-class v0, Lo/arq;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/arq;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/arq;->e:Landroid/content/ContentResolver;

    .line 76
    return-void
.end method

.method private b(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/circle/UserCircle;
    .locals 10

    .line 419
    new-instance v9, Lcom/huawei/health/sns/model/circle/UserCircle;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-direct {v9, v0}, Lcom/huawei/health/sns/model/circle/UserCircle;-><init>(I)V

    .line 420
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    .line 421
    const/4 v2, 0x2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 422
    const/4 v3, 0x3

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 420
    :goto_0
    invoke-virtual {v9, v0, v1, v2, v3}, Lcom/huawei/health/sns/model/circle/UserCircle;->setUserData(JLjava/lang/String;Z)V

    .line 423
    move-object v0, v9

    const/4 v1, 0x4

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 424
    const/4 v2, 0x4

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 425
    const/4 v3, 0x6

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    .line 426
    const/4 v5, 0x7

    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 427
    const/16 v6, 0x8

    invoke-interface {p1, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 428
    :goto_1
    const/16 v7, 0x9

    invoke-interface {p1, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 429
    const/16 v8, 0xa

    invoke-interface {p1, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 423
    invoke-virtual/range {v0 .. v8}, Lcom/huawei/health/sns/model/circle/UserCircle;->setAppData(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 430
    return-object v9
.end method

.method private c(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircle;>;)Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;"
        }
    .end annotation

    .line 269
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 270
    if-nez p1, :cond_0

    .line 272
    return-object v5

    .line 274
    :cond_0
    const/4 v6, 0x0

    .line 275
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/circle/UserCircle;

    .line 277
    sget-object v0, Lo/bbz$k;->b:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newDelete(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    const-string v1, "_id = ? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    .line 279
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/circle/UserCircle;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 278
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 279
    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v6

    .line 281
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    sget-object v0, Lo/bbz$d;->c:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newDelete(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    const-string v1, "circle_id = ? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    .line 284
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/circle/UserCircle;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 283
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 284
    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v6

    .line 285
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    sget-object v0, Lo/bbz$b;->a:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newDelete(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    const-string v1, "circle_id = ? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    .line 288
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/circle/UserCircle;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 287
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 288
    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v6

    .line 289
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    goto/16 :goto_0

    .line 291
    :cond_1
    return-object v5
.end method

.method private d(Landroid/database/Cursor;I)Lcom/huawei/health/sns/model/circle/UserCircleContent;
    .locals 2

    .line 254
    new-instance v1, Lcom/huawei/health/sns/model/circle/UserCircleContent;

    invoke-direct {v1}, Lcom/huawei/health/sns/model/circle/UserCircleContent;-><init>()V

    .line 255
    invoke-virtual {v1, p2}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->setCircleId(I)V

    .line 256
    const/16 v0, 0xb

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->setCircleType(I)V

    .line 257
    const/16 v0, 0xc

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->setCircleContent(Ljava/lang/String;)V

    .line 258
    return-object v1
.end method

.method private d(Ljava/util/List;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircle;>;Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;)Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;"
        }
    .end annotation

    .line 302
    if-nez p1, :cond_0

    .line 304
    return-object p2

    .line 307
    :cond_0
    const/4 v4, 0x0

    .line 308
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/circle/UserCircle;

    .line 310
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getCircleContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getCircleContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 312
    goto :goto_0

    .line 314
    :cond_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 316
    sget-object v0, Lo/bbz$k;->b:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withYieldAllowed(Z)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v4

    .line 317
    const-string v0, "user_id"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 318
    const-string v0, "circle_name"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getCircleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 319
    const-string v0, "show_download"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->isShowDownload()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 320
    const-string v0, "app_package"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getAppPackage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 321
    const-string v0, "app_name"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getAppName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 322
    const-string v0, "app_version"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getAppVersion()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 323
    const-string v0, "app_id"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 324
    const-string v0, "app_redirect"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->isAppRedirect()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 325
    const-string v0, "redirect_url"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getRedirectUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 326
    const-string v0, "redirect_action"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getRedirectAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 327
    invoke-virtual {v4}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getActionParam()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getActionParam()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 331
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getActionParam()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/circle/CircleActionParam;

    .line 333
    sget-object v0, Lo/bbz$d;->c:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 334
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withYieldAllowed(Z)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v4

    .line 335
    const-string v0, "circle_id"

    invoke-virtual {v4, v0, v3}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    .line 336
    const-string v0, "action_param_key"

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/circle/CircleActionParam;->getActionParamKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 337
    const-string v0, "action_param_value"

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/circle/CircleActionParam;->getActionParamValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 338
    invoke-virtual {v4}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    goto :goto_3

    .line 342
    :cond_5
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getCircleContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 344
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircle;->getCircleContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/circle/UserCircleContent;

    .line 346
    sget-object v0, Lo/bbz$b;->a:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withYieldAllowed(Z)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v4

    .line 348
    const-string v0, "circle_id"

    invoke-virtual {v4, v0, v3}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    .line 349
    const-string v0, "circle_type"

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->getCircleType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 350
    const-string v0, "circle_content"

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->getCircleContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 351
    invoke-virtual {v4}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 352
    goto :goto_4

    .line 354
    :cond_6
    goto/16 :goto_0

    .line 355
    :cond_7
    return-object p2
.end method

.method private d(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;)[Landroid/content/ContentProviderResult;"
        }
    .end annotation

    .line 366
    const/4 v2, 0x0

    .line 367
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 369
    :cond_0
    sget-object v0, Lo/arq;->c:Ljava/lang/String;

    const-string v1, "applyOperationBatch failed! operations is Empty! "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    return-object v2

    .line 374
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/arq;->e:Landroid/content/ContentResolver;

    const-string v1, "com.huawei.health.sns.provider"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/OperationApplicationException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v2, v0

    .line 383
    goto :goto_0

    .line 376
    :catch_0
    move-exception v3

    .line 378
    sget-object v0, Lo/arq;->c:Ljava/lang/String;

    const-string v1, "applyOperationBatch RemoteException!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    goto :goto_0

    .line 380
    :catch_1
    move-exception v3

    .line 382
    sget-object v0, Lo/arq;->c:Ljava/lang/String;

    const-string v1, "applyOperationBatch OperationApplicationException!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    :goto_0
    return-object v2
.end method

.method private e()[Ljava/lang/String;
    .locals 3

    .line 395
    const/16 v0, 0xd

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "t_user_circle._id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "t_user_circle.user_id"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "t_user_circle.circle_name"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "t_user_circle.show_download"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "t_user_circle.app_package"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "t_user_circle.app_name"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "t_user_circle.app_version"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "t_user_circle.app_id"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "t_user_circle.app_redirect"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "t_user_circle.redirect_url"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "t_user_circle.redirect_action"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "t_circle_content.circle_type"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "t_circle_content.circle_content"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public a(J)Ljava/util/ArrayList;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/circle/UserCircle;>;"
        }
    .end annotation

    .line 140
    const/4 v6, 0x0

    .line 141
    const-string v7, "user_id=?"

    .line 142
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    .line 143
    invoke-static/range {p1 .. p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 144
    const-string v9, "t_user_circle._id asc,t_circle_content._id asc "

    .line 146
    const/4 v10, 0x0

    .line 149
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/arq;->e:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$k;->e:Landroid/net/Uri;

    invoke-direct/range {p0 .. p0}, Lo/arq;->e()[Ljava/lang/String;

    move-result-object v2

    move-object v3, v7

    move-object v4, v8

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 151
    if-eqz v10, :cond_4

    .line 153
    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_4

    .line 155
    const/4 v11, 0x0

    .line 156
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v6, v0

    .line 157
    const/4 v12, 0x0

    .line 158
    const/4 v13, 0x0

    .line 159
    const/4 v14, -0x1

    .line 161
    :cond_0
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 163
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v15

    .line 164
    if-eq v15, v14, :cond_2

    .line 166
    if-eqz v11, :cond_1

    .line 168
    invoke-virtual {v11, v12}, Lcom/huawei/health/sns/model/circle/UserCircle;->setCircleContent(Ljava/util/List;)V

    .line 169
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    :cond_1
    move-object/from16 v0, p0

    invoke-direct {v0, v10}, Lo/arq;->b(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/circle/UserCircle;

    move-result-object v11

    .line 172
    move v14, v15

    .line 173
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 174
    move-object/from16 v0, p0

    invoke-direct {v0, v10, v15}, Lo/arq;->d(Landroid/database/Cursor;I)Lcom/huawei/health/sns/model/circle/UserCircleContent;

    move-result-object v13

    .line 175
    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 179
    :cond_2
    move-object/from16 v0, p0

    invoke-direct {v0, v10, v15}, Lo/arq;->d(Landroid/database/Cursor;I)Lcom/huawei/health/sns/model/circle/UserCircleContent;

    move-result-object v13

    .line 180
    if-eqz v12, :cond_0

    .line 182
    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 186
    :cond_3
    if-eqz v11, :cond_4

    .line 188
    invoke-virtual {v11, v12}, Lcom/huawei/health/sns/model/circle/UserCircle;->setCircleContent(Ljava/util/List;)V

    .line 189
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 200
    :cond_4
    if-eqz v10, :cond_6

    .line 202
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 194
    :catch_0
    move-exception v11

    .line 196
    :try_start_1
    sget-object v0, Lo/arq;->c:Ljava/lang/String;

    const-string v1, "queryUserCircles SQLException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 200
    if-eqz v10, :cond_6

    .line 202
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 200
    :catchall_0
    move-exception v16

    if-eqz v10, :cond_5

    .line 202
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 204
    :cond_5
    throw v16

    .line 205
    :cond_6
    :goto_1
    return-object v6
.end method

.method public a(Ljava/util/List;Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircle;>;Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircle;>;)Z"
        }
    .end annotation

    .line 217
    const/4 v2, 0x0

    .line 218
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 220
    :cond_1
    return v2

    .line 224
    :cond_2
    invoke-direct {p0, p1}, Lo/arq;->c(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v3

    .line 225
    invoke-direct {p0, p2, v3}, Lo/arq;->d(Ljava/util/List;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v3

    .line 227
    invoke-direct {p0, v3}, Lo/arq;->d(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    move-result-object v4

    .line 228
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 230
    array-length v0, v4

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_3

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    .line 231
    :goto_0
    if-nez v2, :cond_5

    .line 233
    sget-object v0, Lo/arq;->c:Ljava/lang/String;

    const-string v1, "batchInsertUserCircle result is false"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 238
    :cond_4
    sget-object v0, Lo/arq;->c:Ljava/lang/String;

    const-string v1, "after batchInsertUserCircle results is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    :cond_5
    :goto_1
    return v2
.end method

.method public b(I)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/health/sns/model/circle/CircleActionParam;>;"
        }
    .end annotation

    .line 86
    const/4 v6, 0x0

    .line 87
    const-string v7, "circle_id =? "

    .line 88
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 89
    const/4 v9, 0x0

    .line 92
    :try_start_0
    iget-object v0, p0, Lo/arq;->e:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$d;->c:Landroid/net/Uri;

    move-object v3, v7

    move-object v4, v8

    const-string v5, "_id ASC"

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v9, v0

    .line 94
    if-nez v9, :cond_1

    .line 96
    const/4 v10, 0x0

    .line 124
    if-eqz v9, :cond_0

    .line 126
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 96
    :cond_0
    return-object v10

    .line 99
    :cond_1
    :try_start_1
    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 101
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    .line 103
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v6, v0

    .line 104
    const/4 v10, 0x0

    .line 107
    :cond_2
    new-instance v10, Lcom/huawei/health/sns/model/circle/CircleActionParam;

    invoke-direct {v10}, Lcom/huawei/health/sns/model/circle/CircleActionParam;-><init>()V

    .line 108
    const-string v0, "_id"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/circle/CircleActionParam;->setId(I)V

    .line 109
    const-string v0, "circle_id"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/circle/CircleActionParam;->setCircleId(I)V

    .line 110
    const-string v0, "action_param_key"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/circle/CircleActionParam;->setActionParamKey(Ljava/lang/String;)V

    .line 112
    const-string v0, "action_param_value"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/circle/CircleActionParam;->setActionParamValue(Ljava/lang/String;)V

    .line 114
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_2

    .line 124
    :cond_3
    if-eqz v9, :cond_5

    .line 126
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 118
    :catch_0
    move-exception v10

    .line 120
    :try_start_2
    sget-object v0, Lo/arq;->c:Ljava/lang/String;

    const-string v1, "queryCircleActionParam SQLException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    if-eqz v9, :cond_5

    .line 126
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 124
    :catchall_0
    move-exception v11

    if-eqz v9, :cond_4

    .line 126
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 128
    :cond_4
    throw v11

    .line 129
    :cond_5
    :goto_0
    return-object v6
.end method

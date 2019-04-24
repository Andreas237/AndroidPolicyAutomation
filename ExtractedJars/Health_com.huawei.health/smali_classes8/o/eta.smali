.class public Lo/eta;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eta$d;
    }
.end annotation


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fil;>;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eta;->b:Ljava/util/List;

    .line 147
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    .line 148
    return-void
.end method

.method synthetic constructor <init>(Lo/eta$2;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lo/eta;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;)I
    .locals 8

    .line 766
    const/4 v4, 0x0

    .line 768
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 769
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 771
    :try_start_0
    invoke-virtual {v5, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 772
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v7

    .line 773
    invoke-static {v7, v6}, Lo/bzv;->a(Ljava/util/Date;Ljava/util/Date;)I
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 776
    goto :goto_0

    .line 774
    :catch_0
    move-exception v6

    .line 775
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u683c\u5f0f\u65e5\u671f\u51fa\u9519:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 777
    :goto_0
    return v4
.end method

.method public static a()Lo/eta;
    .locals 1

    .line 151
    sget-object v0, Lo/eta$d;->b:Lo/eta;

    return-object v0
.end method

.method private a(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fil;>;)V"
        }
    .end annotation

    .line 604
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 605
    invoke-interface {v4, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 607
    :try_start_0
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 608
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 609
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 610
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/fil;

    .line 611
    invoke-static {v7}, Lo/fic;->e(Lo/fil;)Lorg/json/JSONObject;

    move-result-object v8

    .line 612
    if-eqz v8, :cond_0

    .line 613
    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 615
    :cond_0
    goto :goto_0

    .line 617
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0, v5}, Lo/eta;->e(ILorg/json/JSONArray;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 620
    goto :goto_1

    .line 618
    :catch_0
    move-exception v5

    .line 619
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 621
    :goto_1
    return-void
.end method

.method private b(IJJ)V
    .locals 6

    .line 178
    const-string v2, "0"

    .line 179
    const/16 v0, 0xc8

    if-ne v0, p1, :cond_0

    .line 180
    const-string v2, "0"

    goto :goto_0

    .line 182
    :cond_0
    const-string v2, "1"

    .line 184
    :goto_0
    sub-long v3, p4, p2

    .line 185
    const-string v0, "0"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x1388

    cmp-long v0, v3, v0

    if-ltz v0, :cond_2

    .line 186
    :cond_1
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 187
    const-string v0, "module"

    const-string v1, "3"

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    const-string v0, "status"

    invoke-virtual {v5, v0, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    const-string v0, "delay"

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    const-string v0, "errorcode"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_REQUEST_MODULE_85030001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 193
    :cond_2
    return-void
.end method

.method static synthetic b(Lo/eta;IJJ)V
    .locals 0

    .line 52
    invoke-direct/range {p0 .. p5}, Lo/eta;->b(IJJ)V

    return-void
.end method

.method static synthetic b(Lo/eta;ILjava/lang/String;ILo/etc;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2, p3, p4}, Lo/eta;->c(ILjava/lang/String;ILo/etc;)V

    return-void
.end method

.method static synthetic b(Lo/eta;ILjava/lang/String;Lo/etc;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2, p3}, Lo/eta;->c(ILjava/lang/String;Lo/etc;)V

    return-void
.end method

.method private b(Lorg/json/JSONArray;ZLo/etc;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;ZLo/etc<Ljava/util/List<Lo/fil;>;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 513
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "todoActivitiseResSucc"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    iget-object v0, p0, Lo/eta;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 515
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 516
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 517
    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 518
    invoke-static {v6}, Lo/fic;->c(Lorg/json/JSONObject;)Lo/fil;

    move-result-object v7

    .line 519
    if-eqz v7, :cond_1

    .line 521
    invoke-direct {p0, v7}, Lo/eta;->d(Lo/fil;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 522
    goto :goto_1

    .line 525
    :cond_0
    invoke-virtual {v7}, Lo/fil;->f()I

    move-result v0

    if-nez v0, :cond_1

    .line 526
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 527
    iget-object v0, p0, Lo/eta;->b:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 516
    :cond_1
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 532
    :cond_2
    if-eqz p2, :cond_3

    .line 533
    iget-object v0, p0, Lo/eta;->b:Ljava/util/List;

    invoke-interface {p3, v0}, Lo/etc;->b(Ljava/lang/Object;)V

    goto :goto_2

    .line 535
    :cond_3
    iget-object v0, p0, Lo/eta;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 536
    const/4 v0, 0x0

    invoke-direct {p0, p3, v0}, Lo/eta;->c(Lo/etc;I)V

    goto :goto_2

    .line 538
    :cond_4
    iget-object v0, p0, Lo/eta;->b:Ljava/util/List;

    invoke-interface {p3, v0}, Lo/etc;->b(Ljava/lang/Object;)V

    .line 539
    const/4 v0, 0x0

    invoke-direct {p0, v0, v4}, Lo/eta;->e(ILorg/json/JSONArray;)V

    .line 543
    :goto_2
    return-void
.end method

.method private b(Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;)Z
    .locals 12

    .line 631
    const/4 v4, 0x0

    .line 632
    if-eqz p1, :cond_2

    .line 633
    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->getHistories()Ljava/util/List;

    move-result-object v5

    .line 634
    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 635
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;

    .line 636
    if-eqz v6, :cond_2

    .line 638
    invoke-virtual {v6}, Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;->getActivityDate()Ljava/lang/String;

    move-result-object v7

    .line 639
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 641
    :try_start_0
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v8, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 642
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 643
    invoke-virtual {v8, v7}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v9

    .line 644
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v10

    .line 645
    invoke-static {v9, v10}, Lo/bzv;->a(Ljava/util/Date;Ljava/util/Date;)I

    move-result v11

    .line 647
    if-eqz v11, :cond_0

    .line 648
    const/4 v4, 0x0

    goto :goto_0

    .line 649
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;->getCompleteFlag()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 650
    const/4 v4, 0x1

    .line 654
    :cond_1
    :goto_0
    goto :goto_1

    .line 652
    :catch_0
    move-exception v8

    .line 653
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u65f6\u95f4\u6570\u5b57\u683c\u5f0f\u8f6c\u6362\u5f02\u5e38"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    :cond_2
    :goto_1
    return v4
.end method

.method static synthetic b(Lo/eta;Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;)Z
    .locals 1

    .line 52
    invoke-direct {p0, p1}, Lo/eta;->b(Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/eta;)Landroid/content/Context;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 356
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 357
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    const/16 v1, 0x272a

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "HOME_PREVIEW_ACTIVITY_SAVE"

    const-string v3, ""

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 360
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    const/16 v1, 0x272a

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "HOME_PREVIEW_USED_DATA_SAVE"

    const-string v3, ""

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 363
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    const/16 v1, 0x272a

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "HOME_TODO_ACTIVITY_SAVE"

    const-string v3, ""

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 365
    return-void
.end method

.method private c(ILjava/lang/String;ILo/etc;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;ILo/etc<Ljava/util/List<Lo/fil;>;>;)V"
        }
    .end annotation

    .line 401
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_4

    .line 402
    const/4 v4, 0x0

    .line 404
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 405
    const-string v0, "resultCode"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 406
    if-eqz v6, :cond_2

    .line 407
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpPost result:resultCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    const-string v0, "0"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 410
    const-string v0, "activities"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 411
    const-string v0, "activities"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 412
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v1, v0, :cond_1

    .line 413
    :cond_0
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 415
    :cond_1
    const/4 v4, 0x1

    .line 416
    const/4 v0, 0x0

    invoke-direct {p0, v7, p3, v0, p4}, Lo/eta;->e(Lorg/json/JSONArray;IZLo/etc;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 423
    :cond_2
    :goto_0
    goto :goto_1

    .line 421
    :catch_0
    move-exception v5

    .line 422
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Json data error! JSONException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    :goto_1
    if-nez v4, :cond_3

    .line 425
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "todoActivties:\u65e0\u6570\u636e\u6216\u6570\u636e\u89e3\u6790\u5f02\u5e38"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p4, v0}, Lo/etc;->b(Ljava/lang/Object;)V

    .line 427
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-direct {p0, p3, v0}, Lo/eta;->e(ILorg/json/JSONArray;)V

    .line 429
    :cond_3
    goto :goto_2

    .line 430
    :cond_4
    const/4 v0, 0x0

    invoke-interface {p4, v0}, Lo/etc;->b(Ljava/lang/Object;)V

    .line 431
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resCode Error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    :goto_2
    return-void
.end method

.method private c(ILjava/lang/String;Lo/etc;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Lo/etc<Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;>;)V"
        }
    .end annotation

    .line 219
    const/4 v4, 0x0

    .line 220
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_1

    .line 222
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 223
    const-string v0, "resultCode"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 224
    if-eqz v6, :cond_0

    .line 226
    const-string v0, "0"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    const/4 v4, 0x1

    .line 229
    const-class v0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;

    invoke-static {p2, v0}, Lo/ett;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;

    .line 230
    invoke-interface {p3, v7}, Lo/etc;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    :cond_0
    goto :goto_0

    .line 233
    :catch_0
    move-exception v5

    .line 234
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Json data error! JSONException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    goto :goto_0

    .line 237
    :cond_1
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resCode Error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    :goto_0
    if-nez v4, :cond_2

    .line 240
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Lo/etc;->b(Ljava/lang/Object;)V

    .line 242
    :cond_2
    return-void
.end method

.method private c(Ljava/lang/String;Lcom/huawei/operation/https/HttpResCallBack;)V
    .locals 5

    .line 248
    invoke-direct {p0, p1}, Lo/eta;->d(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v3

    .line 250
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 251
    const-string v0, "x-huid"

    iget-object v1, p0, Lo/eta;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    const-string v0, "x-version"

    iget-object v1, p0, Lo/eta;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/dbf;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lo/eta$1;

    invoke-direct {v2, p0, v3, v4, p2}, Lo/eta$1;-><init>(Lo/eta;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/operation/https/HttpResCallBack;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 270
    return-void
.end method

.method private c(Lo/etc;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/etc<Ljava/util/List<Lo/fil;>;>;I)V"
        }
    .end annotation

    .line 549
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHistoryFromCloudCircle:mTodoActivityList:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eta;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",index: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 550
    iget-object v0, p0, Lo/eta;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt v0, p2, :cond_0

    .line 551
    return-void

    .line 553
    :cond_0
    iget-object v0, p0, Lo/eta;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fil;

    .line 554
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lo/fil;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 555
    invoke-virtual {v4}, Lo/fil;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lo/eta$3;

    invoke-direct {v1, p0, p2, p1, v4}, Lo/eta$3;-><init>(Lo/eta;ILo/etc;Lo/fil;)V

    invoke-virtual {p0, v0, v1}, Lo/eta;->b(Ljava/lang/String;Lo/etc;)V

    .line 598
    :cond_1
    return-void
.end method

.method private c(Lorg/json/JSONArray;ZLo/etc;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;ZLo/etc<Ljava/util/List<Lo/fil;>;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 454
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 455
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 456
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 457
    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 458
    invoke-static {v5}, Lo/fic;->c(Lorg/json/JSONObject;)Lo/fil;

    move-result-object v6

    .line 459
    if-eqz v6, :cond_2

    .line 461
    invoke-virtual {v6}, Lo/fil;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 462
    goto :goto_1

    .line 464
    :cond_0
    invoke-virtual {v6}, Lo/fil;->m()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/eta;->a(Ljava/lang/String;)I

    move-result v7

    .line 466
    const/4 v0, 0x3

    if-gt v7, v0, :cond_2

    const/4 v0, 0x1

    if-lt v7, v0, :cond_2

    invoke-virtual {v6}, Lo/fil;->n()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    .line 467
    goto :goto_1

    .line 473
    :cond_1
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 474
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 456
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 478
    :cond_3
    if-nez p2, :cond_4

    .line 479
    const/4 v0, 0x1

    invoke-direct {p0, v0, v3}, Lo/eta;->e(ILorg/json/JSONArray;)V

    .line 482
    :cond_4
    new-instance v0, Lo/ete;

    invoke-direct {v0}, Lo/ete;-><init>()V

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 483
    invoke-interface {p3, v2}, Lo/etc;->b(Ljava/lang/Object;)V

    .line 484
    return-void
.end method

.method private c(Ljava/lang/String;)Z
    .locals 9

    .line 334
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 336
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 337
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 338
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v7

    .line 339
    invoke-static {v6, v7}, Lo/bzv;->a(Ljava/util/Date;Ljava/util/Date;)I

    move-result v8

    .line 340
    if-eqz v8, :cond_0

    .line 341
    invoke-direct {p0}, Lo/eta;->c()V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 342
    const/4 v0, 0x0

    return v0

    .line 346
    :cond_0
    goto :goto_0

    .line 344
    :catch_0
    move-exception v4

    .line 345
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u7f13\u5b58\u8bb0\u5f55\u65f6\u95f4\u6570\u5b57\u683c\u5f0f\u8f6c\u6362\u5f02\u5e38"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static d()J
    .locals 5

    .line 754
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    .line 755
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 756
    invoke-virtual {v4, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 757
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private d(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 273
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 274
    const-string v0, "activityId"

    invoke-virtual {v3, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    const-string v0, "token"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    const-string v0, "appId"

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 279
    :cond_0
    const-string v0, "appId"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    :goto_0
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getDeviceId()Ljava/lang/String;

    move-result-object v4

    .line 282
    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 283
    const-string v4, "clientnull"

    .line 285
    :cond_1
    const-string v0, "deviceId"

    invoke-virtual {v3, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    const-string v0, "deviceType"

    invoke-static {}, Lcom/huawei/operation/utils/OperationUtils;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    const-string v0, "sysVersion"

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    const-string v0, "bindDeviceType"

    iget-object v1, p0, Lo/eta;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/dbf;->g(Landroid/content/Context;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    const-string v0, "appType"

    invoke-static {}, Lcom/huawei/operation/utils/OperationUtils;->getAppType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    const-string v0, "iVersion"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    const-string v0, "language"

    const-string v1, "zh_CN"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    const-string v0, "ts"

    invoke-static {}, Lo/eta;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    return-object v3
.end method

.method private d(ILo/etc;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/etc<Ljava/util/List<Lo/fil;>;>;)V"
        }
    .end annotation

    .line 304
    const-string v4, ""

    .line 305
    const-string v5, ""

    .line 306
    if-nez p1, :cond_0

    .line 307
    const-string v4, "HOME_TODO_ACTIVITY_SAVE"

    .line 308
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    const/16 v1, 0x272a

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "HOME_TODO_ACTIVITY_SAVE_TIME"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 309
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 310
    const-string v4, "HOME_PREVIEW_ACTIVITY_SAVE"

    .line 311
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    const/16 v1, 0x272a

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "HOME_PREVIEW_ACTIVITY_SAVE_TIME"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 314
    :cond_1
    :goto_0
    invoke-direct {p0, v5}, Lo/eta;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 315
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 316
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    const/16 v1, 0x272a

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 318
    :try_start_0
    new-instance v7, Lorg/json/JSONArray;

    invoke-direct {v7, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 319
    const/4 v0, 0x1

    invoke-direct {p0, v7, p1, v0, p2}, Lo/eta;->e(Lorg/json/JSONArray;IZLo/etc;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 322
    goto :goto_1

    .line 320
    :catch_0
    move-exception v7

    .line 321
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6570\u636e\u89e3\u6790\u51fa\u9519\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    :cond_2
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/eta;Ljava/util/List;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lo/eta;->a(Ljava/util/List;)V

    return-void
.end method

.method private d(Lo/fil;)Z
    .locals 6

    .line 666
    const/4 v2, 0x0

    .line 668
    invoke-virtual {p1}, Lo/fil;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/eta;->a(Ljava/lang/String;)I

    move-result v3

    .line 669
    invoke-virtual {p1}, Lo/fil;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/eta;->a(Ljava/lang/String;)I

    move-result v4

    .line 671
    if-gtz v3, :cond_0

    if-ltz v4, :cond_0

    invoke-virtual {p1}, Lo/fil;->i()I

    move-result v0

    const/16 v1, 0x190

    if-ne v0, v1, :cond_1

    .line 672
    :cond_0
    const/4 v2, 0x1

    .line 675
    :cond_1
    invoke-virtual {p1}, Lo/fil;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lo/fil;->n()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 676
    invoke-virtual {p1}, Lo/fil;->m()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/eta;->a(Ljava/lang/String;)I

    move-result v5

    .line 678
    if-lez v5, :cond_2

    .line 679
    const/4 v2, 0x1

    .line 682
    :cond_2
    return v2
.end method

.method private e()Ljava/util/HashMap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 716
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 717
    const-string v0, "sysVersion"

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 718
    const-string v0, "bindDeviceType"

    iget-object v1, p0, Lo/eta;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/dbf;->g(Landroid/content/Context;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 719
    const-string v0, "wearType"

    const-string v1, ""

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 720
    const-string v0, "appType"

    invoke-static {}, Lcom/huawei/operation/utils/OperationUtils;->getAppType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 721
    const-string v0, "iVersion"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    const-string v0, "deviceType"

    invoke-static {}, Lcom/huawei/operation/utils/OperationUtils;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 723
    const-string v0, "phoneType"

    invoke-static {}, Lcom/huawei/operation/utils/OperationUtils;->getPhoneType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 724
    const-string v0, "language"

    const-string v1, "zh_CN"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 725
    const-string v0, "ts"

    invoke-static {}, Lo/eta;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    const-string v0, "token"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 727
    const-string v0, "tokenType"

    const-string v1, "1"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 728
    const-string v0, "pageNo"

    const-string v1, "0"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    const-string v0, "pageSize"

    const-string v1, "1000"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 730
    const-string v0, "joinStatus"

    const-string v1, "1"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 733
    :cond_0
    const-string v0, "isBeta"

    const-string v1, "1"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    :cond_1
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getDeviceId()Ljava/lang/String;

    move-result-object v4

    .line 736
    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 737
    const-string v4, "clientnull"

    .line 739
    :cond_2
    const-string v0, "deviceId"

    invoke-virtual {v3, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 740
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getDeviceType()Ljava/lang/String;

    move-result-object v5

    .line 741
    const-string v0, "upDeviceType"

    invoke-virtual {v3, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 742
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 743
    const-string v0, "appId"

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 745
    :cond_3
    const-string v0, "appId"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 747
    :goto_0
    return-object v3
.end method

.method static synthetic e(Lo/eta;)Ljava/util/List;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/eta;->b:Ljava/util/List;

    return-object v0
.end method

.method private e(ILorg/json/JSONArray;)V
    .locals 9

    .line 374
    if-eqz p2, :cond_2

    .line 375
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveOperationActivitys = + \n"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    new-instance v6, Lo/dcy;

    invoke-direct {v6}, Lo/dcy;-><init>()V

    .line 377
    const-string v7, ""

    .line 378
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v8

    .line 379
    if-nez p1, :cond_0

    .line 380
    const-string v7, "HOME_TODO_ACTIVITY_SAVE"

    .line 382
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    const/16 v1, 0x272a

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "HOME_TODO_ACTIVITY_SAVE_TIME"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 383
    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 382
    invoke-static {v0, v1, v2, v3, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 384
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 385
    const-string v7, "HOME_PREVIEW_ACTIVITY_SAVE"

    .line 387
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    const/16 v1, 0x272a

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "HOME_PREVIEW_ACTIVITY_SAVE_TIME"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 388
    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 387
    invoke-static {v0, v1, v2, v3, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 390
    :cond_1
    :goto_0
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 391
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    const/16 v1, 0x272a

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 392
    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    .line 391
    invoke-static {v0, v1, v7, v2, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 395
    :cond_2
    return-void
.end method

.method private e(Lcom/huawei/operation/https/HttpResCallBack;)V
    .locals 5

    .line 691
    invoke-direct {p0}, Lo/eta;->e()Ljava/util/HashMap;

    move-result-object v3

    .line 693
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 694
    const-string v0, "x-huid"

    iget-object v1, p0, Lo/eta;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 695
    const-string v0, "x-version"

    iget-object v1, p0, Lo/eta;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/dbf;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    iget-object v0, p0, Lo/eta;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lo/eta$4;

    invoke-direct {v2, p0, v3, v4, p1}, Lo/eta$4;-><init>(Lo/eta;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/operation/https/HttpResCallBack;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 713
    return-void
.end method

.method static synthetic e(Lo/eta;Lo/etc;I)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Lo/eta;->c(Lo/etc;I)V

    return-void
.end method

.method private e(Lorg/json/JSONArray;IZLo/etc;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;IZLo/etc<Ljava/util/List<Lo/fil;>;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 437
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getActivitiseResSucc\uff1atype="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    if-nez p2, :cond_0

    .line 439
    invoke-direct {p0, p1, p3, p4}, Lo/eta;->b(Lorg/json/JSONArray;ZLo/etc;)V

    goto :goto_0

    .line 440
    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 441
    invoke-direct {p0, p1, p3, p4}, Lo/eta;->c(Lorg/json/JSONArray;ZLo/etc;)V

    .line 444
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public b(IZLo/etc;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZLo/etc<Ljava/util/List<Lo/fil;>;>;)V"
        }
    .end annotation

    .line 158
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActivityFromCloud()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    if-eqz p2, :cond_0

    .line 161
    invoke-direct {p0, p1, p3}, Lo/eta;->d(ILo/etc;)V

    .line 163
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 165
    new-instance v0, Lo/eta$2;

    move-object v1, p0

    move v2, p1

    move-object v3, p3

    move-wide v4, v6

    invoke-direct/range {v0 .. v5}, Lo/eta$2;-><init>(Lo/eta;ILo/etc;J)V

    invoke-direct {p0, v0}, Lo/eta;->e(Lcom/huawei/operation/https/HttpResCallBack;)V

    .line 175
    return-void
.end method

.method public b(Ljava/lang/String;Lo/etc;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/etc<Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;>;)V"
        }
    .end annotation

    .line 201
    new-instance v0, Lo/eta$5;

    invoke-direct {v0, p0, p2}, Lo/eta$5;-><init>(Lo/eta;Lo/etc;)V

    invoke-direct {p0, p1, v0}, Lo/eta;->c(Ljava/lang/String;Lcom/huawei/operation/https/HttpResCallBack;)V

    .line 210
    return-void
.end method

.class public Lo/fit;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static f:Ljava/lang/String;

.field private static volatile i:Lo/fit;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

.field c:Ljava/lang/String;

.field private d:Ljava/util/Timer;

.field private e:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Landroid/os/Handler;

.field private k:Ljava/lang/String;

.field private l:Landroid/content/Context;

.field private m:Lo/egn;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 85
    const/4 v0, 0x0

    sput-object v0, Lo/fit;->f:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    const-string v0, "2.0"

    iput-object v0, p0, Lo/fit;->p:Ljava/lang/String;

    .line 95
    const-string v0, ""

    iput-object v0, p0, Lo/fit;->o:Ljava/lang/String;

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fit;->c:Ljava/lang/String;

    .line 588
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fit;->m:Lo/egn;

    .line 105
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/fit;->l:Landroid/content/Context;

    .line 106
    invoke-direct {p0}, Lo/fit;->b()Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    iput-object v0, p0, Lo/fit;->b:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 107
    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 6

    .line 642
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 643
    invoke-direct {p0}, Lo/fit;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fit;->c:Ljava/lang/String;

    .line 646
    const-string v0, "opType"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 647
    const-string v0, "productId"

    iget-object v1, p0, Lo/fit;->c:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 648
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "productId "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fit;->c:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 649
    const-string v0, "deviceId"

    iget-object v1, p0, Lo/fit;->c:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 650
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceId "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fit;->c:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    const-string v0, "source"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 652
    const-string v0, "appId"

    const-string v1, "com.huawei.health"

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 653
    const-string v0, "appType"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 654
    const-string v0, "token"

    iget-object v1, p0, Lo/fit;->n:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 655
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "token "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fit;->n:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    const-string v0, "environment"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 657
    const-string v0, "ts"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 658
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ts "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 661
    goto :goto_0

    .line 659
    :catch_0
    move-exception v5

    .line 660
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 662
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()Lcom/tencent/mm/opensdk/openapi/IWXAPI;
    .locals 3

    .line 138
    iget-object v0, p0, Lo/fit;->o:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    invoke-direct {p0}, Lo/fit;->c()V

    .line 140
    iget-object v0, p0, Lo/fit;->l:Landroid/content/Context;

    iget-object v1, p0, Lo/fit;->o:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    iput-object v0, p0, Lo/fit;->b:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 141
    iget-object v0, p0, Lo/fit;->b:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    iget-object v1, p0, Lo/fit;->o:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z

    .line 143
    :cond_0
    iget-object v0, p0, Lo/fit;->b:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    return-object v0
.end method

.method private b(I)Ljava/lang/String;
    .locals 8

    .line 666
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 667
    invoke-direct {p0}, Lo/fit;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fit;->c:Ljava/lang/String;

    .line 668
    iget-object v0, p0, Lo/fit;->a:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/fit;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fit;->e:Ljava/lang/String;

    .line 670
    const-string v0, "devType"

    const-string v1, "classical"

    :try_start_0
    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 671
    const-string v0, "mac"

    iget-object v1, p0, Lo/fit;->e:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 672
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mac "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fit;->e:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    const-string v0, "opType"

    invoke-virtual {v6, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 674
    const-string v0, "productId"

    const-string v1, "%s000000000000"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/fit;->e:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 675
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "productId "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "%s000000000000"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lo/fit;->e:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    const-string v0, "source"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 677
    const-string v0, "token"

    iget-object v1, p0, Lo/fit;->n:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 678
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "token "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fit;->n:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 679
    const-string v0, "appId"

    const-string v1, "com.huawei.health"

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 680
    const-string v0, "appType"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 681
    const-string v0, "deviceId"

    iget-object v1, p0, Lo/fit;->c:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 682
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceId "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fit;->c:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    const-string v0, "environment"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 684
    const-string v0, "ts"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 685
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ts "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 688
    goto :goto_0

    .line 686
    :catch_0
    move-exception v7

    .line 687
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 689
    :goto_0
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lo/fit;
    .locals 4

    .line 110
    sget-object v0, Lo/fit;->i:Lo/fit;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 111
    const-class v2, Lo/fit;

    monitor-enter v2

    .line 112
    :try_start_0
    sget-object v0, Lo/fit;->i:Lo/fit;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 113
    new-instance v0, Lo/fit;

    invoke-direct {v0, p0}, Lo/fit;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/fit;->i:Lo/fit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 117
    :cond_1
    :goto_0
    sget-object v0, Lo/fit;->i:Lo/fit;

    return-object v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .line 527
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 528
    const/16 v0, 0xc9

    iput v0, v1, Landroid/os/Message;->what:I

    .line 529
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 530
    iget-object v0, p0, Lo/fit;->h:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 531
    return-void
.end method

.method private c(Ljava/io/InputStreamReader;)Ljava/lang/String;
    .locals 8

    .line 801
    const/16 v0, 0x400

    new-array v5, v0, [C

    .line 802
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 804
    :goto_0
    const/4 v0, 0x0

    const/16 v1, 0x400

    :try_start_0
    invoke-virtual {p1, v5, v0, v1}, Ljava/io/InputStreamReader;->read([CII)I

    move-result v0

    move v4, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 805
    const/4 v0, 0x0

    invoke-virtual {v6, v5, v0, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 809
    :cond_0
    goto :goto_1

    .line 807
    :catch_0
    move-exception v7

    .line 808
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManagerHelper postRequest result e:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 810
    :goto_1
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c()V
    .locals 7

    .line 126
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v4

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    const/16 v2, 0x11

    invoke-virtual {v4, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x3f9

    invoke-virtual {v4, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x7e1

    invoke-virtual {v4, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 129
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v5, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/huawei/whitebox/e;->b([B)[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    iput-object v0, p0, Lo/fit;->o:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 134
    goto :goto_0

    .line 130
    :catch_0
    move-exception v6

    .line 131
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAppID appid UnsupportedEncodingException, e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    goto :goto_0

    .line 132
    :catch_1
    move-exception v6

    .line 133
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAppID e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 501
    iget-object v0, p0, Lo/fit;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 502
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weChatHandler is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 503
    return-void

    .line 505
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 507
    :cond_1
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jumpToWechat() get ticket fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    iget-object v0, p0, Lo/fit;->h:Landroid/os/Handler;

    const/16 v1, 0xcb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 509
    return-void

    .line 512
    :cond_2
    const-string v0, "http://we.qq.com/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 513
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jumpToWechat() get invalid ticket!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    iget-object v0, p0, Lo/fit;->h:Landroid/os/Handler;

    const/16 v1, 0xcb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 515
    return-void

    .line 519
    :cond_3
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jumpToWechat() OK! being start weChat!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 520
    invoke-direct {p0, p1}, Lo/fit;->b(Ljava/lang/String;)V

    .line 521
    return-void
.end method

.method static synthetic d(Lo/fit;)Landroid/os/Handler;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/fit;->h:Landroid/os/Handler;

    return-object v0
.end method

.method private d()Ljava/lang/String;
    .locals 11

    .line 271
    const/4 v4, 0x0

    .line 272
    const-string v5, ""

    .line 273
    const/4 v6, 0x0

    .line 274
    const/4 v7, 0x0

    .line 276
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const-string v1, "cat /sys/class/net/wlan0/address "

    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v8

    .line 277
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-virtual {v8}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    const-string v2, "utf-8"

    invoke-direct {v0, v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v6, v0

    .line 278
    new-instance v0, Ljava/io/LineNumberReader;

    invoke-direct {v0, v6}, Ljava/io/LineNumberReader;-><init>(Ljava/io/Reader;)V

    move-object v7, v0

    .line 280
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 281
    invoke-virtual {v7}, Ljava/io/LineNumberReader;->readLine()Ljava/lang/String;

    move-result-object v5

    .line 282
    if-eqz v5, :cond_0

    .line 283
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/high16 v1, 0x6400000

    if-lt v0, v1, :cond_1

    .line 284
    new-instance v0, Ljava/io/IOException;

    const-string v1, "input too long"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 286
    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 287
    .line 294
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 296
    :try_start_1
    invoke-virtual {v6}, Ljava/io/InputStreamReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 299
    goto :goto_0

    .line 297
    :catch_0
    move-exception v8

    .line 298
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    :cond_3
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v7, :cond_7

    .line 303
    :try_start_2
    invoke-virtual {v7}, Ljava/io/LineNumberReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 306
    goto/16 :goto_4

    .line 304
    :catch_1
    move-exception v8

    .line 305
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    goto/16 :goto_4

    .line 290
    :catch_2
    move-exception v8

    .line 292
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 294
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 296
    :try_start_4
    invoke-virtual {v6}, Ljava/io/InputStreamReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 299
    goto :goto_1

    .line 297
    :catch_3
    move-exception v8

    .line 298
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    :cond_4
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v7, :cond_7

    .line 303
    :try_start_5
    invoke-virtual {v7}, Ljava/io/LineNumberReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 306
    goto :goto_4

    .line 304
    :catch_4
    move-exception v8

    .line 305
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    goto :goto_4

    .line 294
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    .line 296
    :try_start_6
    invoke-virtual {v6}, Ljava/io/InputStreamReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 299
    goto :goto_2

    .line 297
    :catch_5
    move-exception v10

    .line 298
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    :cond_5
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v7, :cond_6

    .line 303
    :try_start_7
    invoke-virtual {v7}, Ljava/io/LineNumberReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 306
    goto :goto_3

    .line 304
    :catch_6
    move-exception v10

    .line 305
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    :cond_6
    :goto_3
    throw v9

    .line 309
    :cond_7
    :goto_4
    return-object v4
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 477
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 479
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 480
    :cond_0
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ticketMacFormat get invalid mac address!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    const-string v0, ""

    return-object v0

    .line 484
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    .line 485
    const/4 v6, 0x0

    :goto_0
    array-length v0, v5

    if-ge v6, v0, :cond_3

    .line 486
    aget-char v0, v5, v6

    const/16 v1, 0x3a

    if-eq v0, v1, :cond_2

    .line 487
    aget-char v0, v5, v6

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 485
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 492
    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 14

    .line 537
    const/4 v4, 0x0

    .line 539
    const/4 v5, 0x0

    .line 540
    const/4 v6, 0x0

    .line 541
    const-string v7, ""

    .line 543
    :try_start_0
    new-instance v8, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v8, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 544
    const-string v0, "x-huid"

    iget-object v1, p0, Lo/fit;->k:Ljava/lang/String;

    invoke-virtual {v8, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 545
    const-string v0, "x-version"

    iget-object v1, p0, Lo/fit;->p:Ljava/lang/String;

    invoke-virtual {v8, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 546
    const-string v0, "Content-Type"

    const-string v1, "application/json; charset=utf-8"

    invoke-virtual {v8, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    new-instance v0, Lorg/apache/http/entity/StringEntity;

    const-string v1, "utf-8"

    move-object/from16 v2, p2

    invoke-direct {v0, v2, v1}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 548
    new-instance v9, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v9}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 549
    invoke-interface {v9}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.connection.timeout"

    const/16 v2, 0x2710

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 550
    invoke-interface {v9}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.socket.timeout"

    const/16 v2, 0x2710

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 551
    .line 552
    invoke-interface {v9, v8}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v10

    .line 553
    invoke-interface {v10}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v11

    .line 554
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getQrcodeTicket: response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    const/16 v0, 0xc8

    if-ne v11, v0, :cond_0

    .line 556
    invoke-interface {v10}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v6

    .line 557
    invoke-interface {v6}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    .line 558
    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "UTF-8"

    invoke-direct {v0, v4, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v5, v0

    .line 559
    invoke-direct {p0, v5}, Lo/fit;->c(Ljava/io/InputStreamReader;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/apache/http/conn/HttpHostConnectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 560
    move-object v12, v7

    .line 573
    invoke-static {v4}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 574
    invoke-static {v5}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 560
    return-object v12

    .line 562
    :cond_0
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getQrcodeTicket Network error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/apache/http/conn/HttpHostConnectException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 573
    invoke-static {v4}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 574
    invoke-static {v5}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 575
    goto/16 :goto_0

    .line 564
    :catch_0
    move-exception v8

    .line 565
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getQrcodeTicket e is,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lorg/apache/http/client/ClientProtocolException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 573
    invoke-static {v4}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 574
    invoke-static {v5}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 575
    goto :goto_0

    .line 566
    :catch_1
    move-exception v8

    .line 567
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getQrcodeTicket e is,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lorg/apache/http/conn/HttpHostConnectException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 573
    invoke-static {v4}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 574
    invoke-static {v5}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 575
    goto :goto_0

    .line 568
    :catch_2
    move-exception v8

    .line 569
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getQrcodeTicket e is,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/net/UnknownHostException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 573
    invoke-static {v4}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 574
    invoke-static {v5}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 575
    goto :goto_0

    .line 570
    :catch_3
    move-exception v8

    .line 571
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getQrcodeTicket e is,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 573
    invoke-static {v4}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 574
    invoke-static {v5}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 575
    goto :goto_0

    .line 573
    :catchall_0
    move-exception v13

    invoke-static {v4}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 574
    invoke-static {v5}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 575
    throw v13

    .line 576
    :goto_0
    return-object v7
.end method

.method static synthetic d(Lo/fit;Ljava/lang/String;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lo/fit;->c(Ljava/lang/String;)V

    return-void
.end method

.method private static e()Ljava/lang/String;
    .locals 14

    .line 242
    :try_start_0
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v4

    .line 243
    if-nez v4, :cond_0

    const-string v0, ""

    return-object v0

    .line 244
    :cond_0
    :try_start_1
    invoke-static {v4}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v5

    .line 245
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/net/NetworkInterface;

    .line 246
    invoke-virtual {v7}, Ljava/net/NetworkInterface;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "wlan0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 247
    invoke-virtual {v7}, Ljava/net/NetworkInterface;->getHardwareAddress()[B
    :try_end_1
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v8

    .line 248
    if-nez v8, :cond_1

    .line 249
    const-string v0, ""

    return-object v0

    .line 251
    :cond_1
    :try_start_2
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    move-object v10, v8

    array-length v11, v10

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v11, :cond_2

    aget-byte v13, v10, v12

    .line 253
    const-string v0, "%02X:"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v13}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 255
    :cond_2
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 256
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 258
    :cond_3
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_2
    .catch Ljava/net/SocketException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    return-object v0

    .line 260
    :cond_4
    goto/16 :goto_0

    .line 265
    :cond_5
    goto :goto_2

    .line 261
    :catch_0
    move-exception v4

    .line 262
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAdressMacByInterface SocketException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    goto :goto_2

    .line 263
    :catch_1
    move-exception v4

    .line 264
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAdressMacByInterface StringIndexOutOfBoundsException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 447
    const-string v4, ""

    .line 448
    const-string v5, ""

    .line 449
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 450
    :cond_0
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTicketByRequestUrl() get invalid input str!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    return-object v5

    .line 455
    :cond_1
    move-object v4, p1

    .line 456
    const-string v0, "https://healthdata.hicloud.com/dataOpen/weixin/createQrcodeLess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 457
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/fit;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lo/fit;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 459
    :cond_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/fit;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lo/fit;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 463
    :goto_0
    const-string v0, "http://we.qq.com/"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 464
    const-string v0, "https://healthdata.hicloud.com/dataOpen/weixin/createQrcodeLess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 465
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/fit;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lo/fit;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 467
    :cond_3
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/fit;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lo/fit;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 470
    :cond_4
    :goto_1
    return-object v5
.end method

.method static synthetic e(Lo/fit;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 69
    invoke-direct {p0, p1}, Lo/fit;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lo/fit;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lo/fit;->h()V

    return-void
.end method

.method private f()Ljava/lang/String;
    .locals 6

    .line 314
    sget-object v0, Landroid/os/Build;->SERIAL:Ljava/lang/String;

    iput-object v0, p0, Lo/fit;->c:Ljava/lang/String;

    .line 315
    iget-object v0, p0, Lo/fit;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lo/fit;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 316
    iget-object v0, p0, Lo/fit;->c:Ljava/lang/String;

    return-object v0

    .line 319
    :cond_0
    const-string v0, "android.os.SystemProperties"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 320
    const-string v0, "get"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 321
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "ro.serialno"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v5, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/fit;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 324
    goto :goto_0

    .line 322
    :catch_0
    move-exception v4

    .line 323
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    :goto_0
    iget-object v0, p0, Lo/fit;->c:Ljava/lang/String;

    return-object v0
.end method

.method private declared-synchronized g()V
    .locals 3

    monitor-enter p0

    .line 329
    :try_start_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lo/fit$1;

    invoke-direct {v1, p0}, Lo/fit$1;-><init>(Lo/fit;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 364
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 365
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method private g(Landroid/content/Context;)V
    .locals 5

    .line 597
    new-instance v0, Lo/egn;

    sget v1, Lcom/huawei/ui/main/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, p1, v1}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-static {p1}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lo/fit;->m:Lo/egn;

    .line 599
    iget-object v0, p0, Lo/fit;->m:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 600
    iget-object v0, p0, Lo/fit;->m:Lo/egn;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_wechat_public_jump_dialog:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 601
    iget-object v0, p0, Lo/fit;->m:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 602
    iget-object v0, p0, Lo/fit;->m:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 603
    iget-object v0, p0, Lo/fit;->m:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 604
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mJumpToHwPublicDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 606
    :cond_0
    iget-object v0, p0, Lo/fit;->d:Ljava/util/Timer;

    if-eqz v0, :cond_1

    .line 607
    iget-object v0, p0, Lo/fit;->d:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 609
    :cond_1
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/fit;->d:Ljava/util/Timer;

    .line 610
    new-instance v4, Lo/fit$9;

    invoke-direct {v4, p0}, Lo/fit$9;-><init>(Lo/fit;)V

    .line 616
    iget-object v0, p0, Lo/fit;->d:Ljava/util/Timer;

    const-wide/16 v1, 0x7530

    invoke-virtual {v0, v4, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 617
    return-void
.end method

.method private h()V
    .locals 8

    .line 408
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doQrcodeTicket enter getTicketBySN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    const-string v4, ""

    .line 410
    const-string v5, ""

    .line 411
    iget-object v0, p0, Lo/fit;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 412
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doQrcodeTicket getTicketBySN get ticket failed , invalid SN!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    iget-object v0, p0, Lo/fit;->h:Landroid/os/Handler;

    const/16 v1, 0xcb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 414
    return-void

    .line 418
    :cond_0
    const-string v0, "https://healthdata.hicloud.com/dataOpen/weixin/createQrcodeLess"

    invoke-direct {p0, v0}, Lo/fit;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 419
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doQrcodeTicket getTicketBySN ticketStr is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 422
    const-string v0, "ticket"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 425
    goto :goto_0

    .line 423
    :catch_0
    move-exception v6

    .line 424
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doQrcodeTicket getTicketBySN ticketStr JSONException e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    :goto_0
    const-string v6, ""

    .line 428
    :try_start_1
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 429
    const-string v0, "resultCode"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v6, v0

    .line 432
    goto :goto_1

    .line 430
    :catch_1
    move-exception v7

    .line 431
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doQrcodeTicket getTicketBySN ticketStr JSONException, e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    :goto_1
    if-eqz v6, :cond_1

    const-string v0, "601010"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 434
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doQrcodeTicket getTicketBySN ticketStr account changed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    invoke-virtual {p0}, Lo/fit;->a()V

    .line 436
    iget-object v0, p0, Lo/fit;->h:Landroid/os/Handler;

    const/16 v1, 0xcd

    invoke-virtual {v0, v1, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v7

    .line 437
    iget-object v0, p0, Lo/fit;->h:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 438
    goto :goto_2

    .line 439
    :cond_1
    invoke-direct {p0, v4}, Lo/fit;->c(Ljava/lang/String;)V

    .line 441
    :goto_2
    return-void
.end method

.method private h(Landroid/content/Context;)V
    .locals 5

    .line 201
    instance-of v0, p1, Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    .line 202
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_common_notification_know_tips:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    .line 204
    new-instance v4, Lo/egv$b;

    invoke-direct {v4, p1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 205
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_data_share_app_not_install:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lo/fit$3;

    invoke-direct {v1, p0}, Lo/fit$3;-><init>(Lo/fit;)V

    .line 206
    invoke-virtual {v0, v2, v1}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 211
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 212
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/egv;->setCancelable(Z)V

    .line 213
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 214
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 216
    :cond_1
    return-void
.end method

.method private i()Ljava/lang/String;
    .locals 6

    .line 773
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 775
    const-string v0, "source"

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 776
    const-string v0, "huid"

    iget-object v1, p0, Lo/fit;->k:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 777
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "huid="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fit;->k:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 778
    const-string v0, "token"

    iget-object v1, p0, Lo/fit;->n:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 779
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "token="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fit;->n:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 780
    const-string v0, "appId"

    const-string v1, "com.huawei.health"

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 781
    const-string v0, "appType"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 782
    const-string v0, "environment"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 783
    const-string v0, "ts"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 784
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ts "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 787
    goto :goto_0

    .line 785
    :catch_0
    move-exception v5

    .line 786
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 788
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private k()V
    .locals 4

    .line 629
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "dismissJumpToHwPublicDialog "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 630
    iget-object v0, p0, Lo/fit;->m:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/fit;->m:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 631
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dismissJumpToHwPublicDialog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "cancel "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 632
    iget-object v0, p0, Lo/fit;->m:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 633
    iget-object v0, p0, Lo/fit;->d:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 634
    iget-object v0, p0, Lo/fit;->d:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 636
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fit;->m:Lo/egn;

    .line 638
    :cond_1
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 694
    const-string v4, ""

    .line 695
    if-eqz p1, :cond_0

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 696
    :cond_0
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isUserBinded Context is null || isOversea."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 697
    return-object v4

    .line 699
    :cond_1
    invoke-virtual {p0, p1}, Lo/fit;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 701
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 702
    const-string v0, "result"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 705
    goto :goto_0

    .line 703
    :catch_0
    move-exception v6

    .line 704
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isUserBinded JSONException ! e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 706
    :goto_0
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isUserBinded ans is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 707
    invoke-static {p1}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "BIND_WECHAT_RANK"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 708
    return-object v4
.end method

.method public a()V
    .locals 5

    .line 621
    :try_start_0
    invoke-direct {p0}, Lo/fit;->k()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 624
    goto :goto_0

    .line 622
    :catch_0
    move-exception v4

    .line 623
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dismissJumpToHwPublicDialog e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 625
    :goto_0
    return-void
.end method

.method public a(Landroid/os/Handler;)V
    .locals 4

    .line 121
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWeChatHandler()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iput-object p1, p0, Lo/fit;->h:Landroid/os/Handler;

    .line 123
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 5

    .line 580
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter jumpToHwPublic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    new-instance v4, Lcom/tencent/mm/opensdk/modelbiz/JumpToBizProfile$Req;

    invoke-direct {v4}, Lcom/tencent/mm/opensdk/modelbiz/JumpToBizProfile$Req;-><init>()V

    .line 582
    const-string v0, "gh_b0429e7fa788"

    iput-object v0, v4, Lcom/tencent/mm/opensdk/modelbiz/JumpToBizProfile$Req;->toUserName:Ljava/lang/String;

    .line 583
    const/4 v0, 0x1

    iput v0, v4, Lcom/tencent/mm/opensdk/modelbiz/JumpToBizProfile$Req;->profileType:I

    .line 584
    iput-object p1, v4, Lcom/tencent/mm/opensdk/modelbiz/JumpToBizProfile$Req;->extMsg:Ljava/lang/String;

    .line 585
    invoke-direct {p0}, Lo/fit;->b()Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    invoke-interface {v0, v4}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    .line 586
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 7

    .line 149
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "go2WeChatHandle start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    iget-object v0, p0, Lo/fit;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 151
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weChatHandler is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    return-void

    .line 154
    :cond_0
    invoke-static {p1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fit;->k:Ljava/lang/String;

    .line 155
    invoke-static {p1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fit;->n:Ljava/lang/String;

    .line 156
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 158
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 159
    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v0, p0, Lo/fit;->p:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    goto :goto_0

    .line 160
    :catch_0
    move-exception v5

    .line 161
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "go2WeChatHandle getAppVersionName() Exception is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    :goto_0
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "go2WeChatHandle getAppVersionName() return is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fit;->p:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 166
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "go2WeChatHandle no network!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_connect_network:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 168
    return-void

    .line 171
    :cond_1
    invoke-direct {p0}, Lo/fit;->b()Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    invoke-interface {v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->isWXAppInstalled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 172
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "go2WeChatHandle WeChat is not installed! start install it "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const-string v0, "market://details?id=com.tencent.mm"

    :try_start_1
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 175
    new-instance v6, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v6, v0, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 176
    const/high16 v0, 0x10000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 177
    invoke-virtual {p1, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 181
    goto :goto_1

    .line 178
    :catch_1
    move-exception v5

    .line 179
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "go2WeChatHandle install Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    invoke-direct {p0, p1}, Lo/fit;->h(Landroid/content/Context;)V

    .line 182
    :goto_1
    return-void

    .line 184
    :cond_2
    invoke-virtual {p0, p1}, Lo/fit;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fit;->a:Ljava/lang/String;

    .line 185
    iget-object v0, p0, Lo/fit;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    const-string v0, ""

    iget-object v1, p0, Lo/fit;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 186
    :cond_3
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "go2WeChatHandle mDeviceMac is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    invoke-direct {p0}, Lo/fit;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fit;->g:Ljava/lang/String;

    .line 188
    iget-object v0, p0, Lo/fit;->g:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    const-string v0, ""

    iget-object v1, p0, Lo/fit;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 189
    :cond_4
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "go2WeChatHandle mDeviceSN is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    return-void

    .line 194
    :cond_5
    invoke-direct {p0, p1}, Lo/fit;->g(Landroid/content/Context;)V

    .line 196
    invoke-direct {p0}, Lo/fit;->g()V

    .line 197
    return-void
.end method

.method public d(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 219
    const-string v1, "02:00:00:00:00:00"

    .line 220
    const-string v0, "wifi"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/wifi/WifiManager;

    .line 221
    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v3

    .line 223
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 224
    invoke-direct {p0}, Lo/fit;->d()Ljava/lang/String;

    move-result-object v4

    .line 225
    if-eqz v4, :cond_0

    .line 226
    return-object v4

    .line 228
    :cond_0
    invoke-static {}, Lo/fit;->e()Ljava/lang/String;

    move-result-object v4

    .line 229
    return-object v4

    .line 232
    :cond_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 233
    invoke-virtual {v3}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 235
    :cond_2
    const-string v0, ""

    return-object v0
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .line 368
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindWeChatRank() CustomTextAlertDialog enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    new-instance v5, Lo/egv$b;

    invoke-direct {v5, p1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 371
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_wechat_rank_show_common_title:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_wechat_rank_bind_title_common_dialog_content_new:I

    .line 372
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    .line 373
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fit$4;

    invoke-direct {v2, p0}, Lo/fit$4;-><init>(Lo/fit;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 378
    invoke-static {p1}, Lo/cxa;->t(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 379
    invoke-static {p1}, Lo/cxa;->r(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lo/cxa;->i(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 380
    invoke-static {p1}, Lo/cxa;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lo/cxa;->l(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 381
    invoke-static {p1}, Lo/cxa;->n(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lo/cxa;->x(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 382
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_wechat_rank_bind_enter:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lo/fit$2;

    invoke-direct {v1, p0, p2}, Lo/fit$2;-><init>(Lo/fit;Ljava/lang/String;)V

    const/high16 v2, 0x41100000    # 9.0f

    invoke-virtual {v5, v0, v2, v1}, Lo/egv$b;->a(Ljava/lang/String;FLandroid/view/View$OnClickListener;)Lo/egv$b;

    goto :goto_0

    .line 391
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_wechat_rank_bind_enter:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lo/fit$5;

    invoke-direct {v1, p0, p2}, Lo/fit$5;-><init>(Lo/fit;Ljava/lang/String;)V

    invoke-virtual {v5, v0, v1}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 400
    :goto_0
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 401
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 402
    return-void
.end method

.method public e(Landroid/content/Context;)Ljava/lang/String;
    .locals 15

    .line 712
    invoke-static/range {p1 .. p1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fit;->k:Ljava/lang/String;

    .line 713
    invoke-static/range {p1 .. p1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fit;->n:Ljava/lang/String;

    .line 714
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 716
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 717
    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v0, p0, Lo/fit;->p:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 720
    goto :goto_0

    .line 718
    :catch_0
    move-exception v5

    .line 719
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserBinded getAppVersionName() Exception = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 721
    :goto_0
    const/4 v5, 0x0

    .line 723
    const/4 v6, 0x0

    .line 724
    const-string v7, ""

    .line 726
    const/4 v8, 0x0

    .line 728
    const/4 v10, 0x0

    .line 731
    :try_start_1
    new-instance v9, Lorg/apache/http/client/methods/HttpPost;

    const-string v0, "https://healthdata.hicloud.com/dataOpen/weixin/isUserBinded"

    invoke-direct {v9, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 732
    const-string v0, "x-huid"

    iget-object v1, p0, Lo/fit;->k:Ljava/lang/String;

    invoke-virtual {v9, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 733
    const-string v0, "x-version"

    iget-object v1, p0, Lo/fit;->p:Ljava/lang/String;

    invoke-virtual {v9, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 734
    const-string v0, "Content-Type"

    const-string v1, "application/json; charset=utf-8"

    invoke-virtual {v9, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 735
    new-instance v0, Lorg/apache/http/entity/StringEntity;

    invoke-direct {p0}, Lo/fit;->i()Ljava/lang/String;

    move-result-object v1

    const-string v2, "utf-8"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 736
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    move-object v10, v0

    .line 737
    invoke-interface {v10}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.connection.timeout"

    const/16 v2, 0x2710

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 738
    invoke-interface {v10}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.socket.timeout"

    const/16 v2, 0x2710

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 739
    .line 740
    invoke-interface {v10, v9}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v11

    .line 741
    invoke-interface {v11}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v12

    .line 742
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserBinded getQrcodeTicket: response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 743
    const/16 v0, 0xc8

    if-ne v12, v0, :cond_1

    .line 744
    invoke-interface {v11}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v8

    .line 745
    invoke-interface {v8}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 746
    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "UTF-8"

    invoke-direct {v0, v5, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v6, v0

    .line 747
    invoke-direct {p0, v6}, Lo/fit;->c(Ljava/io/InputStreamReader;)Ljava/lang/String;
    :try_end_1
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lorg/apache/http/conn/HttpHostConnectException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 748
    move-object v13, v7

    .line 761
    const/4 v11, 0x0

    .line 762
    if-eqz v10, :cond_0

    .line 763
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "httpClient close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    invoke-interface {v10}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 766
    :cond_0
    invoke-static {v5}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 767
    invoke-static {v6}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 748
    return-object v13

    .line 750
    :cond_1
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserBinded Network error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lorg/apache/http/conn/HttpHostConnectException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 761
    const/4 v11, 0x0

    .line 762
    if-eqz v10, :cond_2

    .line 763
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "httpClient close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    invoke-interface {v10}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 766
    :cond_2
    invoke-static {v5}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 767
    invoke-static {v6}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 768
    goto/16 :goto_1

    .line 752
    :catch_1
    move-exception v12

    .line 753
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserBinded ClientProtocolException e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Lorg/apache/http/client/ClientProtocolException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 761
    const/4 v11, 0x0

    .line 762
    if-eqz v10, :cond_3

    .line 763
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "httpClient close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    invoke-interface {v10}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 766
    :cond_3
    invoke-static {v5}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 767
    invoke-static {v6}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 768
    goto/16 :goto_1

    .line 754
    :catch_2
    move-exception v12

    .line 755
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserBinded UnknownHostException e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/net/UnknownHostException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 761
    const/4 v11, 0x0

    .line 762
    if-eqz v10, :cond_4

    .line 763
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "httpClient close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    invoke-interface {v10}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 766
    :cond_4
    invoke-static {v5}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 767
    invoke-static {v6}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 768
    goto/16 :goto_1

    .line 756
    :catch_3
    move-exception v12

    .line 757
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserBinded HttpHostConnectException e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Lorg/apache/http/conn/HttpHostConnectException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 761
    const/4 v11, 0x0

    .line 762
    if-eqz v10, :cond_5

    .line 763
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "httpClient close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    invoke-interface {v10}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 766
    :cond_5
    invoke-static {v5}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 767
    invoke-static {v6}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 768
    goto :goto_1

    .line 758
    :catch_4
    move-exception v12

    .line 759
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserBinded IOException e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 761
    const/4 v11, 0x0

    .line 762
    if-eqz v10, :cond_6

    .line 763
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "httpClient close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    invoke-interface {v10}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 766
    :cond_6
    invoke-static {v5}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 767
    invoke-static {v6}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 768
    goto :goto_1

    .line 761
    :catchall_0
    move-exception v14

    const/4 v11, 0x0

    .line 762
    if-eqz v10, :cond_7

    .line 763
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "httpClient close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    invoke-interface {v10}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 766
    :cond_7
    invoke-static {v5}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 767
    invoke-static {v6}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 768
    throw v14

    .line 769
    :goto_1
    return-object v7
.end method

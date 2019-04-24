.class public Lo/alj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/alj$d;,
        Lo/alj$b;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/Object;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/concurrent/ExecutorService;

.field private d:Landroid/content/Context;

.field private e:Lo/eaa;

.field private f:Landroid/view/Window;

.field private g:Lo/egq;

.field private h:Ljava/lang/String;

.field private i:Lo/alj$b;

.field private k:Landroid/os/Handler;

.field private l:Ljava/lang/String;

.field private m:J

.field private n:I

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 74
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/alj;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alj;->a:Ljava/util/List;

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alj;->f:Landroid/view/Window;

    .line 82
    new-instance v0, Lo/alj$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/alj$b;-><init>(Lo/alj;Lo/alj$5;)V

    iput-object v0, p0, Lo/alj;->i:Lo/alj$b;

    .line 84
    const-string v0, "2018YearReport"

    iput-object v0, p0, Lo/alj;->h:Ljava/lang/String;

    .line 85
    const-string v0, "2"

    iput-object v0, p0, Lo/alj;->p:Ljava/lang/String;

    .line 86
    const-string v0, "G0002018"

    iput-object v0, p0, Lo/alj;->o:Ljava/lang/String;

    .line 87
    const-wide v0, 0x16932bcd186L

    iput-wide v0, p0, Lo/alj;->m:J

    .line 88
    const/4 v0, 0x3

    iput v0, p0, Lo/alj;->n:I

    .line 89
    const-string v0, "1"

    iput-object v0, p0, Lo/alj;->l:Ljava/lang/String;

    .line 93
    iput-object p1, p0, Lo/alj;->d:Landroid/content/Context;

    .line 94
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/alj;->b:Ljava/util/concurrent/ExecutorService;

    .line 95
    invoke-static {p1}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    iput-object v0, p0, Lo/alj;->e:Lo/eaa;

    .line 96
    return-void
.end method

.method static synthetic a(Lo/alj;)Landroid/content/Context;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lo/alj;)Lo/eaa;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/alj;->e:Lo/eaa;

    return-object v0
.end method

.method static synthetic b(Lo/alj;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lo/alj;->d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    return-void
.end method

.method static synthetic c(Lo/alj;)Ljava/util/List;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/alj;->a:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lo/alj;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 70
    iput-object p1, p0, Lo/alj;->a:Ljava/util/List;

    return-object p1
.end method

.method static synthetic d(Lo/alj;)Landroid/os/Handler;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/alj;->k:Landroid/os/Handler;

    return-object v0
.end method

.method public static d(Landroid/content/Context;ILo/alj$d;)V
    .locals 4

    .line 434
    sget-object v0, Lo/dae;->bN:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    .line 435
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 436
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    const-string v0, "type"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    const-string v0, "id"

    iget-object v1, p2, Lo/alj$d;->b:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    const-string v0, "name"

    iget-object v1, p2, Lo/alj$d;->a:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    const-string v0, "module"

    iget-object v1, p2, Lo/alj$d;->e:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v2, v3, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 443
    return-void
.end method

.method private d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 14

    .line 259
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAdImage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getImgUri()Ljava/lang/String;

    move-result-object v7

    .line 261
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v8

    .line 262
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v9

    .line 263
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v10

    .line 264
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getModule()Ljava/lang/String;

    move-result-object v11

    .line 265
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 266
    return-void

    .line 269
    :cond_0
    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 270
    return-void

    .line 273
    :cond_1
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 274
    :cond_2
    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/eaa;->c(Ljava/lang/String;)Z

    .line 275
    return-void

    .line 277
    :cond_3
    new-instance v12, Lokhttp3/OkHttpClient;

    invoke-direct {v12}, Lokhttp3/OkHttpClient;-><init>()V

    .line 278
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    invoke-virtual {v0, v7}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v13

    .line 279
    invoke-virtual {v12, v13}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v0

    new-instance v1, Lo/alj$2;

    move-object v2, p0

    move-object v3, v11

    move-object v4, v8

    move-object v5, v9

    move-object v6, v10

    invoke-direct/range {v1 .. v6}, Lo/alj$2;-><init>(Lo/alj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    .line 318
    return-void
.end method

.method static synthetic e(Lo/alj;)Landroid/view/Window;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/alj;->f:Landroid/view/Window;

    return-object v0
.end method

.method static synthetic f()Ljava/lang/Object;
    .locals 1

    .line 70
    sget-object v0, Lo/alj;->c:Ljava/lang/Object;

    return-object v0
.end method

.method private i()V
    .locals 5

    .line 213
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHomeDialogMessage enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_msg_switch_promotion"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 216
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHomeDialogMessage promotionRecommend = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    const-string v0, "0"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 219
    return-void

    .line 221
    :cond_0
    iget-object v0, p0, Lo/alj;->b:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/alj;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 222
    :cond_1
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHomeDialogMessage mExecutorService not available"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    return-void

    .line 225
    :cond_2
    iget-object v0, p0, Lo/alj;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/alj$5;

    invoke-direct {v1, p0}, Lo/alj$5;-><init>(Lo/alj;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 253
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Handler;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lo/alj;->k:Landroid/os/Handler;

    .line 100
    invoke-direct {p0}, Lo/alj;->i()V

    .line 101
    return-void
.end method

.method public a()Z
    .locals 13

    .line 105
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 108
    :cond_1
    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v4

    .line 109
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAllowShowYearReport() huid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "key_ui_year_report_alert_count"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 112
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAllowShowYearReport() with alert count ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 114
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 115
    invoke-virtual {v6, v7, v8}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 116
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAllowShowYearReport() current date ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "key_ui_year_report_time"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 119
    invoke-static {v9}, Lo/dxk;->c(Ljava/lang/String;)J

    move-result-wide v10

    .line 120
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAllowShowYearReport() history date ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v12

    .line 122
    invoke-virtual {v12, v10, v11}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 124
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v5}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    iget v1, p0, Lo/alj;->n:I

    if-lt v0, v1, :cond_2

    .line 125
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isAllowShowYearReport() alert times reach maxtimes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    const/4 v0, 0x0

    return v0

    .line 127
    :cond_2
    iget-wide v0, p0, Lo/alj;->m:J

    cmp-long v0, v7, v0

    if-lez v0, :cond_3

    .line 128
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isAllowShowYearReport() alert reach endDate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const/4 v0, 0x0

    return v0

    .line 130
    :cond_3
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x5

    invoke-virtual {v6, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v12, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-gt v0, v1, :cond_4

    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {v12, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 131
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isAllowShowYearReport() alert date same date"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const/4 v0, 0x0

    return v0

    .line 134
    :cond_4
    invoke-virtual {p0, v5, v7, v8, v4}, Lo/alj;->e(Ljava/lang/String;JLjava/lang/String;)V

    .line 135
    const/4 v0, 0x1

    return v0
.end method

.method public b()V
    .locals 4

    .line 178
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterReceiver CloseAgreeDialogsReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lo/alj;->i:Lo/alj$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 180
    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/alj;->i:Lo/alj$b;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 182
    :cond_0
    return-void
.end method

.method public c()V
    .locals 13

    .line 153
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showYearReport() show year report"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f050407

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 155
    move-object v8, v7

    check-cast v8, Landroid/graphics/drawable/BitmapDrawable;

    .line 156
    invoke-virtual {v8}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v9

    .line 158
    const-string v10, "https://achievement.hicloud.com/web/annualHtml/annualReport2018.html"

    .line 159
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showYearReport() year URL = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget-object v0, p0, Lo/alj;->k:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v11

    .line 162
    new-instance v0, Lo/alj$d;

    move-object v1, v9

    move-object v2, v10

    iget-object v3, p0, Lo/alj;->o:Ljava/lang/String;

    iget-object v4, p0, Lo/alj;->h:Ljava/lang/String;

    iget-object v5, p0, Lo/alj;->p:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lo/alj$d;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/alj$5;)V

    move-object v12, v0

    .line 163
    iput-object v12, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 164
    const/16 v0, 0xc8

    iput v0, v11, Landroid/os/Message;->what:I

    .line 165
    iget-object v0, p0, Lo/alj;->k:Landroid/os/Handler;

    invoke-virtual {v0, v11}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 166
    return-void
.end method

.method public c(Landroid/content/Context;Lo/alj$d;)V
    .locals 7

    .line 321
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAdDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 323
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAdDialog null == mContext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    return-void

    .line 326
    :cond_0
    new-instance v0, Lo/egq$e;

    invoke-direct {v0, p1}, Lo/egq$e;-><init>(Landroid/content/Context;)V

    iget-object v1, p2, Lo/alj$d;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lo/egq$e;->e(Landroid/graphics/Bitmap;)Lo/egq$e;

    move-result-object v0

    new-instance v1, Lo/alj$3;

    invoke-direct {v1, p0, p1, p2}, Lo/alj$3;-><init>(Lo/alj;Landroid/content/Context;Lo/alj$d;)V

    invoke-virtual {v0, v1}, Lo/egq$e;->d(Landroid/view/View$OnClickListener;)Lo/egq$e;

    move-result-object v0

    new-instance v1, Lo/alj$4;

    invoke-direct {v1, p0, p1, p2}, Lo/alj$4;-><init>(Lo/alj;Landroid/content/Context;Lo/alj$d;)V

    .line 339
    invoke-virtual {v0, v1}, Lo/egq$e;->b(Landroid/view/View$OnClickListener;)Lo/egq$e;

    move-result-object v4

    .line 345
    invoke-virtual {v4}, Lo/egq$e;->d()Lo/egq;

    move-result-object v0

    iput-object v0, p0, Lo/alj;->g:Lo/egq;

    .line 346
    invoke-virtual {v4}, Lo/egq$e;->e()Z

    move-result v5

    .line 347
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showSucess = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    if-nez v5, :cond_1

    .line 349
    return-void

    .line 351
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    iget-object v1, p2, Lo/alj$d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eaa;->c(Ljava/lang/String;)Z

    .line 352
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1, p2}, Lo/alj;->d(Landroid/content/Context;ILo/alj$d;)V

    .line 353
    iget-object v0, p0, Lo/alj;->g:Lo/egq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egq;->setCanceledOnTouchOutside(Z)V

    .line 354
    iget-object v0, p0, Lo/alj;->g:Lo/egq;

    new-instance v1, Lo/alj$1;

    invoke-direct {v1, p0, p1, p2}, Lo/alj$1;-><init>(Lo/alj;Landroid/content/Context;Lo/alj$d;)V

    invoke-virtual {v0, v1}, Lo/egq;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 363
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_2

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 364
    iget-object v0, p0, Lo/alj;->g:Lo/egq;

    invoke-virtual {v0}, Lo/egq;->getWindow()Landroid/view/Window;

    move-result-object v0

    iput-object v0, p0, Lo/alj;->f:Landroid/view/Window;

    .line 365
    iget-object v0, p0, Lo/alj;->g:Lo/egq;

    invoke-virtual {v0}, Lo/egq;->show()V

    .line 367
    iget-object v0, p0, Lo/alj;->k:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 368
    const/16 v0, 0x12c

    iput v0, v6, Landroid/os/Message;->what:I

    .line 369
    iget-object v0, p0, Lo/alj;->k:Landroid/os/Handler;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v6, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 371
    :cond_2
    return-void
.end method

.method public d()V
    .locals 4

    .line 377
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter is_dialog_dismiss()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    iget-object v0, p0, Lo/alj;->g:Lo/egq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/alj;->g:Lo/egq;

    iget-object v1, p0, Lo/alj;->d:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/egq;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 379
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialog_dismiss"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    iget-object v0, p0, Lo/alj;->g:Lo/egq;

    invoke-virtual {v0}, Lo/egq;->dismiss()V

    .line 382
    :cond_0
    return-void
.end method

.method public e()V
    .locals 5

    .line 169
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerReceiver CloseAgreeDialogsReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 172
    iget-object v0, p0, Lo/alj;->i:Lo/alj$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 173
    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/alj;->i:Lo/alj$b;

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 175
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;JLjava/lang/String;)V
    .locals 5

    .line 140
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "yearReportAlertInfoUpdate() update alertInfo with count ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "currentDate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "key_ui_year_report_alert_count"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/alj;->l:Ljava/lang/String;

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 145
    :cond_0
    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "key_ui_year_report_alert_count"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 146
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 145
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 148
    :goto_0
    iget-object v0, p0, Lo/alj;->d:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "key_ui_year_report_time"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 149
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 148
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 150
    return-void
.end method

.method public k()V
    .locals 6

    .line 409
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    iget-object v0, p0, Lo/alj;->b:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 411
    iget-object v0, p0, Lo/alj;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 413
    :cond_0
    sget-object v4, Lo/alj;->c:Ljava/lang/Object;

    monitor-enter v4

    .line 414
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lo/alj;->a:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 415
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 416
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alj;->i:Lo/alj$b;

    .line 417
    iget-object v0, p0, Lo/alj;->g:Lo/egq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 418
    iget-object v0, p0, Lo/alj;->g:Lo/egq;

    invoke-virtual {v0}, Lo/egq;->dismiss()V

    .line 419
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alj;->g:Lo/egq;

    .line 421
    :cond_1
    iget-object v0, p0, Lo/alj;->f:Landroid/view/Window;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 422
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alj;->f:Landroid/view/Window;

    .line 424
    :cond_2
    return-void
.end method

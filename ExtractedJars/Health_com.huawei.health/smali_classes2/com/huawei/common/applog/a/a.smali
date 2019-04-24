.class public Lcom/huawei/common/applog/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "ReportApi/ReportDataHandleTask"

.field private static b:Lcom/huawei/common/applog/bean/ExtraBundle; = null

.field private static c:Ljava/lang/String; = null

.field private static d:Ljava/lang/String; = null

.field private static e:Ljava/lang/String; = null

.field private static f:Ljava/lang/String; = null

.field private static g:Ljava/lang/String; = null

.field private static h:Ljava/lang/String; = null

.field private static i:Ljava/lang/String; = null

.field private static j:Ljava/lang/String; = null

.field private static k:Ljava/lang/String; = null

.field private static l:Ljava/lang/String; = null

.field private static m:Ljava/lang/String; = null

.field private static n:Ljava/lang/String; = null

.field private static o:Ljava/lang/String; = null

.field private static p:Ljava/lang/String; = null

.field private static q:Ljava/lang/String; = null

.field private static r:Ljava/lang/String; = null

.field private static s:Ljava/lang/String; = null

.field private static t:Ljava/lang/String; = null

.field private static u:Ljava/lang/String; = null

.field private static v:Ljava/lang/String; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->c:Ljava/lang/String;

    .line 37
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->d:Ljava/lang/String;

    .line 39
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->e:Ljava/lang/String;

    .line 41
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->f:Ljava/lang/String;

    .line 43
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->g:Ljava/lang/String;

    .line 45
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->h:Ljava/lang/String;

    .line 47
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->i:Ljava/lang/String;

    .line 49
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->j:Ljava/lang/String;

    .line 51
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->k:Ljava/lang/String;

    .line 53
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->l:Ljava/lang/String;

    .line 55
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->m:Ljava/lang/String;

    .line 57
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->n:Ljava/lang/String;

    .line 59
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->o:Ljava/lang/String;

    .line 61
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->p:Ljava/lang/String;

    .line 63
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->q:Ljava/lang/String;

    .line 66
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->r:Ljava/lang/String;

    .line 68
    const-string v0, "1.1"

    sput-object v0, Lcom/huawei/common/applog/a/a;->s:Ljava/lang/String;

    .line 70
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->t:Ljava/lang/String;

    .line 72
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->u:Ljava/lang/String;

    .line 74
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->v:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 5

    .line 315
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 316
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy/MM/dd HH:mm:ss"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v3, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 317
    invoke-virtual {v3, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 318
    return-object v4
.end method

.method private static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 9

    .line 204
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 205
    const-string v0, ""

    return-object v0

    .line 207
    :cond_0
    const-string v0, "connectivity"

    .line 208
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/net/ConnectivityManager;

    .line 209
    const-string v4, ""

    .line 210
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v5

    .line 211
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 212
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 213
    const-string v4, "WIFI"

    goto/16 :goto_2

    .line 214
    :cond_1
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    if-nez v0, :cond_4

    .line 215
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v6

    .line 216
    const-string v0, "ReportApi/ReportDataHandleTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Network getSubtypeName : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v7

    .line 218
    packed-switch v7, :pswitch_data_0

    goto :goto_0

    .line 224
    :pswitch_0
    const-string v4, "2G"

    .line 225
    goto :goto_1

    .line 235
    :pswitch_1
    const-string v4, "3G"

    .line 236
    goto :goto_1

    .line 238
    :pswitch_2
    const-string v4, "4G"

    .line 239
    goto :goto_1

    .line 242
    :goto_0
    const-string v0, "TD-SCDMA"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "WCDMA"

    .line 243
    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "CDMA2000"

    .line 244
    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 245
    :cond_2
    const-string v4, "3G"

    goto :goto_1

    .line 247
    :cond_3
    move-object v4, v6

    .line 254
    :goto_1
    invoke-static {p0}, Lcom/huawei/common/applog/a/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 255
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 256
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 260
    :cond_4
    :goto_2
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 299
    if-eqz p0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    invoke-static {v0}, Lcom/huawei/feedback/e;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized a(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 9

    const-class v8, Lcom/huawei/common/applog/a/a;

    monitor-enter v8

    .line 85
    :try_start_0
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/b;->d()Lcom/huawei/common/applog/bean/Event;

    move-result-object v3

    .line 86
    invoke-static {v3}, Lcom/huawei/common/applog/a/a;->a(Lcom/huawei/common/applog/bean/Event;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    const-string v0, "ReportApi/ReportDataHandleTask"

    const-string v1, "runReportDataHandle param  check fail !"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    monitor-exit v8

    return-void

    .line 92
    :cond_0
    invoke-static {p0}, Lcom/huawei/feedback/e;->m(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 93
    const-string v0, "ReportApi/ReportDataHandleTask"

    const-string v1, "runReportDataHandle isallowReprot false or rom is not china !"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    monitor-exit v8

    return-void

    .line 97
    :cond_1
    invoke-static {v3, p0}, Lcom/huawei/common/applog/a/a;->a(Lcom/huawei/common/applog/bean/Event;Landroid/content/Context;)V

    .line 100
    sget-object v0, Lcom/huawei/common/applog/a/a;->b:Lcom/huawei/common/applog/bean/ExtraBundle;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->b:Lcom/huawei/common/applog/bean/ExtraBundle;

    invoke-virtual {v1}, Lcom/huawei/common/applog/bean/ExtraBundle;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->c:Ljava/lang/String;

    goto :goto_0

    .line 103
    :cond_2
    const-string v0, ""

    sput-object v0, Lcom/huawei/common/applog/a/a;->c:Ljava/lang/String;

    .line 105
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/common/applog/a/a;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 112
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 113
    const-string v0, "package_name"

    sget-object v1, Lcom/huawei/common/applog/a/a;->t:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    const-string v0, "msg_value"

    invoke-virtual {v5, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/common/applog/bean/b;->a(Ljava/util/HashMap;)Z

    move-result v6

    .line 118
    if-nez v6, :cond_4

    .line 119
    const-string v0, "ReportApi/ReportDataHandleTask"

    const-string v1, "MessageQueue full,insert fail"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    .line 122
    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/b;->c()Ljava/util/HashMap;

    move-result-object v7

    .line 123
    const-string v0, "ReportApi/ReportDataHandleTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "remove pollData = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    if-nez v7, :cond_3

    .line 125
    const-string v0, "ReportApi/ReportDataHandleTask"

    const-string v1, "MessageQueue is empty"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 127
    :cond_3
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/common/applog/bean/b;->a(Ljava/util/HashMap;)Z

    .line 128
    const-string v0, "ReportApi/ReportDataHandleTask"

    const-string v1, "insert message again"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    :cond_4
    :goto_1
    const-string v0, "ReportApi/ReportDataHandleTask"

    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/common/applog/bean/b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    const/16 v0, 0x2710

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    monitor-exit v8

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v8

    throw p0
.end method

.method private static a(Lcom/huawei/common/applog/bean/Event;Landroid/content/Context;)V
    .locals 1

    .line 162
    invoke-static {}, Lcom/huawei/common/applog/a/a;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->r:Ljava/lang/String;

    .line 163
    const/4 v0, 0x0

    if-eq v0, p0, :cond_4

    .line 164
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getDomain()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->q:Ljava/lang/String;

    .line 165
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getServerIp()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->p:Ljava/lang/String;

    .line 166
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getDnsTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->o:Ljava/lang/String;

    .line 167
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getConnTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->n:Ljava/lang/String;

    .line 168
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getPreTranTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->m:Ljava/lang/String;

    .line 169
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getStartTranTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->l:Ljava/lang/String;

    .line 170
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getTotalTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->k:Ljava/lang/String;

    .line 171
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getSizeDownload()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->j:Ljava/lang/String;

    .line 172
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getSizeUpload()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->i:Ljava/lang/String;

    .line 174
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getReturnCode()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->h:Ljava/lang/String;

    .line 175
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getErrorReason()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->g:Ljava/lang/String;

    .line 176
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getClientErrorCode()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->f:Ljava/lang/String;

    .line 177
    sget-object v0, Lcom/huawei/common/applog/a/a;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    sget-object v0, Lcom/huawei/common/applog/a/a;->f:Ljava/lang/String;

    sput-object v0, Lcom/huawei/common/applog/a/a;->h:Ljava/lang/String;

    .line 180
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getResourcePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->e:Ljava/lang/String;

    .line 181
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getOperationType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->d:Ljava/lang/String;

    .line 182
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getExtraData()Lcom/huawei/common/applog/bean/ExtraBundle;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getExtraData()Lcom/huawei/common/applog/bean/ExtraBundle;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sput-object v0, Lcom/huawei/common/applog/a/a;->b:Lcom/huawei/common/applog/bean/ExtraBundle;

    .line 185
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 186
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getAppPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 187
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getAppPackageName()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    :goto_1
    sput-object v0, Lcom/huawei/common/applog/a/a;->t:Ljava/lang/String;

    .line 188
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getAppVersionName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 189
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getAppVersionName()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 190
    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/phoneserviceuni/common/e/a;->b(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 189
    invoke-static {v0}, Lcom/huawei/common/applog/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    sput-object v0, Lcom/huawei/common/applog/a/a;->u:Ljava/lang/String;

    .line 192
    invoke-static {p1}, Lcom/huawei/common/applog/a/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/applog/a/a;->v:Ljava/lang/String;

    .line 196
    :cond_4
    return-void
.end method

.method private static a(Lcom/huawei/common/applog/bean/Event;)Z
    .locals 2

    .line 145
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 146
    const-string v0, "ReportApi/ReportDataHandleTask"

    const-string v1, "paramCheck event is null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    const/4 v0, 0x0

    return v0

    .line 149
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getResourcePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 150
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getOperationType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 151
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 154
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getReturnCode()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 155
    invoke-virtual {p0}, Lcom/huawei/common/applog/bean/Event;->getClientErrorCode()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 156
    const/4 v0, 0x0

    return v0

    .line 158
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 269
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 270
    const-string v0, ""

    return-object v0

    .line 272
    :cond_0
    const-string v2, ""

    .line 273
    invoke-static {p0}, Lcom/huawei/common/applog/a/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 274
    const-string v0, "ReportApi/ReportDataHandleTask"

    const-string v1, "no have Manifest.permission.READ_PHONE_STATE"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    return-object v2

    .line 277
    :cond_1
    const-string v0, "phone"

    .line 278
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/telephony/TelephonyManager;

    .line 280
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 281
    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v2

    .line 283
    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 284
    const-string v0, "ReportApi/ReportDataHandleTask"

    const-string v1, "getIMSI isEmpty"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    const-string v0, ""

    return-object v0

    .line 287
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-lt v0, v1, :cond_4

    .line 288
    const/4 v0, 0x0

    const/4 v1, 0x5

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 290
    :cond_4
    return-object v2
.end method

.method private static c(Landroid/content/Context;)Z
    .locals 2

    .line 307
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_0

    const-string v0, "android.permission.READ_PHONE_STATE"

    .line 308
    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

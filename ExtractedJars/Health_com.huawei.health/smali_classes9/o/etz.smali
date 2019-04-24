.class public Lo/etz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/etz$b;
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/String;


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

.field private d:Lo/euh;

.field private final e:Z

.field private i:Ljava/lang/String;

.field private k:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const-class v0, Lo/etz;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/etz;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lo/euh;)V
    .locals 6

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/etz;->e:Z

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/etz;->a:Landroid/app/Activity;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/etz;->d:Lo/euh;

    .line 51
    new-instance v0, Lo/etz$b;

    invoke-direct {v0, p0}, Lo/etz$b;-><init>(Lo/etz;)V

    iput-object v0, p0, Lo/etz;->k:Landroid/content/BroadcastReceiver;

    .line 110
    if-nez p1, :cond_0

    .line 111
    return-void

    .line 112
    :cond_0
    iput-object p1, p0, Lo/etz;->a:Landroid/app/Activity;

    .line 113
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/etz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 114
    new-instance v4, Landroid/content/IntentFilter;

    sget-object v0, Lo/etz;->c:Ljava/lang/String;

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lo/etz;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/etz;->k:Landroid/content/BroadcastReceiver;

    invoke-static {v0, v1, v4}, Lo/dbg;->c(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 117
    iput-object p2, p0, Lo/etz;->d:Lo/euh;

    .line 119
    iget-object v0, p0, Lo/etz;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 120
    const-string v0, "com.huawei.health"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 121
    iput-object v3, p0, Lo/etz;->i:Ljava/lang/String;

    goto :goto_0

    .line 123
    :cond_1
    const-string v0, "wx3d91f74f61accef0"

    iput-object v0, p0, Lo/etz;->i:Ljava/lang/String;

    .line 126
    :goto_0
    iget-object v0, p0, Lo/etz;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/etz;->i:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    iput-object v0, p0, Lo/etz;->b:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 128
    iget-object v0, p0, Lo/etz;->b:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 129
    iget-object v0, p0, Lo/etz;->b:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    iget-object v1, p0, Lo/etz;->i:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z

    .line 130
    iget-object v0, p0, Lo/etz;->d:Lo/euh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 131
    iget-object v0, p0, Lo/etz;->d:Lo/euh;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/euh;->a(Z)V

    goto :goto_1

    .line 134
    :cond_2
    iget-object v0, p0, Lo/etz;->d:Lo/euh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 135
    iget-object v0, p0, Lo/etz;->d:Lo/euh;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/euh;->a(Z)V

    .line 139
    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/etz;)Lo/euh;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/etz;->d:Lo/euh;

    return-object v0
.end method

.method public static final d(Landroid/content/Context;)Ljava/lang/String;
    .locals 9

    .line 195
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v4

    .line 196
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x3f8

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v5

    .line 197
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x7e0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v6

    .line 198
    const/4 v7, 0x0

    .line 200
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/huawei/whitebox/e;->b([B)[B

    move-result-object v1

    const-string v2, "utf-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v7, v0

    .line 203
    goto :goto_0

    .line 201
    :catch_0
    move-exception v8

    .line 202
    const-string v0, "WXLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    :goto_0
    return-object v7
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 144
    iget-object v0, p0, Lo/etz;->b:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/etz;->i:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 145
    new-instance v2, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;

    invoke-direct {v2}, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;-><init>()V

    .line 146
    const-string v0, "snsapi_userinfo,snsapi_friend,snsapi_message"

    iput-object v0, v2, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;->scope:Ljava/lang/String;

    .line 147
    const-string v0, "weixin"

    iput-object v0, v2, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;->state:Ljava/lang/String;

    .line 148
    iget-object v0, p0, Lo/etz;->b:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v0, v2}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    .line 152
    :cond_0
    return-void
.end method

.method public b()Z
    .locals 5

    .line 181
    const/4 v4, 0x1

    .line 182
    iget-object v0, p0, Lo/etz;->b:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 183
    iget-object v0, p0, Lo/etz;->b:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->isWXAppInstalled()Z

    move-result v4

    goto :goto_0

    .line 187
    :cond_0
    const-string v0, "WXLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWXAppInstalled() mWXApi=null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    :goto_0
    return v4
.end method

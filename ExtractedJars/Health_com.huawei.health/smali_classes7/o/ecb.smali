.class public Lo/ecb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/dav;

.field private b:Landroid/content/Context;

.field private c:Lo/ebx;

.field private d:Lo/ebz;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Lcom/sina/weibo/sdk/share/WbShareHandler;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const-string v0, "InteractorManager"

    iput-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    .line 61
    const-string v0, "2"

    iput-object v0, p0, Lo/ecb;->h:Ljava/lang/String;

    .line 62
    const-string v0, "3"

    iput-object v0, p0, Lo/ecb;->k:Ljava/lang/String;

    .line 63
    const-string v0, "4"

    iput-object v0, p0, Lo/ecb;->f:Ljava/lang/String;

    .line 64
    const-string v0, "7"

    iput-object v0, p0, Lo/ecb;->i:Ljava/lang/String;

    .line 82
    iput-object p1, p0, Lo/ecb;->b:Landroid/content/Context;

    .line 83
    invoke-direct {p0, p1}, Lo/ecb;->e(Landroid/content/Context;)V

    .line 84
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/ecb;
    .locals 1

    .line 91
    new-instance v0, Lo/ecb;

    invoke-direct {v0, p0}, Lo/ecb;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private a()V
    .locals 5

    .line 284
    iget-object v0, p0, Lo/ecb;->g:Lcom/sina/weibo/sdk/share/WbShareHandler;

    if-nez v0, :cond_0

    .line 285
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ShareWeibo() if (mWeiboShareAPI == null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    return-void

    .line 289
    :cond_0
    new-instance v4, Lo/eby;

    iget-object v0, p0, Lo/ecb;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/ecb;->a:Lo/dav;

    iget-object v2, p0, Lo/ecb;->g:Lcom/sina/weibo/sdk/share/WbShareHandler;

    invoke-direct {v4, v0, v1, v2}, Lo/eby;-><init>(Landroid/content/Context;Lo/dav;Lcom/sina/weibo/sdk/share/WbShareHandler;)V

    .line 291
    invoke-virtual {v4}, Lo/eby;->d()V

    .line 292
    iget-object v0, p0, Lo/ecb;->a:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->d()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ecb;->c(I)V

    .line 293
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareWeibo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    invoke-virtual {v4}, Lo/eby;->a()V

    .line 295
    return-void
.end method

.method private a(I)V
    .locals 2

    .line 210
    iget-object v0, p0, Lo/ecb;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 211
    iget-object v0, p0, Lo/ecb;->b:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lo/ecb;->b(Landroid/content/Context;I)V

    .line 213
    :cond_0
    return-void
.end method

.method private b(Landroid/content/Context;I)V
    .locals 4

    .line 218
    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    .line 219
    .line 221
    const/16 v0, 0x272b

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SHARE_POP_UP_ACTIVITY_SHARE_TYPE"

    .line 223
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 219
    invoke-static {p1, v0, v1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 225
    return-void
.end method

.method private c()V
    .locals 5

    .line 248
    iget-object v0, p0, Lo/ecb;->c:Lo/ebx;

    if-nez v0, :cond_0

    .line 249
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareWechatMoments() mWeChatInteractors == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    return-void

    .line 253
    :cond_0
    iget-object v0, p0, Lo/ecb;->c:Lo/ebx;

    iget-object v1, p0, Lo/ecb;->a:Lo/dav;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ebx;->e(Lo/dav;I)I

    move-result v4

    .line 254
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    .line 255
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareWechatMoments() WE_CHAT_NOT_BE_INSTALLED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    return-void

    .line 258
    :cond_1
    iget-object v0, p0, Lo/ecb;->a:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->d()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ecb;->c(I)V

    .line 259
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareWechatMoments shareResult = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    return-void
.end method

.method private c(I)V
    .locals 5

    .line 312
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 313
    const-string v0, "com.huawei.healthcloud.action.sendSportTrackDistance"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 314
    const-string v0, "share_key"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 315
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendShareBroadCast key="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    iget-object v0, p0, Lo/ecb;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/dbg;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 317
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 6

    .line 233
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BIStatistics ENTER key="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 235
    const-string v0, "type"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    iget-object v0, p0, Lo/ecb;->a:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->o()Ljava/util/Map;

    move-result-object v5

    .line 237
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 238
    invoke-interface {v4, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 240
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/ecb;->a:Lo/dav;

    invoke-virtual {v2}, Lo/dav;->m()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 241
    return-void
.end method

.method private e()V
    .locals 5

    .line 267
    iget-object v0, p0, Lo/ecb;->c:Lo/ebx;

    if-nez v0, :cond_0

    .line 268
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ShareWeChat() mWeChatInteractors == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    return-void

    .line 272
    :cond_0
    iget-object v0, p0, Lo/ecb;->c:Lo/ebx;

    iget-object v1, p0, Lo/ecb;->a:Lo/dav;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ebx;->e(Lo/dav;I)I

    move-result v4

    .line 273
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    .line 274
    return-void

    .line 276
    :cond_1
    iget-object v0, p0, Lo/ecb;->a:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->d()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ecb;->c(I)V

    .line 277
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareWeChat shareResult = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 6

    .line 128
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init sdk"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    iput-object p1, p0, Lo/ecb;->b:Landroid/content/Context;

    .line 130
    invoke-static {}, Lo/ebk;->c()Lo/dav;

    move-result-object v0

    iput-object v0, p0, Lo/ecb;->a:Lo/dav;

    .line 131
    new-instance v0, Lo/ebx;

    invoke-direct {v0, p1}, Lo/ebx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ecb;->c:Lo/ebx;

    .line 134
    iget-object v0, p0, Lo/ecb;->b:Landroid/content/Context;

    new-instance v1, Lcom/sina/weibo/sdk/auth/AuthInfo;

    iget-object v2, p0, Lo/ecb;->b:Landroid/content/Context;

    const-string v3, "13750428"

    const-string v4, "http://www.sina.com"

    const-string v5, "email,direct_messages_read,direct_messages_write,friendships_groups_read,friendships_groups_write,statuses_to_me_read,follow_app_official_microblog,invitation_write"

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/sina/weibo/sdk/auth/AuthInfo;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/WbSdk;->install(Landroid/content/Context;Lcom/sina/weibo/sdk/auth/AuthInfo;)V

    .line 138
    new-instance v0, Lcom/sina/weibo/sdk/share/WbShareHandler;

    iget-object v1, p0, Lo/ecb;->b:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/share/WbShareHandler;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lo/ecb;->g:Lcom/sina/weibo/sdk/share/WbShareHandler;

    .line 143
    iget-object v0, p0, Lo/ecb;->g:Lcom/sina/weibo/sdk/share/WbShareHandler;

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/share/WbShareHandler;->registerApp()Z

    .line 150
    new-instance v0, Lo/ebz;

    iget-object v1, p0, Lo/ecb;->b:Landroid/content/Context;

    iget-object v2, p0, Lo/ecb;->a:Lo/dav;

    invoke-direct {v0, v1, v2}, Lo/ebz;-><init>(Landroid/content/Context;Lo/dav;)V

    iput-object v0, p0, Lo/ecb;->d:Lo/ebz;

    .line 151
    return-void
.end method

.method private g()Landroid/graphics/Bitmap;
    .locals 5

    .line 354
    iget-object v0, p0, Lo/ecb;->a:Lo/dav;

    invoke-static {v0}, Lo/ece;->c(Lo/dav;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 355
    if-nez v4, :cond_0

    .line 356
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getShareContentBitmap failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    const/4 v0, 0x0

    return-object v0

    .line 359
    :cond_0
    return-object v4
.end method

.method private h()V
    .locals 5

    .line 325
    invoke-direct {p0}, Lo/ecb;->g()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 326
    if-nez v4, :cond_0

    .line 327
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getShareContentBitmap failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    iget-object v0, p0, Lo/ecb;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_show_save_failed:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 329
    return-void

    .line 331
    :cond_0
    const/16 v0, 0x2800

    invoke-static {v4, v0}, Lo/ece;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 332
    iget-object v0, p0, Lo/ecb;->b:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/ece;->a(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/net/Uri;

    .line 333
    return-void
.end method

.method private k()V
    .locals 3

    .line 340
    iget-object v0, p0, Lo/ecb;->d:Lo/ebz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 341
    iget-object v0, p0, Lo/ecb;->d:Lo/ebz;

    invoke-virtual {v0}, Lo/ebz;->a()V

    .line 343
    :cond_0
    new-instance v0, Lo/ebz;

    iget-object v1, p0, Lo/ecb;->b:Landroid/content/Context;

    iget-object v2, p0, Lo/ecb;->a:Lo/dav;

    invoke-direct {v0, v1, v2}, Lo/ebz;-><init>(Landroid/content/Context;Lo/dav;)V

    iput-object v0, p0, Lo/ecb;->d:Lo/ebz;

    .line 346
    iget-object v0, p0, Lo/ecb;->d:Lo/ebz;

    invoke-virtual {v0}, Lo/ebz;->b()V

    .line 347
    iget-object v0, p0, Lo/ecb;->a:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->d()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ecb;->c(I)V

    .line 348
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 115
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ecb;->b:Landroid/content/Context;

    .line 116
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ecb;->g:Lcom/sina/weibo/sdk/share/WbShareHandler;

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ecb;->c:Lo/ebx;

    .line 118
    iget-object v0, p0, Lo/ecb;->d:Lo/ebz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 119
    iget-object v0, p0, Lo/ecb;->d:Lo/ebz;

    invoke-virtual {v0}, Lo/ebz;->a()V

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ecb;->d:Lo/ebz;

    .line 122
    :cond_0
    return-void
.end method

.method public c(Landroid/content/Context;ILo/dav;)V
    .locals 5

    .line 159
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 160
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareContent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    return-void

    .line 163
    :cond_0
    iput-object p3, p0, Lo/ecb;->a:Lo/dav;

    .line 164
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 167
    :pswitch_0
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_wechat_moments"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    iget-object v0, p0, Lo/ecb;->h:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/ecb;->c(Ljava/lang/String;)V

    .line 169
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/ecb;->a(I)V

    .line 170
    invoke-direct {p0}, Lo/ecb;->c()V

    .line 171
    goto/16 :goto_1

    .line 174
    :pswitch_1
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_wechat_frands"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    iget-object v0, p0, Lo/ecb;->k:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/ecb;->c(Ljava/lang/String;)V

    .line 176
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ecb;->a(I)V

    .line 177
    invoke-direct {p0}, Lo/ecb;->e()V

    .line 178
    goto/16 :goto_1

    .line 181
    :pswitch_2
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_weibo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    iget-object v0, p0, Lo/ecb;->f:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/ecb;->c(Ljava/lang/String;)V

    .line 183
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/ecb;->a(I)V

    .line 184
    invoke-direct {p0}, Lo/ecb;->a()V

    .line 185
    goto/16 :goto_1

    .line 188
    :pswitch_3
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_save_to_local"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 191
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/ecb;->b:Landroid/content/Context;

    sget-object v2, Lo/dae;->gR:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 193
    invoke-direct {p0}, Lo/ecb;->h()V

    .line 194
    goto :goto_1

    .line 196
    :pswitch_4
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_more_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    iget-object v0, p0, Lo/ecb;->i:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/ecb;->c(Ljava/lang/String;)V

    .line 198
    invoke-direct {p0}, Lo/ecb;->k()V

    .line 199
    goto :goto_1

    .line 201
    :goto_0
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unknow type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public d()V
    .locals 0

    .line 108
    invoke-virtual {p0}, Lo/ecb;->b()V

    .line 109
    return-void
.end method

.method public d(Landroid/content/Intent;Landroid/content/Context;)V
    .locals 4

    .line 298
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doResultIntent::enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    instance-of v0, p2, Lcom/sina/weibo/sdk/share/WbShareCallback;

    if-eqz v0, :cond_0

    .line 300
    iget-object v0, p0, Lo/ecb;->g:Lcom/sina/weibo/sdk/share/WbShareHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 301
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doResultIntent::mShareHandler.doResultIntent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    iget-object v0, p0, Lo/ecb;->g:Lcom/sina/weibo/sdk/share/WbShareHandler;

    move-object v1, p2

    check-cast v1, Lcom/sina/weibo/sdk/share/WbShareCallback;

    invoke-virtual {v0, p1, v1}, Lcom/sina/weibo/sdk/share/WbShareHandler;->doResultIntent(Landroid/content/Intent;Lcom/sina/weibo/sdk/share/WbShareCallback;)V

    .line 305
    :cond_0
    return-void
.end method

.method protected finalize()V
    .locals 5

    .line 97
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    goto :goto_0

    .line 98
    :catch_0
    move-exception v4

    .line 99
    iget-object v0, p0, Lo/ecb;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finalize fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    :goto_0
    invoke-virtual {p0}, Lo/ecb;->d()V

    .line 102
    return-void
.end method

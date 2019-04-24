.class public Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Lo/egd;

.field private b:Landroid/content/Context;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;

.field private e:Lo/egd;

.field private f:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

.field private g:Lo/fjk;

.field private i:Lo/emz;

.field private k:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 208
    new-instance v0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$5;-><init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->g:Lo/fjk;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->k:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)Landroid/content/Context;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)Lo/fjk;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->g:Lo/fjk;

    return-object v0
.end method

.method private c(Landroid/app/Activity;Lo/fjk;)V
    .locals 5

    .line 197
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerQQLogin enter():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->k:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 201
    :try_start_0
    new-instance v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    const-string v1, "246EEE3DEB39B92A8A5401AFAFB7A145+St7Toa8/8bYhaXnNQHVSSTd0ad2hguXwKeUK9fBK/g= "

    invoke-direct {v0, p1, p2, v1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;-><init>(Landroid/app/Activity;Lo/fjk;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->k:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 204
    goto :goto_0

    .line 202
    :catch_0
    move-exception v4

    .line 203
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    :cond_0
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;Landroid/app/Activity;Lo/fjk;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->c(Landroid/app/Activity;Lo/fjk;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->f:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    return-object v0
.end method

.method private e()V
    .locals 7

    .line 72
    sget v0, Lcom/huawei/ui/thirdpartservice/R$layout;->activity_qq_health:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->setContentView(I)V

    .line 73
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->qq_health_head_img:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->c:Landroid/widget/ImageView;

    .line 74
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->qq_health_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->d:Landroid/widget/TextView;

    .line 75
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->OpenQQHealthButton:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->e:Lo/egd;

    .line 76
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->DisconnectQQHealthButton:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->a:Lo/egd;

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->e:Lo/egd;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$1;-><init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->a:Lo/egd;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$4;-><init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    const-string v4, ""

    .line 95
    new-instance v5, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;

    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;-><init>(Landroid/content/Context;)V

    .line 96
    invoke-virtual {v5}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;->get()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;

    move-result-object v6

    .line 97
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get qqHealthTable="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 99
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get qqHealthTable="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    invoke-virtual {v6}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getNickName()Ljava/lang/String;

    move-result-object v4

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getQqLogoPath="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getQqLogoPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->i:Lo/emz;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->c:Landroid/widget/ImageView;

    .line 104
    invoke-virtual {v6}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getQqLogoPath()Ljava/lang/String;

    move-result-object v3

    .line 103
    invoke-virtual {v0, v1, v2, v3}, Lo/emz;->d(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;)V

    goto :goto_0

    .line 106
    :cond_0
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get qqHealthTable is null !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->i:Lo/emz;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->c:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/emz;->d(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 109
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 239
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 240
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 242
    const-string v0, "type"

    invoke-interface {v3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 245
    return-void
.end method


# virtual methods
.method public c()V
    .locals 8

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Network is not Connected "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_connect_error:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 120
    return-void

    .line 122
    :cond_0
    const/4 v0, 0x0

    new-array v4, v0, [B

    .line 124
    const-string v0, "http://yundong.qq.com/?_wv=2172899&asyncMode=1&crashFrom=40501&ADTAG=yundong.outside.huaweiyundongjiankang"

    const-string v1, "UTF8"

    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 127
    goto :goto_0

    .line 125
    :catch_0
    move-exception v5

    .line 126
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    :goto_0
    const-string v0, "http://yundong.qq.com/?_wv=2172899&asyncMode=1&crashFrom=40501&ADTAG=yundong.outside.huaweiyundongjiankang"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v4, v1, v0}, Lo/deg;->b([BII)Ljava/lang/String;

    move-result-object v5

    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mqqapi://forward/url?src_type=web&version=1&url_prefix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/open/utils/SystemUtils;->checkMobileQQ(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "open url from qq app."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    new-instance v6, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 135
    invoke-virtual {p0, v6}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->startActivity(Landroid/content/Intent;)V

    .line 136
    goto :goto_1

    .line 137
    :cond_1
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "system not qq app"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    const-string v0, "market://details?id=com.tencent.mobileqq"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    .line 141
    :try_start_1
    new-instance v7, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v7, v0, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 142
    const/high16 v0, 0x10000000

    invoke-virtual {v7, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 147
    goto :goto_1

    .line 144
    :catch_1
    move-exception v7

    .line 145
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start qq install error ! e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_common_notification_know_tips:I

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hw_data_share_app_not_install:I

    invoke-static {v0, v1, v2}, Lo/fjm;->e(Landroid/content/Context;II)V

    .line 149
    :goto_1
    return-void
.end method

.method public d()V
    .locals 6

    .line 157
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter disconnectQQHealth():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_qq_health_disconnect_note_content:I

    .line 159
    invoke-virtual {v0, v1}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_qq_health_disconnect_button:I

    new-instance v2, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;-><init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)V

    .line 160
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$2;-><init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)V

    .line 185
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v4

    .line 191
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v5

    .line 192
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egy;->setCancelable(Z)V

    .line 193
    invoke-virtual {v5}, Lo/egy;->show()V

    .line 194
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 63
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 64
    iput-object p0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b:Landroid/content/Context;

    .line 65
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    invoke-static {}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->getInstance()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->f:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    .line 67
    new-instance v0, Lo/emz;

    invoke-direct {v0}, Lo/emz;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->i:Lo/emz;

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->e()V

    .line 69
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 233
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->i:Lo/emz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->i:Lo/emz;

    invoke-virtual {v0}, Lo/emz;->d()V

    .line 235
    :cond_0
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onDestroy():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 227
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onResume():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 229
    return-void
.end method

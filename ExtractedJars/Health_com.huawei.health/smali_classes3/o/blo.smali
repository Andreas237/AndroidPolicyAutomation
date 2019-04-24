.class public Lo/blo;
.super Lo/blh;
.source "SourceFile"


# instance fields
.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircle;>;"
        }
    .end annotation
.end field

.field private h:Landroid/widget/LinearLayout;

.field private k:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1, p2, p3}, Lo/blh;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    .line 76
    invoke-direct {p0}, Lo/blo;->e()V

    .line 77
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .line 344
    iget-object v0, p0, Lo/blo;->e:Landroid/app/Activity;

    const-string v1, ""

    invoke-static {v0, p1, v1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/circle/UserCircle;)I
    .locals 3

    .line 199
    const/4 v1, -0x1

    .line 200
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getCircleContent()Ljava/util/List;

    move-result-object v2

    .line 202
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 204
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/circle/UserCircleContent;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->getCircleType()I

    move-result v1

    .line 206
    :cond_0
    return v1
.end method

.method private b()V
    .locals 1

    .line 184
    iget v0, p0, Lo/blo;->k:I

    if-lez v0, :cond_0

    .line 187
    iget-object v0, p0, Lo/blo;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 189
    :cond_0
    return-void
.end method

.method private c(I)Lo/bli;
    .locals 2

    .line 161
    const/4 v1, 0x0

    .line 162
    const/4 v0, -0x1

    if-eq v0, p1, :cond_1

    .line 165
    if-nez p1, :cond_0

    .line 167
    new-instance v1, Lo/ble;

    iget-object v0, p0, Lo/blo;->e:Landroid/app/Activity;

    invoke-direct {v1, v0}, Lo/ble;-><init>(Landroid/content/Context;)V

    goto :goto_0

    .line 170
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 172
    new-instance v1, Lo/blc;

    iget-object v0, p0, Lo/blo;->e:Landroid/app/Activity;

    invoke-direct {v1, v0}, Lo/blc;-><init>(Landroid/content/Context;)V

    .line 175
    :cond_1
    :goto_0
    return-object v1
.end method

.method private c(Lcom/huawei/health/sns/model/circle/UserCircle;)V
    .locals 4

    .line 300
    iget-object v0, p0, Lo/blo;->e:Landroid/app/Activity;

    invoke-static {v0}, Lo/bls;->d(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 304
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "market://details?id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getAppPackage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 305
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v3, v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 306
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 307
    iget-object v0, p0, Lo/blo;->e:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 314
    goto :goto_0

    .line 309
    :catch_0
    move-exception v2

    .line 311
    const-string v0, "DetailDynamicView"

    const-string v1, "call ActivityNotFoundException HiSpace error:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://a.vmall.com/app/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/blo;->c(Ljava/lang/String;)V

    .line 314
    goto :goto_0

    .line 318
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://a.vmall.com/app/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/blo;->c(Ljava/lang/String;)V

    .line 320
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .line 329
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 330
    iget-object v0, p0, Lo/blo;->e:Landroid/app/Activity;

    const-string v1, "com.android.browser"

    invoke-static {v0, v2, v1}, Lo/bnx;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 332
    iget-object v0, p0, Lo/blo;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_browser:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 333
    const-string v0, "DetailDynamicView"

    const-string v1, "call system brower failed:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    :cond_0
    return-void
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 355
    move-object v4, p1

    .line 356
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 358
    const-string v0, "\\@origin_uid"

    .line 359
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v1

    invoke-virtual {v1}, Lo/aoq;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    .line 358
    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\@uid"

    iget-object v2, p0, Lo/blo;->c:Lcom/huawei/health/sns/model/user/User;

    .line 360
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    .line 359
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 362
    :cond_0
    return-object v4
.end method

.method private e()V
    .locals 2

    .line 87
    iget-object v0, p0, Lo/blo;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->dynamic_linearlayout:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/blo;->h:Landroid/widget/LinearLayout;

    .line 88
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/circle/UserCircle;)V
    .locals 6

    .line 262
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getRedirectUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 264
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getRedirectUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/blo;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 266
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getRedirectAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 268
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 269
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getRedirectAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 270
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getActionParam()Ljava/util/List;

    move-result-object v3

    .line 271
    if-eqz v3, :cond_1

    .line 273
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/circle/CircleActionParam;

    .line 275
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/circle/CircleActionParam;->getActionParamKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/circle/CircleActionParam;->getActionParamValue()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lo/blo;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 276
    goto :goto_0

    .line 278
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getAppPackage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 279
    iget-object v0, p0, Lo/blo;->e:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/util/IllegalFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 289
    :cond_2
    :goto_1
    goto :goto_2

    .line 282
    :catch_0
    move-exception v2

    .line 284
    const-string v0, "DetailDynamicView"

    const-string v1, "call IllegalFormatException error:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    goto :goto_2

    .line 286
    :catch_1
    move-exception v2

    .line 288
    const-string v0, "DetailDynamicView"

    const-string v1, "call ActivityNotFoundException error:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    :goto_2
    return-void
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    .line 38
    invoke-super {p0}, Lo/blh;->a()V

    return-void
.end method

.method public bridge synthetic a(I)V
    .locals 0

    .line 38
    invoke-super {p0, p1}, Lo/blh;->a(I)V

    return-void
.end method

.method a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lo/blo;->c:Lcom/huawei/health/sns/model/user/User;

    .line 83
    return-void
.end method

.method public bridge synthetic c()V
    .locals 0

    .line 38
    invoke-super {p0}, Lo/blh;->c()V

    return-void
.end method

.method public d()V
    .locals 6

    .line 108
    iget-object v0, p0, Lo/blo;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/blo;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 110
    :cond_0
    iget-object v0, p0, Lo/blo;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 111
    return-void

    .line 114
    :cond_1
    invoke-direct {p0}, Lo/blo;->b()V

    .line 116
    const/4 v0, 0x0

    iput v0, p0, Lo/blo;->k:I

    .line 119
    iget-object v0, p0, Lo/blo;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/circle/UserCircle;

    .line 122
    iget v0, p0, Lo/blo;->k:I

    const/16 v1, 0xa

    if-lt v0, v1, :cond_2

    .line 124
    goto :goto_1

    .line 127
    :cond_2
    invoke-direct {p0, v5}, Lo/blo;->b(Lcom/huawei/health/sns/model/circle/UserCircle;)I

    move-result v2

    .line 129
    invoke-direct {p0, v2}, Lo/blo;->c(I)Lo/bli;

    move-result-object v3

    .line 131
    if-eqz v3, :cond_3

    .line 133
    invoke-virtual {v3, p0}, Lo/bli;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    iget-object v0, p0, Lo/blo;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v3, v5, v0}, Lo/bli;->c(Lcom/huawei/health/sns/model/circle/UserCircle;Lcom/huawei/health/sns/model/user/User;)V

    .line 137
    iget-object v0, p0, Lo/blo;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 139
    iget v0, p0, Lo/blo;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/blo;->k:I

    .line 141
    :cond_3
    goto :goto_0

    .line 143
    :cond_4
    :goto_1
    iget v0, p0, Lo/blo;->k:I

    if-lez v0, :cond_5

    .line 145
    iget-object v0, p0, Lo/blo;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    .line 149
    :cond_5
    iget-object v0, p0, Lo/blo;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 151
    :goto_2
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircle;>;)V"
        }
    .end annotation

    .line 98
    iput-object p1, p0, Lo/blo;->f:Ljava/util/List;

    .line 99
    invoke-virtual {p0}, Lo/blo;->d()V

    .line 100
    return-void
.end method

.method public bridge synthetic e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 38
    invoke-super {p0, p1}, Lo/blh;->e(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 212
    const/4 v4, 0x0

    .line 213
    instance-of v0, p1, Lo/bli;

    if-eqz v0, :cond_0

    .line 215
    move-object v5, p1

    check-cast v5, Lo/bli;

    .line 216
    invoke-virtual {v5}, Lo/bli;->getUserCircle()Lcom/huawei/health/sns/model/circle/UserCircle;

    move-result-object v4

    .line 217
    goto :goto_0

    .line 218
    :cond_0
    instance-of v0, p1, Lo/blb;

    if-eqz v0, :cond_1

    .line 220
    move-object v5, p1

    check-cast v5, Lo/blb;

    .line 221
    invoke-virtual {v5}, Lo/blb;->getUserCircle()Lcom/huawei/health/sns/model/circle/UserCircle;

    move-result-object v4

    .line 223
    :cond_1
    :goto_0
    if-nez v4, :cond_2

    .line 225
    const-string v0, "DetailDynamicView"

    const-string v1, "onClick() userCircle is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    return-void

    .line 229
    :cond_2
    iget-object v0, p0, Lo/blo;->e:Landroid/app/Activity;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/circle/UserCircle;->getAppPackage()Ljava/lang/String;

    move-result-object v1

    .line 230
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/circle/UserCircle;->getAppVersion()J

    move-result-wide v2

    .line 229
    invoke-static {v0, v1, v2, v3}, Lo/bls;->e(Landroid/content/Context;Ljava/lang/String;J)I

    move-result v5

    .line 232
    if-eqz v5, :cond_3

    const/4 v0, 0x1

    if-ne v5, v0, :cond_4

    .line 234
    :cond_3
    invoke-direct {p0, v4}, Lo/blo;->c(Lcom/huawei/health/sns/model/circle/UserCircle;)V

    goto :goto_1

    .line 237
    :cond_4
    const/4 v0, 0x2

    if-ne v5, v0, :cond_7

    .line 240
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/circle/UserCircle;->isAppRedirect()Z

    move-result v0

    if-nez v0, :cond_5

    .line 242
    return-void

    .line 244
    :cond_5
    iget-object v0, p0, Lo/blo;->c:Lcom/huawei/health/sns/model/user/User;

    if-nez v0, :cond_6

    .line 246
    const-string v0, "DetailDynamicView"

    const-string v1, "onClick() user is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    return-void

    .line 249
    :cond_6
    invoke-direct {p0, v4}, Lo/blo;->e(Lcom/huawei/health/sns/model/circle/UserCircle;)V

    .line 251
    :cond_7
    :goto_1
    return-void
.end method

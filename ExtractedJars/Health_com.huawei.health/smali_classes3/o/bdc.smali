.class public Lo/bdc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Lcom/huawei/health/sns/model/chat/Assistant;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Landroid/app/Activity;

.field private f:Ljava/lang/String;

.field private h:Lo/boj$c;

.field private i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const-class v0, Lo/bdc;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bdc;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Lcom/huawei/health/sns/model/chat/Assistant;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 232
    new-instance v0, Lo/bdc$2;

    invoke-direct {v0, p0}, Lo/bdc$2;-><init>(Lo/bdc;)V

    iput-object v0, p0, Lo/bdc;->h:Lo/boj$c;

    .line 56
    iput-object p1, p0, Lo/bdc;->e:Landroid/app/Activity;

    .line 57
    iput-object p2, p0, Lo/bdc;->d:Ljava/lang/String;

    .line 58
    iput-object p3, p0, Lo/bdc;->b:Lcom/huawei/health/sns/model/chat/Assistant;

    .line 59
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 23
    sget-object v0, Lo/bdc;->a:Ljava/lang/String;

    return-object v0
.end method

.method private b()Ljava/lang/String;
    .locals 2

    .line 178
    const-string v1, ""

    .line 179
    iget-object v0, p0, Lo/bdc;->b:Lcom/huawei/health/sns/model/chat/Assistant;

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lo/bdc;->b:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getPackageName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 183
    :cond_0
    invoke-direct {p0}, Lo/bdc;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 185
    iget-object v1, p0, Lo/bdc;->c:Ljava/lang/String;

    .line 187
    :cond_1
    :goto_0
    return-object v1
.end method

.method private c()Ljava/lang/String;
    .locals 2

    .line 159
    const-string v1, ""

    .line 160
    iget-object v0, p0, Lo/bdc;->b:Lcom/huawei/health/sns/model/chat/Assistant;

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lo/bdc;->b:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getRequireVersion()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 164
    :cond_0
    invoke-direct {p0}, Lo/bdc;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 166
    iget-object v1, p0, Lo/bdc;->f:Ljava/lang/String;

    .line 168
    :cond_1
    :goto_0
    return-object v1
.end method

.method private d()Ljava/lang/String;
    .locals 2

    .line 197
    const-string v1, ""

    .line 198
    iget-object v0, p0, Lo/bdc;->b:Lcom/huawei/health/sns/model/chat/Assistant;

    if-eqz v0, :cond_0

    .line 200
    iget-object v0, p0, Lo/bdc;->b:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getAppId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 202
    :cond_0
    invoke-direct {p0}, Lo/bdc;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 204
    iget-object v1, p0, Lo/bdc;->i:Ljava/lang/String;

    .line 206
    :cond_1
    :goto_0
    return-object v1
.end method

.method private f()V
    .locals 6

    .line 271
    :try_start_0
    iget-object v0, p0, Lo/bdc;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/bmg;->d(Ljava/lang/String;)Z

    move-result v2

    .line 272
    const-string v3, ""

    .line 273
    if-eqz v2, :cond_0

    .line 275
    iget-object v0, p0, Lo/bdc;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/bmg;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 277
    :cond_0
    invoke-direct {p0}, Lo/bdc;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 279
    invoke-direct {p0}, Lo/bdc;->b()Ljava/lang/String;

    move-result-object v3

    .line 281
    :cond_1
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 283
    sget-object v0, Lo/bdc;->a:Ljava/lang/String;

    const-string v1, "openAppDetailHiSpacePage packageName is null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 287
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "market://details?id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 288
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v5, v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 289
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 290
    iget-object v0, p0, Lo/bdc;->e:Landroid/app/Activity;

    invoke-virtual {v0, v5}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 297
    :goto_1
    goto :goto_2

    .line 293
    :catch_0
    move-exception v2

    .line 295
    sget-object v0, Lo/bdc;->a:Ljava/lang/String;

    const-string v1, "open hiSpace error, try to open web page"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    invoke-direct {p0}, Lo/bdc;->k()V

    .line 298
    :goto_2
    return-void
.end method

.method private h()Z
    .locals 1

    .line 216
    iget-object v0, p0, Lo/bdc;->b:Lcom/huawei/health/sns/model/chat/Assistant;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lo/bdc;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private i()Z
    .locals 1

    .line 226
    iget-object v0, p0, Lo/bdc;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/bdc;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/bdc;->i:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private k()V
    .locals 6

    .line 306
    iget-object v0, p0, Lo/bdc;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/bmg;->d(Ljava/lang/String;)Z

    move-result v2

    .line 307
    const-string v3, ""

    .line 308
    if-eqz v2, :cond_0

    .line 310
    iget-object v0, p0, Lo/bdc;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/bmg;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 312
    :cond_0
    invoke-direct {p0}, Lo/bdc;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 314
    invoke-direct {p0}, Lo/bdc;->d()Ljava/lang/String;

    move-result-object v3

    .line 316
    :cond_1
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 318
    sget-object v0, Lo/bdc;->a:Ljava/lang/String;

    const-string v1, "openAppDetailHiSpacePage appId is null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 322
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://a.vmall.com/app/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 324
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 325
    iget-object v0, p0, Lo/bdc;->e:Landroid/app/Activity;

    const-string v1, "com.android.browser"

    invoke-static {v0, v5, v1}, Lo/bnx;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    .line 327
    :goto_1
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 14

    .line 83
    const/4 v6, 0x1

    .line 84
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    move-object p1, v0

    .line 85
    const/4 v7, 0x0

    .line 87
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    .line 89
    const-string v0, "http"

    invoke-virtual {v8, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "https"

    invoke-virtual {v8, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 92
    invoke-static {p1}, Lo/bmg;->d(Ljava/lang/String;)Z

    move-result v9

    .line 94
    if-nez v9, :cond_1

    invoke-direct {p0}, Lo/bdc;->h()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 96
    :cond_1
    if-eqz v9, :cond_2

    invoke-static {p1}, Lo/bmg;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Lo/bdc;->b()Ljava/lang/String;

    move-result-object v10

    .line 97
    :goto_1
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 99
    sget-object v0, Lo/bdc;->a:Ljava/lang/String;

    const-string v1, "checkClickLink packageName is empty, try to direct open app"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    new-instance v7, Lo/bcu;

    iget-object v0, p0, Lo/bdc;->e:Landroid/app/Activity;

    invoke-direct {v7, v0}, Lo/bcu;-><init>(Landroid/app/Activity;)V

    .line 102
    invoke-virtual {v7, p1}, Lo/bcu;->c(Ljava/lang/String;)Z

    move-result v6

    goto/16 :goto_4

    .line 107
    :cond_3
    iget-object v0, p0, Lo/bdc;->e:Landroid/app/Activity;

    invoke-static {v0, v10}, Lo/bnx;->b(Landroid/content/ContextWrapper;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 110
    if-eqz v9, :cond_4

    invoke-static {p1}, Lo/bmg;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bmg;->c(Ljava/lang/String;)I

    move-result v11

    goto :goto_2

    :cond_4
    invoke-direct {p0}, Lo/bdc;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bmg;->c(Ljava/lang/String;)I

    move-result v11

    .line 111
    :goto_2
    iget-object v0, p0, Lo/bdc;->e:Landroid/app/Activity;

    invoke-static {v0, v10}, Lo/bnx;->e(Landroid/content/ContextWrapper;Ljava/lang/String;)I

    move-result v12

    .line 112
    if-le v11, v12, :cond_5

    .line 114
    iget-object v0, p0, Lo/bdc;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_update_app_dialog_tip:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/bdc;->e:Landroid/app/Activity;

    invoke-static {v3, v10}, Lo/bnx;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 115
    iget-object v0, p0, Lo/bdc;->e:Landroid/app/Activity;

    const-string v1, ""

    move-object v2, v13

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_update_app_action:I

    iget-object v5, p0, Lo/bdc;->h:Lo/boj$c;

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 117
    goto :goto_3

    .line 121
    :cond_5
    new-instance v7, Lo/bcu;

    iget-object v0, p0, Lo/bdc;->e:Landroid/app/Activity;

    invoke-direct {v7, v0}, Lo/bcu;-><init>(Landroid/app/Activity;)V

    .line 123
    invoke-virtual {v7, v10}, Lo/bcu;->b(Ljava/lang/String;)V

    .line 124
    invoke-virtual {v7, p1}, Lo/bcu;->c(Ljava/lang/String;)Z

    move-result v6

    .line 126
    :goto_3
    goto :goto_4

    .line 129
    :cond_6
    iget-object v0, p0, Lo/bdc;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_install_url_app_dialog_tip:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 130
    iget-object v0, p0, Lo/bdc;->e:Landroid/app/Activity;

    const-string v1, ""

    move-object v2, v11

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_install_app_action:I

    iget-object v5, p0, Lo/bdc;->h:Lo/boj$c;

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 134
    :goto_4
    goto :goto_5

    .line 138
    :cond_7
    new-instance v7, Lo/bcu;

    iget-object v0, p0, Lo/bdc;->e:Landroid/app/Activity;

    invoke-direct {v7, v0}, Lo/bcu;-><init>(Landroid/app/Activity;)V

    .line 139
    invoke-virtual {v7, p1}, Lo/bcu;->c(Ljava/lang/String;)Z

    move-result v6

    .line 141
    :goto_5
    goto :goto_6

    .line 145
    :cond_8
    new-instance v7, Lo/bcu;

    iget-object v0, p0, Lo/bdc;->e:Landroid/app/Activity;

    invoke-direct {v7, v0}, Lo/bcu;-><init>(Landroid/app/Activity;)V

    .line 146
    invoke-virtual {v7, p1}, Lo/bcu;->c(Ljava/lang/String;)Z

    move-result v6

    .line 149
    :goto_6
    return v6
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lo/bdc;->c:Ljava/lang/String;

    .line 71
    iput-object p2, p0, Lo/bdc;->f:Ljava/lang/String;

    .line 72
    iput-object p3, p0, Lo/bdc;->i:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public e()V
    .locals 2

    .line 253
    iget-object v0, p0, Lo/bdc;->e:Landroid/app/Activity;

    const-string v1, "com.huawei.appmarket"

    invoke-static {v0, v1}, Lo/bnx;->b(Landroid/content/ContextWrapper;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    invoke-direct {p0}, Lo/bdc;->f()V

    goto :goto_0

    .line 259
    :cond_0
    invoke-direct {p0}, Lo/bdc;->k()V

    .line 261
    :goto_0
    return-void
.end method

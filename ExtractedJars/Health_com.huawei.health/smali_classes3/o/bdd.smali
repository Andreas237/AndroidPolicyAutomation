.class Lo/bdd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/app/Activity;

.field private c:Lcom/huawei/health/sns/model/chat/Assistant;

.field private d:Z

.field private e:J

.field private i:Lo/boj$c;


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const-string v0, ""

    iput-object v0, p0, Lo/bdd;->a:Ljava/lang/String;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdd;->c:Lcom/huawei/health/sns/model/chat/Assistant;

    .line 191
    new-instance v0, Lo/bdd$2;

    invoke-direct {v0, p0}, Lo/bdd$2;-><init>(Lo/bdd;)V

    iput-object v0, p0, Lo/bdd;->i:Lo/boj$c;

    .line 66
    iput-object p1, p0, Lo/bdd;->b:Landroid/app/Activity;

    .line 67
    return-void
.end method

.method private a(Z)V
    .locals 2

    .line 181
    if-nez p1, :cond_0

    .line 183
    iget-object v0, p0, Lo/bdd;->b:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_start_app_failed:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 185
    :cond_0
    return-void
.end method

.method private d()V
    .locals 7

    .line 228
    iget-object v0, p0, Lo/bdd;->c:Lcom/huawei/health/sns/model/chat/Assistant;

    if-nez v0, :cond_0

    .line 230
    const-string v0, "AssistantLinkClickChecker"

    const-string v1, "openAppDetailHiSpacePage assistant is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    return-void

    .line 236
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/bdd;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/bmg;->d(Ljava/lang/String;)Z

    move-result v2

    .line 237
    if-eqz v2, :cond_1

    iget-object v0, p0, Lo/bdd;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/bmg;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo/bdd;->c:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 238
    :goto_0
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

    .line 239
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v5, v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 240
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 241
    iget-object v0, p0, Lo/bdd;->b:Landroid/app/Activity;

    invoke-virtual {v0, v5}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 250
    const-string v0, ""

    iput-object v0, p0, Lo/bdd;->a:Ljava/lang/String;

    .line 251
    goto :goto_1

    .line 243
    :catch_0
    move-exception v2

    .line 245
    const-string v0, "AssistantLinkClickChecker"

    const-string v1, "open hispace error, try to open web page"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    invoke-direct {p0}, Lo/bdd;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 250
    const-string v0, ""

    iput-object v0, p0, Lo/bdd;->a:Ljava/lang/String;

    .line 251
    goto :goto_1

    .line 250
    :catchall_0
    move-exception v6

    const-string v0, ""

    iput-object v0, p0, Lo/bdd;->a:Ljava/lang/String;

    .line 251
    throw v6

    .line 252
    :goto_1
    return-void
.end method

.method private e()V
    .locals 6

    .line 260
    iget-object v0, p0, Lo/bdd;->c:Lcom/huawei/health/sns/model/chat/Assistant;

    if-nez v0, :cond_0

    .line 262
    const-string v0, "AssistantLinkClickChecker"

    const-string v1, "openAppDetailWebPage assistant is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    return-void

    .line 266
    :cond_0
    iget-object v0, p0, Lo/bdd;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/bmg;->d(Ljava/lang/String;)Z

    move-result v2

    .line 267
    if-eqz v2, :cond_1

    iget-object v0, p0, Lo/bdd;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/bmg;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo/bdd;->c:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getAppId()Ljava/lang/String;

    move-result-object v3

    .line 268
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://a.vmall.com/app/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 270
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 271
    iget-object v0, p0, Lo/bdd;->b:Landroid/app/Activity;

    const-string v1, "com.android.browser"

    invoke-static {v0, v5, v1}, Lo/bnx;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    .line 272
    const-string v0, ""

    iput-object v0, p0, Lo/bdd;->a:Ljava/lang/String;

    .line 273
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)V
    .locals 13

    .line 106
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    const-string v0, "AssistantLinkClickChecker"

    const-string v1, "checkClickLink url is empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    return-void

    .line 111
    :cond_0
    iget-object v0, p0, Lo/bdd;->c:Lcom/huawei/health/sns/model/chat/Assistant;

    if-nez v0, :cond_1

    .line 113
    const-string v0, "AssistantLinkClickChecker"

    const-string v1, "assistant is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    return-void

    .line 117
    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    .line 119
    const-string v0, "http"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "https"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 122
    invoke-static {p1}, Lo/bmg;->d(Ljava/lang/String;)Z

    move-result v7

    .line 123
    if-eqz v7, :cond_2

    invoke-static {p1}, Lo/bmg;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lo/bdd;->c:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getPackageName()Ljava/lang/String;

    move-result-object v8

    .line 124
    :goto_0
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 126
    const-string v0, "AssistantLinkClickChecker"

    const-string v1, "checkClickLink packageName is empty, try to direct open app"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    new-instance v0, Lo/bcu;

    iget-object v1, p0, Lo/bdd;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/bcu;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, p1}, Lo/bcu;->c(Ljava/lang/String;)Z

    move-result v9

    .line 129
    invoke-direct {p0, v9}, Lo/bdd;->a(Z)V

    .line 130
    return-void

    .line 133
    :cond_3
    iget-object v0, p0, Lo/bdd;->b:Landroid/app/Activity;

    invoke-static {v0, v8}, Lo/bnx;->b(Landroid/content/ContextWrapper;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 136
    if-eqz v7, :cond_4

    invoke-static {p1}, Lo/bmg;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bmg;->c(Ljava/lang/String;)I

    move-result v9

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lo/bdd;->c:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getRequireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bmg;->c(Ljava/lang/String;)I

    move-result v9

    .line 137
    :goto_1
    iget-object v0, p0, Lo/bdd;->b:Landroid/app/Activity;

    invoke-static {v0, v8}, Lo/bnx;->e(Landroid/content/ContextWrapper;Ljava/lang/String;)I

    move-result v10

    .line 138
    if-le v9, v10, :cond_6

    .line 141
    iput-object p1, p0, Lo/bdd;->a:Ljava/lang/String;

    .line 142
    iget-object v0, p0, Lo/bdd;->b:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_update_app_dialog_tip:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    if-eqz v7, :cond_5

    iget-object v3, p0, Lo/bdd;->b:Landroid/app/Activity;

    .line 143
    invoke-static {v3, v8}, Lo/bnx;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_5
    iget-object v3, p0, Lo/bdd;->c:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/Assistant;->getName()Ljava/lang/String;

    move-result-object v3

    :goto_2
    invoke-static {v3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 142
    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 144
    iget-object v0, p0, Lo/bdd;->b:Landroid/app/Activity;

    const-string v1, ""

    move-object v2, v11

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_update_app_action:I

    iget-object v5, p0, Lo/bdd;->i:Lo/boj$c;

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 146
    goto :goto_3

    .line 150
    :cond_6
    new-instance v11, Lo/bcu;

    iget-object v0, p0, Lo/bdd;->b:Landroid/app/Activity;

    invoke-direct {v11, v0}, Lo/bcu;-><init>(Landroid/app/Activity;)V

    .line 152
    invoke-virtual {v11, v8}, Lo/bcu;->b(Ljava/lang/String;)V

    .line 153
    invoke-virtual {v11, p1}, Lo/bcu;->c(Ljava/lang/String;)Z

    move-result v12

    .line 154
    invoke-direct {p0, v12}, Lo/bdd;->a(Z)V

    .line 156
    :goto_3
    goto :goto_5

    .line 160
    :cond_7
    iput-object p1, p0, Lo/bdd;->a:Ljava/lang/String;

    .line 161
    if-eqz v7, :cond_8

    iget-object v0, p0, Lo/bdd;->b:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_install_url_app_dialog_tip:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_4

    :cond_8
    iget-object v0, p0, Lo/bdd;->b:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_install_app_dialog_tip:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/bdd;->c:Lcom/huawei/health/sns/model/chat/Assistant;

    .line 162
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/Assistant;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 163
    :goto_4
    iget-object v0, p0, Lo/bdd;->b:Landroid/app/Activity;

    const-string v1, ""

    move-object v2, v9

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_install_app_action:I

    iget-object v5, p0, Lo/bdd;->i:Lo/boj$c;

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 166
    :goto_5
    goto :goto_6

    .line 170
    :cond_9
    iget-object v0, p0, Lo/bdd;->b:Landroid/app/Activity;

    iget-wide v1, p0, Lo/bdd;->e:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Lo/bdd;->d:Z

    invoke-static {v0, p1, v1, v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->d(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 172
    :goto_6
    return-void
.end method

.method public b()V
    .locals 2

    .line 212
    iget-object v0, p0, Lo/bdd;->b:Landroid/app/Activity;

    const-string v1, "com.huawei.appmarket"

    invoke-static {v0, v1}, Lo/bnx;->b(Landroid/content/ContextWrapper;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 214
    invoke-direct {p0}, Lo/bdd;->d()V

    goto :goto_0

    .line 218
    :cond_0
    invoke-direct {p0}, Lo/bdd;->e()V

    .line 220
    :goto_0
    return-void
.end method

.method e(J)V
    .locals 0

    .line 76
    iput-wide p1, p0, Lo/bdd;->e:J

    .line 77
    return-void
.end method

.method e(Lcom/huawei/health/sns/model/chat/Assistant;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lo/bdd;->c:Lcom/huawei/health/sns/model/chat/Assistant;

    .line 87
    return-void
.end method

.method e(Z)V
    .locals 0

    .line 96
    iput-boolean p1, p0, Lo/bdd;->d:Z

    .line 97
    return-void
.end method

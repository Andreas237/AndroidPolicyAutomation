.class public Lcom/huawei/hms/support/api/push/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/huawei/hms/support/api/push/a/b/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 28
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "phone"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "url"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "email"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "app"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "cosa"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "rp"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hms/support/api/push/a/a/a;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    .line 37
    iput-object p2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    .line 38
    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    .line 41
    const/4 v1, 0x0

    :goto_0
    sget-object v0, Lcom/huawei/hms/support/api/push/a/a/a;->a:[Ljava/lang/String;

    array-length v0, v0

    if-ge v1, v0, :cond_1

    .line 42
    sget-object v0, Lcom/huawei/hms/support/api/push/a/a/a;->a:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    const/4 v0, 0x1

    return v0

    .line 41
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 46
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 146
    const/16 v0, 0x3f

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    .line 147
    const/4 v0, -0x1

    if-ne v3, v0, :cond_0

    .line 148
    return-object p1

    .line 151
    :cond_0
    add-int/lit8 v0, v3, 0x1

    :try_start_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 154
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 155
    move-object v6, v4

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_2

    aget-object v9, v6, v8

    .line 156
    const-string v0, "h_w_hiapp_referrer"

    invoke-virtual {v9, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "h_w_gp_referrer"

    .line 157
    invoke-virtual {v9, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 158
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 162
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    .line 164
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_4

    .line 165
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v8, v0, :cond_3

    .line 167
    const-string v0, "&"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 171
    :cond_4
    const-string v8, ""

    .line 172
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 174
    const/4 v0, 0x0

    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    .line 177
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v1, v3, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 179
    :goto_2
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "after delete referrer, the new IntentUri is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 180
    return-object v8

    .line 181
    :catch_0
    move-exception v3

    .line 182
    const-string v0, "PushSelfShowLog"

    const-string v1, "self show receiver exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    return-object p1

    .line 184
    :catch_1
    move-exception v3

    .line 185
    const-string v0, "PushSelfShowLog"

    const-string v1, "delete referrer exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    return-object p1
.end method

.method private b()V
    .locals 4

    .line 78
    const-string v0, "PushSelfShowLog"

    const-string v1, "enter launchCall"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 81
    const-string v0, "android.intent.action.DIAL"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tel:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/b/a;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v0

    .line 82
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 83
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    goto :goto_0

    .line 84
    :catch_0
    move-exception v3

    .line 85
    const-string v0, "PushSelfShowLog"

    invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    :goto_0
    return-void
.end method

.method private c()V
    .locals 5

    .line 95
    const-string v0, "PushSelfShowLog"

    const-string v1, "enter launchMail"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/b/a;->p()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 98
    return-void

    .line 100
    :cond_0
    :try_start_1
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 101
    const-string v0, "android.intent.action.SENDTO"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mailto"

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    .line 102
    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/b/a;->p()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "android.intent.extra.SUBJECT"

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    .line 103
    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/b/a;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "android.intent.extra.TEXT"

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    .line 104
    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/b/a;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.android.email"

    .line 105
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 107
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 110
    goto :goto_0

    .line 108
    :catch_0
    move-exception v4

    .line 109
    const-string v0, "PushSelfShowLog"

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 111
    :goto_0
    return-void
.end method

.method private d()V
    .locals 4

    .line 121
    const-string v0, "PushSelfShowLog"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter launchApp, appPackageName ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",and msg.intentUri is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    .line 122
    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/b/a;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 121
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/api/push/a/d/a;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    invoke-direct {p0}, Lcom/huawei/hms/support/api/push/a/a/a;->g()V

    goto :goto_0

    .line 128
    :cond_0
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter launch app, appPackageName ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",and msg.intentUri is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    .line 129
    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/b/a;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 128
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    invoke-direct {p0}, Lcom/huawei/hms/support/api/push/a/a/a;->e()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    :goto_0
    goto :goto_1

    .line 134
    :catch_0
    move-exception v3

    .line 135
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "launchApp error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    :goto_1
    return-void
.end method

.method private e()V
    .locals 8

    .line 193
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/b/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 196
    const-string v0, "&referrer="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/hms/support/api/push/a/a/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "market://details?id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 201
    new-instance v6, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 202
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 203
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 205
    new-instance v7, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 206
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 207
    const-string v0, "com.android.vending"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 209
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    const-string v1, "com.android.vending"

    invoke-static {v0, v1, v7}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 210
    const/high16 v0, 0x18000000

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 211
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "open google play store\'s app detail, IntentUrl is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Landroid/content/Intent;->toURI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 213
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    const-string v1, "com.huawei.appmarket"

    invoke-static {v0, v1, v6}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 214
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    const-string v1, "7"

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    const/4 v3, -0x1

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/support/api/push/a/b/a;I)V

    .line 216
    const/high16 v0, 0x18000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 217
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "open HiApp\'s app detail, IntentUrl is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Landroid/content/Intent;->toURI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 220
    :cond_2
    const-string v0, "PushSelfShowLog"

    const-string v1, "open app detail by browser."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    invoke-direct {p0}, Lcom/huawei/hms/support/api/push/a/a/a;->f()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 225
    :goto_0
    goto :goto_1

    .line 223
    :catch_0
    move-exception v4

    .line 224
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "open market app detail failed,exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    :goto_1
    return-void
.end method

.method private f()V
    .locals 8

    .line 234
    const-string v3, ""

    .line 235
    const-string v4, ""

    .line 237
    const/4 v5, 0x0

    .line 240
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/b/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v5

    .line 242
    const-string v0, "h_w_hiapp_referrer"

    :try_start_1
    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    move-object v3, v0

    .line 245
    goto :goto_0

    .line 243
    :catch_0
    move-exception v6

    .line 244
    const-string v0, "PushSelfShowLog"

    const-string v1, "parse h_w_hiapp_referrer faied"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 248
    :goto_0
    const-string v0, "h_w_gp_referrer"

    :try_start_3
    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    move-result-object v0

    move-object v4, v0

    .line 251
    goto :goto_1

    .line 249
    :catch_1
    move-exception v6

    .line 250
    const-string v0, "PushSelfShowLog"

    const-string v1, "parse h_w_hiapp_referrer faied"

    :try_start_4
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 256
    :goto_1
    goto :goto_2

    .line 252
    :catch_2
    move-exception v6

    .line 253
    const-string v0, "PushSelfShowLog"

    const-string v1, "parse intentUri error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    goto :goto_2

    .line 254
    :catch_3
    move-exception v6

    .line 255
    const-string v0, "PushSelfShowLog"

    const-string v1, "parse intentUri error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    :goto_2
    invoke-static {}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/support/api/push/b/a/a/a;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 260
    :cond_0
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not EMUI system or not in China, open google play web, referrer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    invoke-static {v4}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 262
    invoke-static {v7}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 264
    move-object v6, v7

    goto :goto_3

    .line 266
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://play.google.com/store/apps/details?id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 268
    :goto_3
    goto :goto_4

    .line 269
    :cond_2
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "It is China device, open Huawei market web, referrer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    invoke-static {v3}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 271
    invoke-static {v7}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 273
    move-object v6, v7

    goto :goto_4

    .line 275
    :cond_3
    const-string v6, "http://a.vmall.com/"

    .line 279
    :goto_4
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "open the URL by browser: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    invoke-static {v0, v6}, Lcom/huawei/hms/support/api/push/a/d/a;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 282
    return-void
.end method

.method private g()V
    .locals 6

    .line 290
    const-string v0, "PushSelfShowLog"

    const-string v1, "run into launchCosaApp "

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    const-string v0, "PushSelfShowLog"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter launchExistApp cosa, appPackageName ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",and msg.intentUri is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    .line 293
    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/b/a;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 292
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/api/push/a/d/a;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    .line 296
    const/4 v4, 0x0

    .line 297
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/b/a;->g()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v0

    if-eqz v0, :cond_1

    .line 300
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/b/a;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v5

    .line 302
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Intent.parseUri(msg.intentUri, 0),"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Landroid/content/Intent;->toURI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-eqz v0, :cond_0

    .line 305
    move-object v3, v5

    .line 306
    const/4 v4, 0x1

    .line 313
    :cond_0
    goto :goto_0

    .line 309
    :catch_0
    move-exception v5

    .line 310
    const-string v0, "PushSelfShowLog"

    const-string v1, "intentUri error"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    goto :goto_0

    .line 311
    :catch_1
    move-exception v5

    .line 312
    const-string v0, "PushSelfShowLog"

    const-string v1, "intentUri error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    goto :goto_0

    .line 317
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/b/a;->t()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 318
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/b/a;->t()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 319
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 320
    move-object v3, v5

    .line 323
    :cond_2
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 326
    :goto_0
    if-nez v3, :cond_3

    .line 327
    const-string v0, "PushSelfShowLog"

    const-string v1, "launchCosaApp,intent == null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 328
    return-void

    .line 331
    :cond_3
    :try_start_3
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    invoke-static {v0, v3}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 332
    const-string v0, "PushSelfShowLog"

    const-string v1, "no permission to start Activity"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 333
    return-void

    .line 335
    :cond_4
    if-eqz v4, :cond_5

    .line 336
    const/high16 v0, 0x10000000

    :try_start_4
    invoke-virtual {v3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_1

    .line 338
    :cond_5
    const/high16 v0, 0x30020000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 341
    :goto_1
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Landroid/content/Intent;->toURI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 348
    goto :goto_2

    .line 344
    :catch_2
    move-exception v3

    .line 345
    const-string v0, "PushSelfShowLog"

    const-string v1, "launch Cosa App exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    goto :goto_2

    .line 346
    :catch_3
    move-exception v3

    .line 347
    const-string v0, "PushSelfShowLog"

    const-string v1, "launch Cosa App exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    :goto_2
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 50
    const-string v0, "PushSelfShowLog"

    const-string v1, "enter launchNotify()"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 52
    :cond_0
    const-string v0, "PushSelfShowLog"

    const-string v1, "launchNotify  context or msg is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    return-void

    .line 55
    :cond_1
    const-string v0, "app"

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 56
    invoke-direct {p0}, Lcom/huawei/hms/support/api/push/a/a/a;->d()V

    goto/16 :goto_0

    .line 57
    :cond_2
    const-string v0, "cosa"

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 58
    invoke-direct {p0}, Lcom/huawei/hms/support/api/push/a/a/a;->g()V

    goto/16 :goto_0

    .line 59
    :cond_3
    const-string v0, "email"

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 60
    invoke-direct {p0}, Lcom/huawei/hms/support/api/push/a/a/a;->c()V

    goto/16 :goto_0

    .line 61
    :cond_4
    const-string v0, "phone"

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 62
    invoke-direct {p0}, Lcom/huawei/hms/support/api/push/a/a/a;->b()V

    goto/16 :goto_0

    .line 63
    :cond_5
    const-string v0, "rp"

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 64
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not support rich message."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 65
    :cond_6
    const-string v0, "url"

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 66
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not support URL."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 68
    :cond_7
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/a/a;->c:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not exist in hShowType"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    :goto_0
    return-void
.end method

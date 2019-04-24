.class public abstract Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:Landroid/content/Context;


# direct methods
.method protected constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/a;->a:Ljava/lang/String;

    .line 39
    iput-object p2, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/a;->b:Landroid/content/Context;

    .line 40
    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;
    .locals 9

    .line 49
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/a;->b:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/a;->a(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v6

    .line 51
    new-instance v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/a;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/a;->a:Ljava/lang/String;

    move-object v3, v6

    invoke-virtual {p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/a;->b()Z

    move-result v5

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v5}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;ZZ)V

    move-object v7, v0

    .line 53
    :try_start_0
    invoke-virtual {v7}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->a()Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;

    move-result-object v8

    .line 54
    if-eqz v8, :cond_0

    invoke-virtual {v8}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 55
    invoke-virtual {v8}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/a;->a(Ljava/lang/String;)Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v0

    return-object v0

    .line 65
    :cond_0
    goto :goto_0

    .line 57
    :catch_0
    move-exception v8

    .line 58
    const-string v0, "AbsHttpProcessor"

    invoke-static {v8, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 65
    goto :goto_0

    .line 59
    :catch_1
    move-exception v8

    .line 60
    const-string v0, "AbsHttpProcessor"

    invoke-static {v8, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 65
    goto :goto_0

    .line 61
    :catch_2
    move-exception v8

    .line 62
    const-string v0, "AbsHttpProcessor"

    invoke-static {v8, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 65
    goto :goto_0

    .line 63
    :catch_3
    move-exception v8

    .line 64
    const-string v0, "AbsHttpProcessor"

    invoke-static {v8, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 66
    :goto_0
    new-instance v8, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;

    invoke-direct {v8}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;-><init>()V

    .line 67
    const-string v0, "-1"

    invoke-virtual {v8, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->a(Ljava/lang/String;)V

    .line 68
    const-string v0, "unknown error!"

    invoke-virtual {v8, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->b(Ljava/lang/String;)V

    .line 69
    return-object v8
.end method

.method protected abstract a(Ljava/lang/String;)Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;
.end method

.method protected a(Landroid/content/Context;)Ljava/lang/Object;
    .locals 1

    .line 79
    const/4 v0, 0x0

    return-object v0
.end method

.method protected abstract b()Z
.end method

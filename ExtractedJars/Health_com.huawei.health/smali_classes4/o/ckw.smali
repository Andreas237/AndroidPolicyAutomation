.class public Lo/ckw;
.super Ljava/lang/Object;


# instance fields
.field private a:Lo/ckr;

.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ckw;->c:Landroid/content/Context;

    invoke-static {}, Lo/ckz;->a()Lo/ckr;

    move-result-object v0

    iput-object v0, p0, Lo/ckw;->a:Lo/ckr;

    return-void
.end method


# virtual methods
.method public d()V
    .locals 9

    invoke-static {}, Lo/ckt;->b()Lo/cky;

    move-result-object v0

    invoke-interface {v0}, Lo/cky;->d()Lo/cit;

    move-result-object v4

    invoke-virtual {v4}, Lo/cit;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/cju;->b()Ljava/lang/String;

    move-result-object v5

    const-string v0, "HiAnalytics"

    const-string v1, "cust version: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    invoke-static {v0, v1, v2}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lo/ckw;->a:Lo/ckr;

    invoke-interface {v0, v5}, Lo/ckr;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v0, "preins"

    invoke-virtual {v7, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v7}, Lo/cit;->b(Ljava/util/HashMap;)V

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/ckw;->c:Landroid/content/Context;

    const-string v1, "global_v2"

    invoke-static {v0, v1}, Lo/cjs;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v8

    const-string v0, "upload_url"

    invoke-static {v8, v0, v6}, Lo/cjs;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/cit;->a(Z)V

    invoke-static {}, Lo/cku;->c()V

    :cond_0
    return-void
.end method

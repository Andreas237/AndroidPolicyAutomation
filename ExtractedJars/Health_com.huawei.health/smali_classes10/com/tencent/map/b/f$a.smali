.class final Lcom/tencent/map/b/f$a;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/map/b/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/tencent/map/b/e$b;

.field private b:Lcom/tencent/map/b/d$b;

.field private c:Lcom/tencent/map/b/g$b;

.field private synthetic d:Lcom/tencent/map/b/f;


# direct methods
.method constructor <init>(Lcom/tencent/map/b/f;Lcom/tencent/map/b/e$b;Lcom/tencent/map/b/d$b;Lcom/tencent/map/b/g$b;)V
    .locals 1

    iput-object p1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f$a;->a:Lcom/tencent/map/b/e$b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f$a;->b:Lcom/tencent/map/b/d$b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f$a;->c:Lcom/tencent/map/b/g$b;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/tencent/map/b/e$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/map/b/e$b;

    iput-object v0, p0, Lcom/tencent/map/b/f$a;->a:Lcom/tencent/map/b/e$b;

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lcom/tencent/map/b/d$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/map/b/d$b;

    iput-object v0, p0, Lcom/tencent/map/b/f$a;->b:Lcom/tencent/map/b/d$b;

    :cond_1
    if-eqz p4, :cond_2

    invoke-virtual {p4}, Lcom/tencent/map/b/g$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/map/b/g$b;

    iput-object v0, p0, Lcom/tencent/map/b/f$a;->c:Lcom/tencent/map/b/g$b;

    :cond_2
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    invoke-static {}, Lcom/tencent/map/b/f;->c()Z

    move-result v0

    if-nez v0, :cond_d

    :try_start_0
    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v0}, Lcom/tencent/map/b/f;->k(Lcom/tencent/map/b/f;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/telephony/TelephonyManager;

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-virtual {v5}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->c(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-virtual {v5}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->d(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-virtual {v5}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->e(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "[0-9a-zA-Z+-]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v6

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->l(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->l(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->c(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v0}, Lcom/tencent/map/b/f;->l(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->l(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, ""

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->l(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->c(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->c(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    :goto_2
    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->m(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    const-string v1, ""

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->m(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->d(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v0}, Lcom/tencent/map/b/f;->m(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->m(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    const-string v1, ""

    goto :goto_4

    :cond_4
    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->m(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    :goto_4
    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->d(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_5

    :cond_5
    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->d(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    :goto_5
    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->n(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    const-string v1, ""

    goto :goto_6

    :cond_6
    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->n(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    :goto_6
    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->e(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v0}, Lcom/tencent/map/b/f;->n(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->n(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    const-string v1, ""

    goto :goto_7

    :cond_7
    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->n(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    :goto_7
    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->e(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_8

    :cond_8
    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->e(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    nop

    :catch_0
    :goto_8
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/tencent/map/b/f;->a(Z)Z

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->l(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    const-string v1, ""

    goto :goto_9

    :cond_9
    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->l(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    :goto_9
    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->c(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->m(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    const-string v1, ""

    goto :goto_a

    :cond_a
    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->m(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    :goto_a
    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->d(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->n(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_b

    const-string v1, ""

    goto :goto_b

    :cond_b
    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->n(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    :goto_b
    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->e(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->l(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_c

    const-string v1, "0123456789ABCDEF"

    goto :goto_c

    :cond_c
    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->l(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    :goto_c
    invoke-static {v1}, Lcom/tencent/map/b/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/map/b/f;->f(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;

    :cond_d
    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v0}, Lcom/tencent/map/b/f;->o(Lcom/tencent/map/b/f;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_e

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->c:Lcom/tencent/map/b/g$b;

    invoke-static {v0}, Lcom/tencent/map/b/i;->a(Lcom/tencent/map/b/g$b;)Ljava/lang/String;

    move-result-object v8

    goto :goto_d

    :cond_e
    const-string v8, "[]"

    :goto_d
    iget-object v0, p0, Lcom/tencent/map/b/f$a;->b:Lcom/tencent/map/b/d$b;

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->p(Lcom/tencent/map/b/f;)Lcom/tencent/map/b/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/map/b/d;->b()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/map/b/i;->a(Lcom/tencent/map/b/d$b;Ljava/util/List;)Ljava/lang/String;

    move-result-object v7

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v0}, Lcom/tencent/map/b/f;->l(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->m(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v2}, Lcom/tencent/map/b/f;->n(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v3}, Lcom/tencent/map/b/f;->q(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v4}, Lcom/tencent/map/b/f;->r(Lcom/tencent/map/b/f;)Z

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/tencent/map/b/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->a:Lcom/tencent/map/b/e$b;

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->a:Lcom/tencent/map/b/e$b;

    invoke-virtual {v0}, Lcom/tencent/map/b/e$b;->a()Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->a:Lcom/tencent/map/b/e$b;

    invoke-static {v0}, Lcom/tencent/map/b/i;->a(Lcom/tencent/map/b/e$b;)Ljava/lang/String;

    move-result-object v6

    goto :goto_e

    :cond_f
    const-string v6, "{}"

    :goto_e
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{\"version\":\"1.1.8\",\"address\":"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->s(Lcom/tencent/map/b/f;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",\"source\":203,\"access_token\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->t(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",\"app_name\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v1}, Lcom/tencent/map/b/f;->u(Lcom/tencent/map/b/f;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",\"bearing\":1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",\"attribute\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",\"location\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",\"cells\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",\"wifis\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v0}, Lcom/tencent/map/b/f;->d(Lcom/tencent/map/b/f;)Lcom/tencent/map/b/f$c;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1, v5}, Lcom/tencent/map/b/f$c;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v5

    iget-object v0, p0, Lcom/tencent/map/b/f$a;->d:Lcom/tencent/map/b/f;

    invoke-static {v0}, Lcom/tencent/map/b/f;->d(Lcom/tencent/map/b/f;)Lcom/tencent/map/b/f$c;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/tencent/map/b/f$c;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

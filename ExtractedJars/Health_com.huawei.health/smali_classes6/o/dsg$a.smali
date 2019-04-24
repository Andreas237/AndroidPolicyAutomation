.class Lo/dsg$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dsg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Lo/dsl;

.field b:Landroid/content/Context;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Landroid/os/Handler;

.field final synthetic h:Lo/dsg;


# direct methods
.method constructor <init>(Lo/dsg;Landroid/content/Context;Landroid/os/Handler;Lo/dsl;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lo/dsg$a;->h:Lo/dsg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 149
    iput-object p3, p0, Lo/dsg$a;->e:Landroid/os/Handler;

    .line 150
    iput-object p4, p0, Lo/dsg$a;->a:Lo/dsl;

    .line 151
    iput-object p5, p0, Lo/dsg$a;->d:Ljava/lang/String;

    .line 152
    iput-object p6, p0, Lo/dsg$a;->c:Ljava/lang/String;

    .line 153
    iput-object p2, p0, Lo/dsg$a;->b:Landroid/content/Context;

    .line 154
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 158
    const/4 v4, 0x0

    .line 160
    :try_start_0
    invoke-static {}, Lo/dsq;->e()Lo/dsq;

    move-result-object v0

    iget-object v1, p0, Lo/dsg$a;->b:Landroid/content/Context;

    iget-object v2, p0, Lo/dsg$a;->c:Ljava/lang/String;

    iget-object v3, p0, Lo/dsg$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lo/dsq;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 161
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    const-string v0, "AsyncHttpUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    :cond_0
    if-eqz v4, :cond_2

    .line 172
    iget-object v0, p0, Lo/dsg$a;->e:Landroid/os/Handler;

    new-instance v1, Lo/dsg$e;

    iget-object v2, p0, Lo/dsg$a;->h:Lo/dsg;

    iget-object v3, p0, Lo/dsg$a;->a:Lo/dsl;

    invoke-direct {v1, v2, v4, v3}, Lo/dsg$e;-><init>(Lo/dsg;Ljava/lang/String;Lo/dsl;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_0

    .line 164
    :catch_0
    move-exception v5

    .line 165
    const-string v0, "AsyncHttpUtils"

    const-string v1, "doPostRequest->NoSuchAlgorithmException"

    :try_start_1
    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    if-eqz v4, :cond_2

    .line 172
    iget-object v0, p0, Lo/dsg$a;->e:Landroid/os/Handler;

    new-instance v1, Lo/dsg$e;

    iget-object v2, p0, Lo/dsg$a;->h:Lo/dsg;

    iget-object v3, p0, Lo/dsg$a;->a:Lo/dsl;

    invoke-direct {v1, v2, v4, v3}, Lo/dsg$e;-><init>(Lo/dsg;Ljava/lang/String;Lo/dsl;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 166
    :catch_1
    move-exception v5

    .line 167
    const-string v0, "AsyncHttpUtils"

    const-string v1, "doPostRequest->KeyManagementException"

    :try_start_2
    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 171
    if-eqz v4, :cond_2

    .line 172
    iget-object v0, p0, Lo/dsg$a;->e:Landroid/os/Handler;

    new-instance v1, Lo/dsg$e;

    iget-object v2, p0, Lo/dsg$a;->h:Lo/dsg;

    iget-object v3, p0, Lo/dsg$a;->a:Lo/dsl;

    invoke-direct {v1, v2, v4, v3}, Lo/dsg$e;-><init>(Lo/dsg;Ljava/lang/String;Lo/dsl;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 168
    :catch_2
    move-exception v5

    .line 169
    const-string v0, "AsyncHttpUtils"

    const-string v1, "doPostRequest->Exception:"

    :try_start_3
    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 171
    if-eqz v4, :cond_2

    .line 172
    iget-object v0, p0, Lo/dsg$a;->e:Landroid/os/Handler;

    new-instance v1, Lo/dsg$e;

    iget-object v2, p0, Lo/dsg$a;->h:Lo/dsg;

    iget-object v3, p0, Lo/dsg$a;->a:Lo/dsl;

    invoke-direct {v1, v2, v4, v3}, Lo/dsg$e;-><init>(Lo/dsg;Ljava/lang/String;Lo/dsl;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 171
    :catchall_0
    move-exception v6

    if-eqz v4, :cond_1

    .line 172
    iget-object v0, p0, Lo/dsg$a;->e:Landroid/os/Handler;

    new-instance v1, Lo/dsg$e;

    iget-object v2, p0, Lo/dsg$a;->h:Lo/dsg;

    iget-object v3, p0, Lo/dsg$a;->a:Lo/dsl;

    invoke-direct {v1, v2, v4, v3}, Lo/dsg$e;-><init>(Lo/dsg;Ljava/lang/String;Lo/dsl;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    throw v6

    .line 175
    :cond_2
    :goto_0
    return-void
.end method

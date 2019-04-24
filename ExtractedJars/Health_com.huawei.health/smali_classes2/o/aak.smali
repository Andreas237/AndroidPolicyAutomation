.class public Lo/aak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private d:Lo/aab;

.field private e:Lo/aai;


# direct methods
.method public constructor <init>(Lo/aal;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    if-eqz p1, :cond_0

    .line 33
    invoke-virtual {p1}, Lo/aal;->c()Lo/aab;

    move-result-object v0

    iput-object v0, p0, Lo/aak;->d:Lo/aab;

    .line 34
    invoke-virtual {p1}, Lo/aal;->a()Lo/aai;

    move-result-object v0

    iput-object v0, p0, Lo/aak;->e:Lo/aai;

    .line 36
    :cond_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 41
    iget-object v0, p0, Lo/aak;->d:Lo/aab;

    if-nez v0, :cond_0

    .line 43
    const-string v0, "baseBiz is null!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->a(Ljava/lang/String;Z)V

    .line 44
    return-void

    .line 47
    :cond_0
    const/4 v2, 0x0

    .line 50
    :try_start_0
    iget-object v0, p0, Lo/aak;->d:Lo/aab;

    invoke-virtual {v0}, Lo/aab;->c()Ljava/lang/String;

    move-result-object v2

    .line 52
    if-eqz v2, :cond_1

    .line 54
    const-string v0, "baseBiz get result Success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 55
    iget-object v0, p0, Lo/aak;->e:Lo/aai;

    if-eqz v0, :cond_2

    .line 57
    iget-object v0, p0, Lo/aak;->e:Lo/aai;

    invoke-interface {v0, v2}, Lo/aai;->d(Ljava/lang/String;)V

    .line 59
    goto/16 :goto_0

    .line 62
    :cond_1
    const-string v0, "result is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->a(Ljava/lang/String;Z)V

    .line 63
    iget-object v0, p0, Lo/aak;->e:Lo/aai;

    if-eqz v0, :cond_2

    .line 65
    iget-object v0, p0, Lo/aak;->e:Lo/aai;

    const-string v1, "client10005"

    invoke-interface {v0, v1}, Lo/aai;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Lo/aac; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3

    .line 69
    goto :goto_0

    .line 70
    :catch_0
    move-exception v3

    .line 72
    const-string v0, "baseBiz ServiceOverloadException."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->a(Ljava/lang/String;Z)V

    .line 73
    iget-object v0, p0, Lo/aak;->e:Lo/aai;

    if-eqz v0, :cond_2

    .line 75
    iget-object v0, p0, Lo/aak;->e:Lo/aai;

    const-string v1, "client10009"

    invoke-interface {v0, v1}, Lo/aai;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 78
    :catch_1
    move-exception v3

    .line 80
    const-string v0, "baseBiz TimeoutException:"

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lo/aap;->d(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 82
    iget-object v0, p0, Lo/aak;->e:Lo/aai;

    if-eqz v0, :cond_2

    .line 84
    iget-object v0, p0, Lo/aak;->e:Lo/aai;

    const-string v1, "client10004"

    invoke-interface {v0, v1}, Lo/aai;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 87
    :catch_2
    move-exception v3

    .line 89
    const-string v0, "baseBiz IOException:"

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lo/aap;->d(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 91
    iget-object v0, p0, Lo/aak;->e:Lo/aai;

    if-eqz v0, :cond_2

    .line 93
    iget-object v0, p0, Lo/aak;->e:Lo/aai;

    const-string v1, "client10005"

    invoke-interface {v0, v1}, Lo/aai;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 96
    :catch_3
    move-exception v3

    .line 98
    const-string v0, "baseBiz JSONException:"

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 100
    iget-object v0, p0, Lo/aak;->e:Lo/aai;

    if-eqz v0, :cond_2

    .line 102
    iget-object v0, p0, Lo/aak;->e:Lo/aai;

    const-string v1, "client10002"

    invoke-interface {v0, v1}, Lo/aai;->c(Ljava/lang/String;)V

    .line 105
    :cond_2
    :goto_0
    return-void
.end method

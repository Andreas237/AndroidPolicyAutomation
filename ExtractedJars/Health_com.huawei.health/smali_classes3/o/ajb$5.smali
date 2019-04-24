.class final Lo/ajb$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ajb;->d(Lo/ail;Lo/aiq$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aiq$d;

.field final synthetic c:Lo/ail;


# direct methods
.method constructor <init>(Lo/ail;Lo/aiq$d;)V
    .locals 0

    .line 200
    iput-object p1, p0, Lo/ajb$5;->c:Lo/ail;

    iput-object p2, p0, Lo/ajb$5;->a:Lo/aiq$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 203
    const/4 v4, 0x0

    .line 204
    iget-object v0, p0, Lo/ajb$5;->c:Lo/ail;

    invoke-static {v0}, Lo/ajb;->b(Lo/ail;)V

    .line 206
    :try_start_0
    invoke-static {}, Lo/ajb;->b()Lo/ajg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ajg;->e()Lo/flk;

    move-result-object v5

    .line 207
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 209
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v5}, Lo/fli;->b(Lo/flk;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 210
    sget-object v0, Lo/flj$b;->f:Lo/flj$b;

    invoke-virtual {v5}, Lo/flk;->b()Lo/flj$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/flj$b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 214
    const-string v0, "/.well-known/core?st=cloudSetup"

    iget-object v1, p0, Lo/ajb$5;->c:Lo/ail;

    iget-object v1, v1, Lo/ail;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "/.well-known/core?st=monitordev"

    iget-object v1, p0, Lo/ajb$5;->c:Lo/ail;

    iget-object v1, v1, Lo/ail;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 216
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "coap:/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lo/flk;->e()Lo/fly;

    move-result-object v1

    invoke-virtual {v1}, Lo/fly;->q()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lo/flk;->e()Lo/fly;

    move-result-object v1

    invoke-virtual {v1}, Lo/fly;->s()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 218
    const-string v0, "CoapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "address "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 220
    invoke-static {v6}, Lo/ajb;->a(Ljava/lang/String;)Z

    move-result v7

    .line 221
    const-string v0, "CoapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get  flag "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 222
    if-eqz v7, :cond_1

    .line 223
    iget-object v0, p0, Lo/ajb$5;->c:Lo/ail;

    invoke-virtual {v5}, Lo/flk;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Lo/ail;->b(Ljava/lang/String;Ljava/lang/String;)Lo/air;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    .line 225
    :cond_1
    iget-object v0, p0, Lo/ajb$5;->c:Lo/ail;

    invoke-virtual {v5}, Lo/flk;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ail;->e(Ljava/lang/String;)Lo/air;

    move-result-object v0

    move-object v4, v0

    .line 228
    :goto_0
    goto :goto_1

    .line 229
    :cond_2
    iget-object v0, p0, Lo/ajb$5;->c:Lo/ail;

    invoke-virtual {v5}, Lo/flk;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ail;->e(Ljava/lang/String;)Lo/air;

    move-result-object v0

    move-object v4, v0

    .line 232
    :goto_1
    if-eqz v4, :cond_3

    .line 233
    const/4 v0, 0x0

    iput v0, v4, Lo/air;->d:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 239
    :cond_3
    goto :goto_2

    .line 237
    :catch_0
    move-exception v5

    .line 238
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 240
    :goto_2
    iget-object v0, p0, Lo/ajb$5;->a:Lo/aiq$d;

    invoke-interface {v0, v4}, Lo/aiq$d;->c(Lo/air;)V

    .line 241
    return-void
.end method

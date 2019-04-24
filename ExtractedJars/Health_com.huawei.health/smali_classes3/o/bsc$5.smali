.class Lo/bsc$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsc;->a(Lokhttp3/Request;Ljava/lang/String;Lo/bsf;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bsc;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:J

.field final synthetic e:Lo/bsf;


# direct methods
.method constructor <init>(Lo/bsc;Lo/bsf;JLjava/lang/String;)V
    .locals 0

    .line 356
    iput-object p1, p0, Lo/bsc$5;->a:Lo/bsc;

    iput-object p2, p0, Lo/bsc$5;->e:Lo/bsf;

    iput-wide p3, p0, Lo/bsc$5;->d:J

    iput-object p5, p0, Lo/bsc$5;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 5

    .line 359
    iget-object v0, p0, Lo/bsc$5;->a:Lo/bsc;

    invoke-interface {p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    move-result-object v1

    iget-object v2, p0, Lo/bsc$5;->e:Lo/bsf;

    invoke-static {v0, v1, p2, v2}, Lo/bsc;->c(Lo/bsc;Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V

    .line 360
    iget-object v0, p0, Lo/bsc$5;->a:Lo/bsc;

    iget-object v3, v0, Lo/bsc;->e:Ljava/lang/Object;

    monitor-enter v3

    .line 361
    :try_start_0
    iget-object v0, p0, Lo/bsc$5;->a:Lo/bsc;

    iget-object v0, v0, Lo/bsc;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 362
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 363
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 364
    iget-object v0, p0, Lo/bsc$5;->a:Lo/bsc;

    iget-wide v1, p0, Lo/bsc$5;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Lo/bsc;->a(Lo/bsc;JJ)V

    .line 365
    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 8

    .line 369
    iget-object v0, p0, Lo/bsc$5;->a:Lo/bsc;

    iget-object v1, p0, Lo/bsc$5;->c:Ljava/lang/String;

    iget-object v2, p0, Lo/bsc$5;->e:Lo/bsf;

    invoke-static {v0, p1, p2, v1, v2}, Lo/bsc;->e(Lo/bsc;Lokhttp3/Call;Lokhttp3/Response;Ljava/lang/String;Lo/bsf;)V

    .line 370
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 371
    iget-object v0, p0, Lo/bsc$5;->a:Lo/bsc;

    invoke-virtual {p2}, Lokhttp3/Response;->code()I

    move-result v1

    iget-wide v2, p0, Lo/bsc$5;->d:J

    move-wide v4, v6

    invoke-static/range {v0 .. v5}, Lo/bsc;->b(Lo/bsc;IJJ)V

    .line 372
    return-void
.end method

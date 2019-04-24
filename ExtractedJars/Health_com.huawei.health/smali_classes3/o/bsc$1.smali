.class Lo/bsc$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsc;->b(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsf;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bsc;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lo/bsf;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/bsc;Ljava/lang/String;Ljava/lang/String;Lo/bsf;J)V
    .locals 0

    .line 207
    iput-object p1, p0, Lo/bsc$1;->a:Lo/bsc;

    iput-object p2, p0, Lo/bsc$1;->b:Ljava/lang/String;

    iput-object p3, p0, Lo/bsc$1;->d:Ljava/lang/String;

    iput-object p4, p0, Lo/bsc$1;->c:Lo/bsf;

    iput-wide p5, p0, Lo/bsc$1;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 8

    .line 210
    iget-object v0, p0, Lo/bsc$1;->a:Lo/bsc;

    iget-object v0, v0, Lo/bsc;->a:Ljava/util/Map;

    iget-object v1, p0, Lo/bsc$1;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    const-string v0, "HttpRequest"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/bsc$1;->d:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "call.enqueue onFailure"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    iget-object v0, p0, Lo/bsc$1;->a:Lo/bsc;

    invoke-interface {p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    move-result-object v1

    iget-object v2, p0, Lo/bsc$1;->c:Lo/bsf;

    invoke-static {v0, v1, p2, v2}, Lo/bsc;->c(Lo/bsc;Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V

    .line 213
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 214
    iget-object v0, p0, Lo/bsc$1;->a:Lo/bsc;

    move-object v1, p2

    iget-wide v2, p0, Lo/bsc$1;->e:J

    move-wide v4, v6

    invoke-static/range {v0 .. v5}, Lo/bsc;->d(Lo/bsc;Ljava/lang/Exception;JJ)V

    .line 215
    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 9

    .line 219
    iget-object v0, p0, Lo/bsc$1;->a:Lo/bsc;

    iget-object v0, v0, Lo/bsc;->a:Ljava/util/Map;

    iget-object v1, p0, Lo/bsc$1;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    invoke-virtual {p2}, Lokhttp3/Response;->code()I

    move-result v6

    .line 221
    const-string v0, "HttpRequest"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/bsc$1;->d:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "call.enqueue onResponse code = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 223
    sparse-switch v6, :sswitch_data_0

    goto/16 :goto_0

    .line 225
    :sswitch_0
    iget-object v0, p0, Lo/bsc$1;->a:Lo/bsc;

    iget-object v1, p0, Lo/bsc$1;->c:Lo/bsf;

    invoke-static {v0, p1, p2, v1}, Lo/bsc;->b(Lo/bsc;Lokhttp3/Call;Lokhttp3/Response;Lo/bsf;)V

    .line 226
    iget-object v0, p0, Lo/bsc$1;->a:Lo/bsc;

    iget-wide v2, p0, Lo/bsc$1;->e:J

    move-wide v4, v7

    const/16 v1, 0xc8

    invoke-static/range {v0 .. v5}, Lo/bsc;->d(Lo/bsc;IJJ)V

    .line 227
    goto/16 :goto_1

    .line 229
    :sswitch_1
    iget-object v0, p0, Lo/bsc$1;->a:Lo/bsc;

    new-instance v1, Ljava/lang/Exception;

    const/16 v2, 0x1f4

    invoke-static {v2}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lo/bsc$1;->c:Lo/bsf;

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/bsc;->c(Lo/bsc;Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V

    .line 230
    iget-object v0, p0, Lo/bsc$1;->a:Lo/bsc;

    new-instance v1, Ljava/lang/Exception;

    const/16 v2, 0x1f4

    invoke-static {v2}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lo/bsc$1;->e:J

    move-wide v4, v7

    invoke-static/range {v0 .. v5}, Lo/bsc;->d(Lo/bsc;Ljava/lang/Exception;JJ)V

    .line 231
    goto :goto_1

    .line 233
    :sswitch_2
    iget-object v0, p0, Lo/bsc$1;->a:Lo/bsc;

    new-instance v1, Ljava/lang/Exception;

    const/16 v2, 0x1f7

    invoke-static {v2}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lo/bsc$1;->c:Lo/bsf;

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/bsc;->c(Lo/bsc;Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V

    .line 234
    iget-object v0, p0, Lo/bsc$1;->a:Lo/bsc;

    new-instance v1, Ljava/lang/Exception;

    const/16 v2, 0x1f7

    invoke-static {v2}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lo/bsc$1;->e:J

    move-wide v4, v7

    invoke-static/range {v0 .. v5}, Lo/bsc;->d(Lo/bsc;Ljava/lang/Exception;JJ)V

    .line 235
    goto :goto_1

    .line 237
    :goto_0
    iget-object v0, p0, Lo/bsc$1;->a:Lo/bsc;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "http unkow"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lo/bsc$1;->c:Lo/bsf;

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/bsc;->c(Lo/bsc;Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V

    .line 238
    iget-object v0, p0, Lo/bsc$1;->a:Lo/bsc;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "http unkow"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lo/bsc$1;->e:J

    move-wide v4, v7

    invoke-static/range {v0 .. v5}, Lo/bsc;->d(Lo/bsc;Ljava/lang/Exception;JJ)V

    .line 241
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_0
        0x1f4 -> :sswitch_1
        0x1f7 -> :sswitch_2
    .end sparse-switch
.end method

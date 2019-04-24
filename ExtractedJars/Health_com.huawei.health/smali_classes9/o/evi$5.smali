.class Lo/evi$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/evi;->c(Lokhttp3/Request;Ljava/lang/String;Lo/evl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lo/evi;

.field final synthetic e:Lo/evl;


# direct methods
.method constructor <init>(Lo/evi;Lo/evl;Ljava/lang/String;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lo/evi$5;->d:Lo/evi;

    iput-object p2, p0, Lo/evi$5;->e:Lo/evl;

    iput-object p3, p0, Lo/evi$5;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 5

    .line 295
    iget-object v0, p0, Lo/evi$5;->d:Lo/evi;

    invoke-interface {p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    move-result-object v1

    iget-object v2, p0, Lo/evi$5;->e:Lo/evl;

    invoke-static {v0, v1, p2, v2}, Lo/evi;->c(Lo/evi;Lokhttp3/Request;Ljava/lang/Exception;Lo/evl;)V

    .line 296
    iget-object v0, p0, Lo/evi$5;->d:Lo/evi;

    iget-object v3, v0, Lo/evi;->e:Ljava/lang/Object;

    monitor-enter v3

    .line 297
    :try_start_0
    iget-object v0, p0, Lo/evi$5;->d:Lo/evi;

    iget-object v0, v0, Lo/evi;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 298
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 299
    :goto_0
    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 3

    .line 303
    iget-object v0, p0, Lo/evi$5;->d:Lo/evi;

    iget-object v1, p0, Lo/evi$5;->c:Ljava/lang/String;

    iget-object v2, p0, Lo/evi$5;->e:Lo/evl;

    invoke-static {v0, p1, p2, v1, v2}, Lo/evi;->e(Lo/evi;Lokhttp3/Call;Lokhttp3/Response;Ljava/lang/String;Lo/evl;)V

    .line 304
    return-void
.end method

.class public Lo/fos;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/foo;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/net/InetSocketAddress;


# virtual methods
.method public b()V
    .locals 3

    .line 73
    iget-object v0, p0, Lo/fos;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/foo;

    .line 74
    invoke-virtual {v2}, Lo/foo;->c()V

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    return-void
.end method

.method public d()Ljava/net/InetSocketAddress;
    .locals 1

    .line 83
    iget-object v0, p0, Lo/fos;->d:Ljava/net/InetSocketAddress;

    return-object v0
.end method

.method public d(Lo/foo;)V
    .locals 1

    .line 65
    iget-object v0, p0, Lo/fos;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 66
    return-void
.end method

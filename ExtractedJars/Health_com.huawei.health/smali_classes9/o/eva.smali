.class public Lo/eva;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Ljava/util/List;)J
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/evp;>;)J"
        }
    .end annotation

    .line 19
    const-wide/16 v2, 0x0

    .line 20
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/evp;

    .line 21
    invoke-virtual {v5}, Lo/evp;->d()J

    move-result-wide v0

    add-long/2addr v2, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-wide v2
.end method

.method public static e(Ljava/util/List;)Lo/evp;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/evp;>;)Lo/evp;"
        }
    .end annotation

    .line 33
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/evp;

    .line 34
    invoke-virtual {v2}, Lo/evp;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 35
    return-object v2

    .line 37
    :cond_0
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

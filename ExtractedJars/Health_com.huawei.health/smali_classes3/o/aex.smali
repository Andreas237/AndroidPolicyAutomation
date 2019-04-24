.class public Lo/aex;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afj;>;)Ljava/util/ArrayList<Lo/afa;>;"
        }
    .end annotation

    .line 27
    const-string v0, "ChangeClassType"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " changeHuaweiDeviceClassList()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 29
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/afj;

    .line 30
    new-instance v7, Lo/afa;

    invoke-direct {v7}, Lo/afa;-><init>()V

    .line 31
    invoke-virtual {v7, v6}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 32
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/afa;->e(I)V

    .line 33
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-object v4
.end method

.method public static e(Lo/afj;)Lo/afa;
    .locals 5

    .line 19
    const-string v0, "ChangeClassType"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " changeHuaweiDeviceClass()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    new-instance v4, Lo/afa;

    invoke-direct {v4}, Lo/afa;-><init>()V

    .line 21
    invoke-virtual {v4, p0}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 22
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/afa;->e(I)V

    .line 23
    return-object v4
.end method

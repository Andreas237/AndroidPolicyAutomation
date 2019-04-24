.class public abstract Lo/fbo;
.super Lo/fbq;
.source "SourceFile"

# interfaces
.implements Lo/fbp;


# instance fields
.field protected c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fbm;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .line 17
    invoke-direct {p0, p1, p2}, Lo/fbq;-><init>(J)V

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fbo;->c:Ljava/util/List;

    .line 18
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/fbm;>;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lo/fbo;->c:Ljava/util/List;

    return-object v0
.end method

.method public a(Lo/fbm;)Z
    .locals 3

    .line 38
    if-nez p1, :cond_0

    .line 39
    const/4 v0, 0x0

    return v0

    .line 41
    :cond_0
    invoke-interface {p1}, Lo/fbm;->e_()Lo/fbh;

    move-result-object v2

    .line 42
    invoke-virtual {p0}, Lo/fbo;->e_()Lo/fbh;

    move-result-object v0

    invoke-virtual {v2}, Lo/fbh;->a()Lo/fbh;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 43
    const/4 v0, 0x1

    return v0

    .line 45
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public c(I)Lo/fbm;
    .locals 3

    .line 58
    iget-object v2, p0, Lo/fbo;->c:Ljava/util/List;

    .line 59
    sget-object v0, Lo/fbo;->e:Ljava/util/Comparator;

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 60
    if-ltz p1, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 61
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fbm;

    return-object v0

    .line 63
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "the position is out of the HistoryModel size"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()V
    .locals 1

    .line 50
    iget-object v0, p0, Lo/fbo;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 51
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<+Lo/fbm;>;)V"
        }
    .end annotation

    .line 26
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    invoke-virtual {p0}, Lo/fbo;->a()Ljava/util/List;

    move-result-object v2

    .line 29
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fbm;

    .line 30
    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 31
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    :cond_0
    goto :goto_0

    .line 34
    :cond_1
    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 35
    return-void
.end method

.method public h()I
    .locals 1

    .line 54
    iget-object v0, p0, Lo/fbo;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

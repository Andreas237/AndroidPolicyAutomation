.class public Lo/bfu;
.super Lo/bfq;
.source "SourceFile"


# instance fields
.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    invoke-direct {p0, p1}, Lo/bfq;-><init>(Landroid/content/Context;)V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bfu;->e:Ljava/util/ArrayList;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bfu;->g:Ljava/util/ArrayList;

    .line 30
    return-void
.end method


# virtual methods
.method public b(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 59
    iput-object p1, p0, Lo/bfu;->e:Ljava/util/ArrayList;

    .line 60
    iget-object v0, p0, Lo/bfu;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 61
    invoke-virtual {p0}, Lo/bfu;->d()V

    .line 62
    return-void
.end method

.method public c()I
    .locals 1

    .line 83
    iget-object v0, p0, Lo/bfu;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/bfu;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public d()V
    .locals 6

    .line 35
    iget-object v0, p0, Lo/bfu;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bfu;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 37
    iget-object v0, p0, Lo/bfu;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lo/bfu;->g:Ljava/util/ArrayList;

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-virtual {p0, v2, v3, v0, v1}, Lo/bfu;->e(IIILjava/util/List;)Lo/bfq$e;

    goto :goto_1

    .line 41
    :cond_0
    iget-object v0, p0, Lo/bfu;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/User;

    .line 43
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/user/User;->setCardType(I)V

    .line 44
    sget-object v0, Lo/bfp$c;->d:Lo/bfp$c;

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/user/User;->setEventType(Lo/bfp$c;)V

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v0, p0, Lo/bfu;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lo/bfu;->e:Ljava/util/ArrayList;

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-virtual {p0, v2, v3, v0, v1}, Lo/bfu;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 49
    :goto_1
    invoke-virtual {p0}, Lo/bfu;->a()Lo/bfq$c;

    move-result-object v0

    invoke-interface {v0}, Lo/bfq$c;->b()V

    .line 50
    return-void
.end method

.method public e(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 71
    iput-object p1, p0, Lo/bfu;->g:Ljava/util/ArrayList;

    .line 72
    iget-object v0, p0, Lo/bfu;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 73
    invoke-virtual {p0}, Lo/bfu;->d()V

    .line 74
    return-void
.end method

.class public Lo/bkp;
.super Lo/bfq;
.source "SourceFile"


# instance fields
.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bfh;>;"
        }
    .end annotation
.end field

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bfh;>;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation
.end field

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 42
    invoke-direct {p0, p1}, Lo/bfq;-><init>(Landroid/content/Context;)V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bkp;->e:Ljava/util/List;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bkp;->h:Ljava/util/List;

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bkp;->f:Ljava/util/List;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bkp;->g:Ljava/lang/String;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bkp;->k:Ljava/util/List;

    .line 44
    new-instance v1, Lo/bfh;

    invoke-direct {v1}, Lo/bfh;-><init>()V

    .line 45
    const/16 v0, 0x1a

    invoke-virtual {v1, v0}, Lo/bfh;->setCardType(I)V

    .line 46
    sget-object v0, Lo/bfp$c;->i:Lo/bfp$c;

    invoke-virtual {v1, v0}, Lo/bfh;->setEventType(Lo/bfp$c;)V

    .line 47
    iget-object v0, p0, Lo/bkp;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    return-void
.end method


# virtual methods
.method public b(Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<Ljava/lang/Long;>;)V"
        }
    .end annotation

    .line 109
    iget-object v0, p0, Lo/bkp;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bkp;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 112
    :cond_0
    return-void

    .line 115
    :cond_1
    iget-object v0, p0, Lo/bkp;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 117
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 120
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    .line 122
    :cond_2
    goto :goto_0

    .line 124
    :cond_3
    invoke-virtual {p0}, Lo/bkp;->a()Lo/bfq$c;

    move-result-object v2

    .line 125
    if-eqz v2, :cond_4

    .line 127
    invoke-interface {v2}, Lo/bfq$c;->b()V

    .line 129
    :cond_4
    return-void
.end method

.method public c(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 139
    iget-object v0, p0, Lo/bkp;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 140
    iput-object p2, p0, Lo/bkp;->g:Ljava/lang/String;

    .line 141
    iput-object p1, p0, Lo/bkp;->k:Ljava/util/List;

    .line 142
    invoke-virtual {p0}, Lo/bkp;->d()V

    .line 143
    return-void
.end method

.method public d()V
    .locals 5

    .line 54
    iget-object v0, p0, Lo/bkp;->k:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bkp;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 56
    new-instance v0, Lo/bke;

    invoke-direct {v0}, Lo/bke;-><init>()V

    iget-object v1, p0, Lo/bkp;->b:Landroid/content/Context;

    iget-object v2, p0, Lo/bkp;->k:Ljava/util/List;

    iget-object v3, p0, Lo/bkp;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lo/bke;->d(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 58
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x18

    const/16 v2, 0x18

    invoke-virtual {p0, v1, v2, v0, v4}, Lo/bkp;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 60
    goto :goto_0

    .line 63
    :cond_0
    iget-object v0, p0, Lo/bkp;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/bkp;->e:Ljava/util/List;

    const/16 v2, 0x17

    const/16 v3, 0x31

    invoke-virtual {p0, v2, v3, v0, v1}, Lo/bkp;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 64
    iget-object v0, p0, Lo/bkp;->h:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bkp;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 66
    :cond_1
    iget-object v0, p0, Lo/bkp;->f:Ljava/util/List;

    .line 67
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/bkp;->f:Ljava/util/List;

    .line 66
    const/16 v2, 0x1a

    const/16 v3, 0x1a

    invoke-virtual {p0, v2, v3, v0, v1}, Lo/bkp;->e(IIILjava/util/List;)Lo/bfq$e;

    goto :goto_0

    .line 71
    :cond_2
    iget-object v0, p0, Lo/bkp;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/bkp;->h:Ljava/util/List;

    const/16 v2, 0x1b

    const/16 v3, 0x1b

    invoke-virtual {p0, v2, v3, v0, v1}, Lo/bkp;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 76
    :goto_0
    invoke-virtual {p0}, Lo/bkp;->a()Lo/bfq$c;

    move-result-object v4

    .line 77
    if-eqz v4, :cond_3

    .line 79
    invoke-interface {v4}, Lo/bfq$c;->b()V

    .line 81
    :cond_3
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 90
    if-eqz p1, :cond_0

    .line 92
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 94
    sget-object v0, Lo/bfp$c;->d:Lo/bfp$c;

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setEventType(Lo/bfp$c;)V

    .line 95
    goto :goto_0

    .line 97
    :cond_0
    iput-object p1, p0, Lo/bkp;->h:Ljava/util/List;

    .line 98
    iget-object v0, p0, Lo/bkp;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 99
    invoke-virtual {p0}, Lo/bkp;->d()V

    .line 100
    return-void
.end method

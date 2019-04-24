.class public final Lcom/huawei/health/sns/api/NotifyCenterManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/avk$d;


# static fields
.field private static e:Lcom/huawei/health/sns/api/NotifyCenterManager;


# instance fields
.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ans;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/health/sns/api/NotifyCenterManager;->e:Lcom/huawei/health/sns/api/NotifyCenterManager;

    return-void
.end method

.method private a(I)V
    .locals 3

    .line 229
    iget-object v0, p0, Lcom/huawei/health/sns/api/NotifyCenterManager;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ans;

    .line 231
    invoke-interface {v2, p1}, Lo/ans;->d(I)V

    .line 232
    goto :goto_0

    .line 233
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/api/NotifyCenterManager;I)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/api/NotifyCenterManager;->a(I)V

    return-void
.end method

.method private c()V
    .locals 2

    .line 124
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/health/sns/api/NotifyCenterManager;->k()Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 125
    return-void
.end method

.method private d()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 108
    new-instance v0, Lcom/huawei/health/sns/api/NotifyCenterManager$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/api/NotifyCenterManager$3;-><init>(Lcom/huawei/health/sns/api/NotifyCenterManager;)V

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 98
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/health/sns/api/NotifyCenterManager;->d()Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 99
    return-void
.end method

.method private e(I)V
    .locals 3

    .line 242
    iget-object v0, p0, Lcom/huawei/health/sns/api/NotifyCenterManager;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ans;

    .line 244
    invoke-interface {v2, p1}, Lo/ans;->a(I)V

    .line 245
    goto :goto_0

    .line 246
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/api/NotifyCenterManager;I)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/api/NotifyCenterManager;->e(I)V

    return-void
.end method

.method private k()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 134
    new-instance v0, Lcom/huawei/health/sns/api/NotifyCenterManager$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/api/NotifyCenterManager$4;-><init>(Lcom/huawei/health/sns/api/NotifyCenterManager;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 267
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    invoke-virtual {v0}, Lo/ast;->a()[I

    move-result-object v0

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public b()I
    .locals 1

    .line 256
    invoke-static {}, Lo/axj;->b()I

    move-result v0

    return v0
.end method

.method public e(Lo/auu$b;Landroid/os/Bundle;)V
    .locals 0

    .line 273
    invoke-direct {p0}, Lcom/huawei/health/sns/api/NotifyCenterManager;->e()V

    .line 274
    invoke-direct {p0}, Lcom/huawei/health/sns/api/NotifyCenterManager;->c()V

    .line 275
    return-void
.end method

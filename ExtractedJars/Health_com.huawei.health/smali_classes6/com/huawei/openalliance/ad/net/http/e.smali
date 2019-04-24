.class public Lcom/huawei/openalliance/ad/net/http/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/net/http/e$a;
    }
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/String;

.field final c:I

.field final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field final f:Ljava/lang/String;

.field final g:Z

.field final h:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/net/http/e$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/e$a;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->a:Ljava/lang/String;

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/e$a;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->b:Ljava/lang/String;

    iget v0, p1, Lcom/huawei/openalliance/ad/net/http/e$a;->c:I

    iput v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->c:I

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/e$a;->d:Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->d:Ljava/util/List;

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/e$a;->e:Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->e:Ljava/util/List;

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/e$a;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->f:Ljava/lang/String;

    iget-boolean v0, p1, Lcom/huawei/openalliance/ad/net/http/e$a;->g:Z

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->g:Z

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/e$a;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->g:Z

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->h:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->a:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/net/http/e;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->c:I

    if-lez v0, :cond_0

    const/16 v0, 0x3a

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/net/http/e;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    const/16 v0, 0x2f

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->d:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->d:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/16 v0, 0x2f

    invoke-static {v2, v0}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/StringBuilder;C)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->e:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_3

    const/16 v0, 0x3f

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->e:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    const/16 v0, 0x26

    invoke-static {v2, v0}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/StringBuilder;C)V

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const/16 v0, 0x23

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/net/http/e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

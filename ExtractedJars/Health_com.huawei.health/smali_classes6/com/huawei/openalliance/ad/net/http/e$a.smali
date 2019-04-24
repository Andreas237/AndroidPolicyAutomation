.class public Lcom/huawei/openalliance/ad/net/http/e$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/net/http/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:I

.field final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field f:Ljava/lang/String;

.field g:Z

.field h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->d:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->e:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->g:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->d:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->e:Ljava/util/List;

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->g:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/net/http/e$a;
    .locals 7

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iput-object p1, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->h:Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->a:Ljava/lang/String;

    invoke-virtual {v2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->b:Ljava/lang/String;

    invoke-virtual {v2}, Landroid/net/Uri;->getPort()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->c:I

    invoke-virtual {v2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->d:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    invoke-virtual {v2}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "&"

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    :goto_0
    array-length v0, v5

    if-ge v6, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->e:Ljava/util/List;

    aget-object v1, v5, v6

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/huawei/openalliance/ad/net/http/e$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Lcom/huawei/openalliance/ad/net/http/e$a;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/e$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object p0
.end method

.method public a()Lcom/huawei/openalliance/ad/net/http/e;
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/net/http/e;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/net/http/e;-><init>(Lcom/huawei/openalliance/ad/net/http/e$a;)V

    return-object v0
.end method

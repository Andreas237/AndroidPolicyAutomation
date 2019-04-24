.class public Lcom/huawei/openalliance/ad/k/i;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/k/b/f;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/SloganRecord;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private d:Lcom/huawei/openalliance/ad/e/a/d;

.field private e:Lcom/huawei/openalliance/ad/e/a/c;

.field private f:Lcom/huawei/openalliance/ad/e/a/e;

.field private g:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/k/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/k/i;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/SloganRecord;>;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->g:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/k/i;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/huawei/openalliance/ad/k/i;->c:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/e;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->d:Lcom/huawei/openalliance/ad/e/a/d;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/d;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/c;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->e:Lcom/huawei/openalliance/ad/e/a/c;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->f:Lcom/huawei/openalliance/ad/e/a/e;

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/db/bean/SloganRecord;J)V
    .locals 5

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getContentId_()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/huawei/openalliance/ad/k/i;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-string v0, "sha256"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "url"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "_id"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->d:Lcom/huawei/openalliance/ad/e/a/d;

    invoke-interface {v0, p1, v3, v2}, Lcom/huawei/openalliance/ad/e/a/d;->a(Lcom/huawei/openalliance/ad/db/bean/SloganRecord;Ljava/util/List;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_0
    new-instance v3, Lcom/huawei/openalliance/ad/l/c;

    invoke-direct {v3}, Lcom/huawei/openalliance/ad/l/c;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getUrl_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/l/c;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getCreativeType_()I

    move-result v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->f:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->p()I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->f:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->q()I

    move-result v0

    :goto_0
    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/l/c;->a(I)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getSha256_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/l/c;->b(Ljava/lang/String;)V

    const-string v0, "slogan"

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/l/c;->a(Ljava/lang/String;)V

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/l/c;->a(Ljava/lang/Long;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->e:Lcom/huawei/openalliance/ad/e/a/c;

    invoke-interface {v0, v3}, Lcom/huawei/openalliance/ad/e/a/c;->a(Lcom/huawei/openalliance/ad/l/c;)Lcom/huawei/openalliance/ad/l/d;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/l/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/l/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->setUrl_(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->d:Lcom/huawei/openalliance/ad/e/a/d;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/d;->a(Lcom/huawei/openalliance/ad/db/bean/SloganRecord;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private a(I)Z
    .locals 1

    const/4 v0, 0x2

    if-eq v0, p1, :cond_0

    const/4 v0, 0x4

    if-ne v0, p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private b(Ljava/lang/String;)Z
    .locals 7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->d:Lcom/huawei/openalliance/ad/e/a/d;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/d;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    move-result-object v4

    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getUrl_()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->d:Lcom/huawei/openalliance/ad/e/a/d;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/d;->b(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_1
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    :cond_2
    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/io/File;)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->d:Lcom/huawei/openalliance/ad/e/a/d;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/d;->b(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_3
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->c:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/k/i;->a:Ljava/lang/String;

    const-string v1, "invalidSlogonIds is empty"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0, v3}, Lcom/huawei/openalliance/ad/k/i;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(J)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->b:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/y;->b(Landroid/content/Context;)[B

    move-result-object v1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getCreativeType_()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/i;->a(I)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v3, v1}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->setKey([B)V

    invoke-direct {p0, v3, p1, p2}, Lcom/huawei/openalliance/ad/k/i;->a(Lcom/huawei/openalliance/ad/db/bean/SloganRecord;J)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->d:Lcom/huawei/openalliance/ad/e/a/d;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/d;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    move-result-object v1

    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getUrl_()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/io/File;)Z

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/i;->d:Lcom/huawei/openalliance/ad/e/a/d;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/d;->b(Ljava/lang/String;)V

    return-void
.end method

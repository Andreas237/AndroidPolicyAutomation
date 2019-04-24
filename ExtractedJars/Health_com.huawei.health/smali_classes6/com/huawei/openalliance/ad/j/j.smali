.class public Lcom/huawei/openalliance/ad/j/j;
.super Lcom/huawei/openalliance/ad/i/a;

# interfaces
.implements Lcom/huawei/openalliance/ad/j/a/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/openalliance/ad/i/a<Lcom/huawei/openalliance/ad/views/interfaces/f;>;Lcom/huawei/openalliance/ad/j/a/g<Lcom/huawei/openalliance/ad/views/interfaces/f;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/openalliance/ad/e/a/d;

.field private b:Lcom/huawei/openalliance/ad/k/b/d;

.field private c:Lcom/huawei/openalliance/ad/e/a/e;

.field private d:Landroid/content/Context;

.field private e:Lcom/huawei/openalliance/ad/j/k;

.field private f:Lcom/huawei/openalliance/ad/f/a;

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/f;)V
    .locals 2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/i/a;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/j/j;->g:Z

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/j/j;->a(Lcom/huawei/openalliance/ad/i/b;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->d:Landroid/content/Context;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/e;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->a:Lcom/huawei/openalliance/ad/e/a/d;

    new-instance v0, Lcom/huawei/openalliance/ad/k/c;

    new-instance v1, Lcom/huawei/openalliance/ad/m/a/f;

    invoke-direct {v1, p1}, Lcom/huawei/openalliance/ad/m/a/f;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, p1, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->b:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->c:Lcom/huawei/openalliance/ad/e/a/e;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/j/j;)I
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/j/j;->f()I

    move-result v0

    return v0
.end method

.method private a(Landroid/graphics/Bitmap;)V
    .locals 3

    const-string v0, "SloganPresenter"

    const-string v1, "show image"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/j/d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/j;->c:Lcom/huawei/openalliance/ad/e/a/e;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/j/j;->f:Lcom/huawei/openalliance/ad/f/a;

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/j/d;-><init>(Lcom/huawei/openalliance/ad/e/a/e;Lcom/huawei/openalliance/ad/f/a;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->e:Lcom/huawei/openalliance/ad/j/k;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->e:Lcom/huawei/openalliance/ad/j/k;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/j/k;->b()V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/j;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/f;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/views/interfaces/f;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/j/j;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/j/j;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->d:Landroid/content/Context;

    new-instance v1, Lcom/huawei/openalliance/ad/j/j$4;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/j/j$4;-><init>(Lcom/huawei/openalliance/ad/j/j;)V

    invoke-static {v0, p1, v1}, Lcom/huawei/openalliance/ad/utils/o;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/openalliance/ad/utils/o$a;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/j/j;)Lcom/huawei/openalliance/ad/e/a/d;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->a:Lcom/huawei/openalliance/ad/e/a/d;

    return-object v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    const-string v0, "SloganPresenter"

    const-string v1, "show gif"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/j/j;->g:Z

    new-instance v0, Lcom/huawei/openalliance/ad/j/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/j;->c:Lcom/huawei/openalliance/ad/e/a/e;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/j/j;->f:Lcom/huawei/openalliance/ad/f/a;

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/j/c;-><init>(Lcom/huawei/openalliance/ad/e/a/e;Lcom/huawei/openalliance/ad/f/a;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->e:Lcom/huawei/openalliance/ad/j/k;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->e:Lcom/huawei/openalliance/ad/j/k;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/j/k;->b()V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/j;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/f;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/views/interfaces/f;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/views/a/c;

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->e:Lcom/huawei/openalliance/ad/j/k;

    check-cast v0, Lcom/huawei/openalliance/ad/j/c;

    invoke-virtual {v0, v3}, Lcom/huawei/openalliance/ad/j/c;->a(Lcom/huawei/openalliance/ad/views/a/c;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/j/j;)Lcom/huawei/openalliance/ad/e/a/e;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->c:Lcom/huawei/openalliance/ad/e/a/e;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/j/j;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->d:Landroid/content/Context;

    return-object v0
.end method

.method private e()I
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/j;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/f;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/f;->getDefaultSloganResId()I

    move-result v0

    return v0
.end method

.method static synthetic e(Lcom/huawei/openalliance/ad/j/j;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/j/j;->h()V

    return-void
.end method

.method private f()I
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/j;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/f;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/f;->getOrientation()I

    move-result v0

    return v0
.end method

.method private g()V
    .locals 5

    const-string v0, "SloganPresenter"

    const-string v1, "show default slogan"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/j/j;->e()I

    move-result v2

    new-instance v0, Lcom/huawei/openalliance/ad/j/j$3;

    invoke-direct {v0, p0, v2}, Lcom/huawei/openalliance/ad/j/j$3;-><init>(Lcom/huawei/openalliance/ad/j/j;I)V

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/openalliance/ad/constant/Scheme;->RES:Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/constant/Scheme;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-direct {p0, v4}, Lcom/huawei/openalliance/ad/j/j;->b(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_1
    invoke-direct {p0, v4}, Lcom/huawei/openalliance/ad/j/j;->a(Ljava/lang/String;)V

    goto :goto_1

    :goto_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/j/j;->h()V

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_1
        0x4 -> :sswitch_0
    .end sparse-switch
.end method

.method private h()V
    .locals 3

    new-instance v0, Lcom/huawei/openalliance/ad/j/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/j;->c:Lcom/huawei/openalliance/ad/e/a/e;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/j/j;->f:Lcom/huawei/openalliance/ad/f/a;

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/j/a;-><init>(Lcom/huawei/openalliance/ad/e/a/e;Lcom/huawei/openalliance/ad/f/a;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->e:Lcom/huawei/openalliance/ad/j/k;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->e:Lcom/huawei/openalliance/ad/j/k;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/j/k;->a()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/f/a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/j;->f:Lcom/huawei/openalliance/ad/f/a;

    return-void
.end method

.method public b()Z
    .locals 7

    new-instance v0, Lcom/huawei/openalliance/ad/j/j$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/j/j$1;-><init>(Lcom/huawei/openalliance/ad/j/j;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    move-object v4, v3

    new-instance v0, Lcom/huawei/openalliance/ad/j/j$2;

    invoke-direct {v0, p0, v4}, Lcom/huawei/openalliance/ad/j/j$2;-><init>(Lcom/huawei/openalliance/ad/j/j;Lcom/huawei/openalliance/ad/db/bean/SloganRecord;)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    if-nez v5, :cond_0

    new-instance v6, Lcom/huawei/openalliance/ad/k/i;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->d:Landroid/content/Context;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v6, v0, v1, v2}, Lcom/huawei/openalliance/ad/k/i;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getContentId_()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0}, Lcom/huawei/openalliance/ad/k/b/f;->a(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_0
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/j/j;->g()V

    goto/16 :goto_1

    :cond_1
    new-instance v6, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-direct {v6}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setShowId(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getParamFromServer_()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setParamFromServer_(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->b:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0, v6}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getCreativeType_()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getUrl_()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/j/j;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->b:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/k/b/d;->b()V

    goto :goto_1

    :sswitch_1
    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getUrl_()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/j/j;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->b:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/k/b/d;->b()V

    goto :goto_1

    :goto_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/j/j;->g()V

    :goto_1
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/j/j;->g:Z

    return v0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_1
        0x4 -> :sswitch_0
    .end sparse-switch
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->e:Lcom/huawei/openalliance/ad/j/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->e:Lcom/huawei/openalliance/ad/j/k;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/j/k;->c()V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->e:Lcom/huawei/openalliance/ad/j/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j;->e:Lcom/huawei/openalliance/ad/j/k;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/j/k;->a()V

    :cond_0
    return-void
.end method

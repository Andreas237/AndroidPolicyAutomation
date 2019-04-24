.class public Lcom/huawei/feedback/bean/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/bean/d$a;
    }
.end annotation


# static fields
.field private static final a:J = -0x213dcf34600cb264L


# instance fields
.field private b:I

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:I

.field private o:I

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/feedback/logic/c;>;"
        }
    .end annotation
.end field

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 326
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/feedback/bean/d;->o:I

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/feedback/bean/d;->p:Ljava/util/List;

    .line 328
    return-void
.end method

.method private constructor <init>(Lcom/huawei/feedback/bean/d$a;)V
    .locals 1

    .line 302
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/feedback/bean/d;->o:I

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/feedback/bean/d;->p:Ljava/util/List;

    .line 303
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->a(Lcom/huawei/feedback/bean/d$a;)I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/bean/d;->b:I

    .line 304
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->b(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/bean/d;->c:Ljava/lang/String;

    .line 305
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->c(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/bean/d;->d:Ljava/lang/String;

    .line 306
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->d(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/bean/d;->e:Ljava/lang/String;

    .line 307
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->e(Lcom/huawei/feedback/bean/d$a;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/bean/d;->p:Ljava/util/List;

    .line 308
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->f(Lcom/huawei/feedback/bean/d$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/feedback/bean/d;->f:Z

    .line 309
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->g(Lcom/huawei/feedback/bean/d$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/feedback/bean/d;->g:Z

    .line 310
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->h(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/bean/d;->h:Ljava/lang/String;

    .line 311
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->i(Lcom/huawei/feedback/bean/d$a;)I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/bean/d;->i:I

    .line 312
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->j(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/bean/d;->j:Ljava/lang/String;

    .line 313
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->k(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/bean/d;->k:Ljava/lang/String;

    .line 314
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->l(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/bean/d;->l:Ljava/lang/String;

    .line 315
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->m(Lcom/huawei/feedback/bean/d$a;)I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/bean/d;->n:I

    .line 318
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->n(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/bean/d;->m:Ljava/lang/String;

    .line 321
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->o(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/bean/d;->q:Ljava/lang/String;

    .line 322
    invoke-static {p1}, Lcom/huawei/feedback/bean/d$a;->p(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/bean/d;->r:Ljava/lang/String;

    .line 324
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/feedback/bean/d$a;Lcom/huawei/feedback/bean/e;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/huawei/feedback/bean/d;-><init>(Lcom/huawei/feedback/bean/d$a;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/feedback/bean/d;->m:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 103
    iput p1, p0, Lcom/huawei/feedback/bean/d;->o:I

    .line 104
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/feedback/bean/d;->m:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/feedback/logic/c;>;)V"
        }
    .end annotation

    .line 95
    iput-object p1, p0, Lcom/huawei/feedback/bean/d;->p:Ljava/util/List;

    .line 96
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 522
    iput-boolean p1, p0, Lcom/huawei/feedback/bean/d;->f:Z

    .line 523
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/feedback/logic/c;>;"
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lcom/huawei/feedback/bean/d;->p:Ljava/util/List;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 362
    iput p1, p0, Lcom/huawei/feedback/bean/d;->b:I

    .line 363
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/huawei/feedback/bean/d;->q:Ljava/lang/String;

    .line 112
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 530
    iput-boolean p1, p0, Lcom/huawei/feedback/bean/d;->g:Z

    .line 531
    return-void
.end method

.method public c()I
    .locals 1

    .line 99
    iget v0, p0, Lcom/huawei/feedback/bean/d;->o:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 370
    iput p1, p0, Lcom/huawei/feedback/bean/d;->n:I

    .line 371
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/huawei/feedback/bean/d;->r:Ljava/lang/String;

    .line 120
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/feedback/bean/d;->q:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 546
    iput p1, p0, Lcom/huawei/feedback/bean/d;->i:I

    .line 547
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 498
    iput-object p1, p0, Lcom/huawei/feedback/bean/d;->c:Ljava/lang/String;

    .line 499
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/feedback/bean/d;->r:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 506
    iput-object p1, p0, Lcom/huawei/feedback/bean/d;->d:Ljava/lang/String;

    .line 507
    return-void
.end method

.method public f()I
    .locals 1

    .line 358
    iget v0, p0, Lcom/huawei/feedback/bean/d;->b:I

    return v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 514
    iput-object p1, p0, Lcom/huawei/feedback/bean/d;->e:Ljava/lang/String;

    .line 515
    return-void
.end method

.method public g()I
    .locals 1

    .line 366
    iget v0, p0, Lcom/huawei/feedback/bean/d;->n:I

    return v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 538
    iput-object p1, p0, Lcom/huawei/feedback/bean/d;->h:Ljava/lang/String;

    .line 539
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 494
    iget-object v0, p0, Lcom/huawei/feedback/bean/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 554
    iput-object p1, p0, Lcom/huawei/feedback/bean/d;->j:Ljava/lang/String;

    .line 555
    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 502
    iget-object v0, p0, Lcom/huawei/feedback/bean/d;->d:Ljava/lang/String;

    return-object v0
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    .line 562
    iput-object p1, p0, Lcom/huawei/feedback/bean/d;->k:Ljava/lang/String;

    .line 563
    return-void
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 510
    iget-object v0, p0, Lcom/huawei/feedback/bean/d;->e:Ljava/lang/String;

    return-object v0
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    .line 570
    iput-object p1, p0, Lcom/huawei/feedback/bean/d;->l:Ljava/lang/String;

    .line 571
    return-void
.end method

.method public k()Z
    .locals 1

    .line 518
    iget-boolean v0, p0, Lcom/huawei/feedback/bean/d;->f:Z

    return v0
.end method

.method public l()Z
    .locals 1

    .line 526
    iget-boolean v0, p0, Lcom/huawei/feedback/bean/d;->g:Z

    return v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 534
    iget-object v0, p0, Lcom/huawei/feedback/bean/d;->h:Ljava/lang/String;

    return-object v0
.end method

.method public n()I
    .locals 1

    .line 542
    iget v0, p0, Lcom/huawei/feedback/bean/d;->i:I

    return v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 550
    iget-object v0, p0, Lcom/huawei/feedback/bean/d;->j:Ljava/lang/String;

    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 558
    iget-object v0, p0, Lcom/huawei/feedback/bean/d;->k:Ljava/lang/String;

    return-object v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    .line 566
    iget-object v0, p0, Lcom/huawei/feedback/bean/d;->l:Ljava/lang/String;

    return-object v0
.end method

.class public Lcom/huawei/feedback/bean/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/bean/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/feedback/logic/c;>;"
        }
    .end annotation
.end field

.field private f:Z

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:I

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/bean/d$a;->b:Ljava/lang/String;

    .line 148
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/bean/d$a;->c:Ljava/lang/String;

    .line 153
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/bean/d$a;->d:Ljava/lang/String;

    .line 157
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/feedback/bean/d$a;->e:Ljava/util/List;

    .line 161
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/bean/d$a;->f:Z

    .line 166
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/bean/d$a;->g:Z

    .line 171
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/bean/d$a;->h:Ljava/lang/String;

    .line 176
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/feedback/bean/d$a;->i:I

    .line 181
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/bean/d$a;->j:Ljava/lang/String;

    .line 183
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/bean/d$a;->k:Ljava/lang/String;

    .line 185
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/bean/d$a;->l:Ljava/lang/String;

    .line 187
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/feedback/bean/d$a;->m:I

    .line 215
    iput p1, p0, Lcom/huawei/feedback/bean/d$a;->a:I

    .line 216
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/bean/d$a;)I
    .locals 1

    .line 132
    iget v0, p0, Lcom/huawei/feedback/bean/d$a;->a:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/feedback/bean/d$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/feedback/bean/d$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/feedback/bean/d$a;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/feedback/bean/d$a;)Ljava/util/List;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/feedback/bean/d$a;->e:Ljava/util/List;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/feedback/bean/d$a;)Z
    .locals 1

    .line 132
    iget-boolean v0, p0, Lcom/huawei/feedback/bean/d$a;->f:Z

    return v0
.end method

.method static synthetic g(Lcom/huawei/feedback/bean/d$a;)Z
    .locals 1

    .line 132
    iget-boolean v0, p0, Lcom/huawei/feedback/bean/d$a;->g:Z

    return v0
.end method

.method static synthetic h(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/feedback/bean/d$a;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/feedback/bean/d$a;)I
    .locals 1

    .line 132
    iget v0, p0, Lcom/huawei/feedback/bean/d$a;->i:I

    return v0
.end method

.method static synthetic j(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/feedback/bean/d$a;->j:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/feedback/bean/d$a;->k:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic l(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/feedback/bean/d$a;->l:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/feedback/bean/d$a;)I
    .locals 1

    .line 132
    iget v0, p0, Lcom/huawei/feedback/bean/d$a;->m:I

    return v0
.end method

.method static synthetic n(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/feedback/bean/d$a;->n:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/feedback/bean/d$a;->o:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/feedback/bean/d$a;)Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/feedback/bean/d$a;->p:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/huawei/feedback/bean/d$a;
    .locals 0

    .line 255
    iput p1, p0, Lcom/huawei/feedback/bean/d$a;->i:I

    .line 256
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/huawei/feedback/bean/d$a;
    .locals 0

    .line 200
    iput-object p1, p0, Lcom/huawei/feedback/bean/d$a;->o:Ljava/lang/String;

    .line 201
    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/huawei/feedback/bean/d$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/feedback/logic/c;>;)Lcom/huawei/feedback/bean/d$a;"
        }
    .end annotation

    .line 235
    iput-object p1, p0, Lcom/huawei/feedback/bean/d$a;->e:Ljava/util/List;

    .line 236
    return-object p0
.end method

.method public a(Z)Lcom/huawei/feedback/bean/d$a;
    .locals 0

    .line 240
    iput-boolean p1, p0, Lcom/huawei/feedback/bean/d$a;->f:Z

    .line 241
    return-object p0
.end method

.method public a()Lcom/huawei/feedback/bean/d;
    .locals 2

    .line 292
    new-instance v0, Lcom/huawei/feedback/bean/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/feedback/bean/d;-><init>(Lcom/huawei/feedback/bean/d$a;Lcom/huawei/feedback/bean/e;)V

    return-object v0
.end method

.method public b(I)Lcom/huawei/feedback/bean/d$a;
    .locals 0

    .line 270
    iput p1, p0, Lcom/huawei/feedback/bean/d$a;->m:I

    .line 271
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/huawei/feedback/bean/d$a;
    .locals 0

    .line 205
    iput-object p1, p0, Lcom/huawei/feedback/bean/d$a;->p:Ljava/lang/String;

    .line 206
    return-object p0
.end method

.method public b(Z)Lcom/huawei/feedback/bean/d$a;
    .locals 0

    .line 245
    iput-boolean p1, p0, Lcom/huawei/feedback/bean/d$a;->g:Z

    .line 246
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/huawei/feedback/bean/d$a;
    .locals 0

    .line 220
    iput-object p1, p0, Lcom/huawei/feedback/bean/d$a;->b:Ljava/lang/String;

    .line 221
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/huawei/feedback/bean/d$a;
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/huawei/feedback/bean/d$a;->c:Ljava/lang/String;

    .line 226
    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/huawei/feedback/bean/d$a;
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/huawei/feedback/bean/d$a;->d:Ljava/lang/String;

    .line 231
    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/huawei/feedback/bean/d$a;
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/huawei/feedback/bean/d$a;->h:Ljava/lang/String;

    .line 251
    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/huawei/feedback/bean/d$a;
    .locals 0

    .line 260
    iput-object p1, p0, Lcom/huawei/feedback/bean/d$a;->k:Ljava/lang/String;

    .line 261
    return-object p0
.end method

.method public h(Ljava/lang/String;)Lcom/huawei/feedback/bean/d$a;
    .locals 0

    .line 265
    iput-object p1, p0, Lcom/huawei/feedback/bean/d$a;->l:Ljava/lang/String;

    .line 266
    return-object p0
.end method

.method public i(Ljava/lang/String;)Lcom/huawei/feedback/bean/d$a;
    .locals 0

    .line 277
    iput-object p1, p0, Lcom/huawei/feedback/bean/d$a;->n:Ljava/lang/String;

    .line 278
    return-object p0
.end method

.class Lcom/huawei/openalliance/ad/net/http/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/net/http/a$a;
    }
.end annotation


# static fields
.field static final a:Ljava/util/regex/Pattern;


# instance fields
.field final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<*>;"
        }
    .end annotation
.end field

.field final c:Lcom/huawei/openalliance/ad/net/http/e;

.field final d:Ljava/lang/String;

.field final e:Ljava/lang/String;

.field final f:Lcom/huawei/openalliance/ad/net/http/c;

.field final g:Ljava/lang/String;

.field final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field final i:[B

.field final j:Lcom/huawei/openalliance/ad/net/http/b/b/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/net/http/a;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method private constructor <init>(Lcom/huawei/openalliance/ad/net/http/a$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/a$a;->f:Ljava/lang/Class;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->b:Ljava/lang/Class;

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/a$a;->g:Lcom/huawei/openalliance/ad/net/http/e;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->c:Lcom/huawei/openalliance/ad/net/http/e;

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/a$a;->i:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->d:Ljava/lang/String;

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/a$a;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->e:Ljava/lang/String;

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/a$a;->j:Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->h:Ljava/util/List;

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/a$a;->l:[B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->i:[B

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/a$a;->e:Lcom/huawei/openalliance/ad/net/http/c;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->f:Lcom/huawei/openalliance/ad/net/http/c;

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/a$a;->p:Lcom/huawei/openalliance/ad/net/http/b/b/d;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->j:Lcom/huawei/openalliance/ad/net/http/b/b/d;

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/a$a;->m:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->g:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/openalliance/ad/net/http/a$a;Lcom/huawei/openalliance/ad/net/http/a$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/net/http/a;-><init>(Lcom/huawei/openalliance/ad/net/http/a$a;)V

    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->c:Lcom/huawei/openalliance/ad/net/http/e;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/net/http/e;->a()Z

    move-result v0

    return v0
.end method

.method b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->c:Lcom/huawei/openalliance/ad/net/http/e;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/net/http/e;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method c()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->c:Lcom/huawei/openalliance/ad/net/http/e;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/net/http/e;->c()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->d:Ljava/lang/String;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x2f

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a;->d:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

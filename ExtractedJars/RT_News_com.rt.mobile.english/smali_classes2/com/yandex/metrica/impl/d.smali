.class public Lcom/yandex/metrica/impl/d;
.super Lcom/yandex/metrica/impl/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/d$a;
    }
.end annotation


# instance fields
.field private final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/yandex/metrica/impl/d$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/yandex/metrica/impl/ob/nc;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nc<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/yandex/metrica/impl/ob/nc;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nc<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lcom/yandex/metrica/impl/ob/nc;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nc<",
            "[B>;"
        }
    .end annotation
.end field

.field private final j:Lcom/yandex/metrica/impl/ob/nc;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nc<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lcom/yandex/metrica/impl/ob/nc;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nc<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 45
    invoke-direct {p0}, Lcom/yandex/metrica/impl/h;-><init>()V

    .line 30
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/d;->f:Ljava/util/HashMap;

    .line 31
    new-instance v0, Lcom/yandex/metrica/impl/ob/na;

    const-string v1, "event name"

    const/16 v2, 0x3e8

    invoke-direct {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/na;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/d;->g:Lcom/yandex/metrica/impl/ob/nc;

    .line 33
    new-instance v0, Lcom/yandex/metrica/impl/ob/mz;

    const-string v1, "event value"

    const v2, 0x3c000

    invoke-direct {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/mz;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/d;->h:Lcom/yandex/metrica/impl/ob/nc;

    .line 35
    new-instance v0, Lcom/yandex/metrica/impl/ob/mt;

    const-string v1, "event value bytes"

    invoke-direct {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/mt;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/d;->i:Lcom/yandex/metrica/impl/ob/nc;

    .line 37
    new-instance v0, Lcom/yandex/metrica/impl/ob/na;

    const-string v1, "user profile id"

    const/16 v2, 0xc8

    invoke-direct {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/na;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/d;->j:Lcom/yandex/metrica/impl/ob/nc;

    .line 40
    new-instance v0, Lcom/yandex/metrica/impl/ob/na;

    const-string v1, "UserInfo"

    const/16 v2, 0x2710

    invoke-direct {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/na;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/d;->k:Lcom/yandex/metrica/impl/ob/nc;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const-string v0, ""

    .line 53
    invoke-direct {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 3

    .line 61
    invoke-direct {p0}, Lcom/yandex/metrica/impl/h;-><init>()V

    .line 30
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/d;->f:Ljava/util/HashMap;

    .line 31
    new-instance v0, Lcom/yandex/metrica/impl/ob/na;

    const-string v1, "event name"

    const/16 v2, 0x3e8

    invoke-direct {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/na;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/d;->g:Lcom/yandex/metrica/impl/ob/nc;

    .line 33
    new-instance v0, Lcom/yandex/metrica/impl/ob/mz;

    const-string v1, "event value"

    const v2, 0x3c000

    invoke-direct {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/mz;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/d;->h:Lcom/yandex/metrica/impl/ob/nc;

    .line 35
    new-instance v0, Lcom/yandex/metrica/impl/ob/mt;

    const-string v1, "event value bytes"

    invoke-direct {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/mt;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/d;->i:Lcom/yandex/metrica/impl/ob/nc;

    .line 37
    new-instance v0, Lcom/yandex/metrica/impl/ob/na;

    const-string v1, "user profile id"

    const/16 v2, 0xc8

    invoke-direct {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/na;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/d;->j:Lcom/yandex/metrica/impl/ob/nc;

    .line 40
    new-instance v0, Lcom/yandex/metrica/impl/ob/na;

    const-string v1, "UserInfo"

    const/16 v2, 0x2710

    invoke-direct {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/na;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/d;->k:Lcom/yandex/metrica/impl/ob/nc;

    .line 62
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/d;->b:Ljava/lang/String;

    .line 63
    invoke-direct {p0, p2}, Lcom/yandex/metrica/impl/d;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/d;->a:Ljava/lang/String;

    .line 64
    iput p3, p0, Lcom/yandex/metrica/impl/d;->c:I

    .line 65
    iput p4, p0, Lcom/yandex/metrica/impl/d;->d:I

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/metrica/impl/d$a;)V
    .locals 1

    .line 69
    invoke-static {p1, p2}, Lcom/yandex/metrica/impl/ob/mw;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/yandex/metrica/impl/d;->f:Ljava/util/HashMap;

    .line 72
    invoke-static {p1}, Lcom/yandex/metrica/impl/bp;->c(Ljava/lang/String;)[B

    move-result-object p1

    array-length p1, p1

    invoke-static {p2}, Lcom/yandex/metrica/impl/bp;->c(Ljava/lang/String;)[B

    move-result-object p2

    array-length p2, p2

    sub-int/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 70
    invoke-virtual {v0, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 75
    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/d;->f:Ljava/util/HashMap;

    invoke-virtual {p1, p3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    :goto_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/d;->w()V

    return-void
.end method

.method private i(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 97
    iget-object v0, p0, Lcom/yandex/metrica/impl/d;->g:Lcom/yandex/metrica/impl/ob/nc;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nc;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 98
    sget-object v1, Lcom/yandex/metrica/impl/d$a;->a:Lcom/yandex/metrica/impl/d$a;

    invoke-direct {p0, p1, v0, v1}, Lcom/yandex/metrica/impl/d;->a(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/metrica/impl/d$a;)V

    return-object v0
.end method

.method private j(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 103
    iget-object v0, p0, Lcom/yandex/metrica/impl/d;->h:Lcom/yandex/metrica/impl/ob/nc;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nc;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 104
    sget-object v1, Lcom/yandex/metrica/impl/d$a;->b:Lcom/yandex/metrica/impl/d$a;

    invoke-direct {p0, p1, v0, v1}, Lcom/yandex/metrica/impl/d;->a(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/metrica/impl/d$a;)V

    return-object v0
.end method

.method private w()V
    .locals 3

    const/4 v0, 0x0

    .line 90
    iput v0, p0, Lcom/yandex/metrica/impl/d;->e:I

    .line 91
    iget-object v0, p0, Lcom/yandex/metrica/impl/d;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 92
    iget v2, p0, Lcom/yandex/metrica/impl/d;->e:I

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v2, v1

    iput v2, p0, Lcom/yandex/metrica/impl/d;->e:I

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/yandex/metrica/impl/d;->k:Lcom/yandex/metrica/impl/ob/nc;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nc;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 116
    sget-object v1, Lcom/yandex/metrica/impl/d$a;->c:Lcom/yandex/metrica/impl/d$a;

    invoke-direct {p0, p1, v0, v1}, Lcom/yandex/metrica/impl/d;->a(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/metrica/impl/d$a;)V

    .line 117
    invoke-super {p0, v0}, Lcom/yandex/metrica/impl/h;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    return-object p1
.end method

.method public a([B)Lcom/yandex/metrica/impl/h;
    .locals 4
    .param p1    # [B
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 1109
    iget-object v0, p0, Lcom/yandex/metrica/impl/d;->i:Lcom/yandex/metrica/impl/ob/nc;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nc;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 1110
    sget-object v1, Lcom/yandex/metrica/impl/d$a;->b:Lcom/yandex/metrica/impl/d$a;

    .line 2081
    array-length v2, p1

    array-length v3, v0

    if-eq v2, v3, :cond_0

    .line 2082
    iget-object v2, p0, Lcom/yandex/metrica/impl/d;->f:Ljava/util/HashMap;

    array-length p1, p1

    array-length v3, v0

    sub-int/2addr p1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 2084
    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/d;->f:Ljava/util/HashMap;

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2086
    :goto_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/d;->w()V

    .line 132
    invoke-super {p0, v0}, Lcom/yandex/metrica/impl/h;->a([B)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 122
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/d;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/h;->b(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 127
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/h;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 138
    iget-object v0, p0, Lcom/yandex/metrica/impl/d;->j:Lcom/yandex/metrica/impl/ob/nc;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nc;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/h;->d(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    return-object p1
.end method

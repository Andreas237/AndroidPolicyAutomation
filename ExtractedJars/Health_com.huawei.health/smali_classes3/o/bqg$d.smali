.class public Lo/bqg$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bqg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private a:I

.field private b:Lo/bpv$d;

.field private c:Ljava/lang/String;

.field private d:Lo/bpz;

.field private e:Lo/bqi;

.field private f:Ljava/net/URL;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    const/4 v0, -0x1

    iput v0, p0, Lo/bqg$d;->a:I

    .line 145
    new-instance v0, Lo/bpv$d;

    invoke-direct {v0}, Lo/bpv$d;-><init>()V

    iput-object v0, p0, Lo/bqg$d;->b:Lo/bpv$d;

    .line 146
    return-void
.end method

.method static synthetic a(Lo/bqg$d;)Lo/bpv$d;
    .locals 1

    .line 134
    iget-object v0, p0, Lo/bqg$d;->b:Lo/bpv$d;

    return-object v0
.end method

.method static synthetic b(Lo/bqg$d;)Lo/bpz;
    .locals 1

    .line 134
    iget-object v0, p0, Lo/bqg$d;->d:Lo/bpz;

    return-object v0
.end method

.method static synthetic c(Lo/bqg$d;)Lo/bqi;
    .locals 1

    .line 134
    iget-object v0, p0, Lo/bqg$d;->e:Lo/bqi;

    return-object v0
.end method

.method static synthetic d(Lo/bqg$d;)Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lo/bqg$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lo/bqg$d;)I
    .locals 1

    .line 134
    iget v0, p0, Lo/bqg$d;->a:I

    return v0
.end method

.method static synthetic h(Lo/bqg$d;)Ljava/net/URL;
    .locals 1

    .line 134
    iget-object v0, p0, Lo/bqg$d;->f:Ljava/net/URL;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/net/URL;)Lo/bqg$d;
    .locals 0

    .line 235
    iput-object p1, p0, Lo/bqg$d;->f:Ljava/net/URL;

    .line 236
    return-object p0
.end method

.method public a(Ljava/util/Map;)Lo/bqg$d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;)Lo/bqg$d;"
        }
    .end annotation

    .line 180
    if-eqz p1, :cond_3

    .line 182
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map$Entry;

    .line 184
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 185
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    goto :goto_0

    .line 190
    :cond_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 192
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 194
    goto :goto_1

    .line 197
    :cond_1
    invoke-virtual {p0, v3, v5}, Lo/bqg$d;->e(Ljava/lang/String;Ljava/lang/String;)Lo/bqg$d;

    .line 198
    goto :goto_1

    .line 199
    :cond_2
    goto :goto_0

    .line 202
    :cond_3
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lo/bqg$d;
    .locals 0

    .line 164
    iput-object p1, p0, Lo/bqg$d;->c:Ljava/lang/String;

    .line 165
    return-object p0
.end method

.method public d(Lo/bqi;)Lo/bqg$d;
    .locals 0

    .line 223
    iput-object p1, p0, Lo/bqg$d;->e:Lo/bqi;

    .line 224
    return-object p0
.end method

.method public e(I)Lo/bqg$d;
    .locals 0

    .line 158
    iput p1, p0, Lo/bqg$d;->a:I

    .line 159
    return-object p0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Lo/bqg$d;
    .locals 1

    .line 211
    iget-object v0, p0, Lo/bqg$d;->b:Lo/bpv$d;

    invoke-virtual {v0, p1, p2}, Lo/bpv$d;->a(Ljava/lang/String;Ljava/lang/String;)Lo/bpv$d;

    .line 212
    return-object p0
.end method

.method public e(Lo/bpz;)Lo/bqg$d;
    .locals 0

    .line 229
    iput-object p1, p0, Lo/bqg$d;->d:Lo/bpz;

    .line 230
    return-object p0
.end method

.method public e()Lo/bqg;
    .locals 3

    .line 241
    iget v0, p0, Lo/bqg$d;->a:I

    if-gez v0, :cond_0

    .line 243
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/bqg$d;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 245
    :cond_0
    new-instance v0, Lo/bqg;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/bqg;-><init>(Lo/bqg$d;Lo/bqg$1;)V

    return-object v0
.end method

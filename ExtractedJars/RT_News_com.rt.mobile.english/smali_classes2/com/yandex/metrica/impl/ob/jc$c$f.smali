.class public final Lcom/yandex/metrica/impl/ob/jc$c$f;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jc$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# static fields
.field private static volatile g:[Lcom/yandex/metrica/impl/ob/jc$c$f;


# instance fields
.field public b:I

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Z

.field public f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2191
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 2192
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jc$c$f;->e()Lcom/yandex/metrica/impl/ob/jc$c$f;

    return-void
.end method

.method public static d()[Lcom/yandex/metrica/impl/ob/jc$c$f;
    .locals 2

    .line 2165
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$c$f;->g:[Lcom/yandex/metrica/impl/ob/jc$c$f;

    if-nez v0, :cond_1

    .line 2166
    sget-object v0, Lcom/yandex/metrica/impl/ob/c;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2168
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/jc$c$f;->g:[Lcom/yandex/metrica/impl/ob/jc$c$f;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 2169
    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jc$c$f;

    sput-object v1, Lcom/yandex/metrica/impl/ob/jc$c$f;->g:[Lcom/yandex/metrica/impl/ob/jc$c$f;

    .line 2171
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 2173
    :cond_1
    :goto_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$c$f;->g:[Lcom/yandex/metrica/impl/ob/jc$c$f;

    return-object v0
.end method


# virtual methods
.method public synthetic a(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2159
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jc$c$f;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$f;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2208
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->b:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2209
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->b:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->b(II)V

    .line 2211
    :cond_0
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->c:I

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    .line 2212
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->c:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->b(II)V

    .line 2214
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->d:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x3

    .line 2215
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 2217
    :cond_2
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->e:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    .line 2218
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->e:Z

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 2220
    :cond_3
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->f:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x5

    .line 2221
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->f:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 2223
    :cond_4
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$f;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2257
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_6

    const/16 v1, 0x8

    if-eq v0, v1, :cond_5

    const/16 v1, 0x10

    if-eq v0, v1, :cond_4

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_3

    const/16 v1, 0x20

    if-eq v0, v1, :cond_2

    const/16 v1, 0x2a

    if-eq v0, v1, :cond_1

    .line 2262
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 2284
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->f:Ljava/lang/String;

    goto :goto_0

    .line 2280
    :cond_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->e:Z

    goto :goto_0

    .line 2276
    :cond_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->d:Ljava/lang/String;

    goto :goto_0

    .line 2272
    :cond_4
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->k()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->c:I

    goto :goto_0

    .line 2268
    :cond_5
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->k()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->b:I

    goto :goto_0

    :cond_6
    return-object p0
.end method

.method protected c()I
    .locals 3

    .line 2228
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 2229
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->b:I

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 2230
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->b:I

    .line 2231
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 2233
    :cond_0
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->c:I

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    .line 2234
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->c:I

    .line 2235
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 2237
    :cond_1
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->d:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x3

    .line 2238
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->d:Ljava/lang/String;

    .line 2239
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 2241
    :cond_2
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->e:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x4

    .line 2243
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 2245
    :cond_3
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->f:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const/4 v1, 0x5

    .line 2246
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->f:Ljava/lang/String;

    .line 2247
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/jc$c$f;
    .locals 2

    const/4 v0, 0x0

    .line 2196
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->b:I

    .line 2197
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->c:I

    const-string v1, ""

    .line 2198
    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->d:Ljava/lang/String;

    .line 2199
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->e:Z

    const-string v0, ""

    .line 2200
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->f:Ljava/lang/String;

    const/4 v0, -0x1

    .line 2201
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$f;->a:I

    return-object p0
.end method

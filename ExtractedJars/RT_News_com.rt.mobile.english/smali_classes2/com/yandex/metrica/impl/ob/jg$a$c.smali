.class public final Lcom/yandex/metrica/impl/ob/jg$a$c;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jg$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public b:[B

.field public c:D

.field public d:D

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 148
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 149
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jg$a$c;->d()Lcom/yandex/metrica/impl/ob/jg$a$c;

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 119
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jg$a$c;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jg$a$c;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 164
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->b:[B

    sget-object v1, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 165
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->b:[B

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(I[B)V

    .line 167
    :cond_0
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->c:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    .line 168
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v6, v0, v4

    if-eqz v6, :cond_1

    const/4 v0, 0x2

    .line 169
    iget-wide v4, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->c:D

    invoke-virtual {p1, v0, v4, v5}, Lcom/yandex/metrica/impl/ob/b;->a(ID)V

    .line 171
    :cond_1
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->d:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    .line 172
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-eqz v4, :cond_2

    const/4 v0, 0x3

    .line 173
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->d:D

    invoke-virtual {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->a(ID)V

    .line 175
    :cond_2
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->e:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    .line 176
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->e:Z

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 178
    :cond_3
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jg$a$c;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 210
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_5

    const/16 v1, 0xa

    if-eq v0, v1, :cond_4

    const/16 v1, 0x11

    if-eq v0, v1, :cond_3

    const/16 v1, 0x19

    if-eq v0, v1, :cond_2

    const/16 v1, 0x20

    if-eq v0, v1, :cond_1

    .line 215
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 233
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->e:Z

    goto :goto_0

    .line 229
    :cond_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->c()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->d:D

    goto :goto_0

    .line 225
    :cond_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->c()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->c:D

    goto :goto_0

    .line 221
    :cond_4
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->j()[B

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->b:[B

    goto :goto_0

    :cond_5
    return-object p0
.end method

.method protected c()I
    .locals 8

    .line 183
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 184
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->b:[B

    sget-object v2, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 185
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->b:[B

    .line 186
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    .line 188
    :cond_0
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->c:D

    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    .line 189
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v7, v1, v5

    if-eqz v7, :cond_1

    const/4 v1, 0x2

    .line 191
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->d(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 193
    :cond_1
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->d:D

    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v1

    .line 194
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    const/4 v1, 0x3

    .line 196
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->d(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 198
    :cond_2
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->e:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x4

    .line 200
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    return v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/jg$a$c;
    .locals 2

    .line 153
    sget-object v0, Lcom/yandex/metrica/impl/ob/g;->c:[B

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->b:[B

    const-wide/16 v0, 0x0

    .line 154
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->c:D

    .line 155
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->d:D

    const/4 v0, 0x0

    .line 156
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->e:Z

    const/4 v0, -0x1

    .line 157
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$c;->a:I

    return-object p0
.end method

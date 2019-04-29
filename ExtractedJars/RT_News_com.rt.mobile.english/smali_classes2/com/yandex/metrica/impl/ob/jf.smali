.class public final Lcom/yandex/metrica/impl/ob/jf;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/jf$a;
    }
.end annotation


# instance fields
.field public b:I

.field public c:D

.field public d:[B

.field public e:[B

.field public f:[B

.field public g:Lcom/yandex/metrica/impl/ob/jf$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 150
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jf;->d()Lcom/yandex/metrica/impl/ob/jf;

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

    .line 14
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jf;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jf;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 167
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jf;->b:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 168
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jf;->b:I

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->b(II)V

    :cond_0
    const/4 v0, 0x2

    .line 170
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jf;->c:D

    invoke-virtual {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->a(ID)V

    const/4 v0, 0x3

    .line 171
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jf;->d:[B

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(I[B)V

    .line 172
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jf;->e:[B

    sget-object v1, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x4

    .line 173
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jf;->e:[B

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(I[B)V

    .line 175
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jf;->f:[B

    sget-object v1, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x5

    .line 176
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jf;->f:[B

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(I[B)V

    .line 178
    :cond_2
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jf;->g:Lcom/yandex/metrica/impl/ob/jf$a;

    if-eqz v0, :cond_3

    const/4 v0, 0x6

    .line 179
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jf;->g:Lcom/yandex/metrica/impl/ob/jf$a;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    .line 181
    :cond_3
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jf;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 215
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_8

    const/16 v1, 0x8

    if-eq v0, v1, :cond_7

    const/16 v1, 0x11

    if-eq v0, v1, :cond_6

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_5

    const/16 v1, 0x22

    if-eq v0, v1, :cond_4

    const/16 v1, 0x2a

    if-eq v0, v1, :cond_3

    const/16 v1, 0x32

    if-eq v0, v1, :cond_1

    .line 220
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 246
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jf;->g:Lcom/yandex/metrica/impl/ob/jf$a;

    if-nez v0, :cond_2

    .line 247
    new-instance v0, Lcom/yandex/metrica/impl/ob/jf$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jf$a;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jf;->g:Lcom/yandex/metrica/impl/ob/jf$a;

    .line 249
    :cond_2
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jf;->g:Lcom/yandex/metrica/impl/ob/jf$a;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    goto :goto_0

    .line 242
    :cond_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->j()[B

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jf;->f:[B

    goto :goto_0

    .line 238
    :cond_4
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->j()[B

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jf;->e:[B

    goto :goto_0

    .line 234
    :cond_5
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->j()[B

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jf;->d:[B

    goto :goto_0

    .line 230
    :cond_6
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->c()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jf;->c:D

    goto :goto_0

    .line 226
    :cond_7
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->k()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jf;->b:I

    goto :goto_0

    :cond_8
    return-object p0
.end method

.method protected c()I
    .locals 3

    .line 186
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 187
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jf;->b:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    .line 188
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jf;->b:I

    .line 189
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    const/4 v1, 0x2

    .line 192
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->d(I)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    .line 193
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jf;->d:[B

    .line 194
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    .line 195
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jf;->e:[B

    sget-object v2, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x4

    .line 196
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jf;->e:[B

    .line 197
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    .line 199
    :cond_1
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jf;->f:[B

    sget-object v2, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x5

    .line 200
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jf;->f:[B

    .line 201
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    .line 203
    :cond_2
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jf;->g:Lcom/yandex/metrica/impl/ob/jf$a;

    if-eqz v1, :cond_3

    const/4 v1, 0x6

    .line 204
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jf;->g:Lcom/yandex/metrica/impl/ob/jf$a;

    .line 205
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    return v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/jf;
    .locals 2

    const/4 v0, 0x1

    .line 154
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jf;->b:I

    const-wide/16 v0, 0x0

    .line 155
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jf;->c:D

    .line 156
    sget-object v0, Lcom/yandex/metrica/impl/ob/g;->c:[B

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jf;->d:[B

    .line 157
    sget-object v0, Lcom/yandex/metrica/impl/ob/g;->c:[B

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jf;->e:[B

    .line 158
    sget-object v0, Lcom/yandex/metrica/impl/ob/g;->c:[B

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jf;->f:[B

    const/4 v0, 0x0

    .line 159
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jf;->g:Lcom/yandex/metrica/impl/ob/jf$a;

    const/4 v0, -0x1

    .line 160
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jf;->a:I

    return-object p0
.end method

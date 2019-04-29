.class public final Lcom/yandex/metrica/impl/ob/jj$a$b;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jj$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 79
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 80
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jj$a$b;->d()Lcom/yandex/metrica/impl/ob/jj$a$b;

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

    .line 20
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jj$a$b;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jj$a$b;

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

    .line 105
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->b:Z

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 106
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->c:Z

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 107
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->d:Z

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 108
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->e:Z

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 109
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->f:Z

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 110
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->g:Z

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 111
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->h:Z

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 112
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->i:Z

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 113
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->j:Z

    const/16 v1, 0x9

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 114
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->k:Z

    const/16 v1, 0xa

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 115
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->l:Z

    const/16 v1, 0xb

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 116
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->m:Z

    const/16 v1, 0xc

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 117
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->n:Z

    const/16 v1, 0xd

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 118
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->o:Z

    const/16 v1, 0xe

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 119
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jj$a$b;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 161
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 166
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 224
    :sswitch_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->o:Z

    goto :goto_0

    .line 220
    :sswitch_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->n:Z

    goto :goto_0

    .line 216
    :sswitch_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->m:Z

    goto :goto_0

    .line 212
    :sswitch_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->l:Z

    goto :goto_0

    .line 208
    :sswitch_4
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->k:Z

    goto :goto_0

    .line 204
    :sswitch_5
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->j:Z

    goto :goto_0

    .line 200
    :sswitch_6
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->i:Z

    goto :goto_0

    .line 196
    :sswitch_7
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->h:Z

    goto :goto_0

    .line 192
    :sswitch_8
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->g:Z

    goto :goto_0

    .line 188
    :sswitch_9
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->f:Z

    goto :goto_0

    .line 184
    :sswitch_a
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->e:Z

    goto :goto_0

    .line 180
    :sswitch_b
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->d:Z

    goto :goto_0

    .line 176
    :sswitch_c
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->c:Z

    goto :goto_0

    .line 172
    :sswitch_d
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->b:Z

    goto :goto_0

    :sswitch_e
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_e
        0x8 -> :sswitch_d
        0x10 -> :sswitch_c
        0x18 -> :sswitch_b
        0x20 -> :sswitch_a
        0x28 -> :sswitch_9
        0x30 -> :sswitch_8
        0x38 -> :sswitch_7
        0x40 -> :sswitch_6
        0x48 -> :sswitch_5
        0x50 -> :sswitch_4
        0x58 -> :sswitch_3
        0x60 -> :sswitch_2
        0x68 -> :sswitch_1
        0x70 -> :sswitch_0
    .end sparse-switch
.end method

.method protected c()I
    .locals 2

    .line 124
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    const/4 v1, 0x1

    .line 126
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    .line 128
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    .line 130
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x4

    .line 132
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x5

    .line 134
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x6

    .line 136
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x7

    .line 138
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0x8

    .line 140
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0x9

    .line 142
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0xa

    .line 144
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0xb

    .line 146
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0xc

    .line 148
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0xd

    .line 150
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0xe

    .line 152
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/jj$a$b;
    .locals 2

    const/4 v0, 0x0

    .line 84
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->b:Z

    .line 85
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->c:Z

    .line 86
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->d:Z

    .line 87
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->e:Z

    .line 88
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->f:Z

    .line 89
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->g:Z

    const/4 v1, 0x1

    .line 90
    iput-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->h:Z

    .line 91
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->i:Z

    .line 92
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->j:Z

    .line 93
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->k:Z

    .line 94
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->l:Z

    .line 95
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->m:Z

    .line 96
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->n:Z

    .line 97
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->o:Z

    const/4 v0, -0x1

    .line 98
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$b;->a:I

    return-object p0
.end method

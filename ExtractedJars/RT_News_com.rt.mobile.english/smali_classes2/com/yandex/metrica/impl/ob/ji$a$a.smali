.class public final Lcom/yandex/metrica/impl/ob/ji$a$a;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/ji$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/ji$a$a$a;
    }
.end annotation


# static fields
.field private static volatile h:[Lcom/yandex/metrica/impl/ob/ji$a$a;


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

.field public f:J

.field public g:[I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 150
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 151
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ji$a$a;->e()Lcom/yandex/metrica/impl/ob/ji$a$a;

    return-void
.end method

.method public static d()[Lcom/yandex/metrica/impl/ob/ji$a$a;
    .locals 2

    .line 121
    sget-object v0, Lcom/yandex/metrica/impl/ob/ji$a$a;->h:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    if-nez v0, :cond_1

    .line 122
    sget-object v0, Lcom/yandex/metrica/impl/ob/c;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 124
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/ji$a$a;->h:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 125
    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/ji$a$a;

    sput-object v1, Lcom/yandex/metrica/impl/ob/ji$a$a;->h:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    .line 127
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 129
    :cond_1
    :goto_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/ji$a$a;->h:[Lcom/yandex/metrica/impl/ob/ji$a$a;

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

    .line 20
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/ji$a$a;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/ji$a$a;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 168
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->b:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 169
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->c:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 170
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->d:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    array-length v0, v0

    if-lez v0, :cond_1

    move v0, v1

    .line 172
    :goto_0
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 173
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    const/4 v3, 0x4

    .line 175
    invoke-virtual {p1, v3, v2}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x5

    .line 179
    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->f:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/yandex/metrica/impl/ob/b;->a(IJ)V

    .line 180
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    array-length v0, v0

    if-lez v0, :cond_2

    .line 181
    :goto_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    array-length v0, v0

    if-ge v1, v0, :cond_2

    const/4 v0, 0x6

    .line 182
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    aget v2, v2, v1

    invoke-virtual {p1, v0, v2}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 185
    :cond_2
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/ji$a$a;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 226
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_15

    const/16 v1, 0xa

    if-eq v0, v1, :cond_14

    const/16 v1, 0x12

    if-eq v0, v1, :cond_13

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_12

    const/16 v1, 0x22

    const/4 v2, 0x0

    if-eq v0, v1, :cond_e

    const/16 v1, 0x28

    if-eq v0, v1, :cond_d

    const/16 v1, 0x30

    if-eq v0, v1, :cond_7

    const/16 v1, 0x32

    if-eq v0, v1, :cond_1

    .line 231
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 305
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->m()I

    move-result v0

    .line 306
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->c(I)I

    move-result v0

    .line 309
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->s()I

    move-result v1

    move v3, v2

    .line 310
    :goto_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->q()I

    move-result v4

    if-lez v4, :cond_2

    .line 311
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    if-eqz v3, :cond_6

    .line 319
    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/a;->e(I)V

    .line 320
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    array-length v1, v1

    :goto_2
    add-int/2addr v3, v1

    .line 321
    new-array v3, v3, [I

    if-eqz v1, :cond_4

    .line 323
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    invoke-static {v4, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 325
    :cond_4
    :goto_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->q()I

    move-result v2

    if-lez v2, :cond_5

    .line 326
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v2

    packed-switch v2, :pswitch_data_1

    goto :goto_3

    :pswitch_1
    add-int/lit8 v4, v1, 0x1

    .line 330
    aput v2, v3, v1

    move v1, v4

    goto :goto_3

    .line 334
    :cond_5
    iput-object v3, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    .line 336
    :cond_6
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->d(I)V

    goto :goto_0

    .line 274
    :cond_7
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/g;->b(Lcom/yandex/metrica/impl/ob/a;I)I

    move-result v0

    .line 275
    new-array v1, v0, [I

    move v3, v2

    move v4, v3

    :goto_4
    if-ge v3, v0, :cond_9

    if-eqz v3, :cond_8

    .line 279
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    .line 281
    :cond_8
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v5

    packed-switch v5, :pswitch_data_2

    goto :goto_5

    :pswitch_2
    add-int/lit8 v6, v4, 0x1

    .line 285
    aput v5, v1, v4

    move v4, v6

    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_9
    if-eqz v4, :cond_0

    .line 290
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    if-nez v3, :cond_a

    move v3, v2

    goto :goto_6

    :cond_a
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    array-length v3, v3

    :goto_6
    if-nez v3, :cond_b

    if-ne v4, v0, :cond_b

    .line 292
    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    goto/16 :goto_0

    :cond_b
    add-int v0, v3, v4

    .line 294
    new-array v0, v0, [I

    if-eqz v3, :cond_c

    .line 296
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    invoke-static {v5, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 298
    :cond_c
    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 299
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    goto/16 :goto_0

    .line 269
    :cond_d
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->f:J

    goto/16 :goto_0

    .line 250
    :cond_e
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/g;->b(Lcom/yandex/metrica/impl/ob/a;I)I

    move-result v0

    .line 251
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_7

    :cond_f
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    array-length v1, v1

    :goto_7
    add-int/2addr v0, v1

    .line 252
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    if-eqz v1, :cond_10

    .line 255
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 257
    :cond_10
    :goto_8
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_11

    .line 258
    new-instance v2, Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/ji$a$a$a;-><init>()V

    aput-object v2, v0, v1

    .line 259
    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 260
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    .line 263
    :cond_11
    new-instance v2, Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/ji$a$a$a;-><init>()V

    aput-object v2, v0, v1

    .line 264
    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 265
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    goto/16 :goto_0

    .line 245
    :cond_12
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->d:Ljava/lang/String;

    goto/16 :goto_0

    .line 241
    :cond_13
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->c:Ljava/lang/String;

    goto/16 :goto_0

    .line 237
    :cond_14
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->b:Ljava/lang/String;

    goto/16 :goto_0

    :cond_15
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method protected c()I
    .locals 6

    .line 190
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 191
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->b:Ljava/lang/String;

    const/4 v2, 0x1

    .line 192
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 193
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->c:Ljava/lang/String;

    const/4 v3, 0x2

    .line 194
    invoke-static {v3, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 195
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->d:Ljava/lang/String;

    const/4 v3, 0x3

    .line 196
    invoke-static {v3, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 197
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    array-length v1, v1

    if-lez v1, :cond_2

    move v1, v0

    move v0, v3

    .line 198
    :goto_0
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    array-length v4, v4

    if-ge v0, v4, :cond_1

    .line 199
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    aget-object v4, v4, v0

    if-eqz v4, :cond_0

    const/4 v5, 0x4

    .line 202
    invoke-static {v5, v4}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v4

    add-int/2addr v1, v4

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    :cond_2
    const/4 v1, 0x5

    .line 206
    iget-wide v4, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->f:J

    .line 207
    invoke-static {v1, v4, v5}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 208
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    array-length v1, v1

    if-lez v1, :cond_4

    move v1, v3

    .line 210
    :goto_1
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    array-length v4, v4

    if-ge v3, v4, :cond_3

    .line 211
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    aget v4, v4, v3

    .line 213
    invoke-static {v4}, Lcom/yandex/metrica/impl/ob/b;->g(I)I

    move-result v4

    add-int/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    add-int/2addr v0, v1

    .line 216
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    array-length v1, v1

    mul-int/2addr v2, v1

    add-int/2addr v0, v2

    :cond_4
    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/ji$a$a;
    .locals 2

    const-string v0, ""

    .line 155
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->b:Ljava/lang/String;

    const-string v0, ""

    .line 156
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->c:Ljava/lang/String;

    const-string v0, ""

    .line 157
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->d:Ljava/lang/String;

    .line 158
    invoke-static {}, Lcom/yandex/metrica/impl/ob/ji$a$a$a;->d()[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    const-wide/16 v0, 0x0

    .line 159
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->f:J

    .line 160
    sget-object v0, Lcom/yandex/metrica/impl/ob/g;->a:[I

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    const/4 v0, -0x1

    .line 161
    iput v0, p0, Lcom/yandex/metrica/impl/ob/ji$a$a;->a:I

    return-object p0
.end method

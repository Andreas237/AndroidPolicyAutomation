.class public final Lcom/yandex/metrica/impl/ob/jg$a$a;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jg$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static volatile f:[Lcom/yandex/metrica/impl/ob/jg$a$a;


# instance fields
.field public b:[B

.field public c:I

.field public d:Lcom/yandex/metrica/impl/ob/jg$a$b;

.field public e:Lcom/yandex/metrica/impl/ob/jg$a$c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 287
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 288
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jg$a$a;->e()Lcom/yandex/metrica/impl/ob/jg$a$a;

    return-void
.end method

.method public static d()[Lcom/yandex/metrica/impl/ob/jg$a$a;
    .locals 2

    .line 264
    sget-object v0, Lcom/yandex/metrica/impl/ob/jg$a$a;->f:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    if-nez v0, :cond_1

    .line 265
    sget-object v0, Lcom/yandex/metrica/impl/ob/c;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 267
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/jg$a$a;->f:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 268
    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jg$a$a;

    sput-object v1, Lcom/yandex/metrica/impl/ob/jg$a$a;->f:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    .line 270
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 272
    :cond_1
    :goto_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/jg$a$a;->f:[Lcom/yandex/metrica/impl/ob/jg$a$a;

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

    .line 252
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jg$a$a;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jg$a$a;

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

    .line 303
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->b:[B

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(I[B)V

    .line 304
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->c:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    .line 305
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->d:Lcom/yandex/metrica/impl/ob/jg$a$b;

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    .line 306
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->d:Lcom/yandex/metrica/impl/ob/jg$a$b;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    .line 308
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->e:Lcom/yandex/metrica/impl/ob/jg$a$c;

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    .line 309
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->e:Lcom/yandex/metrica/impl/ob/jg$a$c;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    .line 311
    :cond_1
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jg$a$a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 337
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_7

    const/16 v1, 0xa

    if-eq v0, v1, :cond_6

    const/16 v1, 0x10

    if-eq v0, v1, :cond_5

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_3

    const/16 v1, 0x22

    if-eq v0, v1, :cond_1

    .line 342
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 371
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->e:Lcom/yandex/metrica/impl/ob/jg$a$c;

    if-nez v0, :cond_2

    .line 372
    new-instance v0, Lcom/yandex/metrica/impl/ob/jg$a$c;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jg$a$c;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->e:Lcom/yandex/metrica/impl/ob/jg$a$c;

    .line 374
    :cond_2
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->e:Lcom/yandex/metrica/impl/ob/jg$a$c;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    goto :goto_0

    .line 364
    :cond_3
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->d:Lcom/yandex/metrica/impl/ob/jg$a$b;

    if-nez v0, :cond_4

    .line 365
    new-instance v0, Lcom/yandex/metrica/impl/ob/jg$a$b;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jg$a$b;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->d:Lcom/yandex/metrica/impl/ob/jg$a$b;

    .line 367
    :cond_4
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->d:Lcom/yandex/metrica/impl/ob/jg$a$b;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    goto :goto_0

    .line 352
    :cond_5
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 358
    :pswitch_0
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->c:I

    goto :goto_0

    .line 348
    :cond_6
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->j()[B

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->b:[B

    goto :goto_0

    :cond_7
    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method protected c()I
    .locals 3

    .line 316
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 317
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->b:[B

    const/4 v2, 0x1

    .line 318
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    .line 319
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->c:I

    const/4 v2, 0x2

    .line 320
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 321
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->d:Lcom/yandex/metrica/impl/ob/jg$a$b;

    if-eqz v1, :cond_0

    const/4 v1, 0x3

    .line 322
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->d:Lcom/yandex/metrica/impl/ob/jg$a$b;

    .line 323
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v1

    add-int/2addr v0, v1

    .line 325
    :cond_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->e:Lcom/yandex/metrica/impl/ob/jg$a$c;

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    .line 326
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->e:Lcom/yandex/metrica/impl/ob/jg$a$c;

    .line 327
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/jg$a$a;
    .locals 1

    .line 292
    sget-object v0, Lcom/yandex/metrica/impl/ob/g;->c:[B

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->b:[B

    const/4 v0, 0x0

    .line 293
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->c:I

    const/4 v0, 0x0

    .line 294
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->d:Lcom/yandex/metrica/impl/ob/jg$a$b;

    .line 295
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->e:Lcom/yandex/metrica/impl/ob/jg$a$c;

    const/4 v0, -0x1

    .line 296
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->a:I

    return-object p0
.end method

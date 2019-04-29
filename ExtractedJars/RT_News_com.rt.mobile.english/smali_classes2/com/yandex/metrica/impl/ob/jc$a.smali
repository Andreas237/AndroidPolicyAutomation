.class public final Lcom/yandex/metrica/impl/ob/jc$a;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static volatile k:[Lcom/yandex/metrica/impl/ob/jc$a;


# instance fields
.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Ljava/lang/String;

.field public h:Z

.field public i:I

.field public j:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3209
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 3210
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jc$a;->e()Lcom/yandex/metrica/impl/ob/jc$a;

    return-void
.end method

.method public static d()[Lcom/yandex/metrica/impl/ob/jc$a;
    .locals 2

    .line 3171
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$a;->k:[Lcom/yandex/metrica/impl/ob/jc$a;

    if-nez v0, :cond_1

    .line 3172
    sget-object v0, Lcom/yandex/metrica/impl/ob/c;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 3174
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/jc$a;->k:[Lcom/yandex/metrica/impl/ob/jc$a;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 3175
    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jc$a;

    sput-object v1, Lcom/yandex/metrica/impl/ob/jc$a;->k:[Lcom/yandex/metrica/impl/ob/jc$a;

    .line 3177
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 3179
    :cond_1
    :goto_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$a;->k:[Lcom/yandex/metrica/impl/ob/jc$a;

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

    .line 3158
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jc$a;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$a;

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

    .line 3230
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    .line 3231
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$a;->b:I

    invoke-virtual {p1, v0, v2}, Lcom/yandex/metrica/impl/ob/b;->b(II)V

    .line 3233
    :cond_0
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->c:I

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    .line 3234
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$a;->c:I

    invoke-virtual {p1, v0, v2}, Lcom/yandex/metrica/impl/ob/b;->c(II)V

    .line 3236
    :cond_1
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->d:I

    if-eq v0, v1, :cond_2

    const/4 v0, 0x3

    .line 3237
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$a;->d:I

    invoke-virtual {p1, v0, v2}, Lcom/yandex/metrica/impl/ob/b;->b(II)V

    .line 3239
    :cond_2
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->e:I

    if-eq v0, v1, :cond_3

    const/4 v0, 0x4

    .line 3240
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$a;->e:I

    invoke-virtual {p1, v0, v2}, Lcom/yandex/metrica/impl/ob/b;->b(II)V

    .line 3242
    :cond_3
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->f:I

    if-eq v0, v1, :cond_4

    const/4 v0, 0x5

    .line 3243
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$a;->f:I

    invoke-virtual {p1, v0, v2}, Lcom/yandex/metrica/impl/ob/b;->b(II)V

    .line 3245
    :cond_4
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->g:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x6

    .line 3246
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$a;->g:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 3248
    :cond_5
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->h:Z

    if-eqz v0, :cond_6

    const/4 v0, 0x7

    .line 3249
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/jc$a;->h:Z

    invoke-virtual {p1, v0, v2}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 3251
    :cond_6
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->i:I

    if-eqz v0, :cond_7

    const/16 v0, 0x8

    .line 3252
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$a;->i:I

    invoke-virtual {p1, v0, v2}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    .line 3254
    :cond_7
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->j:I

    if-eq v0, v1, :cond_8

    const/16 v0, 0x9

    .line 3255
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$a;->j:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->b(II)V

    .line 3257
    :cond_8
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3307
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_a

    const/16 v1, 0x8

    if-eq v0, v1, :cond_9

    const/16 v1, 0x10

    if-eq v0, v1, :cond_8

    const/16 v1, 0x18

    if-eq v0, v1, :cond_7

    const/16 v1, 0x20

    if-eq v0, v1, :cond_6

    const/16 v1, 0x28

    if-eq v0, v1, :cond_5

    const/16 v1, 0x32

    if-eq v0, v1, :cond_4

    const/16 v1, 0x38

    if-eq v0, v1, :cond_3

    const/16 v1, 0x40

    if-eq v0, v1, :cond_2

    const/16 v1, 0x48

    if-eq v0, v1, :cond_1

    .line 3312
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 3359
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->k()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->j:I

    goto :goto_0

    .line 3346
    :cond_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 3353
    :pswitch_0
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->i:I

    goto :goto_0

    .line 3342
    :cond_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->h:Z

    goto :goto_0

    .line 3338
    :cond_4
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->g:Ljava/lang/String;

    goto :goto_0

    .line 3334
    :cond_5
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->k()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->f:I

    goto :goto_0

    .line 3330
    :cond_6
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->k()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->e:I

    goto :goto_0

    .line 3326
    :cond_7
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->k()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->d:I

    goto :goto_0

    .line 3322
    :cond_8
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->l()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->c:I

    goto :goto_0

    .line 3318
    :cond_9
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->k()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->b:I

    goto :goto_0

    :cond_a
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method protected c()I
    .locals 4

    .line 3262
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 3263
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$a;->b:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v1, 0x1

    .line 3264
    iget v3, p0, Lcom/yandex/metrica/impl/ob/jc$a;->b:I

    .line 3265
    invoke-static {v1, v3}, Lcom/yandex/metrica/impl/ob/b;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 3267
    :cond_0
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$a;->c:I

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    .line 3268
    iget v3, p0, Lcom/yandex/metrica/impl/ob/jc$a;->c:I

    .line 3269
    invoke-static {v1, v3}, Lcom/yandex/metrica/impl/ob/b;->f(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 3271
    :cond_1
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$a;->d:I

    if-eq v1, v2, :cond_2

    const/4 v1, 0x3

    .line 3272
    iget v3, p0, Lcom/yandex/metrica/impl/ob/jc$a;->d:I

    .line 3273
    invoke-static {v1, v3}, Lcom/yandex/metrica/impl/ob/b;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 3275
    :cond_2
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$a;->e:I

    if-eq v1, v2, :cond_3

    const/4 v1, 0x4

    .line 3276
    iget v3, p0, Lcom/yandex/metrica/impl/ob/jc$a;->e:I

    .line 3277
    invoke-static {v1, v3}, Lcom/yandex/metrica/impl/ob/b;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 3279
    :cond_3
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$a;->f:I

    if-eq v1, v2, :cond_4

    const/4 v1, 0x5

    .line 3280
    iget v3, p0, Lcom/yandex/metrica/impl/ob/jc$a;->f:I

    .line 3281
    invoke-static {v1, v3}, Lcom/yandex/metrica/impl/ob/b;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 3283
    :cond_4
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$a;->g:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x6

    .line 3284
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jc$a;->g:Ljava/lang/String;

    .line 3285
    invoke-static {v1, v3}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 3287
    :cond_5
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jc$a;->h:Z

    if-eqz v1, :cond_6

    const/4 v1, 0x7

    .line 3289
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 3291
    :cond_6
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$a;->i:I

    if-eqz v1, :cond_7

    const/16 v1, 0x8

    .line 3292
    iget v3, p0, Lcom/yandex/metrica/impl/ob/jc$a;->i:I

    .line 3293
    invoke-static {v1, v3}, Lcom/yandex/metrica/impl/ob/b;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 3295
    :cond_7
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$a;->j:I

    if-eq v1, v2, :cond_8

    const/16 v1, 0x9

    .line 3296
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$a;->j:I

    .line 3297
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/jc$a;
    .locals 3

    const/4 v0, -0x1

    .line 3214
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->b:I

    const/4 v1, 0x0

    .line 3215
    iput v1, p0, Lcom/yandex/metrica/impl/ob/jc$a;->c:I

    .line 3216
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->d:I

    .line 3217
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->e:I

    .line 3218
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->f:I

    const-string v2, ""

    .line 3219
    iput-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$a;->g:Ljava/lang/String;

    .line 3220
    iput-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jc$a;->h:Z

    .line 3221
    iput v1, p0, Lcom/yandex/metrica/impl/ob/jc$a;->i:I

    .line 3222
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->j:I

    .line 3223
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$a;->a:I

    return-object p0
.end method

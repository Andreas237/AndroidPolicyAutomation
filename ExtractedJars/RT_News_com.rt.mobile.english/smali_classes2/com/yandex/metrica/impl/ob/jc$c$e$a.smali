.class public final Lcom/yandex/metrica/impl/ob/jc$c$e$a;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jc$c$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;,
        Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;
    }
.end annotation


# static fields
.field private static volatile p:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;


# instance fields
.field public b:J

.field public c:J

.field public d:I

.field public e:Ljava/lang/String;

.field public f:[B

.field public g:Lcom/yandex/metrica/impl/ob/jc$c$b;

.field public h:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

.field public i:Ljava/lang/String;

.field public j:Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;

.field public k:I

.field public l:I

.field public m:I

.field public n:[B

.field public o:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1208
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 1209
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->e()Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    return-void
.end method

.method public static d()[Lcom/yandex/metrica/impl/ob/jc$c$e$a;
    .locals 2

    .line 1155
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->p:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    if-nez v0, :cond_1

    .line 1156
    sget-object v0, Lcom/yandex/metrica/impl/ob/c;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 1158
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->p:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 1159
    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    sput-object v1, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->p:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    .line 1161
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 1163
    :cond_1
    :goto_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->p:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

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

    .line 701
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$e$a;

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

    .line 1234
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->b:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IJ)V

    .line 1235
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->c:J

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IJ)V

    .line 1236
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->d:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->b(II)V

    .line 1237
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->e:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x4

    .line 1238
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 1240
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->f:[B

    sget-object v1, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x5

    .line 1241
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->f:[B

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(I[B)V

    .line 1243
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->g:Lcom/yandex/metrica/impl/ob/jc$c$b;

    if-eqz v0, :cond_2

    const/4 v0, 0x6

    .line 1244
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->g:Lcom/yandex/metrica/impl/ob/jc$c$b;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    .line 1246
    :cond_2
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->h:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

    if-eqz v0, :cond_3

    const/4 v0, 0x7

    .line 1247
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->h:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    .line 1249
    :cond_3
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->i:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const/16 v0, 0x8

    .line 1250
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->i:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 1252
    :cond_4
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->j:Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;

    if-eqz v0, :cond_5

    const/16 v0, 0x9

    .line 1253
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->j:Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    .line 1255
    :cond_5
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->k:I

    if-eqz v0, :cond_6

    const/16 v0, 0xa

    .line 1256
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->k:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->b(II)V

    .line 1258
    :cond_6
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->l:I

    if-eqz v0, :cond_7

    const/16 v0, 0xc

    .line 1259
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->l:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    .line 1261
    :cond_7
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->m:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    const/16 v0, 0xd

    .line 1262
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->m:I

    invoke-virtual {p1, v0, v2}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    .line 1264
    :cond_8
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->n:[B

    sget-object v2, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_9

    const/16 v0, 0xe

    .line 1265
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->n:[B

    invoke-virtual {p1, v0, v2}, Lcom/yandex/metrica/impl/ob/b;->a(I[B)V

    .line 1267
    :cond_9
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->o:I

    if-eq v0, v1, :cond_a

    const/16 v0, 0xf

    .line 1268
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->o:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    .line 1270
    :cond_a
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$e$a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1334
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 1339
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 1419
    :sswitch_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1424
    :pswitch_0
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->o:I

    goto :goto_0

    .line 1415
    :sswitch_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->j()[B

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->n:[B

    goto :goto_0

    .line 1404
    :sswitch_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 1409
    :pswitch_1
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->m:I

    goto :goto_0

    .line 1394
    :sswitch_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v0

    packed-switch v0, :pswitch_data_2

    goto :goto_0

    .line 1398
    :pswitch_2
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->l:I

    goto :goto_0

    .line 1390
    :sswitch_4
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->k()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->k:I

    goto :goto_0

    .line 1383
    :sswitch_5
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->j:Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;

    if-nez v0, :cond_1

    .line 1384
    new-instance v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->j:Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;

    .line 1386
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->j:Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    goto :goto_0

    .line 1379
    :sswitch_6
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->i:Ljava/lang/String;

    goto :goto_0

    .line 1372
    :sswitch_7
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->h:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

    if-nez v0, :cond_2

    .line 1373
    new-instance v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->h:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

    .line 1375
    :cond_2
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->h:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    goto :goto_0

    .line 1365
    :sswitch_8
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->g:Lcom/yandex/metrica/impl/ob/jc$c$b;

    if-nez v0, :cond_3

    .line 1366
    new-instance v0, Lcom/yandex/metrica/impl/ob/jc$c$b;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jc$c$b;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->g:Lcom/yandex/metrica/impl/ob/jc$c$b;

    .line 1368
    :cond_3
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->g:Lcom/yandex/metrica/impl/ob/jc$c$b;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    goto :goto_0

    .line 1361
    :sswitch_9
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->j()[B

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->f:[B

    goto :goto_0

    .line 1357
    :sswitch_a
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->e:Ljava/lang/String;

    goto/16 :goto_0

    .line 1353
    :sswitch_b
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->k()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->d:I

    goto/16 :goto_0

    .line 1349
    :sswitch_c
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->c:J

    goto/16 :goto_0

    .line 1345
    :sswitch_d
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->b:J

    goto/16 :goto_0

    :sswitch_e
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_e
        0x8 -> :sswitch_d
        0x10 -> :sswitch_c
        0x18 -> :sswitch_b
        0x22 -> :sswitch_a
        0x2a -> :sswitch_9
        0x32 -> :sswitch_8
        0x3a -> :sswitch_7
        0x42 -> :sswitch_6
        0x4a -> :sswitch_5
        0x50 -> :sswitch_4
        0x60 -> :sswitch_3
        0x68 -> :sswitch_2
        0x72 -> :sswitch_1
        0x78 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method protected c()I
    .locals 4

    .line 1275
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 1276
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->b:J

    const/4 v3, 0x1

    .line 1277
    invoke-static {v3, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 1278
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->c:J

    const/4 v3, 0x2

    .line 1279
    invoke-static {v3, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 1280
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->d:I

    const/4 v2, 0x3

    .line 1281
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 1282
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->e:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x4

    .line 1283
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->e:Ljava/lang/String;

    .line 1284
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1286
    :cond_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->f:[B

    sget-object v2, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x5

    .line 1287
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->f:[B

    .line 1288
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    .line 1290
    :cond_1
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->g:Lcom/yandex/metrica/impl/ob/jc$c$b;

    if-eqz v1, :cond_2

    const/4 v1, 0x6

    .line 1291
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->g:Lcom/yandex/metrica/impl/ob/jc$c$b;

    .line 1292
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1294
    :cond_2
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->h:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

    if-eqz v1, :cond_3

    const/4 v1, 0x7

    .line 1295
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->h:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

    .line 1296
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1298
    :cond_3
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->i:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const/16 v1, 0x8

    .line 1299
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->i:Ljava/lang/String;

    .line 1300
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1302
    :cond_4
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->j:Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;

    if-eqz v1, :cond_5

    const/16 v1, 0x9

    .line 1303
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->j:Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;

    .line 1304
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1306
    :cond_5
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->k:I

    if-eqz v1, :cond_6

    const/16 v1, 0xa

    .line 1307
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->k:I

    .line 1308
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 1310
    :cond_6
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->l:I

    if-eqz v1, :cond_7

    const/16 v1, 0xc

    .line 1311
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->l:I

    .line 1312
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 1314
    :cond_7
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->m:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_8

    const/16 v1, 0xd

    .line 1315
    iget v3, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->m:I

    .line 1316
    invoke-static {v1, v3}, Lcom/yandex/metrica/impl/ob/b;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 1318
    :cond_8
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->n:[B

    sget-object v3, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_9

    const/16 v1, 0xe

    .line 1319
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->n:[B

    .line 1320
    invoke-static {v1, v3}, Lcom/yandex/metrica/impl/ob/b;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    .line 1322
    :cond_9
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->o:I

    if-eq v1, v2, :cond_a

    const/16 v1, 0xf

    .line 1323
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->o:I

    .line 1324
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/jc$c$e$a;
    .locals 3

    const-wide/16 v0, 0x0

    .line 1213
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->b:J

    .line 1214
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->c:J

    const/4 v0, 0x0

    .line 1215
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->d:I

    const-string v1, ""

    .line 1216
    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->e:Ljava/lang/String;

    .line 1217
    sget-object v1, Lcom/yandex/metrica/impl/ob/g;->c:[B

    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->f:[B

    const/4 v1, 0x0

    .line 1218
    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->g:Lcom/yandex/metrica/impl/ob/jc$c$b;

    .line 1219
    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->h:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

    const-string v2, ""

    .line 1220
    iput-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->i:Ljava/lang/String;

    .line 1221
    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->j:Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;

    .line 1222
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->k:I

    .line 1223
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->l:I

    const/4 v0, -0x1

    .line 1224
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->m:I

    .line 1225
    sget-object v1, Lcom/yandex/metrica/impl/ob/g;->c:[B

    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->n:[B

    .line 1226
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->o:I

    .line 1227
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->a:I

    return-object p0
.end method

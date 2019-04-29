.class Lcom/yandex/metrica/impl/ob/ak$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/js$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/ak;-><init>(Lcom/yandex/metrica/impl/ob/jv$b;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/js$a<",
        "Lcom/yandex/metrica/impl/ob/jv$a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/jv$a;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/jv$a;
    .locals 30
    .param p1    # Lcom/yandex/metrica/impl/ob/jv$a;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    move-object/from16 v0, p1

    .line 32
    invoke-virtual/range {p2 .. p2}, Lcom/yandex/metrica/impl/ob/t;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object v1

    if-nez v0, :cond_0

    .line 1366
    new-instance v0, Lcom/yandex/metrica/impl/ob/jv$a;

    .line 1367
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->e()Ljava/lang/String;

    move-result-object v3

    .line 1368
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->h()Ljava/lang/String;

    move-result-object v4

    .line 1369
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->i()Ljava/lang/String;

    move-result-object v5

    .line 1370
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->f()Ljava/lang/String;

    move-result-object v6

    .line 1371
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->g()Ljava/lang/Boolean;

    move-result-object v7

    .line 1372
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->l()Landroid/location/Location;

    move-result-object v8

    .line 1373
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->n()Ljava/lang/Boolean;

    move-result-object v9

    .line 1374
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->m()Ljava/lang/Boolean;

    move-result-object v10

    .line 1375
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->j()Lcom/yandex/metrica/CounterConfiguration$a;

    move-result-object v11

    .line 1376
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->d()Ljava/lang/Integer;

    move-result-object v12

    .line 1377
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->c()Ljava/lang/Integer;

    move-result-object v13

    .line 1378
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->b()Ljava/lang/Integer;

    move-result-object v14

    .line 1379
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->k()Ljava/lang/Boolean;

    move-result-object v15

    move-object v2, v0

    invoke-direct/range {v2 .. v15}, Lcom/yandex/metrica/impl/ob/jv$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Landroid/location/Location;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/yandex/metrica/CounterConfiguration$a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-object v0

    .line 1338
    :cond_0
    new-instance v2, Lcom/yandex/metrica/impl/ob/jv$a;

    .line 1339
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->e()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/yandex/metrica/impl/ob/jv$a;->a:Ljava/lang/String;

    if-nez v3, :cond_1

    move-object v3, v4

    :cond_1
    move-object/from16 v17, v3

    check-cast v17, Ljava/lang/String;

    .line 1340
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->h()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/yandex/metrica/impl/ob/jv$a;->b:Ljava/lang/String;

    if-nez v3, :cond_2

    move-object v3, v4

    :cond_2
    move-object/from16 v18, v3

    check-cast v18, Ljava/lang/String;

    .line 1342
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->i()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/yandex/metrica/impl/ob/jv$a;->c:Ljava/lang/String;

    if-nez v3, :cond_3

    move-object v3, v4

    .line 1341
    :cond_3
    move-object/from16 v19, v3

    check-cast v19, Ljava/lang/String;

    .line 1343
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->f()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/yandex/metrica/impl/ob/jv$a;->d:Ljava/lang/String;

    if-nez v3, :cond_4

    move-object v3, v4

    :cond_4
    move-object/from16 v20, v3

    check-cast v20, Ljava/lang/String;

    .line 1345
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->g()Ljava/lang/Boolean;

    move-result-object v3

    iget-object v4, v0, Lcom/yandex/metrica/impl/ob/jv$a;->e:Ljava/lang/Boolean;

    if-nez v3, :cond_5

    move-object v3, v4

    .line 1344
    :cond_5
    move-object/from16 v21, v3

    check-cast v21, Ljava/lang/Boolean;

    .line 1347
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->l()Landroid/location/Location;

    move-result-object v3

    iget-object v4, v0, Lcom/yandex/metrica/impl/ob/jv$a;->f:Landroid/location/Location;

    if-nez v3, :cond_6

    move-object v3, v4

    .line 1346
    :cond_6
    move-object/from16 v22, v3

    check-cast v22, Landroid/location/Location;

    .line 1349
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->n()Ljava/lang/Boolean;

    move-result-object v3

    iget-object v4, v0, Lcom/yandex/metrica/impl/ob/jv$a;->g:Ljava/lang/Boolean;

    if-nez v3, :cond_7

    move-object v3, v4

    .line 1348
    :cond_7
    move-object/from16 v23, v3

    check-cast v23, Ljava/lang/Boolean;

    .line 1351
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->m()Ljava/lang/Boolean;

    move-result-object v3

    iget-object v4, v0, Lcom/yandex/metrica/impl/ob/jv$a;->h:Ljava/lang/Boolean;

    if-nez v3, :cond_8

    move-object v3, v4

    .line 1350
    :cond_8
    move-object/from16 v24, v3

    check-cast v24, Ljava/lang/Boolean;

    .line 1353
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->j()Lcom/yandex/metrica/CounterConfiguration$a;

    move-result-object v25

    .line 1355
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->d()Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, v0, Lcom/yandex/metrica/impl/ob/jv$a;->i:Ljava/lang/Integer;

    if-nez v3, :cond_9

    move-object v3, v4

    .line 1354
    :cond_9
    move-object/from16 v26, v3

    check-cast v26, Ljava/lang/Integer;

    .line 1357
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->c()Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, v0, Lcom/yandex/metrica/impl/ob/jv$a;->j:Ljava/lang/Integer;

    if-nez v3, :cond_a

    move-object v3, v4

    .line 1356
    :cond_a
    move-object/from16 v27, v3

    check-cast v27, Ljava/lang/Integer;

    .line 1359
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->b()Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, v0, Lcom/yandex/metrica/impl/ob/jv$a;->k:Ljava/lang/Integer;

    if-nez v3, :cond_b

    move-object v3, v4

    .line 1358
    :cond_b
    move-object/from16 v28, v3

    check-cast v28, Ljava/lang/Integer;

    .line 1360
    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->k()Ljava/lang/Boolean;

    move-result-object v1

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/jv$a;->l:Ljava/lang/Boolean;

    if-nez v1, :cond_c

    goto :goto_0

    :cond_c
    move-object v0, v1

    :goto_0
    move-object/from16 v29, v0

    check-cast v29, Ljava/lang/Boolean;

    move-object/from16 v16, v2

    invoke-direct/range {v16 .. v29}, Lcom/yandex/metrica/impl/ob/jv$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Landroid/location/Location;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/yandex/metrica/CounterConfiguration$a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-object v2
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/yandex/metrica/impl/ob/t;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 26
    check-cast p1, Lcom/yandex/metrica/impl/ob/jv$a;

    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/ak$1;->a(Lcom/yandex/metrica/impl/ob/jv$a;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/jv$a;

    move-result-object p1

    return-object p1
.end method

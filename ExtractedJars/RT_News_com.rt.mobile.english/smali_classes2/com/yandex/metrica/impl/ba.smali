.class Lcom/yandex/metrica/impl/ba;
.super Lcom/yandex/metrica/impl/az;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/az;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    return-void
.end method


# virtual methods
.method protected E()J
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0
.end method

.method protected F()J
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0
.end method

.method protected I()Lcom/yandex/metrica/impl/az$c;
    .locals 10

    const/4 v0, 0x0

    .line 40
    :try_start_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ba;->J()Landroid/database/Cursor;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v1, :cond_0

    .line 42
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :catchall_0
    move-exception v2

    move-object v9, v2

    move-object v2, v0

    move-object v0, v9

    goto :goto_2

    .line 43
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/yandex/metrica/impl/ba;->m:Lcom/yandex/metrica/impl/ob/es;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ba;->E()J

    move-result-wide v3

    sget-object v5, Lcom/yandex/metrica/impl/ob/dr;->b:Lcom/yandex/metrica/impl/ob/dr;

    invoke-virtual {v2, v3, v4, v5}, Lcom/yandex/metrica/impl/ob/es;->a(JLcom/yandex/metrica/impl/ob/dr;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    .line 44
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 45
    iget-object v3, p0, Lcom/yandex/metrica/impl/ba;->m:Lcom/yandex/metrica/impl/ob/es;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ba;->E()J

    move-result-wide v4

    sget-object v6, Lcom/yandex/metrica/impl/ob/dr;->b:Lcom/yandex/metrica/impl/ob/dr;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual/range {v3 .. v8}, Lcom/yandex/metrica/impl/ob/es;->a(JLcom/yandex/metrica/impl/ob/dr;J)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :catch_0
    :cond_1
    :goto_1
    move-object v0, v2

    goto :goto_3

    :catchall_2
    move-exception v2

    move-object v1, v0

    move-object v0, v2

    move-object v2, v1

    .line 51
    :goto_2
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 52
    invoke-static {v2}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 53
    throw v0

    :catch_1
    move-object v1, v0

    .line 51
    :catch_2
    :cond_2
    :goto_3
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 52
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 55
    invoke-super {p0}, Lcom/yandex/metrica/impl/az;->I()Lcom/yandex/metrica/impl/az$c;

    move-result-object v0

    return-object v0
.end method

.method protected J()Landroid/database/Cursor;
    .locals 4

    .line 60
    iget-object v0, p0, Lcom/yandex/metrica/impl/ba;->m:Lcom/yandex/metrica/impl/ob/es;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ba;->E()J

    move-result-wide v1

    iget-object v3, p0, Lcom/yandex/metrica/impl/ba;->b:Ljava/util/Map;

    invoke-virtual {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/ob/es;->a(JLjava/util/Map;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method protected a(JLcom/yandex/metrica/impl/ob/dr;)Landroid/database/Cursor;
    .locals 2

    .line 65
    iget-object p1, p0, Lcom/yandex/metrica/impl/ba;->m:Lcom/yandex/metrica/impl/ob/es;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ba;->E()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1, p3}, Lcom/yandex/metrica/impl/ob/es;->a(JLcom/yandex/metrica/impl/ob/dr;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method protected a(JLcom/yandex/metrica/impl/ob/jc$c$e$b;)Lcom/yandex/metrica/impl/az$b;
    .locals 0

    .line 75
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ba;->F()J

    move-result-wide p1

    invoke-super {p0, p1, p2, p3}, Lcom/yandex/metrica/impl/az;->a(JLcom/yandex/metrica/impl/ob/jc$c$e$b;)Lcom/yandex/metrica/impl/az$b;

    move-result-object p1

    return-object p1
.end method

.method public a()Ljava/lang/String;
    .locals 3

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lcom/yandex/metrica/impl/az;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ba;->E()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected a(J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

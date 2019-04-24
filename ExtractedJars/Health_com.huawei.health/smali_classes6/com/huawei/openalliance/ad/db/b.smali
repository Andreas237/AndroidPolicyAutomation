.class public Lcom/huawei/openalliance/ad/db/b;
.super Ljava/lang/Object;


# static fields
.field private static b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/RecordBean;>;"
        }
    .end annotation
.end field

.field private static c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/RecordBean;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lcom/huawei/openalliance/ad/db/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Lcom/huawei/openalliance/ad/db/b;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Lcom/huawei/openalliance/ad/db/b;->c:Ljava/util/List;

    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->b:Ljava/util/List;

    new-instance v1, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->b:Ljava/util/List;

    new-instance v1, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->b:Ljava/util/List;

    new-instance v1, Lcom/huawei/openalliance/ad/db/bean/TestContentRecord;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/db/bean/TestContentRecord;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->b:Ljava/util/List;

    new-instance v1, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->b:Ljava/util/List;

    new-instance v1, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->b:Ljava/util/List;

    new-instance v1, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->c:Ljava/util/List;

    new-instance v1, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->c:Ljava/util/List;

    new-instance v1, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->c:Ljava/util/List;

    new-instance v1, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->c:Ljava/util/List;

    new-instance v1, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->c:Ljava/util/List;

    new-instance v1, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Lcom/huawei/openalliance/ad/db/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/db/b;->a:Lcom/huawei/openalliance/ad/db/a;

    return-void
.end method

.method private a([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz p2, :cond_0

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    :cond_0
    if-eqz p1, :cond_4

    array-length v0, p1

    if-lez v0, :cond_4

    if-eqz p2, :cond_4

    const/4 v4, 0x0

    :goto_0
    array-length v0, p1

    if-ge v4, v0, :cond_3

    aget-object v5, p1, v4

    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v0, "\"\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    if-eq v4, v0, :cond_2

    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.method private a(Ljava/lang/String;)V
    .locals 11

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, " INSERT INTO "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " SELECT "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/b;->a:Lcom/huawei/openalliance/ad/db/a;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/db/a;->d(Ljava/lang/String;)[Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/openalliance/ad/exception/a; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    goto :goto_0

    :catch_0
    move-exception v9

    new-instance v0, Lcom/huawei/openalliance/ad/exception/a;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "get table %s column names failed"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/exception/a;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/b;->a:Lcom/huawei/openalliance/ad/db/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "_temp_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/db/a;->d(Ljava/lang/String;)[Ljava/lang/String;
    :try_end_1
    .catch Lcom/huawei/openalliance/ad/exception/a; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v8

    goto :goto_1

    :catch_1
    move-exception v9

    new-instance v0, Lcom/huawei/openalliance/ad/exception/a;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "get temp table %s column names failed"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/exception/a;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    invoke-direct {p0, v7, v8}, Lcom/huawei/openalliance/ad/db/b;->a([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_0

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/exception/a;

    const-string v1, "insert data sql is null"

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/exception/a;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    const-string v0, " FROM "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_temp_"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :try_start_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/b;->a:Lcom/huawei/openalliance/ad/db/a;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/db/a;->c(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/openalliance/ad/exception/a; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    move-exception v10

    new-instance v0, Lcom/huawei/openalliance/ad/exception/a;

    const-string v1, "DbUpdateHelper insertData mDbHelper.executeSQL error"

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/exception/a;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_3
    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/openalliance/ad/db/bean/RecordBean;

    invoke-virtual {v7}, Lcom/huawei/openalliance/ad/db/bean/RecordBean;->getDefaultTableName()Ljava/lang/String;

    move-result-object v8

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/b;->a:Lcom/huawei/openalliance/ad/db/a;

    invoke-virtual {v0, v8}, Lcom/huawei/openalliance/ad/db/a;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/b;->a:Lcom/huawei/openalliance/ad/db/a;

    invoke-virtual {v0, v8}, Lcom/huawei/openalliance/ad/db/a;->f(Ljava/lang/String;)V

    const-string v0, "DbUpdateHelper"

    const-string v1, "tableName exist moidfy table successfully."

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v7}, Lcom/huawei/openalliance/ad/db/bean/RecordBean;->getTableScheme()Ljava/lang/String;

    move-result-object v9

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/b;->a:Lcom/huawei/openalliance/ad/db/a;

    invoke-virtual {v0, v9}, Lcom/huawei/openalliance/ad/db/a;->c(Ljava/lang/String;)V

    invoke-direct {p0, v8}, Lcom/huawei/openalliance/ad/db/b;->a(Ljava/lang/String;)V

    const-string v0, "DbUpdateHelper"

    const-string v1, "insert data to table successfully."

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/b;->a:Lcom/huawei/openalliance/ad/db/a;

    invoke-virtual {v0, v8}, Lcom/huawei/openalliance/ad/db/a;->a(Ljava/lang/String;)V

    const-string v0, "DbUpdateHelper"

    const-string v1, "drop table temp table successfully."

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/openalliance/ad/exception/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v9

    new-instance v0, Lcom/huawei/openalliance/ad/exception/a;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "table exist, init table tableName: %s failed"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/exception/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_1
    invoke-virtual {v7}, Lcom/huawei/openalliance/ad/db/bean/RecordBean;->getTableScheme()Ljava/lang/String;

    move-result-object v9

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/b;->a:Lcom/huawei/openalliance/ad/db/a;

    invoke-virtual {v0, v9}, Lcom/huawei/openalliance/ad/db/a;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/huawei/openalliance/ad/exception/a; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v9

    new-instance v0, Lcom/huawei/openalliance/ad/exception/a;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "table is not exist, init table tableName: %s failed"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/exception/a;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    goto/16 :goto_0

    :cond_1
    return-void
.end method

.method public b()V
    .locals 9

    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/openalliance/ad/db/bean/RecordBean;

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/db/bean/RecordBean;->getDefaultTableName()Ljava/lang/String;

    move-result-object v7

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/b;->a:Lcom/huawei/openalliance/ad/db/a;

    invoke-virtual {v0, v7}, Lcom/huawei/openalliance/ad/db/a;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/b;->a:Lcom/huawei/openalliance/ad/db/a;

    invoke-virtual {v0, v7}, Lcom/huawei/openalliance/ad/db/a;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/openalliance/ad/exception/a; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    goto :goto_1

    :catch_0
    move-exception v8

    const-string v0, "DbUpdateHelper"

    const-string v1, "delete table fail"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    goto :goto_0

    :cond_1
    sget-object v0, Lcom/huawei/openalliance/ad/db/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/openalliance/ad/db/bean/RecordBean;

    :try_start_1
    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/db/bean/RecordBean;->getTableScheme()Ljava/lang/String;

    move-result-object v7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/b;->a:Lcom/huawei/openalliance/ad/db/a;

    invoke-virtual {v0, v7}, Lcom/huawei/openalliance/ad/db/a;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/huawei/openalliance/ad/exception/a; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v8

    const-string v0, "DbUpdateHelper"

    const-string v1, "create table %s failed"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/db/bean/RecordBean;->getDefaultTableName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_3
    goto :goto_2

    :cond_2
    return-void
.end method

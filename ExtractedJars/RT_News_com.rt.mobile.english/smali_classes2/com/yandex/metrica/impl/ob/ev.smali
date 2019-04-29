.class public Lcom/yandex/metrica/impl/ob/ev;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/ev$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/String;

.field private final d:Lcom/yandex/metrica/impl/ob/ev$a;

.field private volatile e:Z

.field private final f:Lcom/yandex/metrica/impl/ob/fc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    const-class v0, Lcom/yandex/metrica/impl/ob/ev;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/ob/et;Ljava/lang/String;)V
    .locals 1

    .line 51
    new-instance v0, Lcom/yandex/metrica/impl/ob/fe;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/fe;-><init>(Lcom/yandex/metrica/impl/ob/et;)V

    invoke-direct {p0, p2, v0}, Lcom/yandex/metrica/impl/ob/ev;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/fc;)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/fc;)V
    .locals 4

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ev;->a:Ljava/util/Map;

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ev;->b:Ljava/util/Map;

    .line 55
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ev;->f:Lcom/yandex/metrica/impl/ob/fc;

    .line 56
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ev;->c:Ljava/lang/String;

    .line 58
    new-instance p1, Lcom/yandex/metrica/impl/ob/ev$a;

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v0, "YMM-DW-%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 59
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lt;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 58
    invoke-static {p2, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p0, p2}, Lcom/yandex/metrica/impl/ob/ev$a;-><init>(Lcom/yandex/metrica/impl/ob/ev;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ev;->d:Lcom/yandex/metrica/impl/ob/ev$a;

    .line 60
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ev;->d:Lcom/yandex/metrica/impl/ob/ev$a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ev$a;->start()V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/ev;)Ljava/util/Map;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/ev;->a:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/ev;Ljava/util/Map;)V
    .locals 6

    .line 1157
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    new-array v0, v0, [Landroid/content/ContentValues;

    .line 1159
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    .line 1160
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 1161
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 1162
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 1163
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 1164
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    const-string v5, "key"

    .line 1166
    invoke-virtual {v3, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x1

    if-ne v2, p0, :cond_0

    const-string v2, "value"

    .line 1168
    invoke-virtual {v3, v2}, Landroid/content/ContentValues;->putNull(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1169
    :cond_0
    instance-of v5, v2, Ljava/lang/String;

    if-eqz v5, :cond_1

    const-string v5, "value"

    .line 1170
    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v5, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "type"

    const/4 v5, 0x4

    .line 1171
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_1

    .line 1172
    :cond_1
    instance-of v5, v2, Ljava/lang/Long;

    if-eqz v5, :cond_2

    const-string v5, "value"

    .line 1173
    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v3, v5, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "type"

    const/4 v5, 0x3

    .line 1174
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_1

    .line 1175
    :cond_2
    instance-of v5, v2, Ljava/lang/Integer;

    if-eqz v5, :cond_3

    const-string v5, "value"

    .line 1176
    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v3, v5, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "type"

    const/4 v5, 0x2

    .line 1177
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_1

    .line 1178
    :cond_3
    instance-of v5, v2, Ljava/lang/Boolean;

    if-eqz v5, :cond_4

    const-string v5, "value"

    .line 1179
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v5, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "type"

    .line 1180
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_1

    .line 1181
    :cond_4
    instance-of v5, v2, Ljava/lang/Float;

    if-eqz v5, :cond_5

    const-string v5, "value"

    .line 1182
    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v3, v5, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    const-string v2, "type"

    const/4 v5, 0x5

    .line 1183
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_1

    :cond_5
    if-eqz v2, :cond_6

    .line 1185
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0

    .line 1187
    :cond_6
    :goto_1
    aput-object v3, v0, v1

    add-int/2addr v1, v4

    goto/16 :goto_0

    .line 1189
    :cond_7
    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/ev;->a([Landroid/content/ContentValues;)V

    return-void
.end method

.method private a([Landroid/content/ContentValues;)V
    .locals 9

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 199
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev;->f:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {v1}, Lcom/yandex/metrica/impl/ob/fc;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 200
    :try_start_1
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 201
    array-length v2, p1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, p1, v4

    const-string v6, "value"

    .line 202
    invoke-virtual {v5, v6}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1

    const-string v6, "key"

    .line 203
    invoke-virtual {v5, v6}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 204
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ev;->a()Ljava/lang/String;

    move-result-object v6

    const-string v7, "key = ?"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/String;

    aput-object v5, v8, v3

    invoke-virtual {v1, v6, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_1

    .line 207
    :cond_1
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ev;->a()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x5

    invoke-virtual {v1, v6, v0, v5, v7}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 211
    :cond_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 215
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 216
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ev;->f:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {p1, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-object v0, v1

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v1, v0

    .line 215
    :goto_2
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 216
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ev;->f:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {v0, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 217
    throw p1

    .line 215
    :catch_1
    :goto_3
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 216
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ev;->f:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {p1, v0}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/ev;Z)Z
    .locals 0

    .line 34
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/ev;->e:Z

    return p1
.end method

.method private b(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 332
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ev;->a:Ljava/util/Map;

    monitor-enter v0

    .line 333
    :try_start_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/ev;->c()V

    .line 334
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev;->a:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 335
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ob/ev;)V
    .locals 11

    const/4 v0, 0x0

    .line 1103
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev;->f:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {v1}, Lcom/yandex/metrica/impl/ob/fc;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 1104
    :try_start_1
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ev;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v2, 0x3

    new-array v4, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v5, "key"

    aput-object v5, v4, v2

    const/4 v2, 0x1

    const-string v5, "value"

    aput-object v5, v4, v2

    const/4 v2, 0x2

    const-string v5, "type"

    aput-object v5, v4, v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, v1

    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1108
    :cond_0
    :goto_0
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "key"

    .line 1109
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "value"

    .line 1110
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "type"

    .line 1111
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    .line 1112
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    packed-switch v5, :pswitch_data_0

    :cond_1
    move-object v4, v0

    goto :goto_1

    .line 1130
    :pswitch_0
    invoke-static {v4}, Lcom/yandex/metrica/impl/ob/lu;->b(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v4

    goto :goto_1

    .line 1124
    :pswitch_1
    invoke-static {v4}, Lcom/yandex/metrica/impl/ob/lu;->a(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v4

    goto :goto_1

    .line 1121
    :pswitch_2
    invoke-static {v4}, Lcom/yandex/metrica/impl/ob/lu;->c(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :pswitch_3
    const-string v5, "true"

    .line 1116
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    const-string v5, "false"

    .line 1118
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    :pswitch_4
    if-eqz v4, :cond_0

    .line 1134
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/ev;->a:Ljava/util/Map;

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 1141
    :cond_3
    invoke-static {v2}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 1142
    :goto_2
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/ev;->f:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {p0, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-object v0, v2

    goto :goto_4

    :catchall_1
    move-exception v2

    move-object v10, v2

    move-object v2, v0

    move-object v0, v10

    goto :goto_3

    :catchall_2
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    move-object v1, v2

    .line 1141
    :goto_3
    invoke-static {v2}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 1142
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/ev;->f:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {p0, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 1143
    throw v0

    :catch_1
    move-object v1, v0

    .line 1141
    :catch_2
    :goto_4
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    goto :goto_2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic c(Lcom/yandex/metrica/impl/ob/ev;)Ljava/util/Map;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/ev;->b:Ljava/util/Map;

    return-object p0
.end method

.method private c()V
    .locals 1

    .line 339
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ev;->e:Z

    if-nez v0, :cond_0

    .line 341
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ev;->a:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)I
    .locals 1

    .line 232
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/ev;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    .line 233
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 234
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    return p2
.end method

.method public a(Ljava/lang/String;J)J
    .locals 1

    .line 243
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/ev;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    .line 244
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 245
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    return-wide p1

    :cond_0
    return-wide p2
.end method

.method public a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ev;
    .locals 2

    .line 276
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ev;->a:Ljava/util/Map;

    monitor-enter v0

    .line 277
    :try_start_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/ev;->c()V

    .line 278
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev;->a:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 280
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev;->d:Lcom/yandex/metrica/impl/ob/ev$a;

    monitor-enter v1

    .line 281
    :try_start_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ev;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ev;->d:Lcom/yandex/metrica/impl/ob/ev$a;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 283
    monitor-exit v1

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 279
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method a()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ev;->c:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 221
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/ev;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    .line 222
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 223
    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    return-object p2
.end method

.method a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 321
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ev;->a:Ljava/util/Map;

    monitor-enter v0

    .line 322
    :try_start_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/ev;->c()V

    .line 323
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev;->a:Ljava/util/Map;

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 325
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev;->d:Lcom/yandex/metrica/impl/ob/ev$a;

    monitor-enter v1

    .line 326
    :try_start_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ev;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ev;->d:Lcom/yandex/metrica/impl/ob/ev$a;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 328
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 324
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public a(Ljava/lang/String;Z)Z
    .locals 1

    .line 254
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/ev;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    .line 255
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 256
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_0
    return p2
.end method

.method public declared-synchronized b(Ljava/lang/String;I)Lcom/yandex/metrica/impl/ob/ev;
    .locals 0

    monitor-enter p0

    .line 298
    :try_start_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/ev;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    .line 297
    monitor-exit p0

    throw p1
.end method

.method public b(Ljava/lang/String;J)Lcom/yandex/metrica/impl/ob/ev;
    .locals 0

    .line 293
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/ev;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method public declared-synchronized b(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ev;
    .locals 0

    monitor-enter p0

    .line 288
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/ev;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 289
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    .line 287
    monitor-exit p0

    throw p1
.end method

.method public b(Ljava/lang/String;Z)Lcom/yandex/metrica/impl/ob/ev;
    .locals 0

    .line 303
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/ev;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method public b()V
    .locals 2

    .line 151
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ev;->d:Lcom/yandex/metrica/impl/ob/ev$a;

    monitor-enter v0

    .line 152
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev;->d:Lcom/yandex/metrica/impl/ob/ev$a;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 153
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

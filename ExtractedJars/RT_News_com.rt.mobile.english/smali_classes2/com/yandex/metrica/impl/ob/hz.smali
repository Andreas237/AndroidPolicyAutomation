.class public abstract Lcom/yandex/metrica/impl/ob/hz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lcom/yandex/metrica/impl/ob/ig;


# instance fields
.field protected final a:Ljava/lang/String;

.field protected final b:Landroid/content/SharedPreferences;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 20
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "UNDEFINED_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/hz;->c:Lcom/yandex/metrica/impl/ob/ig;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/hz;->d:Ljava/util/Map;

    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/hz;->e:Z

    .line 32
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/hz;->a:Ljava/lang/String;

    .line 1040
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/hz;->f()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/yandex/metrica/impl/ob/ih;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hz;->b:Landroid/content/SharedPreferences;

    .line 34
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/hz;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hz;->a:Ljava/lang/String;

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/hz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/yandex/metrica/impl/ob/hz;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 44
    monitor-enter p0

    if-eqz p2, :cond_0

    .line 46
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hz;->d:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    monitor-exit p0

    return-object p0

    .line 50
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method protected abstract f()Ljava/lang/String;
.end method

.method protected h()Lcom/yandex/metrica/impl/ob/hz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/yandex/metrica/impl/ob/hz;",
            ">()TT;"
        }
    .end annotation

    .line 61
    monitor-enter p0

    const/4 v0, 0x1

    .line 62
    :try_start_0
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/hz;->e:Z

    .line 63
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hz;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 64
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception v0

    .line 65
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected h(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/hz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/yandex/metrica/impl/ob/hz;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 54
    monitor-enter p0

    .line 55
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hz;->d:Ljava/util/Map;

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    .line 57
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method protected i()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hz;->a:Ljava/lang/String;

    return-object v0
.end method

.method public j()V
    .locals 6

    .line 73
    monitor-enter p0

    .line 1081
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hz;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1083
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/hz;->e:Z

    if-eqz v1, :cond_0

    .line 1084
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 1113
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_1

    .line 1090
    :cond_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hz;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 1091
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 1092
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p0, :cond_2

    .line 1095
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 1096
    :cond_2
    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_3

    .line 1097
    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 1098
    :cond_3
    instance-of v4, v2, Ljava/lang/Long;

    if-eqz v4, :cond_4

    .line 1099
    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-interface {v0, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 1100
    :cond_4
    instance-of v4, v2, Ljava/lang/Integer;

    if-eqz v4, :cond_5

    .line 1101
    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 1102
    :cond_5
    instance-of v4, v2, Ljava/lang/Boolean;

    if-eqz v4, :cond_6

    .line 1103
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_6
    if-eqz v2, :cond_1

    .line 1105
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 2113
    :cond_7
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 75
    :goto_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hz;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    .line 76
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/hz;->e:Z

    .line 77
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

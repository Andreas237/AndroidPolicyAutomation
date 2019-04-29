.class public Lcom/yandex/metrica/impl/ob/el;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/el;->a:Landroid/content/Context;

    return-void
.end method

.method private a()Landroid/content/SharedPreferences$Editor;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 77
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/el;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    return-object v0
.end method

.method private b()Landroid/content/SharedPreferences;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 83
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/el;->a:Landroid/content/Context;

    const-string v1, "com.yandex.metrica.configuration"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(J)Lcom/yandex/metrica/impl/ob/el;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 45
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/el;->a()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lwutt"

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/el;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 33
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/el;->a()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "client_configurations"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-object p0
.end method

.method public a(Z)Lcom/yandex/metrica/impl/ob/el;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 55
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/el;->a()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "les"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-object p0
.end method

.method public b(J)J
    .locals 2

    .line 50
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/el;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "lwutt"

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/el;->a:Landroid/content/Context;

    const-string v1, "com.yandex.metrica.configuration"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "client_configurations"

    .line 40
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Z)Z
    .locals 2

    .line 60
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/el;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "les"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public c(J)Lcom/yandex/metrica/impl/ob/el;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 66
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/el;->a()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lci"

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-object p0
.end method

.method public d(J)J
    .locals 2

    .line 71
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/el;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "lci"

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

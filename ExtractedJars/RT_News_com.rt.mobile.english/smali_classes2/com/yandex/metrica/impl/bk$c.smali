.class Lcom/yandex/metrica/impl/bk$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ak$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lcom/yandex/metrica/impl/bk$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 7

    .line 109
    new-instance v0, Lcom/yandex/metrica/impl/ob/ib;

    .line 110
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/yandex/metrica/impl/ob/ib;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const-string v1, "_boundentrypreferences"

    .line 111
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/ih;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 113
    sget-object v1, Lcom/yandex/metrica/impl/ob/ib;->c:Lcom/yandex/metrica/impl/ob/ig;

    .line 114
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 115
    sget-object v2, Lcom/yandex/metrica/impl/ob/ib;->d:Lcom/yandex/metrica/impl/ob/ig;

    .line 116
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, -0x1

    invoke-interface {p1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    if-eqz v1, :cond_0

    cmp-long v2, v5, v3

    if-eqz v2, :cond_0

    .line 118
    new-instance v2, Lcom/yandex/metrica/impl/a$a;

    invoke-direct {v2, v1, v5, v6}, Lcom/yandex/metrica/impl/a$a;-><init>(Ljava/lang/String;J)V

    invoke-virtual {v0, v2}, Lcom/yandex/metrica/impl/ob/ib;->a(Lcom/yandex/metrica/impl/a$a;)Lcom/yandex/metrica/impl/ob/ib;

    move-result-object v0

    .line 120
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ib;->j()V

    .line 121
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    sget-object v0, Lcom/yandex/metrica/impl/ob/ib;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    sget-object v0, Lcom/yandex/metrica/impl/ob/ib;->d:Lcom/yandex/metrica/impl/ob/ig;

    .line 122
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 123
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

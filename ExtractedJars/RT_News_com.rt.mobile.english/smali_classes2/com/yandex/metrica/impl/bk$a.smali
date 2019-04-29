.class Lcom/yandex/metrica/impl/bk$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ak$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 3

    .line 171
    new-instance v0, Lcom/yandex/metrica/impl/ob/fk;

    .line 172
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/eu;->e()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object v1

    .line 173
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fk;-><init>(Lcom/yandex/metrica/impl/ob/ev;Ljava/lang/String;)V

    .line 174
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fk;->a()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v0

    .line 175
    const-class v1, Lcom/yandex/metrica/impl/ob/ks;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/gd$a;->a(Ljava/lang/Class;)Lcom/yandex/metrica/impl/ob/gd;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/yandex/metrica/impl/ob/gd;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/fo;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/yandex/metrica/impl/ob/fo;->a(Ljava/lang/Object;)V

    return-void
.end method

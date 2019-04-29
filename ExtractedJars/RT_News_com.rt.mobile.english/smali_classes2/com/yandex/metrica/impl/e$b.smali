.class Lcom/yandex/metrica/impl/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ak$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/fg;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/fg;)V
    .locals 0

    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 154
    iput-object p1, p0, Lcom/yandex/metrica/impl/e$b;->a:Lcom/yandex/metrica/impl/ob/fg;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 3

    .line 159
    iget-object v0, p0, Lcom/yandex/metrica/impl/e$b;->a:Lcom/yandex/metrica/impl/ob/fg;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ig;

    const-string v2, "COOKIE_BROWSERS"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fg;->n(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fi;

    .line 160
    iget-object v0, p0, Lcom/yandex/metrica/impl/e$b;->a:Lcom/yandex/metrica/impl/ob/fg;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ig;

    const-string v2, "BIND_ID_URL"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fg;->n(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fi;

    const-string v0, "b_meta.dat"

    .line 161
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/u;->a(Landroid/content/Context;Ljava/lang/String;)V

    const-string v0, "browsers.dat"

    .line 162
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/u;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

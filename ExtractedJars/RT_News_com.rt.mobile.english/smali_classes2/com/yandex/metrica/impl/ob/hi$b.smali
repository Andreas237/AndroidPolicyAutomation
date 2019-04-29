.class public Lcom/yandex/metrica/impl/ob/hi$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/jq$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/hi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/jq$d<",
        "Lcom/yandex/metrica/impl/ob/hi;",
        "Lcom/yandex/metrica/impl/ob/hi$a;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hi$b;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/hi$a;)Lcom/yandex/metrica/impl/ob/hi;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 59
    new-instance v0, Lcom/yandex/metrica/impl/ob/hi;

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/hi$a;->b:Lcom/yandex/metrica/impl/ob/gs;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/hi;-><init>(Lcom/yandex/metrica/impl/ob/gs;B)V

    .line 60
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hi$b;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/hi$b;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/br;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/hi;->a(Lcom/yandex/metrica/impl/ob/hi;Ljava/lang/String;)V

    .line 61
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hi$b;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/hi$b;->a:Landroid/content/Context;

    .line 62
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/br;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 61
    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/hi;->b(Lcom/yandex/metrica/impl/ob/hi;Ljava/lang/String;)V

    .line 64
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/hi$a;->a:Lcom/yandex/metrica/impl/ob/ks;

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/hi;->a(Lcom/yandex/metrica/impl/ob/hi;Lcom/yandex/metrica/impl/ob/ks;)V

    .line 65
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hi$b;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/yandex/metrica/impl/g;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/g;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/hi;->a(Lcom/yandex/metrica/impl/ob/hi;Lcom/yandex/metrica/impl/g;)V

    .line 66
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hi$b;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/hi;->c(Lcom/yandex/metrica/impl/ob/hi;Ljava/lang/String;)V

    .line 67
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/hi$a;->a:Lcom/yandex/metrica/impl/ob/ks;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ks;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/hi;->d(Lcom/yandex/metrica/impl/ob/hi;Ljava/lang/String;)V

    .line 68
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/hi$a;->a:Lcom/yandex/metrica/impl/ob/ks;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/ks;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/ob/hi;->e(Lcom/yandex/metrica/impl/ob/hi;Ljava/lang/String;)V

    .line 69
    invoke-static {}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a()Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;

    move-result-object p1

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hi$b;->a:Landroid/content/Context;

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->b(Landroid/content/Context;)Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/ob/hi;->a(Lcom/yandex/metrica/impl/ob/hi;Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/jq;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 47
    check-cast p1, Lcom/yandex/metrica/impl/ob/hi$a;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/hi$b;->a(Lcom/yandex/metrica/impl/ob/hi$a;)Lcom/yandex/metrica/impl/ob/hi;

    move-result-object p1

    return-object p1
.end method

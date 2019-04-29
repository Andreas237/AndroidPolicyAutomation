.class public Lcom/yandex/metrica/impl/ob/mn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ls;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/ls<",
            "Lcom/yandex/metrica/impl/ob/mo;",
            "Lcom/yandex/metrica/impl/ob/mm;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/ls;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/ls<",
            "Lcom/yandex/metrica/impl/q$a;",
            "Lcom/yandex/metrica/impl/ob/mm;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 26
    new-instance v0, Lcom/yandex/metrica/impl/ob/mk;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/mk;-><init>()V

    new-instance v1, Lcom/yandex/metrica/impl/ob/mp;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/mp;-><init>()V

    new-instance v2, Lcom/yandex/metrica/impl/ob/mh;

    invoke-direct {v2, p1}, Lcom/yandex/metrica/impl/ob/mh;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/mn;-><init>(Lcom/yandex/metrica/impl/ob/mm;Lcom/yandex/metrica/impl/ob/mm;Lcom/yandex/metrica/impl/ob/mm;)V

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/ob/mm;Lcom/yandex/metrica/impl/ob/mm;Lcom/yandex/metrica/impl/ob/mm;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/mm;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/mm;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/mm;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Lcom/yandex/metrica/impl/ob/ls;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/ls;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/mn;->a:Lcom/yandex/metrica/impl/ob/ls;

    .line 39
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/mn;->a:Lcom/yandex/metrica/impl/ob/ls;

    sget-object v1, Lcom/yandex/metrica/impl/ob/mo;->a:Lcom/yandex/metrica/impl/ob/mo;

    invoke-virtual {v0, v1, p1}, Lcom/yandex/metrica/impl/ob/ls;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/mn;->a:Lcom/yandex/metrica/impl/ob/ls;

    sget-object v1, Lcom/yandex/metrica/impl/ob/mo;->b:Lcom/yandex/metrica/impl/ob/mo;

    invoke-virtual {v0, v1, p2}, Lcom/yandex/metrica/impl/ob/ls;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/mn;->a:Lcom/yandex/metrica/impl/ob/ls;

    sget-object v0, Lcom/yandex/metrica/impl/ob/mo;->c:Lcom/yandex/metrica/impl/ob/mo;

    invoke-virtual {p2, v0, p3}, Lcom/yandex/metrica/impl/ob/ls;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    new-instance p2, Lcom/yandex/metrica/impl/ob/ls;

    invoke-direct {p2, p1}, Lcom/yandex/metrica/impl/ob/ls;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/mn;->b:Lcom/yandex/metrica/impl/ob/ls;

    .line 46
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/mn;->b:Lcom/yandex/metrica/impl/ob/ls;

    sget-object p2, Lcom/yandex/metrica/impl/q$a;->p:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {p1, p2, p3}, Lcom/yandex/metrica/impl/ob/ls;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/mm;
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 56
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->d()I

    move-result p1

    .line 57
    invoke-static {p1}, Lcom/yandex/metrica/impl/q$a;->a(I)Lcom/yandex/metrica/impl/q$a;

    move-result-object p1

    .line 1063
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/mn;->b:Lcom/yandex/metrica/impl/ob/ls;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ls;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/mm;

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/mo;)Lcom/yandex/metrica/impl/ob/mm;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/mn;->a:Lcom/yandex/metrica/impl/ob/ls;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ls;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/mm;

    return-object p1
.end method

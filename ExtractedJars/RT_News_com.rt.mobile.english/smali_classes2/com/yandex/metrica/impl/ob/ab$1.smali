.class Lcom/yandex/metrica/impl/ob/ab$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/dn$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/ab;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/kk;Lcom/yandex/metrica/impl/ob/y;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/v;Lcom/yandex/metrica/impl/ob/mn;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/ab;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ab$1;->a:Lcom/yandex/metrica/impl/ob/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/do;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/do;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 162
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab$1;->a:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ab;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/do;)V

    return-void
.end method

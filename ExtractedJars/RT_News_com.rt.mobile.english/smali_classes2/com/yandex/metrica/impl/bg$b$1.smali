.class Lcom/yandex/metrica/impl/bg$b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/bg$b;-><init>(Lcom/yandex/metrica/impl/bg;Lcom/yandex/metrica/impl/bg$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/k<",
        "Lcom/yandex/metrica/impl/au;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/bg$b;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/bg$b;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/yandex/metrica/impl/bg$b$1;->a:Lcom/yandex/metrica/impl/bg$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/yandex/metrica/impl/bg$b$1;->a:Lcom/yandex/metrica/impl/bg$b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/bg$b;->c:Z

    return-void
.end method

.method public bridge synthetic a(Lcom/yandex/metrica/impl/ob/j;)V
    .locals 0

    .line 69
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bg$b$1;->a()V

    return-void
.end method

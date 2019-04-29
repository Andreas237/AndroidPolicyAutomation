.class Lcom/yandex/metrica/impl/bv$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/bv;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/bv;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/yandex/metrica/impl/bv$1;->a:Lcom/yandex/metrica/impl/bv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)Z
    .locals 0

    .line 211
    iget-object p1, p0, Lcom/yandex/metrica/impl/bv$1;->a:Lcom/yandex/metrica/impl/bv;

    invoke-static {p1}, Lcom/yandex/metrica/impl/bv;->a(Lcom/yandex/metrica/impl/bv;)Lcom/yandex/metrica/impl/ab;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ab;->f()Z

    move-result p1

    return p1
.end method

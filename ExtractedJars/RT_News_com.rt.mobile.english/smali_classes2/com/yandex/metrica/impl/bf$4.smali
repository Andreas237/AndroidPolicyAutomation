.class Lcom/yandex/metrica/impl/bf$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/bg$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/bh;Lcom/yandex/metrica/impl/bc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/bh;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/bh;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lcom/yandex/metrica/impl/bf$4;->a:Lcom/yandex/metrica/impl/bh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/h;
    .locals 4

    .line 264
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf$4;->a:Lcom/yandex/metrica/impl/bh;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/bh;->a()Landroid/util/Pair;

    move-result-object v0

    .line 265
    new-instance v1, Ljava/lang/String;

    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, [B

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroid/util/Base64;->encode([BI)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/h;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    .line 266
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/h;->c(I)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    return-object p1
.end method

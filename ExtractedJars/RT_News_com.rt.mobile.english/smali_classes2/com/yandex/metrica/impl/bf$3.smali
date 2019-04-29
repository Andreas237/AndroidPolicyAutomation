.class Lcom/yandex/metrica/impl/bf$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/bg$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/bf;->b(Ljava/lang/String;Lcom/yandex/metrica/impl/bc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lcom/yandex/metrica/impl/bf$3;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/h;
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf$3;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/h;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    return-object p1
.end method

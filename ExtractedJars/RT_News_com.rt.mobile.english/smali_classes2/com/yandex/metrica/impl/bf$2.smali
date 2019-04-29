.class Lcom/yandex/metrica/impl/bf$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/bg$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/ob/jg$a;Lcom/yandex/metrica/impl/bc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/jg$a;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/jg$a;)V
    .locals 0

    .line 235
    iput-object p1, p0, Lcom/yandex/metrica/impl/bf$2;->a:Lcom/yandex/metrica/impl/ob/jg$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/h;
    .locals 3

    .line 238
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/yandex/metrica/impl/bf$2;->a:Lcom/yandex/metrica/impl/ob/jg$a;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/e;)[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/util/Base64;->encode([BI)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/h;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    return-object p1
.end method

.class Lcom/yandex/metrica/impl/bk$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ak$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 90
    invoke-direct {p0}, Lcom/yandex/metrica/impl/bk$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 2

    .line 94
    new-instance v0, Lcom/yandex/metrica/impl/ob/ie;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/ie;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    .line 95
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ie;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 96
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 97
    invoke-static {}, Lcom/yandex/metrica/impl/ob/gi;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/yandex/metrica/impl/ob/gi;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 98
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/ie;->a(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.class Lcom/yandex/metrica/impl/ob/jp$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/jo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/jp;->a(Lcom/yandex/metrica/impl/ob/jo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/jo;

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/jo;Ljava/lang/Object;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jp$1;->a:Lcom/yandex/metrica/impl/ob/jo;

    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/jp$1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 57
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jp$1;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 59
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jp$1;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "endConnection"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jp$1;->b:Ljava/lang/Object;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    :catch_0
    return-void

    :catch_1
    :cond_0
    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jn;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jn;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 46
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jp$1;->a:Lcom/yandex/metrica/impl/ob/jo;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/jo;->a(Lcom/yandex/metrica/impl/ob/jn;)V

    .line 47
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jp$1;->a()V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 52
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jp$1;->a:Lcom/yandex/metrica/impl/ob/jo;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/jo;->a(Ljava/lang/Throwable;)V

    .line 53
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jp$1;->a()V

    return-void
.end method

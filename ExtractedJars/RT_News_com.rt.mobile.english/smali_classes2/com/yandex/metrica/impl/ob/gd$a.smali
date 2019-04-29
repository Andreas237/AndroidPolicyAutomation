.class public Lcom/yandex/metrica/impl/ob/gd$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/gd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/gd$a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/yandex/metrica/impl/ob/gd<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/gd$a;->a:Ljava/util/HashMap;

    .line 43
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gd$a;->a:Ljava/util/HashMap;

    const-class v1, Lcom/yandex/metrica/impl/ob/ks;

    new-instance v2, Lcom/yandex/metrica/impl/ob/gd$a$1;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/gd$a$1;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gd$a;->a:Ljava/util/HashMap;

    const-class v1, Lcom/yandex/metrica/impl/ob/jk$a;

    new-instance v2, Lcom/yandex/metrica/impl/ob/gd$a$2;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/gd$a$2;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/gd$a;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Class;)Lcom/yandex/metrica/impl/ob/gd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/yandex/metrica/impl/ob/gd<",
            "TT;>;"
        }
    .end annotation

    .line 37
    sget-object v0, Lcom/yandex/metrica/impl/ob/gd$a$a;->a:Lcom/yandex/metrica/impl/ob/gd$a;

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/ob/gd$a;->b(Ljava/lang/Class;)Lcom/yandex/metrica/impl/ob/gd;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method b(Ljava/lang/Class;)Lcom/yandex/metrica/impl/ob/gd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/yandex/metrica/impl/ob/gd<",
            "TT;>;"
        }
    .end annotation

    .line 69
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gd$a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/gd;

    return-object p1
.end method

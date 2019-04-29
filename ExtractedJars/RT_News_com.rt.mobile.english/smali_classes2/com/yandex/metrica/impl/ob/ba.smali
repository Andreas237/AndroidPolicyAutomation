.class public Lcom/yandex/metrica/impl/ob/ba;
.super Lcom/yandex/metrica/impl/ob/bb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<BaseHandler:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/yandex/metrica/impl/ob/bb<",
        "TBaseHandler;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TBaseHandler;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TBaseHandler;>;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/bb;-><init>()V

    .line 19
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ba;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+TBaseHandler;>;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ba;->a:Ljava/util/List;

    return-object v0
.end method

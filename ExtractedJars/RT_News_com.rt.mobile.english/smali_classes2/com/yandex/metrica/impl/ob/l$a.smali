.class public final Lcom/yandex/metrica/impl/ob/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/yandex/metrica/impl/ob/j;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final a:Lcom/yandex/metrica/impl/ob/k;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field b:Lcom/yandex/metrica/impl/ob/i;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/i<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/k;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/k;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/k<",
            "TT;>;)V"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/l$a;->a:Lcom/yandex/metrica/impl/ob/k;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/i;)Lcom/yandex/metrica/impl/ob/l$a;
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/i;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/i<",
            "TT;>;)",
            "Lcom/yandex/metrica/impl/ob/l$a<",
            "TT;>;"
        }
    .end annotation

    .line 52
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/l$a;->b:Lcom/yandex/metrica/impl/ob/i;

    return-object p0
.end method

.method public a()Lcom/yandex/metrica/impl/ob/l;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/yandex/metrica/impl/ob/l<",
            "TT;>;"
        }
    .end annotation

    .line 58
    new-instance v0, Lcom/yandex/metrica/impl/ob/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/yandex/metrica/impl/ob/l;-><init>(Lcom/yandex/metrica/impl/ob/l$a;B)V

    return-object v0
.end method

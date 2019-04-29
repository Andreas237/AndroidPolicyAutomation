.class public Lcom/yandex/metrica/impl/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/am;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/o$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/o$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 64
    new-instance v0, Lcom/yandex/metrica/impl/o$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/o$a;-><init>()V

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/o;-><init>(Lcom/yandex/metrica/impl/o$a;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/o$a;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/o$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lcom/yandex/metrica/impl/o;->a:Lcom/yandex/metrica/impl/o$a;

    return-void
.end method


# virtual methods
.method public a(I[BLjava/util/Map;)Z
    .locals 0
    .param p2    # [B
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)Z"
        }
    .end annotation

    const/16 p3, 0xc8

    if-ne p3, p1, :cond_0

    .line 78
    iget-object p1, p0, Lcom/yandex/metrica/impl/o;->a:Lcom/yandex/metrica/impl/o$a;

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/o$a;->a([B)Lcom/yandex/metrica/impl/o$a$a;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "accepted"

    .line 80
    iget-object p1, p1, Lcom/yandex/metrica/impl/o$a$a;->a:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

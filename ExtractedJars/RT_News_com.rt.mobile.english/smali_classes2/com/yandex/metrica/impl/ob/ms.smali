.class abstract Lcom/yandex/metrica/impl/ob/ms;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/nc;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/nc<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(ILjava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput p1, p0, Lcom/yandex/metrica/impl/ob/ms;->a:I

    .line 21
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ms;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
        otherwise = 0x3
    .end annotation

    .line 26
    iget v0, p0, Lcom/yandex/metrica/impl/ob/ms;->a:I

    return v0
.end method

.method b()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ms;->b:Ljava/lang/String;

    return-object v0
.end method

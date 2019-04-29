.class public Lcom/yandex/metrica/impl/ob/dw$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/dw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ef;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Landroid/os/Bundle;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final c:Lcom/yandex/metrica/impl/ob/ee;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ef;Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/ef;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 42
    invoke-direct {p0, p1, p2, v0}, Lcom/yandex/metrica/impl/ob/dw$a;-><init>(Lcom/yandex/metrica/impl/ob/ef;Landroid/os/Bundle;Lcom/yandex/metrica/impl/ob/ee;)V

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ef;Landroid/os/Bundle;Lcom/yandex/metrica/impl/ob/ee;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ef;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ee;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dw$a;->a:Lcom/yandex/metrica/impl/ob/ef;

    .line 50
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/dw$a;->b:Landroid/os/Bundle;

    .line 51
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/dw$a;->c:Lcom/yandex/metrica/impl/ob/ee;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 57
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dw$a;->a:Lcom/yandex/metrica/impl/ob/ef;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/dw$a;->b:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/dw$a;->c:Lcom/yandex/metrica/impl/ob/ee;

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ef;->a(Landroid/os/Bundle;Lcom/yandex/metrica/impl/ob/ee;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 60
    :catch_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dw$a;->c:Lcom/yandex/metrica/impl/ob/ee;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dw$a;->c:Lcom/yandex/metrica/impl/ob/ee;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/ee;->a()V

    :cond_0
    return-void
.end method

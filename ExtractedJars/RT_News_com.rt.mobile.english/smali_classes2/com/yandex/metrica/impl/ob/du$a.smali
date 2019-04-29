.class Lcom/yandex/metrica/impl/ob/du$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/du;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/du$a$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/du$a$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final c:Landroid/content/ServiceConnection;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/du$a$a;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/du$a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Lcom/yandex/metrica/impl/ob/du$a$1;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/ob/du$a$1;-><init>(Lcom/yandex/metrica/impl/ob/du$a;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/du$a;->c:Landroid/content/ServiceConnection;

    .line 57
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/du$a;->a:Landroid/content/Context;

    .line 58
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/du$a;->b:Lcom/yandex/metrica/impl/ob/du$a$a;

    return-void
.end method

.method private a()V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/du$a;->b:Lcom/yandex/metrica/impl/ob/du$a$a;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/du$a$a;->b()V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/du$a;)V
    .locals 0

    .line 1104
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/du$a;->b:Lcom/yandex/metrica/impl/ob/du$a$a;

    invoke-interface {p0}, Lcom/yandex/metrica/impl/ob/du$a$a;->a()V

    return-void
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ob/du$a;)V
    .locals 1

    .line 2097
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/du$a;->a:Landroid/content/Context;

    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/du$a;->c:Landroid/content/ServiceConnection;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    return-void
.end method


# virtual methods
.method a(Landroid/content/Intent;)V
    .locals 3
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 1083
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/du$a;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/du$a;->c:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-nez p1, :cond_0

    .line 1086
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/du$a;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    .line 1090
    :catch_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/du$a;->a()V

    return-void
.end method

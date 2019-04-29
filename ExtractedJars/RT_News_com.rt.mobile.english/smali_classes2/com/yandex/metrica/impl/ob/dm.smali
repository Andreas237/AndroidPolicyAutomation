.class public final Lcom/yandex/metrica/impl/ob/dm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/dm$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/dr;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/impl/ob/dm$a;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/dm$a;->a(Lcom/yandex/metrica/impl/ob/dm$a;)Lcom/yandex/metrica/impl/ob/dr;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dm;->a:Lcom/yandex/metrica/impl/ob/dr;

    .line 21
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/dm$a;->b(Lcom/yandex/metrica/impl/ob/dm$a;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dm;->b:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/impl/ob/dm$a;B)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/dm;-><init>(Lcom/yandex/metrica/impl/ob/dm$a;)V

    return-void
.end method

.method public static final a(Lcom/yandex/metrica/impl/ob/dr;)Lcom/yandex/metrica/impl/ob/dm$a;
    .locals 2

    .line 25
    new-instance v0, Lcom/yandex/metrica/impl/ob/dm$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/yandex/metrica/impl/ob/dm$a;-><init>(Lcom/yandex/metrica/impl/ob/dr;B)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/dr;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dm;->a:Lcom/yandex/metrica/impl/ob/dr;

    return-object v0
.end method

.method public b()Ljava/lang/Integer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dm;->b:Ljava/lang/Integer;

    return-object v0
.end method

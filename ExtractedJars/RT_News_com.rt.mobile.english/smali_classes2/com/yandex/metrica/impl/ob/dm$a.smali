.class final Lcom/yandex/metrica/impl/ob/dm$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/dm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/dr;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/impl/ob/dr;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dm$a;->a:Lcom/yandex/metrica/impl/ob/dr;

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/impl/ob/dr;B)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/dm$a;-><init>(Lcom/yandex/metrica/impl/ob/dr;)V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/dm$a;)Lcom/yandex/metrica/impl/ob/dr;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/dm$a;->a:Lcom/yandex/metrica/impl/ob/dr;

    return-object p0
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ob/dm$a;)Ljava/lang/Integer;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/dm$a;->b:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public a(I)Lcom/yandex/metrica/impl/ob/dm$a;
    .locals 0

    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dm$a;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public a()Lcom/yandex/metrica/impl/ob/dm;
    .locals 2

    .line 51
    new-instance v0, Lcom/yandex/metrica/impl/ob/dm;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/yandex/metrica/impl/ob/dm;-><init>(Lcom/yandex/metrica/impl/ob/dm$a;B)V

    return-object v0
.end method

.class final Lcom/yandex/metrica/impl/ob/dk$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/dk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/dr;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private d:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private e:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private f:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private g:Ljava/lang/Boolean;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private h:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/impl/ob/dm;)V
    .locals 1

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/dm;->a()Lcom/yandex/metrica/impl/ob/dr;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dk$a;->b:Lcom/yandex/metrica/impl/ob/dr;

    .line 102
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/dm;->b()Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dk$a;->e:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/impl/ob/dm;B)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/dk$a;-><init>(Lcom/yandex/metrica/impl/ob/dm;)V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/dk$a;)Lcom/yandex/metrica/impl/ob/dr;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/dk$a;->b:Lcom/yandex/metrica/impl/ob/dr;

    return-object p0
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ob/dk$a;)Ljava/lang/Integer;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/dk$a;->e:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic c(Lcom/yandex/metrica/impl/ob/dk$a;)Ljava/lang/Long;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/dk$a;->c:Ljava/lang/Long;

    return-object p0
.end method

.method static synthetic d(Lcom/yandex/metrica/impl/ob/dk$a;)Ljava/lang/Long;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/dk$a;->d:Ljava/lang/Long;

    return-object p0
.end method

.method static synthetic e(Lcom/yandex/metrica/impl/ob/dk$a;)Ljava/lang/Long;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/dk$a;->f:Ljava/lang/Long;

    return-object p0
.end method

.method static synthetic f(Lcom/yandex/metrica/impl/ob/dk$a;)Ljava/lang/Boolean;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/dk$a;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic g(Lcom/yandex/metrica/impl/ob/dk$a;)Ljava/lang/Long;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/dk$a;->h:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)Lcom/yandex/metrica/impl/ob/dk$a;
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dk$a;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public a(Ljava/lang/Long;)Lcom/yandex/metrica/impl/ob/dk$a;
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dk$a;->c:Ljava/lang/Long;

    return-object p0
.end method

.method public a()Lcom/yandex/metrica/impl/ob/dk;
    .locals 2

    .line 136
    new-instance v0, Lcom/yandex/metrica/impl/ob/dk;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/yandex/metrica/impl/ob/dk;-><init>(Lcom/yandex/metrica/impl/ob/dk$a;B)V

    return-object v0
.end method

.method public b(Ljava/lang/Long;)Lcom/yandex/metrica/impl/ob/dk$a;
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dk$a;->d:Ljava/lang/Long;

    return-object p0
.end method

.method public c(Ljava/lang/Long;)Lcom/yandex/metrica/impl/ob/dk$a;
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dk$a;->f:Ljava/lang/Long;

    return-object p0
.end method

.method public d(Ljava/lang/Long;)Lcom/yandex/metrica/impl/ob/dk$a;
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dk$a;->h:Ljava/lang/Long;

    return-object p0
.end method

.method public e(Ljava/lang/Long;)Lcom/yandex/metrica/impl/ob/dk$a;
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dk$a;->a:Ljava/lang/Long;

    return-object p0
.end method

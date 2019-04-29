.class public Lcom/yandex/metrica/impl/ob/dk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/dk$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/dr;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final c:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final d:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final e:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final f:Ljava/lang/Boolean;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final g:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final h:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/impl/ob/dk$a;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/dk$a;->a(Lcom/yandex/metrica/impl/ob/dk$a;)Lcom/yandex/metrica/impl/ob/dr;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->a:Lcom/yandex/metrica/impl/ob/dr;

    .line 36
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/dk$a;->b(Lcom/yandex/metrica/impl/ob/dk$a;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->d:Ljava/lang/Integer;

    .line 37
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/dk$a;->c(Lcom/yandex/metrica/impl/ob/dk$a;)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->b:Ljava/lang/Long;

    .line 38
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/dk$a;->d(Lcom/yandex/metrica/impl/ob/dk$a;)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->c:Ljava/lang/Long;

    .line 39
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/dk$a;->e(Lcom/yandex/metrica/impl/ob/dk$a;)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->e:Ljava/lang/Long;

    .line 40
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/dk$a;->f(Lcom/yandex/metrica/impl/ob/dk$a;)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->f:Ljava/lang/Boolean;

    .line 41
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/dk$a;->g(Lcom/yandex/metrica/impl/ob/dk$a;)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->g:Ljava/lang/Long;

    .line 42
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/dk$a;->a:Ljava/lang/Long;

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dk;->h:Ljava/lang/Long;

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/impl/ob/dk$a;B)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/dk;-><init>(Lcom/yandex/metrica/impl/ob/dk$a;)V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->d:Ljava/lang/Integer;

    if-nez v0, :cond_0

    return p1

    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/dk;->d:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public a(J)J
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->b:Ljava/lang/Long;

    if-nez v0, :cond_0

    return-wide p1

    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/dk;->b:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    return-wide p1
.end method

.method public a()Lcom/yandex/metrica/impl/ob/dr;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->a:Lcom/yandex/metrica/impl/ob/dr;

    return-object v0
.end method

.method public a(Z)Z
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->f:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    return p1

    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/dk;->f:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public b(J)J
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->c:Ljava/lang/Long;

    if-nez v0, :cond_0

    return-wide p1

    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/dk;->c:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    return-wide p1
.end method

.method public c(J)J
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->e:Ljava/lang/Long;

    if-nez v0, :cond_0

    return-wide p1

    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/dk;->e:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    return-wide p1
.end method

.method public d(J)J
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->g:Ljava/lang/Long;

    if-nez v0, :cond_0

    return-wide p1

    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/dk;->g:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    return-wide p1
.end method

.method public e(J)J
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dk;->h:Ljava/lang/Long;

    if-nez v0, :cond_0

    return-wide p1

    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/dk;->h:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    return-wide p1
.end method

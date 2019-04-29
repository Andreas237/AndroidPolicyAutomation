.class Lcom/yandex/metrica/impl/al$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/al;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field final a:Lcom/yandex/metrica/impl/an;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/impl/an;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/an;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    iput-object p1, p0, Lcom/yandex/metrica/impl/al$b;->a:Lcom/yandex/metrica/impl/an;

    .line 181
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/an;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/al$b;->b:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/impl/an;B)V
    .locals 0

    .line 173
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/al$b;-><init>(Lcom/yandex/metrica/impl/an;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 190
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 194
    :cond_1
    check-cast p1, Lcom/yandex/metrica/impl/al$b;

    .line 196
    iget-object v0, p0, Lcom/yandex/metrica/impl/al$b;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/yandex/metrica/impl/al$b;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/yandex/metrica/impl/al$b;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

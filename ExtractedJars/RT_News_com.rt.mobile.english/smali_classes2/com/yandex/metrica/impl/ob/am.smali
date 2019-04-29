.class public Lcom/yandex/metrica/impl/ob/am;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final b:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final c:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final d:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final e:Lcom/yandex/metrica/impl/ob/ap;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ap;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/ap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/am;->a:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/am;->b:Ljava/lang/String;

    .line 36
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/am;->c:Ljava/lang/Integer;

    .line 37
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/am;->d:Ljava/lang/String;

    .line 38
    iput-object p5, p0, Lcom/yandex/metrica/impl/ob/am;->e:Lcom/yandex/metrica/impl/ob/ap;

    return-void
.end method

.method public static a(Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/am;
    .locals 7
    .param p0    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 76
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/t;->a()Lcom/yandex/metrica/impl/ob/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/u;->h()Ljava/lang/String;

    move-result-object v3

    .line 77
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/t;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/CounterConfiguration;->f()Ljava/lang/String;

    move-result-object v2

    .line 78
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/t;->a()Lcom/yandex/metrica/impl/ob/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/u;->e()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 79
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/t;->a()Lcom/yandex/metrica/impl/ob/u;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/u;->f()Ljava/lang/String;

    move-result-object v5

    .line 82
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/t;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration;->q()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 83
    new-instance p0, Lcom/yandex/metrica/impl/ob/av;

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/av;-><init>()V

    :goto_0
    move-object v6, p0

    goto :goto_1

    .line 88
    :cond_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/t;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/yandex/metrica/CounterConfiguration;->p()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 89
    new-instance p0, Lcom/yandex/metrica/impl/ob/at;

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/at;-><init>()V

    goto :goto_0

    .line 94
    :cond_1
    new-instance p0, Lcom/yandex/metrica/impl/ob/ax;

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/ax;-><init>()V

    goto :goto_0

    .line 100
    :goto_1
    new-instance p0, Lcom/yandex/metrica/impl/ob/am;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/yandex/metrica/impl/ob/am;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ap;)V

    return-object p0
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/ap;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/am;->e:Lcom/yandex/metrica/impl/ob/ap;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/am;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/am;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/Integer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/am;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/am;->d:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_9

    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_2

    .line 110
    :cond_1
    check-cast p1, Lcom/yandex/metrica/impl/ob/am;

    .line 112
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/am;->a:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/am;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/am;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/am;->a:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 113
    :cond_3
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/am;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/am;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    .line 114
    :cond_4
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/am;->c:Ljava/lang/Integer;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/am;->c:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/am;->c:Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_5
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/am;->c:Ljava/lang/Integer;

    if-eqz v2, :cond_6

    :goto_1
    return v1

    .line 116
    :cond_6
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/am;->d:Ljava/lang/String;

    if-eqz v2, :cond_7

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/am;->d:Ljava/lang/String;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/am;->d:Ljava/lang/String;

    .line 117
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_7
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/am;->d:Ljava/lang/String;

    if-nez p1, :cond_8

    return v0

    :cond_8
    return v1

    :cond_9
    :goto_2
    return v1
.end method

.method public hashCode()I
    .locals 3

    .line 123
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/am;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/am;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 124
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/am;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 125
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/am;->c:Ljava/lang/Integer;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/am;->c:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 126
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/am;->d:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/am;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ClientDescription{mApiKey=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/am;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mPackageName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/am;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mProcessID="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/am;->c:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", mProcessSessionID=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/am;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

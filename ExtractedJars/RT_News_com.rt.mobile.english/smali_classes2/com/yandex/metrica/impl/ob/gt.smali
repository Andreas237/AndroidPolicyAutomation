.class Lcom/yandex/metrica/impl/ob/gt;
.super Lcom/yandex/metrica/impl/ob/gq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/gt$a;
    }
.end annotation


# static fields
.field public static final a:J

.field public static final b:J


# instance fields
.field private c:Lcom/yandex/metrica/impl/c$a;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/c$a<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/yandex/metrica/impl/ob/gt$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private e:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 22
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/yandex/metrica/impl/ob/gt;->a:J

    .line 25
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/yandex/metrica/impl/ob/gt;->b:J

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/ob/gp;)V
    .locals 5
    .param p1    # Lcom/yandex/metrica/impl/ob/gp;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 46
    new-instance v0, Lcom/yandex/metrica/impl/ob/gt$a;

    sget-wide v1, Lcom/yandex/metrica/impl/ob/gt;->a:J

    const-wide/16 v3, 0xc8

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/yandex/metrica/impl/ob/gt$a;-><init>(JJ)V

    sget-wide v1, Lcom/yandex/metrica/impl/ob/gt;->b:J

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/gt;-><init>(Lcom/yandex/metrica/impl/ob/gp;Lcom/yandex/metrica/impl/ob/gt$a;J)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/gp;Lcom/yandex/metrica/impl/ob/gt$a;J)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/gp;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/gt$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 140
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/gq;-><init>(Lcom/yandex/metrica/impl/ob/gp;)V

    .line 141
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/gt;->d:Lcom/yandex/metrica/impl/ob/gt$a;

    .line 142
    iput-wide p3, p0, Lcom/yandex/metrica/impl/ob/gt;->e:J

    return-void
.end method

.method public static a(Landroid/location/Location;Landroid/location/Location;JJ)Z
    .locals 8
    .param p0    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p0, :cond_1

    return v1

    .line 99
    :cond_1
    invoke-virtual {p0}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    sub-long v6, v2, v4

    cmp-long v2, v6, p2

    if-lez v2, :cond_2

    move v2, v0

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    neg-long p2, p2

    cmp-long v3, v6, p2

    if-gez v3, :cond_3

    move p2, v0

    goto :goto_1

    :cond_3
    move p2, v1

    :goto_1
    const-wide/16 v3, 0x0

    cmp-long p3, v6, v3

    if-lez p3, :cond_4

    move p3, v0

    goto :goto_2

    :cond_4
    move p3, v1

    :goto_2
    if-eqz v2, :cond_5

    return v0

    :cond_5
    if-eqz p2, :cond_6

    return v1

    .line 114
    :cond_6
    invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F

    move-result p2

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v2

    sub-float/2addr p2, v2

    float-to-int p2, p2

    if-lez p2, :cond_7

    move v2, v0

    goto :goto_3

    :cond_7
    move v2, v1

    :goto_3
    if-gez p2, :cond_8

    move v3, v0

    goto :goto_4

    :cond_8
    move v3, v1

    :goto_4
    int-to-long v4, p2

    cmp-long p2, v4, p4

    if-lez p2, :cond_9

    move p2, v0

    goto :goto_5

    :cond_9
    move p2, v1

    .line 120
    :goto_5
    invoke-virtual {p0}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object p1

    if-nez p0, :cond_b

    if-nez p1, :cond_a

    move p0, v0

    goto :goto_6

    :cond_a
    move p0, v1

    goto :goto_6

    .line 1135
    :cond_b
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    :goto_6
    if-eqz v3, :cond_c

    return v0

    :cond_c
    if-eqz p3, :cond_d

    if-nez v2, :cond_d

    return v0

    :cond_d
    if-eqz p3, :cond_e

    if-nez p2, :cond_e

    if-eqz p0, :cond_e

    return v0

    :cond_e
    return v1
.end method


# virtual methods
.method public a()Landroid/location/Location;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gt;->c:Lcom/yandex/metrica/impl/c$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gt;->c:Lcom/yandex/metrica/impl/c$a;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/c$a;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    return-object v0
.end method

.method public a(Landroid/location/Location;Lcom/yandex/metrica/impl/ob/gs;)V
    .locals 6
    .param p1    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_2

    .line 1062
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/gt;->c:Lcom/yandex/metrica/impl/c$a;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/gt;->c:Lcom/yandex/metrica/impl/c$a;

    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/gt;->e:J

    invoke-virtual {p2, v0, v1}, Lcom/yandex/metrica/impl/c$a;->a(J)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/gt;->c:Lcom/yandex/metrica/impl/c$a;

    .line 1063
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/c$a;->a()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Landroid/location/Location;

    .line 1080
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/gt;->d:Lcom/yandex/metrica/impl/ob/gt$a;

    iget-wide v2, p2, Lcom/yandex/metrica/impl/ob/gt$a;->a:J

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/gt;->d:Lcom/yandex/metrica/impl/ob/gt$a;

    iget-wide v4, p2, Lcom/yandex/metrica/impl/ob/gt$a;->b:J

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lcom/yandex/metrica/impl/ob/gt;->a(Landroid/location/Location;Landroid/location/Location;JJ)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    :goto_1
    if-eqz p2, :cond_2

    .line 1066
    new-instance p2, Landroid/location/Location;

    invoke-direct {p2, p1}, Landroid/location/Location;-><init>(Landroid/location/Location;)V

    .line 1067
    new-instance p1, Lcom/yandex/metrica/impl/c$a;

    invoke-direct {p1}, Lcom/yandex/metrica/impl/c$a;-><init>()V

    .line 1068
    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/c$a;->a(Ljava/lang/Object;)V

    .line 1069
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gt;->c:Lcom/yandex/metrica/impl/c$a;

    :cond_2
    return-void
.end method

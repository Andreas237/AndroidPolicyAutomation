.class public final Lcom/yandex/metrica/impl/ob/jc$c$c;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jc$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field private static volatile d:[Lcom/yandex/metrica/impl/ob/jc$c$c;


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2091
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 2092
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jc$c$c;->e()Lcom/yandex/metrica/impl/ob/jc$c$c;

    return-void
.end method

.method public static d()[Lcom/yandex/metrica/impl/ob/jc$c$c;
    .locals 2

    .line 2074
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$c$c;->d:[Lcom/yandex/metrica/impl/ob/jc$c$c;

    if-nez v0, :cond_1

    .line 2075
    sget-object v0, Lcom/yandex/metrica/impl/ob/c;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2077
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/jc$c$c;->d:[Lcom/yandex/metrica/impl/ob/jc$c$c;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 2078
    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jc$c$c;

    sput-object v1, Lcom/yandex/metrica/impl/ob/jc$c$c;->d:[Lcom/yandex/metrica/impl/ob/jc$c$c;

    .line 2080
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 2082
    :cond_1
    :goto_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$c$c;->d:[Lcom/yandex/metrica/impl/ob/jc$c$c;

    return-object v0
.end method


# virtual methods
.method public synthetic a(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2068
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jc$c$c;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$c;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2105
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$c;->b:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 2106
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$c;->c:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 2107
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$c;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2125
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_3

    const/16 v1, 0xa

    if-eq v0, v1, :cond_2

    const/16 v1, 0x12

    if-eq v0, v1, :cond_1

    .line 2130
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 2140
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$c;->c:Ljava/lang/String;

    goto :goto_0

    .line 2136
    :cond_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$c;->b:Ljava/lang/String;

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method protected c()I
    .locals 3

    .line 2112
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 2113
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$c;->b:Ljava/lang/String;

    const/4 v2, 0x1

    .line 2114
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 2115
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$c;->c:Ljava/lang/String;

    const/4 v2, 0x2

    .line 2116
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/jc$c$c;
    .locals 1

    const-string v0, ""

    .line 2096
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$c;->b:Ljava/lang/String;

    const-string v0, ""

    .line 2097
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$c;->c:Ljava/lang/String;

    const/4 v0, -0x1

    .line 2098
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$c;->a:I

    return-object p0
.end method

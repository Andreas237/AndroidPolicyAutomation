.class public final Lcom/yandex/metrica/impl/ob/jc$c$d$a;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jc$c$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static volatile d:[Lcom/yandex/metrica/impl/ob/jc$c$d$a;


# instance fields
.field public b:Ljava/lang/String;

.field public c:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1607
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 1608
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->e()Lcom/yandex/metrica/impl/ob/jc$c$d$a;

    return-void
.end method

.method public static d()[Lcom/yandex/metrica/impl/ob/jc$c$d$a;
    .locals 2

    .line 1590
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->d:[Lcom/yandex/metrica/impl/ob/jc$c$d$a;

    if-nez v0, :cond_1

    .line 1591
    sget-object v0, Lcom/yandex/metrica/impl/ob/c;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 1593
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->d:[Lcom/yandex/metrica/impl/ob/jc$c$d$a;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 1594
    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jc$c$d$a;

    sput-object v1, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->d:[Lcom/yandex/metrica/impl/ob/jc$c$d$a;

    .line 1596
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 1598
    :cond_1
    :goto_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->d:[Lcom/yandex/metrica/impl/ob/jc$c$d$a;

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

    .line 1584
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$d$a;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1621
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->b:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 1622
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->c:J

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IJ)V

    .line 1623
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1641
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_3

    const/16 v1, 0xa

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    .line 1646
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 1656
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->c:J

    goto :goto_0

    .line 1652
    :cond_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->b:Ljava/lang/String;

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method protected c()I
    .locals 4

    .line 1628
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 1629
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->b:Ljava/lang/String;

    const/4 v2, 0x1

    .line 1630
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1631
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->c:J

    const/4 v3, 0x2

    .line 1632
    invoke-static {v3, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/jc$c$d$a;
    .locals 2

    const-string v0, ""

    .line 1612
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->b:Ljava/lang/String;

    const-wide/16 v0, 0x0

    .line 1613
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->c:J

    const/4 v0, -0x1

    .line 1614
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$d$a;->a:I

    return-object p0
.end method

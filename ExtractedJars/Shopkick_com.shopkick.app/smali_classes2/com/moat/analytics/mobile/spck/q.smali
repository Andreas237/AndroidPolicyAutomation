.class Lcom/moat/analytics/mobile/spck/q;
.super Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Moat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Lcom/moat/analytics/mobile/spck/x;->a()Lcom/moat/analytics/mobile/spck/x;

    move-result-object v0

    iget-boolean v0, v0, Lcom/moat/analytics/mobile/spck/x;->b:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "message = %s"

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p3, v0, v1

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "id = %s, message = %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v3, v1

    aput-object p3, v3, v0

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-static {p0, p1, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method

.method static a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {}, Lcom/moat/analytics/mobile/spck/x;->a()Lcom/moat/analytics/mobile/spck/x;

    move-result-object v0

    iget-boolean v0, v0, Lcom/moat/analytics/mobile/spck/x;->b:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "id = %s, message = %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/moat/analytics/mobile/spck/x;->a()Lcom/moat/analytics/mobile/spck/x;

    move-result-object v0

    iget-boolean v0, v0, Lcom/moat/analytics/mobile/spck/x;->b:Z

    if-nez v0, :cond_1

    invoke-static {}, Lcom/moat/analytics/mobile/spck/MoatAnalytics;->getInstance()Lcom/moat/analytics/mobile/spck/MoatAnalytics;

    move-result-object v0

    check-cast v0, Lcom/moat/analytics/mobile/spck/l;

    iget-boolean v0, v0, Lcom/moat/analytics/mobile/spck/l;->a:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    const-string v1, "[ERROR] "

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x6

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "MoatAnalytics"

    invoke-static {v0, p1, p0}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method

.method static b(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/moat/analytics/mobile/spck/x;->a()Lcom/moat/analytics/mobile/spck/x;

    move-result-object v0

    iget-boolean v0, v0, Lcom/moat/analytics/mobile/spck/x;->c:Z

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "id = %s, message = %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez p2, :cond_0

    const-string p2, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :goto_0
    aput-object p2, v1, v2

    const/4 p2, 0x1

    aput-object p3, v1, p2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method

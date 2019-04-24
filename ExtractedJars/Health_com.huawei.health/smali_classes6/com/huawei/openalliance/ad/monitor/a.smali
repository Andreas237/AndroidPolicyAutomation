.class public Lcom/huawei/openalliance/ad/monitor/a;
.super Lcom/huawei/openalliance/ad/monitor/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/monitor/a$a;
    }
.end annotation


# instance fields
.field private b:Lcom/huawei/openalliance/ad/monitor/a$a;

.field private c:J

.field private d:I

.field private e:Z

.field private f:J

.field private g:I


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/huawei/openalliance/ad/monitor/a$a;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/monitor/b;-><init>(Landroid/view/View;)V

    const-wide/16 v0, 0x1f4

    iput-wide v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->c:J

    const/16 v0, 0x32

    iput v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->d:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->e:Z

    iput-object p2, p0, Lcom/huawei/openalliance/ad/monitor/a;->b:Lcom/huawei/openalliance/ad/monitor/a$a;

    return-void
.end method

.method private h()V
    .locals 2

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "PPSNativeViewMonitor"

    const-string v1, "viewShowStartRecord"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->e:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->f:J

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->b:Lcom/huawei/openalliance/ad/monitor/a$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->b:Lcom/huawei/openalliance/ad/monitor/a$a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/monitor/a$a;->a()V

    :cond_1
    return-void
.end method

.method private i()V
    .locals 9

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->e:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "PPSNativeViewMonitor"

    const-string v1, "viewShowEndRecord"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->e:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->f:J

    sub-long v7, v5, v0

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "PPSNativeViewMonitor"

    const-string v1, "max visible area percentage: %d duration: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/huawei/openalliance/ad/monitor/a;->g:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-wide v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->c:J

    cmp-long v0, v7, v0

    if-ltz v0, :cond_2

    iget v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->g:I

    iget v1, p0, Lcom/huawei/openalliance/ad/monitor/a;->d:I

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->b:Lcom/huawei/openalliance/ad/monitor/a$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->b:Lcom/huawei/openalliance/ad/monitor/a$a;

    iget v1, p0, Lcom/huawei/openalliance/ad/monitor/a;->g:I

    invoke-interface {v0, v7, v8, v1}, Lcom/huawei/openalliance/ad/monitor/a$a;->a(JI)V

    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->g:I

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->b:Lcom/huawei/openalliance/ad/monitor/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->b:Lcom/huawei/openalliance/ad/monitor/a$a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/monitor/a$a;->b()V

    :cond_0
    return-void
.end method

.method protected a(I)V
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->g:I

    if-le p1, v0, :cond_0

    iput p1, p0, Lcom/huawei/openalliance/ad/monitor/a;->g:I

    :cond_0
    iget v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->d:I

    if-lt p1, v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/a;->h()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/a;->i()V

    :goto_0
    return-void
.end method

.method protected a(JI)V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/a;->i()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->b:Lcom/huawei/openalliance/ad/monitor/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->b:Lcom/huawei/openalliance/ad/monitor/a$a;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/openalliance/ad/monitor/a$a;->b(JI)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    const/16 v0, 0x32

    iput v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->d:I

    const-wide/16 v0, 0x1f4

    iput-wide v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->c:J

    return-void
.end method

.method public b(JI)V
    .locals 0

    iput p3, p0, Lcom/huawei/openalliance/ad/monitor/a;->d:I

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/monitor/a;->c:J

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->g:I

    return v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/monitor/a;->f:J

    return-wide v0
.end method

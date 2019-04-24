.class public Lo/anp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/Object;

.field private c:Lo/amh;

.field private d:Lo/ald;

.field private e:Lo/ald;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/anp;->c:Lo/amh;

    .line 16
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/anp;->b:Ljava/lang/Object;

    .line 19
    new-instance v0, Lo/ald;

    invoke-direct {v0}, Lo/ald;-><init>()V

    iput-object v0, p0, Lo/anp;->e:Lo/ald;

    .line 20
    new-instance v0, Lo/ald;

    invoke-direct {v0}, Lo/ald;-><init>()V

    iput-object v0, p0, Lo/anp;->d:Lo/ald;

    .line 24
    if-nez p1, :cond_0

    .line 25
    const-string v0, "Step_ReportController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "context init null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    return-void

    .line 28
    :cond_0
    new-instance v0, Lo/amh;

    invoke-direct {v0, p1}, Lo/amh;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/anp;->c:Lo/amh;

    .line 29
    iget-object v0, p0, Lo/anp;->c:Lo/amh;

    new-instance v1, Lo/anp$3;

    invoke-direct {v1, p0}, Lo/anp$3;-><init>(Lo/anp;)V

    invoke-virtual {v0, v1}, Lo/amh;->d(Lo/amh$c;)V

    .line 35
    return-void
.end method


# virtual methods
.method public c(Z)I
    .locals 7

    .line 88
    iget-object v5, p0, Lo/anp;->b:Ljava/lang/Object;

    monitor-enter v5

    .line 90
    :try_start_0
    iget-object v0, p0, Lo/anp;->d:Lo/ald;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 91
    monitor-exit v5

    const/4 v0, 0x0

    return v0

    .line 94
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/anp;->c:Lo/amh;

    iget-object v1, p0, Lo/anp;->d:Lo/ald;

    invoke-virtual {v0, v1, p1}, Lo/amh;->d(Lo/ald;Z)I

    move-result v4

    .line 95
    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 97
    :pswitch_0
    iget-object v0, p0, Lo/anp;->d:Lo/ald;

    iput-object v0, p0, Lo/anp;->e:Lo/ald;

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lo/anp;->d:Lo/ald;

    .line 100
    goto :goto_0

    .line 103
    :pswitch_1
    const-string v0, "Step_ReportController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FAILED_NULL_POINTER"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lo/anp;->d:Lo/ald;

    .line 107
    goto :goto_0

    .line 110
    :pswitch_2
    const-string v0, "Step_ReportController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FAILED_ERROR_DATA"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    const/4 v0, 0x0

    iput-object v0, p0, Lo/anp;->d:Lo/ald;

    .line 113
    goto :goto_0

    .line 116
    :pswitch_3
    const-string v0, "Step_ReportController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FAILED_SCREEN_OFF block report"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    .line 122
    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 123
    :goto_1
    return v4

    nop

    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public d()I
    .locals 1

    .line 81
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/anp;->c(Z)I

    move-result v0

    return v0
.end method

.method public d(Lo/alb;)V
    .locals 6

    .line 43
    iget-object v0, p0, Lo/anp;->c:Lo/amh;

    invoke-virtual {v0, p1}, Lo/amh;->e(Lo/alb;)V

    .line 44
    iget-object v4, p0, Lo/anp;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 45
    :try_start_0
    iget-object v0, p0, Lo/anp;->d:Lo/ald;

    if-nez v0, :cond_0

    .line 46
    iget-object v0, p0, Lo/anp;->e:Lo/ald;

    iput-object v0, p0, Lo/anp;->d:Lo/ald;

    .line 48
    :cond_0
    const-string v0, "Step_ReportController"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "add-force-data: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/anp;->d:Lo/ald;

    iget v2, v2, Lo/ald;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/anp;->d:Lo/ald;

    iget v2, v2, Lo/ald;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/anp;->d:Lo/ald;

    iget v2, v2, Lo/ald;->d:I

    .line 49
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/anp;->d:Lo/ald;

    iget v2, v2, Lo/ald;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 48
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 51
    :goto_0
    invoke-virtual {p0}, Lo/anp;->d()I

    .line 52
    return-void
.end method

.method public e(Lo/ald;Z)V
    .locals 6

    .line 56
    if-nez p1, :cond_0

    .line 57
    return-void

    .line 59
    :cond_0
    iget-object v4, p0, Lo/anp;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 63
    if-nez p2, :cond_2

    :try_start_0
    iget-object v0, p0, Lo/anp;->e:Lo/ald;

    invoke-virtual {p1, v0}, Lo/ald;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/anp;->d:Lo/ald;

    invoke-virtual {p1, v0}, Lo/ald;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 64
    :cond_1
    const-string v0, "Step_ReportController"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "duplicate data : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->d:I

    .line 65
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 64
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    monitor-exit v4

    return-void

    .line 69
    :cond_2
    const-string v0, "Step_ReportController"

    const/16 v1, 0x8

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushdata : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->d:I

    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 69
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iput-object p1, p0, Lo/anp;->d:Lo/ald;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 76
    :goto_0
    invoke-virtual {p0, p2}, Lo/anp;->c(Z)I

    .line 77
    return-void
.end method

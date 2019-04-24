.class public Lo/dhg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/Object;

.field private static e:Lo/dhg;


# instance fields
.field private b:Lo/dhq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dhg;->d:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dhg;->b:Lo/dhq;

    .line 35
    iget-object v0, p0, Lo/dhg;->b:Lo/dhq;

    if-nez v0, :cond_0

    .line 36
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dhq;->a(Landroid/content/Context;)Lo/dhq;

    move-result-object v0

    iput-object v0, p0, Lo/dhg;->b:Lo/dhq;

    .line 38
    :cond_0
    return-void
.end method

.method private b()V
    .locals 1

    .line 41
    iget-object v0, p0, Lo/dhg;->b:Lo/dhq;

    if-nez v0, :cond_0

    .line 42
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dhq;->a(Landroid/content/Context;)Lo/dhq;

    move-result-object v0

    iput-object v0, p0, Lo/dhg;->b:Lo/dhq;

    .line 44
    :cond_0
    return-void
.end method

.method public static d()Lo/dhg;
    .locals 3

    .line 24
    sget-object v1, Lo/dhg;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 25
    :try_start_0
    sget-object v0, Lo/dhg;->e:Lo/dhg;

    if-nez v0, :cond_0

    .line 26
    new-instance v0, Lo/dhg;

    invoke-direct {v0}, Lo/dhg;-><init>()V

    sput-object v0, Lo/dhg;->e:Lo/dhg;

    goto :goto_0

    .line 28
    :cond_0
    sget-object v0, Lo/dhg;->e:Lo/dhg;

    iget-object v0, v0, Lo/dhg;->b:Lo/dhq;

    invoke-virtual {v0}, Lo/dhq;->c()V

    .line 30
    :goto_0
    sget-object v0, Lo/dhg;->e:Lo/dhg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 31
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 51
    invoke-direct {p0}, Lo/dhg;->b()V

    .line 52
    iget-object v0, p0, Lo/dhg;->b:Lo/dhq;

    invoke-virtual {v0}, Lo/dhq;->d()Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 94
    invoke-direct {p0}, Lo/dhg;->b()V

    .line 95
    iget-object v0, p0, Lo/dhg;->b:Lo/dhq;

    invoke-virtual {v0, p1}, Lo/dhq;->a(Ljava/lang/String;)V

    .line 96
    return-void
.end method

.method public b(Lo/dhi;Ljava/lang/String;)V
    .locals 1

    .line 103
    invoke-direct {p0}, Lo/dhg;->b()V

    .line 104
    iget-object v0, p0, Lo/dhg;->b:Lo/dhq;

    invoke-virtual {v0, p1, p2}, Lo/dhq;->e(Lo/dhi;Ljava/lang/String;)V

    .line 106
    return-void
.end method

.method public c()I
    .locals 1

    .line 123
    invoke-direct {p0}, Lo/dhg;->b()V

    .line 124
    iget-object v0, p0, Lo/dhg;->b:Lo/dhq;

    invoke-virtual {v0}, Lo/dhq;->e()I

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 112
    invoke-direct {p0}, Lo/dhg;->b()V

    .line 113
    iget-object v0, p0, Lo/dhg;->b:Lo/dhq;

    invoke-virtual {v0, p1}, Lo/dhq;->b(Ljava/lang/String;)V

    .line 114
    return-void
.end method

.method public c(Lo/dhl;Ljava/lang/String;)V
    .locals 1

    .line 85
    invoke-direct {p0}, Lo/dhg;->b()V

    .line 86
    iget-object v0, p0, Lo/dhg;->b:Lo/dhq;

    invoke-virtual {v0, p1, p2}, Lo/dhq;->b(Lo/dhl;Ljava/lang/String;)V

    .line 88
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 76
    invoke-direct {p0}, Lo/dhg;->b()V

    .line 77
    iget-object v0, p0, Lo/dhg;->b:Lo/dhq;

    invoke-virtual {v0, p1}, Lo/dhq;->c(Ljava/lang/String;)V

    .line 78
    return-void
.end method

.method public d(Z)V
    .locals 1

    .line 117
    invoke-direct {p0}, Lo/dhg;->b()V

    .line 118
    iget-object v0, p0, Lo/dhg;->b:Lo/dhq;

    invoke-virtual {v0, p1}, Lo/dhq;->b(Z)V

    .line 119
    return-void
.end method

.method public e()V
    .locals 1

    .line 57
    invoke-direct {p0}, Lo/dhg;->b()V

    .line 58
    iget-object v0, p0, Lo/dhg;->b:Lo/dhq;

    invoke-virtual {v0}, Lo/dhq;->a()V

    .line 59
    return-void
.end method

.method public e(Lo/dhj;Ljava/lang/String;)V
    .locals 1

    .line 68
    invoke-direct {p0}, Lo/dhg;->b()V

    .line 69
    iget-object v0, p0, Lo/dhg;->b:Lo/dhq;

    invoke-virtual {v0, p1, p2}, Lo/dhq;->c(Lo/dhj;Ljava/lang/String;)V

    .line 70
    return-void
.end method

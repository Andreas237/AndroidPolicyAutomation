.class public final Lo/ayy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/ayy;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Lo/ayy;

    invoke-direct {v0}, Lo/ayy;-><init>()V

    sput-object v0, Lo/ayy;->d:Lo/ayy;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v1, Lo/bca;

    invoke-direct {v1}, Lo/bca;-><init>()V

    .line 34
    invoke-virtual {v1}, Lo/bca;->k()I

    move-result v0

    iput v0, p0, Lo/ayy;->b:I

    .line 35
    invoke-virtual {v1}, Lo/bca;->f()I

    move-result v0

    iput v0, p0, Lo/ayy;->a:I

    .line 36
    invoke-virtual {v1}, Lo/bca;->g()I

    move-result v0

    iput v0, p0, Lo/ayy;->e:I

    .line 37
    invoke-virtual {v1}, Lo/bca;->h()I

    move-result v0

    iput v0, p0, Lo/ayy;->c:I

    .line 39
    return-void
.end method

.method public static declared-synchronized d()Lo/ayy;
    .locals 3

    const-class v1, Lo/ayy;

    monitor-enter v1

    .line 43
    :try_start_0
    sget-object v0, Lo/ayy;->d:Lo/ayy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public c(IIII)V
    .locals 3

    .line 89
    invoke-static {p4}, Lo/bah;->a(I)I

    move-result v0

    iput v0, p0, Lo/ayy;->b:I

    .line 90
    invoke-static {p3}, Lo/bah;->d(I)I

    move-result v0

    iput v0, p0, Lo/ayy;->a:I

    .line 91
    invoke-static {p1}, Lo/bah;->c(I)I

    move-result v0

    iput v0, p0, Lo/ayy;->c:I

    .line 92
    invoke-static {p2}, Lo/bah;->e(I)I

    move-result v0

    iput v0, p0, Lo/ayy;->e:I

    .line 94
    new-instance v2, Lo/bca;

    invoke-direct {v2}, Lo/bca;-><init>()V

    .line 95
    iget v0, p0, Lo/ayy;->b:I

    invoke-virtual {v2, v0}, Lo/bca;->e(I)V

    .line 96
    iget v0, p0, Lo/ayy;->a:I

    invoke-virtual {v2, v0}, Lo/bca;->a(I)V

    .line 97
    iget v0, p0, Lo/ayy;->c:I

    invoke-virtual {v2, v0}, Lo/bca;->d(I)V

    .line 98
    iget v0, p0, Lo/ayy;->e:I

    invoke-virtual {v2, v0}, Lo/bca;->c(I)V

    .line 100
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    iget v1, p0, Lo/ayy;->b:I

    invoke-virtual {v0, v1}, Lo/bcm;->c(I)V

    .line 101
    return-void
.end method

.method public e()I
    .locals 1

    .line 53
    iget v0, p0, Lo/ayy;->a:I

    .line 54
    return v0
.end method

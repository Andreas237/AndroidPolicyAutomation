.class public Lo/bpz$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bpz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lo/bqe;

.field private b:I

.field private c:Z

.field private d:Z

.field private e:I

.field private i:Lo/bqe;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 505
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 507
    const/16 v0, 0x2710

    iput v0, p0, Lo/bpz$a;->e:I

    .line 509
    const/16 v0, 0x2710

    iput v0, p0, Lo/bpz$a;->b:I

    .line 511
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bpz$a;->c:Z

    .line 513
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bpz$a;->d:Z

    .line 514
    return-void
.end method

.method static synthetic a(Lo/bpz$a;)Lo/bqe;
    .locals 1

    .line 495
    iget-object v0, p0, Lo/bpz$a;->a:Lo/bqe;

    return-object v0
.end method

.method static synthetic b(Lo/bpz$a;)Z
    .locals 1

    .line 495
    iget-boolean v0, p0, Lo/bpz$a;->d:Z

    return v0
.end method

.method static synthetic c(Lo/bpz$a;)I
    .locals 1

    .line 495
    iget v0, p0, Lo/bpz$a;->b:I

    return v0
.end method

.method static synthetic d(Lo/bpz$a;)I
    .locals 1

    .line 495
    iget v0, p0, Lo/bpz$a;->e:I

    return v0
.end method

.method static synthetic e(Lo/bpz$a;)Z
    .locals 1

    .line 495
    iget-boolean v0, p0, Lo/bpz$a;->c:Z

    return v0
.end method

.method static synthetic h(Lo/bpz$a;)Lo/bqe;
    .locals 1

    .line 495
    iget-object v0, p0, Lo/bpz$a;->i:Lo/bqe;

    return-object v0
.end method


# virtual methods
.method public a(I)Lo/bpz$a;
    .locals 0

    .line 523
    iput p1, p0, Lo/bpz$a;->e:I

    .line 524
    return-object p0
.end method

.method public b(Lo/bqe;)Lo/bpz$a;
    .locals 0

    .line 578
    iput-object p1, p0, Lo/bpz$a;->i:Lo/bqe;

    .line 579
    return-object p0
.end method

.method public c(Z)Lo/bpz$a;
    .locals 0

    .line 556
    iput-boolean p1, p0, Lo/bpz$a;->d:Z

    .line 557
    return-object p0
.end method

.method public c()Lo/bpz;
    .locals 2

    .line 584
    new-instance v0, Lo/bpz;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/bpz;-><init>(Lo/bpz$a;Lo/bpz$4;)V

    return-object v0
.end method

.method public e(I)Lo/bpz$a;
    .locals 0

    .line 534
    iput p1, p0, Lo/bpz$a;->b:I

    .line 535
    return-object p0
.end method

.method public e(Lo/bqe;)Lo/bpz$a;
    .locals 0

    .line 567
    iput-object p1, p0, Lo/bpz$a;->a:Lo/bqe;

    .line 568
    return-object p0
.end method

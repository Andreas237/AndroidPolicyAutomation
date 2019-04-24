.class public Lo/fbc$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fbc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lo/eld$b;

.field private b:Lo/elb;

.field private d:I


# direct methods
.method public constructor <init>(Lo/elb;Lo/eld$b;)V
    .locals 0

    .line 365
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 366
    iput-object p1, p0, Lo/fbc$a;->b:Lo/elb;

    .line 367
    iput-object p2, p0, Lo/fbc$a;->a:Lo/eld$b;

    .line 368
    invoke-direct {p0}, Lo/fbc$a;->a()V

    .line 369
    return-void
.end method

.method private a()V
    .locals 2

    .line 397
    iget-object v0, p0, Lo/fbc$a;->a:Lo/eld$b;

    iget v0, v0, Lo/eld$b;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fbc$a;->d:I

    .line 398
    return-void
.end method

.method static synthetic a(Lo/fbc$a;)V
    .locals 0

    .line 348
    invoke-direct {p0}, Lo/fbc$a;->a()V

    return-void
.end method


# virtual methods
.method public c()Lcom/github/mikephil/charting/data/Entry;
    .locals 2

    .line 388
    invoke-virtual {p0}, Lo/fbc$a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 389
    const/4 v0, 0x0

    return-object v0

    .line 391
    :cond_0
    iget v0, p0, Lo/fbc$a;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fbc$a;->d:I

    .line 392
    iget-object v0, p0, Lo/fbc$a;->b:Lo/elb;

    iget v1, p0, Lo/fbc$a;->d:I

    invoke-virtual {v0, v1}, Lo/elb;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 3

    .line 372
    iget v0, p0, Lo/fbc$a;->d:I

    add-int/lit8 v2, v0, 0x1

    .line 374
    iget-object v0, p0, Lo/fbc$a;->a:Lo/eld$b;

    iget v0, v0, Lo/eld$b;->a:I

    if-ge v2, v0, :cond_0

    .line 375
    const/4 v0, 0x1

    return v0

    .line 377
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e()Lcom/github/mikephil/charting/data/Entry;
    .locals 3

    .line 381
    invoke-virtual {p0}, Lo/fbc$a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 382
    const/4 v0, 0x0

    return-object v0

    .line 384
    :cond_0
    iget-object v0, p0, Lo/fbc$a;->b:Lo/elb;

    iget v1, p0, Lo/fbc$a;->d:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lo/elb;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    return-object v0
.end method

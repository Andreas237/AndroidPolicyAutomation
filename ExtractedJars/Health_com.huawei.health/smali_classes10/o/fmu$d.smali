.class Lo/fmu$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fmu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field private b:I

.field final synthetic c:Lo/fmu;

.field private d:D

.field private e:J


# direct methods
.method public constructor <init>(Lo/fmu;JD)V
    .locals 1

    .line 428
    iput-object p1, p0, Lo/fmu$d;->c:Lo/fmu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 429
    iput-wide p2, p0, Lo/fmu$d;->e:J

    .line 430
    iput-wide p4, p0, Lo/fmu$d;->d:D

    .line 431
    const/4 v0, 0x1

    iput v0, p0, Lo/fmu$d;->b:I

    .line 433
    return-void
.end method


# virtual methods
.method public a()D
    .locals 2

    .line 450
    iget-wide v0, p0, Lo/fmu$d;->d:D

    return-wide v0
.end method

.method public b()V
    .locals 1

    .line 439
    const/4 v0, 0x3

    iput v0, p0, Lo/fmu$d;->b:I

    .line 440
    return-void
.end method

.method public c()V
    .locals 1

    .line 436
    const/4 v0, 0x2

    iput v0, p0, Lo/fmu$d;->b:I

    .line 437
    return-void
.end method

.method public d()J
    .locals 2

    .line 446
    iget-wide v0, p0, Lo/fmu$d;->e:J

    return-wide v0
.end method

.method public e()I
    .locals 1

    .line 442
    iget v0, p0, Lo/fmu$d;->b:I

    return v0
.end method

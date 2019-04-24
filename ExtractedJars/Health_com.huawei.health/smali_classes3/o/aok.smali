.class public Lo/aok;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I

.field private d:I

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/aok;->e:J

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lo/aok;->b:I

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lo/aok;->c:I

    .line 31
    const/4 v0, 0x1

    iput v0, p0, Lo/aok;->d:I

    .line 36
    const-string v0, ""

    iput-object v0, p0, Lo/aok;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 39
    iget-wide v0, p0, Lo/aok;->e:J

    return-wide v0
.end method

.method public a(I)V
    .locals 0

    .line 51
    iput p1, p0, Lo/aok;->b:I

    .line 52
    return-void
.end method

.method public b()I
    .locals 1

    .line 55
    iget v0, p0, Lo/aok;->c:I

    return v0
.end method

.method public b(I)V
    .locals 0

    .line 59
    iput p1, p0, Lo/aok;->c:I

    .line 60
    return-void
.end method

.method public b(J)V
    .locals 0

    .line 43
    iput-wide p1, p0, Lo/aok;->e:J

    .line 44
    return-void
.end method

.method public c()I
    .locals 1

    .line 47
    iget v0, p0, Lo/aok;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 63
    iget v0, p0, Lo/aok;->d:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 67
    iput p1, p0, Lo/aok;->d:I

    .line 68
    return-void
.end method

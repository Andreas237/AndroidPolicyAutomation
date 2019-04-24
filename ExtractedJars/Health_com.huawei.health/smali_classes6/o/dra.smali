.class public Lo/dra;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/drw;

.field private b:Lo/dqy;

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dra;->b:Lo/dqy;

    return-void
.end method


# virtual methods
.method public a()Lo/dqy;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/dra;->b:Lo/dqy;

    return-object v0
.end method

.method public a(Lo/dqy;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lo/dra;->b:Lo/dqy;

    .line 40
    return-void
.end method

.method public b()I
    .locals 1

    .line 27
    iget v0, p0, Lo/dra;->d:I

    return v0
.end method

.method public b(I)V
    .locals 0

    .line 23
    iput p1, p0, Lo/dra;->c:I

    .line 24
    return-void
.end method

.method public c()Lo/drw;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/dra;->a:Lo/drw;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 19
    iget v0, p0, Lo/dra;->c:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 31
    iput p1, p0, Lo/dra;->d:I

    .line 32
    return-void
.end method

.method public e()I
    .locals 1

    .line 11
    iget v0, p0, Lo/dra;->e:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 15
    iput p1, p0, Lo/dra;->e:I

    .line 16
    return-void
.end method

.method public e(Lo/drw;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lo/dra;->a:Lo/drw;

    .line 47
    return-void
.end method

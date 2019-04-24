.class public Lo/dki;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 41
    iget v0, p0, Lo/dki;->d:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 37
    iput p1, p0, Lo/dki;->c:I

    .line 38
    return-void
.end method

.method public b()I
    .locals 1

    .line 33
    iget v0, p0, Lo/dki;->c:I

    return v0
.end method

.method public b(I)V
    .locals 0

    .line 53
    iput p1, p0, Lo/dki;->e:I

    .line 54
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 45
    iput p1, p0, Lo/dki;->d:I

    .line 46
    return-void
.end method

.method public d()I
    .locals 1

    .line 17
    iget v0, p0, Lo/dki;->b:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 29
    iput p1, p0, Lo/dki;->a:I

    .line 30
    return-void
.end method

.method public e()I
    .locals 1

    .line 49
    iget v0, p0, Lo/dki;->e:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 21
    iput p1, p0, Lo/dki;->b:I

    .line 22
    return-void
.end method

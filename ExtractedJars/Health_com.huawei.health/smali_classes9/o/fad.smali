.class public Lo/fad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 44
    iget v0, p0, Lo/fad;->d:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 24
    iput p1, p0, Lo/fad;->c:I

    .line 25
    return-void
.end method

.method public b()I
    .locals 1

    .line 28
    iget v0, p0, Lo/fad;->c:I

    return v0
.end method

.method public b(I)V
    .locals 0

    .line 48
    iput p1, p0, Lo/fad;->a:I

    .line 49
    return-void
.end method

.method public c()I
    .locals 1

    .line 56
    iget v0, p0, Lo/fad;->e:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 60
    iput p1, p0, Lo/fad;->e:I

    .line 61
    return-void
.end method

.method public d()I
    .locals 1

    .line 52
    iget v0, p0, Lo/fad;->a:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 40
    iput p1, p0, Lo/fad;->d:I

    .line 41
    return-void
.end method

.method public e()I
    .locals 1

    .line 36
    iget v0, p0, Lo/fad;->b:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 32
    iput p1, p0, Lo/fad;->b:I

    .line 33
    return-void
.end method

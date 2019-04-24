.class public Lo/ddo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:I

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, -0x1

    iput v0, p0, Lo/ddo;->e:I

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 0

    .line 24
    iput p1, p0, Lo/ddo;->d:I

    .line 25
    return-void
.end method

.method public c()I
    .locals 1

    .line 28
    iget v0, p0, Lo/ddo;->e:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 32
    iput p1, p0, Lo/ddo;->e:I

    .line 33
    return-void
.end method

.method public e()I
    .locals 1

    .line 20
    iget v0, p0, Lo/ddo;->d:I

    return v0
.end method

.class public Lo/dkh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private e:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput v0, p0, Lo/dkh;->a:I

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkh;->e:[B

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 22
    iget v0, p0, Lo/dkh;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public d(I)V
    .locals 1

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/dkh;->a:I

    .line 27
    return-void
.end method

.method public e([B)V
    .locals 1

    .line 38
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 39
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, p0, Lo/dkh;->e:[B

    .line 41
    :cond_0
    return-void
.end method

.method public e()[B
    .locals 2

    .line 31
    iget-object v0, p0, Lo/dkh;->e:[B

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 32
    const/4 v0, 0x0

    return-object v0

    .line 34
    :cond_0
    iget-object v0, p0, Lo/dkh;->e:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

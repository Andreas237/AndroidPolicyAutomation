.class public Lo/auy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Z

.field private c:Z

.field private e:I


# direct methods
.method public constructor <init>(IZ)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/auy;->c:Z

    .line 45
    iput p1, p0, Lo/auy;->e:I

    .line 46
    iput-boolean p2, p0, Lo/auy;->b:Z

    .line 47
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 62
    iget v0, p0, Lo/auy;->e:I

    return v0
.end method

.method public c()Z
    .locals 1

    .line 52
    iget-boolean v0, p0, Lo/auy;->c:Z

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 2

    .line 114
    iget-boolean v0, p0, Lo/auy;->b:Z

    if-eqz v0, :cond_0

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gallery_thumnail_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/auy;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 119
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gallery_original_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/auy;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Z)V
    .locals 0

    .line 57
    iput-boolean p1, p0, Lo/auy;->c:Z

    .line 58
    return-void
.end method

.method public e()Z
    .locals 1

    .line 72
    iget-boolean v0, p0, Lo/auy;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 83
    if-eqz p1, :cond_0

    .line 85
    instance-of v0, p1, Lo/auy;

    if-eqz v0, :cond_0

    .line 87
    move-object v2, p1

    check-cast v2, Lo/auy;

    .line 88
    iget v0, v2, Lo/auy;->e:I

    iget v1, p0, Lo/auy;->e:I

    if-ne v0, v1, :cond_0

    .line 90
    const/4 v0, 0x1

    return v0

    .line 94
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 100
    const/4 v1, 0x0

    .line 101
    iget-boolean v0, p0, Lo/auy;->b:Z

    if-eqz v0, :cond_0

    .line 103
    const/4 v1, 0x1

    .line 105
    :cond_0
    iget v0, p0, Lo/auy;->e:I

    add-int/2addr v0, v1

    return v0
.end method

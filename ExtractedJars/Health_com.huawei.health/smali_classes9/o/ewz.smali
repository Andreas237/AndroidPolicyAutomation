.class public Lo/ewz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:I

.field private c:Z

.field private d:I


# direct methods
.method public constructor <init>(IZ)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput v0, p0, Lo/ewz;->a:I

    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewz;->c:Z

    .line 28
    iput p1, p0, Lo/ewz;->a:I

    .line 29
    iput-boolean p2, p0, Lo/ewz;->c:Z

    .line 30
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 37
    iput p1, p0, Lo/ewz;->a:I

    .line 38
    return-void
.end method

.method public b()I
    .locals 1

    .line 33
    iget v0, p0, Lo/ewz;->a:I

    return v0
.end method

.method public c()I
    .locals 1

    .line 59
    iget v0, p0, Lo/ewz;->d:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 49
    iput p1, p0, Lo/ewz;->d:I

    .line 50
    return-void
.end method

.method public e()Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lo/ewz;->c:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FoodType [mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/ewz;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mCanBeModified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/ewz;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

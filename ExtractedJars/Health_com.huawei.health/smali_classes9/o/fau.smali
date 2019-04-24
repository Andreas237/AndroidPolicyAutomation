.class public Lo/fau;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lo/fau;->a:I

    .line 13
    const/4 v0, -0x1

    iput v0, p0, Lo/fau;->b:I

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fau;->d:Ljava/lang/String;

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fau;->c:Ljava/lang/String;

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fau;->e:Ljava/lang/String;

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fau;->i:Ljava/lang/String;

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fau;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 25
    iget v0, p0, Lo/fau;->a:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 21
    iput p1, p0, Lo/fau;->a:I

    .line 22
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lo/fau;->d:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/fau;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lo/fau;->i:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public c()I
    .locals 1

    .line 33
    iget v0, p0, Lo/fau;->b:I

    return v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lo/fau;->f:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/fau;->e:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 29
    iput p1, p0, Lo/fau;->b:I

    .line 30
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lo/fau;->e:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/fau;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lo/fau;->c:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lo/fau;->f:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/fau;->i:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FitnessdataListItem [mDataType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fau;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mContentAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fau;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mContentSumOne="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fau;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mContentOneUnit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fau;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mContentSumTwo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fau;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mContentTwoUnit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fau;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

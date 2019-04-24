.class public Lo/aiw;
.super Lo/air;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Integer;

.field private b:Ljava/lang/Integer;

.field private c:Ljava/lang/String;

.field private e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lo/air;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lo/aiw;->e:Ljava/lang/Integer;

    .line 44
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lo/aiw;->c:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/aiw;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/Integer;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lo/aiw;->a:Ljava/lang/Integer;

    .line 36
    return-void
.end method

.method public c()Ljava/lang/Integer;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/aiw;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public d()Ljava/lang/Integer;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/aiw;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/aiw;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method public e(Ljava/lang/Integer;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lo/aiw;->b:Ljava/lang/Integer;

    .line 72
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 56
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    const-string v0, "CoapSessionInterfaceOEntityModel{"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "errorCode="

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/aiw;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/aiw;->a:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", modeSupport="

    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/aiw;->e:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

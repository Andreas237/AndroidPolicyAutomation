.class public Lo/dyw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/dzb;

.field private b:Z

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dyw;->b:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lo/dyw;->c:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/dyw;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b(Lo/dzb;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lo/dyw;->a:Lo/dzb;

    .line 62
    return-void
.end method

.method public c()I
    .locals 1

    .line 33
    iget v0, p0, Lo/dyw;->d:I

    return v0
.end method

.method public c(Z)V
    .locals 0

    .line 69
    iput-boolean p1, p0, Lo/dyw;->b:Z

    .line 70
    return-void
.end method

.method public d()Lo/dzb;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/dyw;->a:Lo/dzb;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 37
    iput p1, p0, Lo/dyw;->d:I

    .line 38
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lo/dyw;->e:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public e()Z
    .locals 1

    .line 65
    iget-boolean v0, p0, Lo/dyw;->b:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "KakaLocationRelationShipData{contentTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dyw;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", contentTitle=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dyw;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", taskId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dyw;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", kakaTaskRecord="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dyw;->a:Lo/dzb;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public Lo/etg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field private b:Lo/fil;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:J

.field private f:Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/etg;->d:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 59
    iput p1, p0, Lo/etg;->c:I

    .line 60
    return-void
.end method

.method public b()I
    .locals 1

    .line 55
    iget v0, p0, Lo/etg;->c:I

    return v0
.end method

.method public b(J)V
    .locals 0

    .line 51
    iput-wide p1, p0, Lo/etg;->e:J

    .line 52
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lo/etg;->a:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public b(Lo/fil;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lo/etg;->b:Lo/fil;

    .line 68
    return-void
.end method

.method public c()J
    .locals 2

    .line 47
    iget-wide v0, p0, Lo/etg;->e:J

    return-wide v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lo/etg;->d:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/etg;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lo/fil;
    .locals 1

    .line 63
    iget-object v0, p0, Lo/etg;->b:Lo/fil;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TodoCardRecyModel{title=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/etg;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/etg;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/etg;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/etg;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", operationObject="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/etg;->b:Lo/fil;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", history="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/etg;->f:Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

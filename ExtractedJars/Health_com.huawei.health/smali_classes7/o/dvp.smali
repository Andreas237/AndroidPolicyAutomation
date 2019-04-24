.class public Lo/dvp;
.super Lo/dvf;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:Ljava/lang/String;

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    const/16 v0, 0xd

    invoke-direct {p0, v0}, Lo/dvf;-><init>(I)V

    .line 20
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 23
    iget v0, p0, Lo/dvp;->e:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 27
    iput p1, p0, Lo/dvp;->e:I

    .line 28
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lo/dvp;->a:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/dvp;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 31
    iget v0, p0, Lo/dvp;->b:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 35
    iput p1, p0, Lo/dvp;->b:I

    .line 36
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lo/dvp;->c:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "KakaUpdateReturnBody{rewardKaka="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvp;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalKaka="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvp;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", resultDes=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dvp;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

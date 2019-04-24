.class public Lo/eus;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:I

.field private i:I

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:I

.field private p:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lo/eus;->e:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lo/eus;->c:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lo/eus;->b:Ljava/lang/String;

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lo/eus;->g:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lo/eus;->k:Ljava/lang/String;

    .line 26
    const/4 v0, 0x1

    iput v0, p0, Lo/eus;->i:I

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lo/eus;->f:Ljava/lang/String;

    .line 33
    const-string v0, ""

    iput-object v0, p0, Lo/eus;->m:Ljava/lang/String;

    .line 35
    const-string v0, ""

    iput-object v0, p0, Lo/eus;->n:Ljava/lang/String;

    .line 37
    const-string v0, ""

    iput-object v0, p0, Lo/eus;->l:Ljava/lang/String;

    .line 40
    const-string v0, ""

    iput-object v0, p0, Lo/eus;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 51
    iget v0, p0, Lo/eus;->a:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 117
    iput p1, p0, Lo/eus;->o:I

    .line 118
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lo/eus;->c:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/eus;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 133
    iput p1, p0, Lo/eus;->i:I

    .line 134
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lo/eus;->e:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/eus;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 55
    iput p1, p0, Lo/eus;->a:I

    .line 56
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/eus;->b:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lo/eus;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 101
    iput p1, p0, Lo/eus;->h:I

    .line 102
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lo/eus;->g:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/eus;->g:Ljava/lang/String;

    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 47
    iput p1, p0, Lo/eus;->d:I

    .line 48
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lo/eus;->k:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public f()I
    .locals 1

    .line 129
    iget v0, p0, Lo/eus;->i:I

    return v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lo/eus;->m:Ljava/lang/String;

    .line 142
    return-void
.end method

.method public g()I
    .locals 1

    .line 113
    iget v0, p0, Lo/eus;->o:I

    return v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lo/eus;->n:Ljava/lang/String;

    .line 150
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lo/eus;->f:Ljava/lang/String;

    return-object v0
.end method

.method public h(I)V
    .locals 1

    .line 157
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eus;->l:Ljava/lang/String;

    .line 158
    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lo/eus;->f:Ljava/lang/String;

    .line 126
    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lo/eus;->k:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 137
    iget-object v0, p0, Lo/eus;->m:Ljava/lang/String;

    return-object v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lo/eus;->p:Ljava/lang/String;

    .line 110
    return-void
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lo/eus;->l:Ljava/lang/String;

    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 145
    iget-object v0, p0, Lo/eus;->n:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardItemObject{id=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/eus;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eus;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eus;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageUrlDaxidi=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eus;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", detailUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eus;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", weight=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/eus;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", display=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/eus;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eus;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activityType=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/eus;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activityDetailId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eus;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", beginDate=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eus;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endDate=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eus;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", numberOfPeople=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eus;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", planDco=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eus;->p:Ljava/lang/String;

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

.class public Lo/cvv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:J

.field private e:I

.field private f:I

.field private g:I

.field private h:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    return-void
.end method

.method public constructor <init>(JIIIIIII)V
    .locals 0

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-wide p1, p0, Lo/cvv;->d:J

    .line 85
    iput p3, p0, Lo/cvv;->e:I

    .line 86
    iput p4, p0, Lo/cvv;->c:I

    .line 87
    iput p5, p0, Lo/cvv;->a:I

    .line 88
    iput p6, p0, Lo/cvv;->b:I

    .line 89
    iput p7, p0, Lo/cvv;->f:I

    .line 90
    iput p8, p0, Lo/cvv;->h:I

    .line 91
    iput p9, p0, Lo/cvv;->g:I

    .line 93
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 129
    iget v0, p0, Lo/cvv;->b:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 109
    iput p1, p0, Lo/cvv;->e:I

    .line 110
    return-void
.end method

.method public b()J
    .locals 2

    .line 97
    iget-wide v0, p0, Lo/cvv;->d:J

    return-wide v0
.end method

.method public b(I)V
    .locals 0

    .line 117
    iput p1, p0, Lo/cvv;->c:I

    .line 118
    return-void
.end method

.method public c()I
    .locals 1

    .line 113
    iget v0, p0, Lo/cvv;->c:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 133
    iput p1, p0, Lo/cvv;->b:I

    .line 134
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 101
    iput-wide p1, p0, Lo/cvv;->d:J

    .line 102
    return-void
.end method

.method public d()I
    .locals 1

    .line 121
    iget v0, p0, Lo/cvv;->a:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 141
    iput p1, p0, Lo/cvv;->f:I

    .line 142
    return-void
.end method

.method public e()I
    .locals 1

    .line 105
    iget v0, p0, Lo/cvv;->e:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 125
    iput p1, p0, Lo/cvv;->a:I

    .line 126
    return-void
.end method

.method public f()I
    .locals 1

    .line 137
    iget v0, p0, Lo/cvv;->f:I

    return v0
.end method

.method public i()I
    .locals 1

    .line 153
    iget v0, p0, Lo/cvv;->g:I

    return v0
.end method

.method public i(I)V
    .locals 0

    .line 157
    iput p1, p0, Lo/cvv;->g:I

    .line 158
    return-void
.end method

.method public k()I
    .locals 1

    .line 145
    iget v0, p0, Lo/cvv;->h:I

    return v0
.end method

.method public k(I)V
    .locals 0

    .line 149
    iput p1, p0, Lo/cvv;->h:I

    .line 150
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RunningPosture :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/cvv;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cvv;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cvv;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cvv;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cvv;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cvv;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cvv;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cvv;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lo/bat$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:J

.field private d:I

.field private e:I

.field private f:J

.field private g:I

.field private h:I

.field private i:I

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/4 v0, -0x1

    iput v0, p0, Lo/bat$e;->d:I

    .line 42
    const/4 v0, -0x1

    iput v0, p0, Lo/bat$e;->b:I

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 124
    iget-wide v0, p0, Lo/bat$e;->c:J

    .line 125
    return-wide v0
.end method

.method public a(I)V
    .locals 0

    .line 141
    iput p1, p0, Lo/bat$e;->k:I

    .line 142
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lo/bat$e;->a:Ljava/lang/String;

    .line 98
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lo/bat$e;->a:Ljava/lang/String;

    .line 92
    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 119
    iput p1, p0, Lo/bat$e;->b:I

    .line 120
    return-void
.end method

.method public c()I
    .locals 1

    .line 113
    iget v0, p0, Lo/bat$e;->b:I

    .line 114
    return v0
.end method

.method public c(I)V
    .locals 0

    .line 86
    iput p1, p0, Lo/bat$e;->d:I

    .line 87
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 130
    iput-wide p1, p0, Lo/bat$e;->c:J

    .line 131
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 152
    iput p1, p0, Lo/bat$e;->i:I

    .line 153
    return-void
.end method

.method public d()Z
    .locals 1

    .line 81
    iget v0, p0, Lo/bat$e;->d:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()I
    .locals 1

    .line 102
    iget v0, p0, Lo/bat$e;->e:I

    .line 103
    return v0
.end method

.method public e(I)V
    .locals 0

    .line 108
    iput p1, p0, Lo/bat$e;->e:I

    .line 109
    return-void
.end method

.method public e(J)V
    .locals 0

    .line 174
    iput-wide p1, p0, Lo/bat$e;->f:J

    .line 175
    return-void
.end method

.method public g()J
    .locals 2

    .line 168
    iget-wide v0, p0, Lo/bat$e;->f:J

    .line 169
    return-wide v0
.end method

.method public g(I)V
    .locals 0

    .line 179
    iput p1, p0, Lo/bat$e;->h:I

    .line 180
    return-void
.end method

.method public h()I
    .locals 1

    .line 146
    iget v0, p0, Lo/bat$e;->i:I

    .line 147
    return v0
.end method

.method public i()I
    .locals 1

    .line 135
    iget v0, p0, Lo/bat$e;->k:I

    .line 136
    return v0
.end method

.method public i(I)V
    .locals 0

    .line 163
    iput p1, p0, Lo/bat$e;->g:I

    .line 164
    return-void
.end method

.method public k()I
    .locals 1

    .line 157
    iget v0, p0, Lo/bat$e;->g:I

    .line 158
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TRSInfo{result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/bat$e;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", serverIp=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bat$e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", serverPort="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/bat$e;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", regionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/bat$e;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", validTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/bat$e;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxIMRetryTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/bat$e;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxRandConnectTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/bat$e;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minIMRandConnectTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/bat$e;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", trsUpdateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/bat$e;->f:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", apkVerCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/bat$e;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

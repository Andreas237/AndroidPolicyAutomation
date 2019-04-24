.class public final Lo/azm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:J

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:Z

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/azm;->h:Z

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/azm;->i:Z

    .line 62
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lo/azm;->d:Ljava/lang/String;

    .line 111
    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lo/azm;->d:Ljava/lang/String;

    .line 117
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 149
    iput-boolean p1, p0, Lo/azm;->h:Z

    .line 150
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/azm;->g:Ljava/lang/String;

    .line 67
    return-object v0
.end method

.method public b(J)V
    .locals 0

    .line 127
    iput-wide p1, p0, Lo/azm;->e:J

    .line 128
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lo/azm;->c:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lo/azm;->c:Ljava/lang/String;

    .line 78
    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lo/azm;->b:Ljava/lang/String;

    .line 95
    return-void
.end method

.method protected clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 165
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/azm;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lo/azm;->a:Ljava/lang/String;

    .line 100
    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lo/azm;->a:Ljava/lang/String;

    .line 106
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/azm;->b:Ljava/lang/String;

    .line 89
    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lo/azm;->g:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 159
    iput-boolean p1, p0, Lo/azm;->i:Z

    .line 160
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lo/azm;->k:Ljava/lang/String;

    .line 133
    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 143
    iget-boolean v0, p0, Lo/azm;->h:Z

    .line 144
    return v0
.end method

.method public h()Z
    .locals 1

    .line 154
    iget-boolean v0, p0, Lo/azm;->i:Z

    return v0
.end method

.method public i()J
    .locals 2

    .line 121
    iget-wide v0, p0, Lo/azm;->e:J

    .line 122
    return-wide v0
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lo/azm;->k:Ljava/lang/String;

    .line 139
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 170
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LoginParam{resource=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/azm;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", serverName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/azm;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", serviceToken=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/azm;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", pushToken=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/azm;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/azm;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/azm;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isNeedTry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/azm;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", checkOnline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/azm;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", versionCode=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/azm;->g:Ljava/lang/String;

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

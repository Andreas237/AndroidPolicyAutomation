.class public Lo/aix;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Integer;

.field private h:I

.field private i:Ljava/lang/Integer;

.field private k:Ljava/lang/Long;

.field private m:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/aix;->d:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/Integer;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lo/aix;->m:Ljava/lang/Integer;

    .line 124
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lo/aix;->b:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/aix;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/Integer;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lo/aix;->i:Ljava/lang/Integer;

    .line 112
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lo/aix;->c:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/aix;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 115
    iput p1, p0, Lo/aix;->h:I

    .line 116
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lo/aix;->e:Ljava/lang/String;

    .line 53
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/aix;->e:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/Long;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lo/aix;->k:Ljava/lang/Long;

    .line 80
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lo/aix;->d:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/aix;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lo/aix;->a:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public f()Ljava/lang/Long;
    .locals 1

    .line 72
    iget-object v0, p0, Lo/aix;->k:Ljava/lang/Long;

    return-object v0
.end method

.method public g()Ljava/lang/Integer;
    .locals 1

    .line 119
    iget-object v0, p0, Lo/aix;->m:Ljava/lang/Integer;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lo/aix;->f:Ljava/lang/String;

    return-object v0
.end method

.method public i()I
    .locals 1

    .line 76
    iget v0, p0, Lo/aix;->h:I

    return v0
.end method

.method public k()Ljava/lang/Integer;
    .locals 1

    .line 107
    iget-object v0, p0, Lo/aix;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lo/aix;->f:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 92
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "VerifyCode2CoapSessionInfo{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 93
    const-string v0, "sn1=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/aix;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 94
    const-string v0, ", sn2=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/aix;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 95
    const-string v0, ", deviceId=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/aix;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 96
    const-string v0, ", verifyCode=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/aix;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 97
    const-string v0, ", psk=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/aix;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 98
    const-string v0, ", modeSupport="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/aix;->g:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 99
    const-string v0, ", sessId=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/aix;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 100
    const-string v0, ", seq="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/aix;->k:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 101
    const-string v0, ", optSeq="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/aix;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 102
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 103
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

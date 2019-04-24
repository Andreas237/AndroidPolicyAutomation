.class public Lo/eui;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 79
    iget v0, p0, Lo/eui;->d:I

    return v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lo/eui;->a:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/eui;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lo/eui;->b:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lo/eui;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 86
    iput p1, p0, Lo/eui;->d:I

    .line 87
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lo/eui;->h:Ljava/lang/String;

    .line 123
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lo/eui;->e:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 56
    iput p1, p0, Lo/eui;->k:I

    .line 57
    return-void
.end method

.method public e()I
    .locals 1

    .line 52
    iget v0, p0, Lo/eui;->k:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 72
    iput p1, p0, Lo/eui;->c:I

    .line 73
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lo/eui;->e:Ljava/lang/String;

    .line 115
    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Lo/eui;->h:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 127
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    const-string v0, "AccountContext [loginType="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    iget v0, p0, Lo/eui;->d:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    const-string v0, ", thirdToken="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    iget-object v0, p0, Lo/eui;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    const-string v0, ", accessToken="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    iget-object v0, p0, Lo/eui;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    const-string v0, ", thirdOpenId="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    iget-object v0, p0, Lo/eui;->e:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    const-string v0, ", expiresIn="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    iget v0, p0, Lo/eui;->c:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    const-string v0, ", siteId="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    iget v0, p0, Lo/eui;->k:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    const-string v0, ", userName="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    iget-object v0, p0, Lo/eui;->h:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public Lo/ajd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const-string v0, "unknown"

    iput-object v0, p0, Lo/ajd;->h:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const-string v0, "unknown"

    iput-object v0, p0, Lo/ajd;->h:Ljava/lang/String;

    .line 54
    iput-object p1, p0, Lo/ajd;->e:Ljava/lang/String;

    .line 55
    iput-object p2, p0, Lo/ajd;->c:Ljava/lang/String;

    .line 56
    iput p3, p0, Lo/ajd;->g:I

    .line 57
    return-void
.end method

.method private a(Lo/ajd;)Z
    .locals 2

    .line 179
    invoke-virtual {p0}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private b(Lo/ajd;)Z
    .locals 2

    .line 187
    invoke-virtual {p0}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private c(Lo/ajd;)Z
    .locals 2

    .line 183
    invoke-virtual {p0}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d(Lo/ajd;)Z
    .locals 2

    .line 171
    invoke-virtual {p0}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e(Lo/ajd;)Z
    .locals 2

    .line 175
    invoke-virtual {p0}, Lo/ajd;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lo/ajd;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lo/ajd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lo/ajd;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lo/ajd;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 64
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/ajd;->k:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lo/ajd;->c:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 1

    .line 128
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/ajd;->g:I

    .line 129
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 80
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/ajd;->a:Ljava/lang/String;

    .line 81
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lo/ajd;->e:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 88
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/ajd;->c:Ljava/lang/String;

    .line 89
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ajd;->k:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 72
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/ajd;->e:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lo/ajd;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 96
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/ajd;->b:Ljava/lang/String;

    .line 97
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 152
    if-ne p0, p1, :cond_0

    .line 153
    const/4 v0, 0x1

    return v0

    .line 154
    :cond_0
    instance-of v0, p1, Lo/ajd;

    if-nez v0, :cond_1

    .line 155
    const/4 v0, 0x0

    return v0

    .line 156
    :cond_1
    move-object v1, p1

    check-cast v1, Lo/ajd;

    .line 157
    invoke-direct {p0, v1}, Lo/ajd;->d(Lo/ajd;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 158
    const/4 v0, 0x0

    return v0

    .line 159
    :cond_2
    invoke-direct {p0, v1}, Lo/ajd;->e(Lo/ajd;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 160
    const/4 v0, 0x0

    return v0

    .line 161
    :cond_3
    invoke-direct {p0, v1}, Lo/ajd;->a(Lo/ajd;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 162
    const/4 v0, 0x0

    return v0

    .line 163
    :cond_4
    invoke-direct {p0, v1}, Lo/ajd;->c(Lo/ajd;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 164
    const/4 v0, 0x0

    return v0

    .line 165
    :cond_5
    invoke-direct {p0, v1}, Lo/ajd;->b(Lo/ajd;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 166
    const/4 v0, 0x0

    return v0

    .line 167
    :cond_6
    const/4 v0, 0x1

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lo/ajd;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public g()I
    .locals 1

    .line 124
    iget v0, p0, Lo/ajd;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lo/ajd;->h:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 1

    .line 104
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/ajd;->d:Ljava/lang/String;

    .line 105
    return-void
.end method

.method public hashCode()I
    .locals 3

    .line 207
    invoke-virtual {p0}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 208
    :goto_0
    mul-int/lit8 v0, v2, 0x1f

    invoke-virtual {p0}, Lo/ajd;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lo/ajd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    add-int v2, v0, v1

    .line 209
    mul-int/lit8 v0, v2, 0x1f

    invoke-virtual {p0}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    add-int v2, v0, v1

    .line 210
    mul-int/lit8 v0, v2, 0x1f

    invoke-virtual {p0}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    add-int v2, v0, v1

    .line 211
    mul-int/lit8 v0, v2, 0x1f

    invoke-virtual {p0}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    add-int v2, v0, v1

    .line 212
    return v2
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lo/ajd;->f:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public i(Ljava/lang/String;)V
    .locals 1

    .line 120
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/ajd;->h:Ljava/lang/String;

    .line 121
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 1

    .line 112
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/ajd;->f:Ljava/lang/String;

    .line 113
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 192
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "AddDeviceInfo{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 193
    const-string v0, "ssid=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/ajd;->e:Ljava/lang/String;

    invoke-static {v1}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 194
    const-string v0, ", productId=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/ajd;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 195
    const-string v0, ", deviceSn=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/ajd;->c:Ljava/lang/String;

    invoke-static {v1}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 196
    const-string v0, ", deviceId=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/ajd;->b:Ljava/lang/String;

    invoke-static {v1}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 197
    const-string v0, ", mac=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/ajd;->d:Ljava/lang/String;

    invoke-static {v1}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 198
    const-string v0, ", baseUrl=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/ajd;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 199
    const-string v0, ", sourceType=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/ajd;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 200
    const-string v0, ", encryptMode="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/ajd;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 201
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 202
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

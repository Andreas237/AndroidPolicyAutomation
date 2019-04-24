.class Lo/azj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:I

.field private c:Z

.field private d:Z

.field private e:J

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:I

.field private k:I

.field private m:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/azj;->c:Z

    .line 29
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/azj;->d:Z

    .line 72
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/azj;->m:Ljava/lang/String;

    .line 89
    return-object v0
.end method

.method public b()V
    .locals 2

    .line 128
    iget v0, p0, Lo/azj;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/azj;->b:I

    .line 129
    return-void
.end method

.method public b(Z)V
    .locals 1

    .line 156
    iput-boolean p1, p0, Lo/azj;->c:Z

    .line 157
    const/4 v0, 0x0

    iput v0, p0, Lo/azj;->b:I

    .line 158
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lo/azj;->h:Ljava/lang/String;

    .line 77
    return-object v0
.end method

.method public c(Lo/bat$e;)V
    .locals 1

    .line 113
    if-eqz p1, :cond_0

    .line 115
    invoke-virtual {p1}, Lo/bat$e;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/azj;->h:Ljava/lang/String;

    .line 116
    invoke-virtual {p1}, Lo/bat$e;->e()I

    move-result v0

    iput v0, p0, Lo/azj;->g:I

    .line 117
    invoke-virtual {p1}, Lo/bat$e;->i()I

    move-result v0

    iput v0, p0, Lo/azj;->i:I

    .line 118
    invoke-virtual {p1}, Lo/bat$e;->h()I

    move-result v0

    iput v0, p0, Lo/azj;->f:I

    .line 119
    invoke-virtual {p1}, Lo/bat$e;->k()I

    move-result v0

    iput v0, p0, Lo/azj;->k:I

    .line 121
    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 136
    const/4 v0, 0x0

    iput v0, p0, Lo/azj;->b:I

    .line 137
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/azj;->c:Z

    .line 138
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/azj;->d:Z

    .line 139
    return-void
.end method

.method public d(JZLjava/lang/String;)V
    .locals 0

    .line 101
    iput-wide p1, p0, Lo/azj;->e:J

    .line 102
    iput-boolean p3, p0, Lo/azj;->d:Z

    .line 103
    iput-object p4, p0, Lo/azj;->m:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public e()I
    .locals 1

    .line 82
    iget v0, p0, Lo/azj;->g:I

    .line 83
    return v0
.end method

.method public f()I
    .locals 7

    .line 175
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/azj;->a:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long v4, v0, v2

    .line 176
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-ltz v0, :cond_0

    iget v0, p0, Lo/azj;->f:I

    int-to-long v0, v0

    cmp-long v0, v4, v0

    if-lez v0, :cond_1

    .line 178
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 182
    :cond_1
    iget v0, p0, Lo/azj;->f:I

    int-to-long v0, v0

    sub-long/2addr v0, v4

    long-to-int v6, v0

    .line 183
    invoke-static {v6}, Lo/bah;->b(I)I

    move-result v0

    return v0
.end method

.method public g()J
    .locals 2

    .line 233
    iget-wide v0, p0, Lo/azj;->e:J

    .line 234
    return-wide v0
.end method

.method public h()Z
    .locals 2

    .line 208
    iget v0, p0, Lo/azj;->b:I

    iget v1, p0, Lo/azj;->i:I

    if-lt v0, v1, :cond_0

    .line 210
    const/4 v0, 0x1

    return v0

    .line 212
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i()Z
    .locals 1

    .line 194
    iget-boolean v0, p0, Lo/azj;->c:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lo/azj;->d:Z

    if-nez v0, :cond_1

    .line 196
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 198
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public k()V
    .locals 2

    .line 146
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/azj;->e:J

    .line 147
    return-void
.end method

.method public o()I
    .locals 1

    .line 244
    iget v0, p0, Lo/azj;->k:I

    .line 245
    return v0
.end method

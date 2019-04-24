.class public Lo/bbt;
.super Lo/bbf;
.source "SourceFile"


# instance fields
.field private f:Ljava/lang/String;

.field private g:J

.field private h:I

.field private i:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private o:Z


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 6

    .line 11
    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v5, p3

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lo/bbf;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bbt;->o:Z

    .line 12
    iput-wide p1, p0, Lo/bbt;->g:J

    .line 13
    iput-object p3, p0, Lo/bbt;->f:Ljava/lang/String;

    .line 14
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bbt;->c(Z)V

    .line 15
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bbt;->d(Z)V

    .line 16
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lo/bbt;->k:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 107
    iput p1, p0, Lo/bbt;->h:I

    .line 108
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lo/bbt;->i:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 96
    iput-boolean p1, p0, Lo/bbt;->o:Z

    .line 97
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 113
    invoke-super {p0, p1}, Lo/bbf;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 119
    invoke-super {p0}, Lo/bbf;->hashCode()I

    move-result v0

    return v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/bbt;->k:Ljava/lang/String;

    .line 70
    return-object v0
.end method

.method public m()Z
    .locals 1

    .line 91
    iget-boolean v0, p0, Lo/bbt;->o:Z

    return v0
.end method

.method public n()J
    .locals 2

    .line 52
    iget-wide v0, p0, Lo/bbt;->g:J

    .line 53
    return-wide v0
.end method

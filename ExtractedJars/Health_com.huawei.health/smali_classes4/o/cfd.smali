.class public Lo/cfd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Lo/cdx;


# instance fields
.field private b:J

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method

.method public constructor <init>(JI)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-wide p1, p0, Lo/cfd;->b:J

    .line 33
    iput p3, p0, Lo/cfd;->c:I

    .line 34
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    .line 43
    iput-wide p1, p0, Lo/cfd;->b:J

    .line 44
    return-void
.end method

.method public c()I
    .locals 1

    .line 48
    iget v0, p0, Lo/cfd;->c:I

    return v0
.end method

.method public e()J
    .locals 2

    .line 38
    iget-wide v0, p0, Lo/cfd;->b:J

    return-wide v0
.end method

.method public e(I)V
    .locals 0

    .line 53
    iput p1, p0, Lo/cfd;->c:I

    .line 54
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Lo/cfd;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cfd;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

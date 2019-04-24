.class public Lo/ffd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:D

.field public c:D

.field public d:D

.field public e:D

.field public i:J

.field public k:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->e:D

    .line 20
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->c:D

    .line 21
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->d:D

    .line 22
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->a:J

    .line 23
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->b:D

    .line 27
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->i:J

    .line 31
    return-void
.end method

.method public constructor <init>(DDDJIJD)V
    .locals 2

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->e:D

    .line 20
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->c:D

    .line 21
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->d:D

    .line 22
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->a:J

    .line 23
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->b:D

    .line 27
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->i:J

    .line 37
    iput-wide p1, p0, Lo/ffd;->e:D

    .line 38
    iput-wide p3, p0, Lo/ffd;->c:D

    .line 39
    iput-wide p5, p0, Lo/ffd;->d:D

    .line 40
    iput-wide p7, p0, Lo/ffd;->a:J

    .line 41
    iput p9, p0, Lo/ffd;->k:I

    .line 42
    iput-wide p10, p0, Lo/ffd;->i:J

    .line 43
    iput-wide p12, p0, Lo/ffd;->b:D

    .line 44
    return-void
.end method

.method public constructor <init>(IDDIJ)V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->e:D

    .line 20
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->c:D

    .line 21
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->d:D

    .line 22
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->a:J

    .line 23
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->b:D

    .line 27
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ffd;->i:J

    .line 48
    const/16 v0, 0x102

    if-eq p1, v0, :cond_0

    const/16 v0, 0x108

    if-ne p1, v0, :cond_1

    .line 49
    :cond_0
    iput-wide p2, p0, Lo/ffd;->c:D

    goto :goto_0

    .line 50
    :cond_1
    const/16 v0, 0x101

    if-ne p1, v0, :cond_2

    .line 51
    iput-wide p2, p0, Lo/ffd;->e:D

    goto :goto_0

    .line 52
    :cond_2
    const/16 v0, 0x103

    if-ne p1, v0, :cond_3

    .line 53
    iput-wide p2, p0, Lo/ffd;->d:D

    .line 55
    :cond_3
    :goto_0
    iput-wide p4, p0, Lo/ffd;->b:D

    .line 56
    iput p6, p0, Lo/ffd;->k:I

    .line 57
    iput-wide p7, p0, Lo/ffd;->i:J

    .line 58
    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 3

    .line 92
    new-instance v0, Ljava/util/Date;

    iget-wide v1, p0, Lo/ffd;->i:J

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x34

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "walkDis is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/ffd;->e:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " , runDis is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/ffd;->c:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " , mRideDistance is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/ffd;->d:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ,mFitenessDruation is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/ffd;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ,times is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/ffd;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ,monthStartTime is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/ffd;->i:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " , calories is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/ffd;->b:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

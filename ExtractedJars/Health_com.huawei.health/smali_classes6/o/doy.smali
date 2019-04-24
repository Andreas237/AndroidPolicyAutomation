.class public Lo/doy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public A:Ljava/lang/String;

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:I

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:J

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:I

.field public q:Ljava/lang/String;

.field public r:J

.field public s:Ljava/lang/String;

.field public t:I

.field public u:Ljava/lang/String;

.field public v:I

.field public w:Ljava/lang/String;

.field public x:I

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->a:Ljava/lang/String;

    .line 12
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->d:Ljava/lang/String;

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->c:Ljava/lang/String;

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->e:Ljava/lang/String;

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->b:Ljava/lang/String;

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->g:Ljava/lang/String;

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->f:Ljava/lang/String;

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->k:Ljava/lang/String;

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->h:Ljava/lang/String;

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->n:Ljava/lang/String;

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->l:Ljava/lang/String;

    .line 24
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/doy;->m:J

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->o:Ljava/lang/String;

    .line 26
    const/4 v0, -0x1

    iput v0, p0, Lo/doy;->p:I

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->s:Ljava/lang/String;

    .line 28
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/doy;->r:J

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->u:Ljava/lang/String;

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lo/doy;->q:Ljava/lang/String;

    .line 31
    const/4 v0, -0x1

    iput v0, p0, Lo/doy;->t:I

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->w:Ljava/lang/String;

    .line 33
    const/4 v0, -0x1

    iput v0, p0, Lo/doy;->v:I

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lo/doy;->x:I

    .line 35
    const-string v0, ""

    iput-object v0, p0, Lo/doy;->y:Ljava/lang/String;

    .line 36
    const-string v0, ""

    iput-object v0, p0, Lo/doy;->z:Ljava/lang/String;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doy;->A:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[ApplicationInfo] NAME="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/doy;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", DPATH="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/doy;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", SPATH="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/doy;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", MD5="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/doy;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", NEWMD5="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/doy;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", NEWBYTESIZE="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/doy;->r:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", BYTESIZE="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/doy;->m:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", PACKAGENAME="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/doy;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", VERSION_NAME="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/doy;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", VERSION_CODE="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/doy;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

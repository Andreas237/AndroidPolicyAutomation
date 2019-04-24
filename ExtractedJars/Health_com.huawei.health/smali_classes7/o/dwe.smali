.class public Lo/dwe;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dwe$c;
    }
.end annotation


# instance fields
.field private a:D

.field private b:I

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:D

.field private h:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-string v0, ""

    iput-object v0, p0, Lo/dwe;->d:Ljava/lang/String;

    .line 38
    const-string v0, ""

    iput-object v0, p0, Lo/dwe;->h:Ljava/lang/String;

    .line 41
    return-void
.end method

.method synthetic constructor <init>(Lo/dwe$4;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Lo/dwe;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/dwe;I)I
    .locals 0

    .line 6
    iput p1, p0, Lo/dwe;->e:I

    return p1
.end method

.method static synthetic a(Lo/dwe;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 6
    iput-object p1, p0, Lo/dwe;->d:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lo/dwe;D)D
    .locals 0

    .line 6
    iput-wide p1, p0, Lo/dwe;->g:D

    return-wide p1
.end method

.method static synthetic c(Lo/dwe;I)I
    .locals 0

    .line 6
    iput p1, p0, Lo/dwe;->b:I

    return p1
.end method

.method static synthetic d(Lo/dwe;D)D
    .locals 0

    .line 6
    iput-wide p1, p0, Lo/dwe;->a:D

    return-wide p1
.end method

.method static synthetic d(Lo/dwe;I)I
    .locals 0

    .line 6
    iput p1, p0, Lo/dwe;->c:I

    return p1
.end method

.method static synthetic e(Lo/dwe;I)I
    .locals 0

    .line 6
    iput p1, p0, Lo/dwe;->f:I

    return p1
.end method

.method static synthetic e(Lo/dwe;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 6
    iput-object p1, p0, Lo/dwe;->h:Ljava/lang/String;

    return-object p1
.end method

.method public static g()Lo/dwe$c;
    .locals 1

    .line 80
    new-instance v0, Lo/dwe$c;

    invoke-direct {v0}, Lo/dwe$c;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()D
    .locals 2

    .line 60
    iget-wide v0, p0, Lo/dwe;->g:D

    return-wide v0
.end method

.method public b()I
    .locals 1

    .line 56
    iget v0, p0, Lo/dwe;->e:I

    return v0
.end method

.method public c()I
    .locals 1

    .line 48
    iget v0, p0, Lo/dwe;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 44
    iget v0, p0, Lo/dwe;->c:I

    return v0
.end method

.method public e()D
    .locals 2

    .line 52
    iget-wide v0, p0, Lo/dwe;->a:D

    return-wide v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lo/dwe;->h:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lo/dwe;->d:Ljava/lang/String;

    return-object v0
.end method

.method public k()I
    .locals 1

    .line 64
    iget v0, p0, Lo/dwe;->f:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PersonalData{personalLevel=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwe;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", personalLevelDesc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwe;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumDays="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwe;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwe;->a:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bestDaySteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwe;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stepRanking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwe;->g:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumCaCaNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwe;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", medals="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwe;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

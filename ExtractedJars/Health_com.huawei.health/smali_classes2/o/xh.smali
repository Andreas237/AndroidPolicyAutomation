.class public Lo/xh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/xh$c;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I

.field private d:D

.field public e:I

.field private g:D

.field private h:I

.field private i:I

.field private k:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lo/xh;->a:Ljava/lang/String;

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lo/xh;->k:Ljava/lang/String;

    .line 19
    const/4 v0, -0x1

    iput v0, p0, Lo/xh;->e:I

    .line 17
    return-void
.end method

.method synthetic constructor <init>(Lo/xh$2;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Lo/xh;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/xh;I)I
    .locals 0

    .line 6
    iput p1, p0, Lo/xh;->i:I

    return p1
.end method

.method static synthetic b(Lo/xh;D)D
    .locals 0

    .line 6
    iput-wide p1, p0, Lo/xh;->d:D

    return-wide p1
.end method

.method static synthetic b(Lo/xh;I)I
    .locals 0

    .line 6
    iput p1, p0, Lo/xh;->b:I

    return p1
.end method

.method static synthetic b(Lo/xh;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 6
    iput-object p1, p0, Lo/xh;->a:Ljava/lang/String;

    return-object p1
.end method

.method public static c()Lo/xh$c;
    .locals 1

    .line 26
    new-instance v0, Lo/xh$c;

    invoke-direct {v0}, Lo/xh$c;-><init>()V

    return-object v0
.end method

.method static synthetic d(Lo/xh;I)I
    .locals 0

    .line 6
    iput p1, p0, Lo/xh;->h:I

    return p1
.end method

.method static synthetic d(Lo/xh;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 6
    iput-object p1, p0, Lo/xh;->k:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lo/xh;D)D
    .locals 0

    .line 6
    iput-wide p1, p0, Lo/xh;->g:D

    return-wide p1
.end method

.method static synthetic e(Lo/xh;I)I
    .locals 0

    .line 6
    iput p1, p0, Lo/xh;->c:I

    return p1
.end method


# virtual methods
.method public a()D
    .locals 2

    .line 38
    iget-wide v0, p0, Lo/xh;->g:D

    return-wide v0
.end method

.method public b()D
    .locals 2

    .line 22
    iget-wide v0, p0, Lo/xh;->d:D

    return-wide v0
.end method

.method public e()I
    .locals 1

    .line 34
    iget v0, p0, Lo/xh;->h:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SocialPersonalData{personalLevel=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/xh;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", personalLevelDesc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/xh;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumDays="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/xh;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/xh;->d:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bestDaySteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/xh;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stepRanking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/xh;->g:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumCaCaNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/xh;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", medals="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/xh;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", retCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/xh;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

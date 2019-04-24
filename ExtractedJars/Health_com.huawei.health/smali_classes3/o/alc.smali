.class public Lo/alc;
.super Lo/alf;
.source "SourceFile"


# static fields
.field private static d:J


# instance fields
.field private c:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 26
    const-wide/16 v0, 0x0

    sput-wide v0, Lo/alc;->d:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 29
    invoke-direct {p0}, Lo/alf;-><init>()V

    .line 23
    const-string v0, "TiggeredByWear_"

    iput-object v0, p0, Lo/alc;->c:Ljava/lang/String;

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/alc;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "AchieveAMedalsInteractors"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/alc;->e:Ljava/lang/String;

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/alc;->b:Landroid/content/Context;

    .line 31
    return-void
.end method

.method static synthetic c(J)J
    .locals 0

    .line 21
    sput-wide p0, Lo/alc;->d:J

    return-wide p0
.end method

.method static synthetic d(Lo/alc;)Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/alc;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e()J
    .locals 2

    .line 21
    sget-wide v0, Lo/alc;->d:J

    return-wide v0
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 34
    iget-object v0, p0, Lo/alc;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter behave"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    iget-object v0, p0, Lo/alc;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/alc$2;

    invoke-direct {v1, p0}, Lo/alc$2;-><init>(Lo/alc;)V

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lo/clq;->a(ILo/cmg;)V

    .line 89
    return-void
.end method

.method public c()V
    .locals 3

    .line 92
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 93
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    iget-object v0, p0, Lo/alc;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/alc$5;

    invoke-direct {v1, p0}, Lo/alc$5;-><init>(Lo/alc;)V

    invoke-virtual {v0, v2, v1}, Lo/clq;->e(Ljava/util/List;Lo/cmh;)V

    .line 99
    return-void
.end method

.class public Lo/ewh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ewh$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Intent;

.field private b:Landroid/content/Context;

.field public c:Landroid/os/CountDownTimer;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private e:Lo/ewh$a;


# direct methods
.method public constructor <init>(IILjava/util/List;)V
    .locals 6

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ewh;->b:Landroid/content/Context;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewh;->d:Ljava/util/List;

    .line 27
    new-instance v0, Lo/ewh$5;

    mul-int/lit16 v1, p1, 0x3e8

    add-int/lit8 v1, v1, 0xf

    int-to-long v2, v1

    mul-int/lit16 v1, p2, 0x3e8

    int-to-long v4, v1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lo/ewh$5;-><init>(Lo/ewh;JJ)V

    iput-object v0, p0, Lo/ewh;->c:Landroid/os/CountDownTimer;

    .line 86
    return-void
.end method

.method static synthetic a(Lo/ewh;)Landroid/content/Intent;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/ewh;->a:Landroid/content/Intent;

    return-object v0
.end method

.method static synthetic b(Lo/ewh;)Landroid/content/Context;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/ewh;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lo/ewh;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 17
    iput-object p1, p0, Lo/ewh;->d:Ljava/util/List;

    return-object p1
.end method

.method static synthetic d(Lo/ewh;)Lo/ewh$a;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/ewh;->e:Lo/ewh$a;

    return-object v0
.end method

.method private d(Ljava/util/List;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Long;>;)Z"
        }
    .end annotation

    .line 99
    const/4 v4, 0x0

    .line 100
    const/16 v5, 0x2cec

    .line 101
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 102
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 103
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lastTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    .line 105
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lastTwoTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    sub-long v0, v6, v8

    long-to-int v10, v0

    .line 107
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "durTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    if-le v10, v5, :cond_0

    .line 109
    const/4 v4, 0x1

    .line 112
    :cond_0
    return v4
.end method

.method static synthetic e(Lo/ewh;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 0

    .line 17
    iput-object p1, p0, Lo/ewh;->a:Landroid/content/Intent;

    return-object p1
.end method

.method static synthetic e(Lo/ewh;)Ljava/util/List;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/ewh;->d:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lo/ewh;Ljava/util/List;)Z
    .locals 1

    .line 17
    invoke-direct {p0, p1}, Lo/ewh;->d(Ljava/util/List;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public d(Lo/ewh$a;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lo/ewh;->e:Lo/ewh$a;

    .line 93
    return-void
.end method

.method public e()V
    .locals 1

    .line 89
    iget-object v0, p0, Lo/ewh;->c:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 90
    return-void
.end method

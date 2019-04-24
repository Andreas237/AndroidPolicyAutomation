.class public Lo/abk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/abv;

.field private c:Lo/abn;

.field private e:Lo/abs;

.field private f:Lo/abm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    const-string v0, "Step_StepCounterManager"

    sput-object v0, Lo/abk;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abk;->a:Landroid/content/Context;

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abk;->c:Lo/abn;

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abk;->e:Lo/abs;

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abk;->b:Lo/abv;

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abk;->f:Lo/abm;

    .line 26
    iput-object p1, p0, Lo/abk;->a:Landroid/content/Context;

    .line 27
    new-instance v0, Lo/abn;

    iget-object v1, p0, Lo/abk;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/abn;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/abk;->c:Lo/abn;

    .line 28
    new-instance v0, Lo/abs;

    iget-object v1, p0, Lo/abk;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/abs;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/abk;->e:Lo/abs;

    .line 29
    iget-object v0, p0, Lo/abk;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/akz;->c(Landroid/content/Context;)I

    move-result v4

    .line 30
    sget-object v0, Lo/abk;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initStepCounter : deviceType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 77
    iget-object v0, p0, Lo/abk;->c:Lo/abn;

    invoke-virtual {v0}, Lo/abn;->c()V

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abk;->f:Lo/abm;

    .line 79
    return-void
.end method

.method public b()Lo/abv;
    .locals 1

    .line 34
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/abk;->e(Z)Lo/abv;

    move-result-object v0

    return-object v0
.end method

.method public d()Lo/abm;
    .locals 5

    .line 56
    iget-object v0, p0, Lo/abk;->c:Lo/abn;

    invoke-virtual {v0}, Lo/abn;->d()I

    move-result v4

    .line 58
    sget-object v0, Lo/abk;->d:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initExtendStepCounter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    iget-object v0, p0, Lo/abk;->c:Lo/abn;

    invoke-virtual {v0}, Lo/abn;->a()Lo/abm;

    move-result-object v0

    iput-object v0, p0, Lo/abk;->f:Lo/abm;

    .line 62
    iget-object v0, p0, Lo/abk;->f:Lo/abm;

    return-object v0
.end method

.method public d(Z)Lo/abm;
    .locals 1

    .line 66
    if-eqz p1, :cond_0

    .line 67
    iget-object v0, p0, Lo/abk;->c:Lo/abn;

    invoke-virtual {v0}, Lo/abn;->b()Lo/abm;

    move-result-object v0

    iput-object v0, p0, Lo/abk;->f:Lo/abm;

    goto :goto_0

    .line 70
    :cond_0
    invoke-virtual {p0}, Lo/abk;->d()Lo/abm;

    move-result-object v0

    iput-object v0, p0, Lo/abk;->f:Lo/abm;

    .line 73
    :goto_0
    iget-object v0, p0, Lo/abk;->f:Lo/abm;

    return-object v0
.end method

.method public e(Z)Lo/abv;
    .locals 4

    .line 38
    if-eqz p1, :cond_0

    .line 39
    iget-object v0, p0, Lo/abk;->b:Lo/abv;

    if-nez v0, :cond_1

    .line 40
    iget-object v0, p0, Lo/abk;->e:Lo/abs;

    invoke-virtual {v0}, Lo/abs;->b()Lo/abv;

    move-result-object v0

    iput-object v0, p0, Lo/abk;->b:Lo/abv;

    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Lo/abk;->b:Lo/abv;

    if-nez v0, :cond_1

    .line 45
    iget-object v0, p0, Lo/abk;->e:Lo/abs;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/abs;->e(I)Lo/abv;

    move-result-object v0

    iput-object v0, p0, Lo/abk;->b:Lo/abv;

    .line 48
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/abk;->b:Lo/abv;

    if-nez v0, :cond_2

    .line 49
    sget-object v0, Lo/abk;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStandStepCounter null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    :cond_2
    iget-object v0, p0, Lo/abk;->b:Lo/abv;

    return-object v0
.end method

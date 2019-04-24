.class public Lo/abn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Z

.field private c:Lo/abm;

.field private d:Lo/abs;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/abn;->b:Z

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abn;->e:Landroid/content/Context;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abn;->c:Lo/abm;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abn;->d:Lo/abs;

    .line 31
    iput-object p1, p0, Lo/abn;->e:Landroid/content/Context;

    .line 32
    new-instance v0, Lo/abs;

    iget-object v1, p0, Lo/abn;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/abs;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/abn;->d:Lo/abs;

    .line 33
    return-void
.end method


# virtual methods
.method public a()Lo/abm;
    .locals 4

    .line 37
    iget-boolean v0, p0, Lo/abn;->b:Z

    if-eqz v0, :cond_1

    .line 39
    iget-object v0, p0, Lo/abn;->d:Lo/abs;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/abs;->e(I)Lo/abv;

    move-result-object v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    new-instance v0, Lo/abq;

    iget-object v1, p0, Lo/abn;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/abq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/abn;->c:Lo/abm;

    .line 43
    :cond_0
    iget-object v0, p0, Lo/abn;->c:Lo/abm;

    return-object v0

    .line 46
    :cond_1
    invoke-virtual {p0}, Lo/abn;->d()I

    move-result v2

    .line 48
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    .line 51
    :sswitch_0
    new-instance v0, Lo/abu;

    iget-object v1, p0, Lo/abn;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/abu;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/abn;->c:Lo/abm;

    .line 52
    goto :goto_1

    .line 55
    :sswitch_1
    new-instance v0, Lo/abp;

    iget-object v1, p0, Lo/abn;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/abp;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/abn;->c:Lo/abm;

    .line 56
    goto :goto_1

    .line 59
    :goto_0
    iget-object v0, p0, Lo/abn;->d:Lo/abs;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/abs;->e(I)Lo/abv;

    move-result-object v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    new-instance v0, Lo/abq;

    iget-object v1, p0, Lo/abn;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/abq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/abn;->c:Lo/abm;

    .line 67
    :cond_2
    :goto_1
    iget-object v0, p0, Lo/abn;->c:Lo/abm;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0x65 -> :sswitch_1
    .end sparse-switch
.end method

.method public b()Lo/abm;
    .locals 2

    .line 71
    new-instance v0, Lo/abr;

    iget-object v1, p0, Lo/abn;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/abr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/abn;->c:Lo/abm;

    .line 72
    iget-object v0, p0, Lo/abn;->c:Lo/abm;

    return-object v0
.end method

.method public c()V
    .locals 1

    .line 91
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/abn;->b:Z

    .line 92
    return-void
.end method

.method public d()I
    .locals 4

    .line 78
    iget-object v0, p0, Lo/abn;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/akz;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    const/16 v0, 0x65

    return v0

    .line 83
    :cond_0
    iget-object v0, p0, Lo/abn;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/akz;->c(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 84
    const-string v0, "Step_ExtentdStepCounterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSupportType Motion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    const/16 v0, 0x64

    return v0

    .line 87
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

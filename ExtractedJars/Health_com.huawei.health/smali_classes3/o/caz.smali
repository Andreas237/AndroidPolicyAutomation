.class public Lo/caz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;


# instance fields
.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    const-string v0, "Step_UIConfig"

    sput-object v0, Lo/caz;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/caz;->d:Landroid/content/Context;

    .line 26
    if-nez p1, :cond_0

    .line 27
    sget-object v0, Lo/caz;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "context is null in UIConfig"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    return-void

    .line 30
    :cond_0
    iput-object p1, p0, Lo/caz;->d:Landroid/content/Context;

    .line 31
    return-void
.end method

.method private b(Lo/cav;Lo/cau;Lo/cao;Landroid/os/Bundle;)V
    .locals 0

    .line 72
    invoke-virtual {p3, p4}, Lo/cao;->b(Landroid/os/Bundle;)V

    .line 73
    invoke-virtual {p1, p2, p3}, Lo/cav;->d(Lo/cau;Lo/cao;)V

    .line 74
    return-void
.end method


# virtual methods
.method d(Lo/cav;)V
    .locals 5

    .line 57
    new-instance v3, Lo/caw;

    iget-object v0, p0, Lo/caz;->d:Landroid/content/Context;

    invoke-direct {v3, v0}, Lo/caw;-><init>(Landroid/content/Context;)V

    .line 59
    invoke-virtual {p0}, Lo/caz;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 61
    const-string v0, "action"

    const-string v1, "init"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v0, "target"

    const-string v1, "all"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    sget-object v0, Lo/cau;->d:Lo/cau;

    invoke-direct {p0, p1, v0, v3, v4}, Lo/caz;->b(Lo/cav;Lo/cau;Lo/cao;Landroid/os/Bundle;)V

    .line 66
    :cond_0
    sget-object v0, Lo/cau;->c:Lo/cau;

    new-instance v1, Lo/cba;

    iget-object v2, p0, Lo/caz;->d:Landroid/content/Context;

    invoke-direct {v1, v2}, Lo/cba;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lo/caz;->b(Lo/cav;Lo/cau;Lo/cao;Landroid/os/Bundle;)V

    .line 68
    sget-object v0, Lo/cau;->e:Lo/cau;

    new-instance v1, Lo/cbe;

    iget-object v2, p0, Lo/caz;->d:Landroid/content/Context;

    invoke-direct {v1, v2}, Lo/cbe;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lo/caz;->b(Lo/cav;Lo/cau;Lo/cao;Landroid/os/Bundle;)V

    .line 69
    return-void
.end method

.method public d()Z
    .locals 3

    .line 50
    new-instance v0, Lo/abs;

    iget-object v1, p0, Lo/caz;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/abs;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/abs;->e(I)Lo/abv;

    move-result-object v2

    .line 52
    if-eqz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

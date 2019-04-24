.class public Lo/cix;
.super Ljava/lang/Object;


# static fields
.field private static b:Lo/cjc;


# instance fields
.field private c:Z

.field private d:Ljava/lang/String;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lo/cja;->e()Lo/cjc;

    move-result-object v0

    sput-object v0, Lo/cix;->b:Lo/cjc;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Lo/cix;->e:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cix;->c:Z

    return-void
.end method

.method private b(ILjava/lang/String;Ljava/lang/String;)Lo/cjg;
    .locals 3

    new-instance v2, Lo/cjg;

    iget-object v0, p0, Lo/cix;->d:Ljava/lang/String;

    const/4 v1, 0x7

    invoke-direct {v2, v1, v0, p1, p2}, Lo/cjg;-><init>(ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v2, p3}, Lo/cjg;->b(Ljava/lang/Object;)Lo/cjg;

    return-object v2
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1, p2}, Lo/cix;->b(ILjava/lang/String;Ljava/lang/String;)Lo/cjg;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lo/cjg;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Lo/cjg;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lo/cix;->b:Lo/cjc;

    const/4 v1, 0x4

    invoke-interface {v0, v3, v1, p1, p2}, Lo/cjc;->c(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(ILjava/lang/String;Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p0, p1}, Lo/cix;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2, p3}, Lo/cix;->b(ILjava/lang/String;Ljava/lang/String;)Lo/cjg;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lo/cjg;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Lo/cjg;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lo/cix;->b:Lo/cjc;

    invoke-interface {v0, v3, p1, p2, p3}, Lo/cjc;->c(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public c(Landroid/content/Context;ILjava/lang/String;)V
    .locals 2

    iput p2, p0, Lo/cix;->e:I

    iput-object p3, p0, Lo/cix;->d:Ljava/lang/String;

    sget-object v0, Lo/cix;->b:Lo/cjc;

    const-string v1, "HiAnalytics"

    invoke-interface {v0, p1, v1}, Lo/cjc;->d(Landroid/content/Context;Ljava/lang/String;)Lo/cjc;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cix;->c:Z

    return-void
.end method

.method public d(I)Z
    .locals 1

    iget-boolean v0, p0, Lo/cix;->c:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lo/cix;->e:I

    if-lt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.class public abstract Lo/ciy;
.super Ljava/lang/Object;


# static fields
.field private static e:Lo/cix;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo/cix;

    invoke-direct {v0}, Lo/cix;-><init>()V

    sput-object v0, Lo/ciy;->e:Lo/cix;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lo/ciy;->e:Lo/cix;

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p0, p1}, Lo/cix;->c(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static varargs a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lo/ciy;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a()Z
    .locals 2

    sget-object v0, Lo/ciy;->e:Lo/cix;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/cix;->d(I)Z

    move-result v0

    return v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lo/ciy;->e:Lo/cix;

    const/4 v1, 0x5

    invoke-virtual {v0, v1, p0, p1}, Lo/cix;->c(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static varargs b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    invoke-static {}, Lo/ciy;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HiAnalytics_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static c()Ljava/lang/String;
    .locals 1

    const-string v0, "HiAnalytics-2.0.0.309"

    return-object v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lo/ciy;->e:Lo/cix;

    const/4 v1, 0x6

    invoke-virtual {v0, v1, p0, p1}, Lo/cix;->c(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Landroid/content/Context;ILjava/lang/String;)V
    .locals 3

    sget-object v0, Lo/ciy;->e:Lo/cix;

    invoke-virtual {v0, p0, p1, p2}, Lo/cix;->c(Landroid/content/Context;ILjava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v0, 0xa

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "============================================================================"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "====== "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/ciy;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "============================================================================"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lo/ciy;->e:Lo/cix;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lo/cix;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lo/ciy;->e:Lo/cix;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p0, p1}, Lo/cix;->c(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e()Z
    .locals 2

    sget-object v0, Lo/ciy;->e:Lo/cix;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/cix;->d(I)Z

    move-result v0

    return v0
.end method

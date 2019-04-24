.class public Lo/deu;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static d:Lo/deu;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 22
    return-void
.end method

.method private static a()V
    .locals 1

    .line 52
    const/4 v0, 0x0

    sput-object v0, Lo/deu;->d:Lo/deu;

    .line 53
    return-void
.end method

.method public static b()Lo/deu;
    .locals 2

    .line 26
    sget-object v0, Lo/deu;->d:Lo/deu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 27
    new-instance v0, Lo/deu;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/deu;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/deu;->d:Lo/deu;

    .line 29
    :cond_0
    sget-object v0, Lo/deu;->d:Lo/deu;

    return-object v0
.end method


# virtual methods
.method public e(Ljava/lang/String;)V
    .locals 1

    .line 48
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dde;->c(Ljava/lang/String;)V

    .line 49
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 34
    const/16 v0, 0x1c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected onDestroy()V
    .locals 4

    .line 39
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 40
    invoke-static {}, Lo/deu;->a()V

    .line 41
    const-string v0, "HWFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy() complete"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    return-void
.end method

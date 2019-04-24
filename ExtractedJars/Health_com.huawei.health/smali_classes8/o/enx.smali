.class public Lo/enx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/enx;


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lo/enx;->c:Landroid/content/Context;

    .line 24
    return-void
.end method

.method public static a(Landroid/content/Context;I)Ljava/lang/String;
    .locals 1

    .line 245
    invoke-static {p0, p1}, Lo/eoj;->e(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lo/enx;
    .locals 2

    .line 27
    sget-object v0, Lo/enx;->b:Lo/enx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 28
    new-instance v0, Lo/enx;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/enx;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/enx;->b:Lo/enx;

    .line 30
    :cond_0
    sget-object v0, Lo/enx;->b:Lo/enx;

    return-object v0
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 2

    .line 183
    iget-object v0, p0, Lo/enx;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 184
    const-string v0, ""

    return-object v0

    .line 186
    :cond_0
    iget-object v0, p0, Lo/enx;->c:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/eoj;->d(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

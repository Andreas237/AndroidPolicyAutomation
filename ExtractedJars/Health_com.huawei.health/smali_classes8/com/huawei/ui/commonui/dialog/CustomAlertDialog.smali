.class public Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;,
        Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$ButtonHandler;,
        Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;
    }
.end annotation


# static fields
.field private static a:Z

.field private static b:Z

.field private static e:Landroid/os/Handler;


# instance fields
.field private c:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->e:Landroid/os/Handler;

    .line 46
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->b:Z

    .line 47
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->a:Z

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 53
    iput-object p1, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->d:Landroid/content/Context;

    .line 54
    new-instance v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    invoke-direct {v0, p0, p1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;-><init>(Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->c:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    .line 55
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;ILcom/huawei/ui/commonui/dialog/CustomAlertDialog$4;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method static synthetic a()Landroid/os/Handler;
    .locals 1

    .line 41
    sget-object v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->e:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic a(Landroid/os/Handler;)Landroid/os/Handler;
    .locals 0

    .line 41
    sput-object p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->e:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic b(Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;
    .locals 1

    .line 41
    invoke-direct {p0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->c()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b()Z
    .locals 1

    .line 41
    sget-boolean v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->a:Z

    return v0
.end method

.method static synthetic b(Z)Z
    .locals 0

    .line 41
    sput-boolean p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->b:Z

    return p0
.end method

.method public static c(Landroid/content/Context;F)I
    .locals 3

    .line 425
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 426
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private c()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->c:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    return-object v0
.end method

.method static synthetic d()Z
    .locals 1

    .line 41
    sget-boolean v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->b:Z

    return v0
.end method

.method static synthetic d(Z)Z
    .locals 0

    .line 41
    sput-boolean p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->a:Z

    return p0
.end method


# virtual methods
.method public setTitle(I)V
    .locals 2

    .line 72
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->d:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->c:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->e(Ljava/lang/String;)V

    .line 74
    return-void
.end method

.class public Lo/ead;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/ead;


# instance fields
.field private c:Landroid/widget/Toast;

.field private e:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lo/ead;->e:Landroid/content/Context;

    .line 27
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/ead;
    .locals 2

    .line 19
    sget-object v0, Lo/ead;->d:Lo/ead;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 20
    new-instance v0, Lo/ead;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ead;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/ead;->d:Lo/ead;

    .line 22
    :cond_0
    sget-object v0, Lo/ead;->d:Lo/ead;

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 2

    .line 30
    const-string v0, "PLGACHIEVE_ToastUtils"

    const-string v1, "showShortToast"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, Lo/ead;->c:Landroid/widget/Toast;

    if-nez v0, :cond_0

    .line 32
    iget-object v0, p0, Lo/ead;->e:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lo/ead;->c:Landroid/widget/Toast;

    .line 34
    :cond_0
    iget-object v0, p0, Lo/ead;->c:Landroid/widget/Toast;

    invoke-virtual {v0, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 35
    iget-object v0, p0, Lo/ead;->c:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 36
    return-void
.end method

.class abstract Lo/blh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field protected a:Lo/bly;

.field protected b:Landroid/os/Handler;

.field protected c:Lcom/huawei/health/sns/model/user/User;

.field protected d:I

.field protected e:Landroid/app/Activity;

.field protected g:Z

.field protected i:Landroid/app/AlertDialog;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blh;->c:Lcom/huawei/health/sns/model/user/User;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blh;->b:Landroid/os/Handler;

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/blh;->g:Z

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blh;->i:Landroid/app/AlertDialog;

    .line 65
    iput-object p1, p0, Lo/blh;->e:Landroid/app/Activity;

    .line 66
    iput-object p2, p0, Lo/blh;->b:Landroid/os/Handler;

    .line 67
    iput-object p3, p0, Lo/blh;->a:Lo/bly;

    .line 68
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 85
    iget-object v0, p0, Lo/blh;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {p0, v0}, Lo/blh;->a(Lcom/huawei/health/sns/model/user/User;)V

    .line 86
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 115
    iput p1, p0, Lo/blh;->d:I

    .line 116
    return-void
.end method

.method abstract a(Lcom/huawei/health/sns/model/user/User;)V
.end method

.method public c()V
    .locals 2

    .line 93
    iget-object v0, p0, Lo/blh;->i:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lo/blh;->i:Landroid/app/AlertDialog;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 96
    iget-object v0, p0, Lo/blh;->i:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 98
    :cond_0
    return-void
.end method

.method public e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lo/blh;->c:Lcom/huawei/health/sns/model/user/User;

    .line 78
    return-void
.end method

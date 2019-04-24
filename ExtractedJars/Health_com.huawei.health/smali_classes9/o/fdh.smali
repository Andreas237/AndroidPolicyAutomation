.class public Lo/fdh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fdh$e;
    }
.end annotation


# instance fields
.field private a:Landroid/os/Handler;

.field b:Landroid/os/Handler;

.field private c:Lo/fdj;

.field private d:Lo/fdh$e;

.field private e:Landroid/app/Activity;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;"
        }
    .end annotation
.end field

.field private g:I

.field private h:Lo/ego$a;

.field private i:I

.field private k:Lo/ego;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Lo/fdh$2;

    invoke-direct {v0, p0}, Lo/fdh$2;-><init>(Lo/fdh;)V

    iput-object v0, p0, Lo/fdh;->b:Landroid/os/Handler;

    .line 43
    iput-object p1, p0, Lo/fdh;->e:Landroid/app/Activity;

    .line 44
    iput-object p2, p0, Lo/fdh;->a:Landroid/os/Handler;

    .line 45
    invoke-static {}, Lo/fdj;->e()Lo/fdj;

    move-result-object v0

    iput-object v0, p0, Lo/fdh;->c:Lo/fdj;

    .line 46
    new-instance v0, Lo/fdh$e;

    invoke-direct {v0, p0}, Lo/fdh$e;-><init>(Lo/fdh;)V

    iput-object v0, p0, Lo/fdh;->d:Lo/fdh$e;

    .line 47
    return-void
.end method

.method static synthetic a(Lo/fdh;)I
    .locals 1

    .line 24
    iget v0, p0, Lo/fdh;->i:I

    return v0
.end method

.method static synthetic b(Lo/fdh;)I
    .locals 1

    .line 24
    iget v0, p0, Lo/fdh;->g:I

    return v0
.end method

.method private b()V
    .locals 3

    .line 88
    iget-object v0, p0, Lo/fdh;->k:Lo/ego;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 89
    new-instance v0, Lo/ego;

    iget-object v1, p0, Lo/fdh;->e:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/ego;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/fdh;->k:Lo/ego;

    .line 90
    new-instance v0, Lo/ego$a;

    iget-object v1, p0, Lo/fdh;->e:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/ego$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/fdh;->h:Lo/ego$a;

    .line 91
    iget-object v0, p0, Lo/fdh;->h:Lo/ego$a;

    iget-object v1, p0, Lo/fdh;->e:Landroid/app/Activity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_deleteing:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ego$a;->d(Ljava/lang/String;)Lo/ego$a;

    .line 92
    iget-object v0, p0, Lo/fdh;->h:Lo/ego$a;

    invoke-virtual {v0}, Lo/ego$a;->d()Lo/ego;

    move-result-object v0

    iput-object v0, p0, Lo/fdh;->k:Lo/ego;

    .line 93
    iget-object v0, p0, Lo/fdh;->k:Lo/ego;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego;->setCanceledOnTouchOutside(Z)V

    .line 94
    iget-object v0, p0, Lo/fdh;->k:Lo/ego;

    new-instance v1, Lo/fdh$4;

    invoke-direct {v1, p0}, Lo/fdh$4;-><init>(Lo/fdh;)V

    invoke-virtual {v0, v1}, Lo/ego;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 104
    :cond_0
    iget-object v0, p0, Lo/fdh;->e:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 105
    iget-object v0, p0, Lo/fdh;->k:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->show()V

    .line 107
    :cond_1
    return-void
.end method

.method private c()V
    .locals 7

    .line 113
    iget v0, p0, Lo/fdh;->i:I

    iget v1, p0, Lo/fdh;->g:I

    if-ge v0, v1, :cond_1

    .line 114
    iget v0, p0, Lo/fdh;->i:I

    add-int/lit8 v0, v0, 0x64

    iget v1, p0, Lo/fdh;->g:I

    if-gt v0, v1, :cond_0

    .line 115
    iget-object v0, p0, Lo/fdh;->c:Lo/fdj;

    iget-object v1, p0, Lo/fdh;->e:Landroid/app/Activity;

    iget-object v2, p0, Lo/fdh;->f:Ljava/util/List;

    iget v3, p0, Lo/fdh;->i:I

    iget v4, p0, Lo/fdh;->i:I

    add-int/lit8 v4, v4, 0x64

    invoke-interface {v2, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lo/fdh;->d:Lo/fdh$e;

    invoke-virtual {v0, v1, v2, v3}, Lo/fdj;->e(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 116
    iget v0, p0, Lo/fdh;->i:I

    add-int/lit8 v0, v0, 0x64

    iput v0, p0, Lo/fdh;->i:I

    goto :goto_0

    .line 118
    :cond_0
    iget-object v0, p0, Lo/fdh;->c:Lo/fdj;

    iget-object v1, p0, Lo/fdh;->e:Landroid/app/Activity;

    iget-object v2, p0, Lo/fdh;->f:Ljava/util/List;

    iget v3, p0, Lo/fdh;->i:I

    iget v4, p0, Lo/fdh;->g:I

    invoke-interface {v2, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lo/fdh;->d:Lo/fdh$e;

    invoke-virtual {v0, v1, v2, v3}, Lo/fdj;->e(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 119
    iget v0, p0, Lo/fdh;->g:I

    iput v0, p0, Lo/fdh;->i:I

    .line 122
    :goto_0
    iget-object v0, p0, Lo/fdh;->e:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/fdh;->k:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/fdh;->k:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 123
    iget v0, p0, Lo/fdh;->i:I

    mul-int/lit8 v0, v0, 0x64

    iget v1, p0, Lo/fdh;->g:I

    div-int v6, v0, v1

    .line 124
    iget-object v0, p0, Lo/fdh;->h:Lo/ego$a;

    invoke-virtual {v0, v6}, Lo/ego$a;->a(I)Lo/ego$a;

    .line 125
    iget-object v0, p0, Lo/fdh;->h:Lo/ego$a;

    invoke-virtual {v0, v6}, Lo/ego$a;->b(I)Lo/ego$a;

    .line 128
    :cond_1
    return-void
.end method

.method static synthetic c(Lo/fdh;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/fdh;->d()V

    return-void
.end method

.method private d()V
    .locals 2

    .line 158
    iget-object v0, p0, Lo/fdh;->e:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fdh;->k:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 159
    iget-object v0, p0, Lo/fdh;->k:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->cancel()V

    .line 160
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fdh;->k:Lo/ego;

    .line 162
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/fdh;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/fdh;->c()V

    return-void
.end method

.method static synthetic e(Lo/fdh;)Landroid/os/Handler;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/fdh;->a:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public c(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;)V"
        }
    .end annotation

    .line 71
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 72
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/fdh;->g:I

    .line 73
    iput-object p1, p0, Lo/fdh;->f:Ljava/util/List;

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lo/fdh;->i:I

    .line 75
    iget v0, p0, Lo/fdh;->g:I

    const/16 v1, 0x64

    if-le v0, v1, :cond_0

    .line 76
    invoke-direct {p0}, Lo/fdh;->b()V

    .line 78
    :cond_0
    invoke-direct {p0}, Lo/fdh;->c()V

    goto :goto_0

    .line 80
    :cond_1
    iget-object v0, p0, Lo/fdh;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 82
    :goto_0
    return-void
.end method

.class public Lo/dnu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dnr;
.implements Lo/dnx;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dnu$b;
    }
.end annotation


# instance fields
.field private a:Lo/dnu$b;

.field private b:Lo/dod$b;

.field private c:Lcom/huawei/up/model/UserInfomation;

.field private d:Lo/dod$e;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnu;->a:Lo/dnu$b;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnu;->c:Lcom/huawei/up/model/UserInfomation;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnu;->d:Lo/dod$e;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnu;->b:Lo/dod$b;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnu;->e:Landroid/content/Context;

    return-void
.end method

.method static synthetic b(Lo/dnu;)Lo/dnu$b;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/dnu;->a:Lo/dnu$b;

    return-object v0
.end method

.method static synthetic c(Lo/dnu;)Lo/dod$b;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/dnu;->b:Lo/dod$b;

    return-object v0
.end method

.method static synthetic d(Lo/dnu;)Lcom/huawei/up/model/UserInfomation;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/dnu;->c:Lcom/huawei/up/model/UserInfomation;

    return-object v0
.end method

.method static synthetic e(Lo/dnu;)Lo/dod$e;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/dnu;->d:Lo/dod$e;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 150
    const-string v0, "AccountDataMgrByNAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NAllowLoginArea cant sync with Account"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    .line 47
    new-instance v0, Lo/dnu$b;

    invoke-direct {v0, p0, p1}, Lo/dnu$b;-><init>(Lo/dnu;Landroid/content/Context;)V

    iput-object v0, p0, Lo/dnu;->a:Lo/dnu$b;

    .line 48
    iget-object v0, p0, Lo/dnu;->a:Lo/dnu$b;

    invoke-virtual {v0, p1}, Lo/dnu$b;->c(Landroid/content/Context;)V

    .line 49
    return-void
.end method

.method public b()Lcom/huawei/up/model/UserInfomation;
    .locals 2

    .line 139
    iget-object v0, p0, Lo/dnu;->c:Lcom/huawei/up/model/UserInfomation;

    iget-object v1, p0, Lo/dnu;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-static {v0, v1}, Lo/dos;->e(Ljava/lang/Object;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/content/Context;)V
    .locals 0

    .line 232
    return-void
.end method

.method public b(Lo/dod$e$b;)V
    .locals 4

    .line 155
    const-string v0, "AccountDataMgrByNAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NAllowLoginArea cant sync with Account"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    return-void
.end method

.method public c()V
    .locals 4

    .line 235
    const-string v0, "AccountDataMgrByNAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    return-void
.end method

.method public c(Landroid/os/Message;)V
    .locals 4

    .line 52
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lo/dnu;->e:Landroid/content/Context;

    .line 54
    new-instance v0, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v0}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    iput-object v0, p0, Lo/dnu;->c:Lcom/huawei/up/model/UserInfomation;

    .line 56
    iget-object v0, p0, Lo/dnu;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dog;->c(Landroid/content/Context;)Lo/dog;

    move-result-object v0

    invoke-virtual {v0}, Lo/dog;->c()Lo/dod$e;

    move-result-object v0

    iput-object v0, p0, Lo/dnu;->d:Lo/dod$e;

    .line 57
    iget-object v0, p0, Lo/dnu;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dog;->c(Landroid/content/Context;)Lo/dog;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dog;->d(I)Lo/dod$b;

    move-result-object v0

    iput-object v0, p0, Lo/dnu;->b:Lo/dod$b;

    .line 58
    iget-object v0, p0, Lo/dnu;->d:Lo/dod$e;

    invoke-interface {v0}, Lo/dod$e;->c()V

    .line 59
    iget-object v0, p0, Lo/dnu;->b:Lo/dod$b;

    invoke-interface {v0}, Lo/dod$b;->e()V

    .line 61
    iget v2, p1, Landroid/os/Message;->what:I

    .line 62
    new-instance v3, Lo/dnu$4;

    iget-object v0, p0, Lo/dnu;->a:Lo/dnu$b;

    invoke-direct {v3, p0, v0, v2}, Lo/dnu$4;-><init>(Lo/dnu;Landroid/os/Handler;I)V

    .line 77
    new-instance v0, Lo/dnu$1;

    invoke-direct {v0, p0, v3}, Lo/dnu$1;-><init>(Lo/dnu;Lo/doi;)V

    invoke-virtual {v3, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 105
    new-instance v0, Lo/dnu$2;

    invoke-direct {v0, p0, v3}, Lo/dnu$2;-><init>(Lo/dnu;Lo/doi;)V

    invoke-virtual {v3, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 130
    invoke-virtual {v3}, Lo/doi;->b()V

    .line 131
    return-void
.end method

.method public d(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    .locals 4

    .line 143
    const-string v0, "AccountDataMgrByNAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lo/dnu;->a:Lo/dnu$b;

    invoke-virtual {v0, p1, p2}, Lo/dnu$b;->c(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V

    .line 146
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    .line 217
    const-string v0, "AccountDataMgrByNAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NAllow Login,error from account"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    return-void
.end method

.method public e(Landroid/os/Message;Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    .locals 3

    .line 159
    iget v1, p1, Landroid/os/Message;->what:I

    .line 160
    new-instance v2, Lo/dnu$5;

    iget-object v0, p0, Lo/dnu;->a:Lo/dnu$b;

    invoke-direct {v2, p0, v0, v1, p3}, Lo/dnu$5;-><init>(Lo/dnu;Landroid/os/Handler;ILo/dod$b$d;)V

    .line 175
    new-instance v0, Lo/dnu$3;

    invoke-direct {v0, p0, p2, v2}, Lo/dnu$3;-><init>(Lo/dnu;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V

    invoke-virtual {v2, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 196
    new-instance v0, Lo/dnu$9;

    invoke-direct {v0, p0, p2, v2}, Lo/dnu$9;-><init>(Lo/dnu;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V

    invoke-virtual {v2, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 212
    invoke-virtual {v2}, Lo/doi;->b()V

    .line 213
    return-void
.end method

.method public e()Z
    .locals 1

    .line 135
    iget-object v0, p0, Lo/dnu;->a:Lo/dnu$b;

    invoke-virtual {v0}, Lo/dnu$b;->c()Z

    move-result v0

    return v0
.end method

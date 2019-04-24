.class public Lo/ebk;
.super Lo/eac;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Lo/dav;

.field private static c:Lo/dau;

.field private static d:Lcom/huawei/up/model/UserInfomation;

.field private static e:Z


# instance fields
.field private f:Lo/ecb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    const-string v0, "PluginSocialShare"

    sput-object v0, Lo/ebk;->a:Ljava/lang/String;

    .line 38
    const/4 v0, 0x1

    sput-boolean v0, Lo/ebk;->e:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Lo/eac;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ebk;->f:Lo/ecb;

    .line 43
    return-void
.end method

.method public static a()Lcom/huawei/up/model/UserInfomation;
    .locals 1

    .line 142
    sget-object v0, Lo/ebk;->d:Lcom/huawei/up/model/UserInfomation;

    return-object v0
.end method

.method public static c()Lo/dav;
    .locals 1

    .line 163
    sget-object v0, Lo/ebk;->b:Lo/dav;

    return-object v0
.end method

.method private static c(Lcom/huawei/up/model/UserInfomation;)V
    .locals 0

    .line 146
    sput-object p0, Lo/ebk;->d:Lcom/huawei/up/model/UserInfomation;

    .line 147
    return-void
.end method

.method private static c(Lo/dau;)V
    .locals 0

    .line 154
    sput-object p0, Lo/ebk;->c:Lo/dau;

    .line 155
    return-void
.end method

.method public static c(Z)V
    .locals 0

    .line 190
    sput-boolean p0, Lo/ebk;->e:Z

    .line 191
    return-void
.end method

.method public static d()Lo/ebk;
    .locals 1

    .line 58
    new-instance v0, Lo/ebk;

    invoke-direct {v0}, Lo/ebk;-><init>()V

    return-object v0
.end method

.method public static e()Lo/dau;
    .locals 1

    .line 150
    sget-object v0, Lo/ebk;->c:Lo/dau;

    return-object v0
.end method

.method public static e(Lo/dav;)V
    .locals 0

    .line 172
    sput-object p0, Lo/ebk;->b:Lo/dav;

    .line 173
    return-void
.end method

.method public static g()Z
    .locals 1

    .line 181
    sget-boolean v0, Lo/ebk;->e:Z

    return v0
.end method


# virtual methods
.method public a(Landroid/content/Context;ILo/dav;)V
    .locals 4

    .line 99
    if-eqz p3, :cond_0

    if-nez p1, :cond_1

    .line 100
    :cond_0
    sget-object v0, Lo/ebk;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exeShare() shareContent == null || mContext == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    return-void

    .line 103
    :cond_1
    invoke-static {p1}, Lo/ecb;->a(Landroid/content/Context;)Lo/ecb;

    move-result-object v0

    iput-object v0, p0, Lo/ebk;->f:Lo/ecb;

    .line 104
    iget-object v0, p0, Lo/ebk;->f:Lo/ecb;

    invoke-virtual {v0, p1, p2, p3}, Lo/ecb;->c(Landroid/content/Context;ILo/dav;)V

    .line 105
    return-void
.end method

.method public a(Landroid/content/Context;Lo/dau;Lcom/huawei/up/model/UserInfomation;)V
    .locals 5

    .line 131
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 132
    :cond_0
    sget-object v0, Lo/ebk;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exeShare() shareContent == null || mContext == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    return-void

    .line 135
    :cond_1
    invoke-static {p2}, Lo/ebk;->c(Lo/dau;)V

    .line 136
    invoke-static {p3}, Lo/ebk;->c(Lcom/huawei/up/model/UserInfomation;)V

    .line 137
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-direct {v4, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 138
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 139
    return-void
.end method

.method public b()V
    .locals 2

    .line 112
    iget-object v0, p0, Lo/ebk;->f:Lo/ecb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 113
    iget-object v0, p0, Lo/ebk;->f:Lo/ecb;

    invoke-virtual {v0}, Lo/ecb;->d()V

    .line 114
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ebk;->f:Lo/ecb;

    .line 116
    :cond_0
    return-void
.end method

.method public b(Landroid/content/Intent;Landroid/content/Context;)V
    .locals 2

    .line 124
    iget-object v0, p0, Lo/ebk;->f:Lo/ecb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 125
    iget-object v0, p0, Lo/ebk;->f:Lo/ecb;

    invoke-virtual {v0, p1, p2}, Lo/ecb;->d(Landroid/content/Intent;Landroid/content/Context;)V

    .line 127
    :cond_0
    return-void
.end method

.method public c(Lo/dav;Landroid/content/Context;)V
    .locals 5

    .line 68
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 69
    :cond_0
    sget-object v0, Lo/ebk;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exeShare() shareContent == null || mContext == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    return-void

    .line 73
    :cond_1
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 74
    invoke-virtual {p1}, Lo/dav;->h()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 75
    invoke-virtual {p1}, Lo/dav;->h()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 77
    :cond_2
    invoke-static {p1}, Lo/ebk;->e(Lo/dav;)V

    .line 80
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;

    invoke-direct {v4, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 82
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 83
    invoke-virtual {p2, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 84
    goto :goto_0

    .line 86
    :cond_3
    invoke-static {p2}, Lo/ecb;->a(Landroid/content/Context;)Lo/ecb;

    move-result-object v0

    iput-object v0, p0, Lo/ebk;->f:Lo/ecb;

    .line 87
    iget-object v0, p0, Lo/ebk;->f:Lo/ecb;

    const/4 v1, 0x5

    invoke-virtual {v0, p2, v1, p1}, Lo/ecb;->c(Landroid/content/Context;ILo/dav;)V

    .line 90
    :goto_0
    return-void
.end method

.method public finish()V
    .locals 0

    .line 47
    invoke-super {p0}, Lo/eac;->finish()V

    .line 48
    invoke-virtual {p0}, Lo/ebk;->b()V

    .line 49
    return-void
.end method

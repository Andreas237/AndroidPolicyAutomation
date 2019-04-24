.class public Lo/alh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lo/egw;

.field private d:Lo/fit;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alh;->c:Lo/egw;

    .line 32
    iput-object p1, p0, Lo/alh;->b:Landroid/content/Context;

    .line 33
    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/fit;->b(Landroid/content/Context;)Lo/fit;

    move-result-object v0

    iput-object v0, p0, Lo/alh;->d:Lo/fit;

    .line 34
    return-void
.end method

.method static synthetic a(Lo/alh;)Lo/egw;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/alh;->c:Lo/egw;

    return-object v0
.end method

.method static synthetic b(Lo/alh;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lo/alh;->e()V

    return-void
.end method

.method private b()Z
    .locals 6

    .line 115
    const/4 v4, 0x1

    .line 116
    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    const/16 v1, 0x2722

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_is_allowed_wechat_tips"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 118
    const-string v0, "Login_WeiXinInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isUserAllowedShowTips ischecked="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    const-string v0, "false"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    const/4 v4, 0x0

    .line 122
    :cond_0
    return v4
.end method

.method static synthetic c(Lo/alh;)Lo/fit;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/alh;->d:Lo/fit;

    return-object v0
.end method

.method private d()Z
    .locals 6

    .line 99
    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    const/16 v1, 0x2722

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_binded_times"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 101
    const-string v0, "Login_WeiXinInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isShowNotRemindBox bindTimes="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    const-string v0, ""

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    const/4 v4, 0x0

    goto :goto_0

    .line 104
    :cond_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    .line 105
    const/4 v4, 0x0

    goto :goto_0

    .line 107
    :cond_1
    const/4 v4, 0x1

    .line 109
    :goto_0
    const-string v0, "Login_WeiXinInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isShowNotRemindBox isShow="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    return v4
.end method

.method static synthetic e(Lo/alh;)Landroid/content/Context;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    return-object v0
.end method

.method private e()V
    .locals 1

    .line 90
    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    iget-object v0, p0, Lo/alh;->c:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alh;->c:Lo/egw;

    .line 94
    :cond_0
    return-void
.end method

.method private h()V
    .locals 7

    .line 193
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 194
    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    const/16 v1, 0x2722

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_binded_times"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 196
    const-string v0, "Login_WeiXinInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindTimes ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    const-string v0, ""

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2722

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_binded_times"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 200
    :cond_0
    const-string v0, "1"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 201
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2722

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_binded_times"

    const-string v3, "2"

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 203
    :cond_1
    const-string v0, "2"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 204
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2722

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_binded_times"

    const-string v3, "3"

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 206
    :cond_2
    const-string v0, "3"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 207
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2722

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_binded_times"

    const-string v3, "4"

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 210
    :cond_3
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2723

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_last_binded_time"

    .line 211
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    .line 210
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 212
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 5

    .line 163
    iget-object v0, p0, Lo/alh;->d:Lo/fit;

    iget-object v1, p0, Lo/alh;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/fit;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 164
    const-string v0, "Login_WeiXinInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isBinded ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    const-string v0, "false"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lo/alh;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    const/4 v0, 0x1

    return v0

    .line 168
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 8

    .line 38
    invoke-direct {p0}, Lo/alh;->h()V

    .line 39
    const-string v0, "Login_WeiXinInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showWechatDialog() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    .line 41
    :cond_0
    new-instance v4, Lo/egw$c;

    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 44
    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f070285

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 45
    const v0, 0x7f121146

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/CheckBox;

    .line 46
    const v0, 0x7f121145

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 47
    new-instance v0, Lo/alh$3;

    invoke-direct {v0, p0}, Lo/alh$3;-><init>(Lo/alh;)V

    invoke-virtual {v6, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 60
    invoke-virtual {v4, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    .line 62
    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    const v1, 0x7f0202bb

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lo/alh$2;

    invoke-direct {v1, p0}, Lo/alh$2;-><init>(Lo/alh;)V

    invoke-virtual {v4, v0, v1}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    .line 69
    invoke-direct {p0}, Lo/alh;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 71
    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    const v1, 0x7f020200

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lo/alh$5;

    invoke-direct {v1, p0}, Lo/alh$5;-><init>(Lo/alh;)V

    invoke-virtual {v4, v0, v1}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    goto :goto_0

    .line 81
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 83
    :goto_0
    invoke-virtual {v4}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lo/alh;->c:Lo/egw;

    .line 84
    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/alh;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 85
    iget-object v0, p0, Lo/alh;->c:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 87
    :cond_2
    return-void
.end method

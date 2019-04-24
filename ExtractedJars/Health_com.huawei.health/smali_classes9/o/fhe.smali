.class public Lo/fhe;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lo/fhe;->c:Landroid/content/Context;

    .line 38
    return-void
.end method

.method static synthetic a(Lo/fhe;)Landroid/content/Context;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/fhe;->c:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/model/UserInfomation;)V
    .locals 5

    .line 105
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setBICollect enter!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 107
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 109
    const-string v0, "type"

    invoke-interface {v4, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fhe;->c:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 112
    return-void
.end method

.method public a(III)Z
    .locals 6

    .line 60
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 61
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 62
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 63
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 65
    if-le p1, v5, :cond_0

    .line 66
    const/4 v0, 0x1

    return v0

    .line 68
    :cond_0
    if-ne p1, v5, :cond_1

    if-le p2, v4, :cond_1

    .line 69
    const/4 v0, 0x1

    return v0

    .line 71
    :cond_1
    if-ne p1, v5, :cond_2

    if-ne p2, v4, :cond_2

    if-le p3, v3, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b(Landroid/app/Activity;)V
    .locals 5

    .line 116
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lo/fhe;->c:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 117
    iget-object v0, p0, Lo/fhe;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_network_anormaly:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/fhe;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_network_anormaly_content:I

    .line 118
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/fhe;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_btn_state_settings:I

    .line 119
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fhe$5;

    invoke-direct {v2, p0}, Lo/fhe$5;-><init>(Lo/fhe;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/fhe;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_sug_skip_ios_btn:I

    .line 130
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fhe$1;

    invoke-direct {v2, p0, p1}, Lo/fhe$1;-><init>(Lo/fhe;Landroid/app/Activity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 135
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 136
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 137
    return-void
.end method

.method public b(Landroid/widget/ImageView;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 49
    if-nez p2, :cond_0

    .line 50
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 51
    const/4 p2, 0x1

    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {p1, p4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 54
    const/4 p2, 0x0

    .line 56
    :goto_0
    return p2
.end method

.method public c(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;)V
    .locals 1

    .line 146
    if-eqz p1, :cond_0

    .line 147
    new-instance v0, Lo/fhe$2;

    invoke-direct {v0, p0, p2}, Lo/fhe$2;-><init>(Lo/fhe;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 163
    :cond_0
    return-void
.end method

.method public e(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 41
    iget-object v0, p0, Lo/fhe;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 46
    :goto_0
    return-void
.end method

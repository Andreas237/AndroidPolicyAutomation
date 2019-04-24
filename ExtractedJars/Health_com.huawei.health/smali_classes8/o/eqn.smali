.class public Lo/eqn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/lang/Comparable<Lo/eqn;>;"
    }
.end annotation


# instance fields
.field public b:I

.field public c:Landroid/content/Context;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p2, p0, Lo/eqn;->d:Ljava/lang/String;

    .line 27
    iput p3, p0, Lo/eqn;->b:I

    .line 28
    iput-object p1, p0, Lo/eqn;->c:Landroid/content/Context;

    .line 29
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 36
    iget v0, p0, Lo/eqn;->b:I

    return v0
.end method

.method public c(Lo/eqn;)I
    .locals 2
    .param p1    # Lo/eqn;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 68
    invoke-virtual {p0}, Lo/eqn;->b()I

    move-result v0

    invoke-virtual {p1}, Lo/eqn;->b()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 69
    const/4 v0, 0x0

    return v0

    .line 72
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/eqn;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 5

    .line 76
    const-string v0, "ManagementViewCardData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeCardIndex; key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, " index = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 78
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 79
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 78
    invoke-static {p1, v0, p2, v1, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 80
    return-void
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 18
    move-object v0, p1

    check-cast v0, Lo/eqn;

    invoke-virtual {p0, v0}, Lo/eqn;->c(Lo/eqn;)I

    move-result v0

    return v0
.end method

.method public d(I)V
    .locals 4

    .line 40
    iput p1, p0, Lo/eqn;->b:I

    .line 43
    iget-object v0, p0, Lo/eqn;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_sleep:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/eqn;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lo/eqn;->c:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->t:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/eqn;->b:I

    invoke-virtual {p0, v0, v1, v2}, Lo/eqn;->c(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 46
    :cond_0
    iget-object v0, p0, Lo/eqn;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/eqn;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    iget-object v0, p0, Lo/eqn;->c:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->q:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/eqn;->b:I

    invoke-virtual {p0, v0, v1, v2}, Lo/eqn;->c(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 49
    :cond_1
    iget-object v0, p0, Lo/eqn;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_one_level_menu_settings_item_text_id14:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/eqn;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 50
    iget-object v0, p0, Lo/eqn;->c:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->y:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/eqn;->b:I

    invoke-virtual {p0, v0, v1, v2}, Lo/eqn;->c(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 52
    :cond_2
    iget-object v0, p0, Lo/eqn;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_heart_bmp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/eqn;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 53
    iget-object v0, p0, Lo/eqn;->c:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->w:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/eqn;->b:I

    invoke-virtual {p0, v0, v1, v2}, Lo/eqn;->c(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    .line 55
    :cond_3
    iget-object v0, p0, Lo/eqn;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodpressure:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/eqn;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 56
    iget-object v0, p0, Lo/eqn;->c:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->s:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/eqn;->b:I

    invoke-virtual {p0, v0, v1, v2}, Lo/eqn;->c(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    .line 58
    :cond_4
    iget-object v0, p0, Lo/eqn;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodsugar:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/eqn;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 59
    iget-object v0, p0, Lo/eqn;->c:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->r:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/eqn;->b:I

    invoke-virtual {p0, v0, v1, v2}, Lo/eqn;->c(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    .line 62
    :cond_5
    const-string v0, "ManagementViewCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " mCardName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/eqn;->d:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    :goto_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 84
    if-nez p1, :cond_0

    .line 85
    const/4 v0, 0x0

    return v0

    .line 87
    :cond_0
    instance-of v0, p1, Lo/eqn;

    if-nez v0, :cond_1

    .line 88
    const/4 v0, 0x0

    return v0

    .line 90
    :cond_1
    move-object v2, p1

    check-cast v2, Lo/eqn;

    .line 92
    invoke-virtual {v2}, Lo/eqn;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lo/eqn;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 97
    invoke-virtual {p0}, Lo/eqn;->b()I

    move-result v0

    return v0
.end method

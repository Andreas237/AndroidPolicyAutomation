.class public abstract Lo/ezu;
.super Lo/ezh;
.source "SourceFile"


# instance fields
.field private c:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lo/ezh;-><init>(Landroid/content/Context;)V

    .line 23
    iput-object p1, p0, Lo/ezu;->c:Landroid/app/Activity;

    .line 24
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 53
    invoke-super {p0}, Lo/ezh;->b()V

    .line 54
    iget-object v0, p0, Lo/ezu;->c:Landroid/app/Activity;

    sget-object v1, Lo/exi$b;->d:Lo/exi$b;

    invoke-static {v0, v1}, Lo/exi;->a(Landroid/app/Activity;Lo/exi$b;)V

    .line 55
    return-void
.end method

.method public c()Lo/ezh;
    .locals 0

    .line 48
    return-object p0
.end method

.method public getClassStr()Ljava/lang/String;
    .locals 2

    .line 43
    invoke-virtual {p0}, Lo/ezu;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_detail_radio_button_tab_year:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

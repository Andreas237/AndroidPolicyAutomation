.class public abstract Lo/eyj;
.super Lo/ezh;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lo/ezh;-><init>(Landroid/content/Context;)V

    .line 21
    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    .line 47
    invoke-super {p0}, Lo/ezh;->b()V

    .line 49
    return-void
.end method

.method public c()Lo/ezh;
    .locals 0

    .line 42
    return-object p0
.end method

.method protected e()Lo/eyy;
    .locals 2

    .line 52
    new-instance v0, Lo/eyw;

    invoke-virtual {p0}, Lo/eyj;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eyw;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public getClassStr()Ljava/lang/String;
    .locals 2

    .line 37
    invoke-virtual {p0}, Lo/eyj;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

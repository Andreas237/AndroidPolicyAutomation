.class public Lo/ezf$a;
.super Lo/ezf$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 343
    const/4 v0, 0x6

    invoke-direct {p0, p1, v0, p2}, Lo/ezf$b;-><init>(Landroid/content/Context;II)V

    .line 344
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 348
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_climb_gray:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .line 353
    iget-object v0, p0, Lo/ezf$a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_climb_stairs_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()I
    .locals 1

    .line 340
    invoke-super {p0}, Lo/ezf$b;->c()I

    move-result v0

    return v0
.end method

.method public bridge synthetic d()F
    .locals 1

    .line 340
    invoke-super {p0}, Lo/ezf$b;->d()F

    move-result v0

    return v0
.end method

.method public bridge synthetic e()I
    .locals 1

    .line 340
    invoke-super {p0}, Lo/ezf$b;->e()I

    move-result v0

    return v0
.end method

.method public bridge synthetic e(F)V
    .locals 0

    .line 340
    invoke-super {p0, p1}, Lo/ezf$b;->e(F)V

    return-void
.end method

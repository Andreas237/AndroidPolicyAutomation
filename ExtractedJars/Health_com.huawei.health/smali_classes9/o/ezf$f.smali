.class public Lo/ezf$f;
.super Lo/ezf$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 274
    const/16 v0, 0x9

    invoke-direct {p0, p1, v0, p2}, Lo/ezf$b;-><init>(Landroid/content/Context;II)V

    .line 275
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 279
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_health_list_walk:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .line 284
    iget-object v0, p0, Lo/ezf$f;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_main_time_line_walking:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()I
    .locals 1

    .line 271
    invoke-super {p0}, Lo/ezf$b;->c()I

    move-result v0

    return v0
.end method

.method public bridge synthetic d()F
    .locals 1

    .line 271
    invoke-super {p0}, Lo/ezf$b;->d()F

    move-result v0

    return v0
.end method

.method public bridge synthetic e()I
    .locals 1

    .line 271
    invoke-super {p0}, Lo/ezf$b;->e()I

    move-result v0

    return v0
.end method

.method public bridge synthetic e(F)V
    .locals 0

    .line 271
    invoke-super {p0, p1}, Lo/ezf$b;->e(F)V

    return-void
.end method
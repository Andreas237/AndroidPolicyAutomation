.class public Lo/ciu;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private d:I

.field private e:Lo/enj;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 26
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lo/ciu;->d:I

    .line 27
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_indoor_run_scroll_view:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 29
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_indoor_run_picker:I

    invoke-virtual {p0, v0}, Lo/ciu;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/enj;

    iput-object v0, p0, Lo/ciu;->e:Lo/enj;

    .line 31
    iget-object v0, p0, Lo/ciu;->e:Lo/enj;

    new-instance v1, Lo/ciu$1;

    invoke-direct {v1, p0}, Lo/ciu$1;-><init>(Lo/ciu;)V

    invoke-virtual {v0, v1}, Lo/enj;->setOnSelectedListener(Lo/enj$b;)V

    .line 37
    return-void
.end method

.method static synthetic b(Lo/ciu;I)I
    .locals 0

    .line 18
    iput p1, p0, Lo/ciu;->d:I

    return p1
.end method


# virtual methods
.method public getSelectedPosition()I
    .locals 1

    .line 40
    iget v0, p0, Lo/ciu;->d:I

    return v0
.end method

.method public setSelectedDistance(I)V
    .locals 1

    .line 44
    iput p1, p0, Lo/ciu;->d:I

    .line 45
    iget-object v0, p0, Lo/ciu;->e:Lo/enj;

    invoke-virtual {v0, p1}, Lo/enj;->setSelectedPosition(I)V

    .line 46
    return-void
.end method

.method public setViewData(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lo/ciu;->e:Lo/enj;

    invoke-virtual {v0, p1}, Lo/enj;->setDataArray(Ljava/util/ArrayList;)V

    .line 50
    iget-object v0, p0, Lo/ciu;->e:Lo/enj;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/enj;->setContentMode(II)V

    .line 51
    return-void
.end method

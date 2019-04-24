.class public Lo/cgi;
.super Lo/cgf;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/view/View$OnClickListener;

.field private b:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Lo/cgf;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgi;->b:Landroid/view/View$OnClickListener;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgi;->a:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic b(Lo/cgi;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/cgi;->a:Landroid/view/View$OnClickListener;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lo/cgi;->a:Landroid/view/View$OnClickListener;

    .line 57
    return-void
.end method

.method public b(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lo/cgi;->b:Landroid/view/View$OnClickListener;

    .line 53
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 44
    const-string v0, "Track_TrackLineChartActivityTipsFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick frag,tips next"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    iget-object v0, p0, Lo/cgi;->b:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 46
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 22
    const-string v0, "Track_TrackLineChartActivityTipsFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView--------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_linechart_tips_frag_step_one:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 24
    invoke-virtual {v4, p0}, Landroid/widget/LinearLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 25
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->all_content:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tips_close_btn:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lo/cgi$1;

    invoke-direct {v1, p0}, Lo/cgi$1;-><init>(Lo/cgi;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    return-object v4
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 39
    const/4 v0, 0x1

    return v0
.end method

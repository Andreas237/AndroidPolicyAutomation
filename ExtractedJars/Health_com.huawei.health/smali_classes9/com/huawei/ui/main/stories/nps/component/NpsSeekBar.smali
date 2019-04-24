.class public Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$NpsSeekBarImpl;
    }
.end annotation


# instance fields
.field private impl:Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$NpsSeekBarImpl;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;->init(Landroid/content/Context;)V

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;->init(Landroid/content/Context;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;->init(Landroid/content/Context;)V

    .line 32
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;)Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$NpsSeekBarImpl;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;->impl:Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$NpsSeekBarImpl;

    return-object v0
.end method

.method private init(Landroid/content/Context;)V
    .locals 2

    .line 35
    sget v0, Lcom/huawei/ui/main/R$layout;->layout_seek_bar:I

    invoke-static {p1, v0, p0}, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 36
    sget v0, Lcom/huawei/ui/main/R$id;->nps_seek_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/ui/main/stories/nps/component/NpsHwSeekBar;

    .line 38
    new-instance v0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$1;-><init>(Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;)V

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/nps/component/NpsHwSeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 56
    return-void
.end method


# virtual methods
.method public setNpsSeekBarListener(Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$NpsSeekBarImpl;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;->impl:Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$NpsSeekBarImpl;

    .line 60
    return-void
.end method

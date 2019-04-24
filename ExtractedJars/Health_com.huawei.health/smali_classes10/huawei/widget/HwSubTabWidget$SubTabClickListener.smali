.class Lhuawei/widget/HwSubTabWidget$SubTabClickListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/HwSubTabWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SubTabClickListener"
.end annotation


# instance fields
.field final synthetic this$0:Lhuawei/widget/HwSubTabWidget;


# direct methods
.method private constructor <init>(Lhuawei/widget/HwSubTabWidget;)V
    .locals 0

    .line 487
    iput-object p1, p0, Lhuawei/widget/HwSubTabWidget$SubTabClickListener;->this$0:Lhuawei/widget/HwSubTabWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lhuawei/widget/HwSubTabWidget;Lhuawei/widget/HwSubTabWidget$1;)V
    .locals 0

    .line 487
    invoke-direct {p0, p1}, Lhuawei/widget/HwSubTabWidget$SubTabClickListener;-><init>(Lhuawei/widget/HwSubTabWidget;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 490
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTabClickListener;->this$0:Lhuawei/widget/HwSubTabWidget;

    invoke-static {v0}, Lhuawei/widget/HwSubTabWidget;->access$600(Lhuawei/widget/HwSubTabWidget;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 491
    return-void

    .line 493
    :cond_0
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTabClickListener;->this$0:Lhuawei/widget/HwSubTabWidget;

    iget-object v0, v0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildCount()I

    move-result v1

    .line 494
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    .line 495
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTabClickListener;->this$0:Lhuawei/widget/HwSubTabWidget;

    iget-object v0, v0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0, v2}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 496
    if-ne v3, p1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/view/View;->setSelected(Z)V

    .line 497
    if-ne v3, p1, :cond_2

    .line 498
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTabClickListener;->this$0:Lhuawei/widget/HwSubTabWidget;

    invoke-static {v0}, Lhuawei/widget/HwSubTabWidget;->access$700(Lhuawei/widget/HwSubTabWidget;)Lhuawei/widget/HwSubTabViewContainer;

    move-result-object v0

    invoke-virtual {v0, v2}, Lhuawei/widget/HwSubTabViewContainer;->animateToTab(I)V

    .line 494
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 501
    :cond_3
    instance-of v0, p1, Lhuawei/widget/HwSubTabWidget$SubTabView;

    if-eqz v0, :cond_4

    .line 502
    move-object v0, p1

    check-cast v0, Lhuawei/widget/HwSubTabWidget$SubTabView;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->getSubTab()Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->select()V

    .line 504
    :cond_4
    return-void
.end method

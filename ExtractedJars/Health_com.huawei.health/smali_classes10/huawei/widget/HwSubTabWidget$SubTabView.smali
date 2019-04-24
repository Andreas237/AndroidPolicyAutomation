.class Lhuawei/widget/HwSubTabWidget$SubTabView;
.super Landroid/widget/TextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/HwSubTabWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SubTabView"
.end annotation


# instance fields
.field private mSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

.field final synthetic this$0:Lhuawei/widget/HwSubTabWidget;


# direct methods
.method public constructor <init>(Lhuawei/widget/HwSubTabWidget;Landroid/content/Context;Lhuawei/widget/HwSubTabWidget$SubTab;)V
    .locals 4

    .line 435
    iput-object p1, p0, Lhuawei/widget/HwSubTabWidget$SubTabView;->this$0:Lhuawei/widget/HwSubTabWidget;

    .line 436
    sget v0, Lhuawei/widget/hwsubtab/R$attr;->hwSubTabViewStyle:I

    const/4 v1, 0x0

    invoke-direct {p0, p2, v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 437
    iput-object p3, p0, Lhuawei/widget/HwSubTabWidget$SubTabView;->mSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 438
    const/16 v0, 0x11

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setGravity(I)V

    .line 439
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setMaxLines(I)V

    .line 441
    invoke-static {p1}, Lhuawei/widget/HwSubTabWidget;->access$000(Lhuawei/widget/HwSubTabWidget;)I

    move-result v0

    invoke-static {p1}, Lhuawei/widget/HwSubTabWidget;->access$000(Lhuawei/widget/HwSubTabWidget;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v2, v1, v3}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setPadding(IIII)V

    .line 442
    invoke-static {p1}, Lhuawei/widget/HwSubTabWidget;->access$100(Lhuawei/widget/HwSubTabWidget;)I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setTextSize(IF)V

    .line 443
    invoke-static {p1}, Lhuawei/widget/HwSubTabWidget;->access$200(Lhuawei/widget/HwSubTabWidget;)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 444
    invoke-static {p1}, Lhuawei/widget/HwSubTabWidget;->access$300(Lhuawei/widget/HwSubTabWidget;)I

    move-result v0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setBackgroundResource(I)V

    .line 445
    invoke-static {p1}, Lhuawei/widget/HwSubTabWidget;->access$400(Lhuawei/widget/HwSubTabWidget;)I

    move-result v0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setMinWidth(I)V

    .line 446
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->update()V

    .line 447
    return-void
.end method


# virtual methods
.method public getSubTab()Lhuawei/widget/HwSubTabWidget$SubTab;
    .locals 1

    .line 450
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTabView;->mSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    return-object v0
.end method

.method public update()V
    .locals 4

    .line 454
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTabView;->mSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    .line 455
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 456
    :goto_0
    if-eqz v3, :cond_1

    .line 457
    invoke-virtual {p0, v2}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setText(Ljava/lang/CharSequence;)V

    .line 458
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setVisibility(I)V

    goto :goto_1

    .line 460
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setVisibility(I)V

    .line 461
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setText(Ljava/lang/CharSequence;)V

    .line 463
    :goto_1
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTabView;->mSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->getSubTabId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 464
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTabView;->mSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->getSubTabId()I

    move-result v0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setId(I)V

    .line 466
    :cond_2
    return-void
.end method

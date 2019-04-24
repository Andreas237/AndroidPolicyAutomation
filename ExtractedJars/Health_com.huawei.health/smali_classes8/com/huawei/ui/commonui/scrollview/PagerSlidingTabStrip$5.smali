.class Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic e:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;


# direct methods
.method constructor <init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;Landroid/content/Context;)V
    .locals 0

    .line 966
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$5;->e:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    iput-object p2, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$5;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 969
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$5;->b:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ena;->c(Landroid/content/Context;I)V

    .line 970
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$5;->e:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->p(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V

    .line 971
    return-void
.end method

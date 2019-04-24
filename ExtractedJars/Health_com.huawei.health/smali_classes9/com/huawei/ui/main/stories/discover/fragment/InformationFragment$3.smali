.class Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnScrollChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$3;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollChange(Landroid/view/View;IIII)V
    .locals 5

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$3;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContentHeight()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$3;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebView;->getScale()F

    move-result v1

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$3;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebView;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$3;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/webkit/WebView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/webkit/WebView;->getScrollY()I

    move-result v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 254
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in bottom webview"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 257
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$3;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->d(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ha:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 260
    :cond_0
    return-void
.end method

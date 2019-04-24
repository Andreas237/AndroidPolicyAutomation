.class Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$1;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 220
    instance-of v0, p1, Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$1;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->isTouchH5ScrollView()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 222
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isTouchH5ScrollView is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$1;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/operation/view/CustomWebView;->isTouchH5ScrollView()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    move-object v0, p1

    check-cast v0, Landroid/webkit/WebView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    .line 225
    :cond_0
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isTouchH5ScrollView is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$1;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/operation/view/CustomWebView;->isTouchH5ScrollView()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    move-object v0, p1

    check-cast v0, Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->requestDisallowInterceptTouchEvent(Z)V

    .line 228
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 230
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

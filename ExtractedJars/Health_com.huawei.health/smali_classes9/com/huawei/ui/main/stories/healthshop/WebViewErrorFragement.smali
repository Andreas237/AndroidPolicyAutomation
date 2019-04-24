.class public Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private e:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 30
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 31
    const-string v0, "Opera_WebViewErrorFragement"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WebViewMiniShopFragment()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;)Landroid/content/Context;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 42
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 43
    const-string v0, "Opera_WebViewErrorFragement"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 50
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_web_view_error:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 51
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;->b:Landroid/content/Context;

    .line 52
    sget v0, Lcom/huawei/ui/main/R$id;->btn_go_setting:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;->e:Landroid/view/View;

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;->e:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement$5;-><init>(Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    return-object v2
.end method

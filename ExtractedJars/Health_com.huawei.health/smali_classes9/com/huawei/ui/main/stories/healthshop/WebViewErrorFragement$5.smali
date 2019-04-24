.class Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement$5;->a:Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 56
    const-string v0, "Opera_WebViewErrorFragement"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "btnGoSettging click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement$5;->a:Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;->e(Lcom/huawei/ui/main/stories/healthshop/WebViewErrorFragement;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.google.android.webview"

    invoke-static {v0, v1}, Lo/dbf;->o(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    goto :goto_0

    .line 59
    :catch_0
    move-exception v4

    .line 60
    const-string v0, "Opera_WebViewErrorFragement"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "liyao test"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    :goto_0
    return-void
.end method

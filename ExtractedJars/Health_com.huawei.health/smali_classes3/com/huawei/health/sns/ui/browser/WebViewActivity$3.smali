.class Lcom/huawei/health/sns/ui/browser/WebViewActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/browser/WebViewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V
    .locals 0

    .line 479
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$3;->d:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 485
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$3;->d:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->finish()V

    .line 486
    return-void
.end method

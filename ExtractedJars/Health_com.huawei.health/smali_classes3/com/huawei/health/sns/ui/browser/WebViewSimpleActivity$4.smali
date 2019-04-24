.class Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$4;->b:Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$4;->b:Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->finish()V

    .line 188
    return-void
.end method

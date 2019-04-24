.class Lcom/huawei/health/sns/ui/padsearch/SearchActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/padsearch/SearchActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/padsearch/SearchActivity;)V
    .locals 0

    .line 302
    iput-object p1, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity$3;->c:Lcom/huawei/health/sns/ui/padsearch/SearchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 306
    if-eqz p2, :cond_0

    .line 308
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity$3;->c:Lcom/huawei/health/sns/ui/padsearch/SearchActivity;

    invoke-virtual {p1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->e(Lcom/huawei/health/sns/ui/padsearch/SearchActivity;Landroid/view/View;)V

    .line 310
    :cond_0
    return-void
.end method

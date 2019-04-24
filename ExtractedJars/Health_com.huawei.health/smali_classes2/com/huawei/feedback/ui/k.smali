.class Lcom/huawei/feedback/ui/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/bean/f;

.field final synthetic b:Landroid/widget/LinearLayout;

.field final synthetic c:Lcom/huawei/feedback/ui/j;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/j;Lcom/huawei/feedback/bean/f;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/huawei/feedback/ui/k;->c:Lcom/huawei/feedback/ui/j;

    iput-object p2, p0, Lcom/huawei/feedback/ui/k;->a:Lcom/huawei/feedback/bean/f;

    iput-object p3, p0, Lcom/huawei/feedback/ui/k;->b:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 177
    iget-object v0, p0, Lcom/huawei/feedback/ui/k;->c:Lcom/huawei/feedback/ui/j;

    iget-object v1, p0, Lcom/huawei/feedback/ui/k;->a:Lcom/huawei/feedback/bean/f;

    iget-object v2, p0, Lcom/huawei/feedback/ui/k;->b:Landroid/widget/LinearLayout;

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lcom/huawei/feedback/ui/j;->a(Lcom/huawei/feedback/ui/j;ILcom/huawei/feedback/bean/f;Landroid/widget/LinearLayout;)V

    .line 178
    return-void
.end method

.class Lcom/huawei/feedback/ui/an$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/an;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/an;

.field private b:Lcom/huawei/feedback/ui/an$b;


# direct methods
.method public constructor <init>(Lcom/huawei/feedback/ui/an;Lcom/huawei/feedback/ui/an$b;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/feedback/ui/an$a;->a:Lcom/huawei/feedback/ui/an;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object p2, p0, Lcom/huawei/feedback/ui/an$a;->b:Lcom/huawei/feedback/ui/an$b;

    .line 154
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 158
    iget-object v0, p0, Lcom/huawei/feedback/ui/an$a;->b:Lcom/huawei/feedback/ui/an$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/an$b;->a:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 159
    iget-object v0, p0, Lcom/huawei/feedback/ui/an$a;->a:Lcom/huawei/feedback/ui/an;

    invoke-static {v0}, Lcom/huawei/feedback/ui/an;->a(Lcom/huawei/feedback/ui/an;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 160
    iget-object v0, p0, Lcom/huawei/feedback/ui/an$a;->a:Lcom/huawei/feedback/ui/an;

    invoke-static {v0}, Lcom/huawei/feedback/ui/an;->a(Lcom/huawei/feedback/ui/an;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 161
    iget-object v0, p0, Lcom/huawei/feedback/ui/an$a;->a:Lcom/huawei/feedback/ui/an;

    invoke-static {v0}, Lcom/huawei/feedback/ui/an;->b(Lcom/huawei/feedback/ui/an;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 163
    :cond_0
    return-void
.end method

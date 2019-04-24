.class Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)V
    .locals 0

    .line 1162
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$7;->e:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 1166
    move v2, p3

    .line 1168
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$7;->e:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->a(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1170
    if-nez v2, :cond_0

    .line 1172
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$7;->e:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->c(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)V

    .line 1173
    return-void

    .line 1175
    :cond_0
    add-int/lit8 v2, p3, -0x1

    .line 1177
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$7;->e:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$7;->e:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->f(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p2, v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->c(Landroid/os/Handler;Landroid/view/View;I)V

    .line 1178
    return-void
.end method

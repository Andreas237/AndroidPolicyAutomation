.class Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V
    .locals 0

    .line 331
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$3;->b:Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 335
    move v1, p3

    .line 336
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;

    .line 337
    if-eqz v2, :cond_0

    .line 340
    iget-object v3, v2, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->d:Landroid/widget/CheckBox;

    .line 341
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$3;->b:Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;

    invoke-static {v0, v3, v1}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->a(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;Landroid/widget/CheckBox;I)V

    .line 343
    :cond_0
    return-void
.end method

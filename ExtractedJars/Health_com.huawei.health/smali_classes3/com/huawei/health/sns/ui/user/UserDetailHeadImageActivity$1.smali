.class Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$1;->d:Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$1;->d:Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->finish()V

    .line 178
    return-void
.end method

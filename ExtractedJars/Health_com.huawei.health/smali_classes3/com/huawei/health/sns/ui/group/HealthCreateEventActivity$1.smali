.class Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$1;->a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$1;->a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/widget/EditText;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setCursorVisible(Z)V

    .line 293
    return-void
.end method

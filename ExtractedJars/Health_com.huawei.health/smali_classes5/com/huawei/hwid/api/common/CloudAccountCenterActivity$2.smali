.class Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$2;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$2;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->finish()V

    .line 149
    return-void
.end method

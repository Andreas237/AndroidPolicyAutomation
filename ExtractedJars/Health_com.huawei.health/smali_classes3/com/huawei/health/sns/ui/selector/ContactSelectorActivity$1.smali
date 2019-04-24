.class Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V
    .locals 0

    .line 435
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$1;->a:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 439
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$1;->a:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->finish()V

    .line 440
    return-void
.end method

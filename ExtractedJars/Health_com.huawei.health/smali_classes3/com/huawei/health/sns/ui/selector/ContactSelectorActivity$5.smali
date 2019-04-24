.class Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bni$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V
    .locals 0

    .line 639
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$5;->b:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 2

    .line 643
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$5;->b:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->n()V

    .line 644
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$5;->b:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->j:Lo/bni;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bni;->setVisibility(I)V

    .line 645
    return-void
.end method

.class Lcom/huawei/health/suggestion/ui/BaseStateActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/BaseStateActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/BaseStateActivity;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity$1;->a:Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity$1;->a:Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->finish()V

    .line 59
    return-void
.end method

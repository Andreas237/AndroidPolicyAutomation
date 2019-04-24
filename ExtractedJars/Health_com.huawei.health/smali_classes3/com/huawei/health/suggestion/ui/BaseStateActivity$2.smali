.class Lcom/huawei/health/suggestion/ui/BaseStateActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/BaseStateActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/BaseStateActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/BaseStateActivity;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity$2;->b:Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity$2;->b:Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 110
    return-void
.end method

.class Lcom/huawei/health/suggestion/ui/BaseStateActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/BaseStateActivity;->e()V
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

    .line 120
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity$3;->a:Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity$3;->a:Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->b(Lcom/huawei/health/suggestion/ui/BaseStateActivity;)V

    .line 124
    return-void
.end method

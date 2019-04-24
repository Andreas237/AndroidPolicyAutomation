.class Lcom/huawei/feedback/ui/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcom/huawei/feedback/ui/FeedbackDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;Landroid/content/Intent;)V
    .locals 0

    .line 538
    iput-object p1, p0, Lcom/huawei/feedback/ui/h;->b:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    iput-object p2, p0, Lcom/huawei/feedback/ui/h;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 543
    iget-object v0, p0, Lcom/huawei/feedback/ui/h;->b:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    iget-object v1, p0, Lcom/huawei/feedback/ui/h;->a:Landroid/content/Intent;

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(Lcom/huawei/feedback/ui/FeedbackDetailActivity;Landroid/content/Intent;)V

    .line 544
    return-void
.end method

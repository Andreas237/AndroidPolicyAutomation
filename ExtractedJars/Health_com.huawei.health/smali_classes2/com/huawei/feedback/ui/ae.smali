.class Lcom/huawei/feedback/ui/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackPicShowActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackPicShowActivity;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/feedback/ui/ae;->a:Lcom/huawei/feedback/ui/FeedbackPicShowActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/feedback/ui/ae;->a:Lcom/huawei/feedback/ui/FeedbackPicShowActivity;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->finish()V

    .line 74
    return-void
.end method

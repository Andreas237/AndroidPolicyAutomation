.class Lcom/huawei/feedback/ui/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/feedback/ui/CustomActionBar$a;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lcom/huawei/feedback/ui/c;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/huawei/feedback/ui/c;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->onBackPressed()V

    .line 217
    return-void
.end method

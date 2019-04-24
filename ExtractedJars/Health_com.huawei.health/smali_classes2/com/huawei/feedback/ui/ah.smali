.class Lcom/huawei/feedback/ui/ah;
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
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V
    .locals 0

    .line 308
    iput-object p1, p0, Lcom/huawei/feedback/ui/ah;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 312
    iget-object v0, p0, Lcom/huawei/feedback/ui/ah;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->onBackPressed()V

    .line 313
    return-void
.end method

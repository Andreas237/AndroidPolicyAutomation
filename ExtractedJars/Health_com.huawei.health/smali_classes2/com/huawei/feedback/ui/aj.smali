.class Lcom/huawei/feedback/ui/aj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


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

    .line 408
    iput-object p1, p0, Lcom/huawei/feedback/ui/aj;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 411
    iget-object v0, p0, Lcom/huawei/feedback/ui/aj;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0, p3}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->a(Lcom/huawei/feedback/ui/FeedbackRecordActivity;I)V

    .line 412
    return-void
.end method

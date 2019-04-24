.class Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V
    .locals 0

    .line 791
    iput-object p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$c;->e:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$2;)V
    .locals 0

    .line 791
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$c;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 796
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$c;->e:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->i(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)Lo/bfr;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/bfr;->a(I)Lo/bfr$c;

    move-result-object v1

    .line 797
    if-eqz v1, :cond_0

    .line 799
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$c;->e:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-static {v0, p3, v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->d(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;ILo/bfr$c;)V

    .line 801
    :cond_0
    return-void
.end method

.class Lcom/huawei/feedback/ui/aq;
.super Landroid/view/OrientationEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/feedback/ui/ap;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/ap;Landroid/content/Context;I)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/huawei/feedback/ui/aq;->b:Lcom/huawei/feedback/ui/ap;

    iput p3, p0, Lcom/huawei/feedback/ui/aq;->a:I

    invoke-direct {p0, p2}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 2

    .line 199
    if-ltz p1, :cond_0

    const/16 v0, 0x168

    if-gt p1, v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/huawei/feedback/ui/aq;->b:Lcom/huawei/feedback/ui/ap;

    iget v1, p0, Lcom/huawei/feedback/ui/aq;->a:I

    invoke-static {v0, p1, v1}, Lcom/huawei/feedback/ui/ap;->a(Lcom/huawei/feedback/ui/ap;II)V

    .line 203
    :cond_0
    return-void
.end method

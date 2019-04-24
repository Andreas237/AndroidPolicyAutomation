.class Lcom/huawei/feedback/ui/au;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/at;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/at;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/feedback/ui/au;->a:Lcom/huawei/feedback/ui/at;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/feedback/ui/au;->a:Lcom/huawei/feedback/ui/at;

    invoke-static {v0}, Lcom/huawei/feedback/ui/at;->a(Lcom/huawei/feedback/ui/at;)V

    .line 30
    return-void
.end method

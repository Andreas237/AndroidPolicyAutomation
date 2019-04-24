.class Lcom/huawei/feedback/ui/a;
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
.field final synthetic a:Lcom/huawei/feedback/ui/CustomActionBar;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/CustomActionBar;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/feedback/ui/a;->a:Lcom/huawei/feedback/ui/CustomActionBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/feedback/ui/a;->a:Lcom/huawei/feedback/ui/CustomActionBar;

    invoke-static {v0}, Lcom/huawei/feedback/ui/CustomActionBar;->a(Lcom/huawei/feedback/ui/CustomActionBar;)Lcom/huawei/feedback/ui/CustomActionBar$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/huawei/feedback/ui/a;->a:Lcom/huawei/feedback/ui/CustomActionBar;

    invoke-static {v0}, Lcom/huawei/feedback/ui/CustomActionBar;->a(Lcom/huawei/feedback/ui/CustomActionBar;)Lcom/huawei/feedback/ui/CustomActionBar$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/feedback/ui/CustomActionBar$a;->a()V

    .line 69
    :cond_0
    return-void
.end method

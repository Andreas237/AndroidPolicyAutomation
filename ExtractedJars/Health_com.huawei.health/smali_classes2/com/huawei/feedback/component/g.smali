.class Lcom/huawei/feedback/component/g;
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
.field final synthetic a:Lcom/huawei/feedback/component/ProgressService;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/component/ProgressService;)V
    .locals 0

    .line 1362
    iput-object p1, p0, Lcom/huawei/feedback/component/g;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1367
    iget-object v0, p0, Lcom/huawei/feedback/component/g;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->j(Lcom/huawei/feedback/component/ProgressService;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 1369
    return-void
.end method

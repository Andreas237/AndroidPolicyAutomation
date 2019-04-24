.class Lcom/huawei/hms/b/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/b/a;


# direct methods
.method constructor <init>(Lcom/huawei/hms/b/a;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/huawei/hms/b/e;->a:Lcom/huawei/hms/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 153
    const/4 v0, 0x4

    if-ne v0, p2, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 154
    iget-object v0, p0, Lcom/huawei/hms/b/e;->a:Lcom/huawei/hms/b/a;

    invoke-virtual {v0}, Lcom/huawei/hms/b/a;->a()V

    .line 155
    const/4 v0, 0x1

    return v0

    .line 157
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.class Lo/ale$56$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale$56;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ale$56;


# direct methods
.method constructor <init>(Lo/ale$56;)V
    .locals 0

    .line 3911
    iput-object p1, p0, Lo/ale$56$3;->c:Lo/ale$56;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 3914
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iget-object v1, p0, Lo/ale$56$3;->c:Lo/ale$56;

    iget v1, v1, Lo/ale$56;->d:I

    invoke-virtual {v0, v1}, Lo/dde;->c(I)V

    .line 3915
    return-void
.end method

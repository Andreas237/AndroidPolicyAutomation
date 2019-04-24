.class Lo/fcz$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fcz;->c(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fcz;


# direct methods
.method constructor <init>(Lo/fcz;)V
    .locals 0

    .line 672
    iput-object p1, p0, Lo/fcz$3;->c:Lo/fcz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 675
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 676
    iget-object v0, p0, Lo/fcz$3;->c:Lo/fcz;

    invoke-static {v0}, Lo/fcz;->d(Lo/fcz;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 678
    :cond_0
    return-void
.end method

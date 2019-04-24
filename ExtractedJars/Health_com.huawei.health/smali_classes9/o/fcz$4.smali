.class Lo/fcz$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fcz;->l()V
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

    .line 361
    iput-object p1, p0, Lo/fcz$4;->c:Lo/fcz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 1

    .line 364
    iget-object v0, p0, Lo/fcz$4;->c:Lo/fcz;

    invoke-static {v0}, Lo/fcz;->d(Lo/fcz;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lo/fej;->a(ILjava/lang/Object;Landroid/os/Handler;)V

    .line 365
    return-void
.end method

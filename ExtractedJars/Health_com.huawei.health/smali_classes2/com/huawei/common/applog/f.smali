.class final Lcom/huawei/common/applog/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Landroid/os/Handler;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/common/applog/f;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/common/applog/f;->b:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 33
    iget-object v0, p0, Lcom/huawei/common/applog/f;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/common/applog/f;->b:Landroid/os/Handler;

    invoke-static {v0, v1}, Lcom/huawei/common/applog/a/a;->a(Landroid/content/Context;Landroid/os/Handler;)V

    .line 35
    return-void
.end method

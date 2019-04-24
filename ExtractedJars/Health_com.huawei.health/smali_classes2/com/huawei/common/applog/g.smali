.class final Lcom/huawei/common/applog/g;
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

.field final synthetic b:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Z)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/common/applog/g;->a:Landroid/content/Context;

    iput-boolean p2, p0, Lcom/huawei/common/applog/g;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 53
    new-instance v3, Lcom/huawei/common/applog/a/b;

    invoke-direct {v3}, Lcom/huawei/common/applog/a/b;-><init>()V

    .line 54
    iget-object v0, p0, Lcom/huawei/common/applog/g;->a:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/huawei/common/applog/g;->b:Z

    const/4 v2, 0x1

    invoke-virtual {v3, v0, v1, v2}, Lcom/huawei/common/applog/a/b;->a(Landroid/content/Context;ZZ)V

    .line 55
    return-void
.end method

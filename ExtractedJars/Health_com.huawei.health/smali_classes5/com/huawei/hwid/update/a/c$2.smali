.class final Lcom/huawei/hwid/update/a/c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/update/a/a/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/update/a/c;->b(Lcom/huawei/hwid/update/a/a/b;)Lcom/huawei/hwid/update/a/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/update/a/a/b;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/update/a/a/b;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/hwid/update/a/c$2;->a:Lcom/huawei/hwid/update/a/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IIILjava/io/File;)V
    .locals 7

    .line 100
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/hwid/update/a/c$2$2;

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/huawei/hwid/update/a/c$2$2;-><init>(Lcom/huawei/hwid/update/a/c$2;IIILjava/io/File;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 108
    return-void
.end method

.method public a(ILcom/huawei/hwid/update/a/a/c;)V
    .locals 2

    .line 88
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/hwid/update/a/c$2$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hwid/update/a/c$2$1;-><init>(Lcom/huawei/hwid/update/a/c$2;ILcom/huawei/hwid/update/a/a/c;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 96
    return-void
.end method

.class Lcom/huawei/health/MainActivity$i$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity$i;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic d:Lcom/huawei/health/MainActivity$i;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity$i;Landroid/content/Context;)V
    .locals 0

    .line 3082
    iput-object p1, p0, Lcom/huawei/health/MainActivity$i$1;->d:Lcom/huawei/health/MainActivity$i;

    iput-object p2, p0, Lcom/huawei/health/MainActivity$i$1;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 3085
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/health/MainActivity$i$1$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/MainActivity$i$1$5;-><init>(Lcom/huawei/health/MainActivity$i$1;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3094
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 3095
    return-void
.end method

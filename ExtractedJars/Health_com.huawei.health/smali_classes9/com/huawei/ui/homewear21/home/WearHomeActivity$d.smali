.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private final d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/homewear21/home/WearHomeActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 1

    .line 5441
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5442
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$d;->d:Ljava/lang/ref/WeakReference;

    .line 5443
    return-void
.end method


# virtual methods
.method public c()Lcom/huawei/ui/homewear21/home/WearHomeActivity;
    .locals 2

    .line 5451
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$d;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    .line 5452
    return-object v1
.end method

.method public run()V
    .locals 0

    .line 5448
    return-void
.end method

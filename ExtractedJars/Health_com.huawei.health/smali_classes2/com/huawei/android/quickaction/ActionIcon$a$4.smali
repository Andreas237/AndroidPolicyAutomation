.class Lcom/huawei/android/quickaction/ActionIcon$a$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/android/quickaction/ActionIcon$a;-><init>(Lcom/huawei/android/quickaction/ActionIcon;Landroid/content/Context;Landroid/os/Handler;Lcom/huawei/android/quickaction/ActionIcon$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic d:Lcom/huawei/android/quickaction/ActionIcon$e;

.field final synthetic e:Lcom/huawei/android/quickaction/ActionIcon$a;


# direct methods
.method constructor <init>(Lcom/huawei/android/quickaction/ActionIcon$a;Lcom/huawei/android/quickaction/ActionIcon$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/android/quickaction/ActionIcon$a$4;->e:Lcom/huawei/android/quickaction/ActionIcon$a;

    iput-object p2, p0, Lcom/huawei/android/quickaction/ActionIcon$a$4;->d:Lcom/huawei/android/quickaction/ActionIcon$e;

    .line 463
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 466
    iget-object v0, p0, Lcom/huawei/android/quickaction/ActionIcon$a$4;->d:Lcom/huawei/android/quickaction/ActionIcon$e;

    iget-object v1, p0, Lcom/huawei/android/quickaction/ActionIcon$a$4;->e:Lcom/huawei/android/quickaction/ActionIcon$a;

    iget-object v1, v1, Lcom/huawei/android/quickaction/ActionIcon$a;->d:Landroid/os/Message;

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/drawable/Drawable;

    invoke-interface {v0, v1}, Lcom/huawei/android/quickaction/ActionIcon$e;->e(Landroid/graphics/drawable/Drawable;)V

    .line 467
    return-void
.end method

.class Lcom/huawei/bone/social/manager/util/SocialReceiver$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/wo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/social/manager/util/SocialReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/bone/social/manager/util/SocialReceiver;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V
    .locals 1

    .line 261
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 262
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$e;->e:Ljava/lang/ref/WeakReference;

    .line 263
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 267
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$e;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/bone/social/manager/util/SocialReceiver;

    .line 268
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 269
    invoke-static {v1}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->e(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V

    .line 271
    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    .line 281
    return-void
.end method

.method public d(ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 286
    return-void
.end method

.method public e()V
    .locals 0

    .line 276
    return-void
.end method

.class Lcom/huawei/bone/social/manager/util/SocialReceiver$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/manager/util/SocialReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic d:Lcom/huawei/bone/social/manager/util/SocialReceiver;

.field final synthetic e:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/manager/util/SocialReceiver;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$1;->d:Lcom/huawei/bone/social/manager/util/SocialReceiver;

    iput-object p2, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$1;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$1;->e:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 64
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$1;->d:Lcom/huawei/bone/social/manager/util/SocialReceiver;

    iget-object v1, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$1;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$1;->e:Landroid/content/Intent;

    invoke-static {v0, v1, v2}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->c(Lcom/huawei/bone/social/manager/util/SocialReceiver;Landroid/content/Context;Landroid/content/Intent;)V

    .line 65
    return-void
.end method

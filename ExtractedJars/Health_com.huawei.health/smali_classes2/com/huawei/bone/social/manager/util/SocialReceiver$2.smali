.class Lcom/huawei/bone/social/manager/util/SocialReceiver$2;
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
.field final synthetic a:Lcom/huawei/bone/social/manager/util/SocialReceiver;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$2;->a:Lcom/huawei/bone/social/manager/util/SocialReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$2;->a:Lcom/huawei/bone/social/manager/util/SocialReceiver;

    invoke-static {v0}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->a(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V

    .line 72
    return-void
.end method

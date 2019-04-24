.class Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$14;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;Landroid/os/Handler;)V
    .locals 0

    .line 489
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$14;->c:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .locals 1

    .line 494
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 495
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$14;->c:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->D()V

    .line 496
    return-void
.end method

.method public onChange(ZLandroid/net/Uri;)V
    .locals 1

    .line 501
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$14;->c:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->D()V

    .line 502
    return-void
.end method

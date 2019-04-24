.class Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/arp$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ab()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 0

    .line 1034
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$15;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;I)V
    .locals 1

    .line 1038
    if-eqz p1, :cond_0

    .line 1040
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$15;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-static {v0, p1, p2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->e(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;Landroid/graphics/Bitmap;I)V

    .line 1042
    :cond_0
    return-void
.end method

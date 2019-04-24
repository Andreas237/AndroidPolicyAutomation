.class Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a(Landroid/graphics/Bitmap;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;I)V
    .locals 0

    .line 1080
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$16;->d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iput p2, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$16;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1084
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1085
    iget v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$16;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1086
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$16;->d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->b(Ljava/util/ArrayList;)V

    .line 1087
    return-void
.end method
